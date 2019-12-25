import java.util.Scanner;

public class basic_1025 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] tmp= scanner.nextLine().split("");

        int size =tmp.length-1;

        for(String e:tmp){
            int a= Integer.parseInt(e) * (int)(Math.pow(10,size--));

            System.out.println("["+a+"]");
        }
    }
}
