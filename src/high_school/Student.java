
package high_school;


/**
 * @author Adrian John - 00061686
 * 
 * This class is a sub class that inherits, the attributes and behaviors of Person.  
 * This class has specific information about a student such as a their home address,
 * phone number and the teacher who created the student.
 */

public class Student extends Person {
    
    /**instance variables o student*/
     
    private String homeAddress;
    private Teacher stuTeacher;
    private Date regDate;
    private int courcesAmount;
   protected Enroll [] enroll_history = new Enroll[10];

    
    
     /** class variable count is used to keep track of the amount of student in array.*/
    protected static int count=0;
    
     /**
     * the  constructor - is used to instantiate instance variable after user input of a Student
     * The constructor also has a super constructor to instantiate the instance variables 
     * of the super class.
     * 
     * @param id - inherited from person
     * @param fn - inherited from person
     * @param ln - inherited from person
     * @param date -the date registration student of a which must be of Date type. Since 
     *              Date holds a reference to another object, the date object would
     *              require 3 integer values such as (day, month, year).
     * @param ph - a student phone number is required that must be of string type
     * @param add-a student address is required of string type
     * @param teach - the teach parameter holds a reference to the teacher Object that was use to create 
     *                 a student object.
     */
    public Student (String id, String fn,String ln, Date date,String add,Teacher teach,String mobile, String home){
        super(id,ln,fn,home,mobile);
        regDate=date;
        homeAddress=add;
        stuTeacher=teach;
        count++;
    }

    public Enroll [] getEnrollHist(){ return enroll_history;}
    
    /** @return a home address of a student that has been passed in the constructor*/
    public String getHomeAddress() { return homeAddress;}
    /** @return a phone number of a student that has been passed in the constructor*/
    
     /** @return the number of students presently in the array*/
    public static int getCount (){return count;}
    /** @return a registration date of a student that has been passed in the constructor*/
    public Date getRegDate(){return regDate;}
    /** @return the teacher who registered the student*/
    public Teacher getTeacher(){return stuTeacher;}
    
    public String setEnroll(Student id, Section enrolledInto){
      
        for(int i=0;i<enroll_history.length;i++){
            if(enroll_history [i]==null){
               enroll_history [i]= new Enroll(id,enrolledInto);
               return "Sucessful Enrollment";
                     } 
               
            }
     
        return "Student array is full.";
         
        }
       
    
    

    

    /**
     * this toString method overrides the toString method of the parent class. 
     * It stores the attributes of a the parent class and the attributes of the
     * Student class and single String. 
     * 
     * @return a string of the staff instance variables and the super class toString 
     */
    
    
    public String toString (){
        
        String studentInfo= super.toString()+"\nhome address: "+homeAddress
                +"\ndate: "+regDate+"Adviser: "+ stuTeacher.getID()+"  "+stuTeacher.getFname()+" "+stuTeacher.getLname()+"\n";
        return studentInfo;
    }


    
    
}
