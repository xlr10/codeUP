import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;
import java.util.Scanner;

public class basic_1072 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        scanner.nextLine();

        Queue<String> tmp=new ArrayDeque<>();
        tmp.addAll(Arrays.asList(scanner.nextLine().split(" ")));

        recursive(tmp);
    }
    private static void recursive(Queue<String> tmp){
        if(tmp.isEmpty()){
            return;
        }else{
            System.out.println(tmp.poll());
            recursive(tmp);
        }
    }
}
