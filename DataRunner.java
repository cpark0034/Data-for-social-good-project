import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {
    
UserStory highSchoolStudent = new UserStory("names.txt", "area.txt", "funds.txt", "staff.txt");

highSchoolStudent.findMaxStaff();
highSchoolStudent.findMaxFunding();
highSchoolStudent.findAllAreas();
System.out.println(highSchoolStudent);
    
    
    




    


    
    
    
  }
}