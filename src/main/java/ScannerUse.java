import java.util.Scanner; //импорт класса Scanner из пакета java.util

public class ScannerUse {
    public static void main(String[] args) {
        remakeTaskOne();
        remakeTaskTwo();
    }

    public static void remakeTaskOne() {
        // // !!! получить сумму цифр числа 7675432, число вводится с консоли(клавиатуры)!!!
        //создать объект класса сканер, c потоком входных данных
        Scanner sc = new Scanner(System.in);
        //Получаем число введенное с клавиатуры
        int initialNumber = sc.nextInt();
        // получаем первую цифру
        int firstNumber = initialNumber / 1000000;
        // получаем вторую цифру
        int secondNumber = initialNumber % 1000000 / 100000;
        // получаем третью цифру
        int thirdNumber = initialNumber % 100000 / 10000;
        // получаем четвертую цифру
        int fourthNumber = initialNumber % 10000 / 1000;
        // получаем пятую цифру
        int fifthNumber = initialNumber % 1000 / 100;
        // получаем шестую цифру
        int sixthNumber = initialNumber % 100 / 10;
        // получаем седьмую цифру
        int seventhNumber = initialNumber % 10;
        // результат сложения - занести в переменную
        int result = firstNumber + secondNumber + thirdNumber + fourthNumber + fifthNumber + sixthNumber +
                seventhNumber;
        // вывод результата в консоль
        System.out.println(result);

    }

    public static void remakeTaskTwo() {
        /* !!! Дано число 15257543. Получить сумму цифр нечетных позиций, произведение четных и оба результата
        премножить между собой. Число вводится с консоли(клавиатуры) !!! */

        //создать объект класса сканер, c потоком входных данных
        Scanner sc = new Scanner(System.in);
        //Получаем число введенное с клавиатуры
        int initialNumberTaskTwo = sc.nextInt();
        // получить первое число - нечетная позиция
        int firstPosition = initialNumberTaskTwo / 10000000;
        // получить второе число - четная позиция
        int secondPosition = initialNumberTaskTwo / 1000000 % 10;
        // получить третье число - нечетная позиция
        int thirdPosition = initialNumberTaskTwo / 100000 % 10;
        // получить четвертое число - четная позиция
        int fourthPosition = initialNumberTaskTwo / 10000 % 10;
        // получить пятое число - нечетная позиция
        int fifthPosition = initialNumberTaskTwo / 1000 % 10;
        // получить шестое число - четная позиция
        int sixthPosition = initialNumberTaskTwo / 100 % 10;
        // получить седьмое число - нечетная позиция
        int seventhPosition = initialNumberTaskTwo % 100 / 10;
        // получить восьмое число - четная позиция
        int eighthPosition = initialNumberTaskTwo % 10;
        // Сумма нечетных позиций.
        int additionOfOdd = firstPosition + thirdPosition + fifthPosition + seventhPosition;
        // произведение четных позиций
        int multiplicationOfEvenNumbers = secondPosition * fourthPosition * sixthPosition * eighthPosition;
        // Переумножение суммы нечетных и произведения четных
        int resultTaskTwo = additionOfOdd * multiplicationOfEvenNumbers;
        //Вывод в консоль
        System.out.println(resultTaskTwo);
    }
}
