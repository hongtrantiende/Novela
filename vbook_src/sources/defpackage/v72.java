package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v72 */
/* loaded from: classes.dex */
public abstract class v72 implements wea, m06 {
    public final z72 a;
    public final z72 b;
    public final z72 c;
    public final z72 d;

    public v72(z72 z72Var, z72 z72Var2, z72 z72Var3, z72 z72Var4) {
        this.a = z72Var;
        this.b = z72Var2;
        this.c = z72Var3;
        this.d = z72Var4;
    }

    public static /* synthetic */ v72 d(v72 v72Var, z72 z72Var, z72 z72Var2, z72 z72Var3, z72 z72Var4, int i) {
        if ((i & 1) != 0) {
            z72Var = v72Var.a;
        }
        if ((i & 2) != 0) {
            z72Var2 = v72Var.b;
        }
        if ((i & 4) != 0) {
            z72Var3 = v72Var.c;
        }
        if ((i & 8) != 0) {
            z72Var4 = v72Var.d;
        }
        return v72Var.c(z72Var, z72Var2, z72Var3, z72Var4);
    }

    @Override // defpackage.wea
    public final kwe a(long j, tc6 tc6Var, r13 r13Var) {
        float a = this.a.a(j, r13Var);
        float a2 = this.b.a(j, r13Var);
        float a3 = this.c.a(j, r13Var);
        float a4 = this.d.a(j, r13Var);
        float c = dna.c(j);
        float f = a + a4;
        if (f > c) {
            float f2 = c / f;
            a *= f2;
            a4 *= f2;
        }
        float f3 = a2 + a3;
        if (f3 > c) {
            float f4 = c / f3;
            a2 *= f4;
            a3 *= f4;
        }
        if (a < nae.e || a2 < nae.e || a3 < nae.e || a4 < nae.e) {
            StringBuilder x = nk2.x("Corner size in Px can't be negative(topStart = ", a, ", topEnd = ", a2, ", bottomEnd = ");
            x.append(a3);
            x.append(", bottomStart = ");
            x.append(a4);
            x.append(")!");
            ov5.a(x.toString());
        }
        return e(j, a, a2, a3, a4, tc6Var);
    }

    public Object b(Object obj, float f) {
        return null;
    }

    public abstract v72 c(z72 z72Var, z72 z72Var2, z72 z72Var3, z72 z72Var4);

    public abstract kwe e(long j, float f, float f2, float f3, float f4, tc6 tc6Var);
}
