package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d13  reason: default package */
/* loaded from: classes3.dex */
public final class d13 implements mo3 {
    public final Set a;

    public d13(Set set) {
        set.getClass();
        this.a = set;
    }

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        Set set;
        pm0 pm0Var;
        String str;
        so3Var.getClass();
        String str2 = so3Var.b;
        List list = so3Var.a;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            set = this.a;
            if (!hasNext) {
                break;
            }
            Object next = it.next();
            if (!set.contains(new pm0(((xl0) next).a))) {
                arrayList.add(next);
            }
        }
        Set set2 = set;
        if (str2 != null) {
            pm0Var = new pm0(str2);
        } else {
            pm0Var = null;
        }
        if (sl1.W(set2, pm0Var)) {
            str = null;
        } else {
            str = str2;
        }
        return so3.a(so3Var, tl1.H(qwe.o(arrayList)), str, fca.t(so3Var.c, set2), null, null, 24);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof d13) && c16.i(this.a, ((d13) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DeleteBlocks(blockIds=" + this.a + ")";
    }
}
