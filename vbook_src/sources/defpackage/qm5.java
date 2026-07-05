package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qm5  reason: default package */
/* loaded from: classes.dex */
public final class qm5 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ kj6 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qm5(kj6 kj6Var, int i, int i2, m42 m42Var) {
        super(2, m42Var);
        this.a = 2;
        this.c = kj6Var;
        this.b = i;
        this.d = i2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        int i2 = this.d;
        kj6 kj6Var = this.c;
        switch (i) {
            case 0:
                return new qm5(kj6Var, i2, m42Var, 0);
            case 1:
                return new qm5(kj6Var, i2, m42Var, 1);
            case 2:
                return new qm5(kj6Var, this.b, i2, m42Var);
            case 3:
                return new qm5(kj6Var, i2, m42Var, 3);
            case 4:
                return new qm5(kj6Var, i2, m42Var, 4);
            default:
                return new qm5(kj6Var, i2, m42Var, 5);
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                return ((qm5) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 1:
                return ((qm5) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 2:
                ((qm5) create((i2a) obj, (m42) obj2)).invokeSuspend(pvcVar);
                return pvcVar;
            case 3:
                return ((qm5) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            case 4:
                return ((qm5) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
            default:
                return ((qm5) create((m82) obj, (m42) obj2)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
        if (defpackage.jxe.q(r9, r2, r11) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        if (defpackage.kqe.x(r9, r8, r11) == r6) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006e, code lost:
        if (defpackage.jxe.q(r9, r2, r11) == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0077, code lost:
        if (defpackage.kqe.x(r9, r8, r11) == r6) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a2, code lost:
        if (defpackage.jxe.q(r9, r2, r11) == r6) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ab, code lost:
        if (defpackage.kqe.x(r9, r8, r11) == r6) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:?, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:?, code lost:
        return r6;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qm5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qm5(kj6 kj6Var, int i, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.c = kj6Var;
        this.d = i;
    }
}
