package Appu;

import java.util.*;
import java.util.Map.Entry;

public class ExampleMap {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++)
        {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i])+1);
            }
            else
            {
                map.put(arr[i], 1);                
            }
        }

        int maxValue = Collections.max(map.values());
        int count = 0;
        System.out.println(map.entrySet());
        for (Entry<Integer, Integer> entryMap : map.entrySet())
        {
            if (entryMap.getValue() == maxValue) {
                count += 1;
            }
        }
        System.out.println(count);
    }
}
