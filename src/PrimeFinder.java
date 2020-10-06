public class PrimeFinder {
    public static void find(int n) {
        int count = 0;
        int curNumber = 2;
        while (count < n) {
            boolean isPrime = true;
            for (int x = 2; x < curNumber; x++) {
                if (curNumber % x == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(curNumber + "\t");
                count += 1;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
            curNumber += 1;
        }
    }
}
