/**********************************************************************
 * My Daily assingment2-02
 * Created by: Gavin Zhou 
 * Created on: Mar 2018
 * This class create an integer stack
 **********************************************************************/

import java.util.*;


public class MrCoxallStack{
    ArrayList<String> arrayList = new ArrayList<String>();
     
     public void push(String Input){
         arrayList.add(Input);
         System.out.println(Input);
     }
     
     public int count(){
     
         return arrayList.size();
     }

     public String pop(){
       String tempStack;
       
       tempStack = arrayList.remove(arrayList.size() - 1);
         
         return tempStack;
     }

}
