/**
 * классы: https://javarush.ru/groups/posts/1949-znakomstvo-s-klassami-napisanie-sobstvennihkh-klassov-konstruktorih
 * методы: https://javarush.ru/groups/posts/1950-metodih-ikh-parametrih-vzaimodeystvie-i-peregruzka
 */
public class MainClass {

    /** public static void main(String[] args) является зарезервированным в java методом
     * Программа начинает свою работу с вызова этого метода.
     * В аргуиентах к методу обязательно передаётся массив строк(String[]) или varargs(String...)  — это массив аргументов с которыми может запускаться программа. По умолчанию массив пуст.
     * Более детально прочитать про агрументы запуска можно тут: http://www.linkex.ru/java/command-line-arguments.php
     * Подробнее про отличия массива строк и varargs: https://coderoad.ru/11640507/%D0%A0%D0%B0%D0%B7%D0%BD%D0%B8%D1%86%D0%B0-%D0%BC%D0%B5%D0%B6%D0%B4%D1%83-%D0%BC%D0%B0%D1%81%D1%81%D0%B8%D0%B2%D0%B0%D0%BC%D0%B8-%D0%B8-3-%D1%82%D0%BE%D1%87%D0%BA%D0%B0%D0%BC%D0%B8-Varargs-%D0%B2-java
     *
     * public - модификатор доступа (так же есть private и protected), говорит о том, что метод доступен из любого класса и пакета (из всей программы). Подробнее: https://metanit.com/java/tutorial/3.3.php
     * static - модификатор, означает что поле или метод принадлежит классу, и создаётся в момент загрузки класса. В то время как не-статики могут быть созданы позже, в ходе выполнения программы. Подробнее: https://javarush.ru/groups/posts/modifikator-static-java
     * void - ключевое слово, означает, что метод ничего не возвращает.
     * main - имя метода.
     * В скобках находятся аргументы метода. Т.е. то что метод принимает.
     */
    public static void main(String[] args) {
        // Так как модификатор static говорит java создать static в комент загрузки загрузки класса, то можно обращаться к статическим методам без создания ссылки на класс
        System.out.println(MainClass.getStaticHello());
        //Если метод не обозачен как статик, то для его вызова, нужно создать ссылку на класс в котором этот метод находится.
        //Так же, всё что помечено модификатором static может общаться только с другими static. Для того, чтобы обратиться к методу getHello() мы создаём ссылку на класс.
        MainClass mainClass = new MainClass();
        System.out.println(mainClass.getHello());
    }

    public void notStatic() {
        System.out.println(getHello());
    }

    /**
     * Метод обязательно должен быть помечен ключевым словом, которое говорит - что метод возвращает. Если метод ничего не возвращает, то он помечается как void если он что-то возрвщает, то заместо void пишется респонс. В данном случае String
     */
    public String getHello() {
        return "hello";
    }

    public static String getStaticHello() {
        return "static hello";
    }
}
