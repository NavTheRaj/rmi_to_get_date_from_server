import java.rmi.Remote;
import java.rmi.RemoteException;

public interface DateInterface extends Remote{
		void printDate() throws RemoteException;
}
