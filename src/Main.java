import java.util.Arrays;

public class Main {

    static int counter = 1;

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    static void task1() {
        System.out.printf("\nЗадание %d:", counter++);

        int[] intArray = new int[3];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] += i + 1;
        }

        double[] doubleArray = {1.57, 7.654, 9.986};

        String str = "Hello";

        char[] charArray = str.toCharArray();
    }

    static void task2() {
        System.out.printf("\nЗадание %d:\n", counter++);

        int[] intArray = new int[3];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] += i + 1;
            System.out.print(intArray[i] + " ");
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

    static void task3() {
        System.out.printf("\nЗадание %d:\n", counter++);

        int[] intArray = new int[3];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] += i + 1;
        }

        for (int i = intArray.length - 1; i >= 0; i--) {
            System.out.print(intArray[i] + " ");
        }


        System.out.println();
        double[] doubleArray = {1.57, 7.654, 9.986};
        int lenght = doubleArray.length - 1;

        while (lenght >= 0) {
            System.out.print(doubleArray[lenght] + " ");
            lenght--;
        }


        System.out.println();
        String str = "Hello";
        char[] charArray = str.toCharArray();
        char[] newCharArray = new char[charArray.length];

        for (int i = 0, j = charArray.length - 1; i < charArray.length; i++, j--) {
            newCharArray[j] = charArray[i];
        }

        System.out.println(Arrays.toString(newCharArray));

    }

    static void task4() {
        System.out.printf("\nЗадание %d:\n", counter++);

        int[] intArray = new int[3];

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] += i + 1;
        }

        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                intArray[i] += 1;
            }
        }

        System.out.println(Arrays.toString(intArray));
    }
}