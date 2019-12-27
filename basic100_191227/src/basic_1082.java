import java.util.Scanner;

public class basic_1082 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tmp=Integer.valueOf(scanner.nextLine(),16);

        for(int a=1;a<16;a++){
            System.out.format("%X*%X=%X\n",tmp,a,tmp*a);
        }
    }
}
