package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mh8  reason: default package */
/* loaded from: classes.dex */
public final class mh8 {
    public final float a;
    public final List b;

    public mh8(int i, float f) {
        this((i & 1) != 0 ? nae.e : f, ks3.a);
    }

    public final mh8 a(mh8 mh8Var) {
        return new mh8(this.a + mh8Var.a, sl1.n0(this.b, mh8Var.b));
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof mh8) {
                mh8 mh8Var = (mh8) obj;
                if (!rg3.b(this.a, mh8Var.a) || !c16.i(this.b, mh8Var.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.b.hashCode() + (Float.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "PaddingDimension(dp=" + ((Object) rg3.c(this.a)) + ", resourceIds=" + this.b + ')';
    }

    public mh8(float f, List list) {
        this.a = f;
        this.b = list;
    }
}
