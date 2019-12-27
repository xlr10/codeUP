import java.util.Scanner;

public class basic_1098 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int[][] background=new int[scanner.nextInt()][scanner.nextInt()];
        int cnt= scanner.nextInt();

        while (cnt>0){
            cnt--;
            int length= scanner.nextInt();
            int span= scanner.nextInt();
            int x= scanner.nextInt()-1;
            int y= scanner.nextInt()-1;
            if(scanner.hasNextLine()) scanner.nextLine();

            if(span==0){
                for(int a=0;a<length;a++){
                    background[x][y+a]=1;
                }
            }else {
                for(int a=0;a<length;a++){
                    background[x+a][y]=1;
                }
            }
        }

        for(int a=0;a<background.length;a++){
            for(int b=0;b<background[a].length;b++){
                System.out.print(background[a][b]+" ");
            }
            System.out.println();
        }
    }
}
