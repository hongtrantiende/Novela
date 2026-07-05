package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kka  reason: default package */
/* loaded from: classes3.dex */
public final class kka extends v59 {
    public static final kka c = new v59(lka.a);

    @Override // defpackage.w0
    public final int i(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        return sArr.length;
    }

    @Override // defpackage.ql1, defpackage.w0
    public final void k(fx1 fx1Var, int i, Object obj) {
        jka jkaVar = (jka) obj;
        jkaVar.getClass();
        short m = fx1Var.m(this.b, i);
        jkaVar.b(jkaVar.d() + 1);
        short[] sArr = jkaVar.a;
        int i2 = jkaVar.b;
        jkaVar.b = i2 + 1;
        sArr[i2] = m;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [jka, java.lang.Object] */
    @Override // defpackage.w0
    public final Object l(Object obj) {
        short[] sArr = (short[]) obj;
        sArr.getClass();
        ?? obj2 = new Object();
        obj2.a = sArr;
        obj2.b = sArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.v59
    public final Object o() {
        return new short[0];
    }

    @Override // defpackage.v59
    public final void p(jbe jbeVar, Object obj, int i) {
        short[] sArr = (short[]) obj;
        jbeVar.getClass();
        sArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            short s = sArr[i2];
            u59 u59Var = this.b;
            u59Var.getClass();
            jbeVar.s(u59Var, i2);
            jbeVar.H(s);
        }
    }
}
