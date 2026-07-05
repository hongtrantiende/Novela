package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rhc  reason: default package */
/* loaded from: classes3.dex */
public final class rhc extends aab implements lu4 {
    public final /* synthetic */ int a;
    public shc b;
    public w43 c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ shc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rhc(shc shcVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.f = shcVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        shc shcVar = this.f;
        switch (i) {
            case 0:
                rhc rhcVar = new rhc(shcVar, m42Var, 0);
                rhcVar.e = obj;
                return rhcVar;
            default:
                rhc rhcVar2 = new rhc(shcVar, m42Var, 1);
                rhcVar2.e = obj;
                return rhcVar2;
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
                return ((rhc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((rhc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x02e1, code lost:
        if (r0 != r7) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0079, code lost:
        if (r0 == r7) goto L91;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0216  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) {
        /*
            Method dump skipped, instructions count: 946
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rhc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
