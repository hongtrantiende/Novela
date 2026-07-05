package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e67  reason: default package */
/* loaded from: classes.dex */
public final class e67 {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public e67(Object obj, int i, int i2, long j, int i3) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = j;
        this.e = i3;
    }

    public final e67 a(Object obj) {
        if (this.a.equals(obj)) {
            return this;
        }
        return new e67(obj, this.b, this.c, this.d, this.e);
    }

    public final boolean b() {
        if (this.b != -1) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e67)) {
            return false;
        }
        e67 e67Var = (e67) obj;
        if (this.a.equals(e67Var.a) && this.b == e67Var.b && this.c == e67Var.c && this.d == e67Var.d && this.e == e67Var.e) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() + 527) * 31) + this.b) * 31) + this.c) * 31) + ((int) this.d)) * 31) + this.e;
    }

    public e67(Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public e67(Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }

    public e67(Object obj) {
        this(obj, -1L);
    }
}
