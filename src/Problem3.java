public class Problem3 {
    static int cap = 2000;
    private static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num > 2) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void solution1() {
        int sum = 0;
        for (int i = 2; i <= cap; i++) {
            if (isPrime(i)) {
                //System.out.println(i);
                sum += i;
            }
        }

        System.out.println(sum);
    }
    public static void solution2() {
        int i = 2;
        int sum = 0;
        do {
            if (isPrime(i)) {
                //System.out.println(i);
                sum += i;
            }
            i++;
        } while (i < cap);
        System.out.println(sum);
    }
    public static void solution3() {
        int i = 2;
        int sum = 0;
        while (i < cap) {
            if (isPrime(i)) {
                //System.out.println(i);
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        System.out.println("For loop:");
        solution1();
        System.out.println("Do While loop:");
        solution2();
        System.out.println("While loop:");
        solution3();
    }
}
