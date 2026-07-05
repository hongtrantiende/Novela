package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nna  reason: default package */
/* loaded from: classes.dex */
public final class nna extends uq7 {
    public final vt3 C;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;

    public /* synthetic */ nna(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [mq7, tna] */
    @Override // defpackage.uq7
    public final mq7 b() {
        ?? mq7Var = new mq7();
        mq7Var.K = this.b;
        mq7Var.L = this.c;
        mq7Var.M = this.d;
        mq7Var.N = this.e;
        mq7Var.O = this.f;
        return mq7Var;
    }

    @Override // defpackage.uq7
    public final void c(nx5 nx5Var) {
        this.C.getClass();
    }

    @Override // defpackage.uq7
    public final void d(mq7 mq7Var) {
        tna tnaVar = (tna) mq7Var;
        tnaVar.K = this.b;
        tnaVar.L = this.c;
        tnaVar.M = this.d;
        tnaVar.N = this.e;
        tnaVar.O = this.f;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof nna) {
                nna nnaVar = (nna) obj;
                if (!rg3.b(this.b, nnaVar.b) || !rg3.b(this.c, nnaVar.c) || !rg3.b(this.d, nnaVar.d) || !rg3.b(this.e, nnaVar.e) || this.f != nnaVar.f) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + nk2.d(this.e, nk2.d(this.d, nk2.d(this.c, Float.hashCode(this.b) * 31, 31), 31), 31);
    }

    public nna(float f, float f2, float f3, float f4, boolean z) {
        vt3 vt3Var = vt3.F;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
        this.C = vt3Var;
    }
}
