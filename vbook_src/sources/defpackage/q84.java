package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q84  reason: default package */
/* loaded from: classes3.dex */
public final class q84 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ v84 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q84(v84 v84Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = v84Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        v84 v84Var = this.c;
        switch (i) {
            case 0:
                return new q84(v84Var, m42Var, 0);
            case 1:
                return new q84(v84Var, m42Var, 1);
            case 2:
                return new q84(v84Var, m42Var, 2);
            default:
                return new q84(v84Var, m42Var, 3);
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
                return ((q84) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((q84) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((q84) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((q84) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0120, code lost:
        if (r9 == r8) goto L51;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.q84.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
