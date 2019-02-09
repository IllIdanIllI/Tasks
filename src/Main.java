import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        int decimalCode = 87;
        StringBuilder binaryCode = new StringBuilder();
        while (decimalCode > 0) {
            binaryCode.append(String.valueOf(decimalCode % 2));
            decimalCode /= 2;
        }
        while (binaryCode.length() % 8 != 0) {
            binaryCode.insert(0,0);
        }
        System.out.println(binaryCode+"first");
        String temp = binaryCode.toString().replace("1","2").replace("0","1").replace("2","0");
        binaryCode.setLength(0);
        System.out.println(binaryCode.append(temp.substring(0,temp.length()-1)).insert(binaryCode.length(),1));
    }
}
