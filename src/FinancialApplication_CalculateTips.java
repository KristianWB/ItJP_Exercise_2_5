import java.util.Scanner;

public class FinancialApplication_CalculateTips {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Task definition: Our task is to code a program that calculates the gratuity and total out of the values for subtotal and the gratuityrate, and write these the with 2 decimals on screen, which we will do in 4 steps
        // 1. Request values for subtotal and the gratuityrate from the user
        // 2. Calculate the unargumented values for total and gratuity
        // 3. Argument the unargumented values for total and gratuity into numbers with 2 decimals
        // 4. Print out the argumented values for total and gratuity

        // 1. Request the subtotal and the gratuity rate
        System.out.print("What is the subtotal: ");
        double subtotal = input.nextDouble();
        System.out.print("What is the gratuity rate in %: ");
        double gratuityRate = input.nextDouble();

        // 2. Calculate the unargumented total and gratuity
        double unargumentedGratuity = subtotal * (gratuityRate / 100);
        double unargumentedTotal = subtotal + unargumentedGratuity;

        // 3. Convert the unargumented values for total and gratuity into the argumented forms with 2 decimals

        //Conversion of unargumented gratuity into the argumented form, will be done in 3 steps, a, b and c:
        //Step a: Find predecimalgratuity
        //Step b: Find postdecimalgratuity
        //Step c: Assemble predecimalgratuity with postdecimal gratuity into the argumented gratuity with 2 decimals

        //Step a - PredecimalGratuity
        double preDecimalGratuity = (int) unargumentedGratuity; //only move - Here we eliminate all digits from the unargumented gratuity value

        //Step b - PostDecimalGratuity
        double gra1 = unargumentedGratuity % 1;     //First move - Here we seperate out the decimals from the whole number
        double gra2 = (gra1 + 0.01) * 100;                   //Second move - Here we move the first 2 digits forward past the decimal line
        double gra3 = (int) gra2;                    //Third move- Here we eliminate all unwanted digits past the 2 wanted cifers
        double postDecimalGratuity = gra3 / 100;    //Forth and last move - Here we move the, isolated, digits back, past the decimal line

        //Step c - Assembled argumented gratuity with 2 digits
        double argumentedGratuity = preDecimalGratuity + postDecimalGratuity;

        //Conversion of the unargumented value for total into the argumented form, will be done in 3 steps, a, b and c.
        //Step a: Find preDecimalTotal
        //Step b: Find postDecimalTotal
        //Step c: Assemble the preDecimalTotal and the postDecimalTotal into the final argumented total with 2 decimals.

        //a: Find preDecimalTotal
        double preDecimalTotal = (int) unargumentedTotal; //First and only move - Here we eliminate all digits from the unargumented total value

        //b: Find postDecimalTotal
        double tot1 = unargumentedTotal % 1;        //First move - Here we seperate out the decimals from the whole number
        double tot2 = (tot1 + 0.01) * 100;                   //Second move - Here we move the first 2 digits forward past the decimal line
        double tot3 = (int) tot2;                    //Third move - Here we eliminate the unwanted digits past the 2 wanted cifers
        double postDecimalTotal = tot3 / 100;       //Forth and last move - Here i move the isolated 2 digits back past the decimal line and the postDecimalTotal operation is complete

        //c: Assemble the preDecimalTotal and the postDecimalTotal into the final argumented form with 2 decimals
        double argumentedTotal = preDecimalTotal + postDecimalTotal;    //First and only move - Here we assemble the pre and post elements into the complete total value

        //4. Print the argumented values for gratuity and total to screen
        System.out.println("The gratuity is: " + argumentedGratuity);
        System.out.println("The Total is: " + argumentedTotal);

    }
}