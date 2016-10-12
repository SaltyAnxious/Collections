/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwproject2;

/**
 *
 * @author gleos
 */
import java.util.Scanner;
import java.util.ArrayList;
public class HWProject2 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String myName = "";
        int i;
        ArrayList<String> myList = new ArrayList();
        System.out.println("Instructions");
        System.out.println("Enter a name into the database and push enter");
        System.out.println("Once you're done entering names type quit and push enter");
        System.out.println("to display the names in the database");
        while(true)
        {
            System.out.println("Enter name into database");
            myName = scan.nextLine();
            if("quit".equals(myName))
            {
                break;
            }
            else
            {
                myList.add(myName);
            }
            
        }
        System.out.println("Stopped entering names into Database.");
        System.out.println("Print contents of Database");
        for(i = 0;i < myList.size();i++)
        {
            System.out.println(myList.get(i));
        }
        
       
    }
    
}
