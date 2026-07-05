package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r5d  reason: default package */
/* loaded from: classes3.dex */
public final class r5d extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ s5d d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r5d(boolean z, s5d s5dVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = z;
        this.d = s5dVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        s5d s5dVar = this.d;
        boolean z = this.c;
        switch (i) {
            case 0:
                return new r5d(z, s5dVar, m42Var, 0);
            default:
                return new r5d(z, s5dVar, m42Var, 1);
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
                return ((r5d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((r5d) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
        if (r0 == r8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0081, code lost:
        if (r0 == r8) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c7, code lost:
        if (r0 == r8) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ea, code lost:
        if (r0 == r8) goto L40;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r5d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
