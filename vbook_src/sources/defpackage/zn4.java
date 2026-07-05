package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zn4  reason: default package */
/* loaded from: classes3.dex */
public final class zn4 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ ao4 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zn4(ao4 ao4Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = ao4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        ao4 ao4Var = this.c;
        switch (i) {
            case 0:
                return new zn4(ao4Var, m42Var, 0);
            default:
                return new zn4(ao4Var, m42Var, 1);
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
                return ((zn4) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                ((zn4) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82.a;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        ao4 ao4Var = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                wl6 wl6Var = ao4Var.e;
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    jj9 b = ((en6) ao4Var.d).b();
                    s02 O = v9e.O(((bn6) wl6Var).a.c.r0(true));
                    sw2 sw2Var = ab3.a;
                    ru2 ru2Var = ru2.c;
                    ja x = z1d.x(b, new hs0(v9e.z(O, ru2Var), 12), new hs0(new sl4(v9e.O(((bn6) wl6Var).a.c.r0(false)), ru2Var, 0), 19), ((plc) ao4Var.c).j(), new r84(5, 1, null));
                    yn4 yn4Var = new yn4(ao4Var, 0);
                    this.b = 1;
                    if (x.a(yn4Var, this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvc.a;
            default:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    throw a82.e(obj);
                }
                hre.r(obj);
                cza czaVar = ((yxc) ao4Var.f).d;
                yn4 yn4Var2 = new yn4(ao4Var, 1);
                this.b = 1;
                czaVar.a(yn4Var2, this);
                return n82Var;
        }
    }
}
