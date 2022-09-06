

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

/**
 *
 * @author anderson.mazzotti
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
    automovel carro = new automovel();
    automovel moto = new automovel();
        
    carro.setPlaca("UNO 9635");
    carro.setNumPortas(3);
    carro.setNumRodas(4);
    carro.setCapacidade(5);
    
    carro.imprimeDados();
    
    
    
    
    moto.setPlaca("MOT 1020");
    moto.setCapacidade (2);
    moto.setNumPortas(2);
    
    moto.imprimeDadosMoto();
    
    
    
   
    
        
    }
    
}
