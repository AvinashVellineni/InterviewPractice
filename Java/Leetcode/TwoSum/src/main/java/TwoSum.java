
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class TwoSum {
    public static void main(String[] args){
          int[] inputSet = {3,3};
          Consumer<Integer> consumer = (element) -> System.out.println(element);
          int[] outputArray =getTwoSum(inputSet,consumer,6);
          for(int element: outputArray){
              consumer.accept(element);
          }
    }
    public static int[] getTwoSum(int[] inputSet, Consumer<Integer> consumer, Integer target){
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i< inputSet.length; i++){
            if(map.containsKey(target-inputSet[i])){
                return new int[] {map.get(target-inputSet[i]),i};
            }
            map.put(inputSet[i],i);
        }
        return new int[] {};
    }
}
