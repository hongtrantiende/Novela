package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jy0  reason: default package */
/* loaded from: classes.dex */
public final class jy0 implements mub {
    public final jea a;
    public final float b;

    public jy0(jea jeaVar, float f) {
        this.a = jeaVar;
        this.b = f;
    }

    @Override // defpackage.mub
    public final long a() {
        int i = zl1.j;
        return zl1.i;
    }

    @Override // defpackage.mub
    public final hy0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jy0)) {
            return false;
        }
        jy0 jy0Var = (jy0) obj;
        if (c16.i(this.a, jy0Var.a) && Float.compare(this.b, jy0Var.b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "BrushStyle(value=" + this.a + ", alpha=" + this.b + ")";
    }

    @Override // defpackage.mub
    public final float z() {
        return this.b;
    }
}
