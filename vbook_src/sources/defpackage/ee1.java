package defpackage;

import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ee1  reason: default package */
/* loaded from: classes3.dex */
public final class ee1 extends fdd {
    public boolean E;
    public final gf1 c;
    public final m0d d;
    public final cza e = dza.a(new ce1(true, false, false, false, "", "", ks3.a));
    public int f = 1;
    public String C = "";
    public boolean D = true;
    public final LinkedHashMap F = new LinkedHashMap();

    public ee1(gf1 gf1Var, m0d m0dVar) {
        this.c = gf1Var;
        this.d = m0dVar;
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new oi(this, (m42) null, 12));
        j();
    }

    public final void j() {
        Object value;
        this.f = 1;
        this.D = true;
        this.E = false;
        this.F.clear();
        cza czaVar = this.e;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, ce1.a((ce1) value, true, false, false, false, null, this.C, ks3.a, 16)));
            String str = this.C;
            hk1 a = jdd.a(this);
            sw2 sw2Var = ab3.a;
            f(a, ru2.c, new de1(false, this, true, str, null));
        }
        String str2 = this.C;
        hk1 a2 = jdd.a(this);
        sw2 sw2Var2 = ab3.a;
        f(a2, ru2.c, new de1(false, this, true, str2, null));
    }

    public final void k(String str) {
        String str2;
        str.getClass();
        String obj = k4b.N0(str).toString();
        boolean i = c16.i(obj, this.C);
        cza czaVar = this.e;
        if (i && !((ce1) czaVar.getValue()).g.isEmpty()) {
            return;
        }
        this.C = obj;
        this.f = 1;
        this.D = true;
        this.E = false;
        this.F.clear();
        if (czaVar != null) {
            while (true) {
                Object value = czaVar.getValue();
                str2 = obj;
                if (czaVar.l(value, ce1.a((ce1) value, true, false, false, false, null, str2, ks3.a, 16))) {
                    break;
                }
                obj = str2;
            }
        } else {
            str2 = obj;
        }
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new de1(false, this, true, str2, null));
    }
}
