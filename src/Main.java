public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Haromszog h = new Haromszog();
            System.out.println(h);
        }
        for (int i = 0; i < 5; i++) {
            Paralelogramma p = new Paralelogramma();
            System.out.println(p);
        }
        for (int i = 0; i < 5; i++) {
            Trapez t = new Trapez();
            System.out.println(t);
        }
    }
}