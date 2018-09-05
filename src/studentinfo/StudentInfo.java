
package studentinfo;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class StudentInfo {

    
    public static void main(String[] args) {

        Scanner forString = new Scanner(System.in);
        Scanner forInt = new Scanner(System.in);

        File fileName = new File("StudentInformation.txt");
        ArrayList<Student> a = new ArrayList<Student>();

        String name = "", address = "", dept = "";
        int id = 0;

        int j = 0;
        int n = 0;

        String pos1 = "";

        System.out.println("Enter number of students");
        n = forInt.nextInt();

        for (j = 1; j <= n; j++) {

            if (j == 1) {
                pos1 = "st";
            } else if (j == 2) {
                pos1 = "nd";
            } else if (j == 3) {
                pos1 = "rd";
            } else {
                pos1 = "th";
            }

            System.out.println("Enter " + j + pos1 + " student's ID");
            id = forInt.nextInt();
            System.out.println("Enter " + j + pos1 + " student's name ");
            name = forString.nextLine();
            System.out.println("Enter " + j + pos1 + " student's address ");
            address = forString.nextLine();
            System.out.println("Enter " + j + pos1 + " student's depertment name ");
            dept = forString.nextLine();

            Student s = new Student();

            s.SetStudnetId(id);
            s.SetStudnetName(name);
            s.SetStudnetDept(dept);
            s.SetStudnetAddress(address);

            a.add(s);

        }

        System.out.println("******************Result******************");
        System.out.println("__________________________________________");
        System.out.println("| S No |  ID  |  Name  |  Dept  | Address|");
        System.out.println("|________________________________________|");

        Iterator it = a.iterator();
        int i = 0;
        String pos = "";

        while (it.hasNext()) {

            Student st = (Student) it.next();

            i = i + 1;

            if (i == 1) {
                pos = "st";
            } else if (i == 2) {
                pos = "nd";
            } else if (i == 3) {
                pos = "rd";
            } else {
                pos = "th";
            }

            System.out.println("|" + i + pos + "  |  " + st.GetStudnetId() + "  |  " + st.GetStudnetName() + " |   " + st.GetStudnetDept() + " |  " + st.GetStudnetAddress() + " |");

        }
        System.out.println("|________________________________________|");
    }

}
