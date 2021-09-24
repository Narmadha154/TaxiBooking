
class A{
    public int add(int i, int j){
        return i+j;
    }
}
class B extends A{
    public int sub(int i, int j) {
        return i-j;
    }
}
public class Calculator {

    public static void main(String[] args) {
	B c1= new B();
	int result1=c1.add(4,5);
	int result2=c1.sub(9,6);
	System.out.println(result1);
	System.out.println(result2);
    }
}
