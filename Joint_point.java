public class Joint_point {
    public static void joint_point(){
        System.out.println();
    }

    public static int computeJoinpoint(int s1, int s2 ){
        while (s1 != s2){
            if (s1<s2){
                s1  = nextNumber(s1);
            } else {
                s2 = nextNumber(s2);
            }
        }
        return s1 ;
    }

    public static int nextNumber(int n){
        int sum = n;
        while (n != 0) {
            sum += n % 10;
            n = n / 10;
        }
    return sum;
    }

    }
