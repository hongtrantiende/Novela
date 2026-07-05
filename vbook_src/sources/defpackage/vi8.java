package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vi8  reason: default package */
/* loaded from: classes3.dex */
public final class vi8 extends ja0 {
    public iya i;

    @Override // defpackage.ja0
    public final void a() {
        iya iyaVar = this.i;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
    }

    @Override // defpackage.ja0
    public final boolean b() {
        return false;
    }

    @Override // defpackage.ja0
    public final void e() {
        this.f.setValue(Boolean.FALSE);
        iya iyaVar = this.i;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
    }

    @Override // defpackage.ja0
    public final void f() {
        this.f.setValue(Boolean.TRUE);
        this.i = z87.v(this.c, null, null, new p95(this, null, 1), 3);
    }

    @Override // defpackage.ja0
    public final void g(float f) {
        boolean z;
        float f2;
        long i;
        float floatValue = ((Number) this.g.getValue()).floatValue();
        if (this.b.j().p == ff8.a) {
            z = true;
        } else {
            z = false;
        }
        kj6 kj6Var = this.b;
        if (z) {
            f2 = -f;
            i = kj6Var.j().i() & 4294967295L;
        } else {
            f2 = -f;
            i = kj6Var.j().i() >> 32;
        }
        h(floatValue + (f2 / ((int) i)));
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
        if (!kqe.q(this.b, false)) {
            return;
        }
        z87.v(this.c, null, null, new rg0(this, null, 16), 3);
    }

    @Override // defpackage.ja0
    public final void k() {
        this.e.setValue(Boolean.FALSE);
        e();
    }
}
