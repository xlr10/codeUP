import java.util.Scanner;

public class basic_1023 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String tmp=scanner.nextLine();
        for(int a=0; a<tmp.length();a++){
            System.out.println("\'"+tmp.charAt(a)+"\'");
        }
    }
}
