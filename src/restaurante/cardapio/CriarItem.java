package restaurante.cardapio;

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
    public static void criarItem(Scanner scanner) {
        boolean completo = false;
        while (!completo) {
            System.out.println("""
            \nInsira o tipo de prato: 
            
            1 - Prato Principal
            2 - Bebida
            3 - Sobremesa""");
            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:

            }
        }
    }
}
