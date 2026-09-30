package methods.typeByValue;

public class TypeMethodMain {
    public static void main(String[] args) {
        TypeMethodExample example = new TypeMethodExample();

        var string = "String";
        var a = 5;

        example.method();
        example.method(string);
        System.out.println(string);
        example.method(a);
        System.out.println(a);

        var string2 = example.method2();
        System.out.println(string2);

        string = example.method2(string);
        System.out.println(string);

        a = example.method2(a);
        System.out.println(a);
    }
}





