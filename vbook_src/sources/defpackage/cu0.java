package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cu0  reason: default package */
/* loaded from: classes.dex */
public final class cu0 {
    public final ve6 a;
    public final int b;
    public final int c;

    public cu0(ve6 ve6Var, int i, int i2) {
        this.a = ve6Var;
        this.b = i;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu0)) {
            return false;
        }
        cu0 cu0Var = (cu0) obj;
        if (this.a == cu0Var.a && this.b == cu0Var.b && this.c == cu0Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hl5.a(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "BoxChildSelector(type=" + this.a + ", horizontalAlignment=" + ((Object) ac.b(this.b)) + ", verticalAlignment=" + ((Object) bc.b(this.c)) + ')';
    }
}
