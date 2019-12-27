import java.util.*;

public class basic_1071 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Queue<String> tmp=new ArrayDeque<>();
        tmp.addAll(new ArrayList<>(Arrays.asList(scanner.nextLine().split(" "))));

        rescursive(tmp);

    }
    public static void rescursive(Queue<String> queue){
        String tmp = queue.poll();
        if(tmp.equals("0")) {
            return;
        }else {
            System.out.println(tmp);
            rescursive(queue);
        }
    }
}
