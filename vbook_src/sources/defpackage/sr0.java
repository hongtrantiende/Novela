package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sr0  reason: default package */
/* loaded from: classes3.dex */
public final class sr0 extends fdd {
    public boolean E;
    public boolean F;
    public String G;
    public boolean H;
    public iya I;
    public final kr0 c;
    public final n64 d;
    public final cza e = dza.a(new qr0(true, false, false, false, ks3.a));
    public final s02 f = new s02();
    public final HashMap C = new HashMap();
    public int D = 1;

    public sr0(m0d m0dVar, kr0 kr0Var, n64 n64Var) {
        this.c = kr0Var;
        this.d = n64Var;
    }

    public final void j(int i) {
        iya iyaVar = this.I;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        this.I = z87.v(a, ru2.c, null, new pf(this, i, (m42) null, 2), 2);
    }

    public final void k() {
        Object value;
        if (this.E) {
            return;
        }
        this.H = true;
        this.G = null;
        this.D = 1;
        this.F = false;
        this.C.clear();
        cza czaVar = this.e;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, qr0.a((qr0) value, true, false, false, null, 26)));
            j(this.D);
        }
        j(this.D);
    }

    public final void l(String str) {
        Object value;
        qr0 qr0Var;
        boolean z;
        str.getClass();
        if (this.E) {
            return;
        }
        this.H = true;
        if (k4b.j0(str)) {
            str = null;
        }
        this.G = str;
        this.D = 1;
        this.F = false;
        this.C.clear();
        cza czaVar = this.e;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
                qr0Var = (qr0) value;
                if (this.G != null) {
                    z = true;
                } else {
                    z = false;
                }
            } while (!czaVar.l(value, qr0.a(qr0Var, true, false, z, null, 26)));
            j(this.D);
        }
        j(this.D);
    }
}
