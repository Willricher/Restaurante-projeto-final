package restaurante.transacao;

import restaurante.cardapio.*;
import restaurante.entidades.*;
import restaurante.utilitario.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Pedido {
    Scanner scanner = new Scanner(System.in);

    private Cliente cliente;
    private Entregador entregador;
    private StatusDoPedido statusDoPedido;
    private ArrayList itemCardapio;

    public Pedido() {
        this.cliente = null;
        this.entregador = null;
        this.statusDoPedido = StatusDoPedido.SENDO_CRIADO;
        this.itemCardapio = new ArrayList();
    }

    public void definirCliente() {
        // fazer método de validação de string
        System.out.print("\nInsira o nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        this.cliente = new Cliente(nomeCliente, scanner);
        this.cliente.setBairro();
        System.out.println("\nCliente adicionado!");
    }

    public void definirEntregador() {
        System.out.print("\nInsira o nome do entregador: ");
        String nomeEntregador = scanner.nextLine();
        System.out.print("\nInsira a placa da moto do entregador: ");
        String placaMotoEntregador = scanner.nextLine();
        this.entregador = new Entregador(nomeEntregador, placaMotoEntregador);
        System.out.println("\nEntregador adicionado!");
    }

    public void mudarEstadoDoPedido() {
        System.out.println("""
                Insira o estado do pedido:
                
                1 - Sendo criado
                2 - Na fila
                3 - Em preparo
                4 - Pronto
                5 - A caminho
                6 - Entregue""");
        int escolha = scanner.nextInt();
        scanner.nextLine();
        switch (escolha) {
            case 1: {
                this.statusDoPedido = StatusDoPedido.SENDO_CRIADO;
                System.out.println("\nPedido está sendo criado!");
            }
            break;
            case 2: {
                this.statusDoPedido = StatusDoPedido.NA_FILA;
                System.out.println("\nPedido agora na fila!");
            }
            break;
            case 3: {
                this.statusDoPedido = StatusDoPedido.EM_PREPARO;
                System.out.println("\nPedido agora em preparo!");
            }
            break;
            case 4: {
                this.statusDoPedido = StatusDoPedido.PRONTO;
                System.out.println("\nPedido agora pronto!");
            }
            break;
            case 5: {
                this.statusDoPedido = StatusDoPedido.A_CAMINHO;
                System.out.println("\nPedido agora a caminho!");
            }
            break;
            case 6: {
                this.statusDoPedido = StatusDoPedido.ENTREGUE;
                System.out.println("\nPedido agora entregue!");
            }
            break;
        }
    }


}
