package methods.access;

public class AccessModifierMain {

    public static void main(String[] args) {
        AccessModifierMethodExample example = new AccessModifierMethodExample();

        // Вызов публичного метода
        example.publicMethod();

        // Вызов защищенного метода
        example.protectedMethod();

        // Вызов приватного метода
        // ‼️НЕЛЬЗЯ так делать. Доступен только внутри AccessModifierMethodExample класса
//        example.privateMethod();

        example.publicMethod2();
    }
}
