class Magia{
    private String nome;
    private int forcaMagica;
    private int custo;

    public String getNome() {
        return nome;
    }
    public int getCusto() {
        return custo;
    }
    public int getForcaMagica() {
        return forcaMagica;
    }
    @Override
    public String toString() {
        return String.format("Nome da magia: %s\nPoder Mágico: %d\nCusto: ", getNome(), getForcaMagica(), getCusto());
    }
}