public class GameManager {
    private static ArrayList<Game> games = new ArrayList<>();

    public static void addGame(Game game) {
        games.add(game);
    }

    public static Game findGame(String title) {
        for (Game game : games) {
            if (game.getTitle().equalsIgnoreCase(title)) {
                return game;
            }
        }
        return null;
    }

    public static void deleteGame(String title) {
        Game game = findGame(title);
        if (game != null) {
            games.remove(game);
            System.out.println("Jogo removido: " + game);
        } else {
            System.out.println("Jogo não encontrado.");
        }
    }

    public static void listAllGames() {
        if (games.isEmpty()) {
            System.out.println("Nenhum jogo cadastrado.");
        } else {
            for (Game game : games) {
                System.out.println(game);
            }
        }
    }
}


