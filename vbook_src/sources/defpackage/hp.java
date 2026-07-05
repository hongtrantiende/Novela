package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hp  reason: default package */
/* loaded from: classes.dex */
public final class hp extends aab implements lu4 {
    public int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ kp c;
    public final /* synthetic */ long d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hp(boolean z, kp kpVar, long j, m42 m42Var) {
        super(2, m42Var);
        this.b = z;
        this.c = kpVar;
        this.d = j;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new hp(this.b, this.c, this.d, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((hp) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    hre.r(obj);
                    ((z4d) obj).getClass();
                } else {
                    vs.k("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                hre.r(obj);
                ((z4d) obj).getClass();
            }
        } else {
            hre.r(obj);
            x08 x08Var = this.c.a;
            n82 n82Var = n82.a;
            if (!this.b) {
                this.a = 1;
                Object a = x08Var.a(0L, this.d, this);
                if (a != n82Var) {
                    obj = a;
                    ((z4d) obj).getClass();
                }
            } else {
                this.a = 2;
                Object a2 = x08Var.a(this.d, 0L, this);
                if (a2 != n82Var) {
                    obj = a2;
                    ((z4d) obj).getClass();
                }
            }
            return n82Var;
        }
        return pvc.a;
    }
}
