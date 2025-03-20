
import java.util.ArrayList;
public class Bardo extends Personagem{
    
    private int inspiracao;
    private ArrayList<Magia> magia = new ArrayList<>();

    public Bardo(String nome, int forca, int vida, int inspiracao, ArrayList<Magia> magia){
        super(nome,forca,vida);
        this.inspiracao = inspiracao;
        this.magia = magia;
    }

    public int getInspiracao() {
        return inspiracao;
    }

    public void setInspiracao(int inspiracao) {
        this.inspiracao = inspiracao;
    }

    

    @Override
    public String toString(){
        return super.toString() + "\ninspiração: " + inspiracao;
    }
}
