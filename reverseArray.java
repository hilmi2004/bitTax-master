import java.lang.reflect.Array;

public class reverseArray {

    public static void  eArray(char [] A, int i, int j) {
        if (i < j) {
            // Swap elements at indices i and j
            char temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            
            // Recursively call reverseArray with updated indices
                eArray(A, i + 1, j - 1);
        }
    }

    public static void main(String[] args) {
        char [] array = {'h','i','l','m','i'};
        int startIndex = 0; 
        int endIndex = array.length-1;   

        
        System.out.println("Original Array:");
        for (char item : array) {
            System.out.print(item + " ");
        }
        System.out.println();

        
            eArray(array, startIndex, endIndex);
        String sum="";
        
        System.out.println("Reversed Array:");
        for (char item : array) {
            sum+=item;
        }
        System.out.println(sum);
    }
}
