/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp9ej3;

import java.time.LocalDate;

/**
 *
 * @author ilari
 */
public class CondicionFechaPosterios extends Condicion{

    
    @Override
    public boolean cumple(TareaTerminal t) {
        return t.getFechaFin().isAfter(LocalDate.now());
    }

    
    
    
}
