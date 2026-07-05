package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ct1  reason: default package */
/* loaded from: classes3.dex */
public final class ct1 implements mo3 {
    public static final ct1 a = new Object();

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        so3Var.getClass();
        cj3 cj3Var = so3Var.d;
        if (cj3Var == null) {
            return so3Var;
        }
        Integer num = cj3Var.b;
        if (num != null) {
            return so3.a(new ms7(cj3Var, num.intValue()).a(so3Var), null, null, null, null, null, 23);
        }
        return so3.a(so3Var, null, null, null, null, null, 23);
    }

    public final boolean equals(Object obj) {
        if (this == obj || (obj instanceof ct1)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return 950087456;
    }

    public final String toString() {
        return "CompleteDrag";
    }
}
