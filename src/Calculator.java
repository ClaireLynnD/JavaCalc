public class Calculator {
    private double firstNum;
    private double secondNum;
    public double result;

    public double getFirstNum() {
        return firstNum;
    }

    public void setFirstNum(double firstNum) {
        this.firstNum = firstNum;
    }

    public double getSecondNum() {
        return secondNum;
    }

    public void setSecondNum(double secondNum) {
        this.secondNum = secondNum;
    }

    public double add() {
        result = firstNum + secondNum;
        return result;
    }

    public double subtract() {
        result = firstNum - secondNum;
        return result;
    }

    public double multiply() {
        result = firstNum * secondNum;
        return result;
    }

    public double divide() {
        try {
            result = firstNum / secondNum;
        }
        catch (ArithmeticException e) {
            System.out.println("Undefined");
        }
        return result;
    }

    public double powerOf() {
        result = Math.pow(firstNum, secondNum);
        return result;
    }
}

