import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int element, index = 0;
        int[] array = {1, 2, 3, 4, 5, 6};
        Scanner scanner = new Scanner(System.in);
        System.out.print("insert element you want delete : ");
        element = scanner.nextInt();
        boolean check = false;

        for (int i=0;i<array.length;i++) {
            if (array[i]== element) {
                index = i;
                check = true;
                break;
            }
        }
        int[] array2 = new int[array.length-1];

        if ( check ) {
            for (int j = 0; j < array2.length; j++) {
                if(index<=j){
                    array2[j]=array[j+1];
                }else {
                    array2[j]=array[j];
                }
            }
            for (int i:array2
            ) {
                System.out.print(i);
            }
        } else {
            System.out.print("cc");
        }

    }
}