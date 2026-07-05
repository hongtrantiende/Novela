package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f6b  reason: default package */
/* loaded from: classes.dex */
public final class f6b extends uq7 {
    public final vg3 b;

    public f6b(vg3 vg3Var) {
        this.b = vg3Var;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new fa5(pye.i, this.b);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(pye.i, "icon");
        c00Var.b(Boolean.FALSE, "overrideDescendants");
        c00Var.b(this.b, "touchBoundsExpansion");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        g6b g6bVar = (g6b) mq7Var;
        lk lkVar = pye.i;
        if (!c16.i(g6bVar.L, lkVar)) {
            g6bVar.L = lkVar;
            if (g6bVar.M) {
                g6bVar.J1();
            }
        }
        g6bVar.K = this.b;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof f6b) {
                f6b f6bVar = (f6b) obj;
                lk lkVar = pye.i;
                if (!lkVar.equals(lkVar) || !c16.i(this.b, f6bVar.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        int k = eub.k(1022 * 31, 31, false);
        vg3 vg3Var = this.b;
        if (vg3Var != null) {
            i = vg3Var.hashCode();
        }
        return k + i;
    }

    public final String toString() {
        lk lkVar = pye.i;
        return "StylusHoverIconModifierElement(icon=" + lkVar + ", overrideDescendants=false, touchBoundsExpansion=" + this.b + ")";
    }
}
