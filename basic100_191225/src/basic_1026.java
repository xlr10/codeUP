import java.util.Scanner;

public class basic_1026 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] tmp= scanner.nextLine().split(":");
        System.out.format("%d",Integer.parseInt(tmp[1]));
    }
}
