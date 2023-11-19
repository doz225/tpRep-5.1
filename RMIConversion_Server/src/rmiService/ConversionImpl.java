package rmiService;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

@SuppressWarnings("serial")
public class ConversionImpl extends UnicastRemoteObject implements IConversion {
protected ConversionImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

public double convertirMontant(double mt) throws RemoteException
{return mt*3.3;
}}