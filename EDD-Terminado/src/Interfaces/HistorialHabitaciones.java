/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaces;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import proyecto2.Clases.Historico;
import proyecto2.EDD.ABB;
import proyecto2.EDD.Lista;
import proyecto2.EDD.TablaHash;

/**
 *
 * @author Giuseppe Vaccaro
 */
public class HistorialHabitaciones extends javax.swing.JFrame {
    private static TablaHash tablaEstado;
    private static ABB arbolReserva;
    private static ABB arbolHistorico;
    DefaultTableModel modelo = new DefaultTableModel();
    /**
     * Creates new form HistorialHabitaciones
     */
    public HistorialHabitaciones(TablaHash tablaEstado, ABB arbolReserva, ABB arbolHistorico) {
        initComponents();
        this.tablaEstado = tablaEstado;
        this.arbolReserva = arbolReserva;
        this.arbolHistorico = arbolHistorico;
        
        String[] campos = new String[7];
        
        campos[0] = "Cedula";
        campos[1] = "Nombre";
        campos[2] = "Apellido";
        campos[3] = "Correo";
        campos[4] = "Genero";
        campos[5] = "Fecha";
        campos[6] = "Habitacion";
        
        modelo.setColumnIdentifiers(campos);        
        tablaHistorial.setModel(modelo);
   
    }

    
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new Fondo();
        numeroHab = new javax.swing.JTextField();
        buscar = new javax.swing.JButton();
        salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaHistorial = new javax.swing.JTable();

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(130, 147, 96));
        jLabel2.setText("Check Out");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(numeroHab, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 200, -1));

        buscar.setBackground(new java.awt.Color(89, 105, 105));
        buscar.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        buscar.setText("Buscar");
        buscar.setBorder(null);
        buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarActionPerformed(evt);
            }
        });
        jPanel1.add(buscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 110, 30));

        salir.setBackground(new java.awt.Color(147, 161, 134));
        salir.setText("Regresar");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jPanel1.add(salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel1.setFont(new java.awt.Font("Sitka Text", 1, 12)); // NOI18N
        jLabel1.setText("Número de Habitación");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(130, 147, 96));
        jLabel3.setText("Historial de habitaciones");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 190, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Logos/logohabitacion.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        tablaHistorial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tablaHistorial);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 450, 240));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarActionPerformed
        modelo.setRowCount(0);
        
        try{
            if(numeroHab.getText().isBlank()){
                JOptionPane.showMessageDialog(null, "Debes ingresar un numero de habitación");

            }else{
                String numHab = numeroHab.getText();
                Integer numHabInt = Integer.parseInt(numHab);
                

                Lista lista = new Lista();
                arbolHistorico.obtenerHistorialHab(arbolHistorico.getRaiz(), numHab, lista);

                Object[] fila = new Object[7];
                for (int i = 0; i < lista.getNumElementos(); i++) {
                    Historico historico = (Historico) lista.obtener(i);

                    fila[0] = historico.getCi();
                    fila[1] = historico.getNombre();
                    fila[2] = historico.getApellido();
                    fila[3] = historico.getCorreo();
                    fila[4] = historico.getGenero();
                    fila[5] = historico.getFechaLlegada();
                    fila[6] = historico.getNumHabitacion();
                    modelo.addRow(fila);                
                }
                
                tablaHistorial.setModel(modelo);
                

            }
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Debes ingresar números enteros");
        }
        
    }//GEN-LAST:event_buscarActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        Menu menu = new Menu(tablaEstado, arbolReserva, arbolHistorico);
        this.dispose();
        menu.setVisible(true);
    }//GEN-LAST:event_salirActionPerformed

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
            java.util.logging.Logger.getLogger(HistorialHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HistorialHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HistorialHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HistorialHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HistorialHabitaciones(tablaEstado, arbolReserva, arbolHistorico).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField numeroHab;
    private javax.swing.JButton salir;
    private javax.swing.JTable tablaHistorial;
    // End of variables declaration//GEN-END:variables
class Fondo extends JPanel{
        private Image imagen;
        
        @Override
        public void paint(Graphics g){
            imagen= new ImageIcon(getClass().getResource("/Imagenes/fondo.jpg")).getImage();
            g.drawImage(imagen,0,0,getWidth(),getHeight(),this);
                    setOpaque(false);
                    
                    super.paint(g);
        }
    }}
