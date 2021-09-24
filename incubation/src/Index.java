package program;
import java.util.ArrayList;
import java.util.Scanner;
public class Index {
    public void findIndex(){
        int n = 0,r;
        ArrayList<Integer> array = new ArrayList<Integer>(n);
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arraylist:");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("enter the value:");
            array.add(sc.nextInt());
        }
        System.out.println("array elements are:");
        for (int i = 0; i <n; i++) {
            System.out.println(array.get(i));
        }
        System.out.println("enter the element for which you want the index:");
        r=sc.nextInt();
        System.out.println("Index position is:"+ array.indexOf(r));
    }
}