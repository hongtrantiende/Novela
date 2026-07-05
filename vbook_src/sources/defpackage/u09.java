package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: u09  reason: default package */
/* loaded from: classes.dex */
public final class u09 extends uq7 {
    public final lk b;

    public u09(lk lkVar) {
        this.b = lkVar;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new fa5(this.b, null);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "icon");
        c00Var.b(Boolean.FALSE, "overrideDescendants");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        v09 v09Var = (v09) mq7Var;
        lk lkVar = v09Var.L;
        lk lkVar2 = this.b;
        if (!c16.i(lkVar, lkVar2)) {
            v09Var.L = lkVar2;
            if (v09Var.M) {
                v09Var.J1();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof u09) && this.b.equals(((u09) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.b.b * 31);
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.b + ", overrideDescendants=false)";
    }
}
