package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: q5b  reason: default package */
/* loaded from: classes.dex */
public final class q5b extends uq7 {
    public final ew7 b;
    public final n5b c;

    public q5b(ew7 ew7Var, n5b n5bVar) {
        this.b = ew7Var;
        this.c = n5bVar;
    }

    @Override // defpackage.uq7
    public final mq7 b() {
        return new w5b(this.b, this.c);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.c, "style");
        c00Var.b(this.b, "styleState");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        w5b w5bVar = (w5b) mq7Var;
        w5bVar.N = this.c;
        w5bVar.N1(false);
        ew7 ew7Var = this.b;
        if (ew7Var == null) {
            ew7Var = new ew7(null);
        }
        if (!c16.i(w5bVar.U, ew7Var)) {
            w5bVar.U = ew7Var;
            w5bVar.N1(false);
            t5b t5bVar = w5bVar.M;
            if (t5bVar != null) {
                ube.x(t5bVar);
            } else {
                vs.k("StyleOuterNode with no corresponding StyleInnerNode");
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof q5b) {
                q5b q5bVar = (q5b) obj;
                if (!c16.i(q5bVar.c, this.c) || !c16.i(q5bVar.b, this.b)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return "StyleElement(styleState=" + this.b + ", style=" + this.c + ")";
    }
}
