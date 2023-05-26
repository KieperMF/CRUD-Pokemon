
public class Treinador {
    private String name;
    private int cash;
    private int wins;
    private char sex;
    private Pokemon [] pokemon = new Pokemon[6];

    public Treinador (String n, int c, int w, char s, Pokemon[] pok){
        name = n;
        cash = c;
        wins = w;
        sex = s;
        pokemon = pok;
    }

    public String getName(){
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }

    /*
     * @return the cash
     */
    public int getCash() {
        return cash;
    }

    /*
     * @param cash the cash to set
     */
    public void setCash(int cash) {
        this.cash = cash;
    }

    /*
     * @return the wins
     */
    public int getWins() {
        return wins;
    }

    /*
     * @param wins the wins to set
     */
    public void setWins(int wins) {
        this.wins = wins;
    }

    /*
     * @return the sex
     */
    public char getSex() {
        return sex;
    }

    /*
     * @param sex the sex to set
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /*
     * @return the pokemon
     */
    public Pokemon[] getPokemon() {
        return pokemon;
    }

    /*
     * @param pokemon the pokemon to set
     */
    public void setPokemon(Pokemon[] pokemon) {
        this.pokemon = pokemon;
    }

}
