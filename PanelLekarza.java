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
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author lenovo
 */
//Każdy poszczególny lekarz ma swoją metodę actionListener. Tam możemy stworzyć konkretnego lekarza by mógł odwiedzić naszego pacjenta
public class PanelLekarza extends /*JFrame*/ JDialog{
    private JLabel tlo;
    private JButton lekarzOgolny;
    private JLabel lekarzOgolnyPodpis;
    private JButton dentysta;
    private JLabel dentystaPodpis;
    private JButton endokrynolog;
    private JLabel endokrynologPodpis;
    private JButton kardiolog;
    private JLabel kardiologPodpis;
    private JButton geriatra;
    private JLabel geriatraPodpis;
    private JButton pediatra;
    private JLabel pediatraPodpis;
    private JButton ginekolog;
    private JLabel ginekologPodpis;
    private JButton ortopeda;
    private JLabel ortopedaPodpis;
    private JButton okulista;
    private JLabel okulistaPodpis;
    private JButton gastrolog;
    private JLabel gastrologPodpis;
    private JButton innyPacjent;
    private JLabel objawy;
    private Pacjent pacjent;
    private boolean czySiePowiodlo;
    private boolean isDone = false;
    public PanelLekarza(Pacjent pacjent){
        this.pacjent = pacjent;
        setTitle("Mój szpital");
        setSize(1600,1000);
        setLayout(null);
        tlo = new JLabel(new ImageIcon("obrazy\\recepcja.jpg"));
        tlo.setBounds(0,0,1600,1000);
        add(tlo);
        objawy = new JLabel(this.pacjent.objawy());
        objawy.setBounds(30,30,1000,50);
        tlo.add(objawy);
        lekarzOgolny = new JButton(new ImageIcon("obrazy\\lekarzOgolny.jpg"));
        lekarzOgolny.setBounds(30,100,250,250);
        lekarzOgolny.addActionListener(new ActionLekarzOgolny());
        tlo.add(lekarzOgolny);
        lekarzOgolnyPodpis = new JLabel("Lekarz Ogólny");
        lekarzOgolnyPodpis.setBounds(30,340,250,50);
        tlo.add(lekarzOgolnyPodpis);
        dentysta = new JButton(new ImageIcon("obrazy\\dentysta.jpg"));
        dentysta.setBounds(310,100,250,250);
        dentysta.addActionListener(new ActionDentysta());
        tlo.add(dentysta);
        dentystaPodpis = new JLabel("Dentysta");
        dentystaPodpis.setBounds(310,340,250,50);
        tlo.add(dentystaPodpis);
        endokrynolog = new JButton(new ImageIcon("obrazy\\endokrynolog.jpg"));
        endokrynolog.setBounds(590,100,250,250);
        endokrynolog.addActionListener(new ActionEndokrynolog());
        tlo.add(endokrynolog);
        endokrynologPodpis = new JLabel("Endokrynolog");
        endokrynologPodpis.setBounds(590,340,250,50);
        tlo.add(endokrynologPodpis);
        kardiolog = new JButton(new ImageIcon("obrazy\\kardiolog.jpg"));
        kardiolog.setBounds(870,100,250,250);
        kardiolog.addActionListener(new ActionKardiolog());
        tlo.add(kardiolog);
        kardiologPodpis = new JLabel("Kardiolog");
        kardiologPodpis.setBounds(870,340,250,50);
        tlo.add(kardiologPodpis);
        geriatra = new JButton(new ImageIcon("obrazy\\geriatra.jpg"));
        geriatra.setBounds(1150,100,250,250);
        geriatra.addActionListener(new ActionGeriatra());
        tlo.add(geriatra);
        geriatraPodpis = new JLabel("Geriatra");
        geriatraPodpis.setBounds(1150,340,250,50);
        tlo.add(geriatraPodpis);
        pediatra = new JButton(new ImageIcon("obrazy\\pediatra.jpg"));
        pediatra.setBounds(30,500,250,250);
        pediatra.addActionListener(new ActionPediatra());
        tlo.add(pediatra);
        pediatraPodpis = new JLabel("Pediatra");
        pediatraPodpis.setBounds(30,730,250,50);
        tlo.add(pediatraPodpis);
        ginekolog = new JButton(new ImageIcon("obrazy\\ginekolog.jpg"));
        ginekolog.setBounds(310,500,250,250);
        ginekolog.addActionListener(new ActionGinekolog());
        tlo.add(ginekolog);
        ginekologPodpis = new JLabel("Ginekolog");
        ginekologPodpis.setBounds(310,730,250,50);
        tlo.add(ginekologPodpis);
        ortopeda = new JButton(new ImageIcon("obrazy\\ortopeda.jpg"));
        ortopeda.setBounds(590,500,250,250);
        ortopeda.addActionListener(new ActionOrtopeda());
        tlo.add(ortopeda);
        ortopedaPodpis = new JLabel("Ortopeda");
        ortopedaPodpis.setBounds(590,730,250,50);
        tlo.add(ortopedaPodpis);
        okulista = new JButton(new ImageIcon("obrazy\\okulista.jpg"));
        okulista.setBounds(870,500,250,250);
        okulista.addActionListener(new ActionOkulista());
        tlo.add(okulista);
        okulistaPodpis = new JLabel("Okulista");
        okulistaPodpis.setBounds(870,730,250,50);
        tlo.add(okulistaPodpis);
        gastrolog = new JButton(new ImageIcon("obrazy\\gastrolog.jpg"));
        gastrolog.setBounds(1150,500,250,250);
        gastrolog.addActionListener(new ActionGastrolog());
        tlo.add(gastrolog);
        gastrologPodpis = new JLabel("Gastolog");
        gastrologPodpis.setBounds(1150,730,250,50);
        tlo.add(gastrologPodpis);
        innyPacjent = new JButton("Inny Pacjent");
        innyPacjent.setBounds(750,800,150,50);
        innyPacjent.addActionListener(new Hide());
        tlo.add(innyPacjent);
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setVisible(true);        
    }
    class ActionLekarzOgolny implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            Visitor lekarz = new lekarzOgolny();            
           czySiePowiodlo = pacjent.accept(lekarz);           
        }        
    }
    class ActionDentysta implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Visitor lekarz = new Dentysta();            
           czySiePowiodlo = pacjent.accept(lekarz);           
        }
    }
    class ActionEndokrynolog implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Visitor lekarz = new Endokrynolog();            
           czySiePowiodlo = pacjent.accept(lekarz);           
        }
    }
    class ActionKardiolog implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Visitor lekarz = new Kardiolog();            
           czySiePowiodlo = pacjent.accept(lekarz);
        }
    }
    class ActionGeriatra implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Visitor lekarz = new Geriatra();            
           czySiePowiodlo = pacjent.accept(lekarz);
        }
    }
    class ActionPediatra implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Visitor lekarz = new Pediatra();            
           czySiePowiodlo = pacjent.accept(lekarz);
        }
    }
    class ActionGinekolog implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Visitor lekarz = new Ginekolog();            
           czySiePowiodlo = pacjent.accept(lekarz);
        }
    }
    class ActionOrtopeda implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Visitor lekarz = new Ortopeda();            
           czySiePowiodlo = pacjent.accept(lekarz);
        }
    }
    class ActionOkulista implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Visitor lekarz = new Okulista();            
           czySiePowiodlo = pacjent.accept(lekarz);
        }
    }
    class ActionGastrolog implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            Visitor lekarz = new Gastrolog();            
           czySiePowiodlo = pacjent.accept(lekarz);
        }
    }
    class Hide implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            setVisible(false);
            //dispose();
        }
        
    }

    public boolean isCzySiePowiodlo() {
        return czySiePowiodlo;
    }   
    public boolean getIsDone(){
        return isDone;
    }
    public void setIsDone(){
        isDone = false;
    }
}
