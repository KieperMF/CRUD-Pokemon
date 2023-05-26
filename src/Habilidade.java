

public class Habilidade {
    String nome;
    private String descricao;
    private String tipo;
    private int dano;
    private int gastoDeMana;

    public Habilidade(String n,String desc, String t,int d,int gM){
        nome = n;
        descricao = desc;
        tipo = t;
        dano = d;
        gastoDeMana = gM;
    }

    //Mostrar nome
    public String GetNome(){
        return nome;
    }

    // Alterar nome
    public void SetNome (String n){
        nome = n;
    }

    public String GetDescricao(){
        return descricao ;
    }

    public void Setdescricao (String desc){
        descricao = desc;
    }

    public String GetTipo(){
        return tipo ;
    }

    public void SetTipo (String t){
        tipo = t;
    }

    public int GetDano(){
        return dano ;
    }

    public void SetDano (int d){
        dano = d;
    }

    public int GetGastoDeMana(){
        return gastoDeMana ;
    }

    public void SetGastoDeMana(int gM){
        dano = gM;
    }
}