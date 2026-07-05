package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qe9  reason: default package */
/* loaded from: classes3.dex */
public final class qe9 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ re9 d;
    public final /* synthetic */ f76 e;
    public final /* synthetic */ cs9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qe9(re9 re9Var, f76 f76Var, cs9 cs9Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = re9Var;
        this.e = f76Var;
        this.f = cs9Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                qe9 qe9Var = new qe9(this.d, this.e, this.f, m42Var, 0);
                qe9Var.c = obj;
                return qe9Var;
            case 1:
                qe9 qe9Var2 = new qe9(this.d, this.e, this.f, m42Var, 1);
                qe9Var2.c = obj;
                return qe9Var2;
            case 2:
                qe9 qe9Var3 = new qe9(this.d, this.e, this.f, m42Var, 2);
                qe9Var3.c = obj;
                return qe9Var3;
            case 3:
                qe9 qe9Var4 = new qe9(this.d, this.e, this.f, m42Var, 3);
                qe9Var4.c = obj;
                return qe9Var4;
            default:
                qe9 qe9Var5 = new qe9(this.d, this.e, this.f, m42Var, 4);
                qe9Var5.c = obj;
                return qe9Var5;
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
                return ((qe9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((qe9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((qe9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((qe9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((qe9) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0477  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x027a  */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r33) {
        /*
            Method dump skipped, instructions count: 1312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qe9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
