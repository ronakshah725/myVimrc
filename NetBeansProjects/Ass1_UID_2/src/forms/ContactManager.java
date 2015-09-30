package forms;

import forms.Validate;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.swing.AbstractButton;
import javax.swing.Action;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.DocumentFilter;
import javax.swing.text.PlainDocument;
/**
 *
 * @author ronakshahmac
 */
public class ContactManager extends javax.swing.JFrame  {

    /**
     * Creates new form ContactManager
     */
    private static String firstname;
    private static String lastname;
    private static String mname;
    private static String gender;
    private static String phone;
    private static String state_string;
    private static String city;
    private static String add1;
    private static String add2;
    private static String zip;
    private static String country;
    private static String email;
    private static boolean isSaveClickedAfterModify;
    private static JLabel [] labelArray;
    private static boolean allFieldsValid;
   
    
   
   /*
    the program is implemented by using Array List Collection in java. All the data is saved in the array 
    list, row by row
    */
   
    
    private static File f;
    private static ArrayList<ArrayList> alArr;
    private static int currRowIndex;
    public ContactManager() throws IOException {
        initComponents();
        f = new File("/Users/ronakshahmac/NetBeansProjects/Ass1_UID_1/src/forms/list_contact.txt");  
        alArr  = new ArrayList<> (1000); 
        initState();
        
         
        
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderGroup = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        fname = new javax.swing.JLabel();
        lname = new javax.swing.JLabel();
        fname_tx = new javax.swing.JTextField();
        lname_tx = new javax.swing.JTextField();
        testLabel = new javax.swing.JLabel();
        midnameLabel = new javax.swing.JLabel();
        mname_tx = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        al1_tx = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        al2_tx = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        city_tx = new javax.swing.JTextField();
        state_tx = new javax.swing.JTextField();
        zip_tx = new javax.swing.JTextField();
        pNumber_tx = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        gen_tx = new javax.swing.JTextField();
        dispPanel = new javax.swing.JScrollPane();
        contTable = new javax.swing.JTable();
        testLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        emailLabel = new javax.swing.JLabel();
        email_t = new javax.swing.JTextField();
        country_t = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        fname_v = new javax.swing.JLabel();
        mname_v = new javax.swing.JLabel();
        lname_v = new javax.swing.JLabel();
        gen_v = new javax.swing.JLabel();
        email_v = new javax.swing.JLabel();
        zip_v = new javax.swing.JLabel();
        phone_v = new javax.swing.JLabel();
        city_v = new javax.swing.JLabel();
        addr2_v = new javax.swing.JLabel();
        country_v = new javax.swing.JLabel();
        address_v = new javax.swing.JLabel();
        state_v = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        buttonPanel = new javax.swing.JPanel();
        saveButton = new javax.swing.JButton();
        newButton = new javax.swing.JButton();
        modifyButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        doneButton = new javax.swing.JButton();
        statusPanel = new javax.swing.JPanel();
        notifyLabel = new javax.swing.JLabel();
        statusLabel = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel6.setText("Click on a row to modify/delete it");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contact Manager");
        setBounds(new java.awt.Rectangle(250, 23, 0, 0));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(773, 700));
        setSize(800,((int) Toolkit.getDefaultToolkit().getScreenSize().getHeight()) );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Enter the Information", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Grande", 1, 14))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 400));

        fname.setText("First Name *");

        lname.setText("Last Name *");

        fname_tx.setToolTipText("");
        fname_tx.setFocusTraversalPolicyProvider(true);
        fname_tx.setNextFocusableComponent(mname_tx);
        fname_tx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fname_txFocusLost(evt);
            }
        });
        fname_tx.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                fname_txMouseEntered(evt);
            }
        });
        fname_tx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fname_txActionPerformed(evt);
            }
        });

        lname_tx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fname_txFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                lname_txFocusLost(evt);
            }
        });

        midnameLabel.setText("Middle Name");

        mname_tx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mname_txFocusLost(evt);
            }
        });
        mname_tx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mname_txActionPerformed(evt);
            }
        });

        jLabel2.setText("Gender *");

        jLabel3.setText("Address Line 1 *");
        jLabel3.setAlignmentY(0.0F);

        al1_tx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fname_txFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                al1_txFocusLost(evt);
            }
        });

        jLabel5.setText("Address Line 2");

        al2_tx.setToolTipText("mm");
        al2_tx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fname_txFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                al2_txFocusLost(evt);
            }
        });
        al2_tx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                al2_txActionPerformed(evt);
            }
        });

        jLabel7.setText("State *");

        jLabel8.setText("Zipcode *");

        jLabel9.setText("Phone Number *");

        city_tx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fname_txFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                city_txFocusLost(evt);
            }
        });
        city_tx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                city_txActionPerformed(evt);
            }
        });

        state_tx.setToolTipText("asasas");
        state_tx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fname_txFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                state_txFocusLost(evt);
            }
        });

        zip_tx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fname_txFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                zip_txFocusLost(evt);
            }
        });

        pNumber_tx.setToolTipText("ToolTip demo");
        pNumber_tx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fname_txFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                pNumber_txFocusLost(evt);
            }
        });

        jLabel13.setText("City *");

        gen_tx.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fname_txFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                gen_txFocusLost(evt);
            }
        });
        gen_tx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gen_txActionPerformed(evt);
            }
        });

        contTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "First Name", "Last Name", "Phone Number", "City"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        contTable.setBounds(new java.awt.Rectangle(0, 0, 100, 0));
        contTable.setFocusTraversalKeysEnabled(false);
        contTable.setMaximumSize(new java.awt.Dimension(180, 176));
        contTable.setOpaque(false);
        contTable.setRowHeight(24);
        contTable.setShowGrid(false);
        contTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                contTableMousePressed(evt);
            }
        });
        dispPanel.setViewportView(contTable);

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        emailLabel.setText("Email *");

        email_t.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fname_txFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                email_tFocusLost(evt);
            }
        });
        email_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                email_tActionPerformed(evt);
            }
        });

        country_t.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fname_txFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                country_tFocusLost(evt);
            }
        });
        country_t.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                country_tActionPerformed(evt);
            }
        });

        jLabel10.setText("Country *");

        fname_v.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        fname_v.setForeground(new java.awt.Color(255, 0, 0));
        fname_v.setFocusTraversalKeysEnabled(false);
        fname_v.setFocusable(false);

        mname_v.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        mname_v.setForeground(new java.awt.Color(255, 0, 0));
        mname_v.setFocusTraversalKeysEnabled(false);
        mname_v.setFocusable(false);
        mname_v.setPreferredSize(new java.awt.Dimension(45, 16));
        mname_v.setSize(new java.awt.Dimension(45, 16));

        lname_v.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        lname_v.setForeground(new java.awt.Color(255, 0, 0));
        lname_v.setFocusTraversalKeysEnabled(false);
        lname_v.setFocusable(false);
        lname_v.setPreferredSize(new java.awt.Dimension(45, 16));
        lname_v.setSize(new java.awt.Dimension(45, 16));

        gen_v.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        gen_v.setForeground(new java.awt.Color(255, 0, 0));
        gen_v.setFocusTraversalKeysEnabled(false);
        gen_v.setFocusable(false);
        gen_v.setPreferredSize(new java.awt.Dimension(45, 16));
        gen_v.setSize(new java.awt.Dimension(45, 16));

        email_v.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        email_v.setForeground(new java.awt.Color(255, 0, 0));
        email_v.setFocusTraversalKeysEnabled(false);
        email_v.setFocusable(false);
        email_v.setPreferredSize(new java.awt.Dimension(45, 16));
        email_v.setSize(new java.awt.Dimension(45, 16));

        zip_v.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        zip_v.setForeground(new java.awt.Color(255, 0, 0));
        zip_v.setFocusTraversalKeysEnabled(false);
        zip_v.setFocusable(false);
        zip_v.setPreferredSize(new java.awt.Dimension(45, 16));
        zip_v.setSize(new java.awt.Dimension(45, 16));

        phone_v.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        phone_v.setForeground(new java.awt.Color(255, 0, 0));
        phone_v.setFocusTraversalKeysEnabled(false);
        phone_v.setFocusable(false);
        phone_v.setPreferredSize(new java.awt.Dimension(45, 16));
        phone_v.setSize(new java.awt.Dimension(45, 16));

        city_v.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        city_v.setForeground(new java.awt.Color(255, 0, 0));
        city_v.setFocusTraversalKeysEnabled(false);
        city_v.setFocusable(false);
        city_v.setPreferredSize(new java.awt.Dimension(45, 16));
        city_v.setSize(new java.awt.Dimension(45, 16));

        addr2_v.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        addr2_v.setForeground(new java.awt.Color(255, 0, 0));
        addr2_v.setFocusTraversalKeysEnabled(false);
        addr2_v.setFocusable(false);
        addr2_v.setPreferredSize(new java.awt.Dimension(45, 16));
        addr2_v.setSize(new java.awt.Dimension(45, 16));

        country_v.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        country_v.setForeground(new java.awt.Color(255, 0, 0));
        country_v.setFocusTraversalKeysEnabled(false);
        country_v.setFocusable(false);
        country_v.setPreferredSize(new java.awt.Dimension(45, 16));
        country_v.setSize(new java.awt.Dimension(45, 16));

        address_v.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        address_v.setForeground(new java.awt.Color(255, 0, 0));
        address_v.setFocusTraversalKeysEnabled(false);
        address_v.setFocusable(false);
        address_v.setPreferredSize(new java.awt.Dimension(45, 16));
        address_v.setSize(new java.awt.Dimension(45, 16));

        state_v.setFont(new java.awt.Font("Lucida Grande", 2, 10)); // NOI18N
        state_v.setForeground(new java.awt.Color(255, 0, 0));
        state_v.setFocusTraversalKeysEnabled(false);
        state_v.setFocusable(false);
        state_v.setPreferredSize(new java.awt.Dimension(45, 16));
        state_v.setSize(new java.awt.Dimension(45, 16));

        jProgressBar1.setBackground(new java.awt.Color(51, 204, 0));
        jProgressBar1.setStringPainted(true);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 51));
        jLabel1.setText("Progress Tracker");
        jLabel1.setPreferredSize(new java.awt.Dimension(45, 12));

        saveButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        saveButton.setForeground(new java.awt.Color(39, 137, 39));
        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        newButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        newButton.setText("NEW");
        newButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newButtonActionPerformed(evt);
            }
        });

        modifyButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        modifyButton.setText("MODIFY");
        modifyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifyButtonActionPerformed(evt);
            }
        });

        deleteButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(253, 108, 120));
        deleteButton.setText("DELETE");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        doneButton.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        doneButton.setText("DONE");
        doneButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doneButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                .addComponent(modifyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(doneButton, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        buttonPanelLayout.setVerticalGroup(
            buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton)
                    .addComponent(modifyButton)
                    .addComponent(doneButton)
                    .addComponent(deleteButton)
                    .addComponent(newButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        buttonPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {deleteButton, doneButton, modifyButton, newButton, saveButton});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(midnameLabel)
                    .addComponent(jLabel13)
                    .addComponent(jLabel9)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailLabel)
                    .addComponent(jLabel5)
                    .addComponent(lname)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel3)
                    .addComponent(fname))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(zip_tx, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(state_tx, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(state_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(address_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(addr2_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(email_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(gen_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(lname_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(mname_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel1Layout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(phone_v, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fname_tx, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, 192, Short.MAX_VALUE)
                                .addComponent(fname_v, javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(mname_tx, javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(lname_tx, javax.swing.GroupLayout.Alignment.CENTER)
                                .addComponent(gen_tx, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pNumber_tx, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(city_tx, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(city_v, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(email_t, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(zip_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(country_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(al1_tx, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(al2_tx, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(country_t, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dispPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(testLabel)
                    .addComponent(testLabel1)))
            .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {fname, lname});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {al1_tx, al2_tx, city_tx, email_t, fname_tx, gen_tx, lname_tx, mname_tx, pNumber_tx, state_tx, zip_tx});

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addr2_v, address_v, city_v, country_v, email_v, fname_v, gen_v, lname_v, mname_v, phone_v, state_v, zip_v});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(fname_tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fname))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fname_v, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mname_tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(midnameLabel))
                        .addGap(3, 3, 3)
                        .addComponent(mname_v, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lname_tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lname))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addComponent(testLabel)
                                .addGap(67, 67, 67)
                                .addComponent(testLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lname_v, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(gen_tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(4, 4, 4)
                                .addComponent(gen_v, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(email_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLabel))
                                .addGap(3, 3, 3)
                                .addComponent(email_v, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(pNumber_tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(phone_v, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(al1_tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(address_v, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(al2_tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(7, 7, 7)
                        .addComponent(addr2_v, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(city_tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(city_v, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(state_tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(state_v, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(zip_tx, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(7, 7, 7)
                        .addComponent(zip_v, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(country_t, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(0, 0, 0)
                        .addComponent(country_v, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dispPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator1))))
                .addGap(18, 18, 18)
                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {al1_tx, lname_tx});

        statusPanel.setBackground(new java.awt.Color(204, 204, 204));
        statusPanel.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        notifyLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        notifyLabel.setText("Notifications:");

        statusLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        javax.swing.GroupLayout statusPanelLayout = new javax.swing.GroupLayout(statusPanel);
        statusPanel.setLayout(statusPanelLayout);
        statusPanelLayout.setHorizontalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(notifyLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(statusLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        statusPanelLayout.setVerticalGroup(
            statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statusPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(statusPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notifyLabel)
                    .addComponent(statusLabel))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(statusPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 761, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 654, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(statusPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void initState() throws IOException{
        readFile(f);
        UpdateTable(alArr);
        statusLabel.setText("Welcome !!");
        save(1);
        modify(0);
        
        delete(0);
        newB(1);
        savec(0);
//        cancel(0);
        setTextFieldLimit();
        isSaveClickedAfterModify=false;
        setToolTips();
        allFieldsValid=false;
       
        
        
        
        
    }
//    private String[] getErrorLabels(){
//        String errors[]={};
//    } 
    
    
    public void setToolTips(){
        fname_tx.setToolTipText("Enter your first name (maximum 20 characters)");
    }
    public void setTextFieldLimit(){
        restrictToNumbers(zip_tx);
        restrictToNumbers(pNumber_tx);
 fname_tx.setDocument(new RestrictTextField(20));
 lname_tx.setDocument(new RestrictTextField(20));
mname_tx.setDocument(new RestrictTextField(1));
       
gen_tx.setDocument(new RestrictTextField(1));
        
pNumber_tx.setDocument(new RestrictTextField(21));
al1_tx.setDocument(new RestrictTextField(35));
al2_tx.setDocument(new RestrictTextField(35));
city_tx.setDocument(new RestrictTextField(25));
state_tx.setDocument(new RestrictTextField(2));
zip_tx.setDocument(new RestrictTextField(9));
country_t.setDocument(new RestrictTextField(30));
email_t.setDocument(new RestrictTextField(100));

        
        
        
    }
    public void setErrorLabels(ArrayList e){
        fname_v.setText(""); 
        mname_v.setText(""); 
        lname_v.setText(""); 
        gen_v.setText(""); 
        email_v.setText(""); 
        phone_v.setText(""); 
        address_v.setText(""); 
        addr2_v.setText("");
        
     
        city_v.setText(""); 
         state_v.setText("");
         zip_v.setText(""); 
        country_v.setText(""); 
        
        
    }    
    
    public void clearFields(){
        fname_tx.setText(null);
        lname_tx.setText(null);
        mname_tx.setText(null);
        gen_tx.setText(null);
        pNumber_tx.setText(null);
        al1_tx.setText(null);
        al2_tx.setText(null);
        city_tx.setText(null);
        state_tx.setText(null);
        zip_tx.setText(null);
        email_t.setText(null);
        country_t.setText(null);
        
        
        
    }
    public String getLatestString(){
        
         firstname = fname_tx.getText();
        lastname = lname_tx.getText();
        mname=mname_tx.getText();
       
        gender=gen_tx.getText();
        
        phone=pNumber_tx.getText();
        add1=al1_tx.getText();
        add2=al2_tx.getText();
        city=city_tx.getText();
        state_string=state_tx.getText();
        zip=zip_tx.getText();
        country=country_t.getText();
        email=email_t.getText();
        String seperator="\t";
        return firstname+seperator+mname+seperator+lastname+seperator+gender+seperator+email+seperator+phone+seperator+add1+seperator+add2+seperator+city+seperator+state_string+seperator+zip+seperator+country;
    }// gets the latest string from the textboxes
    
    private void fname_txActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fname_txActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fname_txActionPerformed
    
    private void contTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contTableMousePressed
        // TODO add your handling code here:
        onRowClick(alArr);
    }//GEN-LAST:event_contTableMousePressed

    private void gen_txActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gen_txActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gen_txActionPerformed

    private void country_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_country_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_country_tActionPerformed

    private void al2_txActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_al2_txActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_al2_txActionPerformed

    private void fname_txFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fname_txFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_fname_txFocusGained

    private void fname_txMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fname_txMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_fname_txMouseEntered

    private void email_tActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_email_tActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_email_tActionPerformed

    private void fname_txFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fname_txFocusLost
        // TODO add your handling code here:
        
        String firstname=fname_tx.getText();
            Pattern p = Pattern.compile("[a-zA-Z]");
            boolean valid=true;
           
            
                 if(isNullOrWhitespace(firstname)){
                fname_v.setText("Cannot be left blank.");
                valid=false;
                 }
            
                 else  if(!isAlpha(firstname)){
                fname_v.setText("First Name can only contain alphabets.");
                valid=false;
                
            }
             if(valid)
             {
                fname_v.setText("");
                jProgressBar1.setValue(10);
                mname_tx.requestFocus();
             }
            
    }//GEN-LAST:event_fname_txFocusLost

    private void mname_txActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mname_txActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mname_txActionPerformed

    private void mname_txFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mname_txFocusLost
        // TODO add your handling code here:
        String middlename=mname_tx.getText();
            Pattern p = Pattern.compile("[a-zA-Z]");
            boolean valid=true;
           
            
                 
            
             if(!isAlpha(middlename)){
                mname_v.setText("Middle Name can only contain alphabets.");
                valid=false;
                
            }
              if(valid)
             {
                mname_v.setText("");
                
                lname_tx.requestFocus();
             }
        
    }//GEN-LAST:event_mname_txFocusLost

    private void lname_txFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lname_txFocusLost
        // TODO add your handling code here:
        String lastname=lname_tx.getText();
            Pattern p = Pattern.compile("[a-zA-Z]");
            boolean valid=true;
         if(isNullOrWhitespace(lastname)){
                lname_v.setText("Cannot be left blank.");
                valid=false;
                 }
            
                 
            
         else if(!isAlpha(lastname)){
                lname_v.setText("Last Name can only contain alphabets.");
                valid=false;
                
            }
             if(valid)
             {
                lname_v.setText("");
                jProgressBar1.setValue(20);
                //gen_tx.requestFocus();
             }
        
                                  

        
    }//GEN-LAST:event_lname_txFocusLost

    private void gen_txFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_gen_txFocusLost
        // TODO add your handling code here:
        String gen=gen_tx.getText();
            
            boolean valid=true;
           
            
                 if(isNullOrWhitespace(gen)){
                gen_v.setText("Cannot be left blank.");
                valid=false;
                 }
            
            else if(!("M".equals(gen)||"F".equals(gen)||"m".equals(gen)||"f".equals(gen))){
                gen_v.setText("Gender can only contain M or F");
                valid=false;
                
            }
             if(valid)
             {
                gen_v.setText("");
                jProgressBar1.setValue(30);
               // email_t.requestFocus();
             }
            
        
    }//GEN-LAST:event_gen_txFocusLost

    private void email_tFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_email_tFocusLost
        // TODO add your handling code here:
        String email=email_t.getText();
            
            boolean valid=true;
           
            Validate v = new Validate();
                 if(isNullOrWhitespace(email)){
                email_v.setText("Cannot be left blank.");
                valid=false;
                 }
            
            else if(!v.isValidEmail(email)){
                email_v.setText("Invalid email address");
                valid=false;
                
            }
             if(valid)
             {
                email_v.setText("");
                jProgressBar1.setValue(40);
               // pNumber_tx.requestFocus();
             }
            
    }//GEN-LAST:event_email_tFocusLost

    private void pNumber_txFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pNumber_txFocusLost

        // TODO add your handling code here:
        String pnum=pNumber_tx.getText();
            
            boolean valid=true;
           
            
                 if(isNullOrWhitespace(pnum)){
                phone_v.setText("Cannot be left blank.");
                valid=false;
                 }
            
           else  if(pnum.length()!=10){
                phone_v.setText("Invalid phone nummber");
                valid=false;
                
            }
             if(valid)
             {
                phone_v.setText("");
                jProgressBar1.setValue(50);
               // al1_tx.requestFocus();
             }
            
    }//GEN-LAST:event_pNumber_txFocusLost

    private void al1_txFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_al1_txFocusLost
        // TODO add your handling code here:
        String add1=al1_tx.getText();
            
            boolean valid=true;
           
            
                 if(isNullOrWhitespace(add1)){
                address_v.setText("Cannot be left blank.");
                valid=false;
                 }
            
             
            if(valid)
             {
                address_v.setText("");
                jProgressBar1.setValue(60);
              //  al2_tx.requestFocus();
             }
    }//GEN-LAST:event_al1_txFocusLost

    private void state_txFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_state_txFocusLost

        // TODO add your handling code here:
        String state=state_tx.getText();
            
            boolean valid=true;
           
            
                 if(isNullOrWhitespace(state)){
                state_v.setText("Cannot be left blank.");
                valid=false;
                 }
           else if(state.length()>2){
                state_v.setText("Enter only two letters for state");
                valid=false;
            }
             
             if(valid)
             {
                state_v.setText("");
                jProgressBar1.setValue(80);
               // zip_tx.requestFocus();
             }
        
    }//GEN-LAST:event_state_txFocusLost

    private void city_txFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_city_txFocusLost
        // TODO add your handling code here:
         String city=city_tx.getText();
            
            boolean valid=true;
           
            
                 if(isNullOrWhitespace(city)){
                city_v.setText("Cannot be left blank.");
                valid=false;
                 }
           else if(!isAlpha(city)){
                city_v.setText("City can only contain alphabets.");
                valid=false;
                
            }
             
           if(valid)
             {
                city_v.setText("");
                jProgressBar1.setValue(70);
               // state_tx.requestFocus();
             }
    }//GEN-LAST:event_city_txFocusLost

    private void zip_txFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_zip_txFocusLost
        // TODO add your handling code here:
        String zip=zip_tx.getText();
            
            boolean valid=true;
           
            
                 if(isNullOrWhitespace(zip)){
                zip_v.setText("Cannot be left blank.");
                valid=false;
                 }
            
            else if(zip.length()!=9){
                zip_v.setText("Invalid Zip Code");
                valid=false;
                
            }
           if(valid)
             {
                zip_v.setText("");
                jProgressBar1.setValue(90);
               // country_t.requestFocus();
             }
        
        
    }//GEN-LAST:event_zip_txFocusLost

    private void country_tFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_country_tFocusLost
        // TODO add your handling code here:
        String country=country_t.getText();
            
            boolean valid=true;
           
            
                 if(isNullOrWhitespace(country)){
                country_v.setText("Cannot be left blank.");
                valid=false;
                 }
            
           else  if(!isAlpha(country)){
                country_v.setText("Invalid country");
                valid=false;
                
            }
             if(valid)
             {
                country_v.setText("");
                jProgressBar1.setValue(100);
                saveButton.requestFocus();
                
             }
        
    }//GEN-LAST:event_country_tFocusLost
    public boolean allFieldsValid(){
        if(fname_v.getText()==""&&mname_v.getText()==""&&
                        lname_v.getText()==""&&gen_v.getText()==""&&email_v.getText()==""&&
                        phone_v.getText()==""&&address_v.getText()==""&&city_v.getText()==""&&
                        state_v.getText()==""&&zip_v.getText()==""&&country_v.getText()==""
                        ){
                    allFieldsValid=true;
                    
                }
        else allFieldsValid=false;
        return allFieldsValid;
    }
    private void al2_txFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_al2_txFocusLost
        // TODO add your handling code here:
        city_tx.requestFocus();
    }//GEN-LAST:event_al2_txFocusLost

    private void city_txActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_city_txActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_city_txActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
       //  resetvalidField();
        String newEntry = getLatestString();
        if(allFieldsValid()==false)//checks if all fields are validated
        {
            statusLabel.setText("Correct the errors");
            return;
        }
        
        if(isUnique(alArr, newEntry)&&allFieldsValid()){
        alArr.add(addRowToArrayList(newEntry));
        
        try {
            UpdateFileAndTable(alArr, f);
            statusLabel.setText("Record Added Suuccessfully");
            clearFields();
           // fname_tx.requestFocus();
            save(1);
            modify(0);
            newB(1);
            delete(0);
            savec(0);
            jProgressBar1.setValue(0);
         //   cancel(0);
            
//       
        } catch (IOException ex) {
            Logger.getLogger(ContactManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
        
        else 
        {
        statusLabel.setText("Sorry! Name already exists in the address book");
        
                }
        
    
        //end of else

    }//GEN-LAST:event_saveButtonActionPerformed

    private void newButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newButtonActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        clearFields();
        resetvalidField();
        newB(1);
        modify(0);
        delete(0);
        save(1);
        savec(0);
        //cancel(0);
        jProgressBar1.setValue(0);
        enableEditOfTextFields(1);
        
        //fname_tx.requestFocus();
        resetvalidField();
    }//GEN-LAST:event_newButtonActionPerformed

    private void modifyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifyButtonActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        
        save(0);
        modify(0);
        newB(0);
        delete(0);
        savec(1);
       // cancel(1);
        enableEditOfTextFields(1);
       modifyButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             
                isSaveClickedAfterModify=true;
                
                //two ways to use save , one after modify other after new
                // set when save changes button clicked 
                
            }
        });
        //fname_tx.requestFocus(true);
        jProgressBar1.setValue(0);
        

    }//GEN-LAST:event_modifyButtonActionPerformed

    private void doneButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doneButtonActionPerformed
        // TODO add your handling code here:
          //resetvalidField();
            String latest=getLatestString();
            alArr.remove(currRowIndex);
            
            if(allFieldsValid()==false){
                statusLabel.setText("Correct the errors");
                return;
            }
            
            
            if(isUnique(alArr, latest)&&allFieldsValid())
            {
            
            
            //fetch latest string and 
            //call addrowtoarraylist(latest string) which returns an arraylist 
            
            
            ArrayList newValues = addRowToArrayList(latest);
            
            //alarr.add(returned array list, index)
            alArr.add(currRowIndex, newValues);
            
            try {
                UpdateFileAndTable(alArr, f);
                statusLabel.setText("Record modified successfully");
                savec(0);
                save(1);
                newB(1);
                newButtonActionPerformed(evt);
                //cancel(0);
                jProgressBar1.setValue(0);
                
                
            } catch (IOException ex) {
                
            }
            }
            else 
            {
               statusLabel.setText("Cannot be added as name already exists");
                    
            }
      
        
    }//GEN-LAST:event_doneButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        // TODO add your handling code here:
        // finds the row clicked when delete button is pressed
        // removes the row and updates file and table
        alArr.remove(currRowIndex);
        try {
                UpdateFileAndTable(alArr, f);
                statusLabel.setText("Deleted record ");
                newButtonActionPerformed(evt);
            } catch (IOException ex) {
                
            }
              
    }//GEN-LAST:event_deleteButtonActionPerformed
      
    public boolean isAlpha(String s){
        
        for (int i = 0; i < s.length(); i++) {
        char charAt2 = s.charAt(i);
        if (!(Character.isLetter(charAt2))) {
            return false;
            
        }
    }
       return true;     
}
    //isvalid function fetches thenew input and validates it
    public String isValid(String newEntries){
           
        String validator="" ;
        String s[]=newEntries.split("\t");
        //validate length
        
     
        return validator;
    }
    public boolean isUnique(ArrayList al,String newEntries){
        String s[]=newEntries.split("\t",-1);
        boolean u=true;
        int n = al.size();
        for(int i=0;i<n;i++){    // loop the arraylist to fetch each row and enter required values into table 
            ArrayList rec = (ArrayList) al.get(i);
            if(((String)rec.get(2)).equals(s[2])&&((String)rec.get(0)).equals(s[0])&&((String)rec.get(1)).equals(s[1]))
                
                
                u=false;
            break;
        }
        return u;
    }
    public void UpdateTable(ArrayList alTemp) throws IOException
            //always read table from latest file
            //
    
    {   alTemp = readFileTemp(f, alTemp);// reads the files into  a temporary arrayList
        int n = alTemp.size();//size if array list
        
        DefaultTableModel model=(DefaultTableModel) contTable.getModel();
        model.setRowCount(0);//deletes the table before updation
         //data of object array to be fed in the jTable

            for(int i=0;i<n;i++){    // loop the arraylist to fetch each row and enter required values into table 
            ArrayList rec = (ArrayList) alTemp.get(i);
            Object tempRow[]={rec.get(0),rec.get(2),rec.get(5),rec.get(8)};
            model.addRow(tempRow);
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
    
        String sArr[]=s.split("\t");
        ArrayList al=new ArrayList();
        al.ensureCapacity(20);
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
    
        String sArr[]=s.split("\t");
        ArrayList al=new ArrayList();
        al.ensureCapacity(20);
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
    public void onRowClick(ArrayList alArr){
        resetvalidField();
        contTable.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent event) {
           resetvalidField();
            currRowIndex= contTable.getSelectedRow();
            
            
            if(currRowIndex!=-1)                                       //if valid index returned
            {
                ArrayList temp =(ArrayList) alArr.get(currRowIndex);   //retrieved that record
                changeTextFields(temp);                                      //display that record
                enableEditOfTextFields(0);
                modify(1);
                delete(1);
                save(0);
                newB(1);
                savec(0);
                //cancel(0);
                resetvalidField();
                
                
                
            }
            
            
        }
    });
      
     }
    
    
    public void restrictToNumbers(JTextField field){
        PlainDocument doc = new PlainDocument();
    doc.setDocumentFilter(new DocumentFilter() {
    @Override
    public void insertString(FilterBypass fb, int off, String str, AttributeSet attr) 
        throws BadLocationException 
    {
        fb.insertString(off, str.replaceAll("\\D++", ""), attr);  // remove non-digits
    } 
    @Override
    public void replace(FilterBypass fb, int off, int len, String str, AttributeSet attr) 
        throws BadLocationException 
    {
        fb.replace(off, len, str.replaceAll("\\D++", ""), attr);  // remove non-digits
    }
});

   field.setDocument(doc);
    }
//    
    
    boolean isNullOrWhitespace(String s) {
         if(s.length()==0||s==null||isWhitespace(s))
                return true ;
         
    return false;

}
     static boolean isWhitespace(String s) {
    int length = s.length();
    if (length > 0) {
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    return false;
}
    public void changeTextFields(ArrayList al){
        fname_tx.setText((String)al.get(0));
        mname_tx.setText((String)al.get(1));
        lname_tx.setText((String)al.get(2));
        String gend= (String)al.get(3);
        gen_tx.setText(gend);
        email_t.setText((String)al.get(4));
        pNumber_tx.setText((String)al.get(5));
        al1_tx.setText((String)al.get(6));
        al2_tx.setText((String)al.get(7));
        city_tx.setText((String)al.get(8));
        state_tx.setText((String)al.get(9));
        zip_tx.setText((String)al.get(10));
        country_t.setText((String)al.get(11));
    }
    public void enableEditOfTextFields(int state){
        if(state==1)
        {
        fname_tx.setEditable(true);
        mname_tx.setEditable(true); 
        lname_tx.setEditable(true); 
        gen_tx.setEditable(true);
        email_t.setEditable(true);
        pNumber_tx.setEditable(true); 
        al1_tx.setEditable(true); 
        al2_tx.setEditable(true); 
        city_tx.setEditable(true); 
        state_tx.setEditable(true); 
        zip_tx.setEditable(true); 
        country_t.setEditable(true);
        }  
        else{
        fname_tx.setEditable(false);
        mname_tx.setEditable(false); 
        lname_tx.setEditable(false); 
        gen_tx.setEditable(false);
         email_t.setEditable(false);
        pNumber_tx.setEditable(false); 
        al1_tx.setEditable(false); 
        al2_tx.setEditable(false); 
        city_tx.setEditable(false); 
        state_tx.setEditable(false); 
        zip_tx.setEditable(false);
        country_t.setEditable(false);
        }
        
    }
    public  String formatList(ArrayList alArr)throws IOException
    {   
        String formatedString = alArr.toString().replace(", [", "\n")  
    .replace("[", "")
    .replace("]", "")
    .replace(", ", "\t")           
    .trim(); 
        return formatedString;
     }
    
    public void modify(int state)
    
    {
        if(state==1)//
        {   modifyButton.setEnabled(true);
//            statusLabel.setText("Modify Mode");
        }
        else
            modifyButton.setEnabled(false);
    }
     public void save(int state){
        if(state==1)
        {   saveButton.setEnabled(true);
            //statusLabel.setText("Save Mode");
        }
        else
            saveButton.setEnabled(false);
    }
     
      public void newB(int state){
        if(state==1)
        {   newButton.setEnabled(true);
            
        }
        else
            newButton.setEnabled(false);
    }
       public void delete(int state){
        if(state==1)
        {   deleteButton.setEnabled(true);
//            statusLabel.setText("Delete Mode");
        }
        else
            deleteButton.setEnabled(false);
       }

        public void savec(int state)
        {
        if(state==1)
        {   doneButton.setVisible(true);
            
//            statusLabel.setText("Delete Mode");
        }
        else
            doneButton.setVisible(false);
            
         }
        public void resetvalidField(){
            fname_v.setText(""); 
        mname_v.setText(""); 
        lname_v.setText(""); 
        gen_v.setText(""); 
        email_v.setText(""); 
        phone_v.setText(""); 
        address_v.setText(""); 
        addr2_v.setText("");
        
     
        city_v.setText(""); 
         state_v.setText("");
         zip_v.setText(""); 
        country_v.setText(""); 
        }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addr2_v;
    private javax.swing.JLabel address_v;
    private javax.swing.JTextField al1_tx;
    private javax.swing.JTextField al2_tx;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JTextField city_tx;
    private javax.swing.JLabel city_v;
    private javax.swing.JTable contTable;
    private javax.swing.JTextField country_t;
    private javax.swing.JLabel country_v;
    private javax.swing.JButton deleteButton;
    private javax.swing.JScrollPane dispPanel;
    private javax.swing.JButton doneButton;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField email_t;
    private javax.swing.JLabel email_v;
    private javax.swing.JLabel fname;
    private javax.swing.JTextField fname_tx;
    private javax.swing.JLabel fname_v;
    private javax.swing.JTextField gen_tx;
    private javax.swing.JLabel gen_v;
    private javax.swing.ButtonGroup genderGroup;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lname;
    private javax.swing.JTextField lname_tx;
    private javax.swing.JLabel lname_v;
    private javax.swing.JLabel midnameLabel;
    private javax.swing.JTextField mname_tx;
    private javax.swing.JLabel mname_v;
    private javax.swing.JButton modifyButton;
    private javax.swing.JButton newButton;
    private javax.swing.JLabel notifyLabel;
    private javax.swing.JTextField pNumber_tx;
    private javax.swing.JLabel phone_v;
    private javax.swing.JButton saveButton;
    private javax.swing.JTextField state_tx;
    private javax.swing.JLabel state_v;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JPanel statusPanel;
    private javax.swing.JLabel testLabel;
    private javax.swing.JLabel testLabel1;
    private javax.swing.JTextField zip_tx;
    private javax.swing.JLabel zip_v;
    // End of variables declaration//GEN-END:variables
}

class RestrictTextField extends PlainDocument {
  private int limit;
  RestrictTextField(int limit) {
    super();
    this.limit = limit;
  }

  

  @Override
  public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
    
      
      if (str == null)
      return;

    if ((getLength() + str.length()) <= limit) {
      super.insertString(offset, str, attr);
    }
  }
}


