package Classs15HW;

public class Students {
    /* Create a Class called Students.Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class,Set the value for  studentName , studentID
and increment  the numberOfStudents for each object Print out  total number of students */

    String Name;
    String ID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students student1=new Students();
        student1.Name="Ivana";
        student1.ID="I23456";
        numberOfStudents++;

        Students student2=new Students();
        student2.Name="John";
        student2.ID="J456789";
        numberOfStudents++;

        Students student3=new Students();
        student3.Name="Maria";
        student3.ID="M147896";
        numberOfStudents++;

        System.out.println(numberOfStudents);
    }
}
