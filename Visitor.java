/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wizytator;

/**
 *
 * @author lenovo
 */
public interface Visitor {
    //wszystkie możliwe wersje visit konkretny pacjent
    //wywołanie metody z opisem jak sie leczyc
    //oraz metody z lekiem
    public abstract boolean visit(Grypa grypa);
    public abstract boolean visit(BolZeba zab);
    public abstract boolean visit(NiedoczynnoscTarczycy tarczyca);
    public abstract boolean visit(ChoreSerce serce);
    public abstract boolean visit(StarszaOsoba starszy);
    public abstract boolean visit(Dziecko dziecko);
    public abstract boolean visit(Ciaza ciaza);
    public abstract boolean visit(ZlamanaReka reka);
    public abstract boolean visit(Zacma zacma);
    public abstract boolean visit(BoleBrzucha brzuch);    
}
