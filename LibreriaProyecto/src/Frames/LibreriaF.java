/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;
import Clases.*;
import Frames.*;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Luisito
 */
public class LibreriaF extends javax.swing.JFrame {
    Material m;

    /**
     * Creates new form LibreriaF
     */
    public LibreriaF() {
        initComponents();
        this.setLocationRelativeTo(null);
       BienvjLabel.setText(Autenticarse.usuario);
    }

    private String categoria = " ";
    private String nb = " ";
    Libreria l = new Libreria();
    public int cantexi = 0;
    public int cantexir = 0;
    public int cantven = 0;
    public int cantvenr = 0;
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        TipojComboBox1 = new javax.swing.JComboBox<>();
        AceptarjButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jTextField9 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        CerrarjButton2 = new javax.swing.JButton();
        BienvjLabel = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        LibroCategoriajMenuItem3 = new javax.swing.JMenuItem();
        TituloGenjMenuItem4 = new javax.swing.JMenuItem();
        MaterialesMasVendidosjMenuItem5 = new javax.swing.JMenuItem();
        MaterialesMasTiempojMenuItem6 = new javax.swing.JMenuItem();
        TituloRevistasjMenuItem7 = new javax.swing.JMenuItem();
        ImporteTotalCatSelecjMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 255, 255)));
        jPanel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("T??tulo:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Autor:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Tipo:");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        TipojComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Libro", "Revista" }));
        TipojComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TipojComboBox1ActionPerformed(evt);
            }
        });

        AceptarjButton1.setText("Agregar");
        AceptarjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AceptarjButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Insertar Libro");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("N??mero de Lote:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Precio:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Fecha de Alta:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Genero:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Cantidad de P??ginas:");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("N??mero de Edici??n:");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Categor??a:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione", "Infantiles", "Adultos" }));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("Dias en Venta: ");

        CerrarjButton2.setText("Cerrar");
        CerrarjButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CerrarjButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel11)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(AceptarjButton1)
                        .addComponent(jLabel13)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField2)
                            .addComponent(TipojComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField1)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6)
                            .addComponent(jTextField7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, 0, 97, Short.MAX_VALUE)
                            .addComponent(jTextField9)
                            .addComponent(jTextField8))
                        .addContainerGap(125, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CerrarjButton2)
                        .addGap(84, 84, 84))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(199, 199, 199)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TipojComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AceptarjButton1)
                    .addComponent(CerrarjButton2))
                .addGap(37, 37, 37))
        );

        BienvjLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel12.setText("Bienvenido:");

        jMenu2.setText("Opciones");

        jMenuItem3.setText("Guardar ");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem1.setText("Comprar un material");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Mostrar");

        LibroCategoriajMenuItem3.setText("Mostrar libros. Categor??a-Autor");
        LibroCategoriajMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LibroCategoriajMenuItem3ActionPerformed(evt);
            }
        });
        jMenu3.add(LibroCategoriajMenuItem3);

        TituloGenjMenuItem4.setText("Cantidad de T??ulos de un g??nero");
        TituloGenjMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloGenjMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(TituloGenjMenuItem4);

        MaterialesMasVendidosjMenuItem5.setText("Materiales m??s vendidos");
        MaterialesMasVendidosjMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaterialesMasVendidosjMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(MaterialesMasVendidosjMenuItem5);

        MaterialesMasTiempojMenuItem6.setText("Materiales con mas tiempo");
        MaterialesMasTiempojMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MaterialesMasTiempojMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(MaterialesMasTiempojMenuItem6);

        TituloRevistasjMenuItem7.setText("T??tulos de revistas");
        TituloRevistasjMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TituloRevistasjMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(TituloRevistasjMenuItem7);

        ImporteTotalCatSelecjMenuItem8.setText("Importe Total de la categor??a seleccionada");
        ImporteTotalCatSelecjMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ImporteTotalCatSelecjMenuItem8ActionPerformed(evt);
            }
        });
        jMenu3.add(ImporteTotalCatSelecjMenuItem8);

        jMenuItem2.setText("Mostrar libros de una categoria");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem2);

        jMenuItem4.setText("Ranking de venta de los materiales");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem4);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel12))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(BienvjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(98, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BienvjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void TipojComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TipojComboBox1ActionPerformed
        // TODO add your handling code here:
        
        if(TipojComboBox1.getSelectedItem().equals("Libro")){
            jLabel8.setText("G??nero");
            jTextField6.setVisible(true);
            jLabel9.setVisible(true);
            jLabel9.setText("Cantidad de paginas");
            jLabel10.setVisible(true);
            jLabel10.setText("Numero de edicion");
            jTextField7.setVisible(true);
            jLabel11.setVisible(true);
            jLabel11.setText("Categoria");
            jComboBox1.setVisible(true);
        }
        else if(TipojComboBox1.getSelectedItem().equals("Revista")){
        jLabel8.setText("Frecuencia");
            jTextField6.setVisible(true);
            jLabel9.setText("Numero de a??o");
            jLabel10.setText("Tematica");
            jTextField7.setVisible(true);
            jLabel11.setVisible(false);
            jComboBox1.setVisible(false);
            
        }
        
    }//GEN-LAST:event_TipojComboBox1ActionPerformed

    private void AceptarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AceptarjButton1ActionPerformed

        
        if(TipojComboBox1.getSelectedItem().equals("Libro")){
            boolean flag = false;
            nb = jTextField1.getText();
            String au = jTextField2.getText();
            int numlo = 0;
            double p = 0;
            String fecha = jTextField5.getText();
            String gene = jTextField6.getText();
            int cantpag = 0;
            int numedicion = 0;
            int cantini = 0;
            int Dias = 0;
            if(jComboBox1.getSelectedItem().equals("Adultos")){
                categoria = "Adultos";
            }else{
                categoria = "Infantiles";
            }
            try{
                numlo = Integer.parseInt(jTextField3.getText());
                p = Double.parseDouble(jTextField4.getText());
                cantpag = Integer.parseInt(jTextField9.getText());
                numedicion = Integer.parseInt(jTextField7.getText());
                Dias = Integer.parseInt(jTextField8.getText());
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Introduzca los datos correctos", "Error", JOptionPane.ERROR_MESSAGE);
                flag = true;
            }
            Libro l1 = new Libro(au,gene,cantpag,numedicion,categoria,cantven,numlo,nb,p,fecha,cantini,cantexi,Dias);
            if(!flag){
            try{
                l.AgregarMaterial(l1);
                cantexi++;
            }catch(Exception ex){
                flag = true;
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            if(!flag){
                JOptionPane.showMessageDialog(this, "Insertado correctamente");
            }
            
            }
        }else if(TipojComboBox1.getSelectedItem().equals("Revista")){
            boolean flag = false;
            nb = jTextField1.getText();
            int numlo = 0;
            double p = 0;
            int numAnyo = 0;
            int frecuencia = 0;
            String tematica = jTextField7.getText();
            int cantini = 0;
            String fechaA =jTextField5.getText();
            int DiasR = 0;
             try{
                numlo= Integer.parseInt(jTextField3.getText());
                p=Double.parseDouble(jTextField4.getText());
                numAnyo= Integer.parseInt(jTextField9.getText());
                frecuencia= Integer.parseInt(jTextField6.getText());
                DiasR = Integer.parseInt(jTextField8.getText());
            }catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Introduzca los datos correctos", "Error", JOptionPane.ERROR_MESSAGE);
                flag = true;
            }
             Revista r1 = new Revista(numAnyo,frecuencia,tematica,cantvenr,numlo,nb,p,fechaA,cantini,cantexir,DiasR);
                if(!flag){
               try{
                l.AgregarMaterial(r1);
                cantexir++;
            }catch(Exception ex){
                flag = true;
                JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            if(!flag){
                JOptionPane.showMessageDialog(this, "Insertado Correctamente");
            }
        }
        }
        
    }//GEN-LAST:event_AceptarjButton1ActionPerformed

    public int getCantexi() {
        return cantexi;
    }

    public int getCantexir() {
        return cantexir;
    }

    public String getCategoria() {
        return categoria;
    }

    public String getNb() {
        return nb;
    }

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        String n = " ";
        int c = 0;
        int cr = 0;
        String a = " ";
        a = JOptionPane.showInputDialog("Libro o Revista");
        if(a.equalsIgnoreCase("Libro")){
            n = JOptionPane.showInputDialog("Introduzca el nombre del Libro:");
            c = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad que desea comprar"));
            try {
                l.GuardarFichero();
            } catch (IOException ex) {
                Logger.getLogger(LibreriaF.class.getName()).log(Level.SEVERE, null, ex);
            }
            l.ComprarL(n, c);
            
        }else if(a.equalsIgnoreCase("Revista")){
            n = JOptionPane.showInputDialog("Introduzca el titulo de la revista");
            cr = Integer.parseInt(JOptionPane.showInputDialog("Introduzca la cantidad que desea comprar"));
            try {
                l.GuardarFicheroR();
            } catch (IOException ex) {
                Logger.getLogger(LibreriaF.class.getName()).log(Level.SEVERE, null, ex);
            }
            l.ComprarR(n, cr);
        }
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void ImporteTotalCatSelecjMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ImporteTotalCatSelecjMenuItem8ActionPerformed
        // TODO add your handling code here:
        String c = " ";
        c = JOptionPane.showInputDialog("Introduzca la categoria:");
        if(c.equalsIgnoreCase("Adultos")){
            JOptionPane.showMessageDialog(this,l.TotalI());
        }else if(c.equalsIgnoreCase("Infantiles")){
            JOptionPane.showMessageDialog(this,l.TotalR());
        }
    }//GEN-LAST:event_ImporteTotalCatSelecjMenuItem8ActionPerformed

    private void CerrarjButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CerrarjButton2ActionPerformed
        // TODO add your handling code here:
        Autenticarse p1 = new Autenticarse();
        p1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CerrarjButton2ActionPerformed

    private void LibroCategoriajMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LibroCategoriajMenuItem3ActionPerformed
        // TODO add your handling code here:
        String ele = " ";
        ele = JOptionPane.showInputDialog("Introduzca autor o categoria");
        if(ele.equalsIgnoreCase("Adultos")){
            JOptionPane.showMessageDialog(this,l.MostrarC());
        }else if(ele.equalsIgnoreCase("Infantiles")){
            JOptionPane.showMessageDialog(this,l.MostrarI());
        }else{            
            JOptionPane.showMessageDialog(this,l.Mautor(ele));
        }
        
    }//GEN-LAST:event_LibroCategoriajMenuItem3ActionPerformed

    private void MaterialesMasVendidosjMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaterialesMasVendidosjMenuItem5ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,l.Rankingvend());
        
    }//GEN-LAST:event_MaterialesMasVendidosjMenuItem5ActionPerformed

    private void TituloGenjMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloGenjMenuItem4ActionPerformed
        // TODO add your handling code here:
            String GD = JOptionPane.showInputDialog("Introudzca el genero que desea:");
            JOptionPane.showMessageDialog(this,l.Devolver(GD));
       
    }//GEN-LAST:event_TituloGenjMenuItem4ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        String [] categorias = new String[1000];
        String cate = " ";
        String cateS = " ";
        cateS = JOptionPane.showInputDialog("Introduzca la categoria:");
            if(cateS.equalsIgnoreCase("Adultos")){
                JOptionPane.showMessageDialog(this,l.MostrarC());
            }else if(cateS.equalsIgnoreCase("Infantiles")){
                JOptionPane.showMessageDialog(this,l.MostrarI());
            }else{
                JOptionPane.showMessageDialog(this, "No Existe un libro con esta categoria");
            
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void TituloRevistasjMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TituloRevistasjMenuItem7ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,l.RevistasV());
        
    }//GEN-LAST:event_TituloRevistasjMenuItem7ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    public int getCantven() {
        return cantven;
    }

    public int getCantvenr() {
        return cantvenr;
    }

    private void MaterialesMasTiempojMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MaterialesMasTiempojMenuItem6ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,l.RankingDias());
    }//GEN-LAST:event_MaterialesMasTiempojMenuItem6ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this,l.RankingV());
    }//GEN-LAST:event_jMenuItem4ActionPerformed

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
            java.util.logging.Logger.getLogger(LibreriaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibreriaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibreriaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibreriaF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibreriaF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AceptarjButton1;
    private javax.swing.JLabel BienvjLabel;
    private javax.swing.JButton CerrarjButton2;
    private javax.swing.JMenuItem ImporteTotalCatSelecjMenuItem8;
    private javax.swing.JMenuItem LibroCategoriajMenuItem3;
    private javax.swing.JMenuItem MaterialesMasTiempojMenuItem6;
    private javax.swing.JMenuItem MaterialesMasVendidosjMenuItem5;
    private javax.swing.JComboBox<String> TipojComboBox1;
    private javax.swing.JMenuItem TituloGenjMenuItem4;
    private javax.swing.JMenuItem TituloRevistasjMenuItem7;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables

}
