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
public class ContaPoupanca extends Conta {
    double juros=0;
    public void setJuros(double j){
        this.juros=j;
    }
    public void rendimento(){
        this.saldo+=this.saldo*this.juros;
    }
}
