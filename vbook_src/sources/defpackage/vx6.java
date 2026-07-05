package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vx6  reason: default package */
/* loaded from: classes3.dex */
public final class vx6 extends v59 {
    public static final vx6 c = new v59(ky6.a);

    @Override // defpackage.w0
    public final int i(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        return jArr.length;
    }

    @Override // defpackage.ql1, defpackage.w0
    public final void k(fx1 fx1Var, int i, Object obj) {
        ux6 ux6Var = (ux6) obj;
        ux6Var.getClass();
        long D = fx1Var.D(this.b, i);
        ux6Var.b(ux6Var.d() + 1);
        long[] jArr = ux6Var.a;
        int i2 = ux6Var.b;
        ux6Var.b = i2 + 1;
        jArr[i2] = D;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [ux6, java.lang.Object] */
    @Override // defpackage.w0
    public final Object l(Object obj) {
        long[] jArr = (long[]) obj;
        jArr.getClass();
        ?? obj2 = new Object();
        obj2.a = jArr;
        obj2.b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.v59
    public final Object o() {
        return new long[0];
    }

    @Override // defpackage.v59
    public final void p(jbe jbeVar, Object obj, int i) {
        long[] jArr = (long[]) obj;
        jbeVar.getClass();
        jArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            jbeVar.B(this.b, i2, jArr[i2]);
        }
    }
}
