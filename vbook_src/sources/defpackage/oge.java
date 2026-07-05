package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oge  reason: default package */
/* loaded from: classes.dex */
public final class oge extends mud {
    public rh0 b;
    public final int c;

    public oge(rh0 rh0Var, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks", 2);
        this.b = rh0Var;
        this.c = i;
    }

    @Override // defpackage.mud
    public final boolean S(int i, Parcel parcel, Parcel parcel2) {
        nu9 nu9Var;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return false;
                }
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                fve fveVar = (fve) lde.a(parcel, fve.CREATOR);
                lde.c(parcel);
                rh0 rh0Var = this.b;
                am8.t(rh0Var, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                am8.s(fveVar);
                rh0Var.w = fveVar;
                if (rh0Var.s()) {
                    sz1 sz1Var = fveVar.d;
                    mu9 s = mu9.s();
                    if (sz1Var == null) {
                        nu9Var = null;
                    } else {
                        nu9Var = sz1Var.a;
                    }
                    synchronized (s) {
                        if (nu9Var == null) {
                            nu9Var = mu9.c;
                        } else {
                            nu9 nu9Var2 = (nu9) s.a;
                            if (nu9Var2 != null) {
                                if (nu9Var2.a < nu9Var.a) {
                                }
                            }
                        }
                        s.a = nu9Var;
                    }
                }
                Bundle bundle = fveVar.a;
                am8.t(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
                rh0 rh0Var2 = this.b;
                int i2 = this.c;
                rh0Var2.getClass();
                tke tkeVar = new tke(rh0Var2, readInt, readStrongBinder, bundle);
                lae laeVar = rh0Var2.f;
                laeVar.sendMessage(laeVar.obtainMessage(1, i2, -1, tkeVar));
                this.b = null;
            } else {
                parcel.readInt();
                Bundle bundle2 = (Bundle) lde.a(parcel, Bundle.CREATOR);
                lde.c(parcel);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
            }
        } else {
            lde.c(parcel);
            am8.t(this.b, "onPostInitComplete can be called only once per call to getRemoteService");
            rh0 rh0Var3 = this.b;
            int i3 = this.c;
            rh0Var3.getClass();
            tke tkeVar2 = new tke(rh0Var3, parcel.readInt(), parcel.readStrongBinder(), (Bundle) lde.a(parcel, Bundle.CREATOR));
            lae laeVar2 = rh0Var3.f;
            laeVar2.sendMessage(laeVar2.obtainMessage(1, i3, -1, tkeVar2));
            this.b = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
