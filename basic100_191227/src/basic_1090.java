import java.util.Scanner;

public class basic_1090 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long start = scanner.nextLong();
        int r     = scanner.nextInt();
        int num   = scanner.nextInt();

        for(int a=1;a<num;a++){
            start*=r;
        }
        System.out.println(start);
    }
}
