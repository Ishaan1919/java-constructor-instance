class Student{
    public String rollNumber;
    protected String name;
    private double cgpa;

    protected Student(String rollNumber, String name, double cgpa){
        this.rollNumber = rollNumber;
        this.name = name;
        this.cgpa = cgpa;
    }

    public double accessCGPA(){
        return this.cgpa;
    }

    public void modifyCGPA(double updatedCGPA){
        this.cgpa = updatedCGPA;
    }
}

class PostgraduateStudent extends Student{

    public PostgraduateStudent(String roll, String name, double cgpa){
        super(roll,name,cgpa);
    }

    public void displayName(){
        System.out.println("The name of the student is " + name);
    }
}

public class UniversityManagementSystem{
    public static void main(String[] args) {
        PostgraduateStudent student = new PostgraduateStudent("2110990642","Ishaan",9.13);
        student.displayName();
        System.out.println(student.name);

//        The name of the student is Ishaan
//                Ishaan
    }
}