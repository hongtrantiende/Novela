package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: av9  reason: default package */
/* loaded from: classes.dex */
public final class av9 {
    public final ve6 a;
    public final boolean b;
    public final boolean c;

    public av9(ve6 ve6Var, boolean z, boolean z2) {
        this.a = ve6Var;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof av9)) {
            return false;
        }
        av9 av9Var = (av9) obj;
        if (this.a == av9Var.a && this.b == av9Var.b && this.c == av9Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + eub.k(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "RowColumnChildSelector(type=" + this.a + ", expandWidth=" + this.b + ", expandHeight=" + this.c + ')';
    }
}
