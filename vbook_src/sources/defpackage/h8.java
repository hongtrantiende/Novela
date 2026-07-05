package defpackage;

import android.graphics.RectF;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h8  reason: default package */
/* loaded from: classes.dex */
public final class h8 implements y72 {
    public final y72 a;
    public final float b;

    public h8(float f, y72 y72Var) {
        while (y72Var instanceof h8) {
            y72Var = ((h8) y72Var).a;
            f += ((h8) y72Var).b;
        }
        this.a = y72Var;
        this.b = f;
    }

    @Override // defpackage.y72
    public final float a(RectF rectF) {
        return Math.max((float) nae.e, this.a.a(rectF) + this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h8)) {
            return false;
        }
        h8 h8Var = (h8) obj;
        if (this.a.equals(h8Var.a) && this.b == h8Var.b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b)});
    }
}
