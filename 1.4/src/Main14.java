public class Main14 {
    public static void main(String [] args){
       int number1=1357, number2=7431,number3=2344;

        System.out.println("Первое число: "+check(number1)
                +"\nВторое число: "+check(number2)
                +"\nВторое число: "+check(number3));
    }
    private static String check(int number){
        String[] temp = String.valueOf(number).split("");
        int countUp=0,countDown=0;
        for(int i=1;i<temp.length;i++){
            if(Integer.parseInt(temp[i-1])<Integer.parseInt(temp[i])){
                countUp++;
            }else if(Integer.parseInt(temp[i-1])>Integer.parseInt(temp[i])){
                countDown++;
            }
        }
        if(countUp==temp.length-1){
            return "Возрастание";
        }else if(countDown==temp.length-1){
            return "Убывание";
        }else{
            return "Тут нет последовательности";
        }
    }
}
