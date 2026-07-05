package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vc6  reason: default package */
/* loaded from: classes.dex */
public final class vc6 {
    public final int a;
    public final int b;
    public final boolean c;

    public vc6(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vc6)) {
            return false;
        }
        vc6 vc6Var = (vc6) obj;
        if (this.a == vc6Var.a && this.b == vc6Var.b && this.c == vc6Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + hl5.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return rs8.m(")", hl5.r(this.a, this.b, "BidiRun(start=", ", end=", ", isRtl="), this.c);
    }
}
