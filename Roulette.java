import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;



public class Roulette {

    
    
    public static void main(String[] args) 
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        
       
        ArrayList<Integer> weights = new ArrayList<>();
        
         ArrayList<Integer> results = new ArrayList<>();
        
        Collections.addAll(numbers,1,2,3,4,5,6,7,8,9,10);
        Collections.addAll(weights,4,6,45,11,2,5,10,7,9,1);
        
        
        for(int i=0;i<numbers.size();i++)
        {
            for(int j=0;j<weights.get(i);j++)
            {
                results.add(numbers.get(i));
            }
        }
        
       
        
      //  System.out.println(results);
        
     //   Collections.shuffle(results);
      //  System.out.println(results);
        
       int a;
        a= ThreadLocalRandom.current().nextInt(0,100);
        System.out.println(+results.get(a));
        
    }
    
}