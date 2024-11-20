/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmmi;

import java.rmi.*;
import java.rmi.registry.*;

public class RMIServer {

    public static void main(String[] args) {
        try {
            // Create an instance of the remote object
            HelloImpl obj = new HelloImpl();

            // Create and start the RMI registry on port 1099 (default)
            Registry registry = LocateRegistry.createRegistry(1099);

            // Bind the remote object to the registry
            registry.rebind("HelloService", obj);

            System.out.println("RMI Server is ready and waiting for client connections...");
        } catch (RemoteException e) {
            System.err.println("RMI Server exception: " + e.toString());
            e.printStackTrace();
        }
    }
}
