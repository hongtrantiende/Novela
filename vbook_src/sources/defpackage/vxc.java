package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vxc  reason: default package */
/* loaded from: classes3.dex */
public final class vxc implements mo3 {
    public final Integer a;
    public final Integer b;

    public vxc(Integer num, Integer num2) {
        this.a = num;
        this.b = num2;
    }

    @Override // defpackage.mo3
    public final so3 a(so3 so3Var) {
        int i;
        so3Var.getClass();
        cj3 cj3Var = so3Var.d;
        if (cj3Var == null) {
            return so3Var;
        }
        Integer num = this.b;
        if (num != null) {
            i = num.intValue();
        } else {
            i = cj3Var.q;
        }
        int i2 = i;
        return so3.a(so3Var, null, null, null, new cj3(cj3Var.a, this.a, cj3Var.c, cj3Var.d, cj3Var.e, cj3Var.f, cj3Var.g, cj3Var.h, cj3Var.i, cj3Var.j, cj3Var.k, cj3Var.l, cj3Var.m, cj3Var.n, cj3Var.o, cj3Var.p, i2), null, 23);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxc)) {
            return false;
        }
        vxc vxcVar = (vxc) obj;
        if (c16.i(this.a, vxcVar.a) && c16.i(this.b, vxcVar.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num2 = this.b;
        if (num2 != null) {
            i = num2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        return "UpdateDragTarget(targetIndex=" + this.a + ", futureRootIndentationLevel=" + this.b + ")";
    }
}
