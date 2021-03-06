/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package high_school;

import javax.swing.JOptionPane;

/**
 *
 * @author Adrian
 */
public class StudentQueries extends javax.swing.JPanel {

    /**
     * Creates new form Queries
     */
    public StudentQueries() {
        initComponents();
        student.setEditable(false);
     
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
        pnl_studentQuery = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btn_run = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfd_id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        student = new javax.swing.JTextArea();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setBackground(new java.awt.Color(204, 204, 255));
        setMaximumSize(new java.awt.Dimension(600, 440));
        setMinimumSize(new java.awt.Dimension(600, 440));
        setPreferredSize(new java.awt.Dimension(600, 440));
        setLayout(new java.awt.BorderLayout());

        pnl_studentQuery.setBackground(new java.awt.Color(204, 204, 255));
        pnl_studentQuery.setRequestFocusEnabled(false);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setMaximumSize(new java.awt.Dimension(600, 60));
        jPanel2.setMinimumSize(new java.awt.Dimension(600, 60));
        jPanel2.setPreferredSize(new java.awt.Dimension(600, 60));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Perform a Query on A Student");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );

        btn_run.setText("Run");
        btn_run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_runActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter ID");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Results");

        student.setColumns(20);
        student.setRows(5);
        student.setText("no queries yet!!");
        jScrollPane1.setViewportView(student);

        javax.swing.GroupLayout pnl_studentQueryLayout = new javax.swing.GroupLayout(pnl_studentQuery);
        pnl_studentQuery.setLayout(pnl_studentQueryLayout);
        pnl_studentQueryLayout.setHorizontalGroup(
            pnl_studentQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_studentQueryLayout.createSequentialGroup()
                .addGroup(pnl_studentQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnl_studentQueryLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(pnl_studentQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(btn_run))
                        .addGap(18, 18, 18)
                        .addComponent(tfd_id, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addGroup(pnl_studentQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnl_studentQueryLayout.setVerticalGroup(
            pnl_studentQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_studentQueryLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnl_studentQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnl_studentQueryLayout.createSequentialGroup()
                        .addGroup(pnl_studentQueryLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnl_studentQueryLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(tfd_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_studentQueryLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)))
                        .addGap(18, 18, 18)
                        .addComponent(btn_run)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnl_studentQueryLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(104, Short.MAX_VALUE))))
        );

        add(pnl_studentQuery, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

        public String queryOnStudent(){
            
    
      boolean id=false;
       String idnum =tfd_id.getText();
        for( int i=0; i<Highschool.student_arr.length;i++){ 
            if(Highschool.student_arr[i]==null);
            else{
            if(Highschool.student_arr[i].getID().equals(idnum)){
             return Highschool.student_arr[i].toString();
            }     } 
           }      
       return "Invalid Student ID";
        }
    
    
    private void btn_runActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_runActionPerformed

       String stu = queryOnStudent();
        student.setText(String.valueOf(stu));
     tfd_id.setText("");

    }//GEN-LAST:event_btn_runActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_run;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnl_studentQuery;
    private javax.swing.JTextArea student;
    private javax.swing.JTextField tfd_id;
    // End of variables declaration//GEN-END:variables
}
