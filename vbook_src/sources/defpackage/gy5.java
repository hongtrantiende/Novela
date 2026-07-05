package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: gy5  reason: default package */
/* loaded from: classes3.dex */
public final class gy5 extends v59 {
    public static final gy5 c = new v59(xy5.a);

    @Override // defpackage.w0
    public final int i(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        return iArr.length;
    }

    @Override // defpackage.ql1, defpackage.w0
    public final void k(fx1 fx1Var, int i, Object obj) {
        fy5 fy5Var = (fy5) obj;
        fy5Var.getClass();
        int r = fx1Var.r(this.b, i);
        fy5Var.b(fy5Var.d() + 1);
        int[] iArr = fy5Var.a;
        int i2 = fy5Var.b;
        fy5Var.b = i2 + 1;
        iArr[i2] = r;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [fy5, java.lang.Object] */
    @Override // defpackage.w0
    public final Object l(Object obj) {
        int[] iArr = (int[]) obj;
        iArr.getClass();
        ?? obj2 = new Object();
        obj2.a = iArr;
        obj2.b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.v59
    public final Object o() {
        return new int[0];
    }

    @Override // defpackage.v59
    public final void p(jbe jbeVar, Object obj, int i) {
        int[] iArr = (int[]) obj;
        jbeVar.getClass();
        iArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            jbeVar.z(i2, iArr[i2], this.b);
        }
    }
}
