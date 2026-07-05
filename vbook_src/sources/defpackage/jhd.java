package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jhd  reason: default package */
/* loaded from: classes.dex */
public final class jhd extends aab implements lu4 {
    public final /* synthetic */ int a;
    public lhd b;
    public int c;
    public final /* synthetic */ lhd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jhd(lhd lhdVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = lhdVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new jhd(this.d, m42Var, 0);
            default:
                return new jhd(this.d, m42Var, 1);
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
                return ((jhd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((jhd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (r10 == r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00dd, code lost:
        if (r10 == r4) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jhd.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
