public class LessonNumberOne {
    public static void main(String[] args) {
        taskNumberOne();
        taskNumberTwo();
    }

    public static void taskNumberOne() {
        // !!! получить сумму цифр числа 7675432 !!!

        // инициализировать переменную
        int initialNumber = 7675432;
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

    public static void taskNumberTwo() {
        /* !!! Дано число 15257543. Получить сумму цифр нечетных позиций, произведение четных и оба результата
        премножить между собой. !!! */

        // инициализировать переменную
        int initialNumberTaskTwo = 15257543;
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

        /* Занести в отдельную переменную - сумму цифр нечетных позиций, произведение четных и оба результата
             премножить между собой. */

        /* Результат  №1 , ВОПРОС: Как будет вернее?
        int decisionOne = (firstPosition + thirdPosition + fifthPosition + seventhPosition) *
                (secondPosition * fourthPosition * sixthPosition * eighthPosition); */

        //Результат №2
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
