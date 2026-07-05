package defpackage;

import java.nio.charset.Charset;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xg5  reason: default package */
/* loaded from: classes3.dex */
public final class xg5 extends aab implements ou4 {
    public int a;
    public /* synthetic */ oh5 b;
    public /* synthetic */ s11 c;
    public /* synthetic */ isc d;
    public final /* synthetic */ Charset e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg5(Charset charset, m42 m42Var) {
        super(5, m42Var);
        this.e = charset;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        oh5 oh5Var = this.b;
        s11 s11Var = this.c;
        isc iscVar = this.d;
        int i = this.a;
        Charset charset = null;
        if (i != 0) {
            if (i == 1) {
                hre.r(obj);
            } else {
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            hre.r(obj);
            if (!iscVar.a.equals(cm9.a(String.class))) {
                return null;
            }
            this.b = oh5Var;
            this.c = null;
            this.d = null;
            this.a = 1;
            obj = v9e.J(s11Var, this);
            n82 n82Var = n82.a;
            if (obj == n82Var) {
                return n82Var;
            }
        }
        psa psaVar = (psa) obj;
        te5 y0 = oh5Var.y0();
        pw6 pw6Var = yg5.a;
        e32 z = oue.z(y0.d());
        if (z != null) {
            charset = h32.a(z);
        }
        if (charset == null) {
            charset = this.e;
        }
        pw6 pw6Var2 = yg5.a;
        pw6Var2.i("Reading response body for " + y0.c().getUrl() + " as String with charset " + charset);
        return fre.o(psaVar, charset, 2);
    }

    @Override // defpackage.ou4
    public final Object l(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        gkc gkcVar = (gkc) obj;
        xg5 xg5Var = new xg5(this.e, (m42) obj5);
        xg5Var.b = (oh5) obj2;
        xg5Var.c = (s11) obj3;
        xg5Var.d = (isc) obj4;
        return xg5Var.invokeSuspend(pvc.a);
    }
}
