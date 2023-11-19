package rmiServer;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import javax.management.remote.rmi.RMIServer;

import rmiService.IConversion;

public class ConversionServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try {
	rmiService.IConversion coversionImpl=new rmiService.IConversion();
	Registry registry = LocateRegistry.createRegistry(1099);
	registry.rebind("ConversionService, coversionImpl);", registry
	System.out.println("Serveur pret!!");
	
    }catch(Exception e)
     {System.err.println("Erreur du serveur :"+e.toString());
      e.printStackTrace();
     }

}
}
