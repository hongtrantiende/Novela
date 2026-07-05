package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s42  reason: default package */
/* loaded from: classes3.dex */
public final class s42 extends ja0 {
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
        return true;
    }

    @Override // defpackage.ja0
    public final void e() {
        this.f.setValue(Boolean.FALSE);
        iya iyaVar = this.i;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        z87.v(this.c, null, null, new q42(this, null, 0), 3);
    }

    @Override // defpackage.ja0
    public final void f() {
        Boolean bool = Boolean.TRUE;
        this.e.setValue(bool);
        this.f.setValue(bool);
        iya iyaVar = this.i;
        if (iyaVar != null) {
            iyaVar.cancel(null);
        }
        this.i = z87.v(this.c, null, null, new q42(this, null, 1), 3);
    }

    @Override // defpackage.ja0
    public final void g(float f) {
        z87.v(this.c, null, null, new jo(this, f, null, 1), 3);
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
        f();
    }

    @Override // defpackage.ja0
    public final void k() {
        this.e.setValue(Boolean.FALSE);
        e();
    }
}
