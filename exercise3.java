public class exercise3 {
    public static void main(String[] args) {
        int n = 5;
        int[] a = {6, 5, 9, 3, 1};
        for(int i = n-1; i> 0; i--){
            for(int j=0; j < i; j++){
                if(a[j] > a[j+1]){
                    int tmp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = tmp;
                }
            }
        }
        for(int i=0; i <n; i++){
            System.out.print(a[i] + " ");
        }

    }
}
