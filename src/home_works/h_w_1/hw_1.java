package home_works.h_w_1;

import java.util.Arrays;

public class hw_1 {

    public static void main(String[] args) {
        // String x = mergeAlternately("afgdsf", "qwe"); // h_w_1_1
        // System.out.println(x);

        // var numsEx = removeElement(nums, 3);
        // System.out.println(numsEx);

        // int[] nums1 = { -1, 0, 1, 1, 0, 0, 0, 0, 0 };
        // int[] nums2 = { -1, 0, 2, 2, 3 };
        // int m = 4;
        // int n = 5;

        // int[] nums1 = { 1 };
        // int[] nums2 = {};
        // int m = 1;
        // int n = 0;

        // int[] nums1 = { 0 };
        // int[] nums2 = { 1 };

        // int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        // int[] nums2 = { 2, 5, 6 };

        // System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));
        // System.out.println(Arrays.toString(rightShiftByIndex(nums1, 2)));
        // String s = " the sky is blue ";
        // System.out.println(reverseWords(s));
        // String s = "A man, a plan, a canal: Panama";

        // String s = "_";
        // System.out.println(isPalindrome(s));
    }

    public static String mergeAlternately(String word1, String word2) {
        /*
         * You are given two strings word1 and word2. Merge the strings by adding
         * letters in alternating order, starting with word1. If a string is longer than
         * the other, append the additional letters onto the end of the merged string.
         * Return the merged string.
         */
        StringBuilder wordOne = new StringBuilder();
        StringBuilder wordTwo = new StringBuilder();
        StringBuilder wordOut = new StringBuilder();
        wordOne.append(word1);
        wordTwo.append(word2);

        for (int i = 0; i < wordOne.length() + wordTwo.length(); i++) {

            if (i < wordOne.length()) {
                wordOut.append(wordOne.charAt(i));
            }
            if (i < wordTwo.length()) {
                wordOut.append(wordTwo.charAt(i));
            }

        }
        return wordOut.toString();
    }

    public static int removeElement(int[] nums, int val) {
        /*
         * Given an integer array nums and an integer val, remove all occurrences of val
         * in nums in-place. The relative order of the elements may be changed.
         * 
         * Since it is impossible to change the length of the array in some languages,
         * you must instead have the result be placed in the first part of the array
         * nums. More formally, if there are k elements after removing the duplicates,
         * then the first k elements of nums should hold the final result. It does not
         * matter what you leave beyond the first k elements.
         * 
         * Return k after placing the final result in the first k slots of nums.
         * 
         * Do not allocate extra space for another array. You must do this by modifying
         * the input array in-place with O(1) extra memory.
         * 
         * Custom Judge:
         * 
         * The judge will test your solution with the following code:
         */
        int temp = 0;
        int count = 0;
        for (int j = 0; j < nums.length; j++) {

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == val) {
                    temp = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = temp;
                }
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != val) {
                count++;
            }
        }
        // System.out.println(Arrays.toString(nums));
        return count;
    }

    public static int[] merge(int[] nums1, int m, int[] nums2, int n) {
        /*
         * You are given two integer arrays nums1 and nums2, sorted in non-decreasing
         * order, and two integers m and n, representing the number of elements in nums1
         * and nums2 respectively.
         * 
         * Merge nums1 and nums2 into a single array sorted in non-decreasing order.
         * 
         * The final sorted array should not be returned by the function, but instead be
         * stored inside the array nums1. To accommodate this, nums1 has a length of m +
         * n, where the first m elements denote the elements that should be merged, and
         * the last n elements are set to 0 and should be ignored. nums2 has a length of
         * n.
         */

        int k = 0;
        int mTemp = m;
        for (int i = 0; i < nums1.length; i++) {
            if (k < nums2.length) {
                if (nums1[i] < nums2[k] && i < mTemp) {
                    continue;
                }
                if (nums1[i] >= nums2[k] || i >= mTemp) {
                    rightShiftByIndex(nums1, i);
                    nums1[i] = nums2[k];
                    mTemp++;
                    k++;
                }
            }
        }

        return nums1;
    }

    public static int[] rightShiftByIndex(int[] arr, int index) {

        for (int i = arr.length - 2; i >= index; i--) {
            int temp = 0;
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        return arr;
    }

    public static String reverseWords(String s) {
        StringBuilder words = new StringBuilder();
        words.append(s);
        while (words.charAt(0) == ' ') {
            words.deleteCharAt(0);
        }
        while (words.charAt(words.length() - 1) == ' ') {
            words.deleteCharAt(words.length() - 1);
        }
        while (words.indexOf("  ") != -1) {
            words.deleteCharAt(words.indexOf("  "));
        }
        int countSpaces = 0;
        for (int i = 0; i < words.length(); i++) {
            if (words.charAt(i) == ' ') {
                countSpaces++;
            }
        }

        int count = 0;
        int indexStartWord = 0;
        int i = 0;

        int[] placeSpace = new int[countSpaces];

        while (i < countSpaces) {
            while (words.charAt(words.length() - 1) != ' ') {
                words.insert(indexStartWord, words.charAt(words.length() - 1));
                words.deleteCharAt(words.length() - 1);
                count++;
            }
            if (words.charAt(words.length() - 1) == ' ') {
                words.deleteCharAt(words.length() - 1);
            }
            indexStartWord = count;
            placeSpace[i] = indexStartWord;
            i++;
        }
        for (int j = placeSpace.length - 1; j >= 0; j--) {
            words.insert(placeSpace[j], " ");
        }
        return words.toString();
    }

    public static boolean isPalindrome(String s) {
        /*
         * A phrase is a palindrome if, after converting all uppercase letters into
         * lowercase letters and removing all non-alphanumeric characters, it reads the
         * same forward and backward. Alphanumeric characters include letters and
         * numbers.
         * 
         * Given a string s, return true if it is a palindrome, or false otherwise.
         */

        boolean isTrue = true;
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            while (!Character.isLetterOrDigit(s.charAt(i)) && i < j) {
                i++;
            }
            while (!Character.isLetterOrDigit(s.charAt(j)) && i < j) {
                j--;
            }
            if (Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
            i++;
            j--;
        }

        return isTrue;
    }
}
