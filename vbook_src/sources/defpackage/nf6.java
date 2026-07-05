package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nf6  reason: default package */
/* loaded from: classes.dex */
public final class nf6 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ yya d;
    public final /* synthetic */ float e;
    public final /* synthetic */ x2a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nf6(x2a x2aVar, int i, yya yyaVar, float f, m42 m42Var, int i2) {
        super(2, m42Var);
        this.a = i2;
        this.f = x2aVar;
        this.c = i;
        this.d = yyaVar;
        this.e = f;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new nf6((kj6) this.f, this.c, this.d, this.e, m42Var, 0);
            case 1:
                return new nf6((qg6) this.f, this.c, this.d, this.e, m42Var, 1);
            default:
                return new nf6((nk6) this.f, this.c, this.d, this.e, m42Var, 2);
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
                return ((nf6) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((nf6) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((nf6) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
        if (r11.i(r12, 0, r14) == r8) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0079, code lost:
        if (r11.l(r12, 0, r14) == r8) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00b6, code lost:
        if (r11.l(r12, 0, r14) == r8) goto L56;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nf6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
