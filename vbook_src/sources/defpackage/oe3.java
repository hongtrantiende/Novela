package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: oe3  reason: default package */
/* loaded from: classes3.dex */
public final class oe3 extends v59 {
    public static final oe3 c = new v59(bf3.a);

    @Override // defpackage.w0
    public final int i(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        return dArr.length;
    }

    @Override // defpackage.ql1, defpackage.w0
    public final void k(fx1 fx1Var, int i, Object obj) {
        ke3 ke3Var = (ke3) obj;
        ke3Var.getClass();
        double g = fx1Var.g(this.b, i);
        ke3Var.b(ke3Var.d() + 1);
        double[] dArr = ke3Var.a;
        int i2 = ke3Var.b;
        ke3Var.b = i2 + 1;
        dArr[i2] = g;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ke3, java.lang.Object] */
    @Override // defpackage.w0
    public final Object l(Object obj) {
        double[] dArr = (double[]) obj;
        dArr.getClass();
        ?? obj2 = new Object();
        obj2.a = dArr;
        obj2.b = dArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.v59
    public final Object o() {
        return new double[0];
    }

    @Override // defpackage.v59
    public final void p(jbe jbeVar, Object obj, int i) {
        double[] dArr = (double[]) obj;
        jbeVar.getClass();
        dArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            double d = dArr[i2];
            u59 u59Var = this.b;
            u59Var.getClass();
            jbeVar.s(u59Var, i2);
            jbeVar.r(d);
        }
    }
}
