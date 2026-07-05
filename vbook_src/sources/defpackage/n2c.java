package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n2c  reason: default package */
/* loaded from: classes3.dex */
public final class n2c extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ t2c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n2c(t2c t2cVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.b = t2cVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        t2c t2cVar = this.b;
        switch (i) {
            case 0:
                return new n2c(t2cVar, m42Var, 0);
            case 1:
                return new n2c(t2cVar, m42Var, 1);
            case 2:
                return new n2c(t2cVar, m42Var, 2);
            case 3:
                return new n2c(t2cVar, m42Var, 3);
            case 4:
                return new n2c(t2cVar, m42Var, 4);
            case 5:
                return new n2c(t2cVar, m42Var, 5);
            case 6:
                return new n2c(t2cVar, m42Var, 6);
            case 7:
                return new n2c(t2cVar, m42Var, 7);
            case 8:
                return new n2c(t2cVar, m42Var, 8);
            default:
                return new n2c(t2cVar, m42Var, 9);
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
                ((n2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((n2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((n2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((n2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 4:
                ((n2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 5:
                ((n2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 6:
                ((n2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 7:
                ((n2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 8:
                ((n2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((n2c) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028 A[LOOP:1: B:10:0x0028->B:11:0x004e, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0050  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n2c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
