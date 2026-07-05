package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: moa  reason: default package */
/* loaded from: classes3.dex */
public final class moa extends aab implements nu4 {
    public /* synthetic */ joa a;
    public /* synthetic */ String b;
    public /* synthetic */ oz0 c;
    public final /* synthetic */ rm0 d;
    public final /* synthetic */ uo3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public moa(rm0 rm0Var, uo3 uo3Var, m42 m42Var) {
        super(4, m42Var);
        this.d = rm0Var;
        this.e = uo3Var;
    }

    @Override // defpackage.nu4
    public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
        moa moaVar = new moa(this.d, this.e, (m42) obj4);
        moaVar.a = (joa) obj;
        moaVar.b = (String) obj2;
        moaVar.c = (oz0) obj3;
        return moaVar.invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        joa joaVar = this.a;
        String str = this.b;
        oz0 oz0Var = this.c;
        hre.r(obj);
        rm0 rm0Var = this.d;
        rm0Var.getClass();
        str.getClass();
        em0 em0Var = (em0) rm0Var.a.get(str);
        if (em0Var == null) {
            return new uoa("Unknown block type: ".concat(str));
        }
        xt4 xt4Var = em0Var.f;
        boolean z = oz0Var instanceof nz0;
        toa toaVar = toa.a;
        if (z) {
            String str2 = joaVar.a;
            str2.getClass();
            this.e.d(new v62(joaVar.a, ((xl0) xt4Var.invoke(new pm0(str2))).b));
            return toaVar;
        }
        xl0 xl0Var = null;
        if (oz0Var instanceof mz0) {
            xl0 xl0Var2 = (xl0) xt4Var.invoke(new pm0(hre.q().toString()));
            eb5 eb5Var = joaVar.d;
            String str3 = (String) eb5Var.b;
            uo3 uo3Var = (uo3) eb5Var.c;
            xl0Var2.getClass();
            xl0 c = uo3Var.e().c(str3);
            if (c != null && (c.c instanceof cm0)) {
                xl0Var = c;
            }
            if (xl0Var == null) {
                return toaVar;
            }
            uo3Var.d(new xw5(xl0Var2, str3));
            return toaVar;
        }
        xk5.o();
        return null;
    }
}
