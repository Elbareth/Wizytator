/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizytator;

import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class lekarzOgolny implements Visitor{

    @Override
    public boolean visit(Grypa grypa) {
        WygladLekarzOgolny wyglad = new WygladLekarzOgolny();
        return true;
    }

    @Override
    public boolean visit(BolZeba zab) {        
        JOptionPane.showMessageDialog(null, "Przykro mi. Pomyliłeś lekarza. Twojego pacjenta boli ząb. Teraz pacjent czuje się gorzej");
        return false;
    }

    @Override
    public boolean visit(NiedoczynnoscTarczycy tarczyca) {        
        JOptionPane.showMessageDialog(null, "Przykro mi. Pomyliłeś lekarza. Twój pacjent ma chorą tarczycę. Teraz pacjent czuje się gorzej");
        return false;
    }

    @Override
    public boolean visit(ChoreSerce serce) {        
        JOptionPane.showMessageDialog(null, "Przykro mi. Pomyliłeś lekarza. Twojego pacjenta boli serce. Teraz pacjent czuje się gorzej");
        return false;
    }

    @Override
    public boolean visit(StarszaOsoba starszy) {        
        JOptionPane.showMessageDialog(null, "Przykro mi. Pomyliłeś lekarza. Twój pacjent jest osobą starszą i wymaga innego rodzaju opieki. Teraz pacjent czuje się gorzej");
        return false;
    }

    @Override
    public boolean visit(Dziecko dziecko) {        
        JOptionPane.showMessageDialog(null, "Przykro mi. Pomyliłeś lekarza. Twój pacjent jest dzieckiem i wymaga innego rodzaju opieki. Teraz pacjent czuje się gorzej");
        return false;
    }

    @Override
    public boolean visit(Ciaza ciaza) {        
        JOptionPane.showMessageDialog(null, "Przykro mi. Pomyliłeś lekarza. Twoja pacjentka jest w ciązy i wymaga innego rodzaju opieki. Teraz pacjent czuje się gorzej");
        return false;
    }

    @Override
    public boolean visit(ZlamanaReka reka) {        
        JOptionPane.showMessageDialog(null, "Przykro mi. Pomyliłeś lekarza. Twój pacjent ma złamaną rękę. Teraz pacjent czuje się gorzej");
        return false;
    }

    @Override
    public boolean visit(Zacma zacma) {        
        JOptionPane.showMessageDialog(null, "Przykro mi. Pomyliłeś lekarza. Twój pacjent ma zaćmę. Teraz pacjent czuje się gorzej");
        return false;
    }

    @Override
    public boolean visit(BoleBrzucha brzuch) {        
        JOptionPane.showMessageDialog(null, "Przykro mi. Pomyliłeś lekarza. Twojego pacjenta boli brzuch. Teraz pacjent czuje się gorzej");
        return false;
    }
    
}
