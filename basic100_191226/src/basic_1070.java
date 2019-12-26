import java.util.Scanner;

public class basic_1070 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int month=scanner.nextInt();
        String cmd=null;

        switch (month){
            case 12:
            case 1:
            case 2:
                cmd="winter";
                break;
            case 3:
            case 4:
            case 5:
                cmd="spring";
                break;
            case 6:
            case 7:
            case 8:
                cmd="summer";
                break;
            case 9:
            case 10:
            case 11:
                cmd="fall";
                break;
        }
        System.out.println(cmd);
    }
}
