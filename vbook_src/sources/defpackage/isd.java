package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: isd  reason: default package */
/* loaded from: classes.dex */
public final class isd extends aab implements lu4 {
    public final /* synthetic */ float C;
    public int a;
    public final /* synthetic */ lsd b;
    public final /* synthetic */ int c;
    public final /* synthetic */ y78 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ y78 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isd(lsd lsdVar, int i, y78 y78Var, float f, y78 y78Var2, float f2, m42 m42Var) {
        super(2, m42Var);
        this.b = lsdVar;
        this.c = i;
        this.d = y78Var;
        this.e = f;
        this.f = y78Var2;
        this.C = f2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new isd(this.b, this.c, this.d, this.e, this.f, this.C, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((isd) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00a6, code lost:
        if (r2.e(r3, 0, r5, defpackage.nae.e, r22) == r15) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00d1, code lost:
        if (r0.e(r1, r3, r5, r22.C, r22) == r15) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d3, code lost:
        return r15;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.isd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
