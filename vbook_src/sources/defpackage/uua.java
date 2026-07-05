package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uua  reason: default package */
/* loaded from: classes3.dex */
public final class uua extends aab implements lu4 {
    public int a;
    public float b;
    public int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ lq e;
    public final /* synthetic */ aw7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uua(boolean z, lq lqVar, aw7 aw7Var, m42 m42Var) {
        super(2, m42Var);
        this.d = z;
        this.e = lqVar;
        this.f = aw7Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new uua(this.d, this.e, this.f, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((uua) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
        if (defpackage.ade.r(r0, r5) != r12) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
        if (r5.e.g(r5, r2) == r12) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d9, code lost:
        if (defpackage.lq.c(r5.e, r2, r3, null, null, r5, 12) == r12) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00db, code lost:
        return r12;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d9 -> B:30:0x00dc). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uua.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
