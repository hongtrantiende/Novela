package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mbc  reason: default package */
/* loaded from: classes3.dex */
public final class mbc implements mo3 {
    public final String a;

    public mbc(String str) {
        str.getClass();
        this.a = str;
    }

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        gn0 gn0Var;
        so3Var.getClass();
        String str = this.a;
        xl0 c = so3Var.c(str);
        if (c != null) {
            hn0 hn0Var = c.b;
            if (hn0Var instanceof gn0) {
                gn0Var = (gn0) hn0Var;
            } else {
                gn0Var = null;
            }
            if (gn0Var != null) {
                List<xl0> list = so3Var.a;
                ArrayList arrayList = new ArrayList(tl1.s(list, 10));
                for (xl0 xl0Var : list) {
                    if (c16.i(xl0Var.a, str)) {
                        xl0Var = xl0.a(xl0Var, new gn0(!gn0Var.a), null, null, 13);
                    }
                    arrayList.add(xl0Var);
                }
                return so3.a(so3Var, arrayList, null, null, null, null, 30);
            }
        }
        return so3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof mbc) && c16.i(this.a, ((mbc) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return hl5.n("ToggleTodo(blockId=", pm0.a(this.a), ")");
    }
}
