package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: on0  reason: default package */
/* loaded from: classes3.dex */
public final class on0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ sn0 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ on0(sn0 sn0Var, String str, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = sn0Var;
        this.d = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        String str = this.d;
        sn0 sn0Var = this.c;
        switch (i) {
            case 0:
                return new on0(sn0Var, str, m42Var, 0);
            case 1:
                return new on0(sn0Var, str, m42Var, 1);
            case 2:
                return new on0(sn0Var, str, m42Var, 2);
            case 3:
                return new on0(sn0Var, str, m42Var, 3);
            default:
                return new on0(sn0Var, str, m42Var, 4);
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
                return ((on0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((on0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 2:
                return ((on0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 3:
                return ((on0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((on0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
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
                Object C = z1d.C(z1d.A(new oh2(di2Var.a.getData(), str, 0)), this);
                if (C == n82Var) {
                    return n82Var;
                }
                return C;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                di2 di2Var2 = sn0Var.a;
                this.b = 1;
                str.getClass();
                Object C2 = z1d.C(z1d.A(new oh2(di2Var2.a.getData(), str, 1)), this);
                if (C2 == n82Var) {
                    return n82Var;
                }
                return C2;
            case 2:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                di2 di2Var3 = sn0Var.a;
                this.b = 1;
                str.getClass();
                Object C3 = z1d.C(z1d.A(new oh2(di2Var3.a.getData(), str, 2)), this);
                if (C3 == n82Var) {
                    return n82Var;
                }
                return C3;
            case 3:
                int i5 = this.b;
                if (i5 != 0) {
                    if (i5 == 1) {
                        hre.r(obj);
                        return obj;
                    }
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hre.r(obj);
                di2 di2Var4 = sn0Var.a;
                this.b = 1;
                str.getClass();
                Object C4 = z1d.C(z1d.A(new oh2(di2Var4.a.getData(), str, 3)), this);
                if (C4 == n82Var) {
                    return n82Var;
                }
                return C4;
            default:
                int i6 = this.b;
                pvc pvcVar = pvc.a;
                if (i6 != 0) {
                    if (i6 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    di2 di2Var5 = sn0Var.a;
                    this.b = 1;
                    Object o = y9e.o(di2Var5.a, new db(str, null, 12), this);
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
