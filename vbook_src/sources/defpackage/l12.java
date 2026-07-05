package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l12  reason: default package */
/* loaded from: classes.dex */
public final class l12 {
    public final ve6 a;
    public final int b;
    public final ac c;
    public final bc d;

    public /* synthetic */ l12(ve6 ve6Var, int i, ac acVar, bc bcVar, int i2) {
        this(ve6Var, i, (i2 & 4) != 0 ? null : acVar, (i2 & 8) != 0 ? null : bcVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l12)) {
            return false;
        }
        l12 l12Var = (l12) obj;
        if (this.a == l12Var.a && this.b == l12Var.b && c16.i(this.c, l12Var.c) && c16.i(this.d, l12Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int a = hl5.a(this.b, this.a.hashCode() * 31, 31);
        int i = 0;
        ac acVar = this.c;
        if (acVar == null) {
            hashCode = 0;
        } else {
            hashCode = Integer.hashCode(acVar.a);
        }
        int i2 = (a + hashCode) * 31;
        bc bcVar = this.d;
        if (bcVar != null) {
            i = Integer.hashCode(bcVar.a);
        }
        return i2 + i;
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.a + ", numChildren=" + this.b + ", horizontalAlignment=" + this.c + ", verticalAlignment=" + this.d + ')';
    }

    public l12(ve6 ve6Var, int i, ac acVar, bc bcVar) {
        this.a = ve6Var;
        this.b = i;
        this.c = acVar;
        this.d = bcVar;
    }
}
