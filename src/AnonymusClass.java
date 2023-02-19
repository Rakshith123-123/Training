
@FunctionalInterface
interface MyFunction<S, I extends Number> {
    Integer apply(String a);
}
public class AnonymusClass {
    public static void main(String[] args) {
        MyInterface myObj = new MyInterface() {
            @Override
            public void doSomething() {
                System.out.println("Anonymus class");
            }
        };

        myObj.doSomething();

        MyFunction<String, Integer> myFunc = (str) -> str.length();

        int length = myFunc.apply("Hello, world!");
        System.out.println(length);


    }
}
