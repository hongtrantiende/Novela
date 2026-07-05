package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ve1  reason: default package */
/* loaded from: classes3.dex */
public final class ve1 extends aab implements mu4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve1(vt4 vt4Var, aw7 aw7Var, yya yyaVar, m42 m42Var) {
        super(3, m42Var);
        this.a = 2;
        this.c = vt4Var;
        this.d = aw7Var;
        this.b = yyaVar;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj4 = this.b;
        Object obj5 = this.d;
        m82 m82Var = (m82) obj;
        switch (i) {
            case 0:
                ve1 ve1Var = new ve1((cz7) obj4, (aw7) obj5, (m42) obj3, 0);
                ve1Var.c = (b0d) obj2;
                ve1Var.invokeSuspend(pvcVar);
                return pvcVar;
            case 1:
                ve1 ve1Var2 = new ve1((cz7) obj4, (Integer) obj5, (m42) obj3, 1);
                ve1Var2.c = (whc) obj2;
                ve1Var2.invokeSuspend(pvcVar);
                return pvcVar;
            default:
                ((Number) obj2).floatValue();
                new ve1((vt4) this.c, (aw7) obj5, (yya) obj4, (m42) obj3).invokeSuspend(pvcVar);
                return pvcVar;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (i) {
            case 0:
                b0d b0dVar = (b0d) this.c;
                hre.r(obj);
                if (b0dVar != null) {
                    ((aw7) obj3).setValue(null);
                    zr1.u((cz7) obj2, b0dVar.a);
                }
                return pvcVar;
            case 1:
                cz7 cz7Var = (cz7) obj2;
                whc whcVar = (whc) this.c;
                hre.r(obj);
                if (whcVar != null) {
                    cz7Var.c();
                    if (((Integer) obj3) == null) {
                        zr1.w(cz7Var, whcVar.a);
                    }
                    return pvcVar;
                }
                xk5.o();
                return null;
            default:
                hre.r(obj);
                aw7 aw7Var = (aw7) obj3;
                if (((Number) aw7Var.getValue()).floatValue() < 250.0f && ((Number) aw7Var.getValue()).floatValue() > -250.0f) {
                    aw7Var.setValue(Float.valueOf(((Number) ((yya) obj2).getValue()).floatValue()));
                } else {
                    ((vt4) this.c).invoke();
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ve1(cz7 cz7Var, Object obj, m42 m42Var, int i) {
        super(3, m42Var);
        this.a = i;
        this.b = cz7Var;
        this.d = obj;
    }
}
