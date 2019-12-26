import java.util.Scanner;

public class basic_1069 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String  score=scanner.nextLine();
        String cmd=null;

        switch (score){
            case "A":
                cmd="best!!!";
                break;
            case "B":
                cmd="good!!";
                break;
            case "C":
                cmd="run!";
                break;
            case "D":
                cmd="slowly~";
                break;
        }
        System.out.println(cmd);
    }
}
