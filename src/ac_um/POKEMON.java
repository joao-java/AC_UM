
package AC_UM;

public class POKEMON {
    
    private String nome;
    private String tipo;
    private int vida = 200; //hp
    private int defesa; // def
    private int ataque ; // hit
    private int level;
    
    public POKEMON(String nome, String tipo, int level) {
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        
        
        calculaAtributos();
        calculaLevel();
        
    }

    //GET Usamos get para obter informações. Esse tipo de método sempre retorna um valor.
    //SET Usamos set para definir valores. Esse tipo de método geralmente não retorna valores.
    
    public String getNome() {
        return nome;
    }public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getDefesa() {
        return defesa;
    }public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public int getAtaque() {
        return ataque ;
    }public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getLevel() {
        return level;
    }public void setLevel(int level) {
        this.level = level;
    }
    
    public int getVida(){
     return vida;
    }public void setVida(int vida){
     this.vida = vida;
    }
    
     void imprimaAtributos(){
        System.out.print("________________\nNOME: " + this.nome 
            +"\nTIPO: " + this.tipo 
            +"\nVIDA: " + this.vida
            +"\nLEVEL: " + this.level
            +"\nDEFESA: " + this.defesa
            +"\nATAQUE: " + this.ataque + "\n" 
        );
    
    }
    
     private void calculaLevel(){
         
         vida = vida + (level * 2);
         ataque = ataque + (level * 2);
         defesa = defesa + (level * 8);
     }
    
    
     void calculaAtributos(){
    
        switch(this.tipo){
            case "Fogo":
                this.ataque = 120;
                this.defesa = 47;
                this.vida = this.vida;
                break;
            
            case "Agua":
                this.ataque = 97;
                this.defesa = 80;
                this.vida = this.vida;
                break;
            
            case "Terra":
                this.ataque =  90;
                this.defesa = 99;
                this.vida = this.vida;
                break;
            
            case "Voo":
                this.ataque =  101;
                this.defesa =  89;
                this.vida = this.vida;
                break;
                
            case "Eletricidade":
                this.ataque =  139;
                this.defesa =  45;
                this.vida = this.vida;
                break;
        }
    }
 
}
