package PracticeDSA;

import java.util.*;

public class PhoneKeypadProblem {

    public static void main(String[] args) {
        Map<Character,String> map = new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        String input = "23";
        List<String> list = new ArrayList<>();
         solveProblem(map,"",input,1);
//        Iterator<String> itr = list.iterator();
//        while (itr.hasNext()){
//            System.out.println(itr.next());
//        }
    }

    public static void solveProblem(Map<Character,String>map,String output,String input,int index){
        if(index>2){
            System.out.println(output);
            return ;
        }
        Character c = input.charAt(0);
        String s = map.get(c);
        System.out.println(output);
        String op1 = output+s.charAt(0);
        String op2 = output+s.charAt(1);
        String op3 = output+s.charAt(2);
//        list.add(op1);
//        list.add(op2);
//        list.add(op3);
       String input1 = input.substring(1);
        solveProblem(map,op1,input1,index+1);
        solveProblem(map,op2,input1,index+1);
        solveProblem(map,op3,input1,index+1);
    }
}
