package defpackage;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x3f  reason: default package */
/* loaded from: classes.dex */
public abstract class x3f {
    public static final mge a;
    public static final mge b;
    public static volatile zzd c;
    public static final Object d;
    public static Context e;

    static {
        new mge(eve.V("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u007f¢fú§p\u0085xb±"), 0);
        new mge(eve.V("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014QÕÛ\u0004÷XçB\u0086<"), 1);
        new mge(eve.V("0\u0082\u0005È0\u0082\u0003° \u0003\u0002\u0001\u0002\u0002\u0014\u0010\u008ae\bsù/\u008eQí"), 2);
        new mge(eve.V("0\u0082\u0006\u00040\u0082\u0003ì \u0003\u0002\u0001\u0002\u0002\u0014\u0003£²\u00ad×árÊkì"), 3);
        a = new mge(eve.V("0\u0082\u0004C0\u0082\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000Âà\u0087FdJ0\u008d0"), 4);
        b = new mge(eve.V("0\u0082\u0004¨0\u0082\u0003\u0090 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ\u0085¸l}ÓNõ0"), 5);
        d = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v8, types: [zzd] */
    /* JADX WARN: Type inference failed for: r1v9 */
    public static void a() {
        zzd ftdVar;
        if (c != null) {
            return;
        }
        am8.s(e);
        synchronized (d) {
            try {
                if (c == null) {
                    IBinder b2 = zm3.c(e, zm3.e, "com.google.android.gms.googlecertificates").b("com.google.android.gms.common.GoogleCertificatesImpl");
                    int i = ezd.b;
                    if (b2 == null) {
                        ftdVar = 0;
                    } else {
                        IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
                        if (queryLocalInterface instanceof zzd) {
                            ftdVar = (zzd) queryLocalInterface;
                        } else {
                            ftdVar = new ftd(b2, "com.google.android.gms.common.internal.IGoogleCertificatesApi", 3);
                        }
                    }
                    c = ftdVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ejf b(String str, lxe lxeVar, boolean z, boolean z2) {
        try {
            a();
            am8.s(e);
            try {
                zzd zzdVar = c;
                n78 n78Var = new n78(e.getPackageManager());
                eyd eydVar = (eyd) zzdVar;
                Parcel S = eydVar.S();
                int i = lde.a;
                boolean z3 = true;
                S.writeInt(1);
                int U = uue.U(S, 20293);
                uue.P(S, 1, str);
                uue.K(S, 2, lxeVar);
                uue.T(S, 3, 4);
                S.writeInt(z ? 1 : 0);
                uue.T(S, 4, 4);
                S.writeInt(z2 ? 1 : 0);
                uue.V(S, U);
                lde.b(S, n78Var);
                Parcel Q = eydVar.Q(S, 5);
                if (Q.readInt() == 0) {
                    z3 = false;
                }
                Q.recycle();
                if (z3) {
                    return ejf.d;
                }
                return new hhf(new hze(z, str, lxeVar));
            } catch (RemoteException e2) {
                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e2);
                return ejf.n("module call", e2);
            }
        } catch (wm3 e3) {
            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e3);
            return ejf.n("module init: ".concat(String.valueOf(e3.getMessage())), e3);
        }
    }
}
