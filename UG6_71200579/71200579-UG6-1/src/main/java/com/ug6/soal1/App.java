package com.ug6.soal1;
import java.util.Scanner;

public class App {
    public static void main (String[] args) {
        Scanner inputan = new Scanner(System.in);
        System.out.println("Produce Your Phone");
        System.out.println("");
        System.out.println(("Pick Company Code"));
        System.out.println("1. XM\n2. SG\n3. AP\n4. RM\n5. OP\n6. VV");
        System.out.print("Your choice (1/2/..): ");
        inputan.nextLine();
        System.out.print("Phone Name: ");
        inputan.nextLine();
        System.out.println("Configure android level now?");
        System.out.print("Yes (y) or No (n): ");
        inputan.nextLine();
        System.out.println("Pick Your Android level");
        System.out.println("1. Lollipop\n2. Marshmallow\n3. Nougat\n4. Oreo\n5. Pie\n6. 10 Q\n7. Red Velvet Cake\n8. Snow Cone\n9. Tiramisu");
        System.out.print("Your choice (1/2/..): ");
        inputan.nextLine();
        System.out.println("Generating Phone Code");
        System.out.println("Please wait a moment");
        System.out.println("Phone cpde: XMO07");
        System.out.println("Add specification to phone?");
        System.out.print("Yes (y) or No (n): ");
        inputan.nextLine();
        System.out.print("RAM Capacity: ");
        inputan.nextLine();
        System.out.print("ROM Capacity: ");
        inputan.nextLine();
        System.out.print("Screen Size (Inch): ");
        inputan.nextLine();
        System.out.print("Camera Resolution: ");
        inputan.nextLine();
        System.out.println("Begin to Start");
        System.out.print("How much production capacity that can be produce: ");
        inputan.nextLine();
        System.out.println("Check Specification Requirement");
        System.out.println("Starting with status false");
        System.out.println("Finish checking with status true");
        System.out.println("Starting to Production");
        System.out.println("Do you want to add production rate (faster production higher cost)");
        System.out.print("Yes (y) or No (n): ");
        inputan.nextLine();
        System.out.print("Production rate (0.1 - 2.0): ");
        inputan.nextLine();
        System.out.println("Congratulation");
        System.out.println("Begin to produce Phone Redmi Note 11");
        System.out.println("With code: XMO07");
        System.out.println("Production Date: 2022-03-17");
        System.out.println("Production Due Date: 2022-05-31");
        System.out.println("Days Before Due Date = 75 Days");
        System.out.println("Calculation Production Cost: Rp 7500000");
    }
}

