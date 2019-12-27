import java.util.Scanner;

public class basic_1089 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int start = scanner.nextInt();
        int d     = scanner.nextInt();
        int num   = scanner.nextInt();

        for(int a=1;a<num;a++){
            start+=d;
        }
        System.out.println(start);
    }
}
