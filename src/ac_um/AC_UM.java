
package AC_UM;

import java.util.Scanner;


public class AC_UM {

    public static void main(String[] args) {
         
         
        int escolha = 0;
        int opcao = 0;
        Scanner scan = new Scanner(System.in);
     
        POKEMON Avatar = null;
     
     
    
        System.out.print("Escolha um pokemon:\n"
                + "(1) Pikachu\n"
                + "(2) Charizard\n"
                + "(3) Squirtle\n"
                + "(4) Bulbasaur\n"
                + "(5) Pidgeot\n"
                + "Digite aqui: "
        );
        
        escolha = scan.nextInt();
         
        switch(escolha){
            case 1: POKEMON Pikachu = new POKEMON("Pikachu", "Eletricida", 11);
            Avatar = Pikachu; 
            break;
            
            case 2: POKEMON Charizard = new POKEMON("Charizard", "Fogo", 13);
            Avatar = Charizard;
            break;
            
            case 3:  POKEMON Squirtle = new POKEMON("Squirtle", "Agua", 16);
            Avatar = Squirtle;
            break;
            
            case 4:  POKEMON Bulbasaur = new POKEMON("Bulbasaur", "Planta", 16);
            Avatar = Bulbasaur;
            break;
            
            case 5:  POKEMON Pidgeot = new POKEMON("Pidgeot", "Voo", 16);
            Avatar = Pidgeot;
            break;
            
             
         }
         
    POKEMON maquina_1 = new POKEMON("MaquinaP", "Eletricidade", 10);
    POKEMON maquina_2 = new POKEMON("Magmar", "Fogo", 10);
        
       
    
    BATALHA batalha = new BATALHA();
    System.out.print("\nSEU POKEMON:\n");
    Avatar.imprimaAtributos();
    System.out.print("\nPOKEMON INIMIGO:\n");
    maquina_1.imprimaAtributos();
        
    //usando o metodo
    batalha.MEUPOKEMON(Avatar.getNome(), 
            (int)Avatar.getVida(), 
            (int)Avatar.getAtaque(),
            (int)Avatar.getDefesa(),
            (int)Avatar.getLevel()
    );
    
    //usando o metodo
    batalha.MAQUINA(maquina_1.getNome(),
            (int)maquina_1.getVida(), 
            (int)maquina_1.getAtaque(),
            (int)maquina_1.getDefesa(),
            (int)maquina_1.getLevel()
    );
    //usando o metodo 
    batalha.batalhar();
    
    System.out.println("JOGAR MAIS??"
            +"\n1-Sim"
            +"\n2-Não"
    );
    
    // segundo ROAD  
    escolha = scan.nextInt();
    switch(escolha){
        case 1:
            
            System.out.println("Vamos para mais um round!!\n");
            Avatar.setLevel(4);
            
            //meu pokemon
            System.out.println("Seu pokemon: ");
            Avatar.imprimaAtributos();
            //pokemon inimigo 
            System.out.println("Pokemon inimigo: ");
            maquina_2.imprimaAtributos();
        
            batalha.MEUPOKEMON(Avatar.getNome(), 
                (int)Avatar.getVida(), 
                (int)Avatar.getAtaque(),
                (int)Avatar.getDefesa(),
                (int)Avatar.getLevel()
            );

            batalha.MAQUINA(maquina_2.getNome(),
                (int)maquina_2.getVida(), 
                (int)maquina_2.getVida(),
                (int)maquina_2.getDefesa(),
                (int)maquina_2.getLevel()
            );

            batalha.batalhar();
            break;
            case 2: System.out.println("ATA A PROXIMA ");
        }
    }
    
}
