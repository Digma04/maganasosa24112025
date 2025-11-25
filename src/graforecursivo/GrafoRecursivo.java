package graforecursivo;


import graforecursivo.Nodo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UFG
 */
public class GrafoRecursivo {
    
    Nodo[] nodos;
    boolean[][] adyacencia;
    boolean[] visitado;
    
    
    public GrafoRecursivo(int tamano){
        
        nodos = new Nodo[tamano];
        adyacencia = new boolean[tamano][tamano];
        visitado = new boolean[tamano];
        
    }
    
    
    public void insertarNodo(char valor){
        
        for(int i=0; i < nodos.length; i++){
            
            if(nodos[i] == null){
                
                nodos[i] = new Nodo(valor);
                return;
            }else{
                continue;
            }
        }
        
        System.out.println("No hay espacio para masnodos");
        
    }
      
    
    
    public void conectar(int origen, int destino){
        
        adyacencia[origen][destino] = true;
        adyacencia[destino][origen] = true;
        
    }
    
    
    public void dfs(int inicio){
        
        recorrer(inicio, 0);
        
            
    }
    
    
    public void recorrer(int actual, int siguiente){
        
        if(!visitado[actual]){
            
            visitado[actual] = true;
            System.out.print(nodos[actual].valor + " ");
            
        }
        
        if(siguiente >= nodos.length){
            
            return;
            
        }else{
            
            if( adyacencia[actual][siguiente] && !visitado[siguiente]){
                
                recorrer(siguiente,0);
                recorrer(actual, siguiente+1);
                
            }else{
                
                recorrer(actual, siguiente+1);
                
            }
            
        }
        
    }
    
}
