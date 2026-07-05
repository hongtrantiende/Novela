package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: lb2  reason: default package */
/* loaded from: classes3.dex */
public final class lb2 extends fdd {
    public boolean F;
    public final m0d c;
    public final gf1 d;
    public final cza e = dza.a(new kb2(false, false, false, false, false, "", "private", rs3.a, ks3.a));
    public final s02 f = new s02();
    public String C = "";
    public int D = 1;
    public boolean E = true;
    public final LinkedHashMap G = new LinkedHashMap();

    public lb2(gf1 gf1Var, m0d m0dVar) {
        this.c = m0dVar;
        this.d = gf1Var;
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new oi(this, (m42) null, 17));
        k();
    }

    public final void j() {
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new cv0(this, null, 22));
    }

    public final void k() {
        Object value;
        this.C = "";
        this.D = 1;
        this.E = true;
        this.G.clear();
        cza czaVar = this.e;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, kb2.a((kb2) value, true, false, false, false, false, null, null, null, ks3.a, 244)));
            j();
        }
        j();
    }
}
