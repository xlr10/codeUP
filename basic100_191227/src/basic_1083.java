import java.util.Scanner;

public class basic_1083 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tmp=scanner.nextInt();

        for(int a=1;a<=tmp;a++){
            if(a%3==0){
                System.out.print("X ");
            }else {
                System.out.print(a+" ");
            }
        }
    }
}
