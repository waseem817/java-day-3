import java.util.Scanner;

public class FacultyDetails {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Faculty Name: ");
        String fn = scanner.nextLine();
        System.out.print("Enter Number of Papers Published: ");
        int pp = scanner.nextInt();
        System.out.print("Enter Years of Experience: ");
        int yoe = scanner.nextInt();
        System.out.print("Enter Current Salary: ");
        double salary = scanner.nextDouble();
        if(pp>=5 && yoe>=10 && salary>=50000)
        {
            double ip = 10.0; // Increment percentage
            double incrAmount = (salary * ip) / 100;// Calculate the increment
            double newSalary = salary + incrAmount; // Calculate the new salary
            String f=String.format("faculty name=%s \n current salary=%f \n Increment percentage=%f \n new salary=%f,",fn,salary,ip,newSalary);
            System.out.println(f);
        }
        else if(pp>=3 && pp<5 && yoe>=5 && yoe<10 && salary>=30000 && salary<50000)
        {
            double ip = 8.0; // Increment percentage
            double incrAmount = (salary * ip) / 100;// Calculate the increment
            double newSalary = salary + incrAmount; // Calculate the new salary
            String f=String.format("faculty name=%s \n current salary=%f \n Increment percentage=%f \n new salary=%f,",fn,salary,ip,newSalary);
            System.out.println(f);
        }
        else if(pp>=1 && pp<3 && yoe>=1 && yoe<5 && salary>=15000 && salary<30000)
        {
            double ip = 6.0; // Increment percentage
            double incrAmount = (salary * ip) / 100;// Calculate the increment
            double newSalary = salary + incrAmount; // Calculate the new salary
            String f=String.format("faculty name=%s \n current salary=%f \n Increment percentage=%f \n new salary=%f,",fn,salary,ip,newSalary);
            System.out.println(f);
        }
        else
        {
            System.out.println("you are not eligible for increment ");

        }
    }
}
