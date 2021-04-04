/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package googol99;

import java.util.Random;
import javax.swing.JOptionPane;

 public class jframe extends javax.swing.JFrame {
    
    int turn =1;
    
    int[] usedButton = {0,0,0,0,0,0,0,0,0};
    
    int [] playerX_Won = {0,0,0,0,0,0,0,0,0};
    
    int [] playerO_Won = {0,0,0,0,0,0,0,0,0};
    
    int result_X,result_O;
    
    Random r = new Random();
    
    //check win for player X
    int playX_Win()
    {
        if (playerX_Won[0] == 1 && playerX_Won[1] == 1 && playerX_Won[2] == 1 )
        {
            return 1;
        }
        if (playerX_Won[3] == 1 && playerX_Won[4] == 1 && playerX_Won[5] == 1 )
        {
            return 1;
        }
        if (playerX_Won[6] == 1 && playerX_Won[7] == 1 && playerX_Won[8] == 1 )
        {
            return 1;
        }
        if (playerX_Won[0] == 1 && playerX_Won[3] == 1 && playerX_Won[6] == 1 )
        {
            return 1;
        }
        if (playerX_Won[1] == 1 && playerX_Won[4] == 1 && playerX_Won[7] == 1 )
        {
            return 1;
        }
        if (playerX_Won[2] == 1 && playerX_Won[5] == 1 && playerX_Won[8] == 1 )
        {
            return 1;
        }
        if (playerX_Won[0] == 1 && playerX_Won[4] == 1 && playerX_Won[8] == 1 )
        {
            return 1;
        }
        if (playerX_Won[2] == 1 && playerX_Won[4] == 1 && playerX_Won[6] == 1 )
        {
            return 1;
        }
        
        else if(usedButton[0] == 1 && usedButton[1] == 1 &&usedButton[2] == 1 && usedButton[3] == 1 &&usedButton[4] == 1 && usedButton[5] == 1 &&usedButton[6] == 1 && usedButton[7] == 1 && usedButton[8] == 1 )
        {
            return 2;
        }
        
        return 0;
                
    }
    
    //CHECK IF PLAYER O CAN WIN
    int playO_Win()
    {
        if (playerO_Won[0] == 1 && playerO_Won[1] == 1 && playerO_Won[2] == 1 )
        {
            return 1;
        }
        if (playerO_Won[3] == 1 && playerO_Won[4] == 1 && playerO_Won[5] == 1 )
        {
            return 1;
        }
        if (playerO_Won[6] == 1 && playerO_Won[7] == 1 && playerO_Won[8] == 1 )
        {
            return 1;
        }
        if (playerO_Won[0] == 1 && playerO_Won[3] == 1 && playerO_Won[6] == 1 )
        {
            return 1;
        }
        if (playerO_Won[1] == 1 && playerO_Won[4] == 1 && playerO_Won[7] == 1 )
        {
            return 1;
        }
        if (playerO_Won[2] == 1 && playerO_Won[5] == 1 && playerO_Won[8] == 1 )
        {
            return 1;
        }
        if (playerO_Won[0] == 1 && playerO_Won[4] == 1 && playerO_Won[8] == 1 )
        {
            return 1;
        }
        if (playerO_Won[2] == 1 && playerO_Won[4] == 1 && playerO_Won[6] == 1 )
        {
            return 1;
        }
        else if(usedButton[0] == 1 && usedButton[1] == 1 &&usedButton[2] == 1 && usedButton[3] == 1 &&usedButton[4] == 1 && usedButton[5] == 1 &&usedButton[6] == 1 && usedButton[7] == 1 && usedButton[8] == 1 )
        {
            return 2;
        }
        return 0;
                
    }
    
    //COMPUTER'S MOVE
    public void computer()
    {
        if(playerO_Won[0]==1 && playerO_Won[1]==1 && usedButton[2]==0)
        {
            
            bt3ActionPerformed();
        
        }
        
        else if(playerO_Won[0]==1 && playerO_Won[2]==1 && usedButton[1]==0)
        {
            
            bt2ActionPerformed();
            
            
        }
        else if(playerO_Won[1]==1 && playerO_Won[2]==1 && usedButton[0]==0)
        {
            
            bt1ActionPerformed();
            
        }
        
        else if(playerO_Won[3]==1 && playerO_Won[4]==1 && usedButton[5]==0)
        {
            
            bt6ActionPerformed();
                       
        }
        
        else if(playerO_Won[3]==1 && playerO_Won[5]==1 && usedButton[4]==0)
        {
          
            bt5ActionPerformed();
            
            
        }
        else if(playerO_Won[4]==1 && playerO_Won[5]==1 && usedButton[3]==0)
        {
            
            bt4ActionPerformed();
           
        }
            
        else if(playerO_Won[6]==1 && playerO_Won[7]==1 && usedButton[8]==0)
        {
           
            
            bt9ActionPerformed();
            
        }
            
        else if(playerO_Won[6]==1 && playerO_Won[8]==1 && usedButton[7]==0)
        {
            
            bt8ActionPerformed();
            
        }
            
        else if(playerO_Won[7]==1 && playerO_Won[8]==1 && usedButton[6]==0)
        {
            
            bt7ActionPerformed();
            
        }
            
        else if(playerO_Won[0]==1 && playerO_Won[3]==1 && usedButton[6]==0)
        {
            
            bt7ActionPerformed();
            
        }
           
        else if(playerO_Won[0]==1 && playerO_Won[6]==1 && usedButton[3]==0)
        {

            bt4ActionPerformed();
            
        }
            
        else if(playerO_Won[3]==1 && playerO_Won[6]==1 && usedButton[0]==0)
        {
            
            bt1ActionPerformed();
            
        }
            
        else if(playerO_Won[1]==1 && playerO_Won[4]==1 && usedButton[7]==0)
        {
            
            bt8ActionPerformed();
            
        }
            
        else if(playerO_Won[1]==1 && playerO_Won[7]==1 && usedButton[4]==0)
        {
           
            bt5ActionPerformed();
            
        }
        
        else if(playerO_Won[4]==1 && playerO_Won[7]==1 && usedButton[1]==0)
        {
            
            bt2ActionPerformed();
            
        }
        
        else if(playerO_Won[2]==1 && playerO_Won[5]==1 && usedButton[8]==0)
        {
            
            bt9ActionPerformed();
            
        }
            
        else if(playerO_Won[2]==1 && playerO_Won[8]==1 && usedButton[5]==0)
        {
            
            bt6ActionPerformed();
            
        }
            
        else if(playerO_Won[5]==1 && playerO_Won[8]==1 && usedButton[2]==0)
        {
            
            bt3ActionPerformed();
            
        }
            
        else if(playerO_Won[0]==1 && playerO_Won[4]==1 && usedButton[8]==0)
        {
            
            bt9ActionPerformed();
            
        }
            
        else if(playerO_Won[0]==1 && playerO_Won[8]==1 && usedButton[4]==0)
        {
            
            bt5ActionPerformed();
            
        }
            
        else if(playerO_Won[4]==1 && playerO_Won[8]==1 && usedButton[0]==0)
        {
            
            bt1ActionPerformed();
            
        }
            
        else if(playerO_Won[2]==1 && playerO_Won[4]==1 && usedButton[6]==0)
        {
            
            bt7ActionPerformed();
            
        }
            
        else if(playerO_Won[2]==1 && playerO_Won[6]==1 && usedButton[4]==0)
        {
            
            bt5ActionPerformed();
            
        }
            
        else if(playerO_Won[4]==1 && playerO_Won[6]==1 && usedButton[2]==0)
        {
            
            bt3ActionPerformed();
            
            
        }
        
        
        
        else if(playerX_Won[0]==1 && playerX_Won[1]==1 && usedButton[2]==0)
        {
            
            bt3ActionPerformed();
            
        }
            
       else if(playerX_Won[0]==1 && playerX_Won[2]==1 && usedButton[1]==0)
        {
            
            bt2ActionPerformed();
            
            
        }
        else if(playerX_Won[1]==1 && playerX_Won[2]==1 && usedButton[0]==0)
        {
            
            bt1ActionPerformed();
            
        }
        
        else if(playerX_Won[3]==1 && playerX_Won[4]==1 && usedButton[5]==0)
        {
            
            bt6ActionPerformed();
                       
        }
        
        else if(playerX_Won[3]==1 && playerX_Won[5]==1 && usedButton[4]==0)
        {
          
            bt5ActionPerformed();
            
            
        }
        else if(playerX_Won[4]==1 && playerX_Won[5]==1 && usedButton[3]==0)
        {
            
            bt4ActionPerformed();
           
        }
            
        else if(playerX_Won[6]==1 && playerX_Won[7]==1 && usedButton[8]==0)
        {
           
            
            bt9ActionPerformed();
            
        }
            
        else if(playerX_Won[6]==1 && playerX_Won[8]==1 && usedButton[7]==0)
        {
            
            bt8ActionPerformed();
            
        }
            
        else if(playerX_Won[7]==1 && playerX_Won[8]==1 && usedButton[6]==0)
        {
            
            bt7ActionPerformed();
            
        }
            
        else if(playerX_Won[0]==1 && playerX_Won[3]==1 && usedButton[6]==0)
        {
            
            bt7ActionPerformed();
            
        }
           
        else if(playerX_Won[0]==1 && playerX_Won[6]==1 && usedButton[3]==0)
        {

            bt4ActionPerformed();
            
        }
            
        else if(playerX_Won[3]==1 && playerX_Won[6]==1 && usedButton[0]==0)
        {
            
            bt1ActionPerformed();
            
        }
            
        else if(playerX_Won[1]==1 && playerX_Won[4]==1 && usedButton[7]==0)
        {
            
            bt8ActionPerformed();
            
        }
            
        else if(playerX_Won[1]==1 && playerX_Won[7]==1 && usedButton[4]==0)
        {
           
            bt5ActionPerformed();
            
        }
        
        else if(playerX_Won[4]==1 && playerX_Won[7]==1 && usedButton[1]==0)
        {
            
            bt2ActionPerformed();
            
        }
        
        else if(playerX_Won[2]==1 && playerX_Won[5]==1 && usedButton[8]==0)
        {
            
            bt9ActionPerformed();
            
        }
            
        else if(playerX_Won[2]==1 && playerX_Won[8]==1 && usedButton[5]==0)
        {
            
            bt6ActionPerformed();
            
        }
            
        else if(playerX_Won[5]==1 && playerX_Won[8]==1 && usedButton[2]==0)
        {
            
            bt3ActionPerformed();
            
        }
            
        else if(playerX_Won[0]==1 && playerX_Won[4]==1 && usedButton[8]==0)
        {
            
            bt9ActionPerformed();
            
        }
            
        else if(playerX_Won[0]==1 && playerX_Won[8]==1 && usedButton[4]==0)
        {
            
            bt5ActionPerformed();
            
        }
            
        else if(playerX_Won[4]==1 && playerX_Won[8]==1 && usedButton[0]==0)
        {
            
            bt1ActionPerformed();
            
        }
            
        else if(playerX_Won[2]==1 && playerX_Won[4]==1 && usedButton[6]==0)
        {
            
            bt7ActionPerformed();
            
        }
            
        else if(playerX_Won[2]==1 && playerX_Won[6]==1 && usedButton[4]==0)
        {
            
            bt5ActionPerformed();
            
        }
            
        else if(playerX_Won[4]==1 && playerX_Won[6]==1 && usedButton[2]==0)
        {
            
            bt3ActionPerformed();
            
            
        }
        
        else
            random();
        
        
        
            
        
    }
    
    
    public void random()//random move for computer
    {
        int n;
        while(true)
        {
            n = r.nextInt(9);
            
            if(n==8 && usedButton[8]==0)
            {
                
                bt9ActionPerformed();
                break;
            }
            else if(n == 7 && usedButton[7]==0)
            {
                bt8ActionPerformed();
                break;
            }
            else if(n == 6 && usedButton[6]==0)
            {
                bt7ActionPerformed();
                break;
            }
            else if(n == 5 && usedButton[5]==0)
            {
                bt6ActionPerformed();
                break;
            }
            else if(n == 4 && usedButton[4]==0)
            {
                bt5ActionPerformed();
                break;
            }
            else if(n == 3 && usedButton[3]==0)
            {
                bt4ActionPerformed();
                break;
            }
            else if(n == 2 && usedButton[2]==0)
            {
                bt3ActionPerformed();
                break;
            }
            else if(n == 1 && usedButton[1]==0)
            {
                bt2ActionPerformed();
                break;
            }
            else if(n == 0 && usedButton[0]==0)
            {
                bt1ActionPerformed();
                break;
            }
            
           
           
        }
            
               
        
            
        
    }
    
    

        
    
    
    /**
     * 
     * 
     * Creates new form jframe
     */
    public jframe() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        bt2 = new javax.swing.JButton();
        bt3 = new javax.swing.JButton();
        bt4 = new javax.swing.JButton();
        bt5 = new javax.swing.JButton();
        bt6 = new javax.swing.JButton();
        bt1 = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        bt7 = new javax.swing.JButton();
        bt8 = new javax.swing.JButton();
        bt9 = new javax.swing.JButton();
        reset1 = new javax.swing.JButton();
        turn2 = new javax.swing.JButton();
        turn1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SELECT TURN");

        bt2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });

        bt3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });

        bt4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });

        bt5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });

        bt6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });

        bt1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });

        reset.setText("PLAY AGAIN");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        bt7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });

        bt8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });

        bt9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        bt9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt9ActionPerformed(evt);
            }
        });

        reset1.setText("EXIT");
        reset1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reset1ActionPerformed(evt);
            }
        });

        turn2.setText("FIRST");
        turn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turn2ActionPerformed(evt);
            }
        });

        turn1.setText("SECOND");
        turn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                turn1ActionPerformed(evt);
            }
        });

        jPanel2.setToolTipText("HAI");
        jPanel2.setName("HAI"); // NOI18N
        jPanel2.setLayout(new javax.swing.BoxLayout(jPanel2, javax.swing.BoxLayout.LINE_AXIS));

        jLabel1.setText("SELECT TURN:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(58, 58, 58)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(turn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(turn1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(88, 88, 88)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(60, 60, 60)
                            .addComponent(reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 77, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(turn2)
                            .addComponent(turn1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt3, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt4, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt6, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bt7, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt8, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bt9, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        jPanel2.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>                        

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        
          if (usedButton[2] == 0)
        {
            if(turn%2!=0)
            {
                turn++;
                bt3.setText("X");
                usedButton[2]=1;
                playerX_Won[2]=1;
                
                
                result_X = playX_Win();
                
                switch (result_X) {
                    case 1:
                        JOptionPane.showMessageDialog(rootPane, "X WIN");
                        break;
                    case 2:// IF FULL BUT NOBODY WIN
                        JOptionPane.showMessageDialog(rootPane, "DRAW");
                        break;
                    default://COMPUTER'S TURN
                        computer();
                        break;     
                }
                 

                 // IF FULL BUT NOBODY WIN
                 //COMPUTER'S TURN
                 // IF TEXT HAS BEEN SET AT THIS BUTTON
            }
        }
        // IF TEXT HAS BEEN SET AT THIS BUTTON
        else
        {
            JOptionPane.showMessageDialog(rootPane, " ALREADY ASSIGNED");
        }
        
        
    }                                   

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        
          if (usedButton[6] == 0)
        {
            if(turn%2!=0)
            {
                turn++;
                bt7.setText("X");
                
                usedButton[6]=1;
                 
                playerX_Won[6]=1;
                
                result_X = playX_Win();
                switch (result_X) {
                    case 1:
                        JOptionPane.showMessageDialog(rootPane, "X WIN");
                        break;
  
                    // IF FULL BUT NOBODY WIN
                    case 2:
                        JOptionPane.showMessageDialog(rootPane, "DRAW");
                        break;
                 
                    //COMPUTER'S TURN
                    default:
                        computer();
                        break;
                }
                
                
            }
        }
        
             // IF TEXT HAS BEEN SET AT THIS BUTTON
        else
        {
            JOptionPane.showMessageDialog(rootPane, " ALREADY ASSIGNED");
        }
        
        
    }                                   

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        
          if (usedButton[7] == 0)
        {
            if(turn%2!=0)
            {
                turn++;
                bt8.setText("X");
                
                 usedButton[7]=1;
                 
                playerX_Won[7]=1;
                
                result_X = playX_Win();
                switch (result_X) {
                    case 1:
                        JOptionPane.showMessageDialog(rootPane, "X WIN");
                        break;
                        
                    // IF FULL BUT NOBODY WIN
                    case 2:
                        JOptionPane.showMessageDialog(rootPane, "DRAW");
                        break;
                
                    //COMPUTER'S TURN
                    default:
                        computer();
                        break;   
                }
                
                
            }
        }
        
         // IF TEXT HAS BEEN SET AT THIS BUTTON
        else
        {
            JOptionPane.showMessageDialog(rootPane, " ALREADY ASSIGNED");
        }
        
        
    }                                   

    private void bt9ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        
          if (usedButton[8] == 0)
        {
            if(turn%2!=0)
            {
                turn++;
                bt9.setText("X");
                
                usedButton[8]=1;
                
                playerX_Won[8]=1;
                
                result_X = playX_Win();
                switch (result_X) {
                    case 1:
                        JOptionPane.showMessageDialog(rootPane, "X WIN");
                        break;
                        
                // IF FULL BUT NOBODY WIN
                    case 2:
                        JOptionPane.showMessageDialog(rootPane, "DRAW");
                        break;
                        
                //COMPUTER'S TURN
                    default:
                        computer();
                        break;
                }
                
            }
        }
        
        // IF TEXT HAS BEEN SET AT THIS BUTTON
        else
        {
            JOptionPane.showMessageDialog(rootPane, " ALREADY ASSIGNED");
        }
        
        
    }                                   

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        if (usedButton[0] == 0)
        {
            if(turn%2!=0)
            {
                turn++;
                bt1.setText("X");
                
                usedButton[0]=1;
                 
                playerX_Won[0]=1;
                
                result_X = playX_Win();
                switch (result_X) {
                    case 1:
                        JOptionPane.showMessageDialog(rootPane, "X WIN");
                        break;
                        
                // IF FULL BUT NOBODY WIN
                    case 2:
                        JOptionPane.showMessageDialog(rootPane, "DRAW");
                        break;
                        
                //COMPUTER'S TURN
                    default:
                        computer();
                        break;
                }
                
                
            }
        }
        
         // IF TEXT HAS BEEN SET AT THIS BUTTON
        else
        {
            JOptionPane.showMessageDialog(rootPane, " ALREADY ASSIGNED");
        }
        
        
    }                                   

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        
          if (usedButton[1] == 0)
        {
            if(turn%2!=0)
            {
                turn++;
                bt2.setText("X");
                usedButton[1]=1;
                
                playerX_Won[1]=1;
                
                result_X = playX_Win();
                switch (result_X) {
                    case 1:
                        JOptionPane.showMessageDialog(rootPane, "X WIN");
                        break;
                        
                // IF FULL BUT NOBODY WIN
                    case 2:
                        JOptionPane.showMessageDialog(rootPane, "DRAW");
                        break;
                        
                //COMPUTER'S TURN
                    default:
                        computer();
                        break;
                }
            }
        }
        
        // IF TEXT HAS BEEN SET AT THIS BUTTON
        else
        {
            JOptionPane.showMessageDialog(rootPane, " ALREADY ASSIGNED");
        }
        
    }                                   

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        
          if (usedButton[3] == 0)
        {
            if(turn%2!=0)
            {
                turn++;
                bt4.setText("X");
                
                usedButton[3]=1;
                playerX_Won[3]=1;
                
                result_X = playX_Win();
                switch (result_X) {
                    case 1:
                        JOptionPane.showMessageDialog(rootPane, "X WIN");
                        break;
                        
                // IF FULL BUT NOBODY WIN
                    case 2:
                        JOptionPane.showMessageDialog(rootPane, "DRAW");
                        break;
                        
                //COMPUTER'S TURN
                    default:
                        computer();
                        break;
                }
            }
        }

        // IF TEXT HAS BEEN SET AT THIS BUTTON
        else
        {
            JOptionPane.showMessageDialog(rootPane, " ALREADY ASSIGNED");
        }
        
    }                                   

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        
          if (usedButton[4] == 0)
        {
            if(turn%2!=0)
            {
                turn++;
                bt5.setText("X");
                
                usedButton[4]=1;
                
                playerX_Won[4]=1;
                
                result_X = playX_Win();
                
                switch (result_X) {
                    case 1:
                        JOptionPane.showMessageDialog(rootPane, "X WIN");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(rootPane, "DRAW");
                        break;
                    default:
                        computer();
                        break;
                }
            }
        }
        
        else
        {
            JOptionPane.showMessageDialog(rootPane, " ALREADY ASSIGNED");
        }
        
        
    }                                   

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {                                    
        // TODO add your handling code here:
        
          if (usedButton[5] == 0)
        {
            if(turn%2!=0)
             
            {
                turn++;
                bt6.setText("X");
                
                usedButton[5]=1;
                
                playerX_Won[5]=1;
                
                result_X = playX_Win();
                
                switch (result_X) {
                    case 1:
                        JOptionPane.showMessageDialog(rootPane, "X WIN");
                        break;
                    case 2:
                        JOptionPane.showMessageDialog(rootPane, "DRAW");
                        break;
                    default:
                        computer();
                        break;
                }
                
                
            }
        }
        
        else
        {
            JOptionPane.showMessageDialog(rootPane, " ALREADY ASSIGNED");
        }
        
    }                                   

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        
        
        bt1.setText("");
        bt2.setText("");
        bt3.setText("");
        bt4.setText("");
        bt5.setText("");
        bt6.setText("");
        bt7.setText("");
        bt8.setText("");
        bt9.setText("");
        
        turn = 1;
        
        for (int i = 0; i < 9; i++) 
        {
             
            playerX_Won[i]=0;
            
        }
        for (int i = 0; i < 9; i++) 
        {
             
            playerO_Won[i]=0;
            
        }
        for (int i = 0; i < 9; i++) 
        {
             
            usedButton[i]=0;
            
        }
    }                                     
    
   
    private void reset1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        
        int response = JOptionPane.showConfirmDialog(this, "DO YOU WANT TO EXIT?", "TIC TAC TOE",JOptionPane.YES_NO_OPTION);
        
        if(response==JOptionPane.YES_OPTION)
        {
            this.dispose();
        }
        
        
        
        
        
        
        
    }                                      

    private void turn2ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        
        turn = 1;
        
        
    }                                     

    private void turn1ActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
        
        turn = 2;
        computer();
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
            java.util.logging.Logger.getLogger(jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jframe().setVisible(true);
            }
        });
    }
    
    
    
     private void bt3ActionPerformed() {                                    
        // TODO add your handling code here:
        
          if (usedButton[2] == 0)
        {
            if(turn%2==0)
            {
                turn++;
                bt3.setText("O");
                usedButton[2]=1;
                playerO_Won[2]=1;
                
                result_O = playO_Win();
                
                if(result_O == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "O WIN");
                }
                else if(result_O == 2)
                {
                    JOptionPane.showMessageDialog(rootPane, "DRAW");
                }
                
                
            
            }
        
           
        }
        
        else
        {
            JOptionPane.showMessageDialog(rootPane, " ALREADY ASSIGNED");
        }
        
        
    }    
     
      private void bt7ActionPerformed() {                                    
        // TODO add your handling code here:
        
          if (usedButton[6] == 0)
        {
            if(turn%2==0)
            {
                turn++;
                bt7.setText("O");
                usedButton[6]=1;
                playerO_Won[6]=1;
                
                result_O = playO_Win();
                
                if(result_O == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "O WIN");
                }
                
                 else if(result_O == 2)
                {
                    JOptionPane.showMessageDialog(rootPane, "DRAW");
                }
            
            }
        
            
        }
        
        else
        {
            JOptionPane.showMessageDialog(rootPane, " ALREADY ASSIGNED");
        }
        
        
    }                                   

    private void bt8ActionPerformed() {                                    
        // TODO add your handling code here:
        
          if (usedButton[7] == 0)
        {
            if(turn%2==0)
            {
                turn++;
                bt8.setText("O");
                usedButton[7]=1;
                playerO_Won[7]=1;
                
                result_O = playO_Win();
                
                if(result_O == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "O WIN");
                }
                
                 else if(result_O == 2)
                {
                    JOptionPane.showMessageDialog(rootPane, "DRAW");
                }
            
            }
        
            
        }
        
        else
        {
            JOptionPane.showMessageDialog(rootPane, " ALREADY ASSIGNED");
        }
        
        
    }                                   

    private void bt9ActionPerformed() {                                    
        // TODO add your handling code here:
        
          if (usedButton[8] == 0)
        {
            if(turn%2==0)
            {
                turn++;
                bt9.setText("O");
                usedButton[8]=1;
                playerO_Won[8]=1;
                
                result_O = playO_Win();
                
                if(result_O == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "O WIN");
                }
                
                 else if(result_O == 2)
                {
                    JOptionPane.showMessageDialog(rootPane, "DRAW");
                }
            
            }
        
            
        }
        
        else
        {
            JOptionPane.showMessageDialog(rootPane, " ALREADY ASSIGNED");
        }
        
        
    }                                   

    private void bt1ActionPerformed() {                                    
        // TODO add your handling code here:
        if (usedButton[0] == 0)
        {
            if(turn%2==0)
            {
                turn++;
                bt1.setText("O");
                usedButton[0]=1;
                
                playerO_Won[0]=1;
                
                result_O = playO_Win();
                
                if(result_O == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "O WIN");
                }
                
                 else if(result_O == 2)
                {
                    JOptionPane.showMessageDialog(rootPane, "DRAW");
                }
            
            }
        
            
        }
        
        else
        {
            JOptionPane.showMessageDialog(rootPane, " ALREADY ASSIGNED");
        }
        
        
    }                                   

    private void bt2ActionPerformed() {                                    
        // TODO add your handling code here:
        
          if (usedButton[1] == 0)
        {
            if(turn%2==0)
            {
                turn++;
                bt2.setText("O");
                usedButton[1]=1;
                playerO_Won[1]=1;
                
                result_O = playO_Win();
                
                if(result_O == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "O WIN");
                }
                
                 else if(result_O == 2)
                {
                    JOptionPane.showMessageDialog(rootPane, "DRAW");
                }
            
            }
        
           
        }
        
        else
        {
            JOptionPane.showMessageDialog(rootPane, " ALREADY ASSIGNED");
        }
        
    }                                   

    private void bt4ActionPerformed() {                                    
        // TODO add your handling code here:
        
          if (usedButton[3] == 0)
        {
            if(turn%2==0)
            {
                turn++;
                bt4.setText("O");
                usedButton[3]=1;
                
                playerO_Won[3]=1;
                
                result_O = playO_Win();
                
                if(result_O == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "O WIN");
                }
                
                 else if(result_O == 2)
                {
                    JOptionPane.showMessageDialog(rootPane, "DRAW");
                }
            
            }
        
          
        }
        
        else
        {
            JOptionPane.showMessageDialog(rootPane, " ALREADY ASSIGNED");
        }
        
    }                                   

    private void bt5ActionPerformed() {                                    
        // TODO add your handling code here:
        
          if (usedButton[4] == 0)
        {
            if(turn%2==0)
            {
                turn++;
                bt5.setText("O");
                usedButton[4]=1;
                playerO_Won[4]=1;
                
                result_O = playO_Win();
                
                if(result_O == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "O WIN");
                }
                
                 else if(result_O == 2)
                {
                    JOptionPane.showMessageDialog(rootPane, "DRAW");
                }
            
            }
        
           
        }
        
        else
        {
            JOptionPane.showMessageDialog(rootPane, " ALREADY ASSIGNED");
        }
        
        
    }                                   

    private void bt6ActionPerformed() {                                    
        // TODO add your handling code here:
        
          if (usedButton[5] == 0)
        {
            if(turn%2==0)
            {
                turn++;
                bt6.setText("O");
                usedButton[5]=1;
                
                playerO_Won[5]=1;
                
                result_O = playO_Win();
                
                if(result_O == 1)
                {
                    JOptionPane.showMessageDialog(rootPane, "O WIN");
                }
                
                 else if(result_O == 2)
                {
                    JOptionPane.showMessageDialog(rootPane, "DRAW");
                }
            
            }
        
           
        }
        
        else
        {
            JOptionPane.showMessageDialog(rootPane, " ALREADY ASSIGNED");
        }
        
    }           

    // Variables declaration - do not modify                     
    private javax.swing.JButton bt1;
    private javax.swing.JButton bt2;
    private javax.swing.JButton bt3;
    private javax.swing.JButton bt4;
    private javax.swing.JButton bt5;
    private javax.swing.JButton bt6;
    private javax.swing.JButton bt7;
    private javax.swing.JButton bt8;
    private javax.swing.JButton bt9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton reset;
    private javax.swing.JButton reset1;
    private javax.swing.JButton turn1;
    private javax.swing.JButton turn2;
    // End of variables declaration                   
}

