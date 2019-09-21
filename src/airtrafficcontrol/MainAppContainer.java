/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airtrafficcontrol;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author hashan
 */
public class MainAppContainer extends javax.swing.JFrame {

    Vertex[] airports = new Vertex[1];

    /**
     * Creates new form MainAppContainer
     */
    public MainAppContainer() {
        initComponents();
        this.getContentPane().remove(AirportsUI);
        //txtFrom.setInputVerifier(new PassVerifier());
        //txtTo.setInputVerifier(new PassVerifier());
        loadDataPQ();
        loadAirportsTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FindRouteUI = new javax.swing.JPanel();
        mainTitle = new javax.swing.JLabel();
        btnAirportsUI = new javax.swing.JButton();
        labelFrom = new javax.swing.JLabel();
        txtFrom = new javax.swing.JTextField();
        txtTo = new javax.swing.JTextField();
        labelTo = new javax.swing.JLabel();
        btnFind = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        labelMinDur = new javax.swing.JLabel();
        labelSR = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        errorFrom = new javax.swing.JLabel();
        errorTo = new javax.swing.JLabel();
        AirportsUI = new javax.swing.JPanel();
        mainTitle1 = new javax.swing.JLabel();
        btnFindRoutesUI = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblAirports = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(754, 508));
        setResizable(false);

        mainTitle.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        mainTitle.setText("The Shortest Air Route");

        btnAirportsUI.setText("View All Airports");
        btnAirportsUI.setFocusPainted(false);
        btnAirportsUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAirportsUIActionPerformed(evt);
            }
        });

        labelFrom.setText("From Where");

        txtFrom.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFrom.setForeground(new java.awt.Color(19, 11, 11));
        txtFrom.setToolTipText("From");
        txtFrom.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtFrom.setInheritsPopupMenu(true);
        txtFrom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFromActionPerformed(evt);
            }
        });

        txtTo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTo.setForeground(new java.awt.Color(19, 11, 11));
        txtTo.setToolTipText("To");
        txtTo.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        txtTo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtToActionPerformed(evt);
            }
        });

        labelTo.setText("To Where");

        btnFind.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnFind.setText("Find");
        btnFind.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFind.setFocusPainted(false);
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        jLabel1.setText("Minimum Duration :");

        labelMinDur.setText("N / A");

        labelSR.setText("N / A");

        jLabel2.setText("Shortest Route : ");

        javax.swing.GroupLayout FindRouteUILayout = new javax.swing.GroupLayout(FindRouteUI);
        FindRouteUI.setLayout(FindRouteUILayout);
        FindRouteUILayout.setHorizontalGroup(
            FindRouteUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FindRouteUILayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(mainTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FindRouteUILayout.createSequentialGroup()
                .addContainerGap(87, Short.MAX_VALUE)
                .addGroup(FindRouteUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FindRouteUILayout.createSequentialGroup()
                        .addComponent(btnAirportsUI)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FindRouteUILayout.createSequentialGroup()
                        .addGroup(FindRouteUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(FindRouteUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelSR, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelMinDur, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(133, 133, 133))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FindRouteUILayout.createSequentialGroup()
                        .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(219, 219, 219))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, FindRouteUILayout.createSequentialGroup()
                        .addGroup(FindRouteUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(FindRouteUILayout.createSequentialGroup()
                                .addComponent(labelFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(labelTo, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(FindRouteUILayout.createSequentialGroup()
                                .addComponent(errorFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(128, 128, 128)
                                .addComponent(errorTo, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(73, 73, 73))))
        );
        FindRouteUILayout.setVerticalGroup(
            FindRouteUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(FindRouteUILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAirportsUI)
                .addGap(13, 13, 13)
                .addComponent(mainTitle)
                .addGap(36, 36, 36)
                .addGroup(FindRouteUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelTo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FindRouteUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(errorTo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorFrom, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btnFind, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addGroup(FindRouteUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelMinDur, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(FindRouteUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelSR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        mainTitle1.setFont(new java.awt.Font("Tahoma", 3, 36)); // NOI18N
        mainTitle1.setText("All Airports Available");

        btnFindRoutesUI.setText("Shortest Route");
        btnFindRoutesUI.setFocusPainted(false);
        btnFindRoutesUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindRoutesUIActionPerformed(evt);
            }
        });

        tblAirports.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Airport Code", "Title", "Country"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblAirports);
        if (tblAirports.getColumnModel().getColumnCount() > 0) {
            tblAirports.getColumnModel().getColumn(0).setPreferredWidth(2);
            tblAirports.getColumnModel().getColumn(2).setPreferredWidth(2);
        }

        javax.swing.GroupLayout AirportsUILayout = new javax.swing.GroupLayout(AirportsUI);
        AirportsUI.setLayout(AirportsUILayout);
        AirportsUILayout.setHorizontalGroup(
            AirportsUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AirportsUILayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(AirportsUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AirportsUILayout.createSequentialGroup()
                        .addComponent(btnFindRoutesUI)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AirportsUILayout.createSequentialGroup()
                        .addGap(0, 43, Short.MAX_VALUE)
                        .addGroup(AirportsUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AirportsUILayout.createSequentialGroup()
                                .addComponent(mainTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(144, 144, 144))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, AirportsUILayout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 668, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37))))))
        );
        AirportsUILayout.setVerticalGroup(
            AirportsUILayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AirportsUILayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnFindRoutesUI)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainTitle1)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AirportsUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(12, 12, 12)
                    .addComponent(FindRouteUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(12, 12, 12)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(AirportsUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(FindRouteUI, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindRoutesUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindRoutesUIActionPerformed
        // TODO add your handling code here:
        this.getContentPane().remove(AirportsUI);
        this.getContentPane().add(FindRouteUI);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnFindRoutesUIActionPerformed

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        //Border errBorder = BorderFactory.createLineBorder(Color.RED, 1);
        //Border defaultBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1);
        String src = txtFrom.getText();
        String dest = txtTo.getText();

        boolean isValid = validateInputs();

        if (isValid) {
            System.out.println("Find! ===> src: " + src + " dest: " + dest);

            Dijkstra dij = new Dijkstra();

            // find source airport
            for (Vertex airportSrc : airports) {
                if (airportSrc.name.equals(src)) {
                    dij.computePaths(airportSrc);
                    // find destination airport
                    for (Vertex airportDest : airports) {
                        if (airportDest.name.equals(dest)) {
                            double minDistance = airportDest.minDistance;
                            List<Vertex> path = dij.getShortestPathTo(airportDest);

                            // Console Output
                            System.out.println("Distance to " + airportDest.name + ": " + minDistance);
                            System.out.println("Path: " + path + "\n");
                            
                            String hoursMins = getHoursMins(minDistance);

                            // UI Output
                            labelMinDur.setText(hoursMins);
                            labelSR.setText(path.toString());
                        }
                    }
                }
            }
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void txtToActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtToActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtToActionPerformed

    private void txtFromActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFromActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFromActionPerformed

    private void btnAirportsUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAirportsUIActionPerformed
        // TODO add your handling code here:
        this.getContentPane().remove(FindRouteUI);
        this.getContentPane().add(AirportsUI);
        this.revalidate();
        this.repaint();
    }//GEN-LAST:event_btnAirportsUIActionPerformed

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
            java.util.logging.Logger.getLogger(MainAppContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAppContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAppContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAppContainer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAppContainer().setVisible(true);
            }
        });
    }

    private boolean validateInputs() {
        Border errBorder = BorderFactory.createLineBorder(Color.RED, 1);
        Border defaultBorder = BorderFactory.createLineBorder(Color.LIGHT_GRAY, 1);
        String src = txtFrom.getText();
        String dest = txtTo.getText();

        if (src.isEmpty()) {
            txtFrom.setBorder(errBorder);
            errorFrom.setForeground(Color.red);
            errorFrom.setText("From where is required!");
        } else {
            txtFrom.setBorder(defaultBorder);
            errorFrom.setText("");
        }
        if (dest.isEmpty()) {
            txtTo.setBorder(errBorder);
            errorTo.setForeground(Color.red);
            errorTo.setText("To where is required!");
        } else {
            txtTo.setBorder(defaultBorder);
            errorTo.setText("");
        }
        if (!src.isEmpty() && !dest.isEmpty()) {
            return true;
        }
        return false;
    }

    private void displayAirports() {
        for (Vertex airport : airports) {
            System.out.println(airport);
        }
    }
    
    private String getHoursMins(double mins) {
        int t = (int)mins;
        int hours = t / 60;
        int minutes = t % 60;
        
        System.out.printf("%d:%02d", hours, minutes);
        System.out.println();
        
        return hours+" hrs "+minutes+" mins";
    }

    private void setEdgesAndWeight(String src, String dest, double duration) {
        System.out.println("src: " + src + " dest: " + dest + " dur: " + duration);
        // find source airport
        for (Vertex airportSrc : airports) {
            if (airportSrc.name.equals(src)) {
                // find destination airport
                for (Vertex airportDest : airports) {
                    if (airportDest.name.equals(dest)) {
                        airportSrc.adjacencies = new Edge[]{new Edge(airportDest, duration)};
                    }
                }
            }
        }
    }

    private void loadDataPQ() {
        System.out.println("\n===========initialize==========\n");
        int count = 0;
        // Database Connection
        try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/air_traffic_control", "air_traffic", "123456");

            // Load airport data from database
            String sql = "select * from airports order by akey";
            Statement st = con.createStatement();
            ResultSet rst = st.executeQuery(sql);

            while (rst.next()) {
                count++;
            }

            airports = new Vertex[count]; //initaiaze airports

            //Load airport identifications to array
            while (rst.previous()) {
                count--;
                String akey = rst.getString("akey");
                String title = rst.getString("title");
                String country = rst.getString("country");
                airports[count] = new Vertex(akey, title, country);
            }

            //Get flight time data from database
            sql = "select * from times order by source";
            rst = st.executeQuery(sql);

            //load Flighttime data to airports array
            while (rst.next()) {
                String src = rst.getString("source");
                String dest = rst.getString("destination");
                double duration = rst.getDouble("flight_time");

                // set edges and duration
                setEdgesAndWeight(src, dest, duration);
            }

            System.out.println("\n===============================\n");

        } catch (SQLException ex) {
            System.out.println("SQL Error " + ex.getMessage());
        }
        
        Dijkstra dij = new Dijkstra();

        // mark all the vertices
        Vertex A = new Vertex("A", "", "");
        Vertex B = new Vertex("B", "", "");
        Vertex D = new Vertex("D", "", "");
        Vertex F = new Vertex("F", "", "");
        Vertex K = new Vertex("K", "", "");
        Vertex J = new Vertex("J", "", "");
        Vertex M = new Vertex("M", "", "");
        Vertex O = new Vertex("O", "", "");
        Vertex P = new Vertex("P", "", "");
        Vertex R = new Vertex("R", "", "");
        Vertex Z = new Vertex("Z", "", "");
        // set the edges and weight
        A.adjacencies = new Edge[]{ new Edge(M, 8) };
        B.adjacencies = new Edge[]{ new Edge(D, 11) };
        D.adjacencies = new Edge[]{ new Edge(B, 11) };
        F.adjacencies = new Edge[]{ new Edge(K, 23) };
        K.adjacencies = new Edge[]{ new Edge(O, 40) };
        J.adjacencies = new Edge[]{ new Edge(K, 25) };
        M.adjacencies = new Edge[]{ new Edge(R, 8) };
        O.adjacencies = new Edge[]{ new Edge(K, 40) };
        P.adjacencies = new Edge[]{ new Edge(Z, 18) };
        R.adjacencies = new Edge[]{ new Edge(P, 15) };
        Z.adjacencies = new Edge[]{ new Edge(P, 18) };
        dij.computePaths(R);
        System.out.println("Distance to " + Z  + ": " + Z.minDistance);
        List<Vertex> path = dij.getShortestPathTo(Z);
        System.out.println("Path: " + path);
    }
    
    private void loadAirportsTable() {
        DefaultTableModel model = (DefaultTableModel) tblAirports.getModel();
        
        for (Vertex airport : airports) {
            model.addRow(new Object[]{airport.name, airport.title, airport.country});
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AirportsUI;
    private javax.swing.JPanel FindRouteUI;
    private javax.swing.JButton btnAirportsUI;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFindRoutesUI;
    private javax.swing.JLabel errorFrom;
    private javax.swing.JLabel errorTo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelFrom;
    private javax.swing.JLabel labelMinDur;
    private javax.swing.JLabel labelSR;
    private javax.swing.JLabel labelTo;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JLabel mainTitle1;
    private javax.swing.JTable tblAirports;
    private javax.swing.JTextField txtFrom;
    private javax.swing.JTextField txtTo;
    // End of variables declaration//GEN-END:variables
}

class PassVerifier extends InputVerifier {

    @Override
    public boolean verify(JComponent input) {
        JTextField tf = (JTextField) input;
        if ("".equals(tf.getText())) {
            Border border = BorderFactory.createLineBorder(Color.red, 1);
            tf.setBorder(border);
            return false;
        } else {
            Border border = BorderFactory.createLineBorder(Color.gray, 1);
            tf.setBorder(border);
            return true;
        }
    }
}
