package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s4a  reason: default package */
/* loaded from: classes3.dex */
public final class s4a extends aab implements xt4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ y4a c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ tkc e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s4a(y4a y4aVar, Object obj, tkc tkcVar, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.c = y4aVar;
        this.d = obj;
        this.e = tkcVar;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        switch (this.a) {
            case 0:
                return new s4a(this.c, this.d, this.e, m42Var, 0);
            default:
                return new s4a(this.c, this.d, this.e, m42Var, 1);
        }
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj;
        switch (i) {
            case 0:
                return ((s4a) create(m42Var)).invokeSuspend(pvcVar);
            default:
                return ((s4a) create(m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        float f;
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
                lc9 lc9Var = new lc9((Object) this.c, this.d, (Object) this.e, (m42) null, 4, false);
                this.b = 1;
                if (k27.p(lc9Var, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                int i3 = this.b;
                tkc tkcVar = this.e;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    y4a y4aVar = this.c;
                    y4aVar.d0();
                    hm8 hm8Var = y4aVar.b;
                    y4aVar.I = Long.MIN_VALUE;
                    y4aVar.h0(nae.e);
                    Object value = y4aVar.c.getValue();
                    Object obj2 = this.d;
                    if (c16.i(obj2, value)) {
                        f = -4.0f;
                    } else if (c16.i(obj2, hm8Var.getValue())) {
                        f = -5.0f;
                    } else {
                        f = -3.0f;
                    }
                    tkcVar.p(obj2);
                    tkcVar.n(0L);
                    hm8Var.setValue(obj2);
                    y4aVar.h0(nae.e);
                    y4aVar.I(obj2);
                    tkcVar.j(f);
                    if (f == -3.0f) {
                        this.b = 1;
                        if (y4a.b0(y4aVar, this) == n82Var) {
                            return n82Var;
                        }
                    }
                }
                tkcVar.i();
                return pvcVar;
        }
    }
}
