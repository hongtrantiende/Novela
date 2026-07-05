package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wma  reason: default package */
/* loaded from: classes.dex */
public abstract class wma {
    public static final gxa a = tte.v(nae.e, nae.e, 7, null);

    public static final yya a(long j, xr xrVar, rv4 rv4Var, int i, int i2) {
        String str;
        if ((i2 & 2) != 0) {
            xrVar = a;
        }
        xr xrVar2 = xrVar;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        } else {
            str = "theme_mode_segment_color";
        }
        String str2 = str;
        boolean f = rv4Var.f(zl1.f(j));
        Object P = rv4Var.P();
        if (f || P == ax1.a) {
            drc drcVar = new drc(kg.T, new jc(zl1.f(j), 11));
            rv4Var.o0(drcVar);
            P = drcVar;
        }
        return nq.c(new zl1(j), (drc) P, xrVar2, null, str2, rv4Var, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }
}
