public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Uppgift a)");
        int litetTal=10;

        if(litetTal<1000)
        {
            int stortTal=1000;
            System.out.println(litetTal +"är mindre än"+stortTal);
        }
        else
        {
            System.out.println(litetTal +" är mindre än "+stortTal);
        }
            System.out.println("litetTal="+litetTal+" stortTal="+stortTal);

        System.out.println("Uppgift b)");
        int tal1=10;
        int tal2=20;

        if(tal1<tal2){
            System.out.println(tal2+" är större än "+tal1);

        }
    }

        //Detta funkar inte då int stortTal bara finns i första if-satsen och inte i resten
        //för att få det att funka måste skriva den utanför fiskmåsarna t.ex på line 5

        
}

