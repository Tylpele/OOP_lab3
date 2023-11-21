import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] numerals = {-2, 3,0, -3,4, 5, -3, -4, -5, 5,0, -23, 3, 9};
        int sizeList= numerals.length;
        List<Integer> numeralList= new LinkedList<>();
        for(int i =0; i<sizeList; i++){
            numeralList.add(numerals[i]);
        }
        List<Integer> sortedList = sortList(numeralList);
        System.out.print("Отсотированный список: \n" + sortedList);


    }

    public static List<Integer> sortList(List<Integer> numeralList){

        int left =0, right = numeralList.size()-1;
        while (left != right){
            if(numeralList.get(left)<0 && numeralList.get(right)>=0){
                int temp = numeralList.get(left);
                numeralList.set(left, numeralList.get(right));
                numeralList.set(right, temp);
                left++;
                right--;
            }
            else {
              if(numeralList.get(left)>=0){
                  left++;
              }
                if(numeralList.get(right)<0){
                    right--;
                }
            }
        }
        return numeralList;
    }
}