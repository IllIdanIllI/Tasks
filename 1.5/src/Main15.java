public class Main15 {
    public static void main(String[] args) {
        int number = 345636;
        System.out.println("Арифметика: "+arithmeticAverage(number)
                +"\nГеометрия: "+geometricAverage(number));
    }

    private static double arithmeticAverage(int number) {
        String[] temp = String.valueOf(number).split("");
        int sum = 0;
        for (String s : temp) {
            sum += Integer.parseInt(s);
        }
        return sum / temp.length;
    }

    private static double geometricAverage(int number) {
        String[] temp = String.valueOf(number).split("");
        int multiplication = 1;
        for (String s : temp) {
            multiplication*=Integer.parseInt(s);
        }
        return Math.pow(multiplication,(1/temp.length));
    }
}
