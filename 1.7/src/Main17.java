public class Main17 {
    public static void main(String[] args) {
        int firstVariable = 3, secondVariable = 7;
        changePosition(firstVariable,secondVariable);
    }
    private static void changePosition(int firstVariable,int secondVariable){
        System.out.println("Первая переменная: "+firstVariable
                +"\nВторая переменная: "+secondVariable+"\n");
        firstVariable=firstVariable+secondVariable;
        secondVariable = firstVariable-secondVariable;
        firstVariable=firstVariable-secondVariable;
        System.out.println("Первая переменная: "+firstVariable
                +"\nВторая переменная: "+secondVariable);
    }
}
