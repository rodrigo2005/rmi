package br.com.javaserver;

import java.rmi.AlreadyBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;



public class Main {

	public static void main(String[] args) throws RemoteException, AlreadyBoundException {
		
		Conta conta = new ContaImpl();
		
		Conta contaStub = (Conta) UnicastRemoteObject.exportObject(conta,0);

		Registry registry = LocateRegistry.createRegistry(1099);
		registry.bind("conta", contaStub);
		
		System.out.println("Aguardando conexões...");
	
	}

}
