package kodlamaio.entities;

public class Course implements BaseEntity {
    private int courseId;
    private String courseName;
    private double coursePrice;
    private String courseType;


    public Course(int courseId, String coursName, double coursePrice, String courseType) {
        this.courseId = courseId;
        this.courseName = coursName;
        this.coursePrice = coursePrice;
        this.courseType = courseType;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(double coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }
}
