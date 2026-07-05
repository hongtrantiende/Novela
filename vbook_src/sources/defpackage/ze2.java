package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ze2  reason: default package */
/* loaded from: classes3.dex */
public final class ze2 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public float c;
    public /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ze2(Object obj, float f, Object obj2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.c = f;
        this.e = obj2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                ze2 ze2Var = new ze2((ef2) obj2, this.c, m42Var);
                ze2Var.d = obj;
                return ze2Var;
            case 1:
                return new ze2((y4a) this.d, this.c, (wz9) obj2, m42Var, 1);
            case 2:
                return new ze2((rl) this.d, this.c, (xr) obj2, m42Var, 2);
            default:
                ze2 ze2Var2 = new ze2((tkc) obj2, m42Var);
                ze2Var2.d = obj;
                return ze2Var2;
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
                return ((ze2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((ze2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((ze2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((ze2) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        m82 m82Var;
        float v;
        int i = this.a;
        pvc pvcVar = pvc.a;
        Object obj2 = this.e;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                m82 m82Var2 = (m82) this.d;
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
                ef2 ef2Var = (ef2) obj2;
                ow7 ow7Var = ef2Var.q;
                ye2 ye2Var = new ye2(ef2Var, this.c, m82Var2, null);
                this.d = null;
                this.b = 1;
                ow7Var.getClass();
                if (k27.p(new xr0(jw7.a, ow7Var, ye2Var, (m42) null, 13), this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 1:
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
                if (((y4a) this.d).f0(this.c, (wz9) obj2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                        return pvcVar;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                this.b = 1;
                if (lq.c(((rl) this.d).T, new Float(this.c), (xr) obj2, null, null, this, 12) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        v = this.c;
                        m82Var = (m82) this.d;
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    m82 m82Var3 = (m82) this.d;
                    m82Var = m82Var3;
                    v = ote.v(m82Var3.q());
                }
                while (k27.v(m82Var)) {
                    ni3 ni3Var = new ni3(v, 5, (tkc) obj2);
                    this.d = m82Var;
                    this.c = v;
                    this.b = 1;
                    if (cqe.i(getContext()).m0(ni3Var, this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze2(tkc tkcVar, m42 m42Var) {
        super(2, m42Var);
        this.a = 3;
        this.e = tkcVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ze2(ef2 ef2Var, float f, m42 m42Var) {
        super(2, m42Var);
        this.a = 0;
        this.e = ef2Var;
        this.c = f;
    }
}
