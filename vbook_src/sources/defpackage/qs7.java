package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qs7  reason: default package */
/* loaded from: classes.dex */
public final class qs7 implements rb7 {
    public final float a;
    public final ps7 b;
    public final ps7 c;

    public qs7(float f, ps7 ps7Var, ps7 ps7Var2) {
        this.a = f;
        this.b = ps7Var;
        this.c = ps7Var2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof qs7)) {
            return false;
        }
        qs7 qs7Var = (qs7) obj;
        if (Float.compare(this.a, qs7Var.a) != 0 || !Objects.equals(this.b, qs7Var.b) || !Objects.equals(this.c, qs7Var.c)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = Float.hashCode(this.a) * 31;
        int i2 = 0;
        ps7 ps7Var = this.b;
        if (ps7Var != null) {
            i = ps7Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = (hashCode + i) * 31;
        ps7 ps7Var2 = this.c;
        if (ps7Var2 != null) {
            i2 = ps7Var2.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        return "ReplayGain Xing/Info: peak=" + this.a + ", field 1=" + this.b + ", field 2=" + this.c;
    }
}
