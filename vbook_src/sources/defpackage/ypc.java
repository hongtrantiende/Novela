package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ypc  reason: default package */
/* loaded from: classes3.dex */
public final class ypc extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ tqc c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ypc(tqc tqcVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = tqcVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        tqc tqcVar = this.c;
        switch (i) {
            case 0:
                return new ypc(tqcVar, m42Var, 0);
            case 1:
                return new ypc(tqcVar, m42Var, 1);
            case 2:
                return new ypc(tqcVar, m42Var, 2);
            case 3:
                return new ypc(tqcVar, m42Var, 3);
            case 4:
                return new ypc(tqcVar, m42Var, 4);
            case 5:
                return new ypc(tqcVar, m42Var, 5);
            case 6:
                return new ypc(tqcVar, m42Var, 6);
            default:
                return new ypc(tqcVar, m42Var, 7);
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
                return ((ypc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((ypc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((ypc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((ypc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((ypc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 5:
                return ((ypc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 6:
                return ((ypc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ypc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01db, code lost:
        if (r5.r(r5.u + 1, 0, -1.0d, r14) == r14) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:?, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:?, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:?, code lost:
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0069, code lost:
        if (r15 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x009d, code lost:
        if (r15 == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x018f, code lost:
        if (r15.f(r14) == r0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01a0, code lost:
        if (r5.r(r5.u - 1, 0, -1.0d, r14) == r0) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01cb, code lost:
        if (r15.f(r14) == r14) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 572
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ypc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
