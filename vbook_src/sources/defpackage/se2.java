package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: se2  reason: default package */
/* loaded from: classes.dex */
public final class se2 extends aab implements lu4 {
    public final /* synthetic */ xt4 C;
    public wjc a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ fu9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se2(m42 m42Var, xt4 xt4Var, fu9 fu9Var, boolean z, boolean z2) {
        super(2, m42Var);
        this.d = z;
        this.e = z2;
        this.f = fu9Var;
        this.C = xt4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        se2 se2Var = new se2(m42Var, this.C, this.f, this.d, this.e);
        se2Var.c = obj;
        return se2Var;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((se2) create((xjc) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
        if (r12 != r9) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b5  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.se2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
