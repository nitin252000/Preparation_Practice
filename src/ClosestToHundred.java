public class ClosestToHundred {

    public static void main(String[] args) {

        int[] ar = {95, 120, 85, 105, 98, 102, 150};

        int minDiff = Integer.MAX_VALUE;

        // Find minimum difference
        for (int num : ar) {
            minDiff = Math.min(minDiff, Math.abs(num - 100));
        }

        // Print all numbers with minimum difference
        System.out.print("Closest numbers: ");
        for (int num : ar) {
            if (Math.abs(num - 100) == minDiff) {
                System.out.print(num + " ");
            }
        }

        System.out.println();
        System.out.println("One closest number: " + closestTo100(ar));
    }

    public static int closestTo100(int[] arr) {
        int closest = arr[0];

        for (int num : arr) {
            if (Math.abs(num - 100) < Math.abs(closest - 100)) {
                closest = num;
            }
        }

        return closest;
    }
    public static int sameclosestTo100(int[] arr) {
        int closest = arr[0];

        for (int num : arr) {
            int diff1 = Math.abs(num - 100);
            int diff2 = Math.abs(closest - 100);

            if (diff1 < diff2 || (diff1 == diff2 && num > closest)) {
                closest = num;
            }
        }

        return closest;
    }
}