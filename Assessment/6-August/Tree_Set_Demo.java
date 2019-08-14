import java.util.Comparator;
import java.util.TreeSet; 
class The_Comparator implements Comparator<String> { 
    public int compare(String str1, String str2) 
    {  
        return str2.length()-str1.length(); 
    } 
} 
   
public class Tree_Set_Demo { 
    public static void main(String[] args) 
    { 
        TreeSet<String> tree_set = new TreeSet<String>(new The_Comparator()); 
    	tree_set.add("asdasd"); 
        tree_set.add("aaaaaaaaaa"); 
        tree_set.add("as"); 
        tree_set.add("das"); 
        tree_set.add("sddddddddddd"); 
        tree_set.add("asd"); 
        System.out.println("Set before using the comparator: "+ 
        tree_set); 
        for (String element : tree_set) 
            System.out.print(element + " "); 
    } 
        
        
   
     
} 