import java.rmi.*; 

public class Client {  
		private Client() {}  
		public static void main(String[] args) {  
				try {  
						// Getting the registry 
						
						String registryUrl=("rmi://localhost:52360"+"/date");
						// Looking up the registry for the remote object 
						DateInterface stub = (DateInterface)Naming.lookup(registryUrl); 

						// Calling the remote method using the obtained object 
						stub.printDate(); 

						// System.out.println("Remote method invoked"); 
				} catch (Exception e) {
						System.err.println("Client exception: " + e.toString()); 
						e.printStackTrace(); 
				} 
		} 
}
