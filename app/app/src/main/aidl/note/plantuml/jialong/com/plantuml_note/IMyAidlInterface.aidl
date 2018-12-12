// IMyAidlInterface.aidl
package note.plantuml.jialong.com.plantuml_note;
import note.plantuml.jialong.com.plantuml_note.IRemoteAidlInterface;

interface IMyAidlInterface {
    int sum(int a, int b);

    int pid();

    void readIRemoteAidlInterface(in IRemoteAidlInterface ai);

    IRemoteAidlInterface getIRemoteAidlInterface();
}
