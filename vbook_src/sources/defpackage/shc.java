package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: shc  reason: default package */
/* loaded from: classes3.dex */
public final class shc extends fdd {
    public boolean F;
    public boolean H;
    public boolean I;
    public iya J;
    public final int c;
    public final zq1 d;
    public final n64 e;
    public boolean f = true;
    public final cza C = dza.a(new phc(false, false, false, false, false, true, null, ks3.a, null, ls3.a));
    public final s02 D = new s02();
    public final oc5 E = axe.i();
    public int G = 1;

    public shc(int i, zq1 zq1Var, n64 n64Var) {
        this.c = i;
        this.d = zq1Var;
        this.e = n64Var;
    }

    public static final List j(shc shcVar, String str) {
        Object gs9Var;
        shcVar.getClass();
        Object obj = null;
        if (k4b.j0(str)) {
            return null;
        }
        try {
            gs9Var = axe.s(bue.f(str, shcVar.E));
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        if (!(gs9Var instanceof gs9)) {
            obj = gs9Var;
        }
        return (List) obj;
    }

    public final void k(String str) {
        str.getClass();
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new q4c(this, str, null, 11));
    }

    public final void l() {
        Object value;
        cza czaVar = this.C;
        if (((phc) czaVar.getValue()).a) {
            return;
        }
        this.F = true;
        this.G = 1;
        this.H = false;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
            } while (!czaVar.l(value, phc.a((phc) value, true, false, false, false, false, false, null, ks3.a, null, null, 888)));
            hk1 a = jdd.a(this);
            sw2 sw2Var = ab3.a;
            z87.v(a, ru2.c, null, new rhc(this, null, 0), 2);
        }
        hk1 a2 = jdd.a(this);
        sw2 sw2Var2 = ab3.a;
        z87.v(a2, ru2.c, null, new rhc(this, null, 0), 2);
    }

    public final void m(long j) {
        Object obj;
        Object value;
        phc phcVar;
        ArrayList arrayList;
        cza czaVar = this.C;
        Iterator it = ((phc) czaVar.getValue()).h.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((e33) obj).a == j) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        e33 e33Var = (e33) obj;
        if (e33Var == null) {
            return;
        }
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
                phcVar = (phc) value;
                List<e33> list = phcVar.h;
                arrayList = new ArrayList(tl1.s(list, 10));
                for (e33 e33Var2 : list) {
                    if (e33Var2.a == j) {
                        boolean z = e33Var.g;
                        boolean z2 = !z;
                        int i = e33Var.f;
                        e33Var2 = e33.a(e33Var2, z ? i - 1 : i + 1, z2, null, 1951);
                    }
                    arrayList.add(e33Var2);
                }
            } while (!czaVar.l(value, phc.a(phcVar, false, false, false, false, false, false, null, arrayList, null, null, 895)));
            hk1 a = jdd.a(this);
            sw2 sw2Var = ab3.a;
            f(a, ru2.c, new ip(this, j, (m42) null, 7));
        }
        hk1 a2 = jdd.a(this);
        sw2 sw2Var2 = ab3.a;
        f(a2, ru2.c, new ip(this, j, (m42) null, 7));
    }
}
