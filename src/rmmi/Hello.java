/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rmmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

// Remote interface
public interface Hello extends Remote {
    // Existing method
    String sayHello() throws RemoteException;

    // New method to add two numbers
    int addNumbers(int a, int b) throws RemoteException;
}
