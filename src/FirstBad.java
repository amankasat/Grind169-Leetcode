public class FirstBad {
    public static int firstBadVersion(int n) {
        int left = 0, right = n-1;
        int mid = 0;
        while (left <= right) {
            mid = left+(right-left)/2;
            boolean itIsBad = isBadVersion(mid+1);
            if (itIsBad && ( (mid == 0) || (!isBadVersion(mid)) ) )
                return mid+1;
            else if (itIsBad)
                right = mid;
            else
                left = mid+1;
        }
        return -1;
    }
    static boolean isBadVersion(int version) {
        return version == 2;
    }

    public static void main(String[] args) {
        System.out.println(firstBadVersion(2));
    }
}
