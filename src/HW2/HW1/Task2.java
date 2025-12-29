package HW2.HW1;

import java.util.*;

public class Task2 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int count = input.nextInt();
    String name = "";
    String word = "";

    int maxKey = -1;
    String maxWord = "";

    List<Map.Entry<String, String>> pairs = new ArrayList<>();
    for(int i = 0; i < count; i++) {
      name = input.next();
      word = input.next();
      pairs.add(new AbstractMap.SimpleEntry<>(name, word));
    }

    Map<String,Integer> map = new HashMap<>();
    for(Map.Entry<String, String> s : pairs) {
      if(!map.containsKey(s.getValue())) {
        map.put(s.getValue(), 1);
      } else{
        map.put(s.getValue(), map.get(s.getValue()) + 1);
      }
    }

    for(Map.Entry<String,Integer> mapa : map.entrySet()) {
      if(mapa.getValue() > maxKey) {
        maxKey = mapa.getValue();
        maxWord = mapa.getKey();
      }
    }

    System.out.println(maxKey);

    for(Map.Entry<String, String> s : pairs) {
      if(s.getValue().equals(maxWord)) {
        System.out.println(s.getKey());
      }
    }
  }
}
