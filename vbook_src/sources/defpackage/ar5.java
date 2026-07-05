package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ar5  reason: default package */
/* loaded from: classes.dex */
public final class ar5 {
    public static int k;
    public static final abf l = new abf(26);
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final j4d f;
    public final long g;
    public final int h;
    public final boolean i;
    public final int j;

    public ar5(String str, float f, float f2, float f3, float f4, j4d j4dVar, long j, int i, boolean z) {
        int i2;
        synchronized (l) {
            i2 = k;
            k = i2 + 1;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j4dVar;
        this.g = j;
        this.h = i;
        this.i = z;
        this.j = i2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ar5) {
                ar5 ar5Var = (ar5) obj;
                if (c16.i(this.a, ar5Var.a) && rg3.b(this.b, ar5Var.b) && rg3.b(this.c, ar5Var.c) && this.d == ar5Var.d && this.e == ar5Var.e && this.f.equals(ar5Var.f) && zl1.c(this.g, ar5Var.g) && this.h == ar5Var.h && this.i == ar5Var.i) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int d = nk2.d(this.e, nk2.d(this.d, nk2.d(this.c, nk2.d(this.b, this.a.hashCode() * 31, 31), 31), 31), 31);
        int i = zl1.j;
        return Boolean.hashCode(this.i) + hl5.a(this.h, hl5.c((this.f.hashCode() + d) * 31, this.g, 31), 31);
    }
}
