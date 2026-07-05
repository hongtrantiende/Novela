package defpackage;

import java.util.Locale;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: my8  reason: default package */
/* loaded from: classes.dex */
public final class my8 {
    public static final my8 d = new my8(1.0f, 1.0f);
    public final float a;
    public final float b;
    public final int c;

    static {
        a2d.K(0);
        a2d.K(1);
    }

    public my8(float f, float f2) {
        boolean z;
        if (f > nae.e) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        wq9.s(f2 > nae.e);
        this.a = f;
        this.b = f2;
        this.c = Math.round(f * 1000.0f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && my8.class == obj.getClass()) {
            my8 my8Var = (my8) obj;
            if (this.a == my8Var.a && this.b == my8Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Float.floatToRawIntBits(this.b) + ((Float.floatToRawIntBits(this.a) + 527) * 31);
    }

    public final String toString() {
        Object[] objArr = {Float.valueOf(this.a), Float.valueOf(this.b)};
        String str = a2d.a;
        return String.format(Locale.US, "PlaybackParameters(speed=%.2f, pitch=%.2f)", objArr);
    }
}
