package defpackage;

import java.io.InputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dcc  reason: default package */
/* loaded from: classes.dex */
public abstract class dcc {
    public int a;
    public int b = -1;
    public Object c;

    public dcc(acc accVar) {
        this.c = accVar;
    }

    public static dcc n(InputStream inputStream, int i) {
        if (i > 0) {
            if (inputStream == null) {
                tzd tzdVar = new tzd(d1e.a);
                try {
                    tzdVar.g(0);
                    return tzdVar;
                } catch (i1e e) {
                    xk5.m(e);
                    return null;
                }
            }
            return new vzd(inputStream, i);
        }
        vs.m("bufferSize must be > 0");
        return null;
    }

    public static int p(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }

    public static long q(long j) {
        return (j >>> 1) ^ (-(1 & j));
    }

    public abstract int A();

    public abstract boolean B();

    public abstract String C();

    public abstract String D();

    public abstract rzd E();

    public abstract byte[] F();

    public abstract int G();

    public abstract int H();

    public abstract int I();

    public abstract long J();

    public abstract int K();

    public abstract long L();

    public abstract int M();

    public abstract long N();

    public boolean a() {
        if (((acc) this.c) == acc.d) {
            return true;
        }
        return false;
    }

    public boolean b() {
        if (((acc) this.c) == acc.a) {
            return true;
        }
        return false;
    }

    public boolean c() {
        if (((acc) this.c) == acc.C) {
            return true;
        }
        return false;
    }

    public boolean d() {
        if (((acc) this.c) == acc.c) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (((acc) this.c) == acc.b) {
            return true;
        }
        return false;
    }

    public abstract void f();

    public abstract int g(int i);

    public abstract void h(int i);

    public abstract int i();

    public abstract boolean j();

    public abstract int k();

    public abstract int l(byte[] bArr, int i, int i2);

    public abstract void m(int i);

    public void o() {
        int r;
        do {
            r = r();
            if (r != 0) {
                int i = this.a;
                int i2 = this.b;
                if (i + i2 < 100) {
                    this.b = i2 + 1;
                    this.b--;
                } else {
                    hfd.s("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
                    return;
                }
            } else {
                return;
            }
        } while (t(r));
    }

    public abstract int r();

    public abstract void s(int i);

    public abstract boolean t(int i);

    public abstract double u();

    public abstract float v();

    public abstract long w();

    public abstract long x();

    public abstract int y();

    public abstract long z();
}
