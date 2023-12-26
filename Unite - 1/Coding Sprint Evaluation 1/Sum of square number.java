public static void solve(long k) {
    boolean found = false;
    long a = 0, b = (long) Math.sqrt(k) + 1;
    
    while (a <= b) {
        long sum = a * a + b * b;
        if (sum == k) {
            found = true;
            break;
        } else if (sum < k) {
            a++;
        } else {
            b--;
        }
    }

    if (found) {
        System.out.println("true");
    } else {
        System.out.println("false");
    }
}
