package methods.typeByAffiliation;

/**
 * Типы методов в зависимости от принадлежности к классу:
 * 1. Статический метод (static). Не требуется создавать экземпляр класса
 * 2. Метод экземпляра класса (instance method). Требуется создать экземпляр класса.
 * */

public class TypeByAffiliationMethodExample {

    public static void staticMethod() {
        System.out.println("Это статический метод");
    }

    public void instanceMethod() {
        System.out.println("Это метод экземпляра класса");
    }
}
