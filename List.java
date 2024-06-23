import java.util.*;


public class List {
    public static void main(String[] args){
        System.out.println("starting");
        java.util.List<String> li = new ArrayList<>();
        li.add("pappu");
        li.add("Ankit");
        li.add("Suraj");

        //using for loop
        System.out.println("_________________________for loop________________");


        for(int i=0;i< li.size();i++){
            System.out.println(li.get(i));
        }

        //using for each loop
        System.out.println("_________________________for each________________");


        for(String i: li){
            System.out.println(i);
        }

        // using iterator
         System.out.println("_________________________Iterator________________");
        Iterator<String> it = li.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }


        System.out.println("_________________________List Iteraror________________");
        //List Iterator

        ListIterator<String> it2 = li.listIterator(li.size());
        while(it2.hasPrevious()){
            System.out.println(it2.previous());
        }


    }
}
