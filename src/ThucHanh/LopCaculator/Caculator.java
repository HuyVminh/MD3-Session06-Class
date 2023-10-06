package ThucHanh.LopCaculator;

public class Caculator {
    double a, b;

    public Caculator() {

    }

    public Caculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double add() {
        return a + b;
    }

    public double sub() {
        return a - b;
    }

    public double multi() {
        return a * b;
    }

    public double div() {
        return a / b;
    }
}
