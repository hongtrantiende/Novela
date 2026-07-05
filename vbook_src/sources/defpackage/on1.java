package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: on1  reason: default package */
/* loaded from: classes.dex */
public final class on1 implements mub {
    public final long a;

    public on1(long j) {
        this.a = j;
        if (j != 16) {
            return;
        }
        mv5.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // defpackage.mub
    public final long a() {
        return this.a;
    }

    @Override // defpackage.mub
    public final hy0 b() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof on1) && zl1.c(this.a, ((on1) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return hl5.n("ColorStyle(value=", zl1.i(this.a), ")");
    }

    @Override // defpackage.mub
    public final float z() {
        return zl1.d(this.a);
    }
}
