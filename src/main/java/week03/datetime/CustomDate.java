package week03.datetime;

public class CustomDate {
    private static final String[] Months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

    private static final int[] Days_In_Month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    private static final int[] Days_Until_Month = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};

    private int month;
    private int day;
    private int year;

    public CustomDate(int month, int day, int year) {
        validate(month, day, year);
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public static boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }

    private static int daysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return Days_In_Month[month - 1];                       // fix 1
    }

    private static void validate(int month, int day, int year) {
        if (year < 1) {                                        // fix 0: removed "|| year > 12"
            throw new IllegalArgumentException("Invalid year: " + year);
        }
        if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Invalid month: " + month);
        }
        if (day < 1 || day > daysInMonth(month, year)) {
            throw new IllegalArgumentException("Invalid day: " + day);
        }
    }

    public int getMonth() { return month; }
    public void setMonth(int month) {
        validate(month, this.day, this.year);                  // fix 2: validate the NEW month
        this.month = month;
    }

    public int getDay() { return day; }
    public void setDay(int day) {
        validate(this.month, day, this.year);                  // fix 3: correct argument order
        this.day = day;
    }

    public int getYear() { return year; }
    public void setYear(int year) {
        validate(this.month, this.day, year);                  // fix 4: month, day, NEW year
        this.year = year;
    }

    public void displayDate() {
        System.out.println(month + "/" + day + "/" + year);
    }

    public void displayFormatted() {
        System.out.println(day + " " + Months[month - 1] + " " + year);
    }

    private long toDayNumber() {
        long y = year - 1;
        long leapDays = y / 4 - y / 100 + y / 400;
        long days = y * 365 + leapDays;                        // fix 5
        days += Days_Until_Month[month - 1];
        if (month > 2 && isLeapYear(year)) {
            days++;
        }
        return days + day;
    }

    public long difference(CustomDate date) {
        return this.toDayNumber() - date.toDayNumber();
    }

    public static int compare(CustomDate date1, CustomDate date2) {
        long d1 = date1.toDayNumber();
        long d2 = date2.toDayNumber();
        if (d1 < d2) return 1;
        if (d1 > d2) return -1;
        return 0;
    }
}