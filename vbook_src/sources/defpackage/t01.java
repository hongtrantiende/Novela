package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t01  reason: default package */
/* loaded from: classes3.dex */
public final class t01 extends v59 {
    public static final t01 c = new v59(o21.a);

    @Override // defpackage.w0
    public final int i(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        return bArr.length;
    }

    @Override // defpackage.ql1, defpackage.w0
    public final void k(fx1 fx1Var, int i, Object obj) {
        l01 l01Var = (l01) obj;
        l01Var.getClass();
        byte j = fx1Var.j(this.b, i);
        l01Var.b(l01Var.d() + 1);
        byte[] bArr = l01Var.a;
        int i2 = l01Var.b;
        l01Var.b = i2 + 1;
        bArr[i2] = j;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l01] */
    @Override // defpackage.w0
    public final Object l(Object obj) {
        byte[] bArr = (byte[]) obj;
        bArr.getClass();
        ?? obj2 = new Object();
        obj2.a = bArr;
        obj2.b = bArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.v59
    public final Object o() {
        return new byte[0];
    }

    @Override // defpackage.v59
    public final void p(jbe jbeVar, Object obj, int i) {
        byte[] bArr = (byte[]) obj;
        jbeVar.getClass();
        bArr.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            byte b = bArr[i2];
            u59 u59Var = this.b;
            u59Var.getClass();
            jbeVar.s(u59Var, i2);
            jbeVar.p(b);
        }
    }
}
