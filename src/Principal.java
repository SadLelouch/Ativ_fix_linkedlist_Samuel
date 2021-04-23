import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        Scanner scan = new Scanner(System.in);
        InputStreamReader input = new InputStreamReader(System.in);
        int opcao = 0;
        while (opcao != 15) {
            System.out.println("Bem vindo ao nosso sistema.");
            System.out.println("1 - Adicionar elemento.");
            System.out.println("2 - Editar elemento.");
            System.out.println("3 - Remover elemento.");
            System.out.println("4 - Adicionar elemento. na primeira posição");
            System.out.println("5 - Editar elemento na primeira posição.");
            System.out.println("6 - Remover elemento na primeira posição.");
            System.out.println("7 - Adicionar elemento na última posição.");
            System.out.println("8 - Editar elemento na última posição.");
            System.out.println("9 - Remover elemento na última posição.");
            System.out.println("10 - Resgatar primeiro elemento.");
            System.out.println("11 - Resgatar último elemento.");
            System.out.println("12 - Resgatar elemento.");
            System.out.println("13 - Listar todos os elementos de forma ordenada.");
            System.out.println("14 - Total de elementos na lista.");
            System.out.println("15 - Sair do sistema.");
            System.out.print("\nPor favor, selecione uma opção: ");
            opcao = scan.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Por favor, digite um elemento para adicionar na lista: ");
                    String value = scan.nextLine();
                    value = scan.nextLine();
                    linkedList.add(value);
                    continue;

                case 2:
                    int i = 0;
                    for(String item : linkedList) {
                        System.out.println("Posição: " + i + " | Valor: " + item);
                        System.out.println("-------------------------------------------------------------------");
                        i++;
                    }
                    System.out.print("Insira o indice do elemento que deseja editar: ");
                    int index = scan.nextInt();
                    if (index >= linkedList.size()) {
                        System.out.println("Índice inválido.");
                        try {
                            input.read();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        continue;
                    }
                    System.out.print("Insira o novo valor deste elemento: ");
                    value = scan.nextLine();
                    value = scan.nextLine();
                    linkedList.set(index, value);
                    continue;

                case 3:
                    i = 0;
                    for(String item : linkedList) {
                        System.out.println("Posição: " + i + " | Valor: " + item);
                        System.out.println("-------------------------------------------------------------------");
                        i++;
                    }
                    System.out.print("Insira o indice do elemento que deseja remover: ");
                    index = scan.nextInt();
                    if (index >= linkedList.size()) {
                        System.out.println("Índice inválido.");
                        try {
                            input.read();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                        continue;
                    }
                    linkedList.remove(index);
                    continue;

                case 4:
                    System.out.print("Por favor, digite um elemento para adicionar no início da lista: ");
                    value = scan.nextLine();
                    value = scan.nextLine();
                    linkedList.addFirst(value);
                    continue;

                case 5:
                    System.out.println("Item na posição inicial da lista: " + linkedList.getFirst());
                    System.out.print("\nPor favor, insira o novo valor deste item: ");
                    value = scan.nextLine();
                    value = scan.nextLine();
                    linkedList.set(0, value);
                    continue;

                case 6:
                    System.out.println("Item na posição inicial da lista: " + linkedList.getFirst());
                    try {
                        input.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    linkedList.removeFirst();
                    continue;

                case 7:
                    System.out.print("Por favor, digite um elemento para adicionar no final da lista: ");
                    value = scan.nextLine();
                    value = scan.nextLine();
                    linkedList.addLast(value);
                    continue;

                case 8:
                    System.out.println("Item na posição final da lista: " + linkedList.getLast());
                    System.out.print("\nPor favor, insira o novo valor deste item: ");
                    value = scan.nextLine();
                    value = scan.nextLine();
                    linkedList.removeLast();
                    linkedList.addLast(value);
                    continue;

                case 9:
                    System.out.println("Item na posição final da lista: " + linkedList.getLast());
                    try {
                        input.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    linkedList.removeLast();
                    continue;

                case 10:
                    System.out.println("Primeiro elemento da lista: " + linkedList.getFirst());
                    try {
                        input.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    continue;

                case 11:
                    System.out.println("Último elemento da lista: " + linkedList.getLast());
                    try {
                        input.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    continue;

                case 12:
                    System.out.print("Insira um indice entre 0 e " + (linkedList.size() - 1) + ": ");
                    index = scan.nextInt();
                    System.out.println("O elemento neste índice é igual a: " + linkedList.get(index));
                    try {
                        input.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    continue;

                case 13:
                    Collections.sort(linkedList);
                    for (String item: linkedList) {
                        System.out.println(item);
                    }
                    try {
                        input.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    continue;

                case 14:
                    System.out.println("Total de elementos na lista: " + linkedList.size());
                    try {
                        input.read();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    continue;

                case 15:
                    break;

                default:
                    System.out.println("Opção inválida.");
                    continue;
            }
            System.out.println("Obrigado por utilizar nossos serviços.");
        }

    }
}
