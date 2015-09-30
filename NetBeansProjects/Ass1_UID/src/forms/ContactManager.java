package forms;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ronakshahmac
 */
public class ContactManager extends javax.swing.JFrame {

    /**
     * Creates new form ContactManager
     */
    private static String firstname;
    private static String lastname;
    private static File f;
    private static ArrayList<ArrayList> alArr;
    public ContactManager() throws IOException {
        initComponents();
        f = new File("/Users/ronakshahmac/NetBeansProjects/Ass1_UID/src/forms/list_contact.txt");  
        alArr  = new ArrayList<>(); 
        readFile(f);
        UpdateTable(alArr);
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        fname = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        tx_fname = new javax.swing.JTextField();
        tx_lname = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        testLabel = new javax.swing.JLabel();
        dispPanel = new javax.swing.JScrollPane();
        contTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contact Manager");
        setSize(new java.awt.Dimension(800, 600));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Enter the Information"));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        fname.setText("First Name");

        lname.setText("Last Name");

        tx_fname.setText("jTextField1");
        tx_fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tx_fnameActionPerformed(evt);
            }
        });

        tx_lname.setText("jTextField2");

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(testLabel)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(submitButton)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fname, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(lname, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addGap(35, 35, 35)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tx_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tx_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fname, lname, submitButton});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fname)
                    .addComponent(tx_fname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname)
                    .addComponent(tx_lname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE)
                .addComponent(testLabel)
                .addGap(45, 45, 45)
                .addComponent(submitButton)
                .addContainerGap())
        );

        contTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "First Name", "Last Name", "Phone Number", "State"
            }
        ));
        contTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contTableMouseClicked(evt);
            }
        });
        dispPanel.setViewportView(contTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dispPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 600, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dispPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(185, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        
        String newEntry = getLatestString();
        alArr.add(addRowToArrayList(newEntry));
        try {
            UpdateFileAndTable(alArr, f);
            
//       
        } catch (IOException ex) {
            Logger.getLogger(ContactManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_submitButtonActionPerformed
    public void updateEntry(){
        
    }
    public String getLatestString(){
         firstname = tx_fname.getText();
        lastname = tx_lname.getText();
        String seperator="\t\t\t\t";
        return firstname+seperator+lastname;
        
        
    }
    private void contTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contTableMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_contTableMouseClicked

    private void tx_fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tx_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tx_fnameActionPerformed
    
    
    public void UpdateTable(ArrayList alTemp) throws IOException
            //always read table from latest file
            //
    
    {   alTemp = readFileTemp(f, alTemp);// reads the files into  a temporary arrayList
        int n = alTemp.size();//size if array list
        
        DefaultTableModel model=(DefaultTableModel) contTable.getModel();
        model.setRowCount(0);//deletes the table before updation
         //data of object array to be fed in the jTable

            for(int i=0;i<n;i++){    // loop the arraylist to fetch each row and enter into table 
            ArrayList rec = (ArrayList) alTemp.get(i);
            model.addRow(rec.toArray());
            }
            
        
    }
    public ArrayList readFileTemp(File f, ArrayList alTemp) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        
        alTemp.clear();
        for(String line; (line = br.readLine()) != null; ) 
        addRowToArrayListTemp(line,alTemp);
        
    return alTemp;
    
    
    }
    public void addRowToArrayListTemp(String s, ArrayList alArr){
    
        String sArr[]=s.split("\t\t\t\t");
        ArrayList al=new ArrayList();
        for(String x : sArr)
        al.add(x);//add record to arraylist element 
       
        alArr.add(al);//add the whole row to the arraylist
    
    }
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
            java.util.logging.Logger.getLogger(ContactManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContactManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContactManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContactManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new ContactManager().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(ContactManager.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        
        
    }
    public ArrayList addRowToArrayList(String s){
    
        String sArr[]=s.split("\t\t\t\t");
        ArrayList al=new ArrayList();
        for(String x : sArr)
        al.add(x);//add record to arraylist element 
       
    
    return al;//add the whole row to the arraylist
    
    }
    
    public void readFile(File f) throws FileNotFoundException, IOException{
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
         alArr.clear();
        for(String line; (line = br.readLine()) != null; ) 
        addRowToArrayList(line);
    
    
    }
     
     
    //Final Update File string passed is all formatted arraylistt
    public void UpdateFileAndTable(ArrayList aLArr,File f) throws IOException
    {
        String s = formatList(aLArr);
        char buffer[]=new char[s.length()];
        s.getChars(0, s.length(), buffer, 0);
        FileWriter fout = new FileWriter(f);
        
    for (int i=0; i < buffer.length; i += 1) {
      fout.write(buffer[i]);
    }
    fout.close();
    //after updating file, also update table
        UpdateTable(aLArr);


    }
    public boolean ModifyList(ArrayList alArr){
//        contTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
//        public void valueChanged(ListSelectionEvent event) {
//           
//            String retrievedRow=contTable.getValueAt(contTable.getSelectedRow(),0).toString();
//            System.out.println(retrievedRow);
//            
//            
//        }
//    });
        ArrayList temp =(ArrayList) alArr.get(0);//retrieved that record
        ModifyRecord(temp);
        return true;
     }
    public boolean ModifyRecord(ArrayList temp)
    {
       
        temp.remove(2);
        temp.add(2, "Ronak");
        return true; 
    }
    
    public  String formatList(ArrayList alArr)throws IOException
    {   
        String formatedString = alArr.toString().replace(", [", "\n")  
    .replace("[", "")
    .replace("]", "")
    .replace(", ", "\t\t\t\t")           
    .trim(); 
        return formatedString;
     }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable contTable;
    private javax.swing.JScrollPane dispPanel;
    private javax.swing.JLabel fname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lname;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel testLabel;
    private javax.swing.JTextField tx_fname;
    private javax.swing.JTextField tx_lname;
    // End of variables declaration//GEN-END:variables
}
