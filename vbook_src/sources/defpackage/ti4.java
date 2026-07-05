package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ti4  reason: default package */
/* loaded from: classes3.dex */
public final class ti4 extends v59 {
    public static final ti4 c = new v59(zi4.a);

    @Override // defpackage.w0
    public final int i(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        return fArr.length;
    }

    @Override // defpackage.ql1, defpackage.w0
    public final void k(fx1 fx1Var, int i, Object obj) {
        si4 si4Var = (si4) obj;
        si4Var.getClass();
        float e = fx1Var.e(this.b, i);
        si4Var.b(si4Var.d() + 1);
        float[] fArr = si4Var.a;
        int i2 = si4Var.b;
        si4Var.b = i2 + 1;
        fArr[i2] = e;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, si4] */
    @Override // defpackage.w0
    public final Object l(Object obj) {
        float[] fArr = (float[]) obj;
        fArr.getClass();
        ?? obj2 = new Object();
        obj2.a = fArr;
        obj2.b = fArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.v59
    public final Object o() {
        return new float[0];
    }

    @Override // defpackage.v59
    public final void p(jbe jbeVar, Object obj, int i) {
        float[] fArr = (float[]) obj;
        jbeVar.getClass();
        fArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            jbeVar.v(this.b, i2, fArr[i2]);
        }
    }
}
