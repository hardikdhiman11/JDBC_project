package co.student.manage;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class Student_dao
{
    public static boolean insert_student_to_db(Student1 st)
    {
        boolean f = false;
        try
            {
            Connection con = Connection_getter.create_Connection(); //To create connection
            String q = "Insert into students(Sname, Sphone,Scity) values(?,?,?)";

            //Prepared statement to fire the query
            PreparedStatement pstmt = con.prepareStatement(q);

            //Setting the values
            pstmt.setString(1, st.getStudentName());
            pstmt.setString(1, st.getStudentPhone());
            pstmt.setString(1, st.getStudentCity());

            //execute
            pstmt.executeUpdate();

             f = true;
            }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return f;
    }
}
