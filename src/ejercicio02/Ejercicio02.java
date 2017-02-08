/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio02;

/**
 *
 * @author Jairo
 */
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.*;
public class Ejercicio02 implements ActionListener {

    private JFrame marco;
    private JLabel titulo;
    private JLabel vBlanca;
    private JLabel vAmarilla;
    private JButton blanca;
    private JButton amarilla;
    private int va;
    private int vb;
    
    public Ejercicio02(){
      va=0;  
      vb=0;  
     marco=new JFrame("Ejercicio02");
     marco.setLayout(null);
     marco.setSize(300, 200);
     marco.setResizable(false);
     marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
     
     titulo= new JLabel("Votos por planilla");
     titulo.setBounds(100, -150, 200, 400);
     marco.add(titulo);
     
     vBlanca= new JLabel(":->0");
     vBlanca.setBounds(135, 70, 50, 20);
     marco.add(vBlanca);
     
     vAmarilla=new JLabel(":->0");
     vAmarilla.setBounds(135, 100, 50, 20);
     marco.add(vAmarilla);
     
     blanca=new JButton("Blanca");
     blanca.setBounds(30, 70, 100, 25);
     blanca.addActionListener(this);
     marco.add(blanca);
     
     amarilla=new JButton("Amarilla");
     amarilla.setBounds(30, 100, 100, 25);
     amarilla.addActionListener(this);
     marco.add(amarilla);
    
     
    marco.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
         try
        {
             if(e.getSource()== blanca){
               vb++;  
               vBlanca.setText(":->"+vb);
             }  
             if(e.getSource()== amarilla){
                 va++;
               vAmarilla.setText(":->"+va);
             }   
          
        }catch(NullPointerException n)
        {
            System.out.println("Error");
        }
    }
    
    public static void main(String[] args) {
        
      Ejercicio02 ej2=new Ejercicio02();
    }
    
}
