package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nn0  reason: default package */
/* loaded from: classes3.dex */
public final class nn0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ sn0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ boolean e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nn0(sn0 sn0Var, String str, boolean z, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = sn0Var;
        this.d = str;
        this.e = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new nn0(this.c, this.d, this.e, m42Var, 0);
            default:
                return new nn0(this.c, this.d, this.e, m42Var, 1);
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
                return ((nn0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((nn0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        boolean z = this.e;
        String str = this.d;
        sn0 sn0Var = this.c;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                di2 di2Var = sn0Var.a;
                this.b = 1;
                str.getClass();
                Object C = z1d.C(z1d.A(new lh2(di2Var.a.getData(), str, z)), this);
                if (C == n82Var) {
                    return n82Var;
                }
                return C;
            default:
                int i3 = this.b;
                pvc pvcVar = pvc.a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    di2 di2Var2 = sn0Var.a;
                    this.b = 1;
                    Object o = y9e.o(di2Var2.a, new er0(str, z, (m42) null), this);
                    if (o != n82Var) {
                        o = pvcVar;
                    }
                    if (o == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }
}
