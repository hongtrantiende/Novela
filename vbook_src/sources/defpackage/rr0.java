package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rr0  reason: default package */
/* loaded from: classes3.dex */
public final class rr0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr0(nk6 nk6Var, int i, int i2, m42 m42Var) {
        super(2, m42Var);
        this.a = 6;
        this.d = nk6Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return new rr0((sr0) obj2, this.c, m42Var, 0);
            case 1:
                return new rr0((ma3) obj2, this.c, m42Var, 1);
            case 2:
                return new rr0((v84) obj2, this.c, m42Var, 2);
            case 3:
                return new rr0((j95) obj2, this.c, m42Var, 3);
            case 4:
                return new rr0((ur5) obj2, this.c, m42Var, 4);
            case 5:
                return new rr0((oi6) obj2, this.c, m42Var, 5);
            case 6:
                return new rr0((nk6) obj2, this.b, this.c, m42Var);
            case 7:
                return new rr0((k2a) obj2, this.c, m42Var, 7);
            case 8:
                return new rr0((zg8) obj2, this.c, m42Var, 8);
            case 9:
                return new rr0(this.c, (be9) obj2, m42Var);
            case 10:
                return new rr0((y2a) obj2, this.c, m42Var, 10);
            case 11:
                return new rr0((bma) obj2, m42Var, 11);
            case 12:
                rr0 rr0Var = new rr0((lrb) obj2, m42Var, 12);
                rr0Var.c = ((Number) obj).intValue();
                return rr0Var;
            case 13:
                return new rr0((y5c) obj2, m42Var, 13);
            case 14:
                return new rr0((zlc) obj2, this.c, m42Var, 14);
            case 15:
                return new rr0((tqc) obj2, this.c, m42Var, 15);
            default:
                return new rr0((ubd) obj2, this.c, m42Var, 16);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((rr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((rr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                return ((rr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 3:
                return ((rr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((rr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 5:
                return ((rr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 6:
                ((rr0) create((i2a) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 7:
                return ((rr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 8:
                return ((rr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 9:
                return ((rr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 10:
                return ((rr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 11:
                return ((rr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 12:
                return ((rr0) create(Integer.valueOf(((Number) obj).intValue()), (m42) obj2)).invokeSuspend(pvcVar);
            case 13:
                return ((rr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 14:
                return ((rr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 15:
                return ((rr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((rr0) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x021e, code lost:
        if (r0.s(r5 + 1, r53) == r14) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0269, code lost:
        if (defpackage.bma.u(r0, r1, r2, r3, r4, 400, r53) != r14) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0283, code lost:
        if (r0.s(r5 - 1, r53) == r14) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x02b8, code lost:
        if (defpackage.bma.u(r0, r0.e(), ((java.lang.Number) r4.getValue()).floatValue(), (int) (r0.j() >> 32), (int) (r0.j() & r20), 400, r53) != r14) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x0645, code lost:
        if (r15.r(r0, false, r53) == r14) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:373:0x064e, code lost:
        if (defpackage.ur5.k(r15, r53) == r14) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:377:0x065c, code lost:
        if (r15.r(r0 - 1, false, r53) == r14) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:386:0x067b, code lost:
        if (r15.r(r0 + 1, false, r53) == r14) goto L407;
     */
    /* JADX WARN: Code restructure failed: missing block: B:412:0x0718, code lost:
        if (r2 == r14) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00df, code lost:
        if (r15.F0(r0, false, r53) == r14) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ee, code lost:
        if (r15.E0(r0 - 1, r53) == r14) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:?, code lost:
        return r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x010e, code lost:
        if (r15.E0(r0 + 1, r53) == r14) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:117:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x05c0 A[LOOP:8: B:339:0x05be->B:340:0x05c0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:344:0x05e8  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x066a  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x0672  */
    /* JADX WARN: Removed duplicated region for block: B:444:0x082d  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x08f1  */
    /* JADX WARN: Removed duplicated region for block: B:516:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:521:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:532:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:541:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:545:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0104  */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, cza] */
    /* JADX WARN: Type inference failed for: r1v7, types: [r36, q36, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v39 */
    /* JADX WARN: Type inference failed for: r2v47 */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r54) {
        /*
            Method dump skipped, instructions count: 2328
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr0(int i, be9 be9Var, m42 m42Var) {
        super(2, m42Var);
        this.a = 9;
        this.c = i;
        this.d = be9Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rr0(Object obj, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.d = obj;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rr0(Object obj, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
    }
}
