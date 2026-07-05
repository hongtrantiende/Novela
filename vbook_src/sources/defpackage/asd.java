package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: asd  reason: default package */
/* loaded from: classes3.dex */
public final class asd extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ atd c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ asd(atd atdVar, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = atdVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        atd atdVar = this.c;
        switch (i) {
            case 0:
                return new asd(atdVar, m42Var, 0);
            default:
                return new asd(atdVar, m42Var, 1);
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
                return ((asd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((asd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        boolean z;
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                jk1 jk1Var = null;
                atd atdVar = this.c;
                if (!((Boolean) atdVar.q.getValue()).booleanValue()) {
                    if (((ng8) atdVar.d.getValue()) != null) {
                        jk1Var = new jk1(1.0f, 1.0f);
                    }
                    if (jk1Var != null) {
                        float floatValue = new Float(atdVar.f()).floatValue();
                        if (floatValue >= jk1Var.a && floatValue <= jk1Var.b) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            float floatValue2 = ((Number) dce.p(new Float(atdVar.f()), jk1Var)).floatValue();
                            this.b = 1;
                            if (atd.a(atdVar, floatValue2, 0L, this, 6) == n82Var) {
                                return n82Var;
                            }
                            return pvcVar;
                        }
                        return pvcVar;
                    }
                    return pvcVar;
                }
                return pvcVar;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                atd atdVar2 = this.c;
                if (ote.l(atdVar2.e(), nae.e, null, new ssd(atdVar2, 1), this, 12) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
