package GoingAbroadProgram;

import java.util.Scanner;

public class Passenger implements  IAbroad{
    private int fee;
    private boolean politicalprohibition;
    private boolean visastatus;

    public Passenger()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The fee you deposit: ");
        this.fee = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Do you have any political prohibition ?(Yes or "
                           + "No)");
        String answer = scanner.nextLine();
        if(answer.equals("Yes"))
        {
            this.politicalprohibition = true;

        }
        else
        {
            this.politicalprohibition = false;
        }
        System.out.println("Do you have Visa? (Yes or No)");
        String answer2 = scanner.nextLine();
        if(answer2.equals("Yes"))
        {
            this.visastatus = true;
        }
        else
        {
            this.visastatus = false;
        }

    }

    @Override
    public boolean abroadfeecheck() {
        if(this.fee<15)
        {
            System.out.println("Not enough to go abroad");
            return false;
        }
        else
        {
            System.out.println("Abroad Fee is OK");
            return true;
        }

    }

    @Override
    public boolean politicalprohibitioncheck() {
        if(this.politicalprohibition)
        {
            System.out.println("You have political prohibition. You cant Go "
                               + "Abroad");
            return false;
        }
        else
        {
            System.out.println("You dont have any political prohibition.");
            return true;
        }

    }

    @Override
    public boolean visastatuscheck() {
        if(this.visastatus)
        {
            System.out.println("Your visa is OK");
            return true;

        }
        else
        {
            System.out.println("You don't have a visa where you want to go ");
            return false;
        }


    }
}
