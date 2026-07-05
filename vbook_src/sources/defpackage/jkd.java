package defpackage;

import android.graphics.Rect;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jkd  reason: default package */
/* loaded from: classes.dex */
public final class jkd {
    public final ut0 a;
    public final float b;

    public jkd(Rect rect, float f) {
        this.a = new ut0(rect);
        this.b = f;
    }

    public final Rect a() {
        ut0 ut0Var = this.a;
        ut0Var.getClass();
        return new Rect(ut0Var.a, ut0Var.b, ut0Var.c, ut0Var.d);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!jkd.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        jkd jkdVar = (jkd) obj;
        if (c16.i(this.a, jkdVar.a) && this.b == jkdVar.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WindowMetrics(_bounds=" + this.a + ", density=" + this.b + ')';
    }

    public jkd(ut0 ut0Var, float f) {
        this.a = ut0Var;
        this.b = f;
    }
}
