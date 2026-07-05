package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p95  reason: default package */
/* loaded from: classes3.dex */
public final class p95 extends aab implements lu4 {
    public /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a;
    public float b;
    public float c;
    public float d;
    public float e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p95(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.D = obj;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.D;
        switch (i) {
            case 0:
                p95 p95Var = new p95((q95) obj2, m42Var, 0);
                p95Var.C = obj;
                return p95Var;
            default:
                p95 p95Var2 = new p95((vi8) obj2, m42Var, 1);
                p95Var2.C = obj;
                return p95Var2;
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
                return ((p95) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((p95) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x011f, code lost:
        if (defpackage.kqe.u(r3, true, false, r24) == r9) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01c3, code lost:
        if (defpackage.kqe.u(r3, true, false, r24) == r9) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x02e1, code lost:
        if (defpackage.ade.r(r14, r24) != r9) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02f9, code lost:
        if (r3.l(false, null) == r9) goto L80;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:88:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x011f -> B:31:0x0123). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x012a -> B:32:0x0124). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x01a9 -> B:48:0x01c7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x01c3 -> B:48:0x01c7). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:83:0x02f9 -> B:59:0x01f0). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0301 -> B:85:0x02fd). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 778
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p95.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
