package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q95  reason: default package */
/* loaded from: classes3.dex */
public final class q95 extends ja0 {
    public h2a i;
    public iya j;

    @Override // defpackage.ja0
    public final void a() {
        iya iyaVar = this.j;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
    }

    @Override // defpackage.ja0
    public final boolean d() {
        return false;
    }

    @Override // defpackage.ja0
    public final void e() {
        this.f.setValue(Boolean.FALSE);
        iya iyaVar = this.j;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
    }

    @Override // defpackage.ja0
    public final void f() {
        this.f.setValue(Boolean.TRUE);
        this.j = z87.v(this.c, null, null, new p95(this, null, 0), 3);
    }

    @Override // defpackage.ja0
    public final void g(float f) {
        hm8 hm8Var = this.g;
        hm8Var.setValue(Float.valueOf(((-f) / ((int) (this.i.j() & 4294967295L))) + ((Number) hm8Var.getValue()).floatValue()));
    }

    @Override // defpackage.ja0
    public final void i(float f) {
        this.h.setValue(Float.valueOf(f));
        if (c()) {
            f();
        }
    }

    @Override // defpackage.ja0
    public final void j() {
        if (!this.i.g()) {
            return;
        }
        z87.v(this.c, null, null, new o54(this, (m42) null, 11), 3);
    }

    @Override // defpackage.ja0
    public final void k() {
        this.e.setValue(Boolean.FALSE);
        e();
    }
}
