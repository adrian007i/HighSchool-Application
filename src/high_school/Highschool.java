/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */  
package high_school;

import java.awt.GridBagConstraints;
import javax.swing.JOptionPane;

/**
 *
 * @author Adrian  
 */
public class Highschool extends javax.swing.JFrame {

    private StudentQueries pnl_studentQueries;
    private TeacherQueries pnl_teacherQueries;
    private Enrollment pnl_enroll;
    private TeacherP pnl_teacher; 
    private StudentPn pnl_student;
    private DisplayAll pnl_display;
    private EnrollHistory pnl_enrollHistory;
    private GradeEntry pnl_grade;
    private Welcome home;
    
    static Teacher teacher_arr[]=new Teacher[4];
    static Course [] crs_offered_arr = new Course[5];
    static Section[] classes_arr= new Section[10];
    static Student[] student_arr = new Student[10];
   

    
    public Highschool() {
        initComponents();
        
        pnl_studentQueries= new StudentQueries ();
        pnl_teacherQueries= new TeacherQueries ();
        pnl_enroll= new Enrollment();
        pnl_teacher= new TeacherP();
        pnl_student= new StudentPn();
        pnl_display= new DisplayAll();
        pnl_enrollHistory= new EnrollHistory ();
        pnl_grade=new GradeEntry();
        home= new Welcome();
        
        
        
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        

        pnl_container.add(pnl_studentQueries,gbc);
         pnl_container.add(pnl_teacherQueries,gbc);
        pnl_container.add(pnl_enroll,gbc);
        pnl_container.add(pnl_teacher,gbc);
        pnl_container.add(pnl_student,gbc);
        pnl_container.add(pnl_display,gbc);
        pnl_container.add(pnl_enrollHistory,gbc);
        pnl_container.add(pnl_grade,gbc);
        pnl_container.add(home,gbc);
  
        pnl_studentQueries.setVisible(false);
        pnl_teacherQueries.setVisible(false);
        pnl_enroll.setVisible(false);
        pnl_teacher.setVisible(false);
        pnl_student.setVisible(false);
        pnl_display.setVisible(false);
        pnl_enrollHistory.setVisible(false);
        pnl_grade.setVisible(false);
        home.setVisible(true);
        this.setLocationRelativeTo(null);
        
 }
    
 
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl_menu = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        btn_regStudent = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        Query = new javax.swing.JTextField();
        btn_student_query = new javax.swing.JButton();
        btn_teacher_query = new javax.swing.JButton();
        btn_DisplayAll = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jTextField2 = new javax.swing.JTextField();
        btn_Enter_Student_Grade = new javax.swing.JButton();
        btn_exit = new javax.swing.JButton();
        btn_regTeacher = new javax.swing.JButton();
        btn_home = new javax.swing.JButton();
        btn_Enter_Student_Grade1 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        btn_EnrollmentHistory = new javax.swing.JButton();
        btn_EnrollStudent = new javax.swing.JButton();
        pnl_container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setPreferredSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        jPanel1.setMaximumSize(new java.awt.Dimension(800, 700));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 700));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 700));
        jPanel1.setLayout(new java.awt.BorderLayout());

        pnl_menu.setBackground(new java.awt.Color(153, 153, 255));

        jTextField1.setBackground(new java.awt.Color(204, 255, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("Registration");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        btn_regStudent.setText("Register Student");
        btn_regStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regStudentActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        Query.setBackground(new java.awt.Color(204, 255, 204));
        Query.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Query.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Query.setText("Queries");
        Query.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueryActionPerformed(evt);
            }
        });

        btn_student_query.setText("Student Query");
        btn_student_query.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_student_queryActionPerformed(evt);
            }
        });

        btn_teacher_query.setText("Teacher Query");
        btn_teacher_query.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_teacher_queryActionPerformed(evt);
            }
        });

        btn_DisplayAll.setText("Display All");
        btn_DisplayAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DisplayAllActionPerformed(evt);
            }
        });

        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jTextField2.setBackground(new java.awt.Color(204, 255, 204));
        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField2.setText("Grades");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        btn_Enter_Student_Grade.setText("Enter student Grade");
        btn_Enter_Student_Grade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Enter_Student_GradeActionPerformed(evt);
            }
        });

        btn_exit.setBackground(new java.awt.Color(255, 0, 51));
        btn_exit.setForeground(new java.awt.Color(255, 255, 255));
        btn_exit.setText("exit");
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });

        btn_regTeacher.setText("Register Teacher");
        btn_regTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regTeacherActionPerformed(evt);
            }
        });

        btn_home.setBackground(new java.awt.Color(255, 0, 51));
        btn_home.setForeground(new java.awt.Color(255, 255, 255));
        btn_home.setText("home");
        btn_home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_homeActionPerformed(evt);
            }
        });

        btn_Enter_Student_Grade1.setText("Update All Student grades");
        btn_Enter_Student_Grade1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Enter_Student_Grade1ActionPerformed(evt);
            }
        });

        jTextField3.setBackground(new java.awt.Color(204, 255, 204));
        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField3.setText("Enrollment");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);

        btn_EnrollmentHistory.setText("Enrollment History");
        btn_EnrollmentHistory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnrollmentHistoryActionPerformed(evt);
            }
        });

        btn_EnrollStudent.setText("Enroll Student");
        btn_EnrollStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_EnrollStudentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnl_menuLayout = new javax.swing.GroupLayout(pnl_menu);
        pnl_menu.setLayout(pnl_menuLayout);
        pnl_menuLayout.setHorizontalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_regStudent)
                    .addComponent(btn_regTeacher))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_menuLayout.createSequentialGroup()
                        .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_DisplayAll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnl_menuLayout.createSequentialGroup()
                                .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnl_menuLayout.createSequentialGroup()
                                        .addComponent(btn_student_query, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btn_teacher_query, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Query, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(18, 18, 18))
                    .addGroup(pnl_menuLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_home)
                        .addGap(27, 27, 27)
                        .addComponent(btn_exit)
                        .addGap(6, 6, 6)))
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_EnrollmentHistory, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                    .addComponent(btn_EnrollStudent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField2)
                    .addComponent(btn_Enter_Student_Grade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_Enter_Student_Grade1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_menuLayout.setVerticalGroup(
            pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_menuLayout.createSequentialGroup()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_regStudent)
                .addGap(11, 11, 11)
                .addComponent(btn_regTeacher)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator1)
            .addComponent(jSeparator5)
            .addGroup(pnl_menuLayout.createSequentialGroup()
                .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_menuLayout.createSequentialGroup()
                        .addComponent(Query, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_student_query)
                            .addComponent(btn_teacher_query))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btn_DisplayAll))
                    .addGroup(pnl_menuLayout.createSequentialGroup()
                        .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_menuLayout.createSequentialGroup()
                                .addComponent(btn_Enter_Student_Grade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_Enter_Student_Grade1))
                            .addGroup(pnl_menuLayout.createSequentialGroup()
                                .addComponent(btn_EnrollmentHistory)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_EnrollStudent)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnl_menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_home)
                    .addComponent(btn_exit))
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jSeparator6)
        );

        jPanel1.add(pnl_menu, java.awt.BorderLayout.PAGE_START);

        pnl_container.setBackground(new java.awt.Color(204, 255, 204));
        pnl_container.setLayout(new java.awt.GridBagLayout());
        jPanel1.add(pnl_container, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_EnrollStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EnrollStudentActionPerformed
         pnl_studentQueries.setVisible(false);
        pnl_teacherQueries.setVisible(false);
        pnl_teacher.setVisible(false);
        pnl_student.setVisible(false);
        pnl_display.setVisible(false);
        pnl_enrollHistory.setVisible(false);
        pnl_grade.setVisible(false);
        home.setVisible(false);
        pnl_enroll.setVisible(true);
    }//GEN-LAST:event_btn_EnrollStudentActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void QueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_QueryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_QueryActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_exitActionPerformed

    private void btn_regTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regTeacherActionPerformed
        pnl_studentQueries.setVisible(false);
        pnl_enroll.setVisible(false);
        pnl_student.setVisible(false);
        pnl_grade.setVisible(false);
        pnl_display.setVisible(false);
        pnl_enrollHistory.setVisible(false);
        pnl_teacherQueries.setVisible(false); 
        home.setVisible(false);
        pnl_teacher.setVisible(true);
        
    
        
    }//GEN-LAST:event_btn_regTeacherActionPerformed

    private void btn_regStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regStudentActionPerformed

        pnl_teacherQueries.setVisible(false);
        pnl_enroll.setVisible(false);
        pnl_grade.setVisible(false);
        pnl_teacher.setVisible(false); 
        pnl_studentQueries.setVisible(false);
        pnl_display.setVisible(false);
        pnl_enrollHistory.setVisible(false);
        home.setVisible(false);
        pnl_student.setVisible(true);
    }//GEN-LAST:event_btn_regStudentActionPerformed

    private void btn_student_queryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_student_queryActionPerformed
        pnl_student.setVisible(false);
        pnl_teacherQueries.setVisible(false);
        pnl_enroll.setVisible(false);
        pnl_teacher.setVisible(false);
        pnl_display.setVisible(false);
        pnl_grade.setVisible(false);
        pnl_enrollHistory.setVisible(false);
        home.setVisible(false);
        pnl_studentQueries.setVisible(true);
    }//GEN-LAST:event_btn_student_queryActionPerformed

    private void btn_teacher_queryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_teacher_queryActionPerformed
     pnl_studentQueries.setVisible(false);
        pnl_enroll.setVisible(false);
        pnl_teacher.setVisible(false);
        pnl_student.setVisible(false);
        pnl_grade.setVisible(false);
        pnl_display.setVisible(false);
        pnl_enrollHistory.setVisible(false);
        home.setVisible(false);
         pnl_teacherQueries.setVisible(true);
         
    }//GEN-LAST:event_btn_teacher_queryActionPerformed

    private void btn_EnrollmentHistoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_EnrollmentHistoryActionPerformed
       pnl_teacherQueries.setVisible(false);
        pnl_studentQueries.setVisible(false);
        pnl_enroll.setVisible(false);
        pnl_grade.setVisible(false);
        pnl_teacher.setVisible(false);
        pnl_student.setVisible(false);
        pnl_display.setVisible(false);
        home.setVisible(false);
        pnl_enrollHistory.setVisible(true);
        
    }//GEN-LAST:event_btn_EnrollmentHistoryActionPerformed

    private void btn_DisplayAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DisplayAllActionPerformed
       pnl_teacherQueries.setVisible(false);
        pnl_studentQueries.setVisible(false);
        pnl_enroll.setVisible(false);
        pnl_teacher.setVisible(false);
        pnl_student.setVisible(false);
        home.setVisible(false);
        pnl_grade.setVisible(false);
        pnl_enrollHistory.setVisible(false);
        pnl_display.setVisible(true);  
        new DisplayAll();
    }//GEN-LAST:event_btn_DisplayAllActionPerformed

    private void btn_Enter_Student_GradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Enter_Student_GradeActionPerformed
        // TODO add your handling code here:
         pnl_teacherQueries.setVisible(false);
        pnl_studentQueries.setVisible(false);
        pnl_enroll.setVisible(false);
        pnl_teacher.setVisible(false);
        pnl_student.setVisible(false);
        home.setVisible(false);
       pnl_display.setVisible(false);
        pnl_enrollHistory.setVisible(false);
         pnl_grade.setVisible(true);
    }//GEN-LAST:event_btn_Enter_Student_GradeActionPerformed

    private void btn_homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_homeActionPerformed
        pnl_teacherQueries.setVisible(false);
        pnl_studentQueries.setVisible(false);
        pnl_enroll.setVisible(false);
        pnl_teacher.setVisible(false);
        pnl_student.setVisible(false);
       pnl_display.setVisible(false);
        pnl_enrollHistory.setVisible(false);
         pnl_grade.setVisible(false);
          home.setVisible(true);
    }//GEN-LAST:event_btn_homeActionPerformed

    private void btn_Enter_Student_Grade1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Enter_Student_Grade1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Enter_Student_Grade1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

        
   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Highschool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Highschool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Highschool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Highschool.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        crs_offered_arr[0]= new Course ("ITEC 133","Programming I","Introduction to JAVA Programming");
        crs_offered_arr[1]= new Course ("Math 117","College Algebra","Building block for advance math courses");
        crs_offered_arr[2]= new Course ("ITEC 122","Operating Systems","basic concepts in operating systems");
        crs_offered_arr[3]= new Course ("ITEC 243","Intro to XML","Schema, DTD and creating structured data");
        crs_offered_arr[4]= new Course ("WRIT 117","Fundamentals of Writing","strengthen their writing skills.");
        
       // Hard coded teacher for testing 
       
        teacher_arr[0]=new Teacher("1","Alicia","Nagee",new Date (12,2,2008) ,"Info Tech", "678-1234", "342-2424");
        teacher_arr[1]= new Teacher ("2","Robin","Ramlal", new Date (1,3,2012),"Mathematics","623-2343","423-4324"); 
        teacher_arr[2]= new Teacher ("3","Dexter","Abslum", new Date (19,8,2004),"Info Tech","623-4433","454-3424"); 
       // teacher_arr[3]= new Teacher ("4","Joy","Roach", new Date (9,3,2011),"Literature","623-3423","334-4323");
        
        student_arr[0]= new Student("1","Adrian","John" ,new Date (12,12,12) ,"trinidad",teacher_arr[1],"mo432","ho243");
         student_arr[1]= new Student("2","Adrian","John" ,new Date (12,12,12) ,"trinidad",teacher_arr[1],"mo432","ho243");
         student_arr[2]= new Student("3","Adrian","John" ,new Date (12,12,12) ,"trinidad",teacher_arr[2],"mo432","ho243");
         student_arr[3]= new Student("4","Adrian","John" ,new Date (12,12,12) ,"trinidad",teacher_arr[0],"mo432","ho243");
         student_arr[4]= new Student("5","Adrian","John" ,new Date (12,12,12) ,"trinidad",teacher_arr[2],"mo432","ho243");
         student_arr[5]= new Student("6","Adrian","John" ,new Date (12,12,12) ,"trinidad",teacher_arr[0],"mo432","ho243");
         student_arr[6]= new Student("7","Adrian","John" ,new Date (12,12,12) ,"trinidad",teacher_arr[1],"mo432","ho243");
         student_arr[7]= new Student("8","Adrian","John" ,new Date (12,12,12) ,"trinidad",teacher_arr[0],"mo432","ho243");
         student_arr[8]= new Student("9","Adrian","John" ,new Date (12,12,12) ,"trinidad",teacher_arr[0],"mo432","ho243");
        //  student_arr[9]= new Student("10","Adrian","John" ,new Date (12,12,12) ,"trinidad",teacher_arr[2],"mo432","ho243");
         
        
    
        
        classes_arr[0]=new Section("1",crs_offered_arr[0],teacher_arr[0]);
        classes_arr[1]=new Section("2",crs_offered_arr[0],teacher_arr[0]);
        classes_arr[2]=new Section("3",crs_offered_arr[1],teacher_arr[1]);
        classes_arr[3]=new Section("4",crs_offered_arr[1],teacher_arr[1]);
        classes_arr[4]=new Section("5",crs_offered_arr[2],teacher_arr[1]);
        classes_arr[5]=new Section("6",crs_offered_arr[2],teacher_arr[2]);
        classes_arr[6]=new Section("7",crs_offered_arr[3],teacher_arr[2]);
        classes_arr[7]=new Section("8",crs_offered_arr[3],teacher_arr[1]);
        classes_arr[8]=new Section("9",crs_offered_arr[4],teacher_arr[2]);
        classes_arr[9]=new Section("10",crs_offered_arr[4],teacher_arr[0]);
        

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Highschool().setVisible(true); 
            }
        });
        

               

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Query;
    private javax.swing.JButton btn_DisplayAll;
    private javax.swing.JButton btn_EnrollStudent;
    private javax.swing.JButton btn_EnrollmentHistory;
    private javax.swing.JButton btn_Enter_Student_Grade;
    private javax.swing.JButton btn_Enter_Student_Grade1;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_home;
    private javax.swing.JButton btn_regStudent;
    private javax.swing.JButton btn_regTeacher;
    private javax.swing.JButton btn_student_query;
    private javax.swing.JButton btn_teacher_query;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel pnl_container;
    private javax.swing.JPanel pnl_menu;
    // End of variables declaration//GEN-END:variables
}
