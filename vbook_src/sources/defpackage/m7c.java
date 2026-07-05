package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m7c  reason: default package */
/* loaded from: classes.dex */
public final class m7c extends uq7 {
    public final gz5 b;
    public final boolean c;
    public final lf4 d;

    public m7c(gz5 gz5Var, boolean z, lf4 lf4Var) {
        this.b = gz5Var;
        this.c = z;
        this.d = lf4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, o7c] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = this.c;
        mq7Var.M = this.d;
        mq7Var.Q = Float.NaN;
        mq7Var.R = Float.NaN;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        c00 c00Var = nx5Var.b;
        c00Var.b(this.b, "interactionSource");
        c00Var.b(Boolean.valueOf(this.c), "checked");
        c00Var.b(this.d, "animationSpec");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        o7c o7cVar = (o7c) mq7Var;
        o7cVar.K = this.b;
        boolean z = o7cVar.L;
        boolean z2 = this.c;
        if (z != z2) {
            ube.y(o7cVar);
        }
        o7cVar.L = z2;
        o7cVar.M = this.d;
        if (o7cVar.P == null && !Float.isNaN(o7cVar.R)) {
            o7cVar.P = tc4.a(o7cVar.R, 0.01f);
        }
        if (o7cVar.O == null && !Float.isNaN(o7cVar.Q)) {
            o7cVar.O = tc4.a(o7cVar.Q, 0.01f);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m7c)) {
            return false;
        }
        m7c m7cVar = (m7c) obj;
        if (c16.i(this.b, m7cVar.b) && this.c == m7cVar.c && c16.i(this.d, m7cVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() + eub.k(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return "ThumbElement(interactionSource=" + this.b + ", checked=" + this.c + ", animationSpec=" + this.d + ")";
    }
}
