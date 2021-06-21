package experiment1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
Print Duplicate Elements Of An Array
input = 1 8 1 2 5 7 9 8 1 9
ouput = 1 8 9

 */
public class ArrayProces {

    public static void main(String[] args) {
        int[] arr={1,8,1,9,2,3,8,6,9,1};
        System.out.println(Arrays.toString(arr));
        ArrayProces obj = new ArrayProces();
        obj.printDuplicate(arr);
    }

    public void printDuplicate(int[] arr){
        Set<Integer> set = new HashSet<>();
        Set<Integer> printed = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            boolean isAdded= set.add(arr[i]); //O(n) --> Complexitiy of add method
            if (!isAdded){
                boolean isPrinted = printed.add(arr[i]);
                if (isPrinted){
                    System.out.print(arr[i] + ",");
                }
            }

        }
    }
}
