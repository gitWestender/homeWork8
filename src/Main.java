import java.util.Arrays;

public class Main {

    static int counter = 1;

    public static void main(String[] args) {
        task1();
        task2();
    }

    static void task1() {
        System.out.printf("\nЗадание %d:", counter++);

        int[] intArray = new int[3];

        for (int i : intArray) {
            i += 1;
        }

        double[] doubleArray = {1.57, 7.654, 9.986};

        String str = "Hello";

        char[] charArray = str.toCharArray();
    }

    static void task2() {
        System.out.printf("\nЗадание %d:\n", counter++);

        int[] intArray = new int[3];

        for (int i : intArray) {
            i += 1;
            System.out.print(i + " ");
        }

        System.out.println();
        double[] doubleArray = {1.57, 7.654, 9.986};

        for (double d : doubleArray) {
            System.out.print(d + " ");
        }

        System.out.println();
        String str = "Hello";
        char[] charArray = str.toCharArray();

        System.out.println(Arrays.toString(charArray));
    }
}