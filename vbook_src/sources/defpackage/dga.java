package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: dga  reason: default package */
/* loaded from: classes.dex */
public final class dga extends uq7 {
    public final kga b;

    public dga(kga kgaVar) {
        this.b = kgaVar;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new cga(this.b);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(this.b, "sharedElementState");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        cga cgaVar = (cga) mq7Var;
        kga kgaVar = cgaVar.M;
        kga kgaVar2 = this.b;
        if (kgaVar2 != kgaVar) {
            kgaVar.a.setValue(Boolean.FALSE);
            cgaVar.M = kgaVar2;
            kgaVar2.a.setValue(Boolean.valueOf(cgaVar.J));
            if (cgaVar.J) {
                cgaVar.K1();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof dga) && this.b == ((dga) obj).b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "SharedBoundsNodeElement(sharedElementState=" + this.b + ")";
    }
}
