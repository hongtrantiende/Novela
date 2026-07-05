package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hg1  reason: default package */
/* loaded from: classes3.dex */
public final class hg1 extends aab implements lu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a = 2;
    public int b;
    public Object c;
    public long d;
    public Object e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg1(lq lqVar, long j, r13 r13Var, mab mabVar, m42 m42Var) {
        super(2, m42Var);
        this.e = lqVar;
        this.d = j;
        this.f = r13Var;
        this.C = mabVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.C;
        switch (i) {
            case 0:
                hg1 hg1Var = new hg1((ng1) obj2, this.d, m42Var);
                hg1Var.e = obj;
                return hg1Var;
            case 1:
                hg1 hg1Var2 = new hg1((lq) this.e, this.d, (r13) this.f, (mab) obj2, m42Var);
                hg1Var2.c = obj;
                return hg1Var2;
            case 2:
                hg1 hg1Var3 = new hg1((i22) this.e, (rxc) this.f, (hv0) obj2, this.d, m42Var);
                hg1Var3.c = obj;
                return hg1Var3;
            case 3:
                hg1 hg1Var4 = new hg1((web) obj2, m42Var);
                hg1Var4.c = obj;
                return hg1Var4;
            default:
                hg1 hg1Var5 = new hg1((j59) this.e, (ytb) this.f, this.d, (yu7) obj2, m42Var);
                hg1Var5.c = obj;
                return hg1Var5;
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
                return ((hg1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((hg1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((hg1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((hg1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((hg1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0053, code lost:
        if (r2 == r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:?, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r8.b(r2, r42) == r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00e3, code lost:
        if (r5 == r6) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0109, code lost:
        if (r3 == r6) goto L65;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x030a A[LOOP:1: B:144:0x030a->B:145:0x0352, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:180:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0178 A[LOOP:0: B:81:0x0178->B:82:0x01af, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b1  */
    /* JADX WARN: Type inference failed for: r0v64, types: [xfd] */
    /* JADX WARN: Type inference failed for: r6v2, types: [gs9] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) {
        /*
            Method dump skipped, instructions count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hg1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg1(ng1 ng1Var, long j, m42 m42Var) {
        super(2, m42Var);
        this.C = ng1Var;
        this.d = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg1(i22 i22Var, rxc rxcVar, hv0 hv0Var, long j, m42 m42Var) {
        super(2, m42Var);
        this.e = i22Var;
        this.f = rxcVar;
        this.C = hv0Var;
        this.d = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg1(j59 j59Var, ytb ytbVar, long j, yu7 yu7Var, m42 m42Var) {
        super(2, m42Var);
        this.e = j59Var;
        this.f = ytbVar;
        this.d = j;
        this.C = yu7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hg1(web webVar, m42 m42Var) {
        super(2, m42Var);
        this.C = webVar;
    }
}
