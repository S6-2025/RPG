import java.util.ArrayList;

class Mago extends Personagem{
    private int mana;
    private ArrayList<Magia> magias;

    public Mago(String nome, int forca, int vida, int mana, ArrayList<Magia> magias){
        super(nome, forca, vida);
        this.mana = mana;
        this.magias = magias;
    }

    public int getMana(){
        return mana;
    }
    
    public void setMana(int mana){
        this.mana = mana;
    }

    public ArrayList<Magia> getMagias(){
        return this.magias;
    }

    public void addMagia(Magia magia){
        this.magias.add(magia);
    }

    @Override
    public String toString() {
        String listaMagias = "";
        for(Magia m : magias){
            listaMagias += m.toString();
        }
        return super.toString() + "\nMana: " + getMana() + "\n" + listaMagias;
    }

}