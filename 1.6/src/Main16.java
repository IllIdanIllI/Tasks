import java.sql.SQLOutput;

public class Main16 {
    public static void main(String []args){
        int number = 1234567;
        revers(number);
    }
    private static void revers(int number){
        StringBuilder stringBuffer=new StringBuilder(String.valueOf(number));
        System.out.println("Было: "+number
                +"\nСтало: "+stringBuffer.reverse());
    }
}
