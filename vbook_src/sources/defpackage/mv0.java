package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: mv0  reason: default package */
/* loaded from: classes3.dex */
public final class mv0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mv0(int i, m42 m42Var, String str) {
        super(2, m42Var);
        this.a = i;
        this.c = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        String str = this.c;
        switch (i) {
            case 0:
                return new mv0(0, m42Var, str);
            case 1:
                return new mv0(1, m42Var, str);
            default:
                return new mv0(2, m42Var, str);
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
                return ((mv0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((mv0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((mv0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        String str = this.c;
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
                this.b = 1;
                Object v = yqe.v((y3b) x2b.H0.getValue(), new Object[]{str}, this);
                if (v == n82Var) {
                    return n82Var;
                }
                return v;
            case 1:
                int i3 = this.b;
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            hre.r(obj);
                            return (String) obj;
                        }
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hre.r(obj);
                } else {
                    hre.r(obj);
                    xy0 xy0Var = b48.g;
                    this.b = 1;
                    xy0Var.getClass();
                    obj = xy0.L(xy0Var, this);
                    if (obj == n82Var) {
                        return n82Var;
                    }
                }
                return ((String) obj).substring(0, 32);
            default:
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
                this.b = 1;
                String m = s21.m("composeResources/com.reader.resources/", str);
                tza tzaVar = fr9.a;
                Object b = ns2.b(m);
                if (b == n82Var) {
                    return n82Var;
                }
                return b;
        }
    }
}
