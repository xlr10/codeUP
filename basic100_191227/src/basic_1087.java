import java.util.Scanner;

public class basic_1087 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tmp=scanner.nextInt();
        int a=0, sum=0;
        do {
            sum+=(++a);
        }while (sum<tmp);

        System.out.println(sum);
    }
}
