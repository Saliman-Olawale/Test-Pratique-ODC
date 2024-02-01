public class Calcul_elements_tab {
    public static void calcul_elements_tab(){
        System.out.println();
    }
    // array [23, 45, 34, 67]
    public static int calc(int [] array, int n1, int n2 ){
        int sum = 0;
        for (int i=0 ; i <= n2 ; i++){
            sum += array[i];
        }
        return sum;
    }

}
