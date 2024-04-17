public class PairNums {
    
    public static int[] pairNums(int sum, int[] sequence){
        for (int i = 0; i < sequence.length; i++) {
            for (int j = 0; j < sequence.length; j++) {
                if(sequence[i] - sequence[j] == sum){
                    int[] returnNums = {sequence[i],sequence[j]};
                    return returnNums;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        int[] seq = {1,2,3,4,5};
        int[] x = pairNums(3, seq);
        for (int i : x) {
            System.out.println(i);
        }

    }
}
