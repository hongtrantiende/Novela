package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q57  reason: default package */
/* loaded from: classes.dex */
public final class q57 {
    public final ms2 c;
    public final ggb d;
    public final q6 e;
    public long f;
    public int g;
    public boolean h;
    public o57 i;
    public o57 j;
    public o57 k;
    public o57 l;
    public o57 m;
    public int n;
    public Object o;
    public long p;
    public final y9c a = new y9c();
    public final z9c b = new z9c();
    public ArrayList q = new ArrayList();

    public q57(ms2 ms2Var, ggb ggbVar, q6 q6Var, rz3 rz3Var) {
        this.c = ms2Var;
        this.d = ggbVar;
        this.e = q6Var;
    }

    public static e67 o(aac aacVar, Object obj, long j, long j2, z9c z9cVar, y9c y9cVar) {
        aacVar.g(obj, y9cVar);
        aacVar.n(y9cVar.c, z9cVar);
        aacVar.b(obj);
        int i = y9cVar.g.a;
        if (i != 0) {
            if (i == 1) {
                y9cVar.f(0);
            }
            y9cVar.g.getClass();
            y9cVar.g(0);
        }
        aacVar.g(obj, y9cVar);
        int c = y9cVar.c(j);
        if (c == -1) {
            return new e67(obj, j2, y9cVar.b(j));
        }
        return new e67(obj, c, y9cVar.e(c), j2, -1);
    }

    public final o57 a() {
        o57 o57Var = this.i;
        if (o57Var == null) {
            return null;
        }
        if (o57Var == this.j) {
            this.j = o57Var.m;
        }
        if (o57Var == this.k) {
            this.k = o57Var.m;
        }
        o57Var.i();
        int i = this.n - 1;
        this.n = i;
        if (i == 0) {
            this.l = null;
            o57 o57Var2 = this.i;
            this.o = o57Var2.b;
            this.p = o57Var2.g.a.d;
        }
        this.i = this.i.m;
        l();
        return this.i;
    }

    public final void b() {
        if (this.n == 0) {
            return;
        }
        o57 o57Var = this.i;
        o57Var.getClass();
        this.o = o57Var.b;
        this.p = o57Var.g.a.d;
        while (o57Var != null) {
            o57Var.i();
            o57Var = o57Var.m;
        }
        this.i = null;
        this.l = null;
        this.j = null;
        this.k = null;
        this.n = 0;
        l();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.p57 c(defpackage.aac r21, defpackage.o57 r22, long r23) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q57.c(aac, o57, long):p57");
    }

    public final p57 d(aac aacVar, e67 e67Var, long j, long j2, long j3) {
        aacVar.g(e67Var.a, this.a);
        boolean b = e67Var.b();
        Object obj = e67Var.a;
        if (b) {
            return e(aacVar, obj, e67Var.b, e67Var.c, j, e67Var.d, false);
        }
        return f(aacVar, obj, j2, j3, j, e67Var.d, false);
    }

    public final p57 e(aac aacVar, Object obj, int i, int i2, long j, long j2, boolean z) {
        e67 e67Var = new e67(obj, i, i2, j2, -1);
        y9c y9cVar = this.a;
        long a = aacVar.g(obj, y9cVar).a(i, i2);
        if (i2 == y9cVar.e(i)) {
            y9cVar.g.getClass();
        }
        y9cVar.g(i);
        long j3 = 0;
        if (a != -9223372036854775807L && 0 >= a) {
            j3 = Math.max(0L, a - 1);
        }
        return new p57(e67Var, j3, -9223372036854775807L, j, -9223372036854775807L, a, z, false, false, false, false);
    }

    public final p57 f(aac aacVar, Object obj, long j, long j2, long j3, long j4, boolean z) {
        long j5;
        long j6;
        long j7;
        y9c y9cVar = this.a;
        aacVar.g(obj, y9cVar);
        int b = y9cVar.b(j);
        boolean z2 = false;
        if (b == -1) {
            if (y9cVar.g.a > 0) {
                y9cVar.g(0);
            }
        } else {
            y9cVar.g(b);
        }
        e67 e67Var = new e67(obj, j4, b);
        if (!e67Var.b() && b == -1) {
            z2 = true;
        }
        boolean j8 = j(aacVar, e67Var);
        boolean i = i(aacVar, e67Var, z2);
        if (b != -1) {
            y9cVar.g(b);
        }
        if (b != -1) {
            y9cVar.f(b);
        }
        if (b != -1) {
            y9cVar.d(b);
            j5 = 0;
        } else {
            j5 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && j5 != Long.MIN_VALUE) {
            j6 = j5;
        } else {
            j6 = y9cVar.d;
        }
        if (j6 != -9223372036854775807L && j >= j6) {
            j7 = Math.max(0L, j6 - 1);
        } else {
            j7 = j;
        }
        return new p57(e67Var, j7, j2, j3, j5, j6, z, false, z2, j8, i);
    }

    public final o57 g() {
        return this.k;
    }

    public final p57 h(aac aacVar, p57 p57Var) {
        boolean z;
        long j;
        long j2;
        e67 e67Var = p57Var.a;
        boolean b = e67Var.b();
        int i = e67Var.e;
        if (!b && i == -1) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = z;
        int i2 = e67Var.b;
        boolean j3 = j(aacVar, e67Var);
        boolean i3 = i(aacVar, e67Var, z2);
        Object obj = e67Var.a;
        y9c y9cVar = this.a;
        aacVar.g(obj, y9cVar);
        if (!e67Var.b() && i != -1) {
            y9cVar.d(i);
            j = 0;
        } else {
            j = -9223372036854775807L;
        }
        if (e67Var.b()) {
            j2 = y9cVar.a(i2, e67Var.c);
        } else if (j != -9223372036854775807L && j != Long.MIN_VALUE) {
            j2 = j;
        } else {
            j2 = y9cVar.d;
        }
        if (e67Var.b()) {
            y9cVar.g(i2);
        } else if (i != -1) {
            y9cVar.g(i);
        }
        return new p57(e67Var, p57Var.b, p57Var.c, p57Var.d, j, j2, p57Var.g, false, z2, j3, i3);
    }

    public final boolean i(aac aacVar, e67 e67Var, boolean z) {
        int b = aacVar.b(e67Var.a);
        if (!aacVar.m(aacVar.f(b, this.a, false).c, this.b, 0L).h) {
            if (aacVar.d(b, this.a, this.b, this.g, this.h) == -1 && z) {
                return true;
            }
        }
        return false;
    }

    public final boolean j(aac aacVar, e67 e67Var) {
        boolean z;
        if (!e67Var.b() && e67Var.e == -1) {
            z = true;
        } else {
            z = false;
        }
        Object obj = e67Var.a;
        if (z) {
            if (aacVar.m(aacVar.g(obj, this.a).c, this.b, 0L).n == aacVar.b(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k() {
        o57 o57Var = this.m;
        if (o57Var == null || o57Var.h()) {
            this.m = null;
            for (int i = 0; i < this.q.size(); i++) {
                o57 o57Var2 = (o57) this.q.get(i);
                if (!o57Var2.h()) {
                    this.m = o57Var2;
                    return;
                }
            }
        }
    }

    public final void l() {
        e67 e67Var;
        ls5 i = qs5.i();
        for (o57 o57Var = this.i; o57Var != null; o57Var = o57Var.m) {
            i.b(o57Var.g.a);
        }
        o57 o57Var2 = this.j;
        if (o57Var2 == null) {
            e67Var = null;
        } else {
            e67Var = o57Var2.g.a;
        }
        this.d.d(new bn(5, this, i, e67Var));
    }

    public final void m(long j) {
        boolean z;
        o57 o57Var = this.l;
        if (o57Var != null) {
            if (o57Var.m == null) {
                z = true;
            } else {
                z = false;
            }
            wq9.D(z);
            if (o57Var.e) {
                o57Var.a.x(j - o57Var.p);
            }
        }
    }

    public final int n(o57 o57Var) {
        o57Var.getClass();
        int i = 0;
        if (o57Var != this.l) {
            this.l = o57Var;
            while (true) {
                o57Var = o57Var.m;
                if (o57Var == null) {
                    break;
                }
                if (o57Var == this.j) {
                    o57 o57Var2 = this.i;
                    this.j = o57Var2;
                    this.k = o57Var2;
                    i = 3;
                }
                if (o57Var == this.k) {
                    this.k = this.j;
                    i |= 2;
                }
                o57Var.i();
                this.n--;
            }
            o57 o57Var3 = this.l;
            o57Var3.getClass();
            if (o57Var3.m != null) {
                o57Var3.b();
                o57Var3.m = null;
                o57Var3.c();
            }
            l();
        }
        return i;
    }

    public final e67 p(aac aacVar, Object obj, long j) {
        long q;
        int b;
        Object obj2 = obj;
        y9c y9cVar = this.a;
        int i = aacVar.g(obj2, y9cVar).c;
        Object obj3 = this.o;
        if (obj3 != null && (b = aacVar.b(obj3)) != -1 && aacVar.f(b, y9cVar, false).c == i) {
            q = this.p;
        } else {
            o57 o57Var = this.i;
            while (true) {
                if (o57Var != null) {
                    if (o57Var.b.equals(obj2)) {
                        q = o57Var.g.a.d;
                        break;
                    }
                    o57Var = o57Var.m;
                } else {
                    o57 o57Var2 = this.i;
                    while (true) {
                        if (o57Var2 != null) {
                            int b2 = aacVar.b(o57Var2.b);
                            if (b2 != -1 && aacVar.f(b2, y9cVar, false).c == i) {
                                q = o57Var2.g.a.d;
                                break;
                            }
                            o57Var2 = o57Var2.m;
                        } else {
                            q = q(obj2);
                            if (q == -1) {
                                q = this.f;
                                this.f = 1 + q;
                                if (this.i == null) {
                                    this.o = obj2;
                                    this.p = q;
                                }
                            }
                        }
                    }
                }
            }
        }
        aacVar.g(obj2, y9cVar);
        int i2 = y9cVar.c;
        z9c z9cVar = this.b;
        aacVar.n(i2, z9cVar);
        boolean z = false;
        for (int b3 = aacVar.b(obj); b3 >= z9cVar.m; b3--) {
            boolean z2 = true;
            aacVar.f(b3, y9cVar, true);
            if (y9cVar.g.a <= 0) {
                z2 = false;
            }
            z |= z2;
            if (y9cVar.c(y9cVar.d) != -1) {
                obj2 = y9cVar.b;
                obj2.getClass();
            }
            if (z && (!z2 || y9cVar.d != 0)) {
                break;
            }
        }
        return o(aacVar, obj2, j, q, this.b, this.a);
    }

    public final long q(Object obj) {
        for (int i = 0; i < this.q.size(); i++) {
            o57 o57Var = (o57) this.q.get(i);
            if (o57Var.b.equals(obj)) {
                return o57Var.g.a.d;
            }
        }
        return -1L;
    }

    public final int r(aac aacVar) {
        aac aacVar2;
        o57 o57Var;
        o57 o57Var2 = this.i;
        if (o57Var2 == null) {
            return 0;
        }
        int b = aacVar.b(o57Var2.b);
        while (true) {
            aacVar2 = aacVar;
            b = aacVar2.d(b, this.a, this.b, this.g, this.h);
            while (true) {
                o57Var = o57Var2.m;
                if (o57Var == null || o57Var2.g.i) {
                    break;
                }
                o57Var2 = o57Var;
            }
            if (b == -1 || o57Var == null || aacVar2.b(o57Var.b) != b) {
                break;
            }
            o57Var2 = o57Var;
            aacVar = aacVar2;
        }
        int n = n(o57Var2);
        o57Var2.g = h(aacVar2, o57Var2.g);
        return n;
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d9 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int s(defpackage.aac r23, long r24, long r26, long r28) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q57.s(aac, long, long, long):int");
    }
}
