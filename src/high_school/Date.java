
package high_school;

/**
 * @author Adrian John - 00061686
 * 
 * This class is a used to initialize and access, the registration date of a 
 * student and the hire date of a staff and teacher
 */


public class Date {
    /**instance variables */
    private int day,year,month;
    
    /**
     * 
     * @param d - day of integer
     * @param m- month of integer
     * @param y - year of integer 
     */
    
    public Date(int d, int m, int y){
    day=d;
    year=y;
    month=m;
   }
    
    /** @return day  */
    public int getDay(){return day;}
    /** @return month */
    public int getMonth(){return month;}
    /** @return year  */
    public int getYear(){return year;}
    
    /**
     * @return combination of the day, month and year in one string 
     */
    public String toString (){
        
        String dateInfo = +day+"/ "+month+"/ "+year+"\n";
        return dateInfo;
    }
    
}
