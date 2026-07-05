package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: f00  reason: default package */
/* loaded from: classes.dex */
public final class f00 extends uq7 {
    public final float b;
    public final boolean c;

    public f00(float f, boolean z) {
        this.b = f;
        this.c = z;
        if (f > nae.e) {
            return;
        }
        jv5.a("aspectRatio " + f + " must be > 0");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, j00] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = this.c;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        j00 j00Var = (j00) mq7Var;
        j00Var.K = this.b;
        j00Var.L = this.c;
    }

    public final boolean equals(Object obj) {
        f00 f00Var;
        if (this != obj) {
            if (obj instanceof f00) {
                f00Var = (f00) obj;
            } else {
                f00Var = null;
            }
            if (f00Var != null && this.b == f00Var.b) {
                if (this.c == ((f00) obj).c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
    }
}
