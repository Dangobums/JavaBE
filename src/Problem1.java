import java.util.Scanner;

public class Problem1 {
    enum Month{
        JANUARY(31),
        FEBRUARY(28),
        MARCH(31),
        APRIL(30),
        MAY(31),
        JUNE(30),
        JULY(31),
        AUGUST(31),
        SEPTEMBER(30),
        OCTOBER(31),
        NOVEMBER(30),
        DECEMBER(31),
        ;
        private int days;

        public int getDays() {
            return this.days;
        }

        public void setDays(int days) {
            this.days = days;
        }

        private Month(int days) {
            this.days = days;
        }
    }
    public static void usingEnum(int month) {
        System.out.println("With Enum and Switch:");
        switch (month) {
            case 1 -> System.out.println(Month.JANUARY.getDays());
            case 2 -> System.out.println(Month.FEBRUARY.getDays());
            case 3 -> System.out.println(Month.MARCH.getDays());
            case 4 -> System.out.println(Month.APRIL.getDays());
            case 5 -> System.out.println(Month.MAY.getDays());
            case 6 -> System.out.println(Month.JUNE.getDays());
            case 7 -> System.out.println(Month.JULY.getDays());
            case 8 -> System.out.println(Month.AUGUST.getDays());
            case 9 -> System.out.println(Month.SEPTEMBER.getDays());
            case 10 -> System.out.println(Month.OCTOBER.getDays());
            case 11 -> System.out.println(Month.NOVEMBER.getDays());
            case 12 -> System.out.println(Month.DECEMBER.getDays());
        }
    }
    public static void usingArray(int month) {
        System.out.println("With Array:");
        int[] dayOfMonths = {31,28, 31,30,31,30,31,31,30,31,30,31};
        System.out.println(dayOfMonths[month]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month");
        int month = sc.nextInt();
        if (month >= 1 && month <= 12) {
            usingEnum(month);
            usingArray(month - 1);
        }
    }


}
