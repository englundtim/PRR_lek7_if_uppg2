import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Uppgift a)");
        int litetTal=10;
        int stortTal=1000;

        if(litetTal<1000)
        {
            //int stortTal=1000;
            System.out.println(litetTal +"är mindre än"+stortTal);
        }
        else
        {
            System.out.println(litetTal +" är mindre än "+stortTal);
        }
            System.out.println("litetTal="+litetTal+" stortTal="+stortTal);

        //Detta funkar inte då int stortTal bara finns i första if-satsen och inte i resten
        //för att få det att funka måste skriva den utanför fiskmåsarna t.ex på line 5 som jag gjort
        System.out.println("Uppgift b+c)");
        int tal1=10;
        int tal2=0;

        if(tal1<tal2){
            System.out.println(tal2+" är större än "+tal1);
        }
        else if(tal2<tal1){
            System.out.println(tal2+" är mindre än "+tal1);
        }

        System.out.println("Uppgift d)");
        System.out.println("Hur mycket är klockan, avrunda till heltal?");
        int klockan = in.nextInt();
        if(klockan>7 && klockan<12){
            System.out.println("Dags att gå upp");
        }
        else if(klockan==12){
            System.out.println("Dags att äta");
        }
        else if(klockan>23 || klockan<4){
            System.out.println("Dags att gå och lägga sig");
        }

        System.out.println("Uppgift e)");
        System.out.println("Du går runt en kväll på sveavägen med dina kompisar, ni ser en klubb lite längre fram. Ni tar er emot den, går fram till dörrvakten. Han är rätt söt men det är inte viktigt. Han ställer två frågor");
        System.out.println("Hur gammal är du?");
        int ålder = in.nextInt();
        System.out.println("Är du medlem? true/false");
        boolean medlem = in.nextBoolean();
        
        if(ålder>17 || medlem==true){
            System.out.println("Välkommen in");
        }
        else{
            System.out.println("Stick här ifrån grabben");
        }
        
        System.out.println("uppgift f)");
        System.out.println("Användarnamn");
        String user = in.nextLine();
        System.out.println("Lösenord");
        String password = in.nextLine();

        if(user=="root" || password=="passwd"){
            System.out.println("Dis maj haus, entray pläjse");
        }
        else{
            System.out.println("Nuh uh du får inte komma in :)");
        }
        
    }


        

        
}

