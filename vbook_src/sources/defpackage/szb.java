package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: szb  reason: default package */
/* loaded from: classes3.dex */
public final class szb extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ a0c c;
    public final /* synthetic */ float d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ szb(a0c a0cVar, float f, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = a0cVar;
        this.d = f;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        float f = this.d;
        a0c a0cVar = this.c;
        switch (i) {
            case 0:
                return new szb(a0cVar, f, m42Var, 0);
            default:
                return new szb(a0cVar, f, m42Var, 1);
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
                return ((szb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((szb) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r9 == r5) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008a, code lost:
        if (r0 != r5) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008d, code lost:
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ab, code lost:
        if (r9 == r5) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0102, code lost:
        if (r0 != r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0105, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0101  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r32) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.szb.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
