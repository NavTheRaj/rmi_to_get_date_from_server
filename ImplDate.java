import java.util.Date;
import java.rmi.*;
import java.rmi.server.*;

public class ImplDate extends UnicastRemoteObject implements DateInterface{

		ImplDate() throws RemoteException{super();}
		public void printDate() throws RemoteException{
		Date date=new Date();
		System.out.println("Required date is->"+date.toString());		
		}

}
