public class Main {

    static int counter = 1;

    public static void main(String[] args) {
        task1();
    }

    static void task1() {
        System.out.printf("\nЗадание %d:", counter++);

        int[] intArray = new int[3];

        for (int i : intArray) {
            intArray[i] = i + 1;
        }

        double[] doubleArray = {1.57, 7.654, 9.986};

        String str = "Hello";

        char[] charArray = str.toCharArray();
    }

}