package Q3;

public class Student {

    private String name, email, contactNum;
    private Course course;

    public Student(String name, String email, String contactNum, Course course) {
        this.name = name;
        this.email = email;
        this.contactNum = contactNum;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactNum() {
        return contactNum;
    }

    public void setContactNum(String contactNum) {
        this.contactNum = contactNum;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}
