import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int eded = sc.nextInt();
        int terseded = 0;
            while (eded>0){
                int qaliq = eded%10;

                 terseded = terseded * 10 + qaliq;
                eded = eded/10;

    }
        System.out.println(terseded);
}}