import java.util.Scanner;

public class basic_1085 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long h  = scanner.nextLong();
        int b   = scanner.nextInt();
        int c   = scanner.nextInt();
        int s   = scanner.nextInt();
        double tmp=(double)(h*b*c*s/8/1024)/1024;
        System.out.format("%.1f MB",tmp);
    }
}
