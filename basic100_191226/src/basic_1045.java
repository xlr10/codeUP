import java.util.Scanner;

public class basic_1045 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println((int)a/b);
        System.out.println(a%b);
        System.out.format("%.2f",(double)a/b);
    }
}
