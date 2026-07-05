package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p43  reason: default package */
/* loaded from: classes3.dex */
public final class p43 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ aw7 c;
    public final /* synthetic */ v43 d;
    public final /* synthetic */ aw7 e;
    public final /* synthetic */ aw7 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p43(aw7 aw7Var, v43 v43Var, aw7 aw7Var2, aw7 aw7Var3, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = aw7Var;
        this.d = v43Var;
        this.e = aw7Var2;
        this.f = aw7Var3;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new p43(this.c, this.d, this.e, this.f, m42Var, 0);
            default:
                return new p43(this.c, this.d, this.e, this.f, m42Var, 1);
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
                return ((p43) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((p43) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        am3 am3Var = am3.MILLISECONDS;
        aw7 aw7Var = this.c;
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
                s02 G = yae.G(new ae1(aw7Var, 21));
                hq7 hq7Var = wl3.b;
                sj4 z = z1d.z(G, ade.z(jue.O(150, am3Var)));
                o43 o43Var = new o43(this.d, this.e, this.f, null, 0);
                this.b = 1;
                if (z1d.v(z, o43Var, this) == n82Var) {
                    return n82Var;
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
                s02 G2 = yae.G(new ae1(aw7Var, 22));
                hq7 hq7Var2 = wl3.b;
                sj4 z2 = z1d.z(G2, ade.z(jue.O(150, am3Var)));
                o43 o43Var2 = new o43(this.d, this.e, this.f, null, 1);
                this.b = 1;
                if (z1d.v(z2, o43Var2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
