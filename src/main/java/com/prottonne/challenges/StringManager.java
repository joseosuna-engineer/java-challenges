/*
 * MIT License
 *
 * Copyright (c)  2021 Jose Osuna
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

package com.prottonne.challenges;

import java.util.*;

public class StringManager {
    public static void main(String[] args) {
        String myString = "This is my String!";
        List<String> stringList = List.of(myString);

        int myStringLength = myString.length();
        int arrayStringLength = args.length;
        int listStringLength = stringList.size();

        System.out.println("myStringLength: " + myStringLength);
        System.out.println("arrayStringLength: " + arrayStringLength);
        System.out.println("listStringLength: " + listStringLength);

        subStringComparison(null, 3);
        subStringComparison("", 3);
        subStringComparison("welcometojava", 0);
        subStringComparison("welcometojava", 14);
        subStringComparison("welcometojava", 13);
        subStringComparison("welcometojava", 1);

        subStringComparison("welcometojava", 3);

        printMaxMinSubstring("welcometojava", 3);

        allSorted("welcometojava", 3);

        System.out.println("ALLA is palindrome? :" + isPalindrome("ALLA"));
        System.out.println("madam is palindrome? :" + isPalindrome("madam"));


    }

    private static boolean isPalindrome(String stringInput) {
        //performs n/2
        int n = stringInput.length();
        for (int i = 0; i < n / 2; ++i) {
            if (stringInput.charAt(i) != stringInput.charAt(n - i - 1)) return false;
        }
        return true;

    }

    private static void subStringComparison(String originalString, int subStrSize) {
        if (!isNullOrEmpty(originalString) && !isOutOfBounds(subStrSize, originalString)) {
            List<String> stringList = split(originalString, subStrSize);
            order(stringList);
            System.out.println(stringList.get(0));
            System.out.println(stringList.get(stringList.size() - 1));

        } else {
            System.out.println("Input String is null or empty! or Array is out of bounds");
        }
    }

    private static void order(List<String> unorderedList) {
        unorderedList.sort(Comparator.naturalOrder());
    }

    private static boolean isOutOfBounds(int subStrSize, String originalString) {
        return subStrSize < 1 || originalString.length() < subStrSize;
    }

    private static boolean isNullOrEmpty(String originalString) {
        return null == originalString || originalString.isEmpty();
    }

    private static List<String> split(String originalString, int subStrSize) {
        int stringSize = originalString.length();
        List<String> splitList = new ArrayList<>();
        if (stringSize <= subStrSize) {
            splitList.add(originalString);
        } else {
            for (int idx = 0; idx + subStrSize <= stringSize; idx++) {
                splitList.add(originalString.substring(idx, idx + subStrSize));
            }
        }
        return splitList;
    }

    private static void printMaxMinSubstring(String s, int size) {
        int length = s.length();
        if (!s.isEmpty() && length >= size) {
            String min = s;
            String max = "";
            for (int i = 0; size + i <= length; i++) {

                String tempString = s.substring(i, size + i);

                if (min.compareTo(tempString) > 0) min = tempString;
                if (max.compareTo(tempString) < 0) max = tempString;
            }
            System.out.println(min);
            System.out.println(max);
        } else {
            System.out.println(s);
        }

    }

    private static void allSorted(String str, int k) {
        SortedSet<String> sets = new TreeSet<>();
        for (int i = 0; i <= str.length() - k; i++) {
            sets.add(str.substring(i, i + k));
        }
        System.out.println(sets.first());
        System.out.println(sets.last());
    }


}
