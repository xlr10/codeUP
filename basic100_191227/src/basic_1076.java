import java.util.Scanner;

public class basic_1076 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        char tmp = scanner.nextLine().charAt(0);

        for(char a='a'; a<=tmp ;a++){
            System.out.print(a+" ");
        }
    }
}
