package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: w95  reason: default package */
/* loaded from: classes3.dex */
public final class w95 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ aa5 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w95(boolean z, aa5 aa5Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = z;
        this.d = aa5Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        aa5 aa5Var = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                return new w95(z, aa5Var, m42Var, 0);
            default:
                return new w95(z, aa5Var, m42Var, 1);
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
                return ((w95) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((w95) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        if (r13.a(r17) == r12) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
        if (defpackage.ade.r(r3, r17) == r12) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c7, code lost:
        if (r13.a(r17) == r12) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00fc, code lost:
        if (defpackage.ade.r(r3, r17) == r12) goto L43;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w95.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
