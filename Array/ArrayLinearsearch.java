import java.util.*;

public class ArrayLinearsearch {
    public static int linearsearch(String[] menu, String key){
        for(int i=0; i<menu.length; i++){
            if(menu[i].equals(key)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        // int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
        String menu[] = {"dosa","itali","samosa","khamand","pani-puri","sandwich"};
        String key = "samosa";

        int index = linearsearch( menu, key);
        if(index == -1){
            System.out.println("not found");
        }else{
            System.out.println("key is at index : " + index);
        }

    }
}
