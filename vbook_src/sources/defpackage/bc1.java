package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bc1  reason: default package */
/* loaded from: classes3.dex */
public final class bc1 extends v59 {
    public static final bc1 c = new v59(rc1.a);

    @Override // defpackage.w0
    public final int i(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        return cArr.length;
    }

    @Override // defpackage.ql1, defpackage.w0
    public final void k(fx1 fx1Var, int i, Object obj) {
        ub1 ub1Var = (ub1) obj;
        ub1Var.getClass();
        char h = fx1Var.h(this.b, i);
        ub1Var.b(ub1Var.d() + 1);
        char[] cArr = ub1Var.a;
        int i2 = ub1Var.b;
        ub1Var.b = i2 + 1;
        cArr[i2] = h;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ub1, java.lang.Object] */
    @Override // defpackage.w0
    public final Object l(Object obj) {
        char[] cArr = (char[]) obj;
        cArr.getClass();
        ?? obj2 = new Object();
        obj2.a = cArr;
        obj2.b = cArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.v59
    public final Object o() {
        return new char[0];
    }

    @Override // defpackage.v59
    public final void p(jbe jbeVar, Object obj, int i) {
        char[] cArr = (char[]) obj;
        jbeVar.getClass();
        cArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            char c2 = cArr[i2];
            u59 u59Var = this.b;
            u59Var.getClass();
            jbeVar.s(u59Var, i2);
            jbeVar.q(c2);
        }
    }
}
