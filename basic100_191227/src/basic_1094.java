import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class basic_1094 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt= Integer.parseInt(scanner.nextLine());
        Stack<String> stringStack=new Stack<>();
        stringStack.addAll(Arrays.asList(scanner.nextLine().split(" ")));

        while (!stringStack.isEmpty()){
            System.out.print(stringStack.pop()+" ");
        }
    }
}
