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
        System.out.print("\nInsira o endereço do cliente: ");
        String enderecoCliente = scanner.nextLine();
        this.cliente = new Cliente(nomeCliente, enderecoCliente);
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

    }
}
