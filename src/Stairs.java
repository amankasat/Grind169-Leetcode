public class Stairs {
    int ways;

    public int climbStairs(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;
        return climbStairs(n - 1) + climbStairs(n - 2);
    }

//    public int climbStairs(int n) {
//        int i = 2; int twoCounter = 1;
//        while ((n - i) > 0) {
//            int i1 = factorial(n) / (factorial(twoCounter) * factorial(n - twoCounter * 2));
//            ways += i1;
//            i += 2;
//            twoCounter++;
//        }
//        return ways;
//    }


    public static void main(String[] args) {
        Stairs stairs = new Stairs();
        System.out.println(stairs.climbStairs(6));
    }
}
