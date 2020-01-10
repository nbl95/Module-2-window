import java.util.Scanner;

public class XoaPTMang{
    public static void main(String[] args) {
        int n, i ,c;
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("nhap so phan tu mang:");
            n = scanner.nextInt();
        }while (n <=0);

        int A[]= new int[n];

        System.out.println("nhap cac phan tu trong mang:");
        for (i = 0; i <n; i++){
            System.out.print("nhap phan tu thu"+ i +":");
            A[i]=scanner.nextInt();
        }
        System.out.println("nhap so nguyen k:");
        int k = scanner.nextInt();

        for (c = i = 0 ; i <n; i++){
            if(A[i] != k){
                A[c] = A[i];
                c++;
            }
        }
        n = c;
        System.out.println("Mang con lai sau khi xoa phan tu"+ k +"la:");
        for (i=0; i< n; i++){
            System.out.print(A[i]+"\t");
        }
    }
}