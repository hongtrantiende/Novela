package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: iu0  reason: default package */
/* loaded from: classes.dex */
public final class iu0 {
    public final int a;
    public int b;
    public int c;
    public long d;
    public final boolean e;
    public final km8 f;
    public final km8 g;
    public int h;
    public int i;

    public iu0(km8 km8Var, km8 km8Var2, boolean z) {
        this.g = km8Var;
        this.f = km8Var2;
        this.e = z;
        km8Var2.M(12);
        this.a = km8Var2.D();
        km8Var.M(12);
        this.i = km8Var.D();
        hif.j("first_chunk must be 1", km8Var.m() == 1);
        this.b = -1;
    }

    public final boolean a() {
        long B;
        int i;
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == this.a) {
            return false;
        }
        boolean z = this.e;
        km8 km8Var = this.f;
        if (z) {
            B = km8Var.F();
        } else {
            B = km8Var.B();
        }
        this.d = B;
        if (this.b == this.h) {
            km8 km8Var2 = this.g;
            this.c = km8Var2.D();
            km8Var2.N(4);
            int i3 = this.i - 1;
            this.i = i3;
            if (i3 > 0) {
                i = km8Var2.D() - 1;
            } else {
                i = -1;
            }
            this.h = i;
        }
        return true;
    }
}
