package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v62  reason: default package */
/* loaded from: classes3.dex */
public final class v62 implements mo3 {
    public final String a;
    public final hn0 b;

    public v62(String str, hn0 hn0Var) {
        str.getClass();
        hn0Var.getClass();
        this.a = str;
        this.b = hn0Var;
    }

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        cm0 cm0Var;
        so3Var.getClass();
        List<xl0> list = so3Var.a;
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        for (xl0 xl0Var : list) {
            if (c16.i(xl0Var.a, this.a)) {
                hn0 hn0Var = this.b;
                hn0Var.getClass();
                xl0 a = xl0.a(xl0Var, hn0Var, null, null, 13);
                yl0 yl0Var = xl0Var.d;
                if (!hn0Var.a()) {
                    yl0Var.getClass();
                    yl0Var = new yl0(0);
                }
                yl0Var.getClass();
                xl0Var = xl0.a(a, null, null, yl0Var, 7);
                if (!hn0Var.b()) {
                    dm0 dm0Var = xl0Var.c;
                    if (dm0Var instanceof cm0) {
                        cm0Var = (cm0) dm0Var;
                    } else {
                        cm0Var = null;
                    }
                    if (cm0Var != null && !cm0Var.b.isEmpty()) {
                        xl0Var = xl0.a(xl0Var, null, cm0.a(cm0Var, ks3.a), null, 11);
                    }
                }
            }
            arrayList.add(xl0Var);
        }
        return so3.a(so3Var, tl1.H(qwe.o(arrayList)), null, null, null, null, 30);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v62)) {
            return false;
        }
        v62 v62Var = (v62) obj;
        if (c16.i(this.a, v62Var.a) && c16.i(this.b, v62Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String a = pm0.a(this.a);
        return "ConvertBlockType(blockId=" + a + ", newType=" + this.b + ")";
    }
}
