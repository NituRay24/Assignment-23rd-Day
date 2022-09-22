import java.util.ArrayList;
interface MyInterface {
    void arithmeticOperation(int num1, int num2);

    public class MathOperation {
        public void simpleMethod() {
            System.out.println(10);
//return 5;
        }

        public void storeLambdaDemo() {
//int num = 0;
            ArrayList<Integer> integerArrayList = new ArrayList<>();
            integerArrayList.forEach(num -> System.out.println(num));
// Store the lambda expression in a variable of type interface
            MyInterface varToStoreLambdaExpn = (num1, num2) -> System.out.println(num1 * num2);
            MyInterface varToStoreSum = (num3, num5) -> System.out.println(num3 + num5);
            MyInterface varToStoreDiff = (num1, num2) -> System.out.println(num1 - num2);

// the abstract method defined inside the interface
            varToStoreLambdaExpn.arithmeticOperation(10, 20);
            varToStoreSum.arithmeticOperation(10, 20);
            varToStoreDiff.arithmeticOperation(100, 20);
        }
    }

    public static void main(String[] args) {
        MathOperation led = new MathOperation();
        led.storeLambdaDemo();

    }
}