package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qtc  reason: default package */
/* loaded from: classes3.dex */
public final class qtc extends v59 {
    public static final qtc c = new v59(rtc.a);

    @Override // defpackage.w0
    public final int i(Object obj) {
        return ((otc) obj).a.length;
    }

    @Override // defpackage.ql1, defpackage.w0
    public final void k(fx1 fx1Var, int i, Object obj) {
        ptc ptcVar = (ptc) obj;
        ptcVar.getClass();
        int l = fx1Var.a(this.b, i).l();
        ptcVar.b(ptcVar.d() + 1);
        int[] iArr = ptcVar.a;
        int i2 = ptcVar.b;
        ptcVar.b = i2 + 1;
        iArr[i2] = l;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, ptc] */
    @Override // defpackage.w0
    public final Object l(Object obj) {
        int[] iArr = ((otc) obj).a;
        ?? obj2 = new Object();
        obj2.a = iArr;
        obj2.b = iArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.v59
    public final Object o() {
        return new otc(new int[0]);
    }

    @Override // defpackage.v59
    public final void p(jbe jbeVar, Object obj, int i) {
        int[] iArr = ((otc) obj).a;
        jbeVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            jbeVar.x(this.b, i2).y(iArr[i2]);
        }
    }
}
