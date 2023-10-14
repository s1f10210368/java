package lecture2;
public class ArraySample {
    public static void main(String[] args) {
        int[] array1 = {1, -2, 3, 4, -5};
        int result = positive(array1);
        System.out.println(result);

        String[] array2 = {"Information", "Networking", "for", "Innovation", "And", "Design"};
        printOdd(array2);
    }

    public static int positive(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void printOdd(String[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                System.out.println(array[i]);
            }
        }
    }
}

