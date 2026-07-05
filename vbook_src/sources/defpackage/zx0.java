package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zx0  reason: default package */
/* loaded from: classes3.dex */
public final class zx0 extends aab implements lu4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ fy0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zx0(fy0 fy0Var, String str, String str2, m42 m42Var, int i) {
        super(2, m42Var);
        this.a = i;
        this.c = fy0Var;
        this.d = str;
        this.e = str2;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        switch (this.a) {
            case 0:
                return new zx0(this.c, this.d, this.e, m42Var, 0);
            default:
                return new zx0(this.c, this.d, this.e, m42Var, 1);
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
                return ((zx0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
            default:
                return ((zx0) create(m82Var, m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        n82 n82Var = n82.a;
        fy0 fy0Var = this.c;
        String str = this.d;
        String str2 = this.e;
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
                mw0 mw0Var = fy0Var.d;
                this.b = 1;
                ((qw0) mw0Var).a.e.r0(new em2(by5.a.k().b(), str2, str));
                if (pvcVar == n82Var) {
                    return n82Var;
                }
                return pvcVar;
            default:
                mw0 mw0Var2 = fy0Var.d;
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
                qw0 qw0Var = (qw0) mw0Var2;
                qw0Var.getClass();
                str.getClass();
                u68 u68Var = qw0Var.b.f;
                r76[] r76VarArr = lw0.h;
                u68Var.e(r76VarArr[5], str);
                qw0 qw0Var2 = (qw0) mw0Var2;
                qw0Var2.getClass();
                str2.getClass();
                qw0Var2.b.g.e(r76VarArr[6], str2);
                String str3 = ((wx0) fy0Var.F.getValue()).b;
                this.b = 1;
                if (fy0.j(fy0Var, str3, str, str2, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
