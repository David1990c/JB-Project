package ObjectOriented;

public class Driver extends Person {
    public Driver(int year, String name) {
        int birthYear = year;
        String fullName = name;
    }

    public void setDataBase(String nameCourse, int grade) {
        System.out.println("set DB whit parameters " + nameCourse + " in grade " + grade);
    }


    public int getLicense() {
        System.out.println("into get license");
        int licenseLevel = 5;
        return licenseLevel;
    }
}
