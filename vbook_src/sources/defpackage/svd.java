package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: svd  reason: default package */
/* loaded from: classes.dex */
public final class svd extends o3 {
    public static final Parcelable.Creator<svd> CREATOR = new go8(23);
    public final int a;
    public final IBinder b;
    public final jz1 c;
    public final boolean d;
    public final boolean e;

    public svd(int i, IBinder iBinder, jz1 jz1Var, boolean z, boolean z2) {
        this.a = i;
        this.b = iBinder;
        this.c = jz1Var;
        this.d = z;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        Object ftdVar;
        if (obj != null) {
            if (this != obj) {
                if (obj instanceof svd) {
                    svd svdVar = (svd) obj;
                    if (this.c.equals(svdVar.c)) {
                        Object obj2 = null;
                        IBinder iBinder = this.b;
                        if (iBinder == null) {
                            ftdVar = null;
                        } else {
                            int i = j5.b;
                            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface instanceof ij5) {
                                ftdVar = (ij5) queryLocalInterface;
                            } else {
                                ftdVar = new ftd(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 3);
                            }
                        }
                        IBinder iBinder2 = svdVar.b;
                        if (iBinder2 != null) {
                            int i2 = j5.b;
                            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                            if (queryLocalInterface2 instanceof ij5) {
                                obj2 = (ij5) queryLocalInterface2;
                            } else {
                                obj2 = new ftd(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 3);
                            }
                        }
                        if (hud.l(ftdVar, obj2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int U = uue.U(parcel, 20293);
        uue.T(parcel, 1, 4);
        parcel.writeInt(this.a);
        uue.K(parcel, 2, this.b);
        uue.O(parcel, 3, this.c, i);
        uue.T(parcel, 4, 4);
        parcel.writeInt(this.d ? 1 : 0);
        uue.T(parcel, 5, 4);
        parcel.writeInt(this.e ? 1 : 0);
        uue.V(parcel, U);
    }
}
