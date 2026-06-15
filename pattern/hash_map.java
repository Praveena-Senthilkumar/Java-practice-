import java.util.HashMap;

public class hash_map {
  public static void main(String[] args) {
    HashMap<String, Integer> mark = new HashMap<String, Integer>();
    mark.put("Akash", 25);
    mark.put("Arun", 30);
    System.out.println(mark);

    System.out.println(mark.get("Arun"));
  }
}