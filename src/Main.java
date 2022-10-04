public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Haromszog h = new Haromszog();
            System.out.println(h);
        }
        for (int j = 0; j < 5; j++) {
            Double a = Math.random() * 10 + 5;
            Double b = Math.random() * 10 + 5;
            System.out.println(new Teglalap(a, b));
        }
    }
}