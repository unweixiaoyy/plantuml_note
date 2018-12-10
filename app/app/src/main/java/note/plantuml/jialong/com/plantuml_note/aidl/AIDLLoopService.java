package note.plantuml.jialong.com.plantuml_note.aidl;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.Toast;

import note.plantuml.jialong.com.plantuml_note.IMyAidlInterface;

public class AIDLLoopService extends Service {
    public AIDLLoopService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        return mInterface;
    }

    private IBinder mInterface = new IMyAidlInterface.Stub() {
        @Override
        public int sum(int a, int b) throws RemoteException {
            Toast.makeText(AIDLLoopService.this, "当前ser进程pid：" + android.os.Process.myPid(), Toast.LENGTH_SHORT).show();
            return a + b;
        }

        @Override
        public int pid() throws RemoteException {
            Toast.makeText(AIDLLoopService.this, "当前ser进程pid：" + android.os.Process.myPid(), Toast.LENGTH_SHORT).show();
            return android.os.Process.myPid();
        }

    };


}
