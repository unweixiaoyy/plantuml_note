package note.plantuml.jialong.com.plantuml_note;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import note.plantuml.jialong.com.plantuml_note.aidl.AIDLLoopService;
import note.plantuml.jialong.com.plantuml_note.aidl.AIDLServiceActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_main);
        Toast.makeText(this, "main", Toast.LENGTH_SHORT).show();
    }

    public void startAIDLService(View v) {
//        Intent intent = new Intent();
//        ComponentName componentName = new ComponentName(
//                "note.plantuml.jialong.com.plantuml_note", "note.plantuml.jialong.com.plantuml_note.AIDLLoopService");
//        intent.setComponent(componentName); // 使用intent的setComponent()方法，启动其他应用的组件。
//        startService(intent);
    }

    public void skip(View v) {
        startActivity(new Intent(this, AIDLServiceActivity.class));
    }


}
