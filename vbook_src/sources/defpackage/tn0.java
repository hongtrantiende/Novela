package defpackage;

import android.graphics.RenderEffect;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: tn0  reason: default package */
/* loaded from: classes.dex */
public final class tn0 extends c3e {
    public final c3e b;
    public final float c;
    public final float d;
    public final int e;

    public tn0(c3e c3eVar, float f, float f2, int i) {
        this.b = c3eVar;
        this.c = f;
        this.d = f2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tn0)) {
            return false;
        }
        tn0 tn0Var = (tn0) obj;
        if (this.c == tn0Var.c && this.d == tn0Var.d && this.e == tn0Var.e && c16.i(this.b, tn0Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        c3e c3eVar = this.b;
        if (c3eVar != null) {
            i = c3eVar.hashCode();
        } else {
            i = 0;
        }
        return Integer.hashCode(this.e) + nk2.d(this.d, nk2.d(this.c, i * 31, 31), 31);
    }

    @Override // defpackage.c3e
    public final RenderEffect r() {
        return ih.c(this.b, this.c, this.d, this.e);
    }

    public final String toString() {
        String x = yf2.x(this.e);
        return "BlurEffect(renderEffect=" + this.b + ", radiusX=" + this.c + ", radiusY=" + this.d + ", edgeTreatment=" + x + ")";
    }
}
