
import javax.swing.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ELI
 */
public class proyecto_unidad_2 extends javax.swing.JFrame {

    /**
     * Creates new form proyecto_unidad_2
     */
    public proyecto_unidad_2() {//constructor
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtTrenBit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtEcuacion = new javax.swing.JTextField();
        btnTrenBit = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnEcuacion = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel5.setText("jLabel5");

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel3.setText("Tren de bits");

        jLabel6.setText("Ecuación");

        txtEcuacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEcuacionActionPerformed(evt);
            }
        });

        btnTrenBit.setText("Calcular tren de bits");
        btnTrenBit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrenBitActionPerformed(evt);
            }
        });

        jLabel7.setText("Instrucciones: En el tren de bits solo se pueden ");

        jLabel2.setText("introducir 0 y 1, y en el cuadro de ecuación solo ");

        jLabel8.setText("se pueden introducir ecuaciones del tipo ");

        jLabel10.setText("x^n+x^n-1+....x+1");

        btnEcuacion.setText("Calcular Ecuación");
        btnEcuacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEcuacionActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow-left.png"))); // NOI18N

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/arrow-right.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(txtTrenBit, javax.swing.GroupLayout.DEFAULT_SIZE, 115, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 138, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel4))
                                .addGap(17, 17, 17)
                                .addComponent(txtEcuacion))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEcuacion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTrenBit)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel8))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel7)))
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTrenBit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtEcuacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnTrenBit)
                            .addComponent(btnEcuacion))
                        .addGap(32, 32, 32))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEcuacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEcuacionActionPerformed
        //botón para la ecuación
        try{
            int tb=Integer.parseInt(txtTrenBit.getText());//obtención de datos
            int auxiliar=tb,resto,n=-1;//variables de control
            String s="";
            String [] arr=new String[txtTrenBit.getText().length()];
            while(auxiliar!=0){
                resto=auxiliar%10;
                if(resto>1 && resto<0){ //restricciones
                    throw new Exception();
                }
                auxiliar/=10;//acortamiento 
                n++; //exponente
                if(resto==1){  //comporbación para saber si ponerlo
                    if(n==0){   //si es exponenente 0 agregar un 1
                        arr[n]="1"; 
                    }else if(n==1){  //si es exponente 2 agregar x
                        arr[n]="x+";
                    }else{ //si no agregar x a la n
                        arr[n]="x^"+n+"+";
                    }
                }
            }
            for(int i=arr.length-1;i>=0;i--){ //concatenar todos los string en uno solo
                if(arr[i]!=null)
                s+=arr[i];
            }
            if(s.endsWith("+")){ //si no termina con 1 corregir el string
                s=s.substring(0,s.length()-1);
            }
            txtEcuacion.setText(s);  //presentar el resultado
        }catch(Exception exception){
            JOptionPane.showMessageDialog(null,"Error");
        }
    }//GEN-LAST:event_btnEcuacionActionPerformed

    private void txtEcuacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEcuacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEcuacionActionPerformed

    private void btnTrenBitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrenBitActionPerformed
        try{
            String s=txtEcuacion.getText(); //conseguir la informacion del cuadro
            int x=0,uni=0,dec=0;//variables de ayuda 
            String[] s2=s.split("\\+");//separación por el signo +
            for(int i=0;i<s2.length;i++){ //para ir por digito por digito
                /*for(int j=0;j<s2[i].length();j++){
                    if(Character.isDigit(s2[i].charAt(s2[i].length()-1)) && s2[i].contains("^")){
                        x+=1*Math.pow(10,Double.parseDouble(Character.toString(s2[i].charAt(s2[i].length()-1))));
                    }else{
                        uni+=1;
                        if(uni>1){
                        throw new Exception();
                        }
                    }
                }*/
                if(s2[i].contains("^")){ //si es una x a un exponente se toma 1*10êxponente
                    x+=1*Math.pow(10,Double.parseDouble(s2[i].substring(s2[i].indexOf("^")+1)));
                }else if(s2[i].equals("x")){ //si es solo x se agrega 10 o 1*10^1
                    dec+=10;
                    x+=dec;
                }else{ //si es solo 1 se agrega 1 o 1*10^0
                    uni+=1;
                    x+=uni;
                }
            }
            if(uni>1 || dec>10){//si hay mas de un 1 o mas de un 10 eniva mensaje al usuario
                throw new Exception();
            }
            txtTrenBit.setText(""+x); //asigna el resultado al cuadro de texto de tren de bits
        }catch(Exception exception){
            JOptionPane.showMessageDialog(null,"ERROR");
        }
    }//GEN-LAST:event_btnTrenBitActionPerformed

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
            java.util.logging.Logger.getLogger(proyecto_unidad_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(proyecto_unidad_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(proyecto_unidad_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(proyecto_unidad_2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new proyecto_unidad_2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEcuacion;
    private javax.swing.JButton btnTrenBit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtEcuacion;
    private javax.swing.JTextField txtTrenBit;
    // End of variables declaration//GEN-END:variables
}