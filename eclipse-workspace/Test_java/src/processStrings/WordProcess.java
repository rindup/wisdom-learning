package processStrings;

import java.util.HashMap;

public class WordProcess {

	   private String textString;

	   //Constructor
	   //@param textString		
	   public WordProcess(String textString){
	      this.textString = textString;
	   }
	      
	   // gets the longest and shortest word in a  hashMap
	   public HashMap<String, String> getwordList(){
	       HashMap<String, String> wordList = new HashMap<String, String>();
	       String[] arr=textString.split(" ");
	        int i=0;
	        int maxlength,minlength;
	        maxlength=Integer.MIN_VALUE;
	        minlength=Integer.MAX_VALUE;
	        String largest,smallest;
	        largest = smallest = "";
	        for(i=0;i<arr.length;i++){
	            if(arr[i].length() < minlength){
	                smallest=arr[i];
	                minlength=arr[i].length();
	            } 
	            if(arr[i].length() > maxlength) {
	                largest=arr[i];
	                maxlength=arr[i].length();
	            }
	        }
	        wordList.put("longest",largest);
	        wordList.put("shortest",smallest);
	      return wordList;
	   }   
	}
