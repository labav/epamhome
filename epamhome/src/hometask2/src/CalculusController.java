package hometask2.src;

/**
 * Created by Doomsday Device on 28.08.2017.
 */
public class CalculusController{
    public double doTheCalculation(int option, double arg_1, double arg_2) {
        double result = 0;
        switch (option) {
            case 1:
                Plus plus = new Plus();
                result = plus.operation(arg_1, arg_2);
                break;
            case 2:
                Minus minus = new Minus();
                result = minus.operation(arg_1, arg_2);
                break;
            case 3:
                Multiply multiply = new Multiply();
                result = multiply.operation(arg_1, arg_2);
                break;
            case 4:
                Divide divide = new Divide();
                result = divide.operation(arg_1, arg_2);
                break;
            default:
                break;
        }
        return result;
    }

}

interface Operation {
    double operation(double arg_1, double arg_2);
}

class Plus implements Operation{
    @Override
    public double operation(double arg_1, double arg_2) {
        return arg_1 + arg_2;
    }
}

class Minus implements Operation{
    @Override
    public double operation(double arg_1, double arg_2) {
        return arg_1 - arg_2;
    }
}

class Multiply implements Operation{
    @Override
    public double operation(double arg_1, double arg_2) {
        return arg_1 * arg_2;
    }
}

class Divide implements Operation{
    @Override
    public double operation(double arg_1, double arg_2) {
        return arg_1 / arg_2;
    }
}