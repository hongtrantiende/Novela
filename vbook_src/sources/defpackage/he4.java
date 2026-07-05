package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: he4  reason: default package */
/* loaded from: classes3.dex */
public final class he4 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public bx8 b;
    public int c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ xt4 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ he4(String str, String str2, xt4 xt4Var, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.d = str;
        this.e = str2;
        this.f = xt4Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new he4(this.d, this.e, this.f, m42Var, 0);
            default:
                return new he4(this.d, this.e, this.f, m42Var, 1);
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
                return ((he4) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((he4) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        bx8 bx8Var;
        bx8 bx8Var2;
        int i = this.a;
        xt4 xt4Var = this.f;
        String str = this.e;
        String str2 = this.d;
        n82 n82Var = n82.a;
        switch (i) {
            case 0:
                int i2 = this.c;
                if (i2 != 0) {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            bx8Var = this.b;
                            hre.r(obj);
                            return new hh8(bx8Var, 0);
                        }
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                } else {
                    hre.r(obj);
                    this.c = 1;
                    obj = yz1.s(str2, str, this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                bx8 bx8Var3 = (bx8) obj;
                if (bx8Var3 != null) {
                    sw2 sw2Var = ab3.a;
                    ru2 ru2Var = ru2.c;
                    uw2 uw2Var = new uw2(bx8Var3, xt4Var, (m42) null, 24);
                    this.b = bx8Var3;
                    this.c = 2;
                    if (z87.E(ru2Var, uw2Var, this) != n82Var) {
                        bx8Var = bx8Var3;
                        return new hh8(bx8Var, 0);
                    }
                    return n82Var;
                }
                return null;
            default:
                int i3 = this.c;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            bx8Var2 = this.b;
                            hre.r(obj);
                            return new hh8(bx8Var2, 0);
                        }
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                } else {
                    hre.r(obj);
                    this.c = 1;
                    obj = yz1.s(str2, str, this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                bx8 bx8Var4 = (bx8) obj;
                if (bx8Var4 != null) {
                    sw2 sw2Var2 = ab3.a;
                    ru2 ru2Var2 = ru2.c;
                    d53 d53Var = new d53(xt4Var, bx8Var4, (m42) null, 16);
                    this.b = bx8Var4;
                    this.c = 2;
                    if (z87.E(ru2Var2, d53Var, this) != n82Var) {
                        bx8Var2 = bx8Var4;
                        return new hh8(bx8Var2, 0);
                    }
                    return n82Var;
                }
                return null;
        }
    }
}
