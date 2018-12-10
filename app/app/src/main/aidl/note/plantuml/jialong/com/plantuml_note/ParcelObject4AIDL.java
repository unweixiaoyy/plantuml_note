package note.plantuml.jialong.com.plantuml_note;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelObject4AIDL implements Parcelable {

    public int id;
    public String name;

    public ParcelObject4AIDL(int id, String name){
        this.id = id;
        this.name = name;
    }

    protected ParcelObject4AIDL(Parcel in) {
        id=in.readInt();
        name=in.readString();
    }

    public static final Creator<ParcelObject4AIDL> CREATOR = new Creator<ParcelObject4AIDL>() {
        @Override
        public ParcelObject4AIDL createFromParcel(Parcel in) {
            return new ParcelObject4AIDL(in);
        }

        @Override
        public ParcelObject4AIDL[] newArray(int size) {
            return new ParcelObject4AIDL[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(id);
        dest.writeString(name);
    }
}
