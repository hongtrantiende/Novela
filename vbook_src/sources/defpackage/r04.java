package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r04  reason: default package */
/* loaded from: classes.dex */
public final class r04 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ x04 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r04(x04 x04Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = x04Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        x04 x04Var = this.c;
        switch (i) {
            case 0:
                return new r04(x04Var, m42Var, 0);
            default:
                return new r04(x04Var, m42Var, 1);
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
                return ((r04) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                ((r04) create(m82Var, m42Var)).invokeSuspend(pvcVar);
                return n82.a;
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        long j;
        int i = this.a;
        x04 x04Var = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                i04 i04Var = x04Var.E;
                int i2 = this.b;
                if (i2 != 0 && i2 != 1) {
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                while (k27.u(getContext())) {
                    cza czaVar = x04Var.K;
                    Long l = new Long(i04Var.k());
                    czaVar.getClass();
                    czaVar.n(null, l);
                    cza czaVar2 = (cza) x04Var.G.b;
                    int i3 = 0;
                    if (i04Var.v(16)) {
                        long d = i04Var.d();
                        long p = i04Var.p();
                        if (d != -9223372036854775807L && p != -9223372036854775807L) {
                            if (p == 0) {
                                i3 = 100;
                            } else {
                                long u = twe.u(d, 100L);
                                if (u != Long.MAX_VALUE && u != Long.MIN_VALUE) {
                                    j = u / p;
                                } else {
                                    j = d / (p / 100);
                                }
                                i3 = a2d.i(hc2.r(j), 0, 100);
                            }
                        }
                    }
                    Integer num = new Integer(i3);
                    czaVar2.getClass();
                    czaVar2.n(null, num);
                    hq7 hq7Var = wl3.b;
                    long N = jue.N(0.1d);
                    this.b = 1;
                    if (ade.r(N, this) == n82Var) {
                        return n82Var;
                    }
                }
                return pvc.a;
            default:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 != 1) {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    throw a82.e(obj);
                }
                hre.r(obj);
                bb bbVar = new bb(x04Var, 19);
                this.b = 1;
                ((cza) ((s26) x04Var.H.a).b).a(bbVar, this);
                return n82Var;
        }
    }
}
