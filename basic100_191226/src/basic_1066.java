import java.util.Scanner;

public class basic_1066 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] tmp=scanner.nextLine().split(" ");
        for(String e: tmp){
            if(Integer.parseInt(e)%2==0)
                System.out.println("even");
            else
                System.out.println("odd");
        }
    }
}
