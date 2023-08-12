package demo;

import java.util.HashSet;
import java.util.Set;

public class InterviewQuestion {
//    "4 5 6 7 3 6 7 4"
    public static void main(String[] args) {
        String str = "4 5 6 7 3 6 7 4";

        String[] numStrList = str.split(" ");
        Set<Integer> uniqueNums = new HashSet<>();
        int sum = 0;

        for(String numStr: numStrList){
            int num = Integer.parseInt(numStr);
            if(!uniqueNums.contains(num)) {
                sum += num;
                uniqueNums.add(num);
            }else {
                uniqueNums.add(num);
            }
        }
        System.out.println(sum);
    }

//    EmpId
//            FirstName
//    LastName
//            Dept
//    DOB




}
