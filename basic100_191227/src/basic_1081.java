import java.util.Scanner;

public class basic_1081 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int first=scanner.nextInt();
        int second=scanner.nextInt();

        for(int a=1;a<=first;a++){
            for(int b=1;b<=second;b++){
                System.out.println(a+" "+b);
            }
        }

    }
}
