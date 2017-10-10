/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.DefaultComboBoxModel;
import model.Category;
import model.WordModel;

/**
 *
 * @author user
 */
public class GuessingGame extends javax.swing.JFrame {
    
    EntityManagerFactory emf;
    WordModel modelWord;
    List<WordModel> bankSoal;
    List<Category> wm;
    
    /**
     * Creates new form GuessingGame
     */
    public GuessingGame() {
        emf = Persistence.createEntityManagerFactory("GameGuessAWordDatabasePU");
        initComponents();
        //showCategory();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_Soal = new javax.swing.JTextField();
        tf_Jawaban = new javax.swing.JTextField();
        btn_Periksa = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        keteranganJawaban = new javax.swing.JLabel();
        btn_Mulai = new javax.swing.JButton();
        cb_Kategori = new javax.swing.JComboBox<>();
        btn_Bantuan = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bantuan = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tf_Soal.setEditable(false);
        tf_Soal.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        tf_Jawaban.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        btn_Periksa.setText("Periksa");
        btn_Periksa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_PeriksaActionPerformed(evt);
            }
        });

        jLabel1.setText("Jawaban:");

        jLabel2.setText("Soal:");

        keteranganJawaban.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        keteranganJawaban.setText("Belum ada jawaban");

        btn_Mulai.setText("Mulai");
        btn_Mulai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_MulaiActionPerformed(evt);
            }
        });

        cb_Kategori.setModel(getModel());
        cb_Kategori.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_KategoriActionPerformed(evt);
            }
        });

        btn_Bantuan.setText("Bantuan");
        btn_Bantuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BantuanActionPerformed(evt);
            }
        });

        bantuan.setColumns(20);
        bantuan.setRows(5);
        jScrollPane1.setViewportView(bantuan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cb_Kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(btn_Mulai)
                                .addGap(126, 126, 126)
                                .addComponent(btn_Bantuan))
                            .addComponent(keteranganJawaban, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 130, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(87, 87, 87)
                                        .addComponent(jLabel2))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(jLabel1)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_Jawaban, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_Soal, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(43, 43, 43)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btn_Periksa)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Mulai)
                    .addComponent(cb_Kategori, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_Bantuan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addComponent(tf_Soal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_Periksa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tf_Jawaban, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addComponent(keteranganJawaban, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private List<Category> getCategory() {
        EntityManager em = emf.createEntityManager();
        Query query = em.createQuery("SELECT c FROM Category c");
        wm = query.getResultList();
        
        return wm;
    }
    
    //CARA PERTAMA dapetin category
//    
//    private void showCategory(){
//        getCategory();
//        for (Category category : wm) {
//            cb_Kategori.addItem(category.getName());
//        }
//        
//    }
    
    //CARA Kedua dapetin category
    private String[] showCategory() {
        List<Category> cat = getCategory();
        int size = cat.size();
        String namaCategory[] = new String[size];
        for (int i = 0; i < size; i++) {
            namaCategory[i] = cat.get(i).getName();
        }
        System.out.println("Jumlah kategori: " + size);
        
        return namaCategory;
    }
    
    private DefaultComboBoxModel getModel(){
        return new DefaultComboBoxModel(showCategory());
    }
    
    private void getSoal() {
        EntityManager em = emf.createEntityManager();
        String kata = (String) cb_Kategori.getSelectedItem();
        Query query = em.createQuery("SELECT w FROM Category w WHERE w.name = :categoryName");
        query.setParameter("categoryName", kata);
        Category c = (Category) query.getSingleResult();
        bankSoal = c.getWordModels();
    }
    

    

    private void btn_MulaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_MulaiActionPerformed

        getSoal();
        int soalIndex = (int) Math.floor(Math.random() * bankSoal.size());
        modelWord = bankSoal.get(soalIndex);
        tf_Soal.setText(modelWord.acakHuruf());
        
        tf_Jawaban.setText("");
        bantuan.setText("");
        keteranganJawaban.setText("Belum ada jawaban");
        

    }//GEN-LAST:event_btn_MulaiActionPerformed

    private void btn_PeriksaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_PeriksaActionPerformed
        btn_Mulai.setText("Mulai Lagi!");
        modelWord.setJawaban(tf_Jawaban.getText().trim());
        if (modelWord.cekJawaban() == true) {
            keteranganJawaban.setText("Selamat jawaban Anda benar! Anda Jenius!");
        } else {
            keteranganJawaban.setText("Sayang sekali jawaban anda salah! Coba lagi!");
        }

//       String jawaban = tf_Jawaban.getText().trim();
//        if(basicWord.equalsIgnoreCase(jawaban)){
//            keteranganJawaban.setText("Selamat jawaban Anda benar! Anda Jenius!");
//       }else{
//            keteranganJawaban.setText("Sayang sekali jawaban anda salah! Coba lagi!");
//        }
    }//GEN-LAST:event_btn_PeriksaActionPerformed

    private void cb_KategoriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_KategoriActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_KategoriActionPerformed

    private void btn_BantuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BantuanActionPerformed
        bantuan.setText(modelWord.getHint());
    }//GEN-LAST:event_btn_BantuanActionPerformed

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
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GuessingGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GuessingGame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea bantuan;
    private javax.swing.JButton btn_Bantuan;
    private javax.swing.JButton btn_Mulai;
    private javax.swing.JButton btn_Periksa;
    private javax.swing.JComboBox<String> cb_Kategori;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel keteranganJawaban;
    private javax.swing.JTextField tf_Jawaban;
    private javax.swing.JTextField tf_Soal;
    // End of variables declaration//GEN-END:variables
}
