package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yfa  reason: default package */
/* loaded from: classes3.dex */
public final class yfa extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ zfa d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yfa(zfa zfaVar, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = zfaVar;
        this.e = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        String str = this.e;
        zfa zfaVar = this.d;
        switch (i) {
            case 0:
                yfa yfaVar = new yfa(zfaVar, str, m42Var, 0);
                yfaVar.c = obj;
                return yfaVar;
            default:
                yfa yfaVar2 = new yfa(zfaVar, str, m42Var, 1);
                yfaVar2.c = obj;
                return yfaVar2;
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
                return ((yfa) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((yfa) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
        if (defpackage.ade.r(r11, r22) == r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007d, code lost:
        if (r0 != r5) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:?, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yfa.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
