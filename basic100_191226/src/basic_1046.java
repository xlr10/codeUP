import java.util.Scanner;

public class basic_1046 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sum=scanner.nextInt()+scanner.nextInt()+scanner.nextInt();
        System.out.println(sum);
        System.out.format("%.1f",(double)sum/3);
    }
}
