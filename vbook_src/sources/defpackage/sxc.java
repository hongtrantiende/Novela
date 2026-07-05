package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sxc  reason: default package */
/* loaded from: classes3.dex */
public final class sxc implements mo3 {
    public final String a;
    public final cm0 b;

    public sxc(String str, cm0 cm0Var) {
        str.getClass();
        this.a = str;
        this.b = cm0Var;
    }

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        so3Var.getClass();
        List<xl0> list = so3Var.a;
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        for (xl0 xl0Var : list) {
            if (c16.i(xl0Var.a, this.a)) {
                xl0Var = xl0.a(xl0Var, null, this.b, null, 11);
            }
            arrayList.add(xl0Var);
        }
        return so3.a(so3Var, arrayList, null, null, null, null, 30);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof sxc) {
                sxc sxcVar = (sxc) obj;
                if (!c16.i(this.a, sxcVar.a) || !this.b.equals(sxcVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        String a = pm0.a(this.a);
        return "UpdateBlockContent(blockId=" + a + ", content=" + this.b + ")";
    }
}
