package defpackage;

import android.util.Pair;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aac  reason: default package */
/* loaded from: classes.dex */
public abstract class aac {
    public static final x9c a = new Object();

    /* JADX WARN: Type inference failed for: r0v0, types: [x9c, java.lang.Object] */
    static {
        a2d.K(0);
        a2d.K(1);
        a2d.K(2);
    }

    public int a(boolean z) {
        if (p()) {
            return -1;
        }
        return 0;
    }

    public abstract int b(Object obj);

    public int c(boolean z) {
        if (p()) {
            return -1;
        }
        return o() - 1;
    }

    public final int d(int i, y9c y9cVar, z9c z9cVar, int i2, boolean z) {
        int i3 = f(i, y9cVar, false).c;
        if (m(i3, z9cVar, 0L).n == i) {
            int e = e(i3, i2, z);
            if (e == -1) {
                return -1;
            }
            return m(e, z9cVar, 0L).m;
        }
        return i + 1;
    }

    public int e(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == c(z)) {
                        return a(z);
                    }
                    return i + 1;
                }
                vm1.d();
                return 0;
            }
            return i;
        } else if (i == c(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public boolean equals(Object obj) {
        int c;
        if (this != obj) {
            if (obj instanceof aac) {
                aac aacVar = (aac) obj;
                if (aacVar.o() == o() && aacVar.h() == h()) {
                    z9c z9cVar = new z9c();
                    y9c y9cVar = new y9c();
                    z9c z9cVar2 = new z9c();
                    y9c y9cVar2 = new y9c();
                    int i = 0;
                    while (true) {
                        if (i < o()) {
                            if (!m(i, z9cVar, 0L).equals(aacVar.m(i, z9cVar2, 0L))) {
                                break;
                            }
                            i++;
                        } else {
                            int i2 = 0;
                            while (true) {
                                if (i2 < h()) {
                                    if (!f(i2, y9cVar, true).equals(aacVar.f(i2, y9cVar2, true))) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    int a2 = a(true);
                                    if (a2 == aacVar.a(true) && (c = c(true)) == aacVar.c(true)) {
                                        while (a2 != c) {
                                            int e = e(a2, 0, true);
                                            if (e == aacVar.e(a2, 0, true)) {
                                                a2 = e;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public abstract y9c f(int i, y9c y9cVar, boolean z);

    public y9c g(Object obj, y9c y9cVar) {
        return f(b(obj), y9cVar, true);
    }

    public abstract int h();

    public int hashCode() {
        z9c z9cVar = new z9c();
        y9c y9cVar = new y9c();
        int o = o() + 217;
        for (int i = 0; i < o(); i++) {
            o = (o * 31) + m(i, z9cVar, 0L).hashCode();
        }
        int h = h() + (o * 31);
        for (int i2 = 0; i2 < h(); i2++) {
            h = (h * 31) + f(i2, y9cVar, true).hashCode();
        }
        int a2 = a(true);
        while (a2 != -1) {
            h = (h * 31) + a2;
            a2 = e(a2, 0, true);
        }
        return h;
    }

    public final Pair i(z9c z9cVar, y9c y9cVar, int i, long j) {
        Pair j2 = j(z9cVar, y9cVar, i, j, 0L);
        j2.getClass();
        return j2;
    }

    public final Pair j(z9c z9cVar, y9c y9cVar, int i, long j, long j2) {
        wq9.w(i, o());
        m(i, z9cVar, j2);
        if (j == -9223372036854775807L) {
            j = z9cVar.k;
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = z9cVar.m;
        f(i2, y9cVar, false);
        while (i2 < z9cVar.n && y9cVar.e != j) {
            int i3 = i2 + 1;
            if (f(i3, y9cVar, false).e > j) {
                break;
            }
            i2 = i3;
        }
        f(i2, y9cVar, true);
        long j3 = j - y9cVar.e;
        long j4 = y9cVar.d;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        long max = Math.max(0L, j3);
        Object obj = y9cVar.b;
        obj.getClass();
        return Pair.create(obj, Long.valueOf(max));
    }

    public int k(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == a(z)) {
                        return c(z);
                    }
                    return i - 1;
                }
                vm1.d();
                return 0;
            }
            return i;
        } else if (i == a(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    public abstract Object l(int i);

    public abstract z9c m(int i, z9c z9cVar, long j);

    public final void n(int i, z9c z9cVar) {
        m(i, z9cVar, 0L);
    }

    public abstract int o();

    public final boolean p() {
        if (o() == 0) {
            return true;
        }
        return false;
    }
}
