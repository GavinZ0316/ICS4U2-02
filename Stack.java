/**********************************************************************
 * My Daily assingment2-02
 * Created by: Gavin Zhou 
 * Created on: Mar 2018
 * This class create an integer stack
 **********************************************************************/

public class Stack{
     public static void main(String[] args) {

     	   MrCoxallStack myNewStack;
         myNewStack = new MrCoxallStack();
         int xxx;
         String yyy;
         
     	   myNewStack.push("Hello World");
         myNewStack.push("Bye!");
         myNewStack.push("Hi");

     	   
         System.out.println(""); 
         
         xxx = myNewStack.count();
         System.out.println(xxx);
         
         yyy = myNewStack.pop();
         System.out.println(yyy);

         xxx = myNewStack.count();
         System.out.println(xxx);         
         
     }
}
