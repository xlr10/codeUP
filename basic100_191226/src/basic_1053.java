import java.util.Scanner;

public class basic_1053 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tmp=scanner.nextInt();

        if(tmp==1)  tmp=0;
        else        tmp=1;
        System.out.println(tmp);

    }
}
