import java.rmi.*;
import java.rmi.registry.*;

public class Server{
		public static void main(String [] args){
				try{

						DateInterface stub=new ImplDate();
						
						LocateRegistry.createRegistry(52360);

					  String registryUrl=("rmi://localhost:52360"+"/date");
						Naming.rebind(registryUrl,stub);
						System.err.println("Server Ready!!");
				}catch(Exception e){
						System.err.println("Server Exception: "+e.toString());
						e.printStackTrace();
				}
		}
}
