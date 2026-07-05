package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qia  reason: default package */
/* loaded from: classes3.dex */
public final class qia extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ sia c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qia(int i, sia siaVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 2;
        this.d = i;
        this.c = siaVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        sia siaVar = this.c;
        int i2 = this.d;
        switch (i) {
            case 0:
                return new qia(siaVar, i2, m42Var, 0);
            case 1:
                return new qia(siaVar, i2, m42Var, 1);
            default:
                return new qia(i2, siaVar, m42Var);
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
                return ((qia) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((qia) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((qia) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        if (r5 == r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0055, code lost:
        if (r5 == r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0090, code lost:
        if (r5 == r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0093, code lost:
        return r4;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qia.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qia(sia siaVar, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.c = siaVar;
        this.d = i;
    }
}
