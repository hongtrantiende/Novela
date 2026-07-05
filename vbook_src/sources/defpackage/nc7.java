package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nc7  reason: default package */
/* loaded from: classes.dex */
public final class nc7 {
    public static nc7 h;
    public final tc6 a;
    public final oyb b;
    public final u13 c;
    public final do4 d;
    public final oyb e;
    public float f = Float.NaN;
    public float g = Float.NaN;

    public nc7(tc6 tc6Var, oyb oybVar, u13 u13Var, do4 do4Var) {
        this.a = tc6Var;
        this.b = oybVar;
        this.c = u13Var;
        this.d = do4Var;
        this.e = uaf.z(oybVar, tc6Var);
    }

    public final long a(int i, long j) {
        float f = this.g;
        float f2 = this.f;
        int i2 = 0;
        int i3 = 1;
        if (Float.isNaN(f) || Float.isNaN(f2)) {
            String str = oc7.a;
            oyb oybVar = this.e;
            ks3 ks3Var = ks3.a;
            do4 do4Var = this.d;
            u13 u13Var = this.c;
            float b = new tj(new wj(str, oybVar, ks3Var, ks3Var, do4Var, u13Var), 1, 1, y02.b(0, 0, 0, 0, 15)).b();
            i3 = 1;
            float b2 = new tj(new wj(oc7.b, this.e, ks3Var, ks3Var, this.d, u13Var), 2, 1, y02.b(0, 0, 0, 0, 15)).b() - b;
            this.g = b;
            this.f = b2;
            f2 = b2;
            f = b;
        }
        if (i != i3) {
            int round = Math.round((f2 * (i - 1)) + f);
            if (round >= 0) {
                i2 = round;
            }
            int h2 = x02.h(j);
            if (i2 > h2) {
                i2 = h2;
            }
        } else {
            i2 = x02.j(j);
        }
        return y02.a(x02.k(j), x02.i(j), i2, x02.h(j));
    }
}
