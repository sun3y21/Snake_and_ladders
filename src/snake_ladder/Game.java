/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package snake_ladder;

import java.awt.Color;
import java.awt.Font;
import java.util.Random;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import mp3player.Mp3player;

/**
 *
 * @author SUNNNY SAINI
 */
public class Game extends javax.swing.JFrame {
   int player1=1,player2=1;
    /**
     * Creates new form sample
     */
    public Game() {
        initComponents();
        this.setBounds(0,0,1500,900);
   t100.setVisible(false);     colorAndFont(t100);
    t99.setVisible(false);     colorAndFont(t99);
    t98.setVisible(false);     colorAndFont(t98);
    t97.setVisible(false);     colorAndFont(t97);
    t96.setVisible(false);     colorAndFont(t96);
    t95.setVisible(false);     colorAndFont(t95);
    t94.setVisible(false);     colorAndFont(t94);
    t93.setVisible(false);     colorAndFont(t93);
    t92.setVisible(false);     colorAndFont(t92);
    t91.setVisible(false);     colorAndFont(t91); 
    t90.setVisible(false);     colorAndFont(t90);
    t89.setVisible(false);     colorAndFont(t89);
    t88.setVisible(false);     colorAndFont(t88);
    t87.setVisible(false);     colorAndFont(t87);
    t86.setVisible(false);     colorAndFont(t86);
    t85.setVisible(false);     colorAndFont(t85);
    t84.setVisible(false);     colorAndFont(t84);
    t83.setVisible(false);     colorAndFont(t83);
    t82.setVisible(false);     colorAndFont(t82);
    t81.setVisible(false);     colorAndFont(t81);
    t80.setVisible(false);     colorAndFont(t80);
    t79.setVisible(false);      colorAndFont(t79);
    t78.setVisible(false);      colorAndFont(t78);  
    t77.setVisible(false);      colorAndFont(t77);
    t76.setVisible(false);      colorAndFont(t76);
    t75.setVisible(false);      colorAndFont(t75);
    t74.setVisible(false);      colorAndFont(t74);
    t73.setVisible(false);      colorAndFont(t73);
    t72.setVisible(false);      colorAndFont(t72);
    t71.setVisible(false);      colorAndFont(t71);
    t70.setVisible(false);      colorAndFont(t70);
    t69.setVisible(false);      colorAndFont(t69);
    t66.setVisible(false);      colorAndFont(t68);  
    t68.setVisible(false);       colorAndFont(t67);
    t67.setVisible(false);       colorAndFont(t66); 
    t65.setVisible(false);       colorAndFont(t65);
    t64.setVisible(false);       colorAndFont(t64);
    t63.setVisible(false);       colorAndFont(t63);
    t62.setVisible(false);       colorAndFont(t62);
    t61.setVisible(false);       colorAndFont(t61);
    t60.setVisible(false);       colorAndFont(t60);
    t59.setVisible(false);       colorAndFont(t59);
    t58.setVisible(false);       colorAndFont(t58);
    t57.setVisible(false);       colorAndFont(t57);
    t56.setVisible(false);       colorAndFont(t56);
    t55.setVisible(false);       colorAndFont(t55);
    t54.setVisible(false);       colorAndFont(t54);
    t53.setVisible(false);       colorAndFont(t53);
    t52.setVisible(false);       colorAndFont(t52); 
    t51.setVisible(false);       colorAndFont(t51);
    t50.setVisible(false);      colorAndFont(t50);
    t49.setVisible(false);      colorAndFont(t49);
    t48.setVisible(false);      colorAndFont(t48);
    t47.setVisible(false);      colorAndFont(t47);
    t46.setVisible(false);      colorAndFont(t46);
    t45.setVisible(false);      colorAndFont(t45);
    t44.setVisible(false);      colorAndFont(t44);
    t43.setVisible(false);      colorAndFont(t43);
    t42.setVisible(false);      colorAndFont(t42);
    t41.setVisible(false);      colorAndFont(t41);
    t40.setVisible(false);      colorAndFont(t40);
    t39.setVisible(false);      colorAndFont(t39);
    t38.setVisible(false);      colorAndFont(t38);
    t37.setVisible(false);      colorAndFont(t37);
    t36.setVisible(false);      colorAndFont(t36);
    t35.setVisible(false);      colorAndFont(t35);
    t34.setVisible(false);      colorAndFont(t34);
    t33.setVisible(false);      colorAndFont(t33);
    t32.setVisible(false);      colorAndFont(t32);
    t31.setVisible(false);      colorAndFont(t31);
    t30.setVisible(false);      colorAndFont(t30);
    t29.setVisible(false);      colorAndFont(t29);
    t28.setVisible(false);      colorAndFont(t28);
    t27.setVisible(false);      colorAndFont(t27);
    t26.setVisible(false);      colorAndFont(t26);
    t25.setVisible(false);      colorAndFont(t25);
    t24.setVisible(false);      colorAndFont(t24);
    t23.setVisible(false);     colorAndFont(t23);
    t22.setVisible(false);     colorAndFont(t22);
    t21.setVisible(false);    colorAndFont(t21);
    t20.setVisible(false);    colorAndFont(t20);
    t19.setVisible(false);    colorAndFont(t19);
    t18.setVisible(false);    colorAndFont(t18);
    t17.setVisible(false);    colorAndFont(t17);
    t16.setVisible(false);    colorAndFont(t16);
    t15.setVisible(false);    colorAndFont(t15);
    t14.setVisible(false);    colorAndFont(t14);
    t13.setVisible(false);    colorAndFont(t13);
    t12.setVisible(false);    colorAndFont(t12);
    t11.setVisible(false);   colorAndFont(t11);
    t10.setVisible(false);   colorAndFont(t10);
    t9.setVisible(false);    colorAndFont(t9);
    t8.setVisible(false);    colorAndFont(t8);
    t7.setVisible(false);    colorAndFont(t7);
    t6.setVisible(false);    colorAndFont(t6);
    t5.setVisible(false);    colorAndFont(t5);
    t4.setVisible(false);    colorAndFont(t4);
    t3.setVisible(false);    colorAndFont(t3);
    t3.setVisible(false);    colorAndFont(t2);
    t1.setText("1,2");
    colorAndFont(t1);
    player1pos.setText("1");
    colorAndFont(player1pos);
    player2pos.setText("1");
    colorAndFont(player2pos);
    player2_bt.setEnabled(false);
    }
   
    
    
    
    void colorAndFont(JLabel l)
    {
        l.setForeground(Color.BLUE);
        l.setFont(new Font("Serif", Font.BOLD, 40));
    }
    void VisibilityDecider(JLabel l,int player_2)
    {
                  if(l.getText().contains("1,2"))
                   l.setText(" "+player_2);
                   else
                   l.setVisible(false);
    }
    void stepPrinter(JLabel l,int plNum,int position,int p2p)
    {
           if(position==p2p)
           l.setText(" 1,2");
           else
           l.setText("  "+plNum);
           l.setVisible(true);
    }
    int ladderPrinter(JLabel initialD,JLabel finalD,int plNum,int position,int p2p,int ladderlength)
    {
        if(position==p2p)
        initialD.setText(" 1,2");
        else
        initialD.setText("  "+plNum);
        initialD.setVisible(true);
        int num=JOptionPane.showConfirmDialog(null,"Do you want to take ladder?","Message",0);
        if(num==0)
        {         position+=ladderlength;  
                  if(position==p2p)
                  finalD.setText(" 1,2");
                  else
                  finalD.setText("  "+plNum);
                  finalD.setVisible(true);
                  initialD.setVisible(false);
                  
        }
        else
        {
            if(position==p2p)
            initialD.setText(" 1,2");
            else
            initialD.setText("  "+plNum);
            initialD.setVisible(true);
        }
        return position;
    }
     int  SnakeBite(JLabel initalD,JLabel l,int plNum,int position,int p2p,int snakelength)
    {   initalD.setText("  "+plNum);
        initalD.setVisible(true);
        JOptionPane.showMessageDialog(null,"Snake bite","Sorry",0);
        Mp3player.play();
        initalD.setVisible(false);
        position-=snakelength;
        if(position==p2p)
        l.setText("1,2");
        else
        l.setText("  "+plNum);
        l.setVisible(true);
        return position;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField49 = new javax.swing.JTextField();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jLayeredPane5 = new javax.swing.JLayeredPane();
        player1_bt = new javax.swing.JButton();
        player2_bt = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        player1dice = new javax.swing.JLabel();
        jhjkj = new javax.swing.JLabel();
        player2dice = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        player1pos = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        player2pos = new javax.swing.JLabel();
        exit = new javax.swing.JButton();
        t3 = new javax.swing.JLabel();
        t1 = new javax.swing.JLabel();
        t2 = new javax.swing.JLabel();
        t4 = new javax.swing.JLabel();
        t5 = new javax.swing.JLabel();
        t6 = new javax.swing.JLabel();
        t7 = new javax.swing.JLabel();
        t8 = new javax.swing.JLabel();
        t9 = new javax.swing.JLabel();
        t10 = new javax.swing.JLabel();
        t11 = new javax.swing.JLabel();
        t12 = new javax.swing.JLabel();
        t13 = new javax.swing.JLabel();
        t14 = new javax.swing.JLabel();
        t15 = new javax.swing.JLabel();
        t16 = new javax.swing.JLabel();
        t17 = new javax.swing.JLabel();
        t18 = new javax.swing.JLabel();
        t19 = new javax.swing.JLabel();
        t20 = new javax.swing.JLabel();
        t21 = new javax.swing.JLabel();
        t22 = new javax.swing.JLabel();
        t23 = new javax.swing.JLabel();
        t24 = new javax.swing.JLabel();
        t25 = new javax.swing.JLabel();
        t30 = new javax.swing.JLabel();
        t26 = new javax.swing.JLabel();
        t27 = new javax.swing.JLabel();
        t28 = new javax.swing.JLabel();
        t29 = new javax.swing.JLabel();
        t31 = new javax.swing.JLabel();
        t32 = new javax.swing.JLabel();
        t33 = new javax.swing.JLabel();
        t34 = new javax.swing.JLabel();
        t35 = new javax.swing.JLabel();
        t36 = new javax.swing.JLabel();
        t37 = new javax.swing.JLabel();
        t38 = new javax.swing.JLabel();
        t39 = new javax.swing.JLabel();
        t40 = new javax.swing.JLabel();
        t41 = new javax.swing.JLabel();
        t42 = new javax.swing.JLabel();
        t43 = new javax.swing.JLabel();
        t44 = new javax.swing.JLabel();
        t45 = new javax.swing.JLabel();
        t46 = new javax.swing.JLabel();
        t47 = new javax.swing.JLabel();
        t48 = new javax.swing.JLabel();
        t49 = new javax.swing.JLabel();
        t50 = new javax.swing.JLabel();
        t84 = new javax.swing.JLabel();
        t51 = new javax.swing.JLabel();
        t52 = new javax.swing.JLabel();
        t53 = new javax.swing.JLabel();
        t54 = new javax.swing.JLabel();
        t55 = new javax.swing.JLabel();
        t56 = new javax.swing.JLabel();
        t57 = new javax.swing.JLabel();
        t58 = new javax.swing.JLabel();
        t59 = new javax.swing.JLabel();
        t60 = new javax.swing.JLabel();
        t61 = new javax.swing.JLabel();
        t62 = new javax.swing.JLabel();
        t63 = new javax.swing.JLabel();
        t64 = new javax.swing.JLabel();
        t65 = new javax.swing.JLabel();
        t66 = new javax.swing.JLabel();
        t67 = new javax.swing.JLabel();
        t68 = new javax.swing.JLabel();
        t69 = new javax.swing.JLabel();
        t70 = new javax.swing.JLabel();
        t77 = new javax.swing.JLabel();
        t71 = new javax.swing.JLabel();
        t72 = new javax.swing.JLabel();
        t73 = new javax.swing.JLabel();
        t74 = new javax.swing.JLabel();
        t75 = new javax.swing.JLabel();
        t86 = new javax.swing.JLabel();
        t76 = new javax.swing.JLabel();
        t78 = new javax.swing.JLabel();
        t79 = new javax.swing.JLabel();
        t80 = new javax.swing.JLabel();
        t81 = new javax.swing.JLabel();
        t100 = new javax.swing.JLabel();
        t82 = new javax.swing.JLabel();
        t83 = new javax.swing.JLabel();
        t85 = new javax.swing.JLabel();
        t87 = new javax.swing.JLabel();
        t88 = new javax.swing.JLabel();
        t89 = new javax.swing.JLabel();
        t90 = new javax.swing.JLabel();
        t91 = new javax.swing.JLabel();
        t92 = new javax.swing.JLabel();
        t93 = new javax.swing.JLabel();
        t94 = new javax.swing.JLabel();
        t95 = new javax.swing.JLabel();
        t96 = new javax.swing.JLabel();
        t97 = new javax.swing.JLabel();
        t98 = new javax.swing.JLabel();
        t99 = new javax.swing.JLabel();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        game = new javax.swing.JLabel();
        t101 = new javax.swing.JLabel();

        jTextField49.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);
        getContentPane().add(jLayeredPane3);
        jLayeredPane3.setBounds(454, 30, 0, 190);
        getContentPane().add(jLayeredPane4);
        jLayeredPane4.setBounds(448, 90, 0, 60);

        player1_bt.setText("Player 1");
        player1_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player1_btActionPerformed(evt);
            }
        });
        jLayeredPane5.add(player1_bt);
        player1_bt.setBounds(40, 100, 90, 23);

        player2_bt.setText("Player 2");
        player2_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                player2_btActionPerformed(evt);
            }
        });
        jLayeredPane5.add(player2_bt);
        player2_bt.setBounds(40, 240, 90, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snake_ladder/dice-on-green.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLayeredPane5.add(jLabel1);
        jLabel1.setBounds(20, 20, 50, 50);
        jLayeredPane5.add(player1dice);
        player1dice.setBounds(100, 20, 50, 50);

        jhjkj.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snake_ladder/images.jpg"))); // NOI18N
        jLayeredPane5.add(jhjkj);
        jhjkj.setBounds(20, 160, 50, 50);
        jLayeredPane5.add(player2dice);
        player2dice.setBounds(90, 160, 60, 50);

        jLabel2.setText("Player 1 :");
        jLayeredPane5.add(jLabel2);
        jLabel2.setBounds(40, 300, 70, 20);
        jLayeredPane5.add(player1pos);
        player1pos.setBounds(50, 340, 60, 40);

        jLabel3.setText("Player 2:");
        jLayeredPane5.add(jLabel3);
        jLabel3.setBounds(40, 420, 60, 14);
        jLayeredPane5.add(player2pos);
        player2pos.setBounds(50, 460, 70, 50);

        jLayeredPane1.add(jLayeredPane5);
        jLayeredPane5.setBounds(1190, 60, 180, 570);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jLayeredPane1.add(exit);
        exit.setBounds(1240, 670, 73, 30);
        jLayeredPane1.add(t3);
        t3.setBounds(280, 640, 70, 70);
        jLayeredPane1.add(t1);
        t1.setBounds(60, 640, 70, 70);
        jLayeredPane1.add(t2);
        t2.setBounds(170, 640, 70, 70);
        jLayeredPane1.add(t4);
        t4.setBounds(400, 640, 60, 70);
        jLayeredPane1.add(t5);
        t5.setBounds(520, 640, 60, 70);
        jLayeredPane1.add(t6);
        t6.setBounds(624, 640, 70, 70);
        jLayeredPane1.add(t7);
        t7.setBounds(750, 640, 60, 70);
        jLayeredPane1.add(t8);
        t8.setBounds(860, 640, 60, 70);
        jLayeredPane1.add(t9);
        t9.setBounds(980, 640, 60, 70);
        jLayeredPane1.add(t10);
        t10.setBounds(1094, 640, 60, 70);
        jLayeredPane1.add(t11);
        t11.setBounds(1100, 570, 60, 70);
        jLayeredPane1.add(t12);
        t12.setBounds(980, 570, 60, 70);
        jLayeredPane1.add(t13);
        t13.setBounds(870, 570, 60, 70);
        jLayeredPane1.add(t14);
        t14.setBounds(744, 570, 60, 70);
        jLayeredPane1.add(t15);
        t15.setBounds(634, 570, 60, 70);
        jLayeredPane1.add(t16);
        t16.setBounds(520, 570, 60, 70);
        jLayeredPane1.add(t17);
        t17.setBounds(390, 570, 60, 70);
        jLayeredPane1.add(t18);
        t18.setBounds(290, 570, 60, 70);
        jLayeredPane1.add(t19);
        t19.setBounds(164, 574, 70, 70);
        jLayeredPane1.add(t20);
        t20.setBounds(54, 570, 70, 70);
        jLayeredPane1.add(t21);
        t21.setBounds(50, 504, 60, 70);
        jLayeredPane1.add(t22);
        t22.setBounds(164, 500, 60, 70);
        jLayeredPane1.add(t23);
        t23.setBounds(284, 500, 60, 70);
        jLayeredPane1.add(t24);
        t24.setBounds(404, 500, 60, 70);
        jLayeredPane1.add(t25);
        t25.setBounds(514, 504, 60, 60);
        jLayeredPane1.add(t30);
        t30.setBounds(1104, 504, 60, 70);
        jLayeredPane1.add(t26);
        t26.setBounds(630, 500, 60, 70);
        jLayeredPane1.add(t27);
        t27.setBounds(750, 500, 60, 70);
        jLayeredPane1.add(t28);
        t28.setBounds(864, 500, 60, 70);
        jLayeredPane1.add(t29);
        t29.setBounds(974, 504, 60, 60);
        jLayeredPane1.add(t31);
        t31.setBounds(1100, 430, 60, 70);
        jLayeredPane1.add(t32);
        t32.setBounds(984, 430, 60, 70);
        jLayeredPane1.add(t33);
        t33.setBounds(874, 430, 70, 70);
        jLayeredPane1.add(t34);
        t34.setBounds(750, 430, 60, 70);
        jLayeredPane1.add(t35);
        t35.setBounds(630, 434, 60, 60);
        jLayeredPane1.add(t36);
        t36.setBounds(520, 434, 70, 60);
        jLayeredPane1.add(t37);
        t37.setBounds(400, 430, 70, 70);
        jLayeredPane1.add(t38);
        t38.setBounds(284, 430, 70, 70);
        jLayeredPane1.add(t39);
        t39.setBounds(174, 430, 70, 70);
        jLayeredPane1.add(t40);
        t40.setBounds(50, 430, 70, 70);
        jLayeredPane1.add(t41);
        t41.setBounds(44, 360, 70, 70);
        jLayeredPane1.add(t42);
        t42.setBounds(170, 360, 70, 70);
        jLayeredPane1.add(t43);
        t43.setBounds(284, 364, 60, 70);
        jLayeredPane1.add(t44);
        t44.setBounds(394, 364, 60, 70);
        jLayeredPane1.add(t45);
        t45.setBounds(520, 360, 60, 70);
        jLayeredPane1.add(t46);
        t46.setBounds(634, 364, 60, 70);
        jLayeredPane1.add(t47);
        t47.setBounds(750, 360, 60, 70);
        jLayeredPane1.add(t48);
        t48.setBounds(864, 364, 60, 60);
        jLayeredPane1.add(t49);
        t49.setBounds(984, 360, 60, 70);
        jLayeredPane1.add(t50);
        t50.setBounds(1100, 360, 60, 70);
        jLayeredPane1.add(t84);
        t84.setBounds(400, 80, 60, 70);
        jLayeredPane1.add(t51);
        t51.setBounds(1094, 290, 60, 70);
        jLayeredPane1.add(t52);
        t52.setBounds(984, 290, 70, 70);
        jLayeredPane1.add(t53);
        t53.setBounds(864, 290, 70, 70);
        jLayeredPane1.add(t54);
        t54.setBounds(754, 290, 70, 70);
        jLayeredPane1.add(t55);
        t55.setBounds(630, 290, 70, 70);
        jLayeredPane1.add(t56);
        t56.setBounds(514, 294, 70, 60);
        jLayeredPane1.add(t57);
        t57.setBounds(400, 290, 70, 70);
        jLayeredPane1.add(t58);
        t58.setBounds(280, 290, 70, 70);
        jLayeredPane1.add(t59);
        t59.setBounds(164, 290, 70, 70);
        jLayeredPane1.add(t60);
        t60.setBounds(50, 290, 70, 70);
        jLayeredPane1.add(t61);
        t61.setBounds(50, 220, 60, 70);
        jLayeredPane1.add(t62);
        t62.setBounds(164, 224, 70, 70);
        jLayeredPane1.add(t63);
        t63.setBounds(290, 220, 60, 70);
        jLayeredPane1.add(t64);
        t64.setBounds(404, 220, 60, 70);
        jLayeredPane1.add(t65);
        t65.setBounds(520, 220, 60, 70);
        jLayeredPane1.add(t66);
        t66.setBounds(640, 220, 60, 70);
        jLayeredPane1.add(t67);
        t67.setBounds(750, 220, 60, 70);
        jLayeredPane1.add(t68);
        t68.setBounds(864, 220, 70, 70);
        jLayeredPane1.add(t69);
        t69.setBounds(984, 220, 70, 70);
        jLayeredPane1.add(t70);
        t70.setBounds(1104, 220, 60, 70);
        jLayeredPane1.add(t77);
        t77.setBounds(394, 150, 70, 70);
        jLayeredPane1.add(t71);
        t71.setBounds(1094, 150, 70, 70);
        jLayeredPane1.add(t72);
        t72.setBounds(984, 150, 60, 70);
        jLayeredPane1.add(t73);
        t73.setBounds(864, 150, 70, 70);
        jLayeredPane1.add(t74);
        t74.setBounds(754, 150, 60, 70);
        jLayeredPane1.add(t75);
        t75.setBounds(630, 150, 70, 70);
        jLayeredPane1.add(t86);
        t86.setBounds(634, 84, 60, 70);
        jLayeredPane1.add(t76);
        t76.setBounds(524, 150, 60, 70);
        jLayeredPane1.add(t78);
        t78.setBounds(284, 154, 70, 70);
        jLayeredPane1.add(t79);
        t79.setBounds(164, 150, 60, 70);
        jLayeredPane1.add(t80);
        t80.setBounds(44, 150, 60, 70);
        jLayeredPane1.add(t81);
        t81.setBounds(44, 80, 70, 70);
        jLayeredPane1.add(t100);
        t100.setBounds(44, 10, 60, 70);
        jLayeredPane1.add(t82);
        t82.setBounds(164, 80, 60, 70);
        jLayeredPane1.add(t83);
        t83.setBounds(290, 80, 60, 70);
        jLayeredPane1.add(t85);
        t85.setBounds(514, 80, 70, 70);
        jLayeredPane1.add(t87);
        t87.setBounds(744, 80, 70, 70);
        jLayeredPane1.add(t88);
        t88.setBounds(864, 80, 60, 70);
        jLayeredPane1.add(t89);
        t89.setBounds(984, 80, 60, 70);
        jLayeredPane1.add(t90);
        t90.setBounds(1094, 80, 60, 70);
        jLayeredPane1.add(t91);
        t91.setBounds(1104, 10, 60, 70);
        jLayeredPane1.add(t92);
        t92.setBounds(990, 10, 70, 70);
        jLayeredPane1.add(t93);
        t93.setBounds(874, 10, 60, 70);
        jLayeredPane1.add(t94);
        t94.setBounds(744, 10, 60, 70);
        jLayeredPane1.add(t95);
        t95.setBounds(640, 10, 60, 70);
        jLayeredPane1.add(t96);
        t96.setBounds(520, 10, 70, 70);
        jLayeredPane1.add(t97);
        t97.setBounds(410, 10, 60, 70);
        jLayeredPane1.add(t98);
        t98.setBounds(274, 10, 70, 70);
        jLayeredPane1.add(t99);
        t99.setBounds(170, 10, 60, 70);

        getContentPane().add(jLayeredPane1);
        jLayeredPane1.setBounds(0, 8, 1340, 760);
        getContentPane().add(jLayeredPane2);
        jLayeredPane2.setBounds(1590, 80, 0, 0);

        game.setIcon(new javax.swing.ImageIcon(getClass().getResource("/snake_ladder/snake.jpg"))); // NOI18N
        game.setText("jLabel3");
        getContentPane().add(game);
        game.setBounds(-10, -20, 1350, 780);
        getContentPane().add(t101);
        t101.setBounds(170, 640, 70, 70);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void player1_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player1_btActionPerformed
        Random r=new Random();
        int num=r.nextInt(7);
        if(num==0)
        num=1;
        player1dice.setText(num+"");
        player1dice.setForeground(Color.GREEN);
        player1dice.setFont(new Font("Serif", Font.BOLD, 40));
        player1=computeposition(player1,num,player2,1);
        player1pos.setText(""+player1);
        if(player1>=100)
        {
            player1_bt.setEnabled(false);
            player2_bt.setEnabled(false);
            JOptionPane.showMessageDialog(null,"Congratulation player 1: You Won","Result",1);
            num=JOptionPane.showConfirmDialog(null,"Do You want to play again?","Confirmation",0);
            if(num==0)
            {
              Game g=new Game();
              dispose();
              g.setVisible(true);
            }
            else
             System.exit(0);
        }
        player1_bt.setEnabled(false);
        player2_bt.setEnabled(true);
    }//GEN-LAST:event_player1_btActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        int n=JOptionPane.showConfirmDialog(null,"Are you sure you want to exit?","Exit_Confirmation",0);
        if(n==0)
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void player2_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_player2_btActionPerformed
        Random r=new Random();
        int num=r.nextInt(7);
        if(num==0)
        num=1;
        player2dice.setText(num+"");
        player2dice.setForeground(Color.RED);
        player2dice.setFont(new Font("Serif", Font.BOLD, 40));
        player2=computeposition(player2,num,player1,2);
        player2pos.setText(""+player2);
        if(player2>=100)
        {   
            player1_bt.setEnabled(false);
            player2_bt.setEnabled(false);
            JOptionPane.showMessageDialog(null,"Congratulation player 2: You Won","Result",1);
            num=JOptionPane.showConfirmDialog(null,"Do You want to play again?","Confirmation",0);
            if(num==0)
            {
              Game g=new Game();
              dispose();
              g.setVisible(true);
            }
            else
             System.exit(0);
        }
            player1_bt.setEnabled(true);
            player2_bt.setEnabled(false);
    }//GEN-LAST:event_player2_btActionPerformed

    int computeposition(int position,int n,int p2p,int plNum)
    {   int num,player_2;
        if(plNum==1)
        player_2=2;
        else
        player_2=1;
        
       switch(position)
       {  
           case 1:  position=position+n;
                    if(t1.getText().matches("2"))
                    t1.setVisible(false);
                    t1.setText("2");
                   switch(n)
                 {
                        case 1: stepPrinter(t2, plNum, position, p2p);
                                break;
                        case 2: position=ladderPrinter(t3,t21, plNum, position, p2p,18);
                                 break;
                        case 3:  stepPrinter(t4, plNum, position, p2p);
                                break;
                        case 4:  stepPrinter(t5, plNum, position, p2p);
                                  break;
                        case 5: stepPrinter(t6, plNum, position, p2p);
                                   break;
                        case 6: stepPrinter(t7, plNum, position, p2p);
                                   break;
                    }
                            break;
           case 2: VisibilityDecider(t2,player_2);
                   position=position+n; 
                   switch(n)
                 {
                        case 1:position=ladderPrinter(t3,t21, plNum, position, p2p,18);
                                   break;
                        case 2:   stepPrinter(t4, plNum, position, p2p);
                                   break;
                        case 3:   stepPrinter(t5, plNum, position, p2p);
                                   break;
                        case 4: stepPrinter(t6, plNum, position, p2p);
                                   break;
                        case 5: stepPrinter(t7, plNum, position, p2p);
                                   break;
                        case 6:position=ladderPrinter(t8,t30, plNum, position, p2p,22);
                                  break;
                    }
                            break;
           case 3: VisibilityDecider(t3, player_2);
                   position=position+n; 
                   switch(n)
                 {
                        case 1:   stepPrinter(t4, plNum, position, p2p);
                                   break;
                        case 2: stepPrinter(t5, plNum, position, p2p);
                                   break;
                        case 3: stepPrinter(t6, plNum, position, p2p);
                                   break;                  
                        case 4: stepPrinter(t7, plNum, position, p2p);
                                   break;
                        case 5:position=ladderPrinter(t8,t30, plNum, position, p2p,22);
                                  break;
                        case 6:stepPrinter(t9, plNum, position, p2p);
                                   break;
                    }
                         break;
           case 4:VisibilityDecider(t4, player_2);
                  position=position+n; 
                   switch(n)
                 {
                        case 1: stepPrinter(t5, plNum, position, p2p);
                                break;
                        case 2: stepPrinter(t6, plNum, position, p2p);
                                break;
                        case 3: stepPrinter(t7, plNum, position, p2p);
                                break;
                        case 4:position=ladderPrinter(t8,t30, plNum, position, p2p,22);
                               break;
                        case 5: stepPrinter(t9, plNum, position, p2p);
                                break;
                        case 6:stepPrinter(t10, plNum, position, p2p);
                                break;
                    }
                         break;
           case 5:VisibilityDecider(t5, player_2);
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t6, plNum, position, p2p);
                                break;
                        case 2: stepPrinter(t7, plNum, position, p2p);
                                break;
                        case 3:position=ladderPrinter(t8,t30, plNum, position, p2p,22);
                               break;
                        case 4: stepPrinter(t9, plNum, position, p2p);
                                break; 
                        case 5:stepPrinter(t10, plNum, position, p2p);
                                break;
                        case 6: stepPrinter(t11, plNum, position, p2p);
                                break;
                            
                    }
                         break;
           case 6: VisibilityDecider(t6, player_2);
                  position=position+n; 
                   switch(n)
                 {      
                        case 1: stepPrinter(t7, plNum, position, p2p);
                                break;
                        case 2:position=ladderPrinter(t8,t30, plNum, position, p2p,22);
                               break;
                        case 3: stepPrinter(t9, plNum, position, p2p);
                                break; 
                        case 4:stepPrinter(t10, plNum, position, p2p);
                                break;
                        case 5:stepPrinter(t11, plNum, position, p2p);
                                break;
                        case 6:stepPrinter(t12, plNum, position, p2p);
                                break;
                  }
                              break;
           case 7:VisibilityDecider(t7, player_2);
                  position=position+n; 
                   switch(n)
                 {
                        case 1:position=ladderPrinter(t8,t30, plNum, position, p2p,22);
                               break;
                        case 2: stepPrinter(t9, plNum, position, p2p);
                                break; 
                        case 3:stepPrinter(t10, plNum, position, p2p);
                                break;
                        case 4:stepPrinter(t11, plNum, position, p2p);
                                break;
                        case 5:stepPrinter(t12, plNum, position, p2p);
                                break;
                        case 6:stepPrinter(t13, plNum, position, p2p);
                                break;
                        
                 }
                       break;
           case 8: VisibilityDecider(t8, player_2);
                  position=position+n; 
                   switch(n)
                 {
                        case 1: stepPrinter(t9, plNum, position, p2p);
                                break; 
                        case 2:stepPrinter(t10, plNum, position, p2p);
                                break;
                        case 3:stepPrinter(t11, plNum, position, p2p);
                                break;
                        case 4:stepPrinter(t12, plNum, position, p2p);
                                break;
                        case 5:stepPrinter(t13, plNum, position, p2p);
                                break;
                        case 6:stepPrinter(t14, plNum, position, p2p);
                                break;
                 }
                       break;
           case 9:  VisibilityDecider(t9, player_2);
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t10, plNum, position, p2p);
                                break;
                        case 2:stepPrinter(t11, plNum, position, p2p);
                                break;
                        case 3:stepPrinter(t12, plNum, position, p2p);
                                break;
                        case 4:stepPrinter(t13, plNum, position, p2p);
                                break;
                        case 5:stepPrinter(t14, plNum, position, p2p);
                                break;
                        case 6:stepPrinter(t15, plNum, position, p2p);
                                break;
                 }
                       break;
           case 10:  VisibilityDecider(t10, player_2);
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t11, plNum, position, p2p);
                                break;
                        case 2:stepPrinter(t12, plNum, position, p2p);
                                break;
                        case 3:stepPrinter(t13, plNum, position, p2p);
                                break;
                        case 4:stepPrinter(t14, plNum, position, p2p);
                                break;
                        case 5:stepPrinter(t15, plNum, position, p2p);
                                break;
                        case 6:stepPrinter(t16, plNum, position, p2p);
                                break;
                 }
                       break;
           case 11:VisibilityDecider(t11, player_2);
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t12, plNum, position, p2p);
                                break;
                        case 2:stepPrinter(t13, plNum, position, p2p);
                                break;
                        case 3:stepPrinter(t14, plNum, position, p2p);
                                break;
                        case 4:stepPrinter(t15, plNum, position, p2p);
                                break;
                        case 5:stepPrinter(t16, plNum, position, p2p);
                                break;
                        case 6: position=SnakeBite(t17,t13, plNum, position, p2p,4);
                                  break;
                    }
                       break;
           case 12: VisibilityDecider(t12, player_2);
                  position=position+n; 
                   switch(n)
                 { 
                        case 1:stepPrinter(t13, plNum, position, p2p);
                                break;
                        case 2:stepPrinter(t14, plNum, position, p2p);
                                break;
                        case 3:stepPrinter(t15, plNum, position, p2p);
                                break;
                        case 4:stepPrinter(t16, plNum, position, p2p);
                                break;
                        case 5: position=SnakeBite(t17,t13, plNum, position, p2p,4);
                                  break;
                        case 6:stepPrinter(t18, plNum, position, p2p);
                                break;
                 }
                       break;
           case 13:VisibilityDecider(t13, player_2);
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t14, plNum, position, p2p);
                                break;
                        case 2:stepPrinter(t15, plNum, position, p2p);
                                break;
                        case 3:stepPrinter(t16, plNum, position, p2p);
                                break;
                        case 4: position=SnakeBite(t17,t13, plNum, position, p2p,4);
                                  break;
                        case 5:stepPrinter(t18, plNum, position, p2p);
                                break;
                        case 6:stepPrinter(t19, plNum, position, p2p);
                                break;
                 }
                       break;
           case 14: VisibilityDecider(t14, player_2);
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t15, plNum, position, p2p);
                                break;
                        case 2:stepPrinter(t16, plNum, position, p2p);
                                break;
                        case 3: position=SnakeBite(t17,t13, plNum, position, p2p,4);
                                  break;
                        case 4:stepPrinter(t18, plNum, position, p2p);
                                break;
                        case 5:stepPrinter(t19, plNum, position, p2p);
                                break;
                        case 6:stepPrinter(t20, plNum, position, p2p);
                               break;
                 }
                       break;
           case 15: VisibilityDecider(t15, player_2);
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t16, plNum, position, p2p);
                                break;
                        case 2: position=SnakeBite(t17,t13, plNum, position, p2p,4);
                                  break;
                        case 3:stepPrinter(t18, plNum, position, p2p);
                                break;
                        case 4:stepPrinter(t19, plNum, position, p2p);
                                break;
                        case 5:stepPrinter(t20, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t21, plNum, position, p2p);
                               break;
                            
                 }
                       break;
           case 16: VisibilityDecider(t16, player_2);
                  position=position+n; 
                   switch(n)
                 {
                        case 1: position=SnakeBite(t17,t13, plNum, position, p2p,4);
                                  break;
                        case 2:stepPrinter(t18, plNum, position, p2p);
                                break;
                        case 3:stepPrinter(t19, plNum, position, p2p);
                                break;
                        case 4:stepPrinter(t20, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t21, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t22, plNum, position, p2p);
                               break;
                        
                 }
                       break;
           case 18:  VisibilityDecider(t18, player_2);
                    position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t19, plNum, position, p2p);
                                break;
                        case 2:stepPrinter(t20, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t21, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t22, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t23, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t24, plNum, position, p2p);
                               break;
                            
                 }
                       break;
           case 19: VisibilityDecider(t19, player_2);
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t20, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t21, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t22, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t23, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t24, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t25, plNum, position, p2p);
                               break;
                 }
                       break;
           case 20: VisibilityDecider(t20, player_2);
                    position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t21, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t22, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t23, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t24, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t25, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t26, plNum, position, p2p);
                               break;
                 }
                       break;
           case 21: VisibilityDecider(t21, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                       case 1:stepPrinter(t22, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t23, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t24, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t25, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t26, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t27, plNum, position, p2p);
                               break;
                 }
                       break;
           case 22: VisibilityDecider(t22, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t23, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t24, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t25, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t26, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t27, plNum, position, p2p);
                               break;
                        case 6:position=ladderPrinter(t28,t84, plNum, position, p2p,56);
                            break;
                 }
                       break;
           case 23:VisibilityDecider(t23, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t24, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t25, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t26, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t27, plNum, position, p2p);
                               break;
                        case 5:position=ladderPrinter(t28,t84, plNum, position, p2p,56);
                            break;
                        case 6:stepPrinter(t29, plNum, position, p2p);
                               break;
                 }
                       break;
           case 24:VisibilityDecider(t24, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t25, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t26, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t27, plNum, position, p2p);
                               break;
                        case 4:position=ladderPrinter(t28,t84, plNum, position, p2p,56);
                            break;
                        case 5:stepPrinter(t29, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t30, plNum, position, p2p);
                               break;
                       
                 }
                       break;
           case 25:VisibilityDecider(t25, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t26, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t27, plNum, position, p2p);
                               break;
                        case 3:position=ladderPrinter(t28,t84, plNum, position, p2p,56);
                            break;
                        case 4:stepPrinter(t29, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t30, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t31, plNum, position, p2p);
                               break;
                       
                 }
                       break;
           case 26:VisibilityDecider(t26, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t27, plNum, position, p2p);
                               break;
                        case 2:position=ladderPrinter(t28,t84, plNum, position, p2p,56);
                            break;
                        case 3:stepPrinter(t29, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t30, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t31, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t32, plNum, position, p2p);
                               break;
                 }
                       break;
           case 27:VisibilityDecider(t27, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:position=ladderPrinter(t28,t84, plNum, position, p2p,56);
                            break;
                        case 2:stepPrinter(t29, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t30, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t31, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t32, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t33, plNum, position, p2p);
                               break;
                       
                 }
                       break;
           case 28:VisibilityDecider(t28, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                       case 1:stepPrinter(t29, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t30, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t31, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t32, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t33, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t34, plNum, position, p2p);
                               break;
                       
                 }
                       break;
           case 29:VisibilityDecider(t29, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                       case 1:stepPrinter(t30, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t31, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t32, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t33, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t34, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t35, plNum, position, p2p);
                               break;
                 }
                       break;
           case 30:VisibilityDecider(t30, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                       case 1:stepPrinter(t31, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t32, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t33, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t34, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t35, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t36, plNum, position, p2p);
                               break;
                 }
                       break;
           case 31:VisibilityDecider(t31, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t32, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t33, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t34, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t35, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t36, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t37, plNum, position, p2p);
                               break;
                 }
                       break;
           case 32:VisibilityDecider(t32, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t33, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t34, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t35, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t36, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t37, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t38, plNum, position, p2p);
                               break;
                 }
                       break;
           case 33:VisibilityDecider(t33, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t34, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t35, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t36, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t37, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t38, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t39, plNum, position, p2p);
                               break;
                 }
                       break;
           case 34:
              VisibilityDecider(t34, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t35, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t36, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t37, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t38, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t39, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t40, plNum, position, p2p);
                               break;
                 }
                       break;
               case 35:
              VisibilityDecider(t35, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t36, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t37, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t38, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t39, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t40, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t41, plNum, position, p2p);
                               break;
                 }
                       break;
           case 36:
               VisibilityDecider(t36, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t37, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t38, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t39, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t40, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t41, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t42, plNum, position, p2p);
                               break;
                 }
                       break;
           case 37:
               VisibilityDecider(t37, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t38, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t39, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t40, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t41, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t42, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t43, plNum, position, p2p);
                               break;
                 }
                       break;
          case 38:VisibilityDecider(t38, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t39, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t40, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t41, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t42, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t43, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t44, plNum, position, p2p);
                               break;
                 }
                       break;
           case 39:VisibilityDecider(t39, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                       case 1:stepPrinter(t40, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t41, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t42, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t43, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t44, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t45, plNum, position, p2p);
                               break;
                 }
                       break;
           case 40:VisibilityDecider(t40, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                       case 1:stepPrinter(t41, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t42, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t43, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t44, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t45, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t46, plNum, position, p2p);
                               break;
                 }
                       break;
           case 41: VisibilityDecider(t41, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                       case 1:stepPrinter(t42, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t43, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t44, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t45, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t46, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t47, plNum, position, p2p);
                               break;
                 }
                       break;
           case 42: VisibilityDecider(t42, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                       case 1:stepPrinter(t43, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t44, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t45, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t46, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t47, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t48, plNum, position, p2p);
                               break;
                 }
                       break;
           case 43:VisibilityDecider(t43, player_2);              
                  position=position+n; 
                   switch(n)
                 { 
                        case 1:stepPrinter(t44, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t45, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t46, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t47, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t48, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t49, plNum, position, p2p);
                               break;       
                 }
                       break;
           case 44:VisibilityDecider(t44, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                       case 1:stepPrinter(t45, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t46, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t47, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t48, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t49, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t50, plNum, position, p2p);
                               break;
                 }
                       break;
           case 45:VisibilityDecider(t45, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t46, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t47, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t48, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t49, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t50, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t51, plNum, position, p2p);
                               break;
                 }
                       break;
           case 46:VisibilityDecider(t46, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t47, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t48, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t49, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t50, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t51, plNum, position, p2p);
                               break;
                        case 6:position=SnakeBite(t52,t29, plNum, position, p2p,23);
                             break;
                 }
                       break;
           case 47:VisibilityDecider(t47, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t48, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t49, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t50, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t51, plNum, position, p2p);
                               break;
                        case 5:position=SnakeBite(t52,t29, plNum, position, p2p,23);
                             break;
                        case 6:stepPrinter(t53, plNum, position, p2p);
                               break;
                 }
                       break;
           case 48:VisibilityDecider(t48, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t49, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t50, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t51, plNum, position, p2p);
                               break;
                        case 4:position=SnakeBite(t52,t29, plNum, position, p2p,23);
                             break;
                        case 5:stepPrinter(t53, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t54, plNum, position, p2p);
                               break;
                 }
                       break;
           case 49:VisibilityDecider(t49, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t50, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t51, plNum, position, p2p);
                               break;
                        case 3:position=SnakeBite(t52,t29, plNum, position, p2p,23);
                             break;
                        case 4:stepPrinter(t53, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t54, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t55, plNum, position, p2p);
                               break;
                 }
                       break;
           case 50:VisibilityDecider(t50, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t51, plNum, position, p2p);
                               break;
                        case 2:position=SnakeBite(t52,t29, plNum, position, p2p,23);
                             break;
                        case 3:stepPrinter(t53, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t54, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t55, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t56, plNum, position, p2p);
                               break;
                 }
                       break;
           case 51:VisibilityDecider(t51, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                       case 1:position=SnakeBite(t52,t29, plNum, position, p2p,23);
                             break;
                        case 2:stepPrinter(t53, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t54, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t55, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t56, plNum, position, p2p);
                               break;
                        case 6:position=SnakeBite(t57, t40, plNum, position, p2p,17);
                              break;
                 }
                       break;
           case 53:VisibilityDecider(t53, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t54, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t55, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t56, plNum, position, p2p);
                               break;
                        case 4:position=SnakeBite(t57, t40, plNum, position, p2p,17);
                              break;
                        case 5:position=ladderPrinter(t58,t77, plNum, position, p2p,19);
                               break;
                        case 6:stepPrinter(t59, plNum, position, p2p);
                               break;
                 }
                       break;
           case 54:
              VisibilityDecider(t54, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t55, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t56, plNum, position, p2p);
                               break;
                        case 3:position=SnakeBite(t57, t40, plNum, position, p2p,17);
                              break;
                        case 4:position=ladderPrinter(t58,t77, plNum, position, p2p,19);
                               break;
                        case 5:stepPrinter(t59, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t60, plNum, position, p2p);
                               break;
                 }
                       break;
          case 55:
              VisibilityDecider(t55, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t56, plNum, position, p2p);
                               break;
                        case 2:position=SnakeBite(t57, t40, plNum, position, p2p,17);
                              break;
                        case 3:position=ladderPrinter(t58,t77, plNum, position, p2p,19);
                               break;
                        case 4:stepPrinter(t59, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t60, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t61, plNum, position, p2p);
                               break;
                 }
                       break;
           case 56:
               VisibilityDecider(t56, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:position=SnakeBite(t57, t40, plNum, position, p2p,17);
                              break;
                        case 2:position=ladderPrinter(t58,t77, plNum, position, p2p,19);
                               break;
                        case 3:stepPrinter(t59, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t60, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t61, plNum, position, p2p);
                               break;
                        case 6:position=SnakeBite(t62, t22, plNum, position, p2p,40);
                            break;
                 }
                       break;
           case 58:VisibilityDecider(t58, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t59, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t60, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t61, plNum, position, p2p);
                               break;
                        case 4:position=SnakeBite(t62, t22, plNum, position, p2p,40);
                            break;   
                        case 5:stepPrinter(t63, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t64, plNum, position, p2p);
                               break;
     
                 }
                       break;
           case 59:VisibilityDecider(t59, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t60, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t61, plNum, position, p2p);
                               break;
                        case 3:position=SnakeBite(t62, t22, plNum, position, p2p,40);
                            break;   
                        case 4:stepPrinter(t63, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t64, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t65, plNum, position, p2p);
                               break;
                 }
                 break;
            case 60:VisibilityDecider(t60, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t61, plNum, position, p2p);
                               break;
                        case 2:position=SnakeBite(t62, t22, plNum, position, p2p,40);
                            break;   
                        case 3:stepPrinter(t63, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t64, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t65, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t66, plNum, position, p2p);
                               break;                        

                 }
                 break;
            case 61: VisibilityDecider(t61, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:position=SnakeBite(t62, t22, plNum, position, p2p,40);
                            break;   
                        case 2:stepPrinter(t63, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t64, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t65, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t66, plNum, position, p2p);
                               break;  
                        case 6:stepPrinter(t67, plNum, position, p2p);
                               break;
                 }
                       break;
           case 62: VisibilityDecider(t62, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t63, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t64, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t65, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t66, plNum, position, p2p);
                               break;  
                        case 5:stepPrinter(t67, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t68, plNum, position, p2p);
                               break;
                            
                 }
                       break;
           case 63:VisibilityDecider(t63, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t64, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t65, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t66, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t67, plNum, position, p2p);
                               break;  
                        case 5:stepPrinter(t68, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t69, plNum, position, p2p);
                               break;
                 }
                       break;
           case 64:VisibilityDecider(t64, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t65, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t66, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t67, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t68, plNum, position, p2p);
                               break;  
                        case 5:stepPrinter(t69, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t70, plNum, position, p2p);
                               break;
                 }
                       break;
           case 65:VisibilityDecider(t65, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t66, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t67, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t68, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t69, plNum, position, p2p);
                               break;  
                        case 5:stepPrinter(t70, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t71, plNum, position, p2p);
                               break;
                 }
                       break;
           case 66:VisibilityDecider(t66, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                         case 1:stepPrinter(t67, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t68, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t69, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t70, plNum, position, p2p);
                               break;  
                        case 5:stepPrinter(t71, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t72, plNum, position, p2p);
                               break;
                 }
                       break;
           case 67:VisibilityDecider(t67, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t68, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t69, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t70, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t71, plNum, position, p2p);
                               break;  
                        case 5:stepPrinter(t72, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t73, plNum, position, p2p);
                               break;    
                 }
                       break;
           case 68:VisibilityDecider(t68, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t69, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t70, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t71, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t72, plNum, position, p2p);
                               break;  
                        case 5:stepPrinter(t73, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t74, plNum, position, p2p);
                               break; 
                 }
                       break;
           case 69:VisibilityDecider(t69, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t70, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t71, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t72, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t73, plNum, position, p2p);
                               break;  
                        case 5:stepPrinter(t74, plNum, position, p2p);
                               break;
                        case 6:position=ladderPrinter(t75,t86, plNum, position, p2p,11);
                               break; 
                 }
                       break;
           case 70:VisibilityDecider(t70, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t71, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t72, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t73, plNum, position, p2p);
                               break;  
                        case 4:stepPrinter(t74, plNum, position, p2p);
                               break;
                        case 5:position=ladderPrinter(t75,t86, plNum, position, p2p,11);
                               break;
                        case 6:stepPrinter(t76, plNum, position, p2p);
                               break;
                 }
                       break;
           case 71:VisibilityDecider(t71, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t72, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t73, plNum, position, p2p);
                               break;  
                        case 3:stepPrinter(t74, plNum, position, p2p);
                               break;
                        case 4:position=ladderPrinter(t75,t86, plNum, position, p2p,11);
                               break;
                        case 5:stepPrinter(t76, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t77, plNum, position, p2p);
                               break;
                 }
                       break;
           case 72:VisibilityDecider(t72, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t73, plNum, position, p2p);
                               break;  
                        case 2:stepPrinter(t74, plNum, position, p2p);
                               break;
                        case 3:position=ladderPrinter(t75,t86, plNum, position, p2p,11);
                               break;
                        case 4:stepPrinter(t76, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t77, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t78, plNum, position, p2p);
                             break;
                 }
                       break;
           case 73:VisibilityDecider(t73, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t74, plNum, position, p2p);
                               break;
                        case 2:position=ladderPrinter(t75,t86, plNum, position, p2p,11);
                               break;
                        case 3:stepPrinter(t76, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t77, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t78, plNum, position, p2p);
                             break;
                        case 6:stepPrinter(t79, plNum, position, p2p);
                             break;
                 }
                       break;
           case 74:
              VisibilityDecider(t74, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:position=ladderPrinter(t75,t86, plNum, position, p2p,11);
                               break;
                        case 2:stepPrinter(t76, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t77, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t78, plNum, position, p2p);
                             break;
                        case 5:stepPrinter(t79, plNum, position, p2p);
                             break;
                        case 6:position=ladderPrinter(t80,t100, plNum, position, p2p,20);
                            break;
                 }
                       break;
           case 75:
               VisibilityDecider(t75, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t76, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t77, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t78, plNum, position, p2p);
                             break;
                        case 4:stepPrinter(t79, plNum, position, p2p);
                             break;
                        case 5:position=ladderPrinter(t80,t100, plNum, position, p2p,20);
                            break;
                        case 6:stepPrinter(t81, plNum, position, p2p);
                              break;
                 }
                       break;
          case 76:
               VisibilityDecider(t76, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t77, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t78, plNum, position, p2p);
                             break;
                        case 3:stepPrinter(t79, plNum, position, p2p);
                             break;
                        case 4:position=ladderPrinter(t80,t100, plNum, position, p2p,20);
                            break;
                        case 5:stepPrinter(t81, plNum, position, p2p);
                              break;
                        case 6:stepPrinter(t82, plNum, position, p2p);
                              break;
                 }
                       break;
           case 77:
               VisibilityDecider(t77, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t78, plNum, position, p2p);
                             break;
                        case 2:stepPrinter(t79, plNum, position, p2p);
                             break;
                        case 3:position=ladderPrinter(t80,t100, plNum, position, p2p,20);
                            break;
                        case 4:stepPrinter(t81, plNum, position, p2p);
                              break;
                        case 5:stepPrinter(t82, plNum, position, p2p);
                              break;
                        case 6:stepPrinter(t83, plNum, position, p2p);
                              break;
                 }
                       break;
          case 78:VisibilityDecider(t78, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t79, plNum, position, p2p);
                             break;
                        case 2:position=ladderPrinter(t80,t100, plNum, position, p2p,20);
                            break;
                        case 3:stepPrinter(t81, plNum, position, p2p);
                              break;
                        case 4:stepPrinter(t82, plNum, position, p2p);
                              break;
                        case 5:stepPrinter(t83, plNum, position, p2p);
                              break;
                        case 6:stepPrinter(t84, plNum, position, p2p);
                               break; 
                 }
                       break;
           case 79:VisibilityDecider(t79, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:position=ladderPrinter(t80,t100, plNum, position, p2p,20);
                            break;
                        case 2:stepPrinter(t81, plNum, position, p2p);
                              break;
                        case 3:stepPrinter(t82, plNum, position, p2p);
                              break;
                        case 4:stepPrinter(t83, plNum, position, p2p);
                              break;
                        case 5:stepPrinter(t84, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t85, plNum, position, p2p);
                               break;
                 }
                       break;
           case 80:VisibilityDecider(t80, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t81, plNum, position, p2p);
                              break;
                        case 2:stepPrinter(t82, plNum, position, p2p);
                              break;
                        case 3:stepPrinter(t83, plNum, position, p2p);
                              break;
                        case 4:stepPrinter(t84, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t85, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t85, plNum, position, p2p);
                               break;
                 }
                       break;
           case 81: VisibilityDecider(t81, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t82, plNum, position, p2p);
                              break;
                        case 2:stepPrinter(t83, plNum, position, p2p);
                              break;
                        case 3:stepPrinter(t84, plNum, position, p2p);
                              break;
                        case 4:stepPrinter(t85, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t86, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t87, plNum, position, p2p);
                               break;     
                 }
                       break;
           case 82: VisibilityDecider(t82, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t83, plNum, position, p2p);
                              break;
                        case 2:stepPrinter(t84, plNum, position, p2p);
                              break;
                        case 3:stepPrinter(t85, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t86, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t87, plNum, position, p2p);
                               break; 
                        case 6:position=SnakeBite(t88, t18, plNum, position, p2p,70);
                               break;
                 }
                       break;
           case 83:VisibilityDecider(t83, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t84, plNum, position, p2p);
                              break;
                        case 2:stepPrinter(t85, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t86, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t87, plNum, position, p2p);
                               break; 
                        case 5:position=SnakeBite(t88, t18, plNum, position, p2p,70);
                               break;
                        case 6:stepPrinter(t89, plNum, position, p2p);
                               break; 
                 }
                       break;
           case 84:VisibilityDecider(t84, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t85, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t86, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t87, plNum, position, p2p);
                               break; 
                        case 4:position=SnakeBite(t88, t18, plNum, position, p2p,70);
                               break;
                        case 5:stepPrinter(t89, plNum, position, p2p);
                               break;
                        case 6:position=ladderPrinter(t90,t91, plNum, position, p2p,1);
                              break;
                 }
                       break;
           case 85:VisibilityDecider(t85,player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t86, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t87, plNum, position, p2p);
                               break; 
                        case 3:position=SnakeBite(t88, t18, plNum, position, p2p,70);
                               break;
                        case 4:stepPrinter(t89, plNum, position, p2p);
                               break;
                        case 5:position=ladderPrinter(t90,t91, plNum, position, p2p,1);
                              break;
                        case 6:stepPrinter(t91, plNum, position, p2p);
                               break;
                 }
                       break;
           case 86:VisibilityDecider(t86, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t87, plNum, position, p2p);
                               break; 
                        case 2:position=SnakeBite(t88, t18, plNum, position, p2p,70);
                               break;
                        case 3:stepPrinter(t89, plNum, position, p2p);
                               break;
                        case 4:position=ladderPrinter(t90,t91, plNum, position, p2p,1);
                              break;
                        case 5:stepPrinter(t91, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t92, plNum, position, p2p);
                               break;
                 }
                       break;
           case 87:VisibilityDecider(t87, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                         case 1:position=SnakeBite(t88, t18, plNum, position, p2p,70);
                               break;
                        case 2:stepPrinter(t89, plNum, position, p2p);
                               break;
                        case 3:position=ladderPrinter(t90,t91, plNum, position, p2p,1);
                              break;
                        case 4:stepPrinter(t91, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t92, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t93, plNum, position, p2p);
                               break;
                 }
                       break;
           case 89:VisibilityDecider(t89, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                         case 1:position=ladderPrinter(t90,t91, plNum, position, p2p,1);
                              break;
                        case 2:stepPrinter(t91, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t92, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t93, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t94, plNum, position, p2p);
                               break;
                        case 6:position=SnakeBite(t95, t70, plNum, position, p2p,25);
                            break;
                 }
                       break;
           case 90:VisibilityDecider(t90, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                       case 1:stepPrinter(t91, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t92, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t93, plNum, position, p2p);
                               break;
                        case 4:stepPrinter(t94, plNum, position, p2p);
                               break;
                        case 5:position=SnakeBite(t95, t70, plNum, position, p2p,25);
                            break;
                        case 6:stepPrinter(t96, plNum, position, p2p);
                               break;
                 }
                       break;
           case 91:VisibilityDecider(t91, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t92, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t93, plNum, position, p2p);
                               break;
                        case 3:stepPrinter(t94, plNum, position, p2p);
                               break;
                        case 4:position=SnakeBite(t95, t70, plNum, position, p2p,25);
                            break;
                        case 5:stepPrinter(t96, plNum, position, p2p);
                               break; 
                        case 6:position=SnakeBite(t97, t79, plNum, position, p2p,18);
                              break;
                 }
                       break;
           case 92:VisibilityDecider(t92, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t93, plNum, position, p2p);
                               break;
                        case 2:stepPrinter(t94, plNum, position, p2p);
                               break;
                        case 3:position=SnakeBite(t95, t70, plNum, position, p2p,25);
                            break;
                        case 4:stepPrinter(t96, plNum, position, p2p);
                               break; 
                        case 5:position=SnakeBite(t97, t79, plNum, position, p2p,18);
                              break;
                        case 6:stepPrinter(t98, plNum, position, p2p);
                               break;
                       
                 }
                       break;
           case 93:VisibilityDecider(t93, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:stepPrinter(t94, plNum, position, p2p);
                               break;
                        case 2:position=SnakeBite(t95, t70, plNum, position, p2p,25);
                            break;
                        case 3:stepPrinter(t96, plNum, position, p2p);
                               break; 
                        case 4:position=SnakeBite(t97, t79, plNum, position, p2p,18);
                              break;
                        case 5:stepPrinter(t98, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t99, plNum, position, p2p);
                               break;
                 }
                       break;
           case 94:
              VisibilityDecider(t94, player_2);              
                  position=position+n; 
                   switch(n)
                 {
                        case 1:position=SnakeBite(t95, t70, plNum, position, p2p,25);
                            break;
                        case 2:stepPrinter(t96, plNum, position, p2p);
                               break; 
                        case 3:position=SnakeBite(t97, t79, plNum, position, p2p,18);
                              break;
                        case 4:stepPrinter(t98, plNum, position, p2p);
                               break;
                        case 5:stepPrinter(t99, plNum, position, p2p);
                               break;
                        case 6:stepPrinter(t100, plNum, position, p2p);
                               break;
                 }
                       break;
           case 96:
                          
                  
                   switch(n)
                 {
                        case 1: VisibilityDecider(t96, player_2);  
                              position=SnakeBite(t97, t79, plNum, position, p2p,18);
                              break;
                        case 2:VisibilityDecider(t96, player_2);
                                position=position+n; 
                                stepPrinter(t98, plNum, position, p2p);
                               break;
                        case 3:VisibilityDecider(t96, player_2);
                               stepPrinter(t99, plNum, position, p2p);
                               break;
                        case 4:VisibilityDecider(t96, player_2);
                               position+=n;
                               stepPrinter(t100, plNum, position, p2p);
                               break;
                 }
                       break;
           
           case 98:          
                   switch(n)
                 {
                        case 1:VisibilityDecider(t98, player_2);    
                               position=position+n;
                               stepPrinter(t99, plNum, position, p2p);
                               break;
                        case 2:VisibilityDecider(t98, player_2);    
                               position=position+n;
                               stepPrinter(t100, plNum, position, p2p);
                               break;
                 }
                       break;
           case 99:          
                   switch(n)
                 {
                       case 1:VisibilityDecider(t99, player_2);    
                              position=position+n;
                               stepPrinter(t100, plNum, position, p2p);
                               break;
                 }
                 break;
       }
       return position;
    
    }
    
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Game().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton exit;
    private javax.swing.JLabel game;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JLayeredPane jLayeredPane5;
    private javax.swing.JTextField jTextField49;
    private javax.swing.JLabel jhjkj;
    private javax.swing.JButton player1_bt;
    private javax.swing.JLabel player1dice;
    private javax.swing.JLabel player1pos;
    private javax.swing.JButton player2_bt;
    private javax.swing.JLabel player2dice;
    private javax.swing.JLabel player2pos;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t10;
    private javax.swing.JLabel t100;
    private javax.swing.JLabel t101;
    private javax.swing.JLabel t11;
    private javax.swing.JLabel t12;
    private javax.swing.JLabel t13;
    private javax.swing.JLabel t14;
    private javax.swing.JLabel t15;
    private javax.swing.JLabel t16;
    private javax.swing.JLabel t17;
    private javax.swing.JLabel t18;
    private javax.swing.JLabel t19;
    private javax.swing.JLabel t2;
    private javax.swing.JLabel t20;
    private javax.swing.JLabel t21;
    private javax.swing.JLabel t22;
    private javax.swing.JLabel t23;
    private javax.swing.JLabel t24;
    private javax.swing.JLabel t25;
    private javax.swing.JLabel t26;
    private javax.swing.JLabel t27;
    private javax.swing.JLabel t28;
    private javax.swing.JLabel t29;
    private javax.swing.JLabel t3;
    private javax.swing.JLabel t30;
    private javax.swing.JLabel t31;
    private javax.swing.JLabel t32;
    private javax.swing.JLabel t33;
    private javax.swing.JLabel t34;
    private javax.swing.JLabel t35;
    private javax.swing.JLabel t36;
    private javax.swing.JLabel t37;
    private javax.swing.JLabel t38;
    private javax.swing.JLabel t39;
    private javax.swing.JLabel t4;
    private javax.swing.JLabel t40;
    private javax.swing.JLabel t41;
    private javax.swing.JLabel t42;
    private javax.swing.JLabel t43;
    private javax.swing.JLabel t44;
    private javax.swing.JLabel t45;
    private javax.swing.JLabel t46;
    private javax.swing.JLabel t47;
    private javax.swing.JLabel t48;
    private javax.swing.JLabel t49;
    private javax.swing.JLabel t5;
    private javax.swing.JLabel t50;
    private javax.swing.JLabel t51;
    private javax.swing.JLabel t52;
    private javax.swing.JLabel t53;
    private javax.swing.JLabel t54;
    private javax.swing.JLabel t55;
    private javax.swing.JLabel t56;
    private javax.swing.JLabel t57;
    private javax.swing.JLabel t58;
    private javax.swing.JLabel t59;
    private javax.swing.JLabel t6;
    private javax.swing.JLabel t60;
    private javax.swing.JLabel t61;
    private javax.swing.JLabel t62;
    private javax.swing.JLabel t63;
    private javax.swing.JLabel t64;
    private javax.swing.JLabel t65;
    private javax.swing.JLabel t66;
    private javax.swing.JLabel t67;
    private javax.swing.JLabel t68;
    private javax.swing.JLabel t69;
    private javax.swing.JLabel t7;
    private javax.swing.JLabel t70;
    private javax.swing.JLabel t71;
    private javax.swing.JLabel t72;
    private javax.swing.JLabel t73;
    private javax.swing.JLabel t74;
    private javax.swing.JLabel t75;
    private javax.swing.JLabel t76;
    private javax.swing.JLabel t77;
    private javax.swing.JLabel t78;
    private javax.swing.JLabel t79;
    private javax.swing.JLabel t8;
    private javax.swing.JLabel t80;
    private javax.swing.JLabel t81;
    private javax.swing.JLabel t82;
    private javax.swing.JLabel t83;
    private javax.swing.JLabel t84;
    private javax.swing.JLabel t85;
    private javax.swing.JLabel t86;
    private javax.swing.JLabel t87;
    private javax.swing.JLabel t88;
    private javax.swing.JLabel t89;
    private javax.swing.JLabel t9;
    private javax.swing.JLabel t90;
    private javax.swing.JLabel t91;
    private javax.swing.JLabel t92;
    private javax.swing.JLabel t93;
    private javax.swing.JLabel t94;
    private javax.swing.JLabel t95;
    private javax.swing.JLabel t96;
    private javax.swing.JLabel t97;
    private javax.swing.JLabel t98;
    private javax.swing.JLabel t99;
    // End of variables declaration//GEN-END:variables
}
