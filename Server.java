import java.rmi.registry.Registry;
import java.rmi.registry.LocateRegistry;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server extends ImplTriangle{
		public Server(){}
		public static void main(String [] args){
				try{
						ImplTriangle obj=new ImplTriangle();

						Triangle stub=(Triangle) UnicastRemoteObject.exportObject(obj,0);

						Registry registry = null;
						try {
								registry = LocateRegistry.getRegistry(52365);//use any no. less than 55000
								registry.list();
								// This call will throw an exception if the registry does not already exist
						}
						catch (RemoteException e) { 
								registry = LocateRegistry.createRegistry(52365);
						}


						registry.bind("Triangle",stub);
						System.err.println("Server Ready!!");
				}catch(Exception e){
						System.err.println("Server Exception: "+e.toString());
						e.printStackTrace();
				}
		}
}
