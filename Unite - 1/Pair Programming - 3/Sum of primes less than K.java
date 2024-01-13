public static void Solve(int N, int A[], int K) {
    int sum = 0;
    for (int i = 0; i < N; i++) {
        if (A[i] < K && A[i] != 1) {
            boolean isPrime = true;
            for (int j = 2; j * j <= A[i]; j++) { 
                if (A[i]% j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                sum += A[i];
            }
        }
    }

    System.out.println(sum);
}
