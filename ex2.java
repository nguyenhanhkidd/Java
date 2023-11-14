public class ex2 {
    public static void main(String[] args) {
        int[] arr = {1,4,4,1};
        int n = arr.length;

        boolean flag = true;
        for(int i=0; i<= (n-1)/2; i++){
            if(arr[i] != arr[n-1-i]){
                flag = false;
                break;
            }
        }
        if(flag == false){
            System.out.println("Mang khong doi xung");
        }else{
            System.out.println("Mang doi xung");
        }
    }
}
