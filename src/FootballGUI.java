
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



//This is the GUI Class
public class FootballGUI extends javax.swing.JFrame {
    PremierLeagueManager pl1;
    /**
     * Creates new form FootballGUI
     */
    public FootballGUI() throws ParseException {
        initComponents();
        pl1 = new PremierLeagueManager();
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
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 102, 204));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Premiere League GUI Window");

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Points Sort");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Goals Sort");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Win Sort");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Get Specific Match");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(255, 255, 255));
        jButton6.setText("New Match");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Date Sort");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton7.setText("Exit");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(424, 424, 424)
                                .addComponent(jButton7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(jButton1)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2)
                                .addGap(18, 18, 18)
                                .addComponent(jButton3)
                                .addGap(29, 29, 29)
                                .addComponent(jButton4)
                                .addGap(18, 18, 18)
                                .addComponent(jButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5)))
                        .addGap(0, 142, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(229, 229, 229)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4)
                    .addComponent(jButton6)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton7)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    club[] clubs;
    //As the name suggest, it sort the data according to points
    void sortPoints(){
        clubs = new club[this.pl1.currentTeam.size()];
        for(int i=0;i<clubs.length;i++){
            clubs[i] = pl1.currentTeam.get(i);
        }
        for(int i=0;i<clubs.length;i++){
            for(int j=0;j<clubs.length;j++){
                if(clubs[i].getPoints()<clubs[j].getPoints()){
                    club temp = clubs[i];
                    clubs[i] = clubs[j];
                    clubs[j] = temp;
                }
            }
        }
    }
    //adding the data to TextArea
    void displayData(){
        jTextArea1.append("Name\tLocation\tMatches\tWins\tLosses\tDraws"
                + "\tGoalsScored\tGoalsRecieved\tPoints\n");
        for(int i=0;i<clubs.length;i++){
            jTextArea1.append(clubs[i].getTeamName() + "\t" + clubs[i].getLocation()
                    + "\t" + clubs[i].getTotalMatches()+ "\t" + clubs[i].getWins()
                    + "\t" + clubs[i].getDefeats()+ "\t" + clubs[i].getDraws()
                    +"\t"+ clubs[i].getScore()+ "\t" + clubs[i].getRecieved()+
                    "\t" + clubs[i].getPoints() + "\n");
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //sort with points
        jTextArea1.setText("");
        this.sortPoints();
        this.displayData();

    }//GEN-LAST:event_jButton1ActionPerformed
void sortGoals(){
    clubs = new club[this.pl1.currentTeam.size()];
        for(int i=0;i<clubs.length;i++){
            clubs[i] = pl1.currentTeam.get(i);
        }
        for(int i=0;i<clubs.length;i++){
            for(int j=0;j<clubs.length;j++){
                if(clubs[i].getScore()>clubs[j].getScore()){
                    club temp = clubs[i];
                    clubs[i] = clubs[j];
                    clubs[j] = temp;
                }
            }
        }
}
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //sort goals
        jTextArea1.setText("");
        this.sortGoals();
        this.displayData();
    }//GEN-LAST:event_jButton2ActionPerformed
    void sortWins(){
        clubs = new club[this.pl1.currentTeam.size()];
        for(int i=0;i<clubs.length;i++){
            clubs[i] = pl1.currentTeam.get(i);
        }
        for(int i=0;i<clubs.length;i++){
            for(int j=0;j<clubs.length;j++){
                if(clubs[i].getWins()>clubs[j].getWins()){
                    club temp = clubs[i];
                    clubs[i] = clubs[j];
                    clubs[j] = temp;
                }
            }
        }
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //sort wins
        jTextArea1.setText("");
        this.sortWins();
        this.displayData();
    }//GEN-LAST:event_jButton3ActionPerformed
    match[] matchData;
    void sortDates(){
        matchData = new match[pl1.matchesData.size()];
        for(int i=0;i<matchData.length;i++){
            matchData[i] = pl1.matchesData.get(i);
        }
        for(int i=0;i<matchData.length;i++){
            for(int j=0;j<matchData.length;j++){
                if(matchData[i].getDay() > matchData[j].getDay()){
                    match temp = matchData[i];
                    matchData[i] =matchData[j];
                    matchData[j] = temp;
                }
            }
        }
    }
    void displayMatches(){
        jTextArea1.append("Winning Team\tLoosing Team\tWinning Goals\tLosing Goals\tDate\n");
        for(int i=0;i<matchData.length;i++){
//            Display Match Data
            jTextArea1.append(matchData[i].getWT() + "\t" + matchData[i].getLT() + 
                    "\t" + matchData[i].getWG() + "\t" + matchData[i].getLG() + 
                    "\t" + matchData[i].day + "\n");
        }
    }
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //sort with dates
        jTextArea1.setText("");
        this.sortDates();
        this.displayMatches();
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        pl1.playMatch();
        JOptionPane.showMessageDialog(null,"Random Match generated! Print Match table to view results");
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jTextArea1.setText("");
        String day = JOptionPane.showInputDialog("Enter day you want to display match for: ");
        int d = Integer.parseInt(day);
        System.out.println(d);
        matchData = new match[pl1.matchesData.size()];
        for(int i=0;i<matchData.length;i++){
            matchData[i] = pl1.matchesData.get(i);
        }
        int c=0;
        for(int i=0;i<matchData.length;i++){
            if(d == matchData[i].getDay()){
                jTextArea1.append("Winning Team: " + matchData[i].getWT() + 
                        "\nLosing Team: " + matchData[i].getLT() + "\nWinning Team Goals: " + 
                        matchData[i].getWG() + "\nLoosing Team Goals: " + matchData[i].getLG()
                + "\nMatch Date: " + matchData[i].getDate()+ "\n");
                c++;
                break;
            }
        }
        if(c ==0){
            JOptionPane.showMessageDialog(null,"Invalid date");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(FootballGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FootballGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FootballGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FootballGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FootballGUI().setVisible(true);
                } catch (ParseException ex) {
                    Logger.getLogger(FootballGUI.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
