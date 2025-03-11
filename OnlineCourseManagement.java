class Course{
    private String courseName;
    private int duration;
    private int fee;

    static String instituteName = "Chitkara University";

    protected Course(String courseName, int duration, int fee){
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    protected void displayCourseDetails(){
        System.out.println("Course Name is " + this.courseName);
        System.out.println("Course Duration is " + this.duration + " days");
        System.out.println("Course Fee is " + this.fee + " annually");
    }

    static void updateInstituteName(String updatedName){
        instituteName = updatedName;
    }
}

public class OnlineCourseManagement{
    public static void main(String[] args) {
        Course course = new Course("Btech",1000, 164000);
        course.displayCourseDetails();
        Course.updateInstituteName("Chandigarh University");

//        Course Name is Btech
//        Course Duration is 1000 days
//        Course Fee is 164000 annually
    }
}