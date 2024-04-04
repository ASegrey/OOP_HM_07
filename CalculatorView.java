package home_made_07;

import java.util.Scanner;
import java.util.logging.Logger;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView() {
        scanner = new Scanner(System.in);
    }

    // Метод для получения операндов и оператора от пользователя
    public void getUserInput(CalculatorModel model) {
        System.out.print("Введите первый операнд: ");
        double operand1 = scanner.nextDouble();
        System.out.print("Введите оператор (+, -, *, /): ");
        String operator = scanner.next();
        System.out.print("Введите второй операнд: ");
        double operand2 = scanner.nextDouble();

        // Устанавливаем операнды и оператор в модели
        model.setOperand1(operand1);
        model.setOperator(operator);
        model.setOperand2(operand2);
    }

    // Метод для вывода результата
    public void displayResult(double result) {
        System.out.println("Результат: " + result);
    }

    public void printMenu(){
        System.out.println("Меню :");
        System.out.println("-> 0 : Выход из программы");
        System.out.println("-> 1 : Запуск калькулятора");
        System.out.print("-> ");
    }
    
    public void menu(CalculatorModel model, CalculatorView view){
        Logger logger = Logger.getLogger("MyLog");//.getAnonymousLogger();
        int select = 0;
        boolean out = false;
        printMenu();
        while (true){
            if (out){break;}
            select = scanner.nextInt();
            switch (select) {
                case 0:
                    logger.info("Out Program");
                    out = true;
                    break;
                case 1:
                    logger.info("Run program calculator");
                    view.getUserInput(model); // Получаем ввод от пользователя
                    double result = model.calculate(); // Выполняем вычисление
                    view.displayResult(result); // Выводим результат
                    // Вывод лога калькуляции
                    logger.info(String.valueOf(model.getOperand1()) + model.getOperator() + String.valueOf(model.getOperand2()) + "=" + String.valueOf(result));
                default:
                    printMenu();
            }
        }
    }
}
