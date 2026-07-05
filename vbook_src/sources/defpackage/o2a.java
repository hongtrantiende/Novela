package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: o2a  reason: default package */
/* loaded from: classes.dex */
public final class o2a extends uq7 {
    public final x2a b;
    public final ff8 c;
    public final boolean d;
    public final boolean e;
    public final yu7 f;

    public o2a(x2a x2aVar, ff8 ff8Var, boolean z, boolean z2, yu7 yu7Var) {
        this.b = x2aVar;
        this.c = ff8Var;
        this.d = z;
        this.e = z2;
        this.f = yu7Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new w2a(null, null, null, this.f, this.c, this.b, this.d, this.e);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.c, "orientation");
        c00Var.b(this.b, "state");
        c00Var.b(null, "overscrollEffect");
        c00Var.b(Boolean.valueOf(this.d), "enabled");
        c00Var.b(Boolean.valueOf(this.e), "reverseDirection");
        c00Var.b(null, "flingBehavior");
        c00Var.b(this.f, "interactionSource");
        c00Var.b(null, "bringIntoViewSpec");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        ((w2a) mq7Var).c2(null, null, null, this.f, this.c, this.b, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof o2a) {
                o2a o2aVar = (o2a) obj;
                if (!c16.i(this.b, o2aVar.b) || this.c != o2aVar.c || this.d != o2aVar.d || this.e != o2aVar.e || !c16.i(this.f, o2aVar.f)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int k = eub.k(eub.k((this.c.hashCode() + (this.b.hashCode() * 31)) * 961, 31, this.d), 961, this.e);
        yu7 yu7Var = this.f;
        if (yu7Var != null) {
            i = yu7Var.hashCode();
        } else {
            i = 0;
        }
        return (k + i) * 31;
    }
}
