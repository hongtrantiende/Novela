package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hr5  reason: default package */
/* loaded from: classes3.dex */
public final class hr5 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ur5 b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hr5(ur5 ur5Var, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.b = ur5Var;
        this.c = i;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        ur5 ur5Var = this.b;
        switch (i) {
            case 0:
                return new hr5(ur5Var, this.c, m42Var, 0);
            case 1:
                return new hr5(ur5Var, this.c, m42Var, 1);
            case 2:
                return new hr5(ur5Var, this.c, m42Var, 2);
            case 3:
                return new hr5(ur5Var, this.c, m42Var, 3);
            case 4:
                return new hr5(4, m42Var, ur5Var);
            case 5:
                return new hr5(5, m42Var, ur5Var);
            case 6:
                return new hr5(6, m42Var, ur5Var);
            default:
                return new hr5(7, m42Var, ur5Var);
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
                ((hr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ((hr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 2:
                ((hr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                ((hr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            case 4:
                return ((hr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 5:
                return ((hr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 6:
                return ((hr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((hr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0185 A[LOOP:3: B:59:0x0185->B:60:0x01bc, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01be A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01fd A[LOOP:5: B:68:0x01fd->B:69:0x0234, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0236 A[RETURN] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r35) {
        /*
            Method dump skipped, instructions count: 768
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hr5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hr5(int i, m42 m42Var, ur5 ur5Var) {
        super(2, m42Var);
        this.a = i;
        this.b = ur5Var;
    }
}
