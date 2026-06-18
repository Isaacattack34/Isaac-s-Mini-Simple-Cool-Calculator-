import java.util.Scanner;
public class Calculator
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("     _____                     _      ___  ____       _   _____ _                 _        _____             _   _____       _            _       _                  __  ");
        System.out.println("    |_   _|                   ( )     |  \\/  (_)     (_) /  ___(_)               | |      /  __ \\           | | /  __ \\     | |          | |     | |              _  \\ \\ ");
        System.out.println("      | | ___  __ _  __ _  ___|/ ___  | .  . |_ _ __  _  \\ `--. _ _ __ ___  _ __ | | ___  | /  \\/ ___   ___ | | | /  \\/ __ _| | ___ _   _| | __ _| |_ ___  _ __  (_)  | |");
        System.out.println("      | |/ __|/ _` |/ _` |/ __| / __| | |\\/| | | '_ \\| |  `--. \\ | '_ ` _ \\| '_ \\| |/ _ \\ | |    / _ \\ / _ \\| | | |    / _` | |/ __| | | | |/ _` | __/ _ \\| '__|      | |");
        System.out.println("     _| |\\__ \\ (_| | (_| | (__  \\__ \\ | |  | | | | | | | /\\__/ / | | | | | | |_) | |  __/ | \\__/\\ (_) | (_) | | | \\__/\\ (_| | | (__| |_| | | (_| | || (_) | |     _   | |");
        System.out.println("     \\___/___/\\__,_|\\__,_|\\___| |___/ \\_|  |_|_|_| |_|_| \\____/|_|_| |_| |_| .__/|_|\\___|  \\____/\\___/ \\___/|_|  \\____/\\__,_|_|\\___|\\__,_|_|\\__,_|\\__\\___/|_|    (_)  | |");
        System.out.println("                                                                           | |                                                                                       /_/ ");
        System.out.println("                                                                           |_|                                                                                           ");
        
        System.out.println(" ");
        System.out.println("Type in value");
        
        double Nothin = keyboard.nextDouble();
        double a = Nothin;
        double b = Nothin;
        double c = Nothin;
        double d = Nothin;
        double e = Nothin;
        double z = 0;
        double temp = 0;
        while (true)
        {
            System.out.println("Type in another value (Type 0 to stop)");
            double y = keyboard.nextDouble();
            
            if (y == 0)
            {
                break;
            }
            
            z = (a + y);
            System.out.println("(" + a + " + " + y + ")");
            System.out.println("Added \"" + (z) + "\"");
            System.out.println(" ");
            
            z = (b - y);
            System.out.println("(" + b + " - " + y + ")");
            System.out.println("Subtracted \"" + (z) + "\"");
            System.out.println(" ");
        
            z = (c * y);
            System.out.println("(" + c + " * " + y + ")");
            System.out.println("Multiplied \"" + (z) + "\"");
            System.out.println(" ");
            
            z = (d / y);
            System.out.println("(" + d + " / " + y + ")");
            System.out.println("Divided \"" + (z) + "\"");
            System.out.println(" ");
            
            z = (e % y);
            System.out.println("(" + e + " % " + y + ")");
            System.out.println("Remainded (For fun) \"" + (z) + "\"");
            
            a = (a + y);
            b = (b - y);
            c = (c * y);
            d = (d / y);
            e = (e % y);
            
            System.out.println(" ");
            System.out.println(" ");
            System.out.println(" ");
        }
    }
}