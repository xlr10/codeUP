import java.util.Scanner;

public class basic_1067 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tmp=scanner.nextInt();
        System.out.println(tmp<0? "minus":"plus");
        System.out.println(tmp%2==0? "even":"odd");
    }
}
