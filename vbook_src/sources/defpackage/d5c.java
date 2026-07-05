package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d5c  reason: default package */
/* loaded from: classes3.dex */
public final class d5c extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ y5c c;
    public int d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d5c(y5c y5cVar, int i, int i2, m42 m42Var, int i3) {
        super(2, m42Var);
        this.a = i3;
        this.c = y5cVar;
        this.d = i;
        this.e = i2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new d5c(this.c, this.d, this.e, m42Var, 0);
            case 1:
                return new d5c(this.c, this.d, this.e, m42Var, 1);
            default:
                return new d5c(this.e, m42Var, this.c);
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
                return ((d5c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((d5c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((d5c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0080, code lost:
        if (r4 == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ca, code lost:
        if (r6.F0(r7, true, r20) != r5) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00df, code lost:
        if (r0 == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x013a, code lost:
        if (r6.F0(r1, false, r20) == r5) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0161, code lost:
        if (r1 != r5) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01c4, code lost:
        if (r6.F0(r1, false, r20) == r5) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01d4, code lost:
        if (r1 == r5) goto L86;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:97:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d5c.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5c(int i, m42 m42Var, y5c y5cVar) {
        super(2, m42Var);
        this.a = 2;
        this.c = y5cVar;
        this.e = i;
    }
}
