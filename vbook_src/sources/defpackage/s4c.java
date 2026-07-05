package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s4c  reason: default package */
/* loaded from: classes3.dex */
public final class s4c extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y5c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s4c(int i, m42 m42Var, y5c y5cVar) {
        super(2, m42Var);
        this.a = i;
        this.b = y5cVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        y5c y5cVar = this.b;
        switch (i) {
            case 0:
                return new s4c(0, m42Var, y5cVar);
            case 1:
                return new s4c(1, m42Var, y5cVar);
            case 2:
                return new s4c(2, m42Var, y5cVar);
            case 3:
                return new s4c(3, m42Var, y5cVar);
            case 4:
                return new s4c(4, m42Var, y5cVar);
            default:
                return new s4c(5, m42Var, y5cVar);
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
                return ((s4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                ((s4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((s4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((s4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 4:
                ((s4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((s4c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030 A[LOOP:1: B:10:0x0030->B:57:0x00f6, LOOP_START, PHI: r2 
      PHI: (r2v10 boolean) = (r2v0 boolean), (r2v15 boolean) binds: [B:9:0x002e, B:57:0x00f6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ab  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s4c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
