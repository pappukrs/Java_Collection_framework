package HASHMAP;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashing {
    public static void main(String[] args){
        System.out.println("HASHMAP");
        //Country(Key) , Population(value)
        HashMap<String,Integer> map =  new HashMap<>();

        //Insertion

        map.put("India",120);
        map.put("Us",100);
        //  map.put("China",150);
        map.put("China",180);
        System.out.println(map);




        //search operation and get null or value
        if(map.containsKey("India")){

            System.out.println("Key is present in map "+ map.get("India"));
        }
        else{
            System.out.println("Not present in map");
        }

        //iteration

        System.out.println("_________________Println______________");

        for ( Map.Entry<String,Integer> e: map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }


        //using set
        Set<String> keys = map.keySet();
        for (String key : keys ){
            System.out.println(key + " "+map.get(key));
        }

        //for delete
        map.remove("China");
        System.out.println(map);

    }


}
