import java.util.Scanner;

public class basic_1054 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        boolean a=(scanner.nextInt()==1)? true:false;
        boolean b=(scanner.nextInt()==1)? true:false;

        System.out.println((a&&b)? 1:0);
    }
}
