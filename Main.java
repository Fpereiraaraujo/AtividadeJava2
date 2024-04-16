import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GameMenu.showMenu();
    }
}
    public class GameMenu {
    
        public static void showMenu() {
            Scanner scanner = new Scanner(System.in);
            int choice;
    
            do {
                System.out.println("\n----- Menu de Jogos de Consoles -----");
                System.out.println("1. Cadastrar jogo de ação (PlayStation)");
                System.out.println("2. Cadastrar jogo de aventura (Xbox)");
                System.out.println("3. Buscar jogo");
                System.out.println("4. Excluir jogo");
                System.out.println("5. Listar todos os jogos");
                System.out.println("0. Sair");
                System.out.print("Escolha uma opção: ");
                choice = scanner.nextInt();
    
                switch (choice) {
                    case 1:
                        addActionGame();
                        break;
                    case 2:
                        addAdventureGame();
                        break;
                    case 3:
                        findGame();
                        break;
                    case 4:
                        deleteGame();
                        break;
                    case 5:
                        listAllGames();
                        break;
                    case 0:
                        System.out.println("Saindo do programa...");
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        break;
                }
            } while (choice != 0);
            
            scanner.close();
        }
    
        private static void addActionGame() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o título do jogo de ação (PlayStation): ");
            String title = scanner.nextLine();
            GameManager.addGame(new ActionGame(title));
            System.out.println("Jogo cadastrado com sucesso!");
        }
    
        private static void addAdventureGame() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o título do jogo de aventura (Xbox): ");
            String title = scanner.nextLine();
            GameManager.addGame(new AdventureGame(title));
            System.out.println("Jogo cadastrado com sucesso!");
        }
    
        private static void findGame() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o título do jogo a ser buscado: ");
            String title = scanner.nextLine();
            Game game = GameManager.findGame(title);
            if (game != null) {
                System.out.println("Jogo encontrado: " + game);
            } else {
                System.out.println("Jogo não encontrado.");
            }
        }
    
        private static void deleteGame() {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite o título do jogo a ser excluído: ");
            String title = scanner.nextLine();
            GameManager.deleteGame(title);
        }
    
        private static void listAllGames() {
            System.out.println("\n----- Lista de Jogos de Consoles -----");
            GameManager.listAllGames();
        }
    }
    

