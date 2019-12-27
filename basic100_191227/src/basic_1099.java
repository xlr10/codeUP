import java.util.Scanner;

public class basic_1099 {
    static private int[][] map=new int[10][10];
    static private int x=1;
    static private int y=1;
    static private boolean end=false;
    static private boolean find=false;

    public static void main(String[] args) {
        input_map();
        while (!is_over()){
            move();
        }
        show_map();
    }

    private static boolean is_over(){
        //(8,8)도착한경우, 먹이찾은경우, (8,8)이전에 오른-아래쪽없을때
        if(x==8 && y==8)    return true;
        else if(find)       return true;
        else if(is_rigth_wall() && is_down_wall())  return true;
        else                return false;
    }
    private static boolean chk_first(){
        if(map[x][y]==2){
            find=true;
            map[1][1]=9;
            return true;
        }else {
            map[1][1]=9;
            return false;
        }

    }
    private static void move(){
        if(chk_first()) return;

        if(!is_rigth_wall()){
            if(map[x][++y]==2)  find=true;
            map[x][y]=9;
            return;
        }else if(!is_down_wall()){
            if(map[++x][y]==2)  find=true;
            map[x][y]=9;
            return;
        }else {
            end=true;
        }
    }
    private static boolean is_rigth_wall(){
        if(map[x][y+1]==1) return true;
        else    return false;
    }
    private static boolean is_down_wall(){
        if(map[x+1][y]==1) return true;
        else    return false;
    }

    private static void input_map(){
        Scanner scanner=new Scanner(System.in);
        for(int a=0;a<10;a++){
            for(int b=0;b<10;b++){
                map[a][b]=scanner.nextInt();
            }
        }
        if(scanner.hasNextLine())   scanner.nextLine();
        return;
    }

    private static void show_map(){
        for(int a=0;a<10;a++){
            for(int b=0;b<10;b++){
                System.out.print(map[a][b]+" ");
            }
            System.out.println();
        }
    }
}