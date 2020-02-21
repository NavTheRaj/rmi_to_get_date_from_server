import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Triangle extends Remote{
		void getArea(double base,double height) throws RemoteException;
}
