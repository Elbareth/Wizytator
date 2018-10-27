/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizytator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author lenovo
 */
public class KardiologWyglad extends JFrame{
    private JLabel tlo;
    private JButton ok;
    private JLabel opisPostepowania;
    private JLabel lek;
    public KardiologWyglad(){
        setTitle("Mój Szpital");
        setSize(1600,1000);
        setLayout(null);
        tlo = new JLabel(new ImageIcon("obrazy\\recepcja.jpg"));
        tlo.setBounds(0,0,1600,1000);
        add(tlo);
        opisPostepowania = new JLabel("<html>Proszę się nie przemęczać i nie jeść zbyt tłustych rzeczy <br/>"
                + "ma pani początki miażdżycy dlatego zalecam jeść dużo owoców i warzyw oraz <br/>"
                + "spędzać dużo czasu na wysiłku fizycznym. Zalecam również zarzywanie <br/>"
                + "wskazanego przeze mnie leku <html>");
        opisPostepowania.setBounds(50,50,500,500);
        tlo.add(opisPostepowania);
        lek = new JLabel(new ImageIcon("obrazy\\polocard.jpg"));
        lek.setBounds(650, 50, 800, 350);
        tlo.add(lek);
        ok = new JButton("OK");
        ok.setBounds(750,800,100,50);
        ok.addActionListener(new Hide());
        tlo.add(ok);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    class Hide implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
        }
        
    }    
}
