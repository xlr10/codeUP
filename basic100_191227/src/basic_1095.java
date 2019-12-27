import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class basic_1095 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int cnt = Integer.parseInt(scanner.nextLine());
        ArrayList<Integer> arrayList=new ArrayList<>();

        for(int a=0;a<cnt;a++){
            arrayList.add(scanner.nextInt());
        }
        scanner.nextLine();

        Collections.sort(arrayList);

        System.out.println(arrayList.get(0));

    }
}
