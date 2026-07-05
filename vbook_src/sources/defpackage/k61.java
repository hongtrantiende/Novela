package defpackage;

import android.graphics.Bitmap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k61  reason: default package */
/* loaded from: classes.dex */
public interface k61 {
    static void m(k61 k61Var, jj jjVar, long j, long j2, long j3, ljc ljcVar, int i) {
        long j4;
        Bitmap bitmap = jjVar.a;
        if ((i & 4) != 0) {
            j = (bitmap.getHeight() & 4294967295L) | (bitmap.getWidth() << 32);
        }
        long j5 = j;
        if ((i & 8) != 0) {
            j4 = 0;
        } else {
            j4 = j2;
        }
        k61Var.a(jjVar, 0L, j5, j4, j3, ljcVar);
    }

    static void r(k61 k61Var, rk9 rk9Var) {
        k61Var.getClass();
        k61Var.o(rk9Var.a, rk9Var.b, rk9Var.c, rk9Var.d, 1);
    }

    void a(nl5 nl5Var, long j, long j2, long j3, long j4, ljc ljcVar);

    void b(yj yjVar, ljc ljcVar);

    void c(float f, float f2);

    void d(float f);

    void e(float f, float f2, float f3, float f4, float f5, float f6, ljc ljcVar);

    void f(yj yjVar, int i);

    void g(float f, float f2, float f3, float f4, ljc ljcVar);

    void h(rk9 rk9Var, ljc ljcVar);

    void i();

    void j();

    void k(float[] fArr);

    void l(nl5 nl5Var, long j, ljc ljcVar);

    void n(float f, long j, ljc ljcVar);

    void o(float f, float f2, float f3, float f4, int i);

    void p(float f, float f2);

    void q();

    void s(long j, long j2, ljc ljcVar);

    void t();

    void u(float f, float f2, float f3, float f4, float f5, float f6, boolean z, ljc ljcVar);
}
