package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ks0  reason: default package */
/* loaded from: classes3.dex */
public final class ks0 extends v59 {
    public static final ks0 c = new v59(ms0.a);

    @Override // defpackage.w0
    public final int i(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        return zArr.length;
    }

    @Override // defpackage.ql1, defpackage.w0
    public final void k(fx1 fx1Var, int i, Object obj) {
        js0 js0Var = (js0) obj;
        js0Var.getClass();
        boolean z = fx1Var.z(this.b, i);
        js0Var.b(js0Var.d() + 1);
        boolean[] zArr = js0Var.a;
        int i2 = js0Var.b;
        js0Var.b = i2 + 1;
        zArr[i2] = z;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [js0, java.lang.Object] */
    @Override // defpackage.w0
    public final Object l(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        zArr.getClass();
        ?? obj2 = new Object();
        obj2.a = zArr;
        obj2.b = zArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.v59
    public final Object o() {
        return new boolean[0];
    }

    @Override // defpackage.v59
    public final void p(jbe jbeVar, Object obj, int i) {
        boolean[] zArr = (boolean[]) obj;
        jbeVar.getClass();
        zArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            jbeVar.o(this.b, i2, zArr[i2]);
        }
    }
}
