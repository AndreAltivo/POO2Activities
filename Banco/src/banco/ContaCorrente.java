/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 20162BSI0031
 */
public class ContaCorrente extends Conta implements Tributavel{

    @Override
    public double calculaTributo() {
        
        double resultado=this.saldo*0.1 +this.saldo;
        
        return resultado;
    }
    
}
