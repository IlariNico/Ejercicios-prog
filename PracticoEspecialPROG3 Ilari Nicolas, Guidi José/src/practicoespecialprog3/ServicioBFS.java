package practicoespecialprog3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ilari
 */
public class ServicioBFS {
    private Grafo<?> grafo;
    private ArrayList<Integer> fila=new ArrayList();
    private Map<Integer,Boolean> mapavertices;
    
    
    //O(n) donde n es la cantidad de vertices 
    private List<Integer> bfsForest(Integer key){
            mapavertices.put(key,true);
            ArrayList<Integer>lista=new ArrayList();
            lista.add(key);
            fila.add(key);
            while(!fila.isEmpty()){
                fila.remove(0);
                Iterator it=grafo.obtenerAdyacentes(key);
                while(it.hasNext()){
                    Integer v=(Integer)it.next();
                    if(mapavertices.get(v).equals(false)){
                        mapavertices.put(v, true);
                        lista.add(v);
                        fila.add(v);
                        
                    }
                    
                }
                
            }
            return lista;
        }
    //O(n)donde n es la cantidad de vertices ya que itera por la cantidad de vertices  
    public List<Integer> bfsForest() {
            mapavertices=new HashMap();
            ArrayList<Integer> lista=new ArrayList();
            fila=new ArrayList();
            Iterator it=grafo.obtenerVertices();
            while(it.hasNext()){
                Integer i=(Integer)it.next();
                mapavertices.put(i,false);
            }
            it=grafo.obtenerVertices();
            while(it.hasNext()){
                Integer i=(Integer)it.next();
                if(mapavertices.get(i).equals(false)){
                    lista.addAll(bfsForest(i));

                }
            }
            return lista;
    }
    
    public ServicioBFS(Grafo<?> grafo) {
            this.grafo = grafo;
    }

    
}
