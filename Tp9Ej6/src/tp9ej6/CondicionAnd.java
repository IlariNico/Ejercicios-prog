/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej6;

/**
 *
 * @author ilari
 */
public class CondicionAnd extends Condicion{

    Condicion c1;
    Condicion c2;
    
    @Override
    public boolean cumple(Comarca e) {
        return c1.cumple(e)&&c2.cumple(e);
    }
 
    public CondicionAnd(Condicion c1,Condicion c2){
        this.c1=c1;
        this.c2=c2;
    }
    
}