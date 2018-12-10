// IMyAidlInterface.aidl
package note.plantuml.jialong.com.plantuml_note;
import note.plantuml.jialong.com.plantuml_note.ParcelObject4AIDL;

interface IMyAidlInterface {
    int sum(int a, int b);

    int pid();

    ParcelObject4AIDL getParcelObject4AIDL();

    void addParcelObject4AIDL(in ParcelObject4AIDL p);
}
