package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r5a  reason: default package */
/* loaded from: classes3.dex */
public final class r5a implements mo3 {
    public static final r5a a = new Object();

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        so3Var.getClass();
        List<xl0> list = so3Var.a;
        ArrayList arrayList = new ArrayList(tl1.s(list, 10));
        for (xl0 xl0Var : list) {
            arrayList.add(new pm0(xl0Var.a));
        }
        return so3.a(so3Var, null, null, sl1.H0(arrayList), null, null, 25);
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof r5a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 1259997906;
    }

    public final String toString() {
        return "SelectAll";
    }
}
