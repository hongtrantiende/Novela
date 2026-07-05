package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zfa  reason: default package */
/* loaded from: classes3.dex */
public final class zfa extends fdd {
    public final cza C;
    public final s02 D;
    public iya E;
    public final int c;
    public final wl6 d;
    public final zq1 e;
    public final klc f;

    public zfa(int i, String str, wl6 wl6Var, zq1 zq1Var, klc klcVar) {
        boolean z;
        this.c = i;
        this.d = wl6Var;
        this.e = zq1Var;
        this.f = klcVar;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        this.C = dza.a(new xfa("", false, z, false, ks3.a, null, null, "", nae.e, false));
        this.D = new s02();
        if (i >= 0) {
            hk1 a = jdd.a(this);
            sw2 sw2Var = ab3.a;
            z87.v(a, ru2.c, null, new pf(this, i, (m42) null, 13), 2);
            return;
        }
        hk1 a2 = jdd.a(this);
        sw2 sw2Var2 = ab3.a;
        ru2 ru2Var = ru2.c;
        z87.v(a2, ru2Var, null, new z38(this, null, 23), 2);
        if (str.length() > 0) {
            z87.v(jdd.a(this), ru2Var, null, new yfa(this, str, null, 0), 2);
        }
    }
}
