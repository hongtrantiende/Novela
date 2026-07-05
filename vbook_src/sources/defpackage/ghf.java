package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ghf  reason: default package */
/* loaded from: classes.dex */
public final class ghf implements ww9 {
    public static final Parcelable.Creator<ghf> CREATOR = new rwd(14);
    public f0e a;
    public tdf b;
    public hde c;

    public ghf(f0e f0eVar) {
        this.a = f0eVar;
        ArrayList arrayList = f0eVar.e;
        this.b = null;
        for (int i = 0; i < arrayList.size(); i++) {
            if (!TextUtils.isEmpty(((skf) arrayList.get(i)).E)) {
                this.b = new tdf(((skf) arrayList.get(i)).b, ((skf) arrayList.get(i)).E, f0eVar.F);
            }
        }
        if (this.b == null) {
            this.b = new tdf(f0eVar.F);
        }
        this.c = f0eVar.G;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.O(parcel, 1, this.a, i);
        uue.O(parcel, 2, this.b, i);
        uue.O(parcel, 3, this.c, i);
        uue.V(parcel, U);
    }
}
