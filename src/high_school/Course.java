
package high_school;

/**
 *
 * @author Adrian
 */

public class Course {
    
    
private String crs_code, crs_name, crs_description;

public Course (String course, String name, String descript){
    
    crs_code= course;
    crs_name=name;
    crs_description=descript;    
}
public String getCrs_code(){return crs_code;}
public String getCrs_name(){return crs_name;}
public String getCrs_desctiption(){return crs_description;}

public String toString (){
    String crs_info= "\nCourse code: "+ crs_code+"\nCourse Name: "+crs_name+"\nCourse Description: "+ crs_description;
    return crs_info;
}
    
}
