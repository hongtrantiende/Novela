package defpackage;

import java.util.Set;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h13  reason: default package */
/* loaded from: classes3.dex */
public final class h13 implements mo3 {
    public static final h13 a = new Object();

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        so3Var.getClass();
        Set set = so3Var.c;
        if (set.isEmpty()) {
            String str = so3Var.b;
            if (str != null) {
                set = fca.B(new pm0(str));
            } else {
                return so3Var;
            }
        }
        return new d13(set).a(so3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof h13)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return -1483696549;
    }

    public final String toString() {
        return "DeleteSelectedOrFocused";
    }
}
