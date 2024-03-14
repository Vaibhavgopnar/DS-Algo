import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RelativeSorting {
    public static void main(String[] args) {
        
        Integer arr1[] = {2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8};
        Integer arr2[] = {2, 1, 8, 3};

        relativeSort(arr1, arr2);
    }

    private static void relativeSort(Integer arr1[], Integer[] arr2) {

        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = Arrays.asList(arr1);
        List<Integer> remaining = new ArrayList<>();

        for(int i = 0; i < arr1.length; i++){
            map.put(list.get(i), map.getOrDefault(list.get(i), 0) +1);
        }
        int index = 0;
        for(int i = 0; i < arr2.length; i++){
            for(int j = 0; j < map.get(arr2[i]); j++) {
            	System.out.print(arr2[i]+" ");
            arr1[index] = arr2[i];
            index++;
            }
            map.remove(arr2[i]);
        }

        for(int k : map.keySet()){
            for(int j = 0; j < map.get(k); j++) {
            	System.out.print(k+" ");
            remaining.add(k);
            }
        }
        Collections.sort(remaining);
        for(int element : remaining)
        arr1[index++] = element;
    System.out.println();
        for(int i = 0; i< arr1.length; i++){
            System.out.print(arr1[i]+" ");
        }

    }
}
