package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uo8  reason: default package */
/* loaded from: classes.dex */
public abstract class uo8 implements Parcelable {
    public static final Parcelable.Creator<uo8> CREATOR = new go8(2);
    public final int a;

    public uo8(int i) {
        this.a = i;
    }

    public abstract int hashCode();

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        if (this instanceof hya) {
            parcel.writeInt(1);
            hya hyaVar = (hya) this;
            parcel.writeInt(hyaVar.a);
            hyaVar.b.writeToParcel(parcel, i);
            ArrayList arrayList = hyaVar.c;
            parcel.writeInt(arrayList.size());
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                zp8 zp8Var = (zp8) obj;
                if (zp8Var instanceof io8) {
                    ((io8) zp8Var).writeToParcel(parcel, i);
                }
            }
        } else if (this instanceof d65) {
            parcel.writeInt(2);
            d65 d65Var = (d65) this;
            parcel.writeInt(d65Var.a);
            parcel.writeTypedList(d65Var.b);
            parcel.writeInt(d65Var.c);
        } else {
            parcel.writeInt(-1);
        }
    }
}
