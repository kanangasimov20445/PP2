package week03.datetime;

public class CustomDateTest {
    public static void main(String[] args) {
        CustomDate d1 = new CustomDate(1, 12, 2020);
        System.out.print("displayDate: ");
        d1.displayDate();
        System.out.print("displayFormatted: ");
        d1.displayFormatted();

        System.out.println("\nLeap years");
        System.out.println("2020 leap? " + CustomDate.isLeapYear(2020));  // true
        System.out.println("1900 leap? " + CustomDate.isLeapYear(1900));  // false
        System.out.println("2000 leap? " + CustomDate.isLeapYear(2000));  // true
        tryCreate(2, 29, 2020);   // valid
        tryCreate(2, 29, 2021);   // invalid
        tryCreate(2, 29, 1900);   // invalid
        tryCreate(2, 29, 2000);   // valid

        System.out.println("\nInvalid inputs");
        tryCreate(13, 1, 2020);
        tryCreate(4, 31, 2020);
        tryCreate(0, 10, 2020);
        tryCreate(5, 0, 2020);
        tryCreate(5, 5, 0);


        System.out.println("\nSetters / getters");
        CustomDate d2 = new CustomDate(3, 1, 2020);
        d2.setDay(15);
        d2.setYear(2021);
        System.out.println("Month= " + d2.getMonth() + " Day= " + d2.getDay() + " Year= " + d2.getYear());
        try {
            d2.setDay(32);
        } catch (IllegalArgumentException e) {
            System.out.println("setDay(32) rejected: " + e.getMessage());
        }

        System.out.println("\ndifference");
        CustomDate a = new CustomDate(1, 1, 2020);
        CustomDate b = new CustomDate(3, 1, 2020);
        CustomDate c = new CustomDate(12, 31, 2019);
        System.out.println("Mar 1 2020 - Jan 1 2020 = " + b.difference(a));   // 60 (leap year)
        System.out.println("Jan 1 2020 - Mar 1 2020 = " + a.difference(b));   // -60
        System.out.println("Jan 1 2020 - Dec 31 2019 = " + a.difference(c));  // 1
        System.out.println("Mar 1 2021 - Mar 1 2020 = "
                + new CustomDate(3, 1, 2021).difference(b));                 // 365

        System.out.println("\ncompare");
        System.out.println("compare(Jan 1, Mar 1) = " + CustomDate.compare(a, b));  // 1  (date1 earlier)
        System.out.println("compare(Mar 1, Jan 1) = " + CustomDate.compare(b, a));  // -1 (date2 earlier)
        System.out.println("compare(Jan 1, Jan 1) = "
                + CustomDate.compare(a, new CustomDate(1, 1, 2020)));              // 0
    }

    private static void tryCreate(int m, int d, int y) {
        try {
            CustomDate date = new CustomDate(m, d, y);
            System.out.print("Accepted " + m + "/" + d + "/" + y + " -> ");
            date.displayFormatted();
        } catch (IllegalArgumentException e) {
            System.out.println("Rejected " + m + "/" + d + "/" + y + " -> " + e.getMessage());
        }
    }
}