package klasy;

public class Main {
    public static void main(String[] args) {
        ExampleClass exampleClass = new ExampleClass("Jan", 20);
        System.out.println(exampleClass.getData());

        exampleClass.setName("Adam");
        exampleClass.setAge(30);

        System.out.println(exampleClass.getData());
    }
}
