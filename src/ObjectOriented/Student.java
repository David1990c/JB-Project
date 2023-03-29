package ObjectOriented;

public class Student extends Person {
    public Student(int year, String fname, String lname) {
        int birthYear = year;
        String firstName = fname;
        String lastName = lname;
    }

    public void setDataBase(String nameCourse, int grade) {
        System.out.println("set DB whit parameters " + nameCourse + " in grade " + grade);
    }
}