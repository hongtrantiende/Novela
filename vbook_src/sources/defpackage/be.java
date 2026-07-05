package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: be  reason: default package */
/* loaded from: classes.dex */
public final class be extends aab implements mu4 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ce c;
    public final /* synthetic */ wl9 d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(ce ceVar, wl9 wl9Var, float f, m42 m42Var) {
        super(3, m42Var);
        this.c = ceVar;
        this.d = wl9Var;
        this.e = f;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        jt2 jt2Var = (jt2) obj2;
        wl9 wl9Var = this.d;
        float f = this.e;
        be beVar = new be(this.c, wl9Var, f, (m42) obj3);
        beVar.b = (le) obj;
        return beVar.invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        wl9 wl9Var;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                wl9Var = (wl9) this.b;
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            ce ceVar = this.c;
            ae aeVar = new ae(0, ceVar, (le) this.b);
            li4 li4Var = ceVar.g0;
            if (li4Var != null) {
                wl9 wl9Var2 = this.d;
                this.b = wl9Var2;
                this.a = 1;
                obj = li4Var.a(aeVar, this.e, this);
                n82 n82Var = n82.a;
                if (obj == n82Var) {
                    return n82Var;
                }
                wl9Var = wl9Var2;
            } else {
                c16.w("resolvedFlingBehavior");
                throw null;
            }
        }
        wl9Var.a = ((Number) obj).floatValue();
        return pvc.a;
    }
}
