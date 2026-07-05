package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e7e  reason: default package */
/* loaded from: classes.dex */
public abstract class e7e {
    public static final boolean b = b9e.d;
    public k57 a;

    public static int n(int i, s6e s6eVar) {
        int t = t(i << 3);
        int b2 = s6eVar.b();
        return eub.y(b2, b2, t);
    }

    public static int r(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int s(int i) {
        return t(i << 3);
    }

    public static int t(int i) {
        return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
    }

    public abstract void a(byte b2);

    public abstract void b(int i);

    public abstract void c(int i, int i2);

    public abstract void d(int i, long j);

    public abstract void e(int i, String str);

    public abstract void f(int i, s6e s6eVar);

    public abstract void g(int i, boolean z);

    public abstract void h(long j);

    public abstract void i(byte[] bArr, int i, int i2);

    public abstract void j(int i);

    public abstract void k(int i, int i2);

    public abstract void l(int i, long j);

    public abstract void m(long j);

    public abstract void o(int i);

    public abstract void p(int i, int i2);

    public abstract void q(int i, int i2);
}
