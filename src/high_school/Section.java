
package high_school;

/**
 *
 * @author Adrian
 */
public class Section {
private String section_id;//crn code eg 12937
private Course crs_info;//crs info
private Teacher teach_name;//Nagee
static int sec_count=0;

public Section(String id,Course crs_ref ,Teacher teach_ref){
    
    section_id=id;
    crs_info= crs_ref;
    teach_name=teach_ref;
     sec_count++;
    
}

public String getSectionId(){return section_id;}
public Teacher getReference (){return teach_name;}
public Course getCrs_info(){return crs_info;}

public String toString (){
    
    String section_info="\nSection ID: "+ section_id+ "\nCourse Type:"+crs_info.getCrs_code()+"\nlecturer: "+teach_name.getFname()+" "+teach_name.getLname() ;
    return section_info;};

    
}
