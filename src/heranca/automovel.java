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
public class automovel extends terrestre{
    
    private String placa;
    private int numPortas;
    
    
    public void imprimeDados() {
    
        System.out.println("Placa: "+placa);
        System.out.println("Portas: "+numPortas);
        System.out.println("Rodas: "+numRodas);
        System.out.println("Capacidade: "+capacidade+" pessoas");
    
    }

    
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    
    
    
    
}
