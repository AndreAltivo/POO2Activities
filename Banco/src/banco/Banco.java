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
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente conta1= new ContaCorrente();
        ContaPoupanca conta2= new ContaPoupanca();
        conta1.setSaldo(100.0);
        System.out.println("Saldo tributado Conta Corrente:"+conta1.calculaTributo());
        conta2.setSaldo(100.0);
        conta2.setJuros(0.005);
        conta2.rendimento();
        System.out.println("Saldo Conta Poupanca:"+conta2.getSaldo());
        
    }
    
}
