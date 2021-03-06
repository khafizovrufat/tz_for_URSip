import java.util.List;

public class MainClass {

    public static void main(String[] args) {
    }

    public String generateNum(List<Integer> numbers) {
        int temp = 1;
        for (Integer number : numbers) {
            if (temp < number) {
                return convertResultInTrueFormat(temp);
            } else if (temp == number) {
                temp++;
            }
        }
        return convertResultInTrueFormat(temp);
    }



    public String convertResultInTrueFormat(int number) {
        String rawString = String.valueOf(number);
        if (rawString.length() == 1) {
            rawString = "00" + rawString;
        } else if (rawString.length() == 2) {
            rawString = "0" + rawString;
        }
        return rawString;
    }

}
/*
Задание:


        Реализовать метод для генерации номера проекта на Java, Kotlin или Scala

        На вход будет переданы сущетвующие номера в виде масива целых чисел.
        Необходимо вернуть номер следующего проекта, по следующей логике:
        Если текущие номера проекта не содержат пропусков, то необходимо вернуть максимальный элемент + 1.
        Если пропуски есть, необходимо вернуть минимальный из них.
        Пропуском называется разница между номерами больше или равная единицы (f(1,3) содержит пропуск, а f(1,2) нет).
        Переданные номера проектов могут дублироваться, но сгенерированный методом номер не должен повторять существующий.
        Номера проектов неотрицательные.

        Пример:
        f(1,2,3) = 4
        f(1,3) = 2
        f(2) = 1

        Сгенерированный номер необходимо вернуть в формате трехразрядной строки, т.е.:
        f(1) = "001"
        f(10) = "010"
        f(100) = "100"

        В реализации приветствуется функциональный стиль.
        Оцениваться будет качество кода и его корректность.
        Решение необходимо залить в публичный репозиторий и предоставить ссылку.
*/