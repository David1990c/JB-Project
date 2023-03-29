package ObjectOriented;

public class UniversityTest {
    public static void main(String[] args) {
        Student mathStudent = new Student(1995, "Elya", "Cohen");
        Student englishStudent = new Student(1990, "David", "Chavti");
        Driver driver1 = new Driver(1992, "joe");

        mathStudent.setDataBase("Math",98);
        englishStudent.setDataBase("English", 99);
        driver1.setDataBase("Math", 87);
        int licenseLevel = driver1.getLicense();
        System.out.println("license level ="+licenseLevel);
    }
}
