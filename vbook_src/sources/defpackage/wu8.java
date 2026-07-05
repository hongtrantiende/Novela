package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wu8  reason: default package */
/* loaded from: classes3.dex */
public final class wu8 extends hif {
    public final long c;
    public final int d;

    public wu8(long j, int i) {
        this.c = j;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu8)) {
            return false;
        }
        wu8 wu8Var = (wu8) obj;
        if (e86.a(this.c, wu8Var.c) && this.d == wu8Var.d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = e86.V;
        return Integer.hashCode(this.d) + (Long.hashCode(this.c) * 31);
    }

    public final String toString() {
        return hl5.o("Process(key=", e86.b(this.c), ", type=", dae.D(this.d), ")");
    }
}
