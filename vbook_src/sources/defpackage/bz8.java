package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bz8  reason: default package */
/* loaded from: classes.dex */
public final class bz8 {
    public final Object a;
    public final int b;
    public final f57 c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        a82.s(0, 1, 2, 3, 4);
        a2d.K(5);
        a2d.K(6);
    }

    public bz8(Object obj, int i, f57 f57Var, Object obj2, int i2, long j, long j2, int i3, int i4) {
        boolean z;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        wq9.s(z);
        wq9.s(i2 >= 0);
        this.a = obj;
        this.b = i;
        this.c = f57Var;
        this.d = obj2;
        this.e = i2;
        this.f = j;
        this.g = j2;
        this.h = i3;
        this.i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bz8.class == obj.getClass()) {
            bz8 bz8Var = (bz8) obj;
            if (this.b == bz8Var.b && this.e == bz8Var.e && this.f == bz8Var.f && this.g == bz8Var.g && this.h == bz8Var.h && this.i == bz8Var.i && Objects.equals(this.c, bz8Var.c) && Objects.equals(this.a, bz8Var.a) && Objects.equals(this.d, bz8Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), this.c, this.d, Integer.valueOf(this.e), Long.valueOf(this.f), Long.valueOf(this.g), Integer.valueOf(this.h), Integer.valueOf(this.i));
    }

    public final String toString() {
        String str = "mediaItem=" + this.b + ", period=" + this.e + ", pos=" + this.f;
        int i = this.h;
        if (i == -1) {
            return str;
        }
        return str + ", contentPos=" + this.g + ", adGroup=" + i + ", ad=" + this.i;
    }
}
