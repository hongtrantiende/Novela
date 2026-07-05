package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qhc  reason: default package */
/* loaded from: classes3.dex */
public final class qhc extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ shc d;
    public final /* synthetic */ w43 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qhc(shc shcVar, w43 w43Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = shcVar;
        this.e = w43Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                qhc qhcVar = new qhc(this.d, this.e, m42Var, 0);
                qhcVar.c = obj;
                return qhcVar;
            case 1:
                qhc qhcVar2 = new qhc(this.d, this.e, m42Var, 1);
                qhcVar2.c = obj;
                return qhcVar2;
            default:
                qhc qhcVar3 = new qhc(this.d, this.e, m42Var, 2);
                qhcVar3.c = obj;
                return qhcVar3;
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
                return ((qhc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((qhc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((qhc) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0132  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instructions count: 626
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qhc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
