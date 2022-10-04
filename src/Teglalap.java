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

    @Override
    public String toString() {
        return String.format("Téglalap: a = %f - b = %f - K = %f - T = %f", this.getA(), this.b,this.getK(),this.getT());
    }
}
