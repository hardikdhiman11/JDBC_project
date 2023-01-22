package co.student.manage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class START
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to our Student management app");

        while(true)
        {
            System.out.println("Press 1 to ADD ");
            System.out.println("Press 2 to DELETE ");
            System.out.println("Press 3 to display ");
            System.out.println("Press 4 to exit");
            int c= Integer.parseInt(br.readLine());

            if(c==1)
            {   //Add
                System.out.println("Enter username");
                String name = br.readLine();

                System.out.println("Enter user city");
                String city = br.readLine();

                System.out.println("Enter user phone");
                String phone = br.readLine();

                Student1 st = new Student1(name,phone,city);
                boolean answer =Student_dao.insert_student_to_db(st);
                if(answer)
                {
                    System.out.println("Student successfully added");
                }
                else {
                    System.out.println("Something went wrong");
                }
            }

            else if(c==2)
            {       //Delete

            }
            else if(c==3)
            {      //Display

            }
            else if(c==4)
            {       //Exit
                break;
            }
            else {}

        }

        System.out.println("Thankyou for using this application.");
        System.out.println("See you soon. Bye!");

    }
}
