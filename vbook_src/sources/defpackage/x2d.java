package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: x2d  reason: default package */
/* loaded from: classes3.dex */
public final class x2d extends aab implements xt4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ gn8 c;
    public final /* synthetic */ gn8 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ cs9 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x2d(Object obj, gn8 gn8Var, gn8 gn8Var2, boolean z, cs9 cs9Var, m42 m42Var, int i) {
        super(1, m42Var);
        this.a = i;
        this.C = obj;
        this.c = gn8Var;
        this.d = gn8Var2;
        this.e = z;
        this.f = cs9Var;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        int i = this.a;
        Object obj = this.C;
        switch (i) {
            case 0:
                return new x2d((d3d) obj, this.c, this.d, this.e, this.f, m42Var, 0);
            default:
                return new x2d((s3d) obj, this.c, this.d, this.e, this.f, m42Var, 1);
        }
    }

    @Override // defpackage.xt4
    public final Object invoke(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        m42 m42Var = (m42) obj;
        switch (i) {
            case 0:
                return ((x2d) create(m42Var)).invokeSuspend(pvcVar);
            default:
                return ((x2d) create(m42Var)).invokeSuspend(pvcVar);
        }
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        gn8 gn8Var = this.c;
        Object obj2 = this.C;
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
                String a = gn8Var.a();
                this.b = 1;
                if (d3d.a((d3d) obj2, a, this.d, this.e, this.f, this) == n82Var) {
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
                String a2 = gn8Var.a();
                this.b = 1;
                if (s3d.b((s3d) obj2, a2, this.d, this.e, this.f, this) == n82Var) {
                    return n82Var;
                }
                return pvcVar;
        }
    }
}
