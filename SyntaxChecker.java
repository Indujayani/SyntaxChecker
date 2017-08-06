import java.util.*;
import java.io.FileReader;

import java.io.IOException;

public class SyntaxChecker{

public static void main(String[] args) throws IOException {

	FileReader reader=new FileReader("source.txt");
	int letter=0;
	Stack<Character> stack = new Stack<Character>();
	boolean result=false;
	int count=0;
			

	while ((letter = reader.read()) != -1) {
		char character=(char)letter;
		count++;
		

	    if(character=='('||character=='['||character=='{'){

			stack.push(character);
			
	    }else if (character == ')') {
    		
              if (stack.isEmpty())  	{
			System.out.println("***Error !!! ( not balanced***");
			result=true;
			}
                if (stack.pop() != '(') {
			 System.out.println("***Error !!! ( not balanced***");
			result=true;
			}
            }else if (character == ']') {

                if (stack.isEmpty())  	{
			System.out.println("***Error !!! [ not balanced***");
			result=true;
			}
                if (stack.peek() != '[') {
			 System.out.println("***Error !!! [ not balanced***");
			result=true;
			}
            }else if (character == '}') {

                if (stack.isEmpty())    {
			System.out.println("***Error !!! { not balanced***");
			result=true;
			}
                if (stack.peek() != '{') {
			 System.out.println("***Error !!! { not balanced***");
			result=true;
			}

            }
	
  
        }

	if(stack.isEmpty()){
		System.out.println("***No Any Syntax Errors***");
		
	}
	

}

}