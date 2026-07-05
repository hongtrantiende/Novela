package defpackage;

import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: y9c  reason: default package */
/* loaded from: classes.dex */
public final class y9c {
    public Object a;
    public Object b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public c7 g = c7.c;

    static {
        a82.s(0, 1, 2, 3, 4);
    }

    public final long a(int i, int i2) {
        a7 a = this.g.a(i);
        if (a.a != -1) {
            return a.f[i2];
        }
        return -9223372036854775807L;
    }

    public final int b(long j) {
        int i;
        a7 a;
        int i2;
        c7 c7Var = this.g;
        long j2 = this.d;
        int i3 = c7Var.a;
        if (j != Long.MIN_VALUE && (j2 == -9223372036854775807L || j < j2)) {
            int i4 = 0;
            while (i4 < i3) {
                c7Var.a(i4).getClass();
                c7Var.a(i4).getClass();
                if (0 > j && ((i2 = (a = c7Var.a(i4)).a) == -1 || a.a(-1) < i2)) {
                    break;
                }
                i4++;
            }
            if (i4 < i3) {
                if (i != 0) {
                    c7Var.a(i4).getClass();
                    if (0 <= j2) {
                    }
                }
                return i4;
            }
        }
        return -1;
    }

    public final int c(long j) {
        c7 c7Var = this.g;
        int i = c7Var.a;
        int i2 = i - 1;
        if (i2 == i - 1) {
            c7Var.a(i2).getClass();
        }
        while (i2 >= 0 && j != Long.MIN_VALUE) {
            c7Var.a(i2).getClass();
            if (j >= 0) {
                break;
            }
            i2--;
        }
        if (i2 >= 0) {
            a7 a = c7Var.a(i2);
            int i3 = a.a;
            if (i3 != -1) {
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = a.e[i4];
                    if (i5 != 0 && i5 != 1) {
                    }
                }
            }
            return i2;
        }
        return -1;
    }

    public final long d(int i) {
        this.g.a(i).getClass();
        return 0L;
    }

    public final int e(int i) {
        return this.g.a(i).a(-1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && y9c.class.equals(obj.getClass())) {
                y9c y9cVar = (y9c) obj;
                if (Objects.equals(this.a, y9cVar.a) && Objects.equals(this.b, y9cVar.b) && this.c == y9cVar.c && this.d == y9cVar.d && this.e == y9cVar.e && this.f == y9cVar.f && Objects.equals(this.g, y9cVar.g)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final boolean f(int i) {
        c7 c7Var = this.g;
        int i2 = c7Var.a;
        if (i == i2 - 1 && i == i2 - 1) {
            c7Var.a(i).getClass();
            return false;
        }
        return false;
    }

    public final boolean g(int i) {
        this.g.a(i).getClass();
        return false;
    }

    public final void h(Object obj, Object obj2, int i, long j, long j2, c7 c7Var, boolean z) {
        this.a = obj;
        this.b = obj2;
        this.c = i;
        this.d = j;
        this.e = j2;
        this.g = c7Var;
        this.f = z;
    }

    public final int hashCode() {
        int hashCode;
        Object obj = this.a;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = (217 + hashCode) * 31;
        Object obj2 = this.b;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        long j = this.d;
        long j2 = this.e;
        return this.g.hashCode() + ((((((((((i2 + i) * 31) + this.c) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.f ? 1 : 0)) * 31);
    }
}
