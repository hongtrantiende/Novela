package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xh0  reason: default package */
/* loaded from: classes3.dex */
public final class xh0 extends aab implements lu4 {
    public Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;
    public int d;
    public int e;
    public Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xh0(pj1 pj1Var, String str, int i, int i2, sac sacVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 1;
        this.C = pj1Var;
        this.c = str;
        this.d = i;
        this.e = i2;
        this.D = sacVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.D;
        switch (i) {
            case 0:
                xh0 xh0Var = new xh0((yh0) obj3, (String) obj2, m42Var, 0);
                xh0Var.C = obj;
                return xh0Var;
            case 1:
                return new xh0((pj1) this.C, (String) obj2, this.d, this.e, (sac) obj3, m42Var);
            default:
                return new xh0((f0b) obj3, (c0b) obj2, m42Var, 2);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((xh0) create((tj4) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((xh0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((xh0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
        if (r2 != r6) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0122, code lost:
        if (r0 == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0199, code lost:
        if (r4 == r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01af, code lost:
        if (r0 == r6) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
        return r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:78:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0245 -> B:82:0x024a). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instructions count: 614
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xh0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xh0(Object obj, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.D = obj;
        this.c = obj2;
    }
}
