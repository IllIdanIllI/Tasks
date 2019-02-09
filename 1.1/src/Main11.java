class Main11 {
    public static void main(String []args){
        int numberOne = 1,numberTwo=2,numberThree = 2;
        if(numberOne==numberTwo&&numberThree==numberTwo){
            System.out.println("Все равны");
        } else if(numberOne!=numberTwo&&numberThree!=numberTwo&&numberOne!=numberThree){
            System.out.println("Все не равны");
        } else {
            System.out.println("Что-то равно");
        }
    }
}
