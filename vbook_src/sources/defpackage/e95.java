package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e95  reason: default package */
/* loaded from: classes3.dex */
public final class e95 extends fdd {
    public boolean D;
    public final n83 c;
    public final n64 d;
    public final a4a e;
    public final cza f = dza.a(new x85(false, true, ks3.a));
    public String C = "";
    public boolean E = true;
    public final LinkedHashMap F = new LinkedHashMap();
    public final LinkedHashMap G = new LinkedHashMap();

    public e95(n83 n83Var, n64 n64Var, klc klcVar, a4a a4aVar) {
        this.c = n83Var;
        this.d = n64Var;
        this.e = a4aVar;
        hk1 a = jdd.a(this);
        sw2 sw2Var = ab3.a;
        f(a, ru2.c, new b95(this, null, 0));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.e95 r11, java.lang.String r12, java.lang.String r13, defpackage.n42 r14) {
        /*
            Method dump skipped, instructions count: 189
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e95.j(e95, java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    public final void k() {
        Object value;
        x85 x85Var;
        ArrayList arrayList;
        cza czaVar = this.f;
        if (czaVar != null) {
            do {
                value = czaVar.getValue();
                x85Var = (x85) value;
                Collection values = this.F.values();
                values.getClass();
                arrayList = new ArrayList();
                Iterator it = values.iterator();
                while (true) {
                    boolean z = false;
                    if (it.hasNext()) {
                        Object next = it.next();
                        h34 h34Var = (h34) next;
                        boolean z2 = this.E;
                        boolean z3 = this.D;
                        if (z2) {
                            if (z3) {
                            }
                        } else {
                            if (!z3) {
                                z = h34Var.e.q;
                            }
                            z = true;
                        }
                        if (z) {
                            arrayList.add(next);
                        }
                    }
                }
            } while (!czaVar.l(value, x85.a(x85Var, false, false, arrayList, 7)));
        }
    }
}
