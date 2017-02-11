import java.util.*;

/**
 * Created by anshu on 11/02/17.
 */
public class RookieRank2_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            int a = scan.nextInt();
            if(map.keySet().contains(a)){
                map.put(a,map.get(a)+1);
            }
            else
                map.put(a,1);
        }
        TreeMap<Integer, Integer> map2 = new TreeMap<>(map);
        map = sortByValues(map2);
        System.out.print(map.keySet().iterator().next());


    }
    private static HashMap sortByValues(TreeMap<Integer,Integer> map) {
        List list = new LinkedList(map.entrySet());
        // Defined Custom Comparator here
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o2)).getValue())
                        .compareTo(((Map.Entry) (o1)).getValue());
            }
        });

        // Here I am copying the sorted list in HashMap
        // using LinkedHashMap to preserve the insertion order
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }

}
