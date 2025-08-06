public class Guerreiro  extends Personagem{

  public Guerreiro(String nome, int forca, int vida, int defesa, int furia, int ataque){
    super(nome,forca,vida);
    this.defesa = defesa;
    this.furia = furia;
    this.ataque = ataque;
  }
  private int defesa;
  private int furia;
  private int ataque;


  public int getDefesa() {
    return defesa;
  }
  public void setDefesa(int defesa) {
    this.defesa = defesa + 10 + (ataque % 3);
  }
  public int getFuria() {
    return furia;
  }
  public void setFuria(int furia) {
    this.furia = 3;
  }
  public int getAtaque() {
    return ataque;
  }
  public void setAtaque(int ataque) {
    this.ataque = ataque + super.getForca() + furia;
  }
  @Override
  public String toString() {
    return super.toString() +  "Guerreiro [defesa=" + defesa + ", furia=" + furia + ", ataque=" + ataque + "]";
  }
}
