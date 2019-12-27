import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class basic_1079 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Queue<String> tmp=new ArrayDeque<>();
        tmp.addAll(Arrays.asList(scanner.nextLine().split(" ")));

        recursive(tmp);
    }
    private static void recursive(Queue<String> queue){
        String tmp= queue.poll();
        if(tmp.equals("q")){
            System.out.println(tmp);
            return;
        }else {
            System.out.println(tmp);
            recursive(queue);
        }
    }
}
