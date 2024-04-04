package home_made_07;

public class CalculatorModel {
    private double operand1;
    private double operand2;
    private String operator;

    // Конструктор по умолчанию
    public CalculatorModel() {
        operand1 = 0;
        operand2 = 0;
        operator = "";
    }

    // Методы для установки операндов и оператора
    public void setOperand1(double operand1) {
        this.operand1 = operand1;
    }

    public void setOperand2(double operand2) {
        this.operand2 = operand2;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    // Метод для выполнения операции и возврата результата
    public double calculate() {
        double result = 0;
        switch (operator) {
            case "+":
                result = operand1 + operand2;
                break;
            case "-":
                result = operand1 - operand2;
                break;
            case "*":
                result = operand1 * operand2;
                break;
            case "/":
                if (operand2 != 0) {
                    result = operand1 / operand2;
                } else {
                    System.out.println("Ошибка: Деление на ноль");
                }
                break;
            default:
                System.out.println("Ошибка: Недопустимый оператор");
        }
        return result;
    }

    public double getOperand1() {
        return operand1;
    }

    public double getOperand2() {
        return operand2;
    }

    public String getOperator() {
        return operator;
    }
}
