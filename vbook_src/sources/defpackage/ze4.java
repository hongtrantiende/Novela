package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ze4  reason: default package */
/* loaded from: classes.dex */
public final class ze4 extends uq7 {
    public final j73 b;
    public final float c;

    public ze4(j73 j73Var, float f, String str) {
        this.b = j73Var;
        this.c = f;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, af4] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = this.c;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        nx5Var.b.b(Float.valueOf(this.c), "fraction");
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        af4 af4Var = (af4) mq7Var;
        af4Var.K = this.b;
        af4Var.L = this.c;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ze4) {
                ze4 ze4Var = (ze4) obj;
                if (this.b == ze4Var.b && this.c == ze4Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
