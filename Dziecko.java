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
public class Dziecko implements Pacjent{
    @Override
    public boolean accept(Visitor visitor){
       return visitor.visit(this);
    }
    @Override
    public String objawy(){
        return "Naszym pacjentem jest dziecko. Ma ono katar i boli go gardło";
    }
}
