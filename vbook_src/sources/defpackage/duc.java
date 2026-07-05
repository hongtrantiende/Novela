package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: duc  reason: default package */
/* loaded from: classes3.dex */
public final class duc extends v59 {
    public static final duc c = new v59(euc.a);

    @Override // defpackage.w0
    public final int i(Object obj) {
        return ((buc) obj).a.length;
    }

    @Override // defpackage.ql1, defpackage.w0
    public final void k(fx1 fx1Var, int i, Object obj) {
        cuc cucVar = (cuc) obj;
        cucVar.getClass();
        short B = fx1Var.a(this.b, i).B();
        cucVar.b(cucVar.d() + 1);
        short[] sArr = cucVar.a;
        int i2 = cucVar.b;
        cucVar.b = i2 + 1;
        sArr[i2] = B;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [cuc, java.lang.Object] */
    @Override // defpackage.w0
    public final Object l(Object obj) {
        short[] sArr = ((buc) obj).a;
        ?? obj2 = new Object();
        obj2.a = sArr;
        obj2.b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.v59
    public final Object o() {
        return new buc(new short[0]);
    }

    @Override // defpackage.v59
    public final void p(jbe jbeVar, Object obj, int i) {
        short[] sArr = ((buc) obj).a;
        jbeVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            jbeVar.x(this.b, i2).H(sArr[i2]);
        }
    }
}
