import java.util.ArrayList;
import java.util.Sca
public class Task1Runner {
    public static void main(String [] args){
        int n = 0;
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
    }
}
