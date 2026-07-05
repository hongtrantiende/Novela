package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dsd  reason: default package */
/* loaded from: classes3.dex */
public final class dsd extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ y78 c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dsd(Object obj, y78 y78Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = obj;
        this.c = y78Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        y78 y78Var = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return new dsd((atd) obj2, y78Var, m42Var, 0);
            default:
                return new dsd((lsd) obj2, y78Var, m42Var, 1);
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
                return ((dsd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((dsd) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        float f;
        long k;
        float f2;
        int i = this.a;
        pvc pvcVar = pvc.a;
        y78 y78Var = this.c;
        n82 n82Var = n82.a;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                atd atdVar = (atd) obj2;
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
                boolean k2 = atdVar.k();
                if (k2) {
                    float f3 = atdVar.b;
                    if (((ng8) atdVar.d.getValue()) != null) {
                        f2 = 1.0f;
                    } else {
                        f2 = nae.e;
                    }
                    f = Math.max(f3, f2);
                } else {
                    f = atdVar.e;
                }
                if (k2) {
                    k = 0;
                } else {
                    k = y78.k(f, atdVar.b(y78Var.a));
                }
                long j = k;
                this.b = 1;
                if (atd.a(atdVar, f, j, this, 4) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                lsd lsdVar = (lsd) obj2;
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
                long A = dye.A(lsdVar.M.c.i(dye.t(y78Var.a)));
                btd btdVar = lsdVar.M;
                this.b = 1;
                if (btdVar.c.h(dye.t(A), true, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
