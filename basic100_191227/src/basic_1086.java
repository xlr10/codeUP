import java.util.Scanner;

public class basic_1086 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int w   = scanner.nextInt();
        int h   = scanner.nextInt();
        int b   = scanner.nextInt();
        double tmp=(double)(w*h*b/8/1024)/1024;

        System.out.format("%.2f MB",tmp);
    }
}
