import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameMenu.showMenu();
    }
}
    public class Sistema {
private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Personagem> listaPersonagens = new ArrayList<>();

    public static void executar() {
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer do scanner

            switch (opcao) {
                case 1:
                    cadastrarPersonagem();
                    break;
                case 2:
                    buscarPersonagem();
                    break;
                case 3:
                    editarPersonagem();
                    break;
                case 4:
                    excluirPersonagem();
                    break;
                case 5:
                    listarPersonagens();
                    break;
                case 6:
                    excluirTodosPersonagens();
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. Cadastrar Personagem");
        System.out.println("2. Buscar Personagem");
        System.out.println("3. Editar Personagem");
        System.out.println("4. Excluir Personagem");
        System.out.println("5. Listar Personagens");
        System.out.println("6. Excluir Todos os Personagens");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    private static void cadastrarPersonagem() {
        System.out.print("Digite o nome do personagem: ");
        String nome = scanner.nextLine();
        System.out.println("Selecione o tipo de personagem:");
        System.out.println("1. Jogador");
        System.out.println("2. Inimigo");
        System.out.println("3. NPC");
        int tipo = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer do scanner

        Personagem personagem;

        switch (tipo) {
            case 1:
                personagem = new PersonagemJogador(nome);
                break;
            case 2:
                personagem = new PersonagemInimigo(nome);
                break;
            case 3:
                personagem = new PersonagemNPC(nome);
                break;
            default:
                System.out.println("Tipo de personagem inválido.");
                return;
        }

        listaPersonagens.add(personagem);
        System.out.println("Personagem cadastrado com sucesso.");
    }

    private static void buscarPersonagem() {
        System.out.print("Digite o nome do personagem a ser buscado: ");
        String nome = scanner.nextLine();

        for (Personagem personagem : listaPersonagens) {
            if (personagem.getNome().equalsIgnoreCase(nome)) {
                System.out.println(personagem);
                return;
            }
        }

        System.out.println("Personagem não encontrado.");
    }

    private static void editarPersonagem() {
        System.out.print("Digite o nome do personagem a ser editado: ");
        String nome = scanner.nextLine();

        for (Personagem personagem : listaPersonagens) {
            if (personagem.getNome().equalsIgnoreCase(nome)) {
                System.out.println("Digite o novo nome do personagem: ");
                String novoNome = scanner.nextLine();
                personagem.setNome(novoNome);
                System.out.println("Personagem editado com sucesso.");
                return;
            }
        }

        System.out.println("Personagem não encontrado.");
    }

    private static void excluirPersonagem() {
        System.out.print("Digite o nome do personagem a ser excluído: ");
        String nome = scanner.nextLine();

        for (Personagem personagem : listaPersonagens) {
            if (personagem.getNome().equalsIgnoreCase(nome)) {
                listaPersonagens.remove(personagem);
                System.out.println("Personagem excluído com sucesso.");
                return;
            }
        }

        System.out.println("Personagem não encontrado.");
    }

    private static void listarPersonagens() {
        System.out.println("Lista de Personagens:");
        for (Personagem personagem : listaPersonagens) {
            System.out.println(personagem);
        }
    }

    private static void excluirTodosPersonagens() {
        listaPersonagens.clear();
        System.out.println("Todos os personagens foram excluídos.");
    }
    

    }