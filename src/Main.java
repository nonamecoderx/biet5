public class Main {
    public static void main(String[] args) {
        //задаем переменные
        int a = 5;
        int b = 0;
        //проверяем код, который может создать ошибку
        try {
            int c = a / b;
            //если произошла ошибка, ловим в следующем блоке - арифметическия ошибка деления на 0
        } catch (ArithmeticException e) {
            // если поймали исключение то выводим сообщение
            System.out.println("Деление на 0 запрещено!");
        }
        System.out.println("Проверка деления на 0 завершена");
    }
}