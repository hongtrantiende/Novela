package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: om4  reason: default package */
/* loaded from: classes3.dex */
public final class om4 implements mo3 {
    public static final om4 a = new Object();

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        int i;
        so3Var.getClass();
        List list = so3Var.a;
        String str = so3Var.b;
        if (str != null) {
            i = so3Var.e(str);
        } else {
            i = -1;
        }
        int i2 = i + 1;
        int size = list.size() - 1;
        if (i2 > size) {
            i2 = size;
        }
        if (i2 < 0 || list.isEmpty()) {
            return so3Var;
        }
        return so3.a(so3Var, null, ((xl0) list.get(i2)).a, rs3.a, null, null, 25);
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof om4)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 1480363957;
    }

    public final String toString() {
        return "FocusNextBlock";
    }
}
