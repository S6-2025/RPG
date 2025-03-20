public class Personagem {

  private String nome;
  private int forca;
  private int vida;

  public Personagem(String nome, int forca, int vida) {
    this.nome = nome;
    this.forca = forca;
    this.vida = vida;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getForca() {
    return forca;
  }

  public void setForca(int forca) {
    this.forca = forca;
  }

  public int getVida() {
    return vida;
  }

  public void setVida(int vida) {
    this.vida = vida;
  }

  @Override
  public String toString() {
    return "Nome" + nome + "Força" + forca + "Vida" + vida;
  }
}
