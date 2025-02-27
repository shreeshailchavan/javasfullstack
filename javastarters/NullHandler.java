package javastarters;
import java.util.*;


public class NullHandler {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("shree", 10);
        map.put("suraj", 20);
        Optional<Integer> marks = Optional.ofNullable(map.get("swarup"));
        if(marks.isPresent())
            System.out.println(marks.get()+" marks ispresent");
        else
            System.out.println("marks got a null value ");
        
    }
}
