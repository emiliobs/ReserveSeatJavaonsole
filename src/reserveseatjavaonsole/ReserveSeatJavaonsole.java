package reserveseatjavaonsole;

import java.util.Scanner;

/**
 *
 * @author Emilio
 */
public class ReserveSeatJavaonsole
{

    public static void main(String[] args)
    {
        char seats[][] = new char[10][10];
        boolean flag = false;
        Scanner keyboad = new Scanner(System.in);
        int row, seat;
        String answer;
        String seepMapSeats;

        for (int f = 0; f < seats.length; f++)
        {
            for (int c = 0; c < seats.length; c++)
            {
                seats[f][c] = 'L';
            }
        }

        System.out.println("----------:  WELCOME TO THE RESERVATION SEAT  SISTEM  :----------");

        while (flag != true)
        {
            
            System.out.println("");
            System.out.print("Do you want to see the available seats?:  Enter Y - (for Yes) or  N -  (for not any  words): ");
            seepMapSeats = keyboad.next();
            
            if (seepMapSeats.equalsIgnoreCase("Y"))
            {
                System.out.println("");
                DrawMap(seats);
            }

            System.out.println("");
            System.out.println("Inser Row and Seat  to Reserver.");
            System.out.print("Row (between 0 and 9): ");
            row = keyboad.nextInt();

            System.out.print("Seat (between 0 and 9): ");
            seat = keyboad.nextInt();

            if (seats[row][seat] == 'L')
            {
                seats[row][seat] = 'x';
                System.out.println("The Seat was reserved correctly.");

                System.out.println("");
            }
            else
            {
                System.out.println("The seats are occupied please choose another.");
            }

            System.out.print("Do You want to finalize the resevation: Enter Y - (for Yes) or  N -  (for not): ");
            answer = keyboad.next();

            if (answer.equalsIgnoreCase("Y"))
            {
                flag = true;
            }

        }

    }

    public static void DrawMap(char seats[][])
    {
        for (int f = 0; f < seats.length; f++)
        {
            System.out.print("Fila:" + f + " ");
            for (int c = 0; c < seats.length; c++)
            {
                System.out.print("Seat:" + c + " ");

                System.out.print("[" + seats[f][c] + "]");
            }
            System.out.println("");
        }
    }

}
