package com.leetcode;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        System.out.println("Hello WOrld");
        int[] anarray = new int[]{2, 3, 4, 7, 1};
        int[] result = twoSum(anarray, 9);
        for (int index = 0; index < result.length; index++) {
            System.out.println(result[index]);
        }

    }

    public static int[] twoSum(int[] nums, int target) {
        int[] ans = new int[2];

        // number and it's corresponding index
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int index = 0; index < nums.length; index++) {

            if (!map.containsKey(nums[index])) {

                map.put(target - nums[index], index);

            } else {
                ans[0] = index;
                ans[1] = map.get(nums[index]);
                break;
            }
        }
        return ans;
    }
}
        //int aValue = 0;
        //int differenceNum = 0;
        //int aNum = 0 ;
       // int bNum = 0 ;
       // HashMap <Integer, Integer> array = new HashMap<>();
       /* HashMap <Integer, Integer> anotherMap = new HashMap<>();
        for ( int index = 0 ; index < nums.length  ; index ++) {
            aValue = nums[index];
            array.put(index, aValue);

        }
        System.out.println(array);

        for(int i = 0; i < nums.length; i++){

            Integer diff = (Integer)(target - nums[i]);
            if(array.containsKey(diff)){
                int toReturn[] = {array.get(diff)+1, i+1};
                return toReturn;
            }

            array.put(nums[i], i);

        }

        return null;


        }
        //System.out.println(anotherMap);
        //return new int[] {0, 0};


}

        */
/*
 differenceNum = target - nums[x];
            if ( array.containsKey(differenceNum) ){
                aNum = array.get(differenceNum);
                bNum = nums[x];
                return new int[] {aNum, bNum};
            }  for ( int x = 0 ; x < nums.length ; x ++){
            int aNumber = nums[x];
            for ( int y = x + 1 ; y < nums.length ; y ++) {
                int bNumber = nums[y];
                    if ( target == (nums[x] + nums[y])) {
                        anotherMap.put(aNumber,bNumber);
                    }
            }
            System.out.println(anotherMap);
            if ( target > nums[x]) {
                differenceNum = target - nums[x];
                if ( array.containsKey(differenceNum) ){
                    aNum = array.get(differenceNum);
                    bNum = x;
                    //anotherMap.put(aNum, bNum);
                    return new int[] {aNum, bNum};
                }
            }

 */