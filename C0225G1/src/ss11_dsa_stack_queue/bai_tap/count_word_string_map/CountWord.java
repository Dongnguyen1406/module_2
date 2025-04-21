package ss11_dsa_stack_queue.bai_tap.count_word_string_map;

import java.util.Map;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        String str = "Dong binh Chung khanh Dong binh Chung khanh Dong binh Chung khanh".toLowerCase();
        String[] list = str.split(" ");
        
        Map<String, Integer> map = new TreeMap<String, Integer>();
        
        for (int i = 0; i < list.length; i++){
            if(map.containsKey(list[i])){
                map.put(list[i], map.get(list[i]) + 1);
            } else {
                map.put(list[i], 1);
            }
        }
        
        for (String key : map.keySet()){
            Integer value = map.get(key);
            System.out.println("Từ " + key + " có số lần xuất hiện là: " + value);
        }
        
        }
    }

