package methods.access;

/**
 * Модификаторы доступа для методов:
 * */

public class AccessModifierMethodExample {

    private void privateMethod() {
        System.out.println("Приватный метод был вызыван");
    }

    protected void protectedMethod() {
        System.out.println("Это защищенный метод");
    }

    public void publicMethod() {
        System.out.println("Это публичный метод");
    }

    public void publicMethod2() {
        System.out.println("Это публичный метод, который вызывает приватный метод");
        privateMethod();
    }
}
