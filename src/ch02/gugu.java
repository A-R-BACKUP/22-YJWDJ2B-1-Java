package ch02;

// 구구단 출력;;

public class gugu {
    public static void main(String[] args) {
        int f = 2;
        int b = 1;
        for (int i = 1; i <= 9; i++){
            for (int j = 2; j <= 9; j++){
                System.out.print(f + " * " + b + " = " + (f * b)+ " ");
                f++;
            }
            if (f == 9){
                f = 2;
            }
            System.out.println();
            b++;
        }
    }
}
