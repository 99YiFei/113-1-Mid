
import java.util.*;

public class game {
  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String[] suits={"Spades","Hearts","Diamonds","Clubs"};
        String[] ranks ={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"}; 
        //電腦與玩家的手牌      
        int com[] = new int[10];
        int plr[] = new int[10];      
        playerPart(plr);
        
        //抽牌
        //char a ='Y';
        int i = 2;
        System.out.print("Draw a card?(Y/N)");
        String x = input.next();
        char a = x.charAt(0);
         
        while(a=='Y'){
            int rank = 0;           //計算ranks的
            int colar = 0;       //suits           
            plr[i] = (int)(Math.random() * 52);
            aa(plr,i);       
            rank+=plr[i]%13-1;
            colar+=(int)plr[i]/13;
            i++;
            System.out.println("\n"+suits[colar]+":"+ranks[rank]+" ");            
            System.out.print("Draw again?(Y/N)");
            x = input.next();
            a = x.charAt(0);
           
        }
        if(a=='N'){
            
                //電腦的牌&總和
            System.out.println("\n PC's card is");
            computerPart(com);
            System.out.println("Total "+Total(com)+" points");     //comTotal是電腦的牌數大小
                //玩家的牌總和
            System.out.println("Your total points is "+Total(plr)+" points.");
                
            if(Total(com)<Total(plr) && Total(plr)<=21 && Total(com)<=21 || Total(com)>21 && Total(plr)<=21){
                System.out.println("You win.");
                }
            else if(Total(com)>Total(plr) &&Total(plr)<=21 && Total(com)<=21|| Total(plr)>21 && Total(com)<=21){
                System.out.println("You lose.");
                }
            else if(Total(plr)==Total(com) && Total(plr)<=21 && Total(com)<=21 || Total(plr)==Total(com) &&Total(plr)>21 &&Total(com)>21){
                System.out.println("Draw.");
                }
            else if(Total(plr)>21 && Total(com)>21){
                System.out.println("Both lose");
            }
            
            }
            
       
        
    }

    public static void computerPart(int[] com) {       
         //電腦
        int comSum=0;
        for(int i = 0;i<com.length;i++){
            if(i<2){
                com[i] = (int)(Math.random()*52);
                System.out.println(suit(com,i)+":"+rank(com,i)+" ");
                comSum+=aa(com,i);
            }
            else{
                if(comSum<16){
                    com[i] = (int)(Math.random()*52);
                    System.out.println(suit(com,i)+":"+rank(com,i)+" ");
                    comSum+=aa(com,i);
                }
                else{
                    break;
                }
            }
            
        }
       
    }

    public static String suit(int[] com, int i) {
         String[] suits={"Spades","Hearts","Diamonds","Clubs"};
         int colar=0;
         colar+=(int)com[i]/13;
         return suits[colar];
    }

    public static String rank(int[] com, int i) {
        String[] ranks ={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        int rank=0;
        if(com[i]%13==0){
            rank+=12;
            }
        else{
            rank+=com[i]%13-1;
            }        
        return ranks[rank];
    }
    public static int aa(int[]a, int i){
        int total=0;
        if(a[i]%13==11 || a[i]%13==12 || a[i]%13==0)
            total+=10;
        else
            total+=a[i]%13;
        return total;
    }   

    public static int Total(int[] a) {
        int sum=0;
        boolean ace = false;
        int x = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]!=0){
                if(a[i]%13==1){
                        sum+=10;
                        ace = true;
                        x++;
                }
                sum+=aa(a,i);
            }
            else
                break;
        }
        if(sum>21 && ace== true){
            sum-=(10*x);
        }
        return sum;
    }

    private static void playerPart(int[] plr) {
        String[] suits={"Spades","Hearts","Diamonds","Clubs"};
        String[] ranks ={"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};                       
        //玩家
        int plrSum=0;
        System.out.println("Your card is:");
        for(int i = 0; i<2 ; i++){
            int rank = 0;           //計算ranks的
            int colar = 0;       //suits
            plr[i] =  (int)(Math.random() * 52);
            if(plr[i]%13==11 || plr[i]%13==12 || plr[i]%13==0)
                plrSum+=10;
            else
                plrSum+=plr[i]%13;           
            if(plr[i]%13==0){
                rank+=12;
            }
            else{
                rank+=plr[i]%13-1;
            }
            colar+=(int)plr[i]/13;
            System.out.println(suits[colar]+":"+ranks[rank]+" ");
        }       
        
    }

    
}
