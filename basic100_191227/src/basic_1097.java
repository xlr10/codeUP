import java.util.Scanner;

public class basic_1097 {
    public static void main(String[] args) throws Exception{
        Scanner scanner=new Scanner(System.in);
        int[][] DB=new int[19][19];

        //입력
        for(int a=0;a<19;a++){
            for(int b=0;b<19;b++){
                if(scanner.nextInt()==1)    DB[a][b]=1;
            }
        }

        int cnt = scanner.nextInt();
        int [][]pos=new int[cnt][2];

        for(int a=0;a<cnt;a++){
            //가로
            int tmp=scanner.nextInt()-1;
            for(int b=0;b<19;b++){
                if(DB[tmp][b]==0) DB[tmp][b]=1;
                else              DB[tmp][b]=0;
            }
            //세로
            tmp=scanner.nextInt()-1;
            for(int b=0;b<19;b++){
                if(DB[b][tmp]==0) DB[b][tmp]=1;
                else              DB[b][tmp]=0;
            }
        }
        if(scanner.hasNextLine())   scanner.nextLine();

        //출력
        for(int a=0;a<19;a++){
            for(int b=0;b<19;b++){
                System.out.print(DB[a][b]+" ");
            }
            System.out.println();
        }
    }
}
