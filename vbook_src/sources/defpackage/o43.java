package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o43  reason: default package */
/* loaded from: classes3.dex */
public final class o43 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ v43 c;
    public final /* synthetic */ aw7 d;
    public final /* synthetic */ aw7 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o43(v43 v43Var, aw7 aw7Var, aw7 aw7Var2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = v43Var;
        this.d = aw7Var;
        this.e = aw7Var2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                o43 o43Var = new o43(this.c, this.d, this.e, m42Var, 0);
                o43Var.b = obj;
                return o43Var;
            default:
                o43 o43Var2 = new o43(this.c, this.d, this.e, m42Var, 1);
                o43Var2.b = obj;
                return o43Var2;
        }
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        jub jubVar = (jub) obj;
        m42 m42Var = (m42) obj2;
        switch (i) {
            case 0:
                ((o43) create(jubVar, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((o43) create(jubVar, m42Var)).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        aw7 aw7Var = this.d;
        v43 v43Var = this.c;
        aw7 aw7Var2 = this.e;
        jub jubVar = (jub) this.b;
        switch (i) {
            case 0:
                hre.r(obj);
                aw7Var2.setValue(nqe.r(jubVar.a.b, v43Var.d, ((Boolean) aw7Var.getValue()).booleanValue()));
                return pvcVar;
            default:
                hre.r(obj);
                aw7Var2.setValue(nqe.r(jubVar.a.b, v43Var.d, ((Boolean) aw7Var.getValue()).booleanValue()));
                return pvcVar;
        }
    }
}
