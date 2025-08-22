import java.util.Scanner;

class employSalary {
    public static void main(String[] args) {
        float basicSalary, basic, houseRent, tax, totalSalary;
        Scanner sc = new Scanner(System.in);
        System.out.println("Basic Salary :");
        basicSalary = sc.nextFloat();
        System.out.println("Basics (%) : ");
        basic = sc.nextFloat();
        System.out.println("House Rent (%) :");
        houseRent = sc.nextFloat();
        System.out.println("Tax (%) :");
        tax = sc.nextFloat();
        

        totalSalary = basicSalary + ((basicSalary + (basic + houseRent - tax)) / 100);
        System.out.println("Total Salary :" + totalSalary);

    }
}
