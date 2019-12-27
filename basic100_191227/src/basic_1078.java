import java.util.Scanner;

public class basic_1078 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tmp= scanner.nextInt();
        int sum=0;

        for(int a=0;a<=tmp;a++){
            if(a%2==0) sum+=a;
        }
        System.out.println(sum);
    }
}
