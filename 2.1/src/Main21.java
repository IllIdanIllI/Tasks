public class Main21 {
    private final static double HALF =0.5;
    private final static int ZERO =0;
    private final static int ONE =1;
    private final static int TWO =2;
    public static void main(String[] args) {
        int[][] points = {{2, 5}, {3, -4}, {1, 4}};
        triangleCheck(lineMeasure(points));
    }

    private static Double[] lineMeasure(int[][] points) {
        Double[] linesLength = new Double[points.length];
        for (int i=0;i< linesLength.length;i++) {
            linesLength[i] = Math.pow(Math.pow(points[i][ZERO], TWO) + Math.pow(points[i][ONE], TWO), HALF);
        }
        return linesLength;
    }

    private static void triangleCheck(Double[] lines) {
        boolean conditionTriangle = lines[ZERO] < lines[ONE] + lines[TWO]
                && lines[ZERO] + lines[ONE] > lines[TWO]
                && lines[ONE] < lines[ZERO] + lines[TWO];
        boolean conditionRightTriangle
                = lines[ZERO]==Math.pow(Math.pow(lines[ONE],TWO)+Math.pow(lines[TWO],TWO),HALF)
                ||lines[ONE]==Math.pow(Math.pow(lines[ZERO],TWO)+Math.pow(lines[TWO],TWO),HALF)
                ||lines[TWO]==Math.pow(Math.pow(lines[ONE],TWO)+Math.pow(lines[ZERO],TWO),HALF);
        if (conditionTriangle) {
            System.out.println("Triangle is exist");
        }else if(conditionRightTriangle){
            System.out.println("This is a right triangle");
        }else{
            System.out.println("This is not a triangle");
        }
    }
}
