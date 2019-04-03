package high_school;
/**
 * @author Adrian John - 00061686
 * 
 * This class is the super class of 3 classes; Student, Teacher and Staff.
 * This class has all the common behavior and attributes of a person such as
 * a person's first name, last name and their ID number;
 */
public abstract class Person {
    /**  instance variables- the common attributes of a teacher, student and staff */
    
    private String ID, lname,fname,mobile,home;
    
    /**
     * the Parent constructor - used to instantiate instance variable after user input
     * @param id a teacher, student or staff identification number must be of string type
     * @param fn a teacher, student or staff first name must be of string type
     * @param ln a teacher, student or staff last name must be of string type
     */
    public Person (String id, String ln,String fn,String mob_phone, String hom_phone){
        
        ID=id;
        lname=ln;
        fname=fn;
        mobile=mob_phone;
        home=hom_phone;
    }
    
  /** @return ID that has been passed in the constructor*/
    public String getID(){return ID;}
    
  /** @return Last Name that has been passed in the constructor*/    
    public String getLname(){return lname;}
 
  /** @return First Name that has been passed in the constructor*/   
    public String getFname(){return fname;}
    
    public String getMobile(){return mobile;}
    
    public String getHome(){return home;}
    
    /**
     * @return a String of all instance variables.
     * this method stores all the instance variables of a person and such as 
     * (first and last name, and identification number) in a string to be displayed.
     */
      public String toString (){
        String info= "\nID: "+ID+"\nfirst name: "+fname+"\nlast name: "
        +lname +"\n Home Phone: "+home+"\nMobile Phone: "+mobile; 
        return info;
    }
        
    
}
