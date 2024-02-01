public class Multiple_somme {
    public static void multiple_somme(){
        System.out.println();
    }

    public static int computeMultipleSum (int n){
        int sum = 0;
        while (n > 3){
            sum += n-3;
        }
        while (n > 5){
            sum += n-5;
        }
        while (n > 7){
            sum += n-7;
        }
    return sum;
    }

}
