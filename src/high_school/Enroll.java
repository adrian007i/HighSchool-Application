/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package high_school;


public class Enroll {
    private Student stu;
    private Section crn;
    private double grade;
    
    
    public Enroll(Student student, Section crn){
        stu= student;
        this.crn=crn;
        grade=0;
        
    }
        public Enroll(Student student, Section crn, double mark){
        stu= student;
        this.crn=crn;
        grade=mark;
        
        
    }
    
    public Student getStudent(){return stu;}
    public Section getCourse(){return crn;}
    public double getgrade(){return grade;}
    
    public void setGrade (double value){
        grade=value;}

    @Override
    public String toString() {
        String enroll_info= "\nSection ID: "+crn.getSectionId()+crn.getCrs_info()+"\nGrade: "+grade+"\n";
        return enroll_info;
    }  
}
