import java.util.Scanner;

public class basic_1027 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] tmp= scanner.nextLine().split("\\.");
        System.out.println(tmp[2]+"-"+tmp[1]+"-"+tmp[0]);
    }
}
