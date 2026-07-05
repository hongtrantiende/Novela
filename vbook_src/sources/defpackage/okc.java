package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: okc  reason: default package */
/* loaded from: classes.dex */
public final class okc implements yya {
    public final skc a;
    public xt4 b;
    public xt4 c;
    public final /* synthetic */ pkc d;

    public okc(pkc pkcVar, skc skcVar, xt4 xt4Var, xt4 xt4Var2) {
        this.d = pkcVar;
        this.a = skcVar;
        this.b = xt4Var;
        this.c = xt4Var2;
    }

    public final void a(qkc qkcVar, Object obj, js jsVar) {
        Object invoke = this.c.invoke(qkcVar.f());
        boolean g = this.d.c.g();
        skc skcVar = this.a;
        if (g) {
            skcVar.g(this.c.invoke(qkcVar.d()), invoke, (lf4) this.b.invoke(qkcVar));
        } else {
            skcVar.h(invoke, (lf4) this.b.invoke(qkcVar), obj, jsVar);
        }
    }

    @Override // defpackage.yya
    public final Object getValue() {
        a(this.d.c.f(), null, null);
        return this.a.F.getValue();
    }
}
