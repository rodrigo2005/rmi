package br.com.javaserver;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException, MalformedURLException, NotBoundException {
		
		Conta conta = (Conta) Naming.lookup("rmi://localhost:1099/conta");
		
		conta.depositar(190.0);
		conta.sacar(20.0);
				
		System.out.println(conta.extrato());
	
	}

}
