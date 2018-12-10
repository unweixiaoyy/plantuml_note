package note.plantuml.jialong.com.plantuml_note.aidl;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import note.plantuml.jialong.com.plantuml_note.IMyAidlInterface;
import note.plantuml.jialong.com.plantuml_note.R;

public class AIDLServiceActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aidlservice);
    }

    IMyAidlInterface mRemoteService = null;

    boolean isBind = false;

    private ServiceConnection serviceConnection = new ServiceConnection() {

        @Override
        public void onServiceConnected(ComponentName name, IBinder service) {
            mRemoteService = IMyAidlInterface.Stub.asInterface(service);
            Toast.makeText(AIDLServiceActivity.this, "onServiceConnected:", Toast.LENGTH_SHORT).show();
        }

        @Override
        public void onServiceDisconnected(ComponentName name) {
            mRemoteService = null;
            Toast.makeText(AIDLServiceActivity.this, "onServiceDisconnected:", Toast.LENGTH_SHORT).show();
        }
    };


    public void bind(View view) {
        isBind = true;
        boolean result = bindService(new Intent(this, AIDLLoopService.class), serviceConnection, Context.BIND_AUTO_CREATE);
        Toast.makeText(AIDLServiceActivity.this, "bind:" + result, Toast.LENGTH_SHORT).show();
    }


    public void unbind(View view) {
        toast("unbind:" + isBind);
        if (!isBind) {
            return;
        }
        isBind = false;
        unbindService(serviceConnection);
    }


    public void kill(View view) {
        try {
            android.os.Process.killProcess(mRemoteService.pid());
            toast("kill_success");
        } catch (RemoteException e) {
            toast("kill_failure");
        }
    }


    public void sumFun(View view) {
        try {
            toast("1+2=" + mRemoteService.sum(1, 2));
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    public void toast(String string) {
        Toast.makeText(AIDLServiceActivity.this, string, Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unbind(null);
    }

}
