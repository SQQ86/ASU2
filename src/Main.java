import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int buf;
        ArrayList list = new ArrayList<>();
        while (a!=0){
            buf = a%10;
            list.add(buf);
            a = a/10;
        }
        Collections.sort(list);
        System.out.println(list.get(list.size()-1));
    }
}
