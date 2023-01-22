package co.student.manage;
public class Student1
{
    private int    studentID;
    private String studentName;
    private String studentPhone;
    private String studentCity;
    private String student;

    public Student1(String studentName, String studentPhone, String studentCity) {
        super();
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
    }

    public Student1(int studentID, String studentName, String studentPhone, String studentCity, String student) {
        super();
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentPhone = studentPhone;
        this.studentCity = studentCity;
        this.student = student;
    }

    public int getStudentID() {
        return studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getStudentPhone() {
        return studentPhone;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public String getStudent() {
        return student;
    }

    public Student1() {
        super();
    }

    @Override
    public String toString() {
        return "Student1{" +
                "studentID=" + studentID +
                ", studentName='" + studentName + '\'' +
                ", studentPhone='" + studentPhone + '\'' +
                ", studentCity='" + studentCity + '\'' +
                ", student='" + student + '\'' +
                '}';
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentPhone(String studentPhone) {
        this.studentPhone = studentPhone;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    public void setStudent(String student) {
        this.student = student;
    }
}
