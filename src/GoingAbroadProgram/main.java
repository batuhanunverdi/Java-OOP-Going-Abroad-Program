package GoingAbroadProgram;

public class main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Welcome to the Sabiha Gökçen Airport");
        String conditions = "Rule of Go Abroad\n"
                            +"You musn't have any politicial prohibition\n"
                            +"You must deposit your fee\n"
                            +"You must have a visa where you want to go ";
        String message = "You must meet all the conditions";

        while(true)
        {
            System.out.println("-----------------");
            System.out.println(conditions);

            Passenger passenger = new Passenger();
            System.out.println("Fee is Checking...");
            Thread.sleep(3000);
            if(passenger.abroadfeecheck()==false)
            {
                System.out.println(message);
                continue;
            }
            System.out.println("Politicial Prohibition is Checking...");
            Thread.sleep(3000);
            if(passenger.politicalprohibitioncheck()==false)
            {
                System.out.println(message);
                continue;
            }
            System.out.println("Visa is Checking...");
            Thread.sleep(3000);
            if(passenger.visastatuscheck()==false)
            {
                System.out.println(message);
                continue;
            }
            System.out.println("Your transactions have been completed.");
            break;
        }
    }
}
