package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vbc  reason: default package */
/* loaded from: classes.dex */
public final class vbc extends dcc {
    public final s26 d;
    public String e;
    public final s26 f;
    public final s26 g;
    public boolean h;

    public vbc() {
        super(acc.a);
        this.d = new s26(28, false);
        this.f = new s26(28, false);
        this.g = new s26(28, false);
    }

    @Override // defpackage.dcc
    public final void f() {
        this.a = -1;
        this.b = -1;
        this.d.O();
        this.e = null;
        this.f.O();
        this.g.O();
        this.h = false;
    }

    public final String toString() {
        return hl5.n("<!doctype ", this.d.V(), ">");
    }
}
