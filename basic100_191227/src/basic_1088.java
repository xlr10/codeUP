import java.util.Scanner;

public class basic_1088 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int tmp=scanner.nextInt();

        for(int a=1;a<=tmp;a++){
            if(a%3==0){
                continue;
            }
            System.out.print(a+" ");
        }
    }
}