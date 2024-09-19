/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.restaurantedonrigo;

/**
 *
 * @author Administrador
 */
public final class Inicio extends javax.swing.JFrame {
    
    /**
     * Creates new form Inicio
     */
    public Inicio() {
        setTitle("Inicio");
        
        initComponents();
        
        setLocationRelativeTo(null);
        
        String Mitexto = "El restaurante \"Don Rigo\" ha decidido modernizar su sistema de reservas "
                + "para mejorar la eficiencia en la gestión de pedidos y ofrecer una experiencia "
                + "más personalizada a sus clientes. "
                + "Como desarrollador, se te ha encomendado la tarea de crear un sistema de reservas de comida "
                + "con interfaz gráfica (GUI) que permita realizar reservas y al personal de cocina gestionar "
                + "los pedidos de manera eficiente.";
        
        texto.setText(StrToHtml(Mitexto));
        
        //Eliminar el borde de seleccion de los botones
        btnMesero.setFocusPainted(false);
        btnCocina.setFocusPainted(false);
        btnSalir.setFocusPainted(false);
    }
    
    public String StrToHtml(String texto)
    {
        return "<html><p>"+ texto + "</p></html>";
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        bg_green = new javax.swing.JPanel();
        tittle1 = new javax.swing.JLabel();
        texto = new javax.swing.JLabel();
        lblGrupo6 = new javax.swing.JLabel();
        lblAndres = new javax.swing.JLabel();
        lblElian = new javax.swing.JLabel();
        lblDocumentoAndres = new javax.swing.JLabel();
        lblDocumentoElian = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnMesero = new javax.swing.JButton();
        btnCocina = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        bg_green.setBackground(new java.awt.Color(104, 159, 56));
        bg_green.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tittle1.setFont(new java.awt.Font("Montserrat Medium", 1, 18)); // NOI18N
        tittle1.setForeground(new java.awt.Color(255, 255, 255));
        tittle1.setText("Sistema de Reservas Don Rigo");
        bg_green.add(tittle1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, -1));

        texto.setFont(new java.awt.Font("Open Sans Condensed Medium", 0, 14)); // NOI18N
        texto.setForeground(new java.awt.Color(255, 255, 255));
        texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        bg_green.add(texto, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 370, 140));

        lblGrupo6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        lblGrupo6.setText("Grupo 6");

        lblAndres.setFont(new java.awt.Font("Open Sans Condensed Medium", 0, 14)); // NOI18N
        lblAndres.setText("Andrés Alejandro García Morales");

        lblElian.setFont(new java.awt.Font("Open Sans Condensed Medium", 0, 14)); // NOI18N
        lblElian.setText("Elian Emilio Sosa Chavarria");

        lblDocumentoAndres.setFont(new java.awt.Font("Open Sans Condensed SemiBold", 1, 14)); // NOI18N
        lblDocumentoAndres.setText("1038097990");

        lblDocumentoElian.setFont(new java.awt.Font("Open Sans Condensed SemiBold", 1, 14)); // NOI18N
        lblDocumentoElian.setText("1045419616");

        btnSalir.setBackground(new java.awt.Color(211, 47, 47));
        btnSalir.setFont(new java.awt.Font("Open Sans Condensed Medium", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnMesero.setBackground(new java.awt.Color(104, 159, 56));
        btnMesero.setFont(new java.awt.Font("Open Sans Condensed Medium", 1, 12)); // NOI18N
        btnMesero.setForeground(new java.awt.Color(255, 255, 255));
        btnMesero.setText("MESERO");
        btnMesero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeseroActionPerformed(evt);
            }
        });

        btnCocina.setBackground(new java.awt.Color(104, 159, 56));
        btnCocina.setFont(new java.awt.Font("Open Sans Condensed Medium", 1, 12)); // NOI18N
        btnCocina.setForeground(new java.awt.Color(255, 255, 255));
        btnCocina.setText("COCINA");
        btnCocina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCocinaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg_green, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGrupo6)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAndres)
                            .addComponent(lblElian))
                        .addGap(18, 18, 18)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDocumentoElian)
                            .addComponent(lblDocumentoAndres)))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(btnMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCocina, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(bg_green, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblGrupo6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAndres)
                    .addComponent(lblDocumentoAndres))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblElian)
                    .addComponent(lblDocumentoElian))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMesero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCocina, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //cerrar la aplicacion completa
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnMeseroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeseroActionPerformed
        //ocultamos ventana Inicio
        setVisible(false);
        //costramos ventana Mesero
        new Mesero().setVisible(true);
    }//GEN-LAST:event_btnMeseroActionPerformed

    private void btnCocinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCocinaActionPerformed
        //ocultamos ventana Inicio
        setVisible(false);
        //costramos ventana Mesero
        new Cocina().setVisible(true);
    }//GEN-LAST:event_btnCocinaActionPerformed

    public static void main(String args[]) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg_green;
    private javax.swing.JButton btnCocina;
    private javax.swing.JButton btnMesero;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblAndres;
    private javax.swing.JLabel lblDocumentoAndres;
    private javax.swing.JLabel lblDocumentoElian;
    private javax.swing.JLabel lblElian;
    private javax.swing.JLabel lblGrupo6;
    private javax.swing.JLabel texto;
    private javax.swing.JLabel tittle1;
    // End of variables declaration//GEN-END:variables
}
