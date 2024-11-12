import java.util.Scanner;

public class UserStory {

  private String[] name; //this is a list for the college names.
  private String[] areas;//this is an empty list for the area
  private int[] fund;//this list is for the funds
  private int[] staffs;//this makes a list for the staff
  private int max; //this instantiates a variable that will store the max #, this is what will be returned for my first question
  private int maximum; //this instantiates a variable that will store the max # of fun, this is what will be returned for my second question
//these next variables that are all i store indexes.
private int i1;
private int i2;

  //this file reader will print out any item in an array
public UserStory(String nameFile, String areasFile, String fundFile, String staffsFile){
  
name = FileReader.toStringArray(nameFile);//this array is for the names
areas = FileReader.toStringArray(areasFile);//this array is for the area of where each college is located.
fund = FileReader.toIntArray(fundFile);//this array is for the names
staffs = FileReader.toIntArray(staffsFile);//this array is for the names
}

//My users first question is finding out which college has the most academic staff
//They want to know this because the more academic staff there is, the more likely they want to go there
//First I will traverse the staffs lists, pull out the highest, then print out the college's name that has the most academic staff
  
  public int findMaxStaff() {
     max = 0;             
for (int i = 0; i < staffs.length; i++){  //start of for loop

    if (staffs[i] > max){ //an if statement    
      max = staffs[i]; //updates max
      i =i1;//stores index
    }
  }
        System.out.println("The college with the most amount of staff is "+ name[i1] +"\n"); //i chose the varible i1 to store the index value

 return max; //this will be helpful for my toString
  }

//My users Second question is finding out which college gets the most funding
//They want to know this because the more funding there is, the nicer the campus and schooling would be be.
//First I will traverse the funds lists, pull out the highest value, then print out the college's name that got the most funding
  
  public int findMaxFunding() {
     maximum = 0;             
for (int i = 0; i < fund.length; i++){  //start of for loop

    if (fund[i] > maximum){ //an if statement    
      maximum = fund[i]; //updates maximum
      i = i2;//stores the index
    }
  }
        System.out.println("The college that got the most funding is "+ name[i2] + "\n"); //i chose the varible i2 to store the index value

 return max; //this will be helpful for my toString
  }

//My users third question is finding out where each college is located
//They want to know this because the closer the college is the more they would like to go
//First I will traverse the area list,  then print out  all of the college's areas 
  
  public String findAllAreas() {
    for (int i = 0; i < areas.length; i++) {
   System.out.println("----------------------------------------" +  "\n" + name[i] + " Is located in " + areas[i] +"\n" +"----------------------------------------" + "\n");
    }
  return "3";
  }


//THIS IS OUR TO STRING TO REPRESENT OUR MOST BASIC DATA
  public String toString(){
   return ("Based on the data retrived, I think I am going to go to Brown University, not only is it close, but it has the most staff and funds as well!!! ");
}
 

  
}