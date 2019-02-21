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
abstract class Conta {
    double saldo;
    
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double s){
        this.saldo=s;
    }
}
