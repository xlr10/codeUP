import java.util.Scanner;

public class basic_1091 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        long start = scanner.nextLong();
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int n = scanner.nextInt();

        for(int a=0;a<n-1;a++){
            start=start*m+d;
        }
        System.out.println(start);
    }
}
