package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ya7  reason: default package */
/* loaded from: classes.dex */
public final class ya7 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public aw7 b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ long e;
    public final /* synthetic */ aw7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ya7(long j, aw7 aw7Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.e = j;
        this.f = aw7Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                ya7 ya7Var = new ya7(this.e, this.f, m42Var, 0);
                ya7Var.d = obj;
                return ya7Var;
            default:
                ya7 ya7Var2 = new ya7(this.e, this.f, m42Var, 1);
                ya7Var2.d = obj;
                return ya7Var2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m82 m82Var = (m82) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                return ((ya7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ya7) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        if (defpackage.ade.r(r13, r16) != r9) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00f5, code lost:
        if (defpackage.ade.r(r13, r16) != r9) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0061 -> B:12:0x0036). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00f5 -> B:45:0x00f9). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ya7.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
