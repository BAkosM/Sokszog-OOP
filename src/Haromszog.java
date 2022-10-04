public class Haromszog extends Sokszog{
    private double b;
    private double c;

    public Haromszog(double a, double b, double c){
        super(a);
        this.b = b;
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    private boolean isSzerkezthető(){
        boolean szerkeztheto = true;
        if(this.getA()+this.b <= this.c || this.getA()+this.c <= this.b || this.b + this.c <= this.getA()){
            szerkeztheto = false;
        }
        return szerkeztheto;
    }

    public double getK() {
        return this.getA()+this.b+this.c;
    }
    
    private double getS() {
        return this.getK() /2;
    }
    public double getT() {
        return Math.sqrt(this.getS() * (this.getS() - this.getA()) * (this.getS() - this.b) * (this.getS() - this.c));
    }

    @Override
    public String toString() {
        return super.toString();
    }
}