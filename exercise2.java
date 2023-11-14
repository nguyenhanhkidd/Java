import java.util.Scanner;

public class exercise2 {
    public static void main(String[] args) {
        int n;
        int[] a;
        System.out.println("n: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        a = new int[n];

        for (int i = 0; i<n; i++){
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
            System.out.println("");
        }
        

        //check phan tu mang

        int[] b = new int[n];

        for (int i = 0; i<n; i++){
            for(int j=0; j<=i; j++){
                if(a[i] == a[j]) 
                    b[i] ++;
            }
        }
        
        int max = b[0];

        for (int i = 0; i < n; i++){
            if(b[i] > max){
                max = b[i];
            }
        }
        for(int i = 0; i < n; i++){
            if(b[i] == max){
                System.out.println(a[i] + " co so lan xuat hien la: " + b[i]);
            }
        }
    }
}
