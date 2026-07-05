package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bna  reason: default package */
/* loaded from: classes.dex */
public final class bna {
    public static final bna c = new bna(-1, -1);
    public final int a;
    public final int b;

    static {
        new bna(0, 0);
        a2d.K(0);
        a2d.K(1);
    }

    public bna(int i, int i2) {
        boolean z;
        if ((i != -1 && i < 0) || (i2 != -1 && i2 < 0)) {
            z = false;
        } else {
            z = true;
        }
        wq9.s(z);
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof bna) {
            bna bnaVar = (bna) obj;
            if (this.a == bnaVar.a && this.b == bnaVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.a;
        int i2 = i << 16;
        return this.b ^ ((i >>> 16) | i2);
    }

    public final String toString() {
        return this.a + "x" + this.b;
    }
}
