
package high_school;

/**
 * @author Adrian John - 00061686
 * 
 * This class is a sub class of person that inherits, the attributes and behaviors of person  
 * This class has specific information about a Teacher such as a Teacher date hired 
 * and a teacher specialization.
 */


public class Teacher extends Person {
    
    /** the instance variables of a Teacher */
    
    private String discipline;
    private Date dateHired;
    protected static int Tcount=0;

    /**
     * the  constructor - used to instantiate instance variable after user input of a Teacher
     * an the constructor also has a super constructor to instantiate the instance variables 
     * of the super class
     * 
     * @param id - inherited from person
     * @param fn - inherited from person
     * @param ln - inherited from person
     * @param date -the date of a Teacher was hired which must be of Date type. Since 
     *              Date holds a reference to another object, the date object would
     *              require 3 integer values such as (day, month, year).
     * @param special - a teacher specialization is required that must be of string type
     */
    
    public Teacher (String id, String fn,String ln, Date date,String diciplinea, String mobile, String home){
        super (id,ln,fn, home, mobile);
        discipline=diciplinea;
        dateHired=date;
        Tcount++;
    }

    /** @return a teacher specialization that has been passed in the constructor*/
    public String getSpecial(){return discipline;}
    
    /** @return a Teacher date hired that has been passed in the constructor*/
    public Date getDateHired(){return dateHired;}
   
    /**
     * this toString method overrides the toString method of the parent class. 
     * It stores the attributes of a the parent class and the attributes of the
     * teacher class and single String.
     * and returns 
     * 
     * @return a string of the Teacher instance variables and the super class toString 
     */
    public String toString (){
        String teacherInfo= super.toString ()+"\nSpecialization: "+discipline+"\ndate: "+dateHired ;
        return teacherInfo;}
}
