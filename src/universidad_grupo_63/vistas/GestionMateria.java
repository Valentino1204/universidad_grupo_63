/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package universidad_grupo_63.vistas;

import java.awt.Color;
import java.awt.Point;
import java.time.LocalDate;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import universidad_grupo_63.accesoADatos.MateriaData;
import universidad_grupo_63.entidades.Materia;

/**
 *
 * @author USUARIO
 */
public class GestionMateria extends javax.swing.JPanel {

    MateriaData materiaData = new MateriaData();
    
    /**
     * Creates new form AgregarAlumno
     */
    
    private DefaultTableModel modeloTabla = new DefaultTableModel() {
            public boolean isCellEditable(int fila, int columna) {
              return false;  
            }
        };
    
    public GestionMateria() {
        initComponents();
        armarCabecera();
        cargarTablaMaterias();
        btnEliminarMateria.setVisible(false);
        btnActualizarMateria.setVisible(false);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNombreMateria = new javax.swing.JTextField();
        jTextFieldAnio = new javax.swing.JTextField();
        btnAgregarMateria = new javax.swing.JLabel();
        btnActualizarMateria = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JLabel();
        btnBuscarMateria = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableMaterias = new javax.swing.JTable();
        btnEliminarMateria = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(226, 240, 251));
        jPanel3.setPreferredSize(new java.awt.Dimension(286, 322));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Nombre");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 55, 26));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Año");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 55, 26));

        jTextFieldNombreMateria.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNombreMateriaKeyReleased(evt);
            }
        });
        jPanel3.add(jTextFieldNombreMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 180, -1));

        jTextFieldAnio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldAnioKeyReleased(evt);
            }
        });
        jPanel3.add(jTextFieldAnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 180, -1));

        btnAgregarMateria.setBackground(new java.awt.Color(90, 184, 233));
        btnAgregarMateria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarMateria.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarMateria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregarMateria.setText("AGREGAR ");
        btnAgregarMateria.setOpaque(true);
        btnAgregarMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMateriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMateriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMateriaMouseExited(evt);
            }
        });
        jPanel3.add(btnAgregarMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, 30));

        btnActualizarMateria.setBackground(new java.awt.Color(90, 184, 233));
        btnActualizarMateria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizarMateria.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarMateria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActualizarMateria.setText("ACTUALIZAR");
        btnActualizarMateria.setOpaque(true);
        btnActualizarMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarMateriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarMateriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarMateriaMouseExited(evt);
            }
        });
        jPanel3.add(btnActualizarMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 120, 30));

        btnLimpiar.setBackground(new java.awt.Color(90, 184, 233));
        btnLimpiar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnLimpiar.setText("LIMPIAR");
        btnLimpiar.setOpaque(true);
        btnLimpiar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLimpiarMouseExited(evt);
            }
        });
        jPanel3.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 120, 30));

        btnBuscarMateria.setBackground(new java.awt.Color(90, 184, 233));
        btnBuscarMateria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscarMateria.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarMateria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscarMateria.setText("BUSCAR");
        btnBuscarMateria.setOpaque(true);
        btnBuscarMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMateriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMateriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMateriaMouseExited(evt);
            }
        });
        jPanel3.add(btnBuscarMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 120, 30));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 250, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 250, 10));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 250, 10));

        jLabel1.setText("Datos de la Materia");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, -1, -1));

        jPanel4.setBackground(new java.awt.Color(226, 240, 251));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTableMaterias.setModel(new javax.swing.table.DefaultTableModel(
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
        jTableMaterias.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTableMaterias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMateriasMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableMaterias);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 450, 230));

        btnEliminarMateria.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarMateria.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminarMateria.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarMateria.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminarMateria.setText("ELIMINAR");
        btnEliminarMateria.setOpaque(true);
        btnEliminarMateria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMateriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMateriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMateriaMouseExited(evt);
            }
        });
        jPanel4.add(btnEliminarMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 260, 100, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    //------------------ Eventos Mouse Clicked ----------------------
   
    private void btnEliminarMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMateriaMouseClicked
        eliminacionLogicaMateria();
    }//GEN-LAST:event_btnEliminarMateriaMouseClicked

    private void btnAgregarMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMateriaMouseClicked
        agregarMateria();
    }//GEN-LAST:event_btnAgregarMateriaMouseClicked

    private void btnActualizarMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMateriaMouseClicked
        actualizarMateria();
    }//GEN-LAST:event_btnActualizarMateriaMouseClicked

    private void jTableMateriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableMateriasMouseClicked
        cargarTextFields();
        aparecerBotonEliminar();
        btnAgregarMateria.setVisible(false);
        btnActualizarMateria.setVisible(true);
    }//GEN-LAST:event_jTableMateriasMouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiarTextFields();
        cargarTablaMaterias();
        jTextFieldNombreMateria.setBorder(null);
        jTextFieldAnio.setBorder(null);
        btnAgregarMateria.setVisible(true);
        btnActualizarMateria.setVisible(false);
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnBuscarMateriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMateriaMouseClicked
        buscarEnTabla();
    }//GEN-LAST:event_btnBuscarMateriaMouseClicked
  
    // ---------------- Eventos Tamaño y Color Botones ------------------------
    
    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        mouseExited(btnLimpiar);
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnEliminarMateriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMateriaMouseExited
        btnEliminarMateria.setBackground(Color.decode("#840000"));
    }//GEN-LAST:event_btnEliminarMateriaMouseExited

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        mouseEntered(btnLimpiar);
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnBuscarMateriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMateriaMouseEntered
        mouseEntered(btnBuscarMateria);
    }//GEN-LAST:event_btnBuscarMateriaMouseEntered

    private void btnBuscarMateriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMateriaMouseExited
        mouseExited(btnBuscarMateria);
    }//GEN-LAST:event_btnBuscarMateriaMouseExited

    private void btnEliminarMateriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMateriaMouseEntered
        btnEliminarMateria.setBackground(Color.red);
    }//GEN-LAST:event_btnEliminarMateriaMouseEntered
    
    private void btnActualizarMateriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMateriaMouseEntered
        // TODO add your handling code here:
        mouseEntered(btnActualizarMateria);
    }//GEN-LAST:event_btnActualizarMateriaMouseEntered

    private void btnActualizarMateriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarMateriaMouseExited
        // TODO add your handling code here:
        mouseExited(btnActualizarMateria);
    }//GEN-LAST:event_btnActualizarMateriaMouseExited

    private void btnAgregarMateriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMateriaMouseEntered
        // TODO add your handling code here:
        mouseEntered(btnAgregarMateria);
    }//GEN-LAST:event_btnAgregarMateriaMouseEntered

    private void btnAgregarMateriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMateriaMouseExited
        // TODO add your handling code here:
        mouseExited(btnAgregarMateria);
    }//GEN-LAST:event_btnAgregarMateriaMouseExited

    private void jTextFieldNombreMateriaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreMateriaKeyReleased
        // TODO add your handling code here:
        validacionTextField1(jTextFieldNombreMateria);
    }//GEN-LAST:event_jTextFieldNombreMateriaKeyReleased

    private void jTextFieldAnioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldAnioKeyReleased
        // TODO add your handling code here:
        validacionTextField1(jTextFieldAnio);
    }//GEN-LAST:event_jTextFieldAnioKeyReleased


    //--------------------------------------------------------------------

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnActualizarMateria;
    private javax.swing.JLabel btnAgregarMateria;
    private javax.swing.JLabel btnBuscarMateria;
    private javax.swing.JLabel btnEliminarMateria;
    private javax.swing.JLabel btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable jTableMaterias;
    private javax.swing.JTextField jTextFieldAnio;
    private javax.swing.JTextField jTextFieldNombreMateria;
    // End of variables declaration//GEN-END:variables

    public void armarCabecera() {
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Materia");
        modeloTabla.addColumn("Año");
        jTableMaterias.setModel(modeloTabla);
    }

    public void borrarFilas() {
        int f = jTableMaterias.getRowCount()-1; // CANTIDAD DE FILAS MENOS UNO
        for (;f >= 0; f--) {
            modeloTabla.removeRow(f);
        }
    }

    private void cargarTablaMaterias() {
        borrarFilas();
        for (Materia materia : materiaData.listarMaterias()){
           modeloTabla.addRow(new Object[] {
               materia.getIdMateria(),
               materia.getNombreMateria(), 
               materia.getAnio()
           });
        }
    }

    private void eliminacionLogicaMateria() {
        int filaSeleccionada = jTableMaterias.getSelectedRow();
        if (filaSeleccionada!=-1) { // SI HAY UNA FILA SELECCIONADA ENTRA AL CONDICIONAL
            int idMateria = (Integer) jTableMaterias.getValueAt(filaSeleccionada, 0); // TRAES EL VALOR DE LA FILA SELECCIONADA
            materiaData.cambiarEstadoMateria(idMateria);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        }
        cargarTablaMaterias();
        limpiarTextFields();
        btnEliminarMateria.setVisible(false);
    }
    
    private void cargarTextFields() {
        //getCellSelectionEnabled()
        int filaSeleccionada = jTableMaterias.getSelectedRow();
        if (filaSeleccionada!=-1) {
            String nombreMateria = (String) jTableMaterias.getValueAt(filaSeleccionada, 1);
            jTextFieldNombreMateria.setText(nombreMateria);
            int anio = (Integer) jTableMaterias.getValueAt(filaSeleccionada, 2);
            jTextFieldAnio.setText(anio+"");
        }
    }
    
    private void limpiarTextFields () { 
        jTextFieldNombreMateria.setText("");
        jTextFieldAnio.setText("");
    }

    private void agregarMateria() {
        Materia nuevaMateria = new Materia();
        boolean[] materiaRellena = {false, false};
        try{
            if(validacionTextField1(jTextFieldNombreMateria)){
                nuevaMateria.setNombreMateria(jTextFieldNombreMateria.getText());
                materiaRellena[0]=true;
            }else{
                JOptionPane.showMessageDialog(this, "Debe ingresar un nombre de Materia");
                materiaRellena[0] = false;
            }
            if(validacionTextField1(jTextFieldAnio)){
                nuevaMateria.setAnio(Integer.parseInt(jTextFieldAnio.getText()));
                materiaRellena[1]=true;
            }else{
                JOptionPane.showMessageDialog(this, "Debe ingresar el año");
                materiaRellena[1] = false;
            }
            
            nuevaMateria.setEstadoMateria(true);
            
            if(materiaRellena[0]==true && materiaRellena[1]==true){
                materiaData.guardarMateria(nuevaMateria);
                limpiarTextFields();
                cargarTablaMaterias();
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Ingrese correctamente el año");
            jTextFieldAnio.setText("");
            validacionTextField1(jTextFieldAnio);
        }
        
    }
    
    private void actualizarMateria() {
        
        int filaSeleccionada = jTableMaterias.getSelectedRow();
        boolean[] materiaRellena = {false, false};
        
        if (filaSeleccionada!=-1) {
            int idMateria = (Integer) jTableMaterias.getValueAt(filaSeleccionada, 0);
            Materia materia = materiaData.buscarMateria(idMateria);
            
            try{
                if(validacionTextField1(jTextFieldNombreMateria)){
                    materia.setNombreMateria(jTextFieldNombreMateria.getText());
                    materiaRellena[0]=true;
                }else{
                    JOptionPane.showMessageDialog(this, "Debe ingresar un nombre de Materia");
                    materiaRellena[0] = false;
                }
                if(validacionTextField1(jTextFieldAnio)){
                    materia.setAnio(Integer.parseInt(jTextFieldAnio.getText()));
                    materiaRellena[1]=true;
                }else{
                    JOptionPane.showMessageDialog(this, "Debe ingresar el año");
                    materiaRellena[1] = false;
                }

                if(materiaRellena[0]==true && materiaRellena[1]==true){
                    materiaData.modificarMateria(materia); 
                    limpiarTextFields();
                    cargarTablaMaterias();
                    btnActualizarMateria.setVisible(false);
                    btnAgregarMateria.setVisible(true);
                }
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(this, "Ingrese correctamente el año");
                jTextFieldAnio.setText("");
                validacionTextField1(jTextFieldAnio);
            }
        }
    }    
    
    private void aparecerBotonEliminar() {
       int filaSeleccionada = jTableMaterias.getSelectedRow();
        
        if (filaSeleccionada!=-1) {
            btnEliminarMateria.setVisible(true);
            
        } 
    }

    private void buscarEnTabla() {
        borrarFilas();
        for (Materia materia : materiaData.listarMaterias()) {
            
            if(!jTextFieldAnio.getText().isEmpty() && !jTextFieldNombreMateria.getText().isEmpty()){ //Primer consulta es si los dos campos tienen valores.
                if (materia.getNombreMateria().toLowerCase().startsWith(jTextFieldNombreMateria.getText().toLowerCase()) && String.valueOf(materia.getAnio()).startsWith(jTextFieldAnio.getText())) {
                    modeloTabla.addRow(new Object[]{
                    materia.getIdMateria(),
                    materia.getNombreMateria(),
                    materia.getAnio()});
                }
            } else if (!jTextFieldNombreMateria.getText().isEmpty()) { //Si solamente tiene el nombre ejecuta este
                if (materia.getNombreMateria().toLowerCase().startsWith(jTextFieldNombreMateria.getText().toLowerCase())) {
                    modeloTabla.addRow(new Object[]{
                    materia.getIdMateria(),
                    materia.getNombreMateria(),
                    materia.getAnio()});
                }
            }else if (!jTextFieldAnio.getText().isEmpty()) {// Si solamente tiene el año ejecuta este.
                if (String.valueOf(materia.getAnio()).startsWith(jTextFieldAnio.getText())) {
                    modeloTabla.addRow(new Object[]{
                    materia.getIdMateria(),
                    materia.getNombreMateria(),
                    materia.getAnio()});
                }
            }
            
        }
    }
    
    private boolean validacionTextField1(JTextField jtf) {
        if (jtf.getText().isEmpty()) {
            jtf.setBorder(BorderFactory.createLineBorder(Color.decode("#aa4356")));
            return false;
        } else {
            jtf.setBorder(null);
            return true;
        }
    }
    
    //------------------- Animacion botones celestes -----------------------
    
    private void mouseEntered(JLabel btn){
        btn.setBackground(Color.decode("#0096ce"));
        
        Point location = btn.getLocation(); // Obtener la posición actual de la etiqueta
        
        int w = btn.getWidth();
        int h = btn.getHeight();
        
        
        // Calcular las nuevas coordenadas para mantener la etiqueta centrada
        int newX = location.x - 1;
        int newY = location.y - 1;

        // Aumentar el tamaño de la etiqueta manteniendo su posición
        btn.setBounds(newX, newY, w + 3, h + 3);
        
    }
    
    private void mouseExited(JLabel btn){
        btn.setBackground(Color.decode("#5AB8E9"));
        
        int w = btn.getWidth();
        int h = btn.getHeight();
  
        // Obtener la posición actual de la etiqueta
            Point location = btn.getLocation();

        // Calcular las nuevas coordenadas para mantener la etiqueta centrada
            int newX = location.x + 1;
            int newY = location.y + 1;

        // Aumentar el tamaño de la etiqueta manteniendo su posición
            btn.setBounds(newX, newY, w - 3, h - 3);
    }

    
}
