package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sm4  reason: default package */
/* loaded from: classes3.dex */
public final class sm4 implements mo3 {
    public static final sm4 a = new Object();

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        int size;
        so3Var.getClass();
        List list = so3Var.a;
        String str = so3Var.b;
        if (str != null) {
            size = so3Var.e(str);
        } else {
            size = list.size();
        }
        int i = size - 1;
        if (i < 0) {
            i = 0;
        }
        if (i < 0 || list.isEmpty()) {
            return so3Var;
        }
        return so3.a(so3Var, null, ((xl0) list.get(i)).a, rs3.a, null, null, 25);
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof sm4)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 78453937;
    }

    public final String toString() {
        return "FocusPreviousBlock";
    }
}
