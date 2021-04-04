public class demo {
    static boolean checknguyento(int number){
        boolean check = true;
        if(number <= 2){
            check = false;
        }
        else {
            for (int i = 2; i <= Math.sqrt(number); i++){
                if(number%i==0){
                    check = false;
                }
            }
        }
        return check;
    }
    public static void main(String[] args) {
        for (int number = 0; number < 100; number++){
            if (checknguyento(number)){
                System.out.println(number);
            }
        }
    }
}
