package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pd  reason: default package */
/* loaded from: classes3.dex */
public final class pd extends aab implements nu4 {
    public int a;
    public /* synthetic */ ke b;
    public /* synthetic */ t07 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ pe e;
    public final /* synthetic */ float f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd(pe peVar, float f, m42 m42Var) {
        super(4, m42Var);
        this.e = peVar;
        this.f = f;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        pd pdVar = new pd(this.e, this.f, (m42) obj4);
        pdVar.b = (ke) obj;
        pdVar.c = (t07) obj2;
        pdVar.d = obj3;
        return pdVar.invokeSuspend(pvc.a);
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [wl9, java.lang.Object] */
    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        float h;
        ke keVar = this.b;
        t07 t07Var = this.c;
        Object obj2 = this.d;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            float d = t07Var.d(obj2);
            if (!Float.isNaN(d)) {
                ?? obj3 = new Object();
                pe peVar = this.e;
                if (Float.isNaN(peVar.j.h())) {
                    h = nae.e;
                } else {
                    h = peVar.j.h();
                }
                float f = h;
                obj3.a = f;
                arc arcVar = peVar.c;
                ah7 ah7Var = new ah7(5, keVar, obj3);
                this.b = null;
                this.c = null;
                this.d = null;
                this.a = 1;
                Object j = ote.j(f, d, this.f, arcVar, ah7Var, this);
                n82 n82Var = n82.a;
                if (j == n82Var) {
                    return n82Var;
                }
            }
        }
        return pvc.a;
    }
}
