package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nz7  reason: default package */
/* loaded from: classes3.dex */
public final class nz7 implements mo3 {
    public static final nz7 a = new Object();

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        so3Var.getClass();
        xoa xoaVar = so3Var.e;
        if (xoaVar != null) {
            List list = xoaVar.d;
            if (!list.isEmpty()) {
                return so3.a(so3Var, null, null, null, null, xoa.a(xoaVar, null, null, sl1.Z(list), null, 7), 15);
            }
        }
        return so3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof nz7)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 521195616;
    }

    public final String toString() {
        return "NavigateSlashBack";
    }
}
