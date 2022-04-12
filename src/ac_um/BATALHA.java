
package AC_UM;


public class BATALHA {
    
    private int avatarVida;
    private int avatarAtaque;
    private int avatarDefesa;
    private String avatarNome;
    
    private String maquinaNome;
    private int maquinaVida;
    private int maquinaAtaque;
    private int maquinaDefesa;
    
    //construtor meu pokemon
    public void MEUPOKEMON (String nome, int vida, int defesa, int ataque){
        this.avatarVida = vida;
        this.avatarNome = nome;
        this.avatarAtaque = ataque;
        this.avatarDefesa = defesa;
    }
    
    //construtor inimigo
    public void MAQUINA(String nome, int vida, int defesa, int ataque){
        this.maquinaVida = vida;
        this.maquinaNome = nome;
        this.maquinaAtaque = ataque;
        this.maquinaDefesa = defesa;
    }
    
    public void batalhar(){
    
        System.out.println("\n==============================================\n"
                + "Se prepare para a batalha!\n"
        );
           
        int ataqueAV = avatarVida - maquinaDefesa;
        int ataqueMA = maquinaVida - avatarDefesa;
           
        for (int i = 0; i < 4; i++) {


            if(ataqueAV > maquinaDefesa){
                maquinaVida -= avatarDefesa;
                System.out.println((i+1)+"º ataque \nInimigo VIDA = "+ maquinaVida + "\n");
            }else{
                maquinaVida -=(avatarAtaque / 2);
                 System.out.println((i+1)+"º ataque. \nInimigo Vida: "+ maquinaVida);
            }

            if(maquinaAtaque > avatarDefesa){
                avatarVida -= maquinaVida;
                System.out.println("Inimigo atacou \nPokemon Vida: "+ avatarVida);
                System.out.println("\n");
            }else{
                avatarVida -=(maquinaVida / 2);
                System.out.println("Inimigo atacou \nPokemon Vida: "+ avatarVida);
                System.out.println("\n");
           }       

        }

        System.out.println("============== RESULTADO ============== "
            +"\nVida meu POKEMON:("+ avatarVida+ ")"
            +"\nVida POKEMON inimigo:("+ maquinaVida+")"
        );
        
        if(avatarVida > maquinaVida){
            System.out.println("VOCÊ GANHOU!!\n");
        } else{
            System.out.println("VOCÊ PERDEU \n"); 
        }
    }
}
