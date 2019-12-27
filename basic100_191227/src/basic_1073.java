import java.util.Scanner;

public class basic_1073 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] tmp=scanner.nextLine().split(" ");
        for(String e: tmp){
            if(e.equals("0")){
                break;
            }else {
                System.out.println(e);
            }
        }
    }
}
