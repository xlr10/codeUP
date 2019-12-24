import java.util.Scanner;

public class basic_1019 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] tmp=scanner.nextLine().split("\\.");

        System.out.format("%04d.%02d.%02d",
                Integer.parseInt(tmp[0]),
                Integer.parseInt(tmp[1]),
                Integer.parseInt(tmp[2]));
    }
}
