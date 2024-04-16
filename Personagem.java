public class Personagem {
    
    public String nome;
    public String classe;
    public int nivel;



    
    public int pontosVida;
    public int pontosMana;

    
    public Personagem(String nome, String classe, int nivel, int pontosVida, int pontosMana) {
        this.nome = nome;
        this.classe = classe;
        this.nivel = nivel;
        this.pontosVida = pontosVida;
        this.pontosMana = pontosMana;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getClasse() {
        return classe;
    }
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public int getNivel() {
        return nivel;
    }
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
    public int getPontosVida() {
        return pontosVida;
    }
    public void setPontosVida(int pontosVida) {
        this.pontosVida = pontosVida;
    }
    public int getPontosMana() {
        return pontosMana;
    }
    public void setPontosMana(int pontosMana) {
        this.pontosMana = pontosMana;
    }


    // Método toString para exibir informações do personagem
    @Override
    public String toString() {
        return "Nome: " + nome + ", Classe: " + classe + ", Nível: " + nivel +
               ", Pontos de Vida: " + pontosVida + ", Pontos de Mana: " + pontosMana;
    }
    
}
