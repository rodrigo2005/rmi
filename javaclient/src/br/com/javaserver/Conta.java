package br.com.javaserver;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Conta extends Remote {
	
	void depositar(Double valor) throws RemoteException;
	
	void sacar(Double valor) throws RemoteException;
	
	void transferir(Double valor, Conta outraConta)throws RemoteException;
	
	String extrato()throws RemoteException;
	
}
