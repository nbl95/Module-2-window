import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class hienthi20songuyento{
    static boolean isPrime(int n){
        int i;
        if (n <2) return false;
        for ( i = 2; i<= sqrt(n); i++);
        if ( n % i  == 0) return false;
        return true;
    }
    static void display(){
        int num;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        int i =2;
        int count =0;
        while (count < num  ){
            if (isPrime(i)){
                System.out.print(" "+i);
                count++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        display();

    }
}