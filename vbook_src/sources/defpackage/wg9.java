package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wg9  reason: default package */
/* loaded from: classes.dex */
public final class wg9 {
    public final int a;
    public final int b;
    public final int c;

    public wg9(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wg9)) {
            return false;
        }
        wg9 wg9Var = (wg9) obj;
        if (this.a == wg9Var.a && this.b == wg9Var.b && this.c == wg9Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + hl5.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        return this.b + "," + this.c + ":" + this.a;
    }
}
