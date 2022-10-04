public class Teglalap extends Sokszog {
    private double b;

    public Teglalap(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getK() {
        return 2*(this.getA()+this.b);
    }

    public double getT() {
        return this.getA()*this.b;
    }
}