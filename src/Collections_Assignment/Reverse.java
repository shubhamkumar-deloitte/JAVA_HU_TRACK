package Collections_Assignment;
import  java.util.ArrayList;
import java.util.Collections;
import  java.util.List;
import java.util.Arrays;
public class Reverse {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();

        list.add("HshedIn");
        list.add("by");
        list.add("Deloitte");
        list.add("2022");

        //  METHOD-1 USING A NEW LIST
        //printing the original list
        System.out.println(list);

        //a new list to store the string in reversed order
        List<String>newList=new ArrayList<>();
        //pointer at the last element of the original list
        int j= list.size()-1;

        //adding the last element of the list to the newList and removing the last element from the list
        for(int i=0;i< list.size();i++)
        {
            newList.add(i,list.get(j));

            j--;

        }
        System.out.println(newList);


        //METHOD-2 WITHOUT USING NEW LIST
        List<String> name=new ArrayList<>(Arrays.asList("HashedIn","by","Deloitte","2022"));

        Collections.reverse(name);
        System.out.println(name);

        //METHOD-3 IN-PLACE REVERSE USING FOR LOOP

        List<String>list1=new ArrayList<>(Arrays.asList("HashedIn","by","Deloitte","2022"));
        int listSize=list1.size();
        for(int i=0;i<listSize;i++)
        {
            list1.add(i,list1.remove(listSize-1));
            listSize= list1.size();
        }
        System.out.println(list1);
    }
}
