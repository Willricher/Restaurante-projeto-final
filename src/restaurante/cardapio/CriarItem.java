package restaurante.cardapio;

import restaurante.cardapio.tipos.Bebida;
import restaurante.cardapio.tipos.ItemCardapio;
import restaurante.cardapio.tipos.PratoPrincipal;
import restaurante.cardapio.tipos.Sobremesa;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class CriarItem {
    private static Object[] baseItem(Scanner scanner) {
        Object[] arrayMaluco = new Object[3];

        System.out.print("\nInsira o nome do item: ");
        arrayMaluco[0] = scanner.nextLine();
        System.out.print("\nInsira o valor do item: ");
        arrayMaluco[1] = scanner.nextDouble();
        System.out.println("\nInsira as calorias do item: ");
        arrayMaluco[2] = scanner.nextInt();
        scanner.nextLine();
        return arrayMaluco;
    }
    public static void criarItem(ArrayList<ItemCardapio> pratos, Scanner scanner) {
        boolean completo = false;
        while (!completo) {
            System.out.println("""
            \nInsira o tipo de prato: 
            
            1 - Prato Principal
            2 - Bebida
            3 - Sobremesa""");
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1: {
                    Object[] arrayDoido = baseItem(scanner);
                    System.out.println("\nInsira o tipo de proteína do item: ");
                    String tipoDeProteina = scanner.nextLine();
                    PratoPrincipal pratoPrincipal = new PratoPrincipal(Objects.toString(arrayDoido[0], "Sopa de Cebola com Sebo"),
                            ((Number) arrayDoido[1]).doubleValue(), ((Number) arrayDoido[2]).intValue(), tipoDeProteina);
                    pratos.add(pratoPrincipal);
                    completo = true;
                    break;
                }
                case 2: {
                    Object[] arrayDoido = baseItem(scanner);
                    System.out.println("\nInsira o tipo de bebida: ");
                    String tipoDeBebida = scanner.nextLine();
                    System.out.println("\nInsira a cor da bebida: ");
                    String corDaBebida = scanner.nextLine();
                    Bebida bebidaParaAdicionar = new Bebida(Objects.toString(arrayDoido[0], "Monster Sabor Java"),
                            ((Number) arrayDoido[1]).doubleValue(), ((Number) arrayDoido[2]).intValue(), tipoDeBebida, corDaBebida);
                    pratos.add(bebidaParaAdicionar);
                    completo = true;
                    break;
                }
                case 3: {
                    Object[] arrayDoido = baseItem(scanner);
                    System.out.println("\nInsira o tipo de sobremesa: ");
                    String tipoDeSobremesa = scanner.nextLine();
                    Sobremesa sobremesaParaAdicionar = new Sobremesa(Objects.toString(arrayDoido[0], "Bolo Sabor Java"),
                            ((Number) arrayDoido[1]).doubleValue(), ((Number) arrayDoido[2]).intValue(), tipoDeSobremesa);
                    pratos.add(sobremesaParaAdicionar);
                    completo = true;
                    break;
                }
            }
        }
    }
}
