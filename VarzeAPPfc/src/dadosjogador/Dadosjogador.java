/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadosjogador;
import java.util.Date;
import java.util.Scanner;


public class Dadosjogador {

   
    public static void main(String[] args) {
        Date data= new Date();
        
        jogador novoano = new jogador();
        int acesso;
        int opcao;
        
        Scanner entrada = new Scanner(System.in);
        
        
        System.out.println("Hoje é dia: " +data);
        System.out.println("Começa o jogo!");
        System.out.println("Escolha a sua opção abaixo:");
        System.out.println("1 - Primeiro acesso / 2 - Fazer Login");
                acesso = entrada.nextInt();
        if (acesso >=2){
            System.out.println("Efetuar Login: ");
            String login = entrada.nextLine();
            System.out.println("Senha: ");
            String senha = entrada.nextLine();
            
            
        } else if (acesso >= 1){
            
        
        System.out.println("Digite o número da opção: 1 - Jogador / 2 - Diretor / 3 - Torcedor");
            opcao = entrada.nextInt();
        if (opcao >= 1 ){
            System.out.println("Qual seu nome completo?");
            String nomejogador = entrada.nextLine();
            System.out.println("Qual sua posição?");
            String posicao = entrada.nextLine();
            System.out.println("Com qual perna chuta? ");
            String perna = entrada.nextLine();
            System.out.println("Qual sua idade? ");
            int dianasc = entrada.nextInt();
            System.out.println("Qual sua Altura? ");
            double altura = entrada.nextDouble();
            System.out.println("O nome do atleta é: "+nomejogador);
            System.out.println("");
            System.out.println("A altura dele é: "+altura);
            System.out.println("O jogador tem:" + novoano.getidade()+"anos");
        } else if  (opcao >=2){
            System.out.println("Qual seu nome completo?");
            String nomediretor= entrada.nextLine();
            System.out.println("Qual sua idade?");
            int idadediretor = entrada.nextInt();
            System.out.println("Qual seu time na várzea? ");
            String cargodiretor = entrada.nextLine();
            System.out.println("Qual seu cargo dentro do time");
            String timediretor = entrada.nextLine();
            
            
            
        } else if (opcao >=3){
            System.out.println("Qual seu nome completo?");
            String nometorcedor= entrada.nextLine();
            System.out.println("Qual sua idade?");
            int idadediretor = entrada.nextInt();
            System.out.println("Qual seu time na várzea? ");
            String timetorcedor = entrada.nextLine();
            System.out.println("Mora em qual bairro?");
            String bairrotorcedor=entrada.nextLine();
        }
            System.out.println("Teste ok");
        }
    }
}

  
            
        
       
        
       
        
