

package studentarray;

import java.util.Scanner;
/**
 *This class +++ Insert class description here +++
 * 
 * @author Guntaas Kaur
 */
public class StudentArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student s1= new Student();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Name : ");
        s1.setName(input.nextLine());
        System.out.println("name: " + s1.getName());
       
    }

}
