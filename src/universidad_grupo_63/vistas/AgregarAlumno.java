/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package universidad_grupo_63.vistas;

import java.awt.Color;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import universidad_grupo_63.accesoADatos.AlumnoData;
import universidad_grupo_63.entidades.Alumno;

/**
 *
 * @author USUARIO
 */
public class AgregarAlumno extends javax.swing.JPanel {

    AlumnoData alumnoData = new AlumnoData();
    
    /**
     * Creates new form AgregarAlumno
     */
    
    private DefaultTableModel modeloTabla = new DefaultTableModel() {
            public boolean isCellEditable(int fila, int columna) {
              return false;  
            }
        };
    
    public AgregarAlumno() {
        initComponents();
        armarCabecera();
        cargarTablaAlumnos();
        btnEliminar.setVisible(false);
        jLabelActualizar.setVisible(false);
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldFechaNacimiento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldDni = new javax.swing.JTextField();
        jLabelAgregarAlumno = new javax.swing.JLabel();
        jLabelActualizar = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEliminar = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(0, 170, 228));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGREGAR ALUMNO");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(226, 240, 251));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Nombre");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 37, 55, 26));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("DNI");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 55, 26));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Apellido");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 55, 26));

        jTextFieldFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFechaNacimientoActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldFechaNacimiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 120, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Fecha de nacimiento");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 130, 26));

        jTextFieldNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNombreActionPerformed(evt);
            }
        });
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyReleased(evt);
            }
        });
        jPanel3.add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 120, -1));

        jTextFieldApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldApellidoActionPerformed(evt);
            }
        });
        jTextFieldApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextFieldApellidoKeyReleased(evt);
            }
        });
        jPanel3.add(jTextFieldApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 120, -1));

        jTextFieldDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldDniActionPerformed(evt);
            }
        });
        jPanel3.add(jTextFieldDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 120, -1));

        jLabelAgregarAlumno.setBackground(new java.awt.Color(90, 184, 233));
        jLabelAgregarAlumno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelAgregarAlumno.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAgregarAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelAgregarAlumno.setText("AGREGAR ");
        jLabelAgregarAlumno.setOpaque(true);
        jLabelAgregarAlumno.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelAgregarAlumnoMouseMoved(evt);
            }
        });
        jLabelAgregarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelAgregarAlumnoMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelAgregarAlumnoMouseExited(evt);
            }
        });
        jPanel3.add(jLabelAgregarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 100, 30));

        jLabelActualizar.setBackground(new java.awt.Color(90, 184, 233));
        jLabelActualizar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jLabelActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelActualizar.setText("ACTUALIZAR");
        jLabelActualizar.setOpaque(true);
        jLabelActualizar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabelActualizarMouseMoved(evt);
            }
        });
        jLabelActualizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelActualizarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelActualizarMouseExited(evt);
            }
        });
        jPanel3.add(jLabelActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, 30));

        jLabel9.setBackground(new java.awt.Color(90, 184, 233));
        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("LIMPIAR");
        jLabel9.setOpaque(true);
        jLabel9.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel9MouseMoved(evt);
            }
        });
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel9MouseExited(evt);
            }
        });
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 100, 30));

        jPanel4.setBackground(new java.awt.Color(226, 240, 251));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jTable1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jTable1ComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 20, 320, 230));

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setOpaque(true);
        btnEliminar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnEliminarMouseMoved(evt);
            }
        });
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        jPanel4.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 100, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 348, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldFechaNacimientoActionPerformed

    private void jTextFieldNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNombreActionPerformed

    private void jTextFieldApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldApellidoActionPerformed

    private void jTextFieldDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldDniActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldDniActionPerformed

    private void btnEliminarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseMoved
        // TODO add your handling code here:
        jLabel1.setBackground(Color.decode("#0096ce"));

    }//GEN-LAST:event_btnEliminarMouseMoved

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        // TODO add your handling code here:
        eliminacionLogicaAlumno();
        
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        // TODO add your handling code here:
        jLabel1.setBackground(Color.decode("#5AB8E9")); // CUANDO SACA EL MOUSE VUELVE AL COLOR QUE ESTABA
    }//GEN-LAST:event_btnEliminarMouseExited

    private void jLabelAgregarAlumnoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAgregarAlumnoMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelAgregarAlumnoMouseMoved

    private void jLabelAgregarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAgregarAlumnoMouseClicked
        // TODO add your handling code here:
        agregarAlumno();
       
    }//GEN-LAST:event_jLabelAgregarAlumnoMouseClicked

    private void jLabelAgregarAlumnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelAgregarAlumnoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelAgregarAlumnoMouseExited

    private void jLabelActualizarMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelActualizarMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelActualizarMouseMoved

    private void jLabelActualizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelActualizarMouseClicked
        // TODO add your handling code here:
        
        int filaSeleccionada = jTable1.getSelectedRow();
        
        if (filaSeleccionada!=-1) {
          int idAlumno = (Integer) jTable1.getValueAt(filaSeleccionada, 0);
          Alumno alumno = alumnoData.buscarAlumno(idAlumno);
          alumno.setNombre(jTextFieldNombre.getText());
          alumno.setApellido(jTextFieldApellido.getText());
          alumno.setDni(Integer.parseInt(jTextFieldDni.getText()));
          alumno.setFechaNacimiento(LocalDate.parse(jTextFieldFechaNacimiento.getText()));
          alumnoData.modificarAlumno(alumno); 
        }
        
        jLabelActualizar.setVisible(false);
        jLabelAgregarAlumno.setVisible(true);
        limpiarTextFields();
        cargarTablaAlumnos();
    }//GEN-LAST:event_jLabelActualizarMouseClicked

    private void jLabelActualizarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelActualizarMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabelActualizarMouseExited

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
     cargarTextFields();
     aparecerBotonEliminar();
     jLabelAgregarAlumno.setVisible(false);
     jLabelActualizar.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void jTable1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jTable1ComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1ComponentShown

    private void jLabel9MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseMoved

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseExited

    private void jTextFieldNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyReleased
        // TODO add your handling code here:
        buscarEnTablaPorNombre();
    }//GEN-LAST:event_jTextFieldNombreKeyReleased

    private void jTextFieldApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldApellidoKeyReleased
        // TODO add your handling code here:
        buscarEnTablaPorApellido();
    }//GEN-LAST:event_jTextFieldApellidoKeyReleased

    ListSelectionListener selectionListener = new ListSelectionListener(){
        public void valueChanged(ListSelectionEvent e) {
            if (!e.getValueIsAdjusting()) {
                int filaSeleccionada = jTable1.getSelectedRow();
                if (filaSeleccionada!=-1) {
                    btnEliminar.setOpaque(true);
                } else {
                    btnEliminar.setOpaque(false);
                }
            }
        }
    };

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelActualizar;
    private javax.swing.JLabel jLabelAgregarAlumno;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldApellido;
    private javax.swing.JTextField jTextFieldDni;
    private javax.swing.JTextField jTextFieldFechaNacimiento;
    private javax.swing.JTextField jTextFieldNombre;
    // End of variables declaration//GEN-END:variables

    public void armarCabecera() {
        modeloTabla.addColumn("ID");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("DNI");
        modeloTabla.addColumn("Fecha de nacimiento");
        jTable1.setModel(modeloTabla);
    }

    public void borrarFilas() {
        int f = jTable1.getRowCount()-1; // CANTIDAD DE FILAS MENOS UNO
        for (;f >= 0; f--) {
            modeloTabla.removeRow(f);
        }
    }

    private void cargarTablaAlumnos() {
        borrarFilas();
        for (Alumno alumno : alumnoData.listarAlumnos()){
           modeloTabla.addRow(new Object[] {
               alumno.getIdAlumno(), 
               alumno.getNombre(),
               alumno.getApellido(),
               alumno.getDni(),
               alumno.getFechaNacimiento() 
           });
        }
    }

    private void eliminacionLogicaAlumno() {
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada!=-1) { // SI HAY UNA FILA SELECCIONADA ENTRA AL CONDICIONAL
            int idAlumno = (Integer) jTable1.getValueAt(filaSeleccionada, 0); // TRAES EL VALOR DE LA FILA SELECCIONADA
            alumnoData.cambiarEstadoAlumno(idAlumno);
        } else {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        }
        cargarTablaAlumnos();
        limpiarTextFields();
        btnEliminar.setVisible(false);
    }
    
    private void cargarTextFields() {
        //getCellSelectionEnabled()
        int filaSeleccionada = jTable1.getSelectedRow();
        if (filaSeleccionada!=-1) {
            String nombre = (String) jTable1.getValueAt(filaSeleccionada, 1);
            jTextFieldNombre.setText(nombre+"");
            String apellido = (String) jTable1.getValueAt(filaSeleccionada, 2);
            jTextFieldApellido.setText(apellido+"");
            int dni = (Integer) jTable1.getValueAt(filaSeleccionada, 3);
            jTextFieldDni.setText(dni+"");
            String fechaNacimiento = jTable1.getValueAt(filaSeleccionada, 4).toString();
            jTextFieldFechaNacimiento.setText(fechaNacimiento+"");
        }
    }
    
    private void limpiarTextFields () {
        
        jTextFieldNombre.setText("");
        jTextFieldApellido.setText("");
        jTextFieldDni.setText("");
        jTextFieldFechaNacimiento.setText("");
    }

    private void agregarAlumno() {
        Alumno nuevoAlumno = new Alumno(); // CONSTRUCTOR VACÍO
        nuevoAlumno.setNombre(jTextFieldNombre.getText()); // LE SETEAS EL NOMBRE QUE LO EXTRAES DEL TEXTFIELD
        nuevoAlumno.setApellido(jTextFieldApellido.getText());
        nuevoAlumno.setDni(Integer.parseInt(jTextFieldDni.getText()));
        nuevoAlumno.setFechaNacimiento(LocalDate.parse(jTextFieldFechaNacimiento.getText()));
        nuevoAlumno.setEstadoAlumno(true);
        alumnoData.guardarAlumno(nuevoAlumno);
        limpiarTextFields();
        cargarTablaAlumnos();
    }

    private void aparecerBotonEliminar() {
       int filaSeleccionada = jTable1.getSelectedRow();
        
        if (filaSeleccionada!=-1) {
            btnEliminar.setVisible(true);
            
        } 
    }

    private void buscarEnTablaPorNombre() {
        borrarFilas();
        for (Alumno alumno : alumnoData.listarAlumnos()) {
            if (alumno.getNombre().toLowerCase().startsWith(jTextFieldNombre.getText().toLowerCase())) {
               modeloTabla.addRow(new Object[] {
               alumno.getIdAlumno(), 
               alumno.getNombre(),
               alumno.getApellido(),
               alumno.getDni(),
               alumno.getFechaNacimiento() 
           });
               
            } 
        }
        
    }

    private void buscarEnTablaPorApellido() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
