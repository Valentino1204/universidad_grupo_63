/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package universidad_grupo_63.vistas;

import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.time.LocalDate;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidad_grupo_63.accesoADatos.AlumnoData;
import universidad_grupo_63.entidades.Alumno;

/**
 *
 * @author USUARIO
 */
public class GestionAlumno extends javax.swing.JPanel {

    AlumnoData alumnoData = new AlumnoData();
    
    /**
     * Creates new form AgregarAlumno
     */
    
    private DefaultTableModel modeloTabla = new DefaultTableModel() {
            public boolean isCellEditable(int fila, int columna) {
              return false;  
            }
        };
    
    public GestionAlumno() {
        initComponents();
        armarCabecera();
        cargarTablaAlumnos();
        btnEliminar.setVisible(false);
        btnActualizarAlumno.setVisible(false);
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
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldFechaNacimiento = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldApellido = new javax.swing.JTextField();
        jTextFieldDni = new javax.swing.JTextField();
        btnAgregarAlumno = new javax.swing.JLabel();
        btnActualizarAlumno = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEliminar = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(970, 520));
        jPanel1.setMinimumSize(new java.awt.Dimension(970, 520));
        jPanel1.setSize(new java.awt.Dimension(970, 520));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(226, 240, 251));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("DNI:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("Apellido:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(153, 153, 153));
        jLabel6.setText("Fecha de nacimiento:");

        btnAgregarAlumno.setBackground(new java.awt.Color(90, 184, 233));
        btnAgregarAlumno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAgregarAlumno.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnAgregarAlumno.setText("AGREGAR ");
        btnAgregarAlumno.setOpaque(true);
        btnAgregarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarAlumnoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarAlumnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarAlumnoMouseExited(evt);
            }
        });

        btnActualizarAlumno.setBackground(new java.awt.Color(90, 184, 233));
        btnActualizarAlumno.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnActualizarAlumno.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarAlumno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActualizarAlumno.setText("ACTUALIZAR");
        btnActualizarAlumno.setOpaque(true);
        btnActualizarAlumno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnActualizarAlumnoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnActualizarAlumnoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnActualizarAlumnoMouseExited(evt);
            }
        });

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

        btnBuscar.setBackground(new java.awt.Color(90, 184, 233));
        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscar.setText("BUSCAR");
        btnBuscar.setOpaque(true);
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(15, 15, 15)
                                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel5)
                                            .addGap(18, 18, 18)
                                            .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jTextFieldFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(jPanel3Layout.createSequentialGroup()
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(btnAgregarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnActualizarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnActualizarAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

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
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 480, 230));

        btnEliminar.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminar.setText("ELIMINAR");
        btnEliminar.setOpaque(true);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEliminarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEliminarMouseExited(evt);
            }
        });
        jPanel4.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 100, 30));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 70, 519, 322));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 970, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        eliminacionLogicaAlumno(); 
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnAgregarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAlumnoMouseClicked
        agregarAlumno(); 
    }//GEN-LAST:event_btnAgregarAlumnoMouseClicked

    private void btnAgregarAlumnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAlumnoMouseExited
        // TODO add your handling code here:
        mouseExited(btnAgregarAlumno);
    }//GEN-LAST:event_btnAgregarAlumnoMouseExited

    private void btnActualizarAlumnoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarAlumnoMouseClicked
        actualizarAlumno();
    }//GEN-LAST:event_btnActualizarAlumnoMouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        cargarTextFields();
        aparecerBotonEliminar();
        btnAgregarAlumno.setVisible(false);
        btnActualizarAlumno.setVisible(true);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnLimpiarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseClicked
        limpiarTextFields();
        cargarTablaAlumnos();
        btnAgregarAlumno.setVisible(true);
        btnActualizarAlumno.setVisible(false);
    }//GEN-LAST:event_btnLimpiarMouseClicked

    private void btnLimpiarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseExited
        // TODO add your handling code here:
        mouseExited(btnLimpiar);
    }//GEN-LAST:event_btnLimpiarMouseExited

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        buscarAlumnoEnTabla();
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseExited
        // TODO add your handling code here:
        mouseExited(btnBuscar);
    }//GEN-LAST:event_btnBuscarMouseExited

    private void btnLimpiarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimpiarMouseEntered
        // TODO add your handling code here:
        mouseEntered(btnLimpiar);
    }//GEN-LAST:event_btnLimpiarMouseEntered

    private void btnBuscarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseEntered
        // TODO add your handling code here:
        mouseEntered(btnBuscar);
    }//GEN-LAST:event_btnBuscarMouseEntered

    private void btnActualizarAlumnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarAlumnoMouseEntered
        // TODO add your handling code here:
        mouseEntered(btnActualizarAlumno);
    }//GEN-LAST:event_btnActualizarAlumnoMouseEntered

    private void btnActualizarAlumnoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnActualizarAlumnoMouseExited
        // TODO add your handling code here:
        mouseExited(btnActualizarAlumno);
    }//GEN-LAST:event_btnActualizarAlumnoMouseExited

    private void btnAgregarAlumnoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarAlumnoMouseEntered
        // TODO add your handling code here:
        mouseEntered(btnAgregarAlumno);
    }//GEN-LAST:event_btnAgregarAlumnoMouseEntered

    private void btnEliminarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseEntered
        // TODO add your handling code here:
        btnEliminar.setBackground(Color.red);
    }//GEN-LAST:event_btnEliminarMouseEntered

    private void btnEliminarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseExited
        // TODO add your handling code here:
        btnEliminar.setBackground(Color.decode("#840000"));
    }//GEN-LAST:event_btnEliminarMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnActualizarAlumno;
    private javax.swing.JLabel btnAgregarAlumno;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnLimpiar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
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
        jTable1.sizeColumnsToFit(1);
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
    
    private void buscarAlumnoEnTabla() {
        borrarFilas();
        
        String nombre = jTextFieldNombre.getText();
        String apellido = jTextFieldApellido.getText();
        String dni = jTextFieldDni.getText();
        
        for (Alumno alumno : alumnoData.listarAlumnos()) {
            
            if(nombre != null && apellido != null && dni != null){ //NOMBRE + APELLIDO + DNI
                if(alumno.getNombre().toLowerCase().startsWith(nombre.toLowerCase()) &&
                    alumno.getApellido().toLowerCase().startsWith(apellido.toLowerCase()) &&
                    String.valueOf(alumno.getDni()).startsWith(dni)){
                        modeloTabla.addRow(new Object[] {
                        alumno.getIdAlumno(), 
                        alumno.getNombre(),
                        alumno.getApellido(),
                        alumno.getDni(),
                        alumno.getFechaNacimiento()});
                }
            }else if(nombre != null && apellido !=null){ // NOMBRE + APELLIDO
                if(alumno.getNombre().toLowerCase().startsWith(nombre.toLowerCase()) &&
                    alumno.getApellido().toLowerCase().startsWith(apellido.toLowerCase())){
                        modeloTabla.addRow(new Object[] {
                        alumno.getIdAlumno(), 
                        alumno.getNombre(),
                        alumno.getApellido(),
                        alumno.getDni(),
                        alumno.getFechaNacimiento()});
                }
            }else if(nombre != null){ // NOMBRE
                if(alumno.getNombre().toLowerCase().startsWith(nombre.toLowerCase())){
                        modeloTabla.addRow(new Object[] {
                        alumno.getIdAlumno(), 
                        alumno.getNombre(),
                        alumno.getApellido(),
                        alumno.getDni(),
                        alumno.getFechaNacimiento()});
                }
            }else if(apellido != null){ // APELLIDO
                if(alumno.getApellido().toLowerCase().startsWith(nombre.toLowerCase())){
                        modeloTabla.addRow(new Object[] {
                        alumno.getIdAlumno(), 
                        alumno.getNombre(),
                        alumno.getApellido(),
                        alumno.getDni(),
                        alumno.getFechaNacimiento()});
                }
            }else if(dni != null){ //DNI
                if (String.valueOf(alumno.getDni()).startsWith(jTextFieldDni.getText())) {
                    modeloTabla.addRow(new Object[] {
                    alumno.getIdAlumno(), 
                    alumno.getNombre(),
                    alumno.getApellido(),
                    alumno.getDni(),
                    alumno.getFechaNacimiento()});
                }
            }
             
        }
        
    } 



    private void actualizarAlumno() {
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
        
        btnActualizarAlumno.setVisible(false);
        btnAgregarAlumno.setVisible(true);
        limpiarTextFields();
        cargarTablaAlumnos();
    }
    
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
