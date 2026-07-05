package defpackage;

import java.nio.charset.Charset;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xfe  reason: default package */
/* loaded from: classes.dex */
public abstract class xfe {
    public static final /* synthetic */ int a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static chf a(xgf xgfVar) {
        bhf v = chf.v();
        int z = xgfVar.z();
        v.c();
        ((chf) v.b).zze = z;
        for (vgf vgfVar : xgfVar.B()) {
            zgf x = ahf.x();
            String A = vgfVar.y().A();
            x.c();
            ahf.u((ahf) x.b, A);
            int z2 = vgfVar.z();
            x.c();
            ((ahf) x.b).zzf = eub.c(z2);
            eif B = vgfVar.B();
            x.c();
            ((ahf) x.b).zzh = B.zza();
            int t = vgfVar.t();
            x.c();
            ((ahf) x.b).zzg = t;
            v.c();
            chf.u((chf) v.b, (ahf) x.b());
        }
        return (chf) v.b();
    }
}
