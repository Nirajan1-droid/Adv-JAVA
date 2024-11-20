/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rmmi;

 
import java.rmi.*;
import java.rmi.registry.*;
import java.util.Scanner;

public class RMIClient {

    public static void main(String[] args) {
        try {
            // Connect to the RMI registry (localhost at port 1099)
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);

            // Look up the remote object by its name in the registry
            Hello stub = (Hello) registry.lookup("HelloService");

            // Ask user for two numbers
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first number: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter second number: ");
            int num2 = scanner.nextInt();

            // Call the remote method to add the numbers
            int sum = stub.addNumbers(num1, num2);
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        } catch (Exception e) {
            System.err.println("RMI Client exception: " + e.toString());
            e.printStackTrace();
        }
    }
}

