package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fg1  reason: default package */
/* loaded from: classes3.dex */
public final class fg1 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ ng1 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fg1(ng1 ng1Var, long j, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = ng1Var;
        this.e = j;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                fg1 fg1Var = new fg1(this.d, this.e, m42Var, 0);
                fg1Var.c = obj;
                return fg1Var;
            default:
                fg1 fg1Var2 = new fg1(this.d, this.e, m42Var, 1);
                fg1Var2.c = obj;
                return fg1Var2;
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
                return ((fg1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((fg1) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            Method dump skipped, instructions count: 638
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fg1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
