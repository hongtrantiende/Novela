package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: wg1  reason: default package */
/* loaded from: classes3.dex */
public final class wg1 extends b36 {
    public final f61 D;

    public wg1(f61 f61Var) {
        this.D = f61Var;
    }

    @Override // defpackage.b36
    public final boolean q() {
        return true;
    }

    @Override // defpackage.b36
    public final void r(Throwable th) {
        boolean p;
        l36 p2 = p();
        f61 f61Var = this.D;
        Throwable q = f61Var.q(p2);
        if (!f61Var.y()) {
            p = false;
        } else {
            p = ((ta3) f61Var.d).p(q);
        }
        if (!p) {
            f61Var.a(q);
            if (!f61Var.y()) {
                f61Var.o();
            }
        }
    }
}
