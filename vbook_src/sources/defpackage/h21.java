package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: h21  reason: default package */
/* loaded from: classes.dex */
public final class h21 extends aab implements xt4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h21(Object obj, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.c = obj;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new h21((iya) obj, m42Var, 0);
            case 1:
                return new h21((wga) obj, m42Var, 1);
            case 2:
                return new h21((dh2) obj, m42Var, 2);
            case 3:
                return new h21((xt4) obj, m42Var, 3);
            case 4:
                return new h21((f7a) obj, m42Var, 4);
            case 5:
                return new h21((lrb) obj, m42Var, 5);
            default:
                return new h21((gtb) obj, m42Var, 6);
        }
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj;
        switch (i) {
            case 0:
                return ((h21) create(m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((h21) create(m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((h21) create(m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((h21) create(m42Var)).invokeSuspend(pvcVar);
            case 4:
                return ((h21) create(m42Var)).invokeSuspend(pvcVar);
            case 5:
                return ((h21) create(m42Var)).invokeSuspend(pvcVar);
            default:
                return ((h21) create(m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:?, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:?, code lost:
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r5.s(r9) == r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
        if (r9 == r4) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007b, code lost:
        if (r2 == r4) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00a2, code lost:
        if (r9 == r4) goto L42;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 464
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.h21.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
