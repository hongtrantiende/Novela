package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ksb  reason: default package */
/* loaded from: classes.dex */
public final class ksb {
    public static final tw8 g = new tw8(5);
    public final e37 a;
    public final tc6 b;
    public final do4 c;
    public final long d;
    public final float e;
    public final float f;

    public ksb(e37 e37Var, tc6 tc6Var, do4 do4Var, long j) {
        this.a = e37Var;
        this.b = tc6Var;
        this.c = do4Var;
        this.d = j;
        this.e = e37Var.f();
        this.f = e37Var.G0();
    }

    public final String toString() {
        String m = x02.m(this.d);
        return "MeasureInputs(density=" + this.a + ", densityValue=" + this.e + ", fontScale=" + this.f + ", layoutDirection=" + this.b + ", fontFamilyResolver=" + this.c + ", constraints=" + m + ")";
    }
}
