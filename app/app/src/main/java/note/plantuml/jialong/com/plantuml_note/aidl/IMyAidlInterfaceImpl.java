package note.plantuml.jialong.com.plantuml_note.aidl;

import android.os.RemoteException;

import note.plantuml.jialong.com.plantuml_note.IMyAidlInterface;
import note.plantuml.jialong.com.plantuml_note.IRemoteAidlInterface;

public class IMyAidlInterfaceImpl extends IMyAidlInterface.Stub {
    @Override
    public int sum(int a, int b) throws RemoteException {
        return a+b;
    }

    @Override
    public int pid() throws RemoteException {
        return android.os.Process.myPid();
    }

    @Override
    public void readIRemoteAidlInterface(IRemoteAidlInterface ai) throws RemoteException {

    }

    @Override
    public IRemoteAidlInterface getIRemoteAidlInterface() throws RemoteException {
        return null;
    }
}
