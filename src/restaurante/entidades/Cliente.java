package restaurante.entidades;

import restaurante.utilitario.Bairros;

import java.util.Scanner;

public class Cliente extends Entidade {
    private Scanner scanner;
    private Bairros bairro;

    public Cliente(String nome, Scanner scanner) {
        super(nome);
        this.scanner = scanner;
    }

    public Bairros getBairro() {
        return bairro;
    }

    public void setBairro() {
        boolean completo = false;
        while (!completo) {
            System.out.println("""
                    \nSelecione o Bairro:
                    
                    1 - Centro
                    2 - Igara
                    3 - Guajuviras
                    4 - Mathias Velho
                    5 - Harmonia
                    6 - Fátima
                    7 - Niterói
                    8 - Nossa Sra. das Graças
                    9 - Rio Branco""");
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                {
                    bairro = Bairros.CENTRO;
                    completo = true;
                    break;
                }
                case 2:
                {
                    bairro = Bairros.IGARA;
                    completo = true;
                    break;
                }
                case 3:
                {
                    bairro = Bairros.GUAJUVIRAS;
                    completo = true;
                    break;
                }
                case 4:
                {
                    bairro = Bairros.MATHIAS_VELHO;
                    completo = true;
                    break;
                }
                case 5:
                {
                    bairro = Bairros.HARMONIA;
                    completo = true;
                    break;
                }
                case 6:
                {
                    bairro = Bairros.FATIMA;
                    completo = true;
                    break;
                }
                case 7:
                {
                    bairro = Bairros.NITEROI;
                    completo = true;
                    break;
                }
                case 8:
                {
                    bairro = Bairros.NOSSA_SRA;
                    completo = true;
                    break;
                }
                case 9:
                {
                    bairro = Bairros.RIO_BRANCO;
                    completo = true;
                    break;
                }
            }
        }

    }
}
