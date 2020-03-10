/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import model.Carteira;
import model.ContaCorrente;

/**
 *
 * @author Murilau
 */
public class Principal {
    public static void main(String[] args) {
        Carteira cart = new Carteira();
        cart.setNome("Carteira Azul");
        cart.setSaldo(500);
        
        System.out.println(cart.getNome() + ": R$ " + cart.getSaldo());
        
        ContaCorrente cc = new ContaCorrente();
        cc.setNome("Banco Teste S/A");
        cc.setSaldo(200);
        cc.setLimite(3000);
        System.out.println(cc.getNome());
        System.out.println("Saldo: R$ " + cc.getSaldo());
        System.out.println("Limite de Crédito: R$ " + cc.getLimite());

    }
}
