/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controler.Calculadora;

/**
 *
 * @author gustavomiara
 */
public class viewCalculadora extends javax.swing.JFrame {

    public Calculadora calculadora = new Calculadora();
    public double a = 0.000;
    public double b = 0.000;
    public int flag = 0;
    public String operacao = "";

    /**
     * Creates new form Calculadora
     */
    public viewCalculadora() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        limpar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        divisao = new javax.swing.JButton();
        sete = new javax.swing.JButton();
        oito = new javax.swing.JButton();
        nove = new javax.swing.JButton();
        multiplicacao = new javax.swing.JButton();
        quatro = new javax.swing.JButton();
        cinco = new javax.swing.JButton();
        seis = new javax.swing.JButton();
        subtracao = new javax.swing.JButton();
        um = new javax.swing.JButton();
        dois = new javax.swing.JButton();
        tres = new javax.swing.JButton();
        adicao = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        virgula = new javax.swing.JButton();
        igual = new javax.swing.JButton();
        visor = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(466, 371));
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        limpar.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        limpar.setText("AC");
        limpar.setPreferredSize(new java.awt.Dimension(80, 80));
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButton2.setText("+/-");
        jButton2.setPreferredSize(new java.awt.Dimension(80, 80));

        jButton3.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        jButton3.setText("%");
        jButton3.setPreferredSize(new java.awt.Dimension(80, 80));

        divisao.setBackground(new java.awt.Color(253, 162, 26));
        divisao.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        divisao.setText("/");
        divisao.setPreferredSize(new java.awt.Dimension(80, 80));
        divisao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divisaoActionPerformed(evt);
            }
        });

        sete.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        sete.setText("7");
        sete.setPreferredSize(new java.awt.Dimension(80, 80));
        sete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seteActionPerformed(evt);
            }
        });

        oito.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        oito.setText("8");
        oito.setPreferredSize(new java.awt.Dimension(80, 80));
        oito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oitoActionPerformed(evt);
            }
        });

        nove.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        nove.setText("9");
        nove.setPreferredSize(new java.awt.Dimension(80, 80));
        nove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noveActionPerformed(evt);
            }
        });

        multiplicacao.setBackground(new java.awt.Color(253, 162, 26));
        multiplicacao.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        multiplicacao.setText("x");
        multiplicacao.setPreferredSize(new java.awt.Dimension(80, 80));
        multiplicacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicacaoActionPerformed(evt);
            }
        });

        quatro.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        quatro.setText("4");
        quatro.setPreferredSize(new java.awt.Dimension(80, 80));
        quatro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quatroActionPerformed(evt);
            }
        });

        cinco.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        cinco.setText("5");
        cinco.setPreferredSize(new java.awt.Dimension(80, 80));
        cinco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cincoActionPerformed(evt);
            }
        });

        seis.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        seis.setText("6");
        seis.setPreferredSize(new java.awt.Dimension(80, 80));
        seis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seisActionPerformed(evt);
            }
        });

        subtracao.setBackground(new java.awt.Color(253, 162, 26));
        subtracao.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        subtracao.setText("-");
        subtracao.setPreferredSize(new java.awt.Dimension(80, 80));
        subtracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtracaoActionPerformed(evt);
            }
        });

        um.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        um.setText("1");
        um.setPreferredSize(new java.awt.Dimension(80, 80));
        um.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umActionPerformed(evt);
            }
        });

        dois.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        dois.setText("2");
        dois.setPreferredSize(new java.awt.Dimension(80, 80));
        dois.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doisActionPerformed(evt);
            }
        });

        tres.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        tres.setText("3");
        tres.setPreferredSize(new java.awt.Dimension(80, 80));
        tres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tresActionPerformed(evt);
            }
        });

        adicao.setBackground(new java.awt.Color(253, 162, 26));
        adicao.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        adicao.setText("+");
        adicao.setPreferredSize(new java.awt.Dimension(80, 80));
        adicao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adicaoActionPerformed(evt);
            }
        });

        zero.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        zero.setText("0");
        zero.setPreferredSize(new java.awt.Dimension(80, 80));
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });

        virgula.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        virgula.setText(",");
        virgula.setPreferredSize(new java.awt.Dimension(80, 80));
        virgula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                virgulaActionPerformed(evt);
            }
        });

        igual.setBackground(new java.awt.Color(253, 162, 26));
        igual.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        igual.setText("=");
        igual.setPreferredSize(new java.awt.Dimension(80, 80));
        igual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                igualActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(quatro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(oito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cinco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(limpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(um, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(zero, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(seis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nove, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(virgula, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(divisao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subtracao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(adicao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(multiplicacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(igual, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(limpar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(divisao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(oito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nove, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplicacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quatro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cinco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(seis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subtracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(um, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dois, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(adicao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(zero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(virgula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(igual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        visor.setBackground(new java.awt.Color(60, 58, 57));
        visor.setFont(new java.awt.Font("Ubuntu", 1, 72)); // NOI18N
        visor.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        visor.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(visor)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(visor, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void subtracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtracaoActionPerformed
        // TODO add your handling code here:
        this.operacao = "subtracao";

        if (this.flag == 2) {
            visor.setText(Double.toString(calculadora.igual(this.operacao, this.a, this.b)));
            this.flag = 0;
        } else {
            if (this.flag == 0) {
                this.a = calculadora.convertDouble(visor.getText());
                visor.setText(calculadora.limpar());
                visor.setText("-");
            } else if (this.flag == 1) {
                this.b = calculadora.convertDouble(visor.getText());
                visor.setText(Double.toString(calculadora.igual(this.operacao, this.a, this.b)));
            }
            this.flag++;
        }
        System.out.println("Flag =>" + this.flag);
    }//GEN-LAST:event_subtracaoActionPerformed

    private void quatroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quatroActionPerformed
        // TODO add your handling code here:
        String res = visor.getText();
        if (res.equals("/") || res.equals("+") || res.equals("-") || res.equals("X")) {
            visor.setText(calculadora.limpar());
        }
        visor.setText(visor.getText() + calculadora.numQuatro());
        if (this.flag == 0) {
            this.a = calculadora.convertDouble(visor.getText());
        } else if (this.flag == 1) {
            this.b = calculadora.convertDouble(visor.getText());
        }
        System.out.println("Flag =>" + this.flag);
    }//GEN-LAST:event_quatroActionPerformed

    private void multiplicacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicacaoActionPerformed
        // TODO add your handling code here:
        this.operacao = "multiplicacao";

        if (this.flag == 2) {
            visor.setText(Double.toString(calculadora.igual(this.operacao, this.a, this.b)));
            this.flag = 0;
        } else {
            if (this.flag == 0) {
                this.a = calculadora.convertDouble(visor.getText());
                visor.setText(calculadora.limpar());
                visor.setText("X");
            } else if (this.flag == 1) {
                this.b = calculadora.convertDouble(visor.getText());
                visor.setText(Double.toString(calculadora.igual(this.operacao, this.a, this.b)));
            }
            this.flag++;
        }
        System.out.println("Flag =>" + this.flag);
    }//GEN-LAST:event_multiplicacaoActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        // TODO add your handling code here:
        visor.setText(calculadora.limpar());
        this.flag = 0;
        this.a = 0.00;
        this.b = 0.00;
        this.operacao = "";
        System.out.println("Flag =>" + this.flag);
    }//GEN-LAST:event_limparActionPerformed

    private void seteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seteActionPerformed
        // TODO add your handling code here:
        String res = visor.getText();
        if (res.equals("/") || res.equals("+") || res.equals("-") || res.equals("X")) {
            visor.setText(calculadora.limpar());
        }
        visor.setText(visor.getText() + calculadora.numSete());
        if (this.flag == 0) {
            this.a = calculadora.convertDouble(visor.getText());
        } else if (this.flag == 1) {
            this.b = calculadora.convertDouble(visor.getText());
        }
        System.out.println("Flag =>" + this.flag);
    }//GEN-LAST:event_seteActionPerformed

    private void oitoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oitoActionPerformed
        // TODO add your handling code here:
        String res = visor.getText();
        if (res.equals("/") || res.equals("+") || res.equals("-") || res.equals("X")) {
            visor.setText(calculadora.limpar());
        }
        visor.setText(visor.getText() + calculadora.numOito());
        if (this.flag == 0) {
            this.a = calculadora.convertDouble(visor.getText());
        } else if (this.flag == 1) {
            this.b = calculadora.convertDouble(visor.getText());
        }
        System.out.println("Flag =>" + this.flag);
    }//GEN-LAST:event_oitoActionPerformed

    private void noveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noveActionPerformed
        // TODO add your handling code here:
        String res = visor.getText();
        if (res.equals("/") || res.equals("+") || res.equals("-") || res.equals("X")) {
            visor.setText(calculadora.limpar());
        }
        visor.setText(visor.getText() + calculadora.numNove());
        if (this.flag == 0) {
            this.a = calculadora.convertDouble(visor.getText());
        } else if (this.flag == 1) {
            this.b = calculadora.convertDouble(visor.getText());
        }
        System.out.println("Flag =>" + this.flag);
    }//GEN-LAST:event_noveActionPerformed

    private void cincoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cincoActionPerformed
        // TODO add your handling code here:
        String res = visor.getText();
        if (res.equals("/") || res.equals("+") || res.equals("-") || res.equals("X")) {
            visor.setText(calculadora.limpar());
        }
        visor.setText(visor.getText() + calculadora.numCinco());
        if (this.flag == 0) {
            this.a = calculadora.convertDouble(visor.getText());
        } else if (this.flag == 1) {
            this.b = calculadora.convertDouble(visor.getText());
        }
        System.out.println("Flag =>" + this.flag);
    }//GEN-LAST:event_cincoActionPerformed

    private void seisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seisActionPerformed
        // TODO add your handling code here:
        String res = visor.getText();
        if (res.equals("/") || res.equals("+") || res.equals("-") || res.equals("X")) {
            visor.setText(calculadora.limpar());
        }
        visor.setText(visor.getText() + calculadora.numSeis());
        if (this.flag == 0) {
            this.a = calculadora.convertDouble(visor.getText());
        } else if (this.flag == 1) {
            this.b = calculadora.convertDouble(visor.getText());
        }
        System.out.println("Flag =>" + this.flag);
    }//GEN-LAST:event_seisActionPerformed

    private void umActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umActionPerformed
        // TODO add your handling code here:
        String res = visor.getText();
        if (res.equals("/") || res.equals("+") || res.equals("-") || res.equals("X")) {
            visor.setText(calculadora.limpar());
        }
        visor.setText(visor.getText() + calculadora.numUm());
        if (this.flag == 0) {
            this.a = calculadora.convertDouble(visor.getText());
        } else if (this.flag == 1) {
            this.b = calculadora.convertDouble(visor.getText());
        }
        System.out.println("Flag =>" + this.flag);
    }//GEN-LAST:event_umActionPerformed

    private void doisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doisActionPerformed
        // TODO add your handling code here:
        String res = visor.getText();
        if (res.equals("/") || res.equals("+") || res.equals("-") || res.equals("X")) {
            visor.setText(calculadora.limpar());
        }
        visor.setText(visor.getText() + calculadora.numDois());
        if (this.flag == 0) {
            this.a = calculadora.convertDouble(visor.getText());
        } else if (this.flag == 1) {
            this.b = calculadora.convertDouble(visor.getText());
        }
        System.out.println("Flag =>" + this.flag);
    }//GEN-LAST:event_doisActionPerformed

    private void tresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tresActionPerformed
        // TODO add your handling code here:
        String res = visor.getText();
        if (res.equals("/") || res.equals("+") || res.equals("-") || res.equals("X")) {
            visor.setText(calculadora.limpar());
        }
        visor.setText(visor.getText() + calculadora.numTres());
        if (this.flag == 0) {
            this.a = calculadora.convertDouble(visor.getText());
        } else if (this.flag == 1) {
            this.b = calculadora.convertDouble(visor.getText());
        }
        System.out.println("Flag =>" + this.flag);
    }//GEN-LAST:event_tresActionPerformed

    private void virgulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_virgulaActionPerformed
        // TODO add your handling code here:
        visor.setText(visor.getText() + calculadora.virgula());
    }//GEN-LAST:event_virgulaActionPerformed

    private void divisaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divisaoActionPerformed
        // TODO add your handling code here:
        this.operacao = "divisao";

        if (this.flag == 2) {
            visor.setText(Double.toString(calculadora.igual(this.operacao, this.a, this.b)));
            this.flag = 0;
        } else {
            if (this.flag == 0) {
                this.a = calculadora.convertDouble(visor.getText());
                visor.setText(calculadora.limpar());
                visor.setText("/");
            } else if (this.flag == 1) {
                this.b = calculadora.convertDouble(visor.getText());
                visor.setText(Double.toString(calculadora.igual(this.operacao, this.a, this.b)));
            }
            this.flag++;
        }
        System.out.println("Flag =>" + this.flag);

    }//GEN-LAST:event_divisaoActionPerformed

    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
        // TODO add your handling code here:
        String res = visor.getText();
        if (res.equals("/") || res.equals("+") || res.equals("-") || res.equals("/")) {
            visor.setText(calculadora.limpar());
        }

        visor.setText(visor.getText() + calculadora.numZero());
        if (this.flag == 0) {
            this.a = calculadora.convertDouble(visor.getText());
        } else if (this.flag == 1) {
            this.b = calculadora.convertDouble(visor.getText());
        }
        System.out.println("Flag =>" + this.flag);
        
    }//GEN-LAST:event_zeroActionPerformed

    private void adicaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adicaoActionPerformed
        // TODO add your handling code here:
        this.operacao = "adicao";

        if (this.flag == 2) {
            visor.setText(Double.toString(calculadora.igual(this.operacao, this.a, this.b)));
            this.flag = 0;
        } else {
            if (this.flag == 0) {
                this.a = calculadora.convertDouble(visor.getText());
                visor.setText(calculadora.limpar());
                visor.setText("+");
            } else if (this.flag == 1) {
                this.b = calculadora.convertDouble(visor.getText());
                visor.setText(Double.toString(calculadora.igual(this.operacao, this.a, this.b)));
            }
            this.flag++;
        }
        System.out.println("Flag =>" + this.flag);
    }//GEN-LAST:event_adicaoActionPerformed

    private void igualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_igualActionPerformed
        // TODO add your handling code here:
        this.flag++;
        if (this.flag == 2) {
            visor.setText(Double.toString(calculadora.igual(this.operacao, this.a, this.b)));
            this.flag = 0;
        }
        System.out.println("Flag =>" + this.flag);
        

    }//GEN-LAST:event_igualActionPerformed

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
            java.util.logging.Logger.getLogger(viewCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adicao;
    private javax.swing.JButton cinco;
    private javax.swing.JButton divisao;
    private javax.swing.JButton dois;
    private javax.swing.JButton igual;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton limpar;
    private javax.swing.JButton multiplicacao;
    private javax.swing.JButton nove;
    private javax.swing.JButton oito;
    private javax.swing.JButton quatro;
    private javax.swing.JButton seis;
    private javax.swing.JButton sete;
    private javax.swing.JButton subtracao;
    private javax.swing.JButton tres;
    private javax.swing.JButton um;
    private javax.swing.JButton virgula;
    private javax.swing.JTextField visor;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
