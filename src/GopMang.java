import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array1 = new int[4],
                array2 = new int[4];
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Please insert element " + i + " of array1 :");
            array1[i] = scanner.nextInt();
        }

        for (int i = 0; i < array2.length; i++) {
            System.out.println("Please insert element " + i + " of array2 :");
            array2[i] = scanner.nextInt();
        }

        int[] newArray = new int[array1.length + array2.length];
        int countElement = 0;

        for (int item : array1) {
            newArray[countElement] = item;
            countElement++;
        }

        for (int value : array2) {
            newArray[countElement] = value;
            countElement++;
        }
        System.out.println("this is new array: ");
        for (int value : newArray) {
            System.out.println(value);

        }

    }
}
