package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yx0  reason: default package */
/* loaded from: classes3.dex */
public final class yx0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ fy0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yx0(fy0 fy0Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = fy0Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        fy0 fy0Var = this.c;
        switch (i) {
            case 0:
                return new yx0(fy0Var, m42Var, 0);
            case 1:
                return new yx0(fy0Var, m42Var, 1);
            case 2:
                return new yx0(fy0Var, m42Var, 2);
            case 3:
                return new yx0(fy0Var, m42Var, 3);
            default:
                return new yx0(fy0Var, m42Var, 4);
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
                return ((yx0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((yx0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((yx0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((yx0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((yx0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r5 == r7) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00e9, code lost:
        if (defpackage.fy0.j(r8, r12, r5, r6, r20) != r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:?, code lost:
        return r7;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00cb  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yx0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
