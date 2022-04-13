
package AC_UM;


public class BATALHA {
    
    private int avatarVida;
    private int avatarAtaque;
    private int avatarDefesa;
    private int avatarLevel;
    private String avatarNome;
    
    private String maquinaNome;
    private int maquinaVida;
    private int maquinaAtaque;
    private int maquinaDefesa;
    private int maquinaLevel;
    
    //construtor meu pokemon
    public void MEUPOKEMON (String nome, int vida, int defesa, int ataque, int level){
        this.avatarVida = vida;
        this.avatarNome = nome;
        this.avatarAtaque = ataque;
        this.avatarDefesa = defesa;
        this.avatarLevel = level;
    }
    
    //construtor inimigo
    public void MAQUINA(String nome, int vida, int defesa, int ataque, int level){
        this.maquinaVida = vida;
        this.maquinaNome = nome;
        this.maquinaAtaque = ataque;
        this.maquinaDefesa = defesa;
        this.maquinaLevel = level;
    }
    
    public void batalhar(){
    
        System.out.println("\n==============================================\n"
                + "Se prepare para a batalha!\n"
        );
        
        
        int defesaAV = avatarDefesa;
        int defesaMA = maquinaDefesa;
        
        
        for (int i = 0; i < avatarVida && i < maquinaVida; i++) {


            if(avatarLevel > maquinaLevel){
                maquinaVida = maquinaVida-(avatarAtaque-defesaMA);
                System.out.println((i+1)+"º ataque "+ avatarNome
                        + "\nVida " + maquinaNome + ": "+ maquinaVida + "\n");
            }else{
                avatarVida = avatarVida-(maquinaAtaque-defesaAV);
                 System.out.println((i+1)+"º ataque "+ avatarNome
                         + "\nVida "+ maquinaNome +": "+ maquinaVida +"\n");
            }

            
            if(avatarLevel > maquinaLevel){
                avatarVida = avatarVida-(maquinaAtaque-defesaAV);
                System.out.println((i+1)+"º ataque "+ maquinaNome 
                        +"\nVida: "+ avatarNome +": "+ avatarVida +"\n");
            }else{
                maquinaVida =maquinaVida-(avatarAtaque-defesaMA);
                System.out.println((i+1)+"º ataque "+ maquinaNome
                        +"\nVida: "+ avatarNome +": "+ avatarVida +"\n");
           }     
        }

        if(avatarVida < 0 ){
            System.out.println("============== RESULTADO ============== "
                +"\nVida "+avatarNome+":(0) MORTO!"
                +"\nVida "+ maquinaNome+":("+ maquinaVida+")"
            );
        }else if(maquinaVida < 0){
            System.out.println("============== RESULTADO ============== "
                +"\nVida "+ avatarNome +":("+ avatarVida +")"
                +"\nVida "+ maquinaNome +":(0) MORTO!!"
            );
        }else{
            System.out.println("============== RESULTADO ============== "
                +"\nVida meu POKEMON:("+ avatarVida +")"
                +"\nVida POKEMON inimigo:("+ maquinaVida +")"
            );
        }
        
        
        if(avatarVida > maquinaVida){
            System.out.println("VOCÊ GANHOU!!\n");
        } else{
            System.out.println("VOCÊ PERDEU \n"); 
        }
    }
}
