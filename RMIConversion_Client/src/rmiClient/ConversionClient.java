package rmiClient;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import rmiService.IConversion;

public class ConversionClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Registry registry =LocateRegistry.getRegistry("localhost",1099);
			IConversion conversionService =(IConversion) registry.lookup("ConversionService");
            double montantConverti =conversionService.convertirMontant(100.0);
            System.out.println("Montant converti :"+montantConverti);
		}catch(Exception e)
		{
			System.err.println("Erreur du client:"+e.toString());
			e.printStackTrace();
		
		
		}
	}

}
