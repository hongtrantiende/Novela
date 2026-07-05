package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g37  reason: default package */
/* loaded from: classes.dex */
public final class g37 {
    public final qd2 a;
    public final float b;
    public float c;
    public float d;
    public final /* synthetic */ h37 e;

    public g37(h37 h37Var, qd2 qd2Var, float f, float f2) {
        qd2Var.getClass();
        this.e = h37Var;
        this.a = qd2Var;
        if (f2 >= f) {
            h37Var.a.getClass();
            this.b = Float.intBitsToFloat((int) (r0f.u(qd2Var, Float.POSITIVE_INFINITY) & 4294967295L));
            this.c = f;
            this.d = f2;
            return;
        }
        vs.m("endOutlineProgress is expected to be equal or greater than startOutlineProgress");
        throw null;
    }

    public final yk8 a(float f) {
        float m = dce.m(f, this.c, this.d);
        float f2 = this.d;
        float f3 = this.c;
        float f4 = (m - f3) / (f2 - f3);
        h37 h37Var = this.e;
        h37Var.a.getClass();
        qd2 qd2Var = this.a;
        qd2Var.getClass();
        float intBitsToFloat = Float.intBitsToFloat((int) (r0f.u(qd2Var, f4 * this.b) >> 32));
        if (nae.e <= intBitsToFloat && intBitsToFloat <= 1.0f) {
            yk8 d = qd2Var.d(intBitsToFloat);
            return new yk8(new g37(h37Var, (qd2) d.a, this.c, m), new g37(h37Var, (qd2) d.b, m, this.d));
        }
        vs.m("Cubic cut point is expected to be between 0 and 1");
        return null;
    }

    public final String toString() {
        return "MeasuredCubic(outlineProgress=[" + this.c + " .. " + this.d + "], size=" + this.b + ", cubic=" + this.a + ')';
    }
}
