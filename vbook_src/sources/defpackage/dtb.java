package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dtb  reason: default package */
/* loaded from: classes.dex */
public final class dtb implements npb {
    public final /* synthetic */ gtb a;
    public final /* synthetic */ boolean b;

    public dtb(gtb gtbVar, boolean z) {
        this.a = gtbVar;
        this.b = z;
    }

    @Override // defpackage.npb
    public final void b() {
        gtb gtbVar = this.a;
        gtbVar.r.setValue(null);
        gtbVar.s.setValue(null);
        gtbVar.t(true);
    }

    @Override // defpackage.npb
    public final void c() {
        gtb gtbVar = this.a;
        gtbVar.r.setValue(null);
        gtbVar.s.setValue(null);
        gtbVar.t(true);
    }

    @Override // defpackage.npb
    public final void d() {
        h35 h35Var;
        gvb d;
        boolean z = this.b;
        if (z) {
            h35Var = h35.b;
        } else {
            h35Var = h35.c;
        }
        gtb gtbVar = this.a;
        gtbVar.r.setValue(h35Var);
        long a = a7a.a(gtbVar.l(z));
        ol6 ol6Var = gtbVar.d;
        if (ol6Var != null && (d = ol6Var.d()) != null) {
            long e = d.e(a);
            gtbVar.o = e;
            gtbVar.s.setValue(new y78(e));
            gtbVar.q = 0L;
            gtbVar.t = -1;
            ol6 ol6Var2 = gtbVar.d;
            if (ol6Var2 != null) {
                ol6Var2.q.setValue(Boolean.TRUE);
            }
            gtbVar.t(false);
        }
    }

    @Override // defpackage.npb
    public final void e(long j) {
        gtb gtbVar = this.a;
        long j2 = y78.j(gtbVar.q, j);
        gtbVar.q = j2;
        gtbVar.s.setValue(new y78(y78.j(gtbVar.o, j2)));
        jub n = gtbVar.n();
        y78 i = gtbVar.i();
        i.getClass();
        gtb.c(gtbVar, n, i.a, false, this.b, abf.L, true, new t35(9));
        gtbVar.t(false);
    }

    @Override // defpackage.npb
    public final void onCancel() {
    }

    @Override // defpackage.npb
    public final void a(long j, h6a h6aVar) {
    }
}
