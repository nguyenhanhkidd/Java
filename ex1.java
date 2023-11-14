import java.util.Scanner;

public class ex1 { 
    public static void main(String[] args) {
        int[] score = new int[4];
        int sum  = 0;

        for (int i = 0; i < score.length; i++){
            Scanner sc = new Scanner(System.in);
            score[i] = sc.nextInt();
        }
        for (int i = 0; i < score.length; i++){
            System.out.print(score[i] + ", ");
        }

        for (int i = 0; i< score.length; i++){
            sum += score[i];
        }
        System.out.println(sum);
    }
}

