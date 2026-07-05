package defpackage;

import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t2c  reason: default package */
/* loaded from: classes3.dex */
public final class t2c extends fdd {
    public final a2c C;
    public final klc D;
    public final n64 E;
    public final cza F = dza.a(new n1c("", "", "", "", "", "", false, false));
    public final cza G = dza.a(new f1c(false, false, false));
    public final cza H;
    public final cza I;
    public final cza J;
    public final s02 K;
    public final npc c;
    public final wpc d;
    public final wl6 e;
    public final ixb f;

    public t2c(npc npcVar, wpc wpcVar, wl6 wl6Var, ixb ixbVar, a2c a2cVar, klc klcVar, n64 n64Var) {
        this.c = npcVar;
        this.d = wpcVar;
        this.e = wl6Var;
        this.f = ixbVar;
        this.C = a2cVar;
        this.D = klcVar;
        this.E = n64Var;
        ks3 ks3Var = ks3.a;
        this.H = dza.a(new ozb(1.0f, 1.0f, 0L, false, false, 0.5f, ks3Var, 1));
        this.I = dza.a(new z1c(0, 0L));
        this.J = dza.a(new k2c("", ks3Var));
        this.K = new s02();
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        ru2 ru2Var = ru2.c;
        f(a, ru2Var, new m2c(this, (m42) null, 5));
        f(jdd.a(this), ru2Var, new m2c(this, (m42) null, 6));
        f(jdd.a(this), ru2Var, new m2c(this, (m42) null, 0));
        f(jdd.a(this), ru2Var, new m2c(this, (m42) null, 1));
        f(jdd.a(this), ru2Var, new n2c(this, null, 0));
        f(jdd.a(this), ru2Var, new m2c(this, (m42) null, 2));
        f(jdd.a(this), ru2Var, new m2c(this, (m42) null, 3));
    }

    public static final String j(t2c t2cVar, Map map, String str) {
        String str2 = (String) map.get(str);
        if (str2 == null) {
            str2 = "";
        }
        if (str2.length() == 0) {
            str2 = (String) map.get("raw");
        }
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public final void k() {
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new n2c(this, null, 1));
    }

    public final void l() {
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new n2c(this, null, 2));
    }

    public final void m() {
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new n2c(this, null, 4));
    }

    public final void n() {
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new n2c(this, null, 5));
    }

    public final void o() {
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new n2c(this, null, 6));
    }

    public final void p() {
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new n2c(this, null, 9));
    }
}
