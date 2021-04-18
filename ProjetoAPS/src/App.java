import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Random;
import java.util.Scanner;

public class App {

    private static ArrayList<Lixo> listaLixo = new ArrayList<>();

    private static Pessoa pessoa = new Pessoa();

    private static void populaLista() {
        listaLixo.add(new Lixo("Garrafa de vidro", "Vidro"));
        listaLixo.add(new Lixo("Folha de caderno amassada", "Papel"));
        listaLixo.add(new Lixo("Garrafa PET", "Plastico"));
        listaLixo.add(new Lixo("Lata de refrigerante", "Metal"));
        listaLixo.add(new Lixo("Cascas de fruta", "Organico"));
        listaLixo.add(new Lixo("Lente de óculos quebrada", "Vidro"));
        listaLixo.add(new Lixo("Papelão rasgado", "Papel"));
        listaLixo.add(new Lixo("Sacola plástica", "Plastico"));
        listaLixo.add(new Lixo("Tubo de creme dental", "Metal"));
        listaLixo.add(new Lixo("Restos de alimento", "Organico"));
    }

    private static void menu() throws Exception {
        System.out.println("\nMENU:");
        System.out.println("0 - Encerra do programa");
        Thread.sleep(100);
        System.out.println("1 - Exibe este menu");
        Thread.sleep(100);
        System.out.println(
                "2 - Exibe algumas informações da lixeira em específico e alguns descartáveis que podem ser jogados nela");
        Thread.sleep(100);
        System.out.println("3 - Pega algum lixo da pilha para jogar fora");
        Thread.sleep(100);
        System.out.println("4 - Embrulha algum lixo cortante");
        Thread.sleep(100);
        System.out.println("5 - Ver pilha de lixo restante");
    }

    public static void main(String[] args) throws Exception {
        populaLista();
        int opc = 0;
        int opc2 = 0;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        LixeiraPapel lixeiraPapel = new LixeiraPapel();
        LixeiraPlastico lixeiraPlastico = new LixeiraPlastico();
        LixeiraMetal lixeiraMetal = new LixeiraMetal();
        LixeiraVidro lixeiraVidro = new LixeiraVidro();
        LixeiraOrganico lixeiraOrganico = new LixeiraOrganico();

        System.out.print("\nOlá! Esse é o programa de reciclagem da UNIP. Digite seu nome para começar: ");
        pessoa.setNome(scanner.next());

        System.out.println(String.format("Seja bem-vindo(a), %s!", pessoa.getNome()));
        Thread.sleep(500);
        System.out.println(
                "Nesse sistema de reciclagem você será responsável por jogar o lixo no lugar certo, contribuindo para a reciclagem e para o desenvolvimento sustentável do nosso planeta.");
        Thread.sleep(1000);
        System.out.println(
                "Temos um sistema de menu onde você pode sair a qualquer momento do programa ou chamar alguma funcionalidade disponível, aqui estão elas:");
        Thread.sleep(1000);
        menu();
        Thread.sleep(250);
        
        try {
            do {
                System.out.print("Escolha a opção desejada: ");
                opc = scanner.nextInt();

                switch (opc) {
                case 0:
                    break;

                case 1:
                    menu();
                    break;

                case 2:

                    System.out.println("\nESCOLHER LIXEIRA");
                    Thread.sleep(100);
                    System.out.println("0 - Cancelar");
                    Thread.sleep(100);
                    System.out.println("1 - Lixeira de Papel");
                    Thread.sleep(100);
                    System.out.println("2 - Lixeira de Plastico");
                    Thread.sleep(100);
                    System.out.println("3 - Lixeira de Metal");
                    Thread.sleep(100);
                    System.out.println("4 - Lixeira de Vidro");
                    Thread.sleep(100);
                    System.out.println("5 - Lixeira Organico");
                    Thread.sleep(100);
                    System.out.print("Escolha a opção desejada: ");
                    opc2 = scanner.nextInt();

                    System.out.println();

                    switch (opc2) {
                    case 0:
                        System.out.println("Operação cancelada");
                        break;

                    case 1:
                        lixeiraPapel.verInfo();
                        break;

                    case 2:
                        lixeiraPlastico.verInfo();
                        break;

                    case 3:
                        lixeiraMetal.verInfo();
                        break;

                    case 4:
                        lixeiraVidro.verInfo();
                        break;

                    case 5:
                        lixeiraOrganico.verInfo();
                        break;

                    default:
                        System.out.println("Escolha alguma opção válida!");
                        break;
                    }

                    System.out.println();

                    break;

                case 3:
                    int numeroRandom = random.nextInt(listaLixo.size());
                    Lixo lixoPego = listaLixo.get(numeroRandom);

                    System.out.println("\nVocê pegou " + lixoPego.getNome());
                    Thread.sleep(750);

                    System.out.println("\nESCOLHER LIXEIRA");
                    Thread.sleep(100);
                    System.out.println("0 - Cancelar");
                    Thread.sleep(100);
                    System.out.println("1 - Lixeira de Papel");
                    Thread.sleep(100);
                    System.out.println("2 - Lixeira de Plastico");
                    Thread.sleep(100);
                    System.out.println("3 - Lixeira de Metal");
                    Thread.sleep(100);
                    System.out.println("4 - Lixeira de Vidro");
                    Thread.sleep(100);
                    System.out.println("5 - Lixeira Organico");
                    Thread.sleep(100);
                    System.out.print("Escolha a opção desejada: ");
                    opc2 = scanner.nextInt();

                    System.out.println();

                    switch (opc2) {
                    case 0:
                        System.out.println("Operação cancelada");
                        break;

                    case 1:
                        pessoa.jogarLixo(lixoPego, lixeiraPapel);
                        listaLixo.remove(numeroRandom);
                        break;

                    case 2:
                        pessoa.jogarLixo(lixoPego, lixeiraPlastico);
                        listaLixo.remove(numeroRandom);
                        break;

                    case 3:
                        pessoa.jogarLixo(lixoPego, lixeiraMetal);
                        listaLixo.remove(numeroRandom);
                        break;

                    case 4:
                        pessoa.jogarLixo(lixoPego, lixeiraVidro);
                        listaLixo.remove(numeroRandom);
                        break;

                    case 5:
                        pessoa.jogarLixo(lixoPego, lixeiraOrganico);
                        listaLixo.remove(numeroRandom);
                        break;

                    default:
                        System.out.println("Escolha alguma opção válida!");
                        break;
                    }

                    System.out.println();

                    break;

                case 4:
                    System.out.println("\nEMBRULHAR LIXO CORTANTE");
                    System.out.println("0 - Cancelar");
                    System.out.println("1 - Lixeira de Vidro");
                    System.out.println("2 - Lixeira de Metal");
                    System.out.print("Escolha a opção desejada: ");
                    opc2 = scanner.nextInt();

                    switch (opc2) {
                    case 0:
                        System.out.println();
                        System.out.println("Operação cancelada");
                        System.out.println();
                        break;

                    case 1:
                        lixeiraVidro.embrulharLixo();
                        break;

                    case 2:
                        lixeiraMetal.embrulharLixo();
                        break;

                    default:
                        System.err.println("\nEscolha alguma opção válida!\n");
                        break;
                    }

                    break;

                case 5:
                    System.out.println("\n" + listaLixo.toString() + "\n");
                    break;

                default:
                    System.err.println("\nEscolha alguma opção válida!\n");
                    break;
                }

            } while (opc != 0 && listaLixo.size() > 0);
        } catch (InputMismatchException e) {
            System.err.println("\nInsira apenas dados válidos para o funcionamento correto do programa.\n");
            scanner.close();
            Thread.sleep(5000);
            return;
        } catch (NoSuchElementException e) {
            System.err.println("\nO programa teve o seu encerramento forçado.\n");
            scanner.close();
            Thread.sleep(5000);
            return;
        }

        System.out.println("\nFim do programa. Obrigado por ajudar a tornar o mundo um lugar melhor!");

        scanner.close();
        Thread.sleep(5000);
    }
}
