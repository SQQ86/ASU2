import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); //читаем с консоли
        int a = scan.nextInt();// сохраняем число
        int buf;//буферная переменная хранит остаток от деления на 10
        ArrayList list = new ArrayList<>();// создаем List
        while (a!=0){
            buf = a%10;
            list.add(buf);//заносим в List каждую цифру по отдельности
            a = a/10; //цикл продолжается, пока а не будет равно 0(пока все цифры из числа не будут занесены в List),
        }
        Collections.sort(list); //сортируем по взрастанию
        System.out.println(list.get(list.size()-1));//выводим цифру, последнюю в List , так как она является наибольшей
    }
}
