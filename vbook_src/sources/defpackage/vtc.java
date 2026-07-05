package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vtc  reason: default package */
/* loaded from: classes3.dex */
public final class vtc extends v59 {
    public static final vtc c = new v59(wtc.a);

    @Override // defpackage.w0
    public final int i(Object obj) {
        return ((ttc) obj).a.length;
    }

    @Override // defpackage.ql1, defpackage.w0
    public final void k(fx1 fx1Var, int i, Object obj) {
        utc utcVar = (utc) obj;
        utcVar.getClass();
        long v = fx1Var.a(this.b, i).v();
        utcVar.b(utcVar.d() + 1);
        long[] jArr = utcVar.a;
        int i2 = utcVar.b;
        utcVar.b = i2 + 1;
        jArr[i2] = v;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [utc, java.lang.Object] */
    @Override // defpackage.w0
    public final Object l(Object obj) {
        long[] jArr = ((ttc) obj).a;
        ?? obj2 = new Object();
        obj2.a = jArr;
        obj2.b = jArr.length;
        obj2.b(10);
        return obj2;
    }

    @Override // defpackage.v59
    public final Object o() {
        return new ttc(new long[0]);
    }

    @Override // defpackage.v59
    public final void p(jbe jbeVar, Object obj, int i) {
        long[] jArr = ((ttc) obj).a;
        jbeVar.getClass();
        for (int i2 = 0; i2 < i; i2++) {
            jbeVar.x(this.b, i2).A(jArr[i2]);
        }
    }
}
