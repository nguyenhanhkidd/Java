import java.util.Scanner;

public class exercise1 {
    public static void main(String[] args) {
        int n;
        int[] arr;
        System.out.println("n = ");
        Scanner sc =  new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];

        //nhap vao mang
        for(int i = 0; i < n; i++){
            System.out.println("arr[" + i + "] :");
            arr[i] = sc.nextInt();
        }
    
        //check mang
        boolean flag = true;

        for(int i=0; i <= n/2; i++){
            if(arr[i] != arr[n-1-i]){
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Mang doi xung");
        }else{
            System.out.println("Mang khong doi xung");
        }
    }
}
