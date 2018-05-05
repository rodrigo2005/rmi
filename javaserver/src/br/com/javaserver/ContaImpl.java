package br.com.javaserver;


import java.rmi.RemoteException;

public class ContaImpl implements Conta {

	private double saldo;
	
	@Override
	public void depositar(Double valor) throws RemoteException {
		this.saldo += valor;		
	}

	@Override
	public void sacar(Double valor) throws RemoteException {
		this.saldo -= valor;
	}

	@Override
	public void transferir(Double valor, Conta outraConta) throws RemoteException {
				sacar(valor);
				outraConta.depositar(valor);				
	}

	@Override
	public String extrato() throws RemoteException {		
		String extrato = "Saldo Atual: "+this.saldo;
		return extrato;
	}

}
