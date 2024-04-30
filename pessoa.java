public class pessoa {
    private String nome;
    private String endereco;
    private String telefone;

    public pessoa() {

    }

    public pessoa(String nome, String endereco, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public pessoa(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }
    
    public pessoa(String nome) {
        this.nome = nome;
    }
    
    public String getnome() {
        return nome;
    }
    public void setnome(String nome) {
        this.nome = nome;
    }
    public String getendereco() {
        return endereco;
    }
    public void setendereco(String endereco) {
        this.endereco = endereco;
    }
    public String gettelefone() {
        return telefone;
    }
    public void settelefone(String telefone) {
        this.telefone = telefone;
    }

}