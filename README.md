# WordProcess.java
Created a Java class  WordProcess with a constructor and a method getwordList of return type HashMap
In function getwordList(), the string is split into various tokens using smessage.split("") statement.
The minlength and maxlength variables are initialized to Integer.MAX_VALUE and Integer.MIN_VALUE, respectively.
The loop for(i=0;i<arr.length;i++) is used to iterate through the array of tokens.
The condition if(arr[i].length() < minlength) checks if the current token is the smallest, if it is the minlength and smallest variables are updated accordingly.
The condition if(arr[i].length() > maxlength) checks if the current token is the largest, if it is the maxlength and largest variables are updated accordingly.
"The" and "cow" both are the smallest words since "The" is encountered first, it comes in the output.
Then it return the hashmap as a key, value pair

The Method written in Java is at: eclipse-workspace/Test_java/src/processStrings/WordProcess.java

# WordProcessTest.java
The class  WordProcessTest test for the longest and shortest word in a string and its length. 
So I instantiate MessageUtil class and pass a message to it's constructor and then the method will process and return the hashmap from there..
At present for this test I dont need to have any setup or tear down to do..
My Test will then Assert that I get what is expected both for the longest and shortest words and also verify the length of it.

The JUnit test can be found at:eclipse-workspace/Test_java/test/junitTest/WordProcessTest.java
