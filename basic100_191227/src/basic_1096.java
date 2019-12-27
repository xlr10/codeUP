import java.util.Scanner;

public class basic_1096 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int white = Integer.parseInt(scanner.nextLine());
        int[][] DB=new int[19][19];

        for(int a=0;a<white;a++){
            DB[scanner.nextInt()-1][scanner.nextInt()-1]=1;
        }

        for(int a=0;a<19;a++){
            for(int b=0;b<19;b++){
                System.out.print(DB[a][b]+" ");
            }
            System.out.println();
        }
    }
}
