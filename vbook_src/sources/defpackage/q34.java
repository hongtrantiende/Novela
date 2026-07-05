package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q34  reason: default package */
/* loaded from: classes3.dex */
public final class q34 {
    public final int a;
    public final int b;
    public final boolean c;

    public q34(int i, int i2, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q34)) {
            return false;
        }
        q34 q34Var = (q34) obj;
        if (this.a == q34Var.a && this.b == q34Var.b && this.c == q34Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + hl5.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return rs8.m(")", hl5.r(this.a, this.b, "ExtensionConnectionConfig(thread=", ", delay=", ", ignore="), this.c);
    }
}
