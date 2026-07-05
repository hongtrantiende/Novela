package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ms6  reason: default package */
/* loaded from: classes.dex */
public abstract class ms6 {
    public static final float a;
    public static final float b;
    public static final List c;
    public static final List d;
    public static final float e;

    static {
        float f;
        char c2;
        long j;
        char c3;
        xu9 xu9Var;
        float f2 = ch0.n;
        a = f2;
        float f3 = ch0.l;
        b = f3;
        float f4 = ch0.i;
        abf abfVar = f27.a;
        xu9 u = abfVar.u();
        xu9 s = abf.s();
        xu9 xu9Var2 = f27.k;
        if (xu9Var2 == null) {
            f = 0.5f;
            j = 4294967295L;
            c2 = ' ';
            xu9Var2 = abf.n(abfVar, tl1.B(new e27((Float.floatToRawIntBits(-0.009f) & 4294967295L) | (Float.floatToRawIntBits(0.5f) << 32), new x72(2, 0.172f)), new e27((Float.floatToRawIntBits(1.03f) << 32) | (Float.floatToRawIntBits(0.365f) & 4294967295L), new x72(2, 0.164f)), new e27((Float.floatToRawIntBits(0.828f) << 32) | (Float.floatToRawIntBits(0.97f) & 4294967295L), new x72(2, 0.169f))), 1, 4).b();
            f27.k = xu9Var2;
        } else {
            f = 0.5f;
            c2 = ' ';
            j = 4294967295L;
        }
        xu9 xu9Var3 = f27.i;
        if (xu9Var3 == null) {
            c3 = c2;
            xu9Var3 = abf.n(abfVar, tl1.B(new e27((Float.floatToRawIntBits(0.039f) & j) | (Float.floatToRawIntBits(0.961f) << c2), new x72(2, 0.426f)), new e27((Float.floatToRawIntBits(1.001f) << c3) | (Float.floatToRawIntBits(0.428f) & j), x72.c), new e27((Float.floatToRawIntBits(1.0f) << c3) | (Float.floatToRawIntBits(0.609f) & j), new x72(2, 1.0f))), 2, 4).b();
            f27.i = xu9Var3;
        } else {
            c3 = c2;
        }
        xu9 xu9Var4 = f27.l;
        if (xu9Var4 == null) {
            xu9Var4 = w92.w(8, 0.8f, f27.b).b();
            f27.l = xu9Var4;
        }
        xu9 xu9Var5 = f27.m;
        if (xu9Var5 == null) {
            xu9Var = xu9Var3;
            xu9Var5 = abf.n(abfVar, tl1.B(new e27((Float.floatToRawIntBits(1.237f) << c3) | (Float.floatToRawIntBits(1.236f) & j), new x72(2, 0.258f)), new e27((Float.floatToRawIntBits(0.918f) & j) | (Float.floatToRawIntBits(f) << c3), new x72(2, 0.233f))), 4, 12).b();
            f27.m = xu9Var5;
        } else {
            xu9Var = xu9Var3;
        }
        xu9 xu9Var6 = f27.h;
        if (xu9Var6 == null) {
            float[] a2 = l27.a();
            l27.h(a2, 1.0f, 0.64f);
            xu9Var6 = w92.p(15).c(new f7(a2, 2)).c(new f7(f27.d, 2)).b();
            f27.h = xu9Var6;
        }
        c = tl1.B(u, s, xu9Var2, xu9Var, xu9Var4, xu9Var5, xu9Var6);
        xu9 xu9Var7 = f27.f;
        if (xu9Var7 == null) {
            xu9Var7 = w92.p(14).b();
            f27.f = xu9Var7;
        }
        float[] a3 = l27.a();
        l27.g(18.0f, a3);
        d = tl1.B(xu9Var7.c(new f7(a3, 2)), abfVar.u());
        e = f4 / Math.min(f2, f3);
    }
}
