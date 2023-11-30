package Problems;

public class MergeStrings {
	class Solution {
	    public String mergeAlternately(String word1, String word2) {
	       int n1=word1.length();
	       int n2=word2.length();
	       int point1=0;
	       int point2=0;
	       StringBuilder result=new StringBuilder();

	       while(point1 < n1 || point2 < n2){
	           if(point1<n1){
	               result.append(word1.charAt(point1));
	               point1++;
	           }
	           if(point2<n2){
	               result.append(word2.charAt(point2));
	               point2++;
	           }
	       }

	       return result.toString();
	    }
	}
}
