import java.util.Scanner;

public class XoaPTMang {
    public static void main(String[] args) {
        int index = 0;
        int[] arr = {1,3,5,7,9};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X");
        int x = scanner.nextInt();
        boolean check = false;
        int i = 0;
        for ( i =0 ; i< arr.length ; i++){

            if (x == arr[i]){
                index = i++;
                check = true;
                break;
                
            }

        }
        if(check == false){
            System.out.printf("x k ton tai");
        }else {
            int[] arr2 = new int[arr.length - i+1];
            for (int j= 0; j< arr2.length; j++){
                arr2[j]= arr[index];
                index ++;
            }
            for (int j =0; j <arr2.length; j++){
                System.out.printf( ""+arr2[j]);
            }
        }

    }



}
