package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ctb  reason: default package */
/* loaded from: classes.dex */
public final class ctb implements npb {
    public final /* synthetic */ gtb a;

    public ctb(gtb gtbVar) {
        this.a = gtbVar;
    }

    @Override // defpackage.npb
    public final void a(long j, h6a h6aVar) {
        gvb d;
        gtb gtbVar = this.a;
        long a = a7a.a(gtbVar.l(true));
        ol6 ol6Var = gtbVar.d;
        if (ol6Var != null && (d = ol6Var.d()) != null) {
            long e = d.e(a);
            gtbVar.o = e;
            gtbVar.s.setValue(new y78(e));
            gtbVar.q = 0L;
            gtbVar.r.setValue(h35.a);
            gtbVar.t(false);
        }
    }

    @Override // defpackage.npb
    public final void b() {
        gtb gtbVar = this.a;
        gtbVar.r.setValue(null);
        gtbVar.s.setValue(null);
    }

    @Override // defpackage.npb
    public final void c() {
        gtb gtbVar = this.a;
        gtbVar.r.setValue(null);
        gtbVar.s.setValue(null);
    }

    @Override // defpackage.npb
    public final void e(long j) {
        gvb d;
        s35 s35Var;
        gtb gtbVar = this.a;
        gtbVar.q = y78.j(gtbVar.q, j);
        ol6 ol6Var = gtbVar.d;
        if (ol6Var != null && (d = ol6Var.d()) != null) {
            gtbVar.s.setValue(new y78(y78.j(gtbVar.o, gtbVar.q)));
            j88 j88Var = gtbVar.b;
            y78 i = gtbVar.i();
            i.getClass();
            int d2 = j88Var.d(d.b(true, i.a));
            long a = sze.a(d2, d2);
            if (!fxb.c(a, gtbVar.n().b)) {
                ol6 ol6Var2 = gtbVar.d;
                if ((ol6Var2 == null || ((Boolean) ol6Var2.q.getValue()).booleanValue()) && (s35Var = gtbVar.k) != null) {
                    ((dx8) s35Var).a(9);
                }
                gtbVar.c.invoke(gtb.e(gtbVar.n().a, a));
                gtbVar.w = new fxb(a);
            }
        }
    }

    @Override // defpackage.npb
    public final void d() {
    }

    @Override // defpackage.npb
    public final void onCancel() {
    }
}
