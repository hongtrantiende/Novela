package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nv0  reason: default package */
/* loaded from: classes3.dex */
public final class nv0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nv0(String str, String str2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        switch (i) {
            case 0:
                return new nv0(str2, str, m42Var, 0);
            case 1:
                return new nv0(str2, str, m42Var, 1);
            default:
                return new nv0(str2, str, m42Var, 2);
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
                return ((nv0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            case 1:
                return ((nv0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((nv0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
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
                Object v = yqe.v((y3b) x2b.F0.getValue(), new Object[]{str2, str}, this);
                if (v == n82Var) {
                    return n82Var;
                }
                return v;
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
                this.b = 1;
                Object v2 = yqe.v((y3b) x2b.E0.getValue(), new Object[]{str2, str}, this);
                if (v2 == n82Var) {
                    return n82Var;
                }
                return v2;
            default:
                int i4 = this.b;
                pvc pvcVar = pvc.a;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hre.r(obj);
                    } else {
                        vs.k("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    hre.r(obj);
                    z62.a.getClass();
                    z62 a = y62.a();
                    this.b = 1;
                    ((oh) a).b.setCookie(str2, str);
                    if (pvcVar == n82Var) {
                        return n82Var;
                    }
                }
                return pvcVar;
        }
    }
}
