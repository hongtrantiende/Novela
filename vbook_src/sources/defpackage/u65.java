package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u65  reason: default package */
/* loaded from: classes3.dex */
public final class u65 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ w65 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u65(w65 w65Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = w65Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        w65 w65Var = this.c;
        switch (i) {
            case 0:
                return new u65(w65Var, m42Var, 0);
            case 1:
                return new u65(w65Var, m42Var, 1);
            default:
                return new u65(w65Var, m42Var, 2);
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
                return ((u65) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((u65) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((u65) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        w65 w65Var = this.c;
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
                wl6 wl6Var = w65Var.e;
                this.b = 1;
                if (((bn6) wl6Var).g(by5.a.k().b() - 2592000000L, this) == n82Var) {
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
                jj9 b = ((en6) w65Var.d).b();
                s02 O = v9e.O(((bn6) w65Var.e).a.c.t0(0));
                sw2 sw2Var = ab3.a;
                ja y = z1d.y(b, new hs0(v9e.z(O, ru2.c), 13), ((plc) w65Var.c).j(), new e91(4, 3, null));
                bb bbVar = new bb(w65Var, 24);
                this.b = 1;
                if (y.a(bbVar, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
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
                wl6 wl6Var2 = w65Var.e;
                this.b = 1;
                if (((bn6) wl6Var2).d(this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
