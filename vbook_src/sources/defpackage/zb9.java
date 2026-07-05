package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zb9  reason: default package */
/* loaded from: classes3.dex */
public final class zb9 extends fdd {
    public List C;
    public final cza D;
    public w26 E;
    public long F;
    public final int c;
    public final sc9 d;
    public final cza e;
    public final s02 f;

    public zb9(int i, sc9 sc9Var) {
        this.c = i;
        this.d = sc9Var;
        rs3 rs3Var = rs3.a;
        ks3 ks3Var = ks3.a;
        this.e = dza.a(new wb9(ks3Var, "", null, 0, true, false, false, false, rs3Var, false));
        this.f = new s02();
        this.C = ks3Var;
        this.D = dza.a("");
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new xb9(this, null, 3));
        fdd.g(this, jdd.a(this), new xb9(this, null, 0));
    }

    public static final String j(zb9 zb9Var) {
        int i = zb9Var.c;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "VietPhrase";
                    }
                    return "LuatNhan";
                }
                return "PhienAm";
            }
            return "Pronouns";
        }
        return "Name";
    }

    public final void k() {
        w26 w26Var = this.E;
        if (w26Var != null) {
            w26Var.cancel(null);
        }
        this.E = f(jdd.a(this), ab3.a, new xb9(this, null, 1));
    }

    public final void l() {
        Object value;
        cza czaVar = this.e;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, wb9.a((wb9) value, null, null, null, 0, false, false, false, false, rs3.a, false, 767)));
        }
    }

    public final ac9 m(String str, String str2) {
        long j = this.F;
        this.F = 1 + j;
        return new ac9(j, str, str2);
    }
}
