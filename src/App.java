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
    }

        

        
}

