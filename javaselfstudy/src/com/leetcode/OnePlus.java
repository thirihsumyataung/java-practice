package com.leetcode;

public class OnePlus {
    public static void main(String[] args) {
        int[] anarray = new int[]{2,4,3,5,1,9};
        int[] result = plusOne(anarray);
       for (int index = 0; index < anarray.length; index++) {
            System.out.print(result[index]);
        }
    }
    public static int[] plusOne(int[] digits) {
        if (digits[0] == 0) {
            int[] answer = new int[digits.length];
            answer[0] = 1;
            return answer;
        }
        else if ( digits.length == 1 && digits[0] == 9) {
            int[] newArray = new int[2];
           // int nextValue = digits[0]++;
            int dividedValue = 1 ; // nextValue / 10;
                int modValue = 0 ; // dividedValue % 10;
                digits[0] = dividedValue;
                newArray[0] = dividedValue;
                newArray[1] = modValue;
                System.arraycopy(digits, 0, newArray, 0, digits.length);
                int[] b = new int[newArray.length];
                for (int i = 0; i < newArray.length; i++) {

                    System.out.println("index" + i + " is " + newArray[i]);
                }
                return newArray;
            }

        if (digits.length == 2 && digits[0] == 9 && digits[0] == 0 ) {
            int[] newArray = new int[2];
            // int nextValue = digits[0]++;
            int dividedValue = 1 ; // nextValue / 10;
            int modValue = 0 ; // dividedValue % 10;
            digits[0] = dividedValue;
            newArray[0] = dividedValue;
            newArray[1] = modValue;
            newArray[2] = 0;
            System.arraycopy(digits, 0, newArray, 0, digits.length);
            int[] b = new int[newArray.length];
            for (int i = 0; i < newArray.length; i++) {

                System.out.println("index" + i + " is " + newArray[i]);
            }
            return newArray;
        }
            for (int index = digits.length - 1; index >= 0; index--) {
                if (digits[index] < 9) {
                    digits[index]++;
                    break;
                }if (digits[digits.length - 1] == 9) {
                    digits[index] = 0 ;
                }
                if (digits[0] == 0) {
                    int[] answer = new int[digits.length];
                    answer[0] = 1;
                    return answer;
                } else if ( digits.length == 1 && digits[0] == 9) {
                    int[] newArray = new int[2];
                    // int nextValue = digits[0]++;
                    int dividedValue = 1 ; // nextValue / 10;
                    int modValue = 0 ; // dividedValue % 10;
                    digits[0] = dividedValue;
                    newArray[0] = dividedValue;
                    newArray[1] = modValue;
                    System.arraycopy(digits, 0, newArray, 0, digits.length);
                    int[] b = new int[newArray.length];
                    for (int i = 0; i < newArray.length; i++) {

                        System.out.println("index" + i + " is " + newArray[i]);

                    }
                    return newArray;
                }


            }
            return digits;
        }

    }

