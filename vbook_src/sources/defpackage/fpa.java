package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fpa  reason: default package */
/* loaded from: classes3.dex */
public final class fpa extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ c92 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fpa(boolean z, c92 c92Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = z;
        this.d = c92Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        c92 c92Var = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                return new fpa(z, c92Var, m42Var, 0);
            default:
                return new fpa(z, c92Var, m42Var, 1);
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
                return ((fpa) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((fpa) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0062, code lost:
        if (r10.a(r13) == r9) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c4, code lost:
        if (r10.a(r13) == r9) goto L39;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instructions count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fpa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
