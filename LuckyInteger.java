import java.util.HashMap;
// Lucky Integer is an integer which has a frequency in the array equal to its value.
public class LuckyInteger {
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 3};
        HashMap <Integer,Integer> freqMap = new HashMap<>();
        for(int i : arr){
            freqMap.put(i,freqMap.getOrDefault(i,0)+1);
        }
        int luckyCount = -1;
        for(int key : freqMap.keySet()){
            if(freqMap.get(key) == key){
                luckyCount = key;
            }
        }
        System.out.println(luckyCount);
    }
}
