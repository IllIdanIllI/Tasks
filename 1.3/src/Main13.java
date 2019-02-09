class Main13 {
    private final static double PI = 3.14;

    public static void main(String[] args) {
        int R1 = 5, R2 = 2;
        Main13 obj = new Main13();
        if (R1 > R2) {
            System.out.println("Площадь: " + obj.square(R1, R2));
        } else {
            System.out.println("Не соответствует условию");
        }

    }

    private double square(int R1, int R2) {
        double bigSquare = Math.pow(R1, 2) * PI;
        double smallSquare = Math.pow(R2, 2) * PI;
        return bigSquare - smallSquare;
    }
}