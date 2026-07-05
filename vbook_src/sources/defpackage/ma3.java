package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ma3  reason: default package */
/* loaded from: classes3.dex */
public final class ma3 extends fdd {
    public boolean C;
    public boolean D;
    public boolean F;
    public iya G;
    public final ga3 c;
    public final cza d = dza.a(new ka3(true, false, false, false, ks3.a));
    public final HashMap e = new HashMap();
    public int f = 1;
    public String E = "";

    public ma3(m0d m0dVar, ga3 ga3Var) {
        this.c = ga3Var;
    }

    public final void j(int i) {
        iya iyaVar = this.G;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        this.G = z87.v(a, ru2.c, null, new pf(this, i, (m42) null, 4), 2);
    }

    public final void k() {
        Object value;
        if (this.C) {
            return;
        }
        this.F = true;
        this.E = "";
        this.f = 1;
        this.D = false;
        this.e.clear();
        cza czaVar = this.d;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, ka3.a((ka3) value, true, false, false, null, 26)));
            j(this.f);
        }
        j(this.f);
    }

    public final void l(String str) {
        Object value;
        str.getClass();
        if (this.C) {
            return;
        }
        this.F = true;
        this.E = str;
        this.f = 1;
        this.D = false;
        this.e.clear();
        cza czaVar = this.d;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, ka3.a((ka3) value, true, false, !k4b.j0(this.E), null, 26)));
            j(this.f);
        }
        j(this.f);
    }
}
