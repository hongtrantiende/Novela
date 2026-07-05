package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ec6  reason: default package */
/* loaded from: classes.dex */
public final class ec6 implements yf0 {
    public final p15 a;
    public final xt4 b;
    public final hm8 c;
    public x16 d;

    public ec6(p15 p15Var, xt4 xt4Var) {
        p15Var.getClass();
        xt4Var.getClass();
        this.a = p15Var;
        this.b = xt4Var;
        this.c = yae.z(null);
    }

    @Override // defpackage.yf0
    public final boolean a() {
        return true;
    }

    @Override // defpackage.yf0
    public final void b(ak3 ak3Var, r13 r13Var, sc6 sc6Var, xt4 xt4Var) {
        sc6 sc6Var2;
        long i;
        ak3Var.getClass();
        r13Var.getClass();
        if (sc6Var == null || (sc6Var2 = (sc6) this.c.getValue()) == null) {
            return;
        }
        ij1 Q0 = ak3Var.Q0();
        long G = Q0.G();
        Q0.w().i();
        try {
            mu9 mu9Var = (mu9) Q0.b;
            if (xt4Var != null) {
                c().a(mu9Var, r13Var, xt4Var);
            }
            try {
                i = sc6.o(sc6Var2, sc6Var, 6);
            } catch (Exception unused) {
                i = y78.i(sc6Var.m(0L), sc6Var2.m(0L));
            }
            mu9Var.D(-Float.intBitsToFloat((int) (i >> 32)), -Float.intBitsToFloat((int) (i & 4294967295L)));
            npe.p(ak3Var, this.a);
        } finally {
            rs8.r(Q0, G);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, x16] */
    public final x16 c() {
        x16 x16Var = this.d;
        if (x16Var != null) {
            x16Var.a = 9205357640488583168L;
            x16Var.b = 1.0f;
            x16Var.c = 1.0f;
            x16Var.d = 1.0f;
            x16Var.e = 1.0f;
            int i = u15.b;
            x16Var.f = nae.e;
            long j = ckc.b;
            x16Var.C = null;
            return x16Var;
        }
        ?? obj = new Object();
        obj.a = 9205357640488583168L;
        obj.b = 1.0f;
        obj.c = 1.0f;
        obj.d = 1.0f;
        obj.e = 1.0f;
        int i2 = u15.b;
        long j2 = ckc.b;
        this.d = obj;
        return obj;
    }

    public final void d(i38 i38Var) {
        this.c.setValue(i38Var);
    }
}
