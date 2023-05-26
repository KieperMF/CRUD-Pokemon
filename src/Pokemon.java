


public class Pokemon {
    private String nome;
    private String tipo;
    private  int vidaMaxima;
    private int manaMaxima;
    private Habilidade[] habilidade = new Habilidade[4];

    public Pokemon(String n, String t, int vM, int mM, Habilidade[] hab ){
        nome = n;
        tipo = t;
        vidaMaxima = vM;
        manaMaxima = mM;
        habilidade = hab;
    }

    /*
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /*
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /*
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /*
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /*
     * @return the vidaMaxima
     */
    public int getVidaMaxima() {
        return vidaMaxima;
    }

    /*
     * @param vidaMaxima the vidaMaxima to set
     */
    public void setVidaMaxima(int vidaMaxima) {
        this.vidaMaxima = vidaMaxima;
    }

    /*
     * @return the manaMaxima
     */
    public int getManaMaxima() {
        return manaMaxima;
    }

    /*
     * @param manaMaxima the manaMaxima to set
     */
    public void setManaMaxima(int manaMaxima) {
        this.manaMaxima = manaMaxima;
    }

    /*
     * @return the habilidade
     */
    public Habilidade[] getHabilidade() {
        return habilidade;
    }

    /*
     * @param habilidade the habilidade to set
     */
    public void setHabilidade(Habilidade[] habilidade) {
        this.habilidade = habilidade;
    }


}