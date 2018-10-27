/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizytator;

import java.awt.Color;
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
// jak ladnie poustawiac setBounds() w petli????
//sprawdz jak wyglądają poszczegolne leki. Czy nie trzeba ich zmniejszyć? 
//działanie dla jdnego pacjenta
public class Wyglad extends JFrame{
    private static Integer poprawne = 0;
    private static Integer bledne = 0;
    private JLabel tlo;
    private JLabel correct;
    private JLabel no;
    private Integer [] tmp = new Integer [5];
    private JButton pierwszy;
    private JButton drugi;
    private JButton trzeci;
    private JButton czwarty;
    private JButton piaty;
    public Wyglad(){
        setTitle("Mój Szpital");
        setSize(1600,1000);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tlo = new JLabel(new ImageIcon("obrazy\\recepcja.jpg"));
        tlo.setBounds(0,0,1600,1000);
        add(tlo);
        correct = new JLabel(poprawne.toString());
        correct.setForeground(Color.green);
        correct.setBounds(750,10,50,50);        
        tlo.add(correct);
        no = new JLabel(bledne.toString());
        no.setForeground(Color.red);
        no.setBounds(800,10,50,50);
        tlo.add(no);
        for(int i=0;i<5;i++){
            tmp[i] = (int)((Math.random()*10)+1);
        }
        pierwszy = new JButton(new ImageIcon("obrazy\\"+tmp[0].toString()+".jpg"));
        pierwszy.setBounds(30,500,250,250);
        pierwszy.addActionListener(new PomocPierwszy());
        tlo.add(pierwszy);
        drugi = new JButton(new ImageIcon("obrazy\\"+tmp[1].toString()+".jpg"));
        drugi.setBounds(310,500,250,250);
        drugi.addActionListener(new PomocDrugi());
        tlo.add(drugi);
        trzeci = new JButton(new ImageIcon("obrazy\\"+tmp[2].toString()+".jpg"));
        trzeci.setBounds(590,500,250,250);
        trzeci.addActionListener(new PomocTrzeci());
        tlo.add(trzeci);
        czwarty = new JButton(new ImageIcon("obrazy\\"+tmp[3].toString()+".jpg"));
        czwarty.setBounds(870,500,250,250);
        czwarty.addActionListener(new PomocCzwarty());
        tlo.add(czwarty);
        piaty = new JButton(new ImageIcon("obrazy\\"+tmp[4].toString()+".jpg"));
        piaty.setBounds(1150,500,250,250);
        piaty.addActionListener(new PomocPiaty());
        tlo.add(piaty);
        setVisible(true);
    }
    class PomocPierwszy implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            //dowiemy sie jaki klient wyslal powiadomienie
            Pacjent pacjent = coToZaChoroba(tmp[0]);
            //ustalimy metode accept() ktorej klasy nalezy wywolac
            //otwieramy nowe okienko ze wszystkimi dostepnymi lekarzami
            PanelLekarza panel = new PanelLekarza(pacjent);  
            //while(!panel.getIsDone()){}
            if(panel.isCzySiePowiodlo()) poprawne++;
            else bledne++;
            //gdy klikniemy lekarza dostajemy jakis punkcik
            //otwiera sie jeszcze jedno okienko z informacja o chorobie i przepisanym leku.
            //okienko zamkyka sie ok
            //okienko lekarzy zamyka sie przez wcisniecie przycisku inny pacjent
            //stary pacjent jest zastepowany nowym
            tmp[0] = (int)((Math.random()*10)+1);
            //pierwszy = new JButton(new ImageIcon("obrazy\\"+tmp[0].toString()+".jpg"));
            //repaint() naszej planszy
            //setVisible(false);
            //new Wyglad().setVisible(true);
        }        
    }
    class PomocDrugi implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
            Pacjent pacjent = coToZaChoroba(tmp[1]);            
            PanelLekarza panel = new PanelLekarza(pacjent);           
            if(panel.isCzySiePowiodlo()) poprawne++;
            else bledne++;            
            tmp[1] = (int)((Math.random()*10)+1);            
        }
    }
    class PomocTrzeci implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
            Pacjent pacjent = coToZaChoroba(tmp[2]);            
            PanelLekarza panel = new PanelLekarza(pacjent);           
            if(panel.isCzySiePowiodlo()) poprawne++;
            else bledne++;            
            tmp[2] = (int)((Math.random()*10)+1);            
        }
    }
    class PomocCzwarty implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
            Pacjent pacjent = coToZaChoroba(tmp[3]);            
            PanelLekarza panel = new PanelLekarza(pacjent);           
            if(panel.isCzySiePowiodlo()) poprawne++;
            else bledne++;            
            tmp[3] = (int)((Math.random()*10)+1);            
        }
    }
    class PomocPiaty implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {            
            Pacjent pacjent = coToZaChoroba(tmp[4]);            
            PanelLekarza panel = new PanelLekarza(pacjent);           
            if(panel.isCzySiePowiodlo()) poprawne++;
            else bledne++;            
            tmp[4] = (int)((Math.random()*10)+1);            
        }
    }
    public Pacjent coToZaChoroba(int numer){
       if (numer == 1) return new Grypa();
       if (numer == 2) return new BolZeba();
       if (numer == 3) return new NiedoczynnoscTarczycy();
       if (numer == 4) return new ChoreSerce();
       if (numer == 5) return new StarszaOsoba();
       if (numer == 6) return new Dziecko();
       if (numer == 7) return new Ciaza();
       if (numer == 8) return new ZlamanaReka();
       if (numer == 9) return new Zacma();
       else return new BoleBrzucha();
    }
}
