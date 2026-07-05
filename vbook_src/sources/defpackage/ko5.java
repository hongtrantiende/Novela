package defpackage;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ko5  reason: default package */
/* loaded from: classes.dex */
public final class ko5 {
    public final Context a;
    public final ii2 b;
    public final re5 c;
    public final dx d;

    public ko5(Context context, ii2 ii2Var, re5 re5Var, dx dxVar) {
        this.a = context;
        this.b = ii2Var;
        this.c = re5Var;
        this.d = dxVar;
    }

    /* JADX WARN: Type inference failed for: r0v17, types: [wq2, java.lang.Object] */
    public final rj9 a(xt4 xt4Var) {
        nu1 nu1Var;
        dx dxVar = this.d;
        boolean booleanValue = ((Boolean) dxVar.m.c(dx.W[11], dxVar)).booleanValue();
        oaa oaaVar = new oaa(this.a, 13);
        mu1 mu1Var = new mu1();
        mu1Var.c(new l18(new u76(new t42(this, 25), 1)), cm9.a(lyc.class));
        mu1Var.a(new jl(11), cm9.a(zq9.class));
        mu1Var.c(new o00(12), cm9.a(zq9.class));
        mu1Var.a(new jl(1), cm9.a(ch0.class));
        mu1Var.c(new o00(1), cm9.a(ch0.class));
        mu1Var.a(new jl(12), cm9.a(f76.class));
        mu1Var.c(new o00(14), cm9.a(f76.class));
        mu1Var.a(new jl(5), cm9.a(tc4.class));
        mu1Var.c(new o00(8), cm9.a(tc4.class));
        mu1Var.a(new jl(7), cm9.a(f76.class));
        mu1Var.c(new o00(11), cm9.a(f76.class));
        mu1Var.a(new jl(4), cm9.a(h54.class));
        ii2 ii2Var = this.b;
        re5 re5Var = this.c;
        mu1Var.c(new i54(ii2Var, re5Var), cm9.a(h54.class));
        mu1Var.a(new jl(2), cm9.a(ho0.class));
        mu1Var.c(new jo0(0, re5Var), cm9.a(ho0.class));
        mu1Var.a(new jl(3), cm9.a(rq0.class));
        mu1Var.c(new jo0(1, re5Var), cm9.a(rq0.class));
        xt4Var.invoke(mu1Var);
        mu1Var.a.add(new Object());
        if (!booleanValue) {
            int i = Build.VERSION.SDK_INT;
            ArrayList arrayList = mu1Var.e;
            if (i >= 29) {
                arrayList.add(new lu1(new gr(), 0));
            } else {
                arrayList.add(new lu1(new Object(), 0));
            }
        }
        oaaVar.d = mu1Var.d();
        Context context = (Context) oaaVar.b;
        gp5 gp5Var = (gp5) oaaVar.c;
        v94 v94Var = (v94) oaaVar.e;
        v94Var.getClass();
        gp5 gp5Var2 = new gp5(gp5Var.a, gp5Var.b, gp5Var.c, gp5Var.d, gp5Var.e, gp5Var.f, gp5Var.g, gp5Var.h, gp5Var.i, gp5Var.j, gp5Var.k, gp5Var.l, gp5Var.m, new w94(que.x(v94Var.a)));
        mfb mfbVar = new mfb(new k85(17));
        mfb mfbVar2 = new mfb(new t42(oaaVar, 24));
        mfb mfbVar3 = new mfb(new k85(18));
        nu1 nu1Var2 = (nu1) oaaVar.d;
        if (nu1Var2 == null) {
            ks3 ks3Var = ks3.a;
            nu1Var = new nu1(ks3Var, ks3Var, ks3Var, ks3Var, ks3Var);
        } else {
            nu1Var = nu1Var2;
        }
        return new rj9(new pj9(context, gp5Var2, mfbVar, mfbVar2, mfbVar3, nu1Var));
    }
}
