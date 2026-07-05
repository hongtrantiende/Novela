package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pr5  reason: default package */
/* loaded from: classes3.dex */
public final class pr5 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public double d;
    public Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pr5(ur5 ur5Var, mb1 mb1Var, String str, double d, m42 m42Var) {
        super(2, m42Var);
        this.a = 1;
        this.c = ur5Var;
        this.e = mb1Var;
        this.f = str;
        this.d = d;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return new pr5((ur5) obj2, m42Var, 0);
            case 1:
                return new pr5((ur5) this.c, (mb1) this.e, (String) obj2, this.d, m42Var);
            case 2:
                pr5 pr5Var = new pr5((y5c) obj2, m42Var, 2);
                pr5Var.c = obj;
                return pr5Var;
            case 3:
                return new pr5((y5c) this.e, (nb1) this.c, (String) obj2, this.d, m42Var, 3);
            default:
                return new pr5((ubd) this.e, (su3) this.c, (String) obj2, this.d, m42Var, 4);
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
                return ((pr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((pr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((pr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((pr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((pr5) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x03a6 A[LOOP:5: B:125:0x03a0->B:127:0x03a6, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x046e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0491 A[LOOP:3: B:158:0x0472->B:161:0x0491, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0497 A[LOOP:4: B:164:0x0497->B:165:0x04af, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0244 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0493 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:187:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:192:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:199:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:200:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0242 A[LOOP:0: B:75:0x0221->B:78:0x0242, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0248 A[LOOP:1: B:81:0x0248->B:84:0x0264, LOOP_START, PHI: r17 
      PHI: (r17v10 boolean) = (r17v9 boolean), (r17v11 boolean) binds: [B:80:0x0246, B:84:0x0264] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0267  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 1274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pr5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pr5(fdd fddVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.f = fddVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pr5(fdd fddVar, Object obj, String str, double d, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.e = fddVar;
        this.c = obj;
        this.f = str;
        this.d = d;
    }
}
