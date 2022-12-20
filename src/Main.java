public class Main {
    public static void main(String[] args) {
        Author francis = new Author("Френсис", "Фицджеральд");
        Author alex = new Author("Александр", "Пушкин");
        Author aleks = new Author("Александр", "Пушкин");
        Book firstBook = new Book("Загадочная история Бенджамина Баттона", francis, 1922);
        Book secondBook = new Book("Капитанская дочка", alex, 1936);
        Book secondBook2 = new Book("Капитанская дочка", alex, 1936);

        System.out.println("Сравнение авторов");
        System.out.println(alex.equals(francis));
        System.out.println(alex.equals(aleks));

        System.out.println("Сравнение книг");
        System.out.println(firstBook.equals(secondBook));
        System.out.println(secondBook.equals(secondBook2));

        System.out.println("Меняем дату и сравниваем книги ещё раз");
        secondBook.setYearOfPublication(1937);
        System.out.println(firstBook.equals(secondBook));
        System.out.println(secondBook.equals(secondBook2));

        System.out.println("Выводим инфу по книгам");
        System.out.println(firstBook);
        System.out.println(secondBook);
    }
}