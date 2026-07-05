package defpackage;

import android.graphics.Shader;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: esa  reason: default package */
/* loaded from: classes.dex */
public final class esa extends hy0 implements m06 {
    public final long a;

    public esa(long j) {
        this.a = j;
    }

    @Override // defpackage.hy0
    public final void a(float f, long j, ljc ljcVar) {
        ljcVar.n(1.0f);
        int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
        long j2 = this.a;
        if (i != 0) {
            j2 = zl1.b(zl1.d(j2) * f, j2);
        }
        ljcVar.p(j2);
        if (((Shader) ljcVar.c) != null) {
            ljcVar.t(null);
        }
    }

    @Override // defpackage.m06
    public final Object b(Object obj, float f) {
        if (obj == null) {
            obj = new esa(zl1.h);
        }
        if (obj instanceof esa) {
            return new esa(sve.q(f, this.a, ((esa) obj).a));
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof esa)) {
            return false;
        }
        if (zl1.c(this.a, ((esa) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = zl1.j;
        return Long.hashCode(this.a);
    }

    public final String toString() {
        return hl5.n("SolidColor(value=", zl1.i(this.a), ")");
    }
}
