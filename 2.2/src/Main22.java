public class Main22 {
    public static void main(String[] args) {
        counter(1);
        counter(0);
        counter(250);
        counter(-5);
    }

    private static void counter(int yearQuantity) {
        int headQuantity = 3;
        if (isBetween(yearQuantity, 0, 200)) {
            System.out.println("The Dragon отрастил голов: "
                    + yangDragon(headQuantity, yearQuantity));
        } else if (isBetween(yearQuantity, 200, 300)) {
            System.out.println("The Dragon отрастил голов: "
                    + midleDragon(headQuantity, yearQuantity));
        } else if (yearQuantity > 300) {
            System.out.println("The Dragon отрастил голов: "
                    + oldDragon(headQuantity, yearQuantity));
        } else {
            System.out.println("До рождения the Dragon осталось: "
                    + Math.abs(yearQuantity) + " лет");
        }
    }

    private static int yangDragon(int headQuantity, int yearQuantity) {
        for (int i = 0; i < yearQuantity; i++) {
            headQuantity += 3;
        }
        return headQuantity;
    }

    private static int midleDragon(int headQuantity, int yearQuantity) {
        for (int i = 0; i < 200; i++) {
            headQuantity += 3;
        }
        for (int i = 200; i < yearQuantity; i++) {
            headQuantity += 2;
        }
        return headQuantity;
    }

    private static int oldDragon(int headQuantity, int yearQuantity) {
        for (int i = 0; i < 200; i++) {
            headQuantity += 3;
        }
        for (int i = 200; i < 300; i++) {
            headQuantity += 2;
        }
        for (int i = 300; i < yearQuantity; i++) {
            headQuantity += 1;
        }
        return headQuantity;
    }

    private static boolean isBetween(int x, int lower, int upper) {
        return lower <= x && x <= upper;
    }
}
