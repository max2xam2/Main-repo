package HW2.HW1;

import java.util.*;

public class Task1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int count = input.nextInt();
    List<String> listString = new ArrayList<>();
    String maxWord = "";
    int maxKey = -1;

    for(int i = 0; i < count; i++){
      listString.add(input.next());
    }

    Map<String,Integer> map = new HashMap<>();
    for(String s : listString) {
      if(!map.containsKey(s)) {
        map.put(s, 1);
      } else{
        map.put(s, map.get(s) + 1);
      }
    }

    for(Map.Entry<String,Integer> mapa : map.entrySet()) {
      if(mapa.getValue() > maxKey) {
        maxKey = mapa.getValue();
        maxWord = mapa.getKey();
      }
    }

    System.out.println("Max word: " + maxWord + " count: " + maxKey);

    input.close();
  }
}
