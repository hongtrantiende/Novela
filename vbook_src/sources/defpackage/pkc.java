package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pkc  reason: default package */
/* loaded from: classes.dex */
public final class pkc {
    public final drc a;
    public final hm8 b = yae.z(null);
    public final /* synthetic */ tkc c;

    public pkc(tkc tkcVar, drc drcVar, String str) {
        this.c = tkcVar;
        this.a = drcVar;
    }

    public final okc a(xt4 xt4Var, Object obj, js jsVar, xt4 xt4Var2) {
        hm8 hm8Var = this.b;
        okc okcVar = (okc) hm8Var.getValue();
        tkc tkcVar = this.c;
        if (okcVar == null) {
            Object invoke = xt4Var2.invoke(tkcVar.a.z());
            Object invoke2 = xt4Var2.invoke(tkcVar.a.z());
            drc drcVar = this.a;
            js jsVar2 = (js) drcVar.a.invoke(invoke2);
            jsVar2.d();
            skc skcVar = new skc(tkcVar, invoke, jsVar2, drcVar);
            okcVar = new okc(this, skcVar, xt4Var, xt4Var2);
            hm8Var.setValue(okcVar);
            tkcVar.j.add(skcVar);
        }
        okcVar.c = xt4Var2;
        okcVar.b = xt4Var;
        okcVar.a(tkcVar.f(), obj, jsVar);
        return okcVar;
    }
}
