package IHM;

import Utility.ErrorException;
import Utility.ModelTableau;
import static Utility.Utility.showMessageSucces;
import control.ExemplaireControl;
import java.awt.Toolkit;
import objets_metiers.Exemplaire;
import static java.lang.Integer.parseInt;
/**
 * 
 * @author Diallo & Janati
 */
public class ModificationExemplaire extends javax.swing.JDialog {

    public ModificationExemplaire(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/images/bibliotheque_icone.png")));
    }

    public ModificationExemplaire(java.awt.Frame parent, boolean modal, Exemplaire exemplaire) {
        this(parent, modal);
        identifiantField.setText(exemplaire.getId() + "");
        etatExemplaireCombo.setSelectedItem(exemplaire.getEtat());
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
        titleLabel = new javax.swing.JLabel();
        panAjoutBas = new javax.swing.JPanel();
        etatExemplaireLabel = new javax.swing.JLabel();
        identifiantLabel = new javax.swing.JLabel();
        identifiantField = new javax.swing.JFormattedTextField();
        etatExemplaireCombo = new javax.swing.JComboBox();
        modifierBouton = new javax.swing.JButton();
        annulerBouton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Modification Exemplaire");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setName("Gestion personnel"); // NOI18N
        jPanel1.setPreferredSize(new java.awt.Dimension(1162, 608));
        jPanel1.setRequestFocusEnabled(false);

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Modification");

        panAjoutBas.setBackground(new java.awt.Color(102, 102, 102));
        panAjoutBas.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        etatExemplaireLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        etatExemplaireLabel.setForeground(new java.awt.Color(255, 255, 255));
        etatExemplaireLabel.setText("Etat");

        identifiantLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        identifiantLabel.setForeground(new java.awt.Color(255, 255, 255));
        identifiantLabel.setText("Identifiant ");

        identifiantField.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(java.text.NumberFormat.getIntegerInstance())));
        identifiantField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        identifiantField.setToolTipText("");
        identifiantField.setEnabled(false);
        identifiantField.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        identifiantField.setPreferredSize(new java.awt.Dimension(123, 26));

        etatExemplaireCombo.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        etatExemplaireCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Neuf", "Bon", "Vieux" }));
        etatExemplaireCombo.setPreferredSize(new java.awt.Dimension(123, 26));

        modifierBouton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        modifierBouton.setText("Modifier");
        modifierBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modifier(evt);
            }
        });

        annulerBouton.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        annulerBouton.setText("Annuler");
        annulerBouton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                annulerBoutonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panAjoutBasLayout = new javax.swing.GroupLayout(panAjoutBas);
        panAjoutBas.setLayout(panAjoutBasLayout);
        panAjoutBasLayout.setHorizontalGroup(
            panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAjoutBasLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panAjoutBasLayout.createSequentialGroup()
                        .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(identifiantLabel)
                            .addComponent(etatExemplaireLabel))
                        .addGap(62, 62, 62)
                        .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(etatExemplaireCombo, 0, 233, Short.MAX_VALUE)
                            .addComponent(identifiantField, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panAjoutBasLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(annulerBouton)
                        .addGap(30, 30, 30)
                        .addComponent(modifierBouton)))
                .addContainerGap())
        );
        panAjoutBasLayout.setVerticalGroup(
            panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panAjoutBasLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(identifiantLabel, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(identifiantField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etatExemplaireLabel)
                    .addComponent(etatExemplaireCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(panAjoutBasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(annulerBouton)
                    .addComponent(modifierBouton))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panAjoutBas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addComponent(panAjoutBas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modifier(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modifier

        try {
            Exemplaire exemplaire = getExempalireInfos();
            if (null != exemplaire) {
            ExemplaireControl.modifier(exemplaire);
            ((ModelTableau) GestionExemplaires.tableExemplaires.getModel()).
                    updateRow(new Object[]{exemplaire.getId(), exemplaire.getEtat()},
                            GestionExemplaires.tableExemplaires.getSelectedRow());
                showMessageSucces("Modifications enregistrées avec succès");
            }
        } catch (ErrorException e) {
            System.out.println("IHM.ModificationExemplaire.modifierBoutonActionPerformed()");
        }
    }//GEN-LAST:event_modifier

    private void annulerBoutonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_annulerBoutonActionPerformed
        this.dispose();
    }//GEN-LAST:event_annulerBoutonActionPerformed

    private Exemplaire getExempalireInfos() {
        int id = parseInt(identifiantField.getText());
        String etatExemplaire = etatExemplaireCombo.getSelectedItem().toString();

        return new Exemplaire(id, etatExemplaire);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton annulerBouton;
    private javax.swing.JComboBox etatExemplaireCombo;
    private javax.swing.JLabel etatExemplaireLabel;
    private javax.swing.JFormattedTextField identifiantField;
    private javax.swing.JLabel identifiantLabel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton modifierBouton;
    private javax.swing.JPanel panAjoutBas;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
