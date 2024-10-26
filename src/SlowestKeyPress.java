import java.util.ArrayList;
import java.util.List;

public class SlowestKeyPress {
    public static void main(String[] args) {

        List<List<Integer>> keyTimes = new ArrayList<>();

        List<Integer> innerList1 = List.of(0, 2);
        List<Integer> innerList2 = List.of(1, 5);
        List<Integer> innerList3 = List.of(0, 9);
        List<Integer> innerList4 = List.of(2, 15);

        keyTimes.add(innerList1);
        keyTimes.add(innerList2);
        keyTimes.add(innerList3);
        keyTimes.add(innerList4);

        System.out.println(slowestKey(keyTimes));

    }

    public static char slowestKey(List<List<Integer>> keyTimes) {
        int key = 0;
        int time = 0;
        int subtract = 0;
        for (int i = 0; i < keyTimes.size(); i++) {
            if (keyTimes.get(i).get(1) - time > subtract) {
                key = keyTimes.get(i).get(0);
            }
            subtract = keyTimes.get(i).get(1) - time;
            time = keyTimes.get(i).get(1);
            System.out.println("key = " + key + ", time = " + time + ", subtract = " + subtract);
            System.out.println("------------");
        }
        return (char) (key + 'a');
    }

}