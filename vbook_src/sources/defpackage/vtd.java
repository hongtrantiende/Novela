package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vtd  reason: default package */
/* loaded from: classes.dex */
public abstract class vtd extends ptd {
    @Override // defpackage.ptd
    public final boolean a(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        return false;
                    }
                    Parcelable.Creator creator = Bundle.CREATOR;
                    qtd.b(parcel);
                    b((Bundle) qtd.a(parcel));
                    return true;
                }
                Parcelable.Creator creator2 = Bundle.CREATOR;
                qtd.b(parcel);
                d((Bundle) qtd.a(parcel));
                return true;
            }
            Parcelable.Creator creator3 = Bundle.CREATOR;
            qtd.b(parcel);
            c((Bundle) qtd.a(parcel));
            return true;
        }
        Parcelable.Creator creator4 = Bundle.CREATOR;
        qtd.b(parcel);
        e((Bundle) qtd.a(parcel));
        return true;
    }

    public abstract void b(Bundle bundle);

    public abstract void c(Bundle bundle);

    public abstract void d(Bundle bundle);

    public abstract void e(Bundle bundle);
}
