import java.util.Scanner;

public class basic_1092 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int cnt=1;

        while (true){
            if((cnt%a==0)&&(cnt%b==0)&&(cnt%c==0)){
                break;
            }
            cnt++;
        }
        System.out.println(cnt);
    }
}