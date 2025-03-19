public class Personagem {

  private String nome;
  private int forca;
  private int vida;

  public Personagem(String nome, int forca, int vida){
    this.nome = nome;
    this.forca = forca;
    this.vida = vida;
  }

@Override
public String  toString(){
    return "Nome"  + nome + "Força" + forca + "Vida" + vida;
  }
}
