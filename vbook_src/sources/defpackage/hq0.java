package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hq0  reason: default package */
/* loaded from: classes3.dex */
public final class hq0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ mq0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hq0(mq0 mq0Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = mq0Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        mq0 mq0Var = this.c;
        switch (i) {
            case 0:
                return new hq0(mq0Var, m42Var, 0);
            default:
                return new hq0(mq0Var, m42Var, 1);
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
                return ((hq0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((hq0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00d0 A[LOOP:2: B:38:0x00d0->B:41:0x00f7, LOOP_START, PHI: r0 
      PHI: (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v10 java.lang.String) binds: [B:37:0x00ce, B:41:0x00f7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f9  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instructions count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
