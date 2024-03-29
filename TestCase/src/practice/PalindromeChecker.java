package practice;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

import practice.MyList.Node;

public class PalindromeChecker {


		public static boolean isPalindrome(String word) {
			if(word.length()<1)
				return false;
		    boolean isPalindrome = true;
		    if (isPalindrome) {
		        Deque<Character> wordDeque = new LinkedList<>();
		        for (Character c : word.toCharArray()) {
		            wordDeque.add(Character.toLowerCase(c));
		        }
		        while (isPalindrome && wordDeque.size() > 1) {
		            isPalindrome = wordDeque.pollFirst().compareTo(wordDeque.pollLast()) == 0;
		        }
		    }
		    return isPalindrome;
		}
	
	
	 public static void main(String[] args) {
		
	
	boolean rs=isPalindrome("donkey");
	
	System.out.println(rs);
}
}
