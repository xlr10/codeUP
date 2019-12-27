import java.util.Scanner;

public class basic_1093 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt= Integer.parseInt(scanner.nextLine());
        String[] num= scanner.nextLine().split(" ");
        int[] tmp=new int[23];

        for(int a=0;a<cnt;a++){
            tmp[Integer.parseInt(num[a])-1]++;
        }
        for(int e: tmp){
            System.out.print(e+" ");
        }
    }
}
