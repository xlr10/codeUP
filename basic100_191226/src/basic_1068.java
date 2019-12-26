import java.util.Scanner;

public class basic_1068 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int score=scanner.nextInt();
        String grade=null;

        if(90<=score && score<=100){
            grade="A";
        }else if(70<=score && score<=89){
            grade="B";
        }else if(40<=score && score<=69){
            grade="C";
        }else if(0<=score && score<=39){
            grade="D";
        }
        System.out.println(grade);
    }
}
