package pe.edu.upeu.ter.gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import pe.edu.upeu.ter.dao.ResultadoDao;
import pe.edu.upeu.ter.dao.ResultadoDaoI;
import pe.edu.upeu.ter.modelo.ResultadoTO;
/**
 *
 * @author BanKai
 */
public class MainTresenraya extends javax.swing.JFrame implements ActionListener{
    
    private JButton[] button = new JButton[9];
    private char currentPlayer = 'X';
    private boolean gameEnded = false;
    private List<ResultadoTO> results = new ArrayList<>();
    private int id_class = 0;
    private int contador = 0;
    private int puntosJugador1 = 0;
    private int puntosJugador2 = 0;  

    public MainTresenraya() {
        initComponents();
        jpanelttt.setLayout(new GridLayout(3, 3));
        listarREsultados();
        initializeButtons();
        setLocationRelativeTo(null);
        panelfondoj.requestFocus();
        
    }
    
 
    private void initializeButtons() {
        for (int i = 0; i <= 8; i++) {
            button[i] = new JButton();
            button[i].setEnabled(false);
            jpanelttt.add(button[i]);
            button[i].addActionListener(this);
        }
        btnanular.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        panelfondoj = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtjugador1 = new javax.swing.JTextField();
        txtjugador2 = new javax.swing.JTextField();
        btniniciar = new javax.swing.JButton();
        btnanular = new javax.swing.JButton();
        btnbd = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        turnoname = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        playerlabel1 = new javax.swing.JLabel();
        playerlabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablerasult = new javax.swing.JTable();
        jpanelttt = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 48)); // NOI18N
        jLabel1.setText("TIC TAC TOE");

        jLabel2.setText("LEONARDO JESUS HUAMAN ARHUATA");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(106, 106, 106))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelfondoj.setBackground(new java.awt.Color(204, 204, 255));
        panelfondoj.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelfondojMousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setText("JUGADOR 1:");

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("JUGADOR 2:");

        txtjugador1.setText("JUGADOR 1");
        txtjugador1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtjugador1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjugador1FocusLost(evt);
            }
        });
        txtjugador1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjugador1ActionPerformed(evt);
            }
        });
        txtjugador1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtjugador1KeyTyped(evt);
            }
        });

        txtjugador2.setText("JUGADOR 2");
        txtjugador2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtjugador2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtjugador2FocusLost(evt);
            }
        });

        btniniciar.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btniniciar.setText("INICIAR");
        btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarActionPerformed(evt);
            }
        });

        btnanular.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnanular.setText("ANULAR");
        btnanular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnanularActionPerformed(evt);
            }
        });

        btnbd.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        btnbd.setText("BORAR DATOS");
        btnbd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("TURNO:");

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N

        turnoname.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel7.setText("JUGADOR1");

        playerlabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        playerlabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        jLabel10.setText("JUGADOR2");

        jTablerasult.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NuneroPartida", "1er. Jugador", "2do. Jugador", "Ganador", "Puntuacion", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTablerasult);

        javax.swing.GroupLayout panelfondojLayout = new javax.swing.GroupLayout(panelfondoj);
        panelfondoj.setLayout(panelfondojLayout);
        panelfondojLayout.setHorizontalGroup(
            panelfondojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfondojLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panelfondojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelfondojLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtjugador1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btniniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnanular, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelfondojLayout.createSequentialGroup()
                        .addGroup(panelfondojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelfondojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelfondojLayout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(playerlabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelfondojLayout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtjugador2, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelfondojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(playerlabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(panelfondojLayout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panelfondojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                        .addComponent(turnoname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                        .addGroup(panelfondojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelfondojLayout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(btnbd, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelfondojLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(13, Short.MAX_VALUE))
            .addGroup(panelfondojLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelfondojLayout.setVerticalGroup(
            panelfondojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelfondojLayout.createSequentialGroup()
                .addGroup(panelfondojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelfondojLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelfondojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelfondojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtjugador1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btniniciar))
                        .addGap(8, 8, 8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelfondojLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnanular)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(panelfondojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelfondojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(txtjugador2))
                    .addComponent(btnbd))
                .addGap(18, 18, 18)
                .addGroup(panelfondojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(turnoname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelfondojLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(playerlabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(playerlabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jpanelttt.setBackground(new java.awt.Color(255, 204, 204));
        jpanelttt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jpanelttt.setForeground(new java.awt.Color(51, 51, 51));
        jpanelttt.setLayout(new java.awt.GridLayout(3, 3));

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 331, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 73, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelfondoj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpanelttt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpanelttt, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelfondoj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtjugador1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjugador1ActionPerformed

    }//GEN-LAST:event_txtjugador1ActionPerformed

    private void txtjugador1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjugador1FocusGained
        // TODO add your handling code here:
        if (txtjugador1.getText().equals("JUGADOR 1"))
            txtjugador1.setText("");
    }//GEN-LAST:event_txtjugador1FocusGained

    private void txtjugador2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjugador2FocusGained
        // TODO add your handling code here:
        if (txtjugador2.getText().equals("JUGADOR 2"))
            txtjugador2.setText("");
    }//GEN-LAST:event_txtjugador2FocusGained

    private void txtjugador1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjugador1FocusLost
        // TODO add your handling code here:
        if (txtjugador1.getText().equals(""))
            txtjugador1.setText("JUGADOR 1");
    }//GEN-LAST:event_txtjugador1FocusLost

    private void txtjugador2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtjugador2FocusLost
        // TODO add your handling code here:
        if (txtjugador2.getText().equals(""))
            txtjugador2.setText("JUGADOR 2");
    }//GEN-LAST:event_txtjugador2FocusLost

    private void panelfondojMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelfondojMousePressed
        // TODO add your handling code here:
        panelfondoj.requestFocus();
    }//GEN-LAST:event_panelfondojMousePressed

    private void txtjugador1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtjugador1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjugador1KeyTyped

    private void btniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarActionPerformed
        // TODO add your handling code here:
        if (txtjugador1.getText().equals("JUGADOR 1") || txtjugador2.getText().equals("JUGADOR 2")) {
            JOptionPane.showMessageDialog(null, "Ingrese los nombres de los jugadores");
        } else {
            for (JButton btn : button) {
                btn.setEnabled(true);  // habilitar todos los botones de 3 en raya cuando se haga clic en el botón "Iniciar"
            }
            btniniciar.setEnabled(false);
            btnanular.setEnabled(true);
            jugadoractual(); //Para asignar el texto del turno
            saveResultado("Sin ganador", "Jugando", true,0,0);
            listarREsultados();
        }
    }//GEN-LAST:event_btniniciarActionPerformed

    private void btnanularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnanularActionPerformed
        // TODO add your handling code here:
         int dialogResult = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres ANULAR PARTIDA?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
         saveResultado("Sin ganador", "Anulado", false,id_class,0);
         btniniciar.setEnabled(true);
           listarREsultados();
           resetGame();
}
    
    }//GEN-LAST:event_btnanularActionPerformed

    private void btnbdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbdActionPerformed
        // TODO add your handling code here:
        ResultadoDao dao = new ResultadoDao();
        
        int dialogResult = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres borrar todos los datos?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if(dialogResult == JOptionPane.YES_OPTION){
        dao. borrarTodosLosResultados();
}
        listarREsultados();
    }//GEN-LAST:event_btnbdActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnanular;
    private javax.swing.JButton btnbd;
    private javax.swing.JButton btniniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTablerasult;
    private javax.swing.JPanel jpanelttt;
    private javax.swing.JPanel panelfondoj;
    private javax.swing.JLabel playerlabel1;
    private javax.swing.JLabel playerlabel2;
    private javax.swing.JLabel turnoname;
    private javax.swing.JTextField txtjugador1;
    private javax.swing.JTextField txtjugador2;
    // End of variables declaration//GEN-END:variables

@Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton) e.getSource();
        buttonClicked.setText(String.valueOf(currentPlayer));
        buttonClicked.setEnabled(false);
        ganador();
        cambiojugador();
    }
 
// Después, crea una función para determinar a quién le toca jugar.

public String jugadoractual() {
    if (currentPlayer == 'X') {
        turnoname.setText(txtjugador1.getText());
        return txtjugador1.getText();    
    } 
    if(currentPlayer == 'O') {
        turnoname.setText(txtjugador2.getText());
        return txtjugador2.getText();
    }
        return null;
}

public void puntos(String winner) {
   if (winner.equals(txtjugador1.getText())) {
            puntosJugador1++;
            playerlabel1.setText(""+puntosJugador1);
        } else if (winner.equals(txtjugador2.getText())) {
            puntosJugador2++;
            playerlabel2.setText(""+puntosJugador2);
   }
}
    private void cambiojugador() {
        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
    }

    private void ganador() {
    // de manera horizontal
    for (int i = 0; i < 9; i += 3)
        if (checkLine(i, i+1, i+2))
            endGame(jugadoractual());

    // de manera vertical
    for (int i = 0; i < 3; ++i)
        if (checkLine(i, i+3, i+6))
            endGame(jugadoractual());

    // diagonales
    if (checkLine(0, 4, 8) || checkLine(2, 4, 6))
        endGame(jugadoractual());

    // Check for draw.
    boolean filled = true;
    for (JButton btn : button) {
        if (btn.getText().equals("")) {
            filled = false;
            break;
        }
    }
    if (filled) {
        endGame("Empate"); // O puedes reemplazar "Empate" con cualquier mensaje de empate que desees
    }
}
    private boolean checkLine(int a, int b, int c) {
        return button[a].getText().equals(button[b].getText()) && button[a].getText().equals(button[c].getText()) && !button[a].getText().equals("");
    }

    private void endGame(String winner) {
        gameEnded = true;
        JOptionPane.showMessageDialog(null, "FELICIDADES  " + winner + " ganó!");
        saveResultado(winner, "Finalizado", false,id_class,1);
        btniniciar.setEnabled(true);
        listarREsultados();
        puntos(winner);
        resetGame();  
        panelfondoj.requestFocus();
    }
    public void resetGame() {
    for (JButton btn : button) {
        btn.setText("");  // limpiar el texto del botón
        btn.setEnabled(false);  // deshabilitar el botón
        btniniciar.setEnabled(true); // habbilita el buton de inicio
        btnanular.setEnabled(false);
        txtjugador1.setText("JUGADOR 1");
        txtjugador2.setText("JUGADOR 2");
        turnoname.setText("NUEVO TURNO");
    }
    currentPlayer = 'X';  // restablecer el jugador actual al valor inicial 
           
}
    private void saveResultado(String winner, String estado, boolean isNew, int id, int punto) {
     contador++;
     ResultadoTO to = new ResultadoTO();
     to.setNombrePartida("Partida "+contador);
     to.setNombreJugador1(txtjugador1.getText());
     to.setNombreJugador2(txtjugador2.getText());
     to.setGanador(winner);
     to.setPunto(punto);
     to.setEstado(estado);

     ResultadoDao dao = new ResultadoDao();
     if (isNew) {
         id_class = dao.crearResultado(to);
     } else {
         to.setIdResultado(id);
         dao.actualizarResultado(to);
     }
     
     results.add(to);
     
 }
    DefaultTableModel model;
    
    public void listarREsultados(){
        ResultadoDaoI dao=new ResultadoDao();
        List<ResultadoTO> lista=dao.listarResultados();
        model=(DefaultTableModel)jTablerasult.getModel();
        model.setNumRows(0);
        Object[] ob=new Object[6];
        for (int i = 0; i < lista.size(); i++) {
            int x=-1;
            ob[++x]=lista.get(i).getNombrePartida();
            ob[++x]=lista.get(i).getNombreJugador1();
            ob[++x]=lista.get(i).getNombreJugador2();
            ob[++x]=lista.get(i).getGanador();
            ob[++x]=lista.get(i).getPunto();
            ob[++x]=lista.get(i).getEstado();
            model.addRow(ob);
        }                
    }   
}
