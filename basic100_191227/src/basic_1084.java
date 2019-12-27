import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class basic_1084 {
    public static void main(String[] args)  throws IOException {
        Scanner scanner=new Scanner(System.in);
        int R = scanner.nextInt();
        int G = scanner.nextInt();
        int B = scanner.nextInt();
        int sum=0;
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(System.out));

        for(int a=0;a<R;a++){
            for(int b=0;b<G;b++){
                for(int c=0;c<B;c++){
                    bufferedWriter.write(a+" "+b+" "+c+"\n");
                    sum++;
                }
            }
        }
        bufferedWriter.write(sum+"\n");

        bufferedWriter.flush();
        bufferedWriter.close();
    }
}
