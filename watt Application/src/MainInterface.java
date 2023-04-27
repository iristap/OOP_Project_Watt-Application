
import java.awt.event.ContainerEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */
public class MainInterface extends javax.swing.JFrame {

    ArrayList<Watt> wattlist;
    String header[] = new String[]{"Name", "Watt", "Time", "Time", "Date", "unit"};
    DefaultTableModel dtm;
    SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
    int row, col;

    /**
     * Creates new form MainInterface
     */
    public MainInterface() {
        initComponents();
        wattlist = new ArrayList<>();
        dtm = new DefaultTableModel(header, 0);
        jTable2.setModel(dtm);
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

        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextWatt = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextTime1 = new javax.swing.JTextField();
        jTextTime2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Electric Bill Calculator");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setText("Name");

        jLabel3.setText("Watt");

        jLabel4.setText("Time");

        jTextTime1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTime1ActionPerformed(evt);
            }
        });

        jTextTime2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextTime2ActionPerformed(evt);
            }
        });

        jLabel5.setText("-");

        jLabel6.setText("Date");

        jDateChooser1.setDateFormatString("dd-MM-yyyy");

        jLabel9.setVisible(false);
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("*Input must not be Character or Zero");
        jLabel9.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel9ComponentAdded(evt);
            }
        });
        jLabel9.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel9FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabel9FocusLost(evt);
            }
        });

        jLabel7.setVisible(false);
        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("*Format is NN:NN eg. 14:30 - 16:00");

        jLabel8.setVisible(false);
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("*Must 1<2");

        jLabel11.setVisible(false);
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*Enter name");
        jLabel11.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jLabel11ComponentAdded(evt);
            }
        });
        jLabel11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jLabel11FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jLabel11FocusLost(evt);
            }
        });

        jLabel10.setVisible(false);
        jLabel10.setForeground(new java.awt.Color(255, 0, 0));
        jLabel10.setText("*Choose Date");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextWatt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                            .addComponent(jTextTime1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addGap(5, 5, 5)
                        .addComponent(jTextTime2, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jTextName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7))
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextWatt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextTime2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Save");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jButton5.setText("Search");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        jLabel7.setVisible(true);
        String name = jTextName.getText();
        if(jTextName.getText().length()==0)
        {
            jLabel11.setVisible(true);
        }
        else{
            jLabel11.setVisible(false);
        }
        int watt=0,chk=0;
        try{
        for(int i=0;i<jTextWatt.getText().length();i++){
            if(jTextWatt.getText().charAt(i)>=48&&jTextWatt.getText().charAt(i)<=57){
                chk++;
            }
            else {
                watt=0;
                break;
            }
        } 
        if(chk==jTextWatt.getText().length()){
            watt = Integer.parseInt(jTextWatt.getText());
        }

        
        
        String time1 = jTextTime1.getText();
        String time2 = jTextTime2.getText();
        String[] sp1 = time1.split(":");
        String[] sp2 = time2.split(":");
        double hrbf = Double.parseDouble(sp1[0]) + Double.parseDouble(sp1[1]) / 60.0;
        double hraf = Double.parseDouble(sp2[0]) + Double.parseDouble(sp2[1]) / 60.0;
        
        jLabel10.setVisible(false);
        jLabel7.setVisible(false);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String date = sdf.format(jDateChooser1.getDate());
        
        if(watt==0||hraf<hrbf) {
            if(watt==0){
                jLabel9.setVisible(true);
            }else{jLabel9.setVisible(false);}
            if(hraf<hrbf){
                jLabel8.setVisible(true);
            }else{jLabel8.setVisible(false);}
            
        }
        else {
            double unit = calUnite(hrbf, hraf, watt);
            wattlist.add(new Watt(name, watt, time1, time2, date, unit));
            dtm.setRowCount(0);//reset data model
            for (int i = 0; i < wattlist.size(); i++) {
                Object[] objs = {wattlist.get(i).name, wattlist.get(i).watt, wattlist.get(i).time1, wattlist.get(i).time2, wattlist.get(i).date, wattlist.get(i).unit};
                dtm.addRow(objs);
            } 
            clearField();//reset
            jDateChooser1.setCalendar(null);
            jLabel9.setVisible(false);
            jLabel8.setVisible(false);
            jLabel7.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
        }
       }catch(Exception x){
           if(jDateChooser1.getCalendar()==null){
               jLabel10.setVisible(true);
           }else{jLabel10.setVisible(false); }
            jLabel8.setVisible(false);
            if(watt==0){
                jLabel9.setVisible(true);
            }else{jLabel9.setVisible(false);}
       }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    public double calUnite(double t1, double t2, int watt) {
        double hr, unit;

        hr = t2 - t1;

        unit = hr * watt / 1000;

        return (double) Math.round(unit * 100) / 100;
    }

    private void clearField() {
        jTextName.requestFocus();
        jTextName.setText("");
        jTextWatt.setText("");
        jTextTime1.setText("");
        jTextTime2.setText("");
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogResult = JOptionPane.showConfirmDialog(this, "Delete this data", "Delete", dialogButton);
        if (dialogResult == 0) {
            dtm.removeRow(row);
            wattlist.remove(row);
            dtm.setRowCount(0);//reset table 
            for (int i = 0; i < wattlist.size(); i++) {
                Object[] objs = {wattlist.get(i).name, wattlist.get(i).watt, wattlist.get(i).time1, wattlist.get(i).time2, wattlist.get(i).date, wattlist.get(i).unit};
                dtm.addRow(objs);
            }
            clearField();
        } else {

        }


    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        jLabel7.setVisible(true);
        String updatedname = jTextName.getText();
         if(jTextName.getText().length()==0)
        {
            jLabel11.setVisible(true);
        }
        else{
            jLabel11.setVisible(false);
        }
        int updatedwatt=0,chk=0;
        try{
        for(int i=0;i<jTextWatt.getText().length();i++){
            if(jTextWatt.getText().charAt(i)>=48&&jTextWatt.getText().charAt(i)<=57){
                chk++;
            }
            else {
                updatedwatt=0;
                break;
                
            }
        } 
        if(chk==jTextWatt.getText().length()){
            updatedwatt = Integer.parseInt(jTextWatt.getText());
        }
        
        String updatedtime1 = jTextTime1.getText();
        String updatedtime2 = jTextTime2.getText();
        String[] sp1 = updatedtime1.split(":");
        String[] sp2 = updatedtime2.split(":");
        double hrbf = Double.parseDouble(sp1[0]) + Double.parseDouble(sp1[1]) / 60.0;
        double hraf = Double.parseDouble(sp2[0]) + Double.parseDouble(sp2[1]) / 60.0;
        
        jLabel10.setVisible(false);
        jLabel7.setVisible(false);
        
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String updateddate = sdf.format(jDateChooser1.getDate());

        if(updatedwatt==0||hraf<hrbf) {
            if(updatedwatt==0){
                jLabel9.setVisible(true);
            }else{jLabel9.setVisible(false);}
            if(hraf<hrbf){
                jLabel8.setVisible(true);
            }else{jLabel8.setVisible(false);}
            
        }
         else {
            wattlist.get(row).name = updatedname;
            wattlist.get(row).watt = updatedwatt;
            wattlist.get(row).time1 = updatedtime1;
            wattlist.get(row).time2 = updatedtime2;
            wattlist.get(row).date = updateddate;
            double unit = calUnite(hrbf, hraf, updatedwatt);
            wattlist.get(row).unit = unit;
            dtm.setRowCount(0);//reset table and repopulated
            for (int i = 0; i < wattlist.size(); i++) {
                Object[] objs = {wattlist.get(i).name, wattlist.get(i).watt, wattlist.get(i).time1, wattlist.get(i).time2, wattlist.get(i).date,wattlist.get(i).unit};
                dtm.addRow(objs);
            }
            clearField();//reset
            jDateChooser1.setCalendar(null);
            jLabel9.setVisible(false);
            jLabel8.setVisible(false);
            jLabel7.setVisible(false);
            jLabel10.setVisible(false);
            jLabel11.setVisible(false);
        }
       }catch(Exception x){
           if(jDateChooser1.getCalendar()==null){
               jLabel10.setVisible(true);
           }else{jLabel10.setVisible(false); }
            jLabel8.setVisible(false);
            if(updatedwatt==0){
                jLabel9.setVisible(true);
            }else{jLabel9.setVisible(false);}
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        try {
            // TODO add your handling code here:
            int i;
            for (i = 0; i < wattlist.size(); i++) {
                Writer writer = new FileWriter("Wattlist.txt", true);
                writer.write(wattlist.get(i).getName() + "," + wattlist.get(i).getWatt() + "," + wattlist.get(i).time1 + "," + wattlist.get(i).time2 + "," + wattlist.get(i).getDate() + "," + wattlist.get(i).unit + "\n");
                writer.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(MainInterface.class.getName()).log(Level.SEVERE, null, ex);
        }
        dtm.setRowCount(0);
        wattlist.clear();


    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTextTime1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTime1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTime1ActionPerformed

    private void jTextTime2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextTime2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextTime2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        new SearchInterface().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        
        row = jTable2.getSelectedRow();
        col = jTable2.getColumnCount();
        System.out.println(row + "," + col);
        jTextName.setText(dtm.getValueAt(row, 0).toString());
        jTextWatt.setText(dtm.getValueAt(row, 1).toString());
        jTextTime1.setText(dtm.getValueAt(row, 2).toString());
        jTextTime2.setText(dtm.getValueAt(row, 3).toString());
        
        Date date1;
        try {
            date1 = new SimpleDateFormat("dd-MM-yyyy").parse(dtm.getValueAt(row, 4).toString());
            jDateChooser1.setDate(date1);
        } catch (ParseException ex) { }

    }//GEN-LAST:event_jTable2MouseClicked

    private void jLabel9FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel9FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9FocusGained

    private void jLabel9FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel9FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9FocusLost

    private void jLabel9ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel9ComponentAdded
        jLabel9.setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9ComponentAdded

    private void jLabel11ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jLabel11ComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11ComponentAdded

    private void jLabel11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel11FocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11FocusGained

    private void jLabel11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jLabel11FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11FocusLost

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
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextName;
    private javax.swing.JTextField jTextTime1;
    private javax.swing.JTextField jTextTime2;
    private javax.swing.JTextField jTextWatt;
    // End of variables declaration//GEN-END:variables
}
