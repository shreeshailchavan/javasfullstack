import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Pred{
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        List<Integer> l1 = list.stream().filter(isEven()).collect(Collectors.toList());
        List<Integer> transformed = list.stream().map( i -> apply(i)).collect(Collectors.toList());
        System.out.println(Arrays.toString(transformed.toArray()));
        System.out.println(Arrays.toString(l1.toArray()));
 
    }

   public static Integer apply(Integer i){
    return i*2;
   }

   public static Predicate<Integer> isEven(){
    return i -> i%2 == 0;
   }
}