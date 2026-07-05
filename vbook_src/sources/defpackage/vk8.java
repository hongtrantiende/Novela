package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vk8  reason: default package */
/* loaded from: classes.dex */
public abstract class vk8 {
    public ljc a;
    public boolean b;
    public em1 c;
    public float d = 1.0f;
    public tc6 e = tc6.a;

    public boolean d(float f) {
        return false;
    }

    public boolean e(em1 em1Var) {
        return false;
    }

    public final void g(ak3 ak3Var, long j, float f, em1 em1Var) {
        if (this.d != f) {
            if (!d(f)) {
                int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
                ljc ljcVar = this.a;
                if (i == 0) {
                    if (ljcVar != null) {
                        ljcVar.n(f);
                    }
                    this.b = false;
                } else {
                    if (ljcVar == null) {
                        ljcVar = lre.c();
                        this.a = ljcVar;
                    }
                    ljcVar.n(f);
                    this.b = true;
                }
            }
            this.d = f;
        }
        if (!c16.i(this.c, em1Var)) {
            if (!e(em1Var)) {
                ljc ljcVar2 = this.a;
                if (em1Var == null) {
                    if (ljcVar2 != null) {
                        ljcVar2.q(null);
                    }
                    this.b = false;
                } else {
                    if (ljcVar2 == null) {
                        ljcVar2 = lre.c();
                        this.a = ljcVar2;
                    }
                    ljcVar2.q(em1Var);
                    this.b = true;
                }
            }
            this.c = em1Var;
        }
        tc6 layoutDirection = ak3Var.getLayoutDirection();
        if (this.e != layoutDirection) {
            f(layoutDirection);
            this.e = layoutDirection;
        }
        int i2 = (int) (j >> 32);
        float intBitsToFloat = Float.intBitsToFloat((int) (ak3Var.b() >> 32)) - Float.intBitsToFloat(i2);
        int i3 = (int) (j & 4294967295L);
        float intBitsToFloat2 = Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L)) - Float.intBitsToFloat(i3);
        ((mu9) ak3Var.Q0().b).w(nae.e, nae.e, intBitsToFloat, intBitsToFloat2);
        if (f > nae.e) {
            try {
                if (Float.intBitsToFloat(i2) > nae.e && Float.intBitsToFloat(i3) > nae.e) {
                    if (this.b) {
                        float intBitsToFloat3 = Float.intBitsToFloat(i2);
                        rk9 n = npe.n(0L, (Float.floatToRawIntBits(Float.intBitsToFloat(i3)) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat3) << 32));
                        k61 w = ak3Var.Q0().w();
                        ljc ljcVar3 = this.a;
                        if (ljcVar3 == null) {
                            ljcVar3 = lre.c();
                            this.a = ljcVar3;
                        }
                        w.h(n, ljcVar3);
                        i(ak3Var);
                        w.q();
                    } else {
                        i(ak3Var);
                    }
                }
            } catch (Throwable th) {
                ((mu9) ak3Var.Q0().b).w(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
                throw th;
            }
        }
        ((mu9) ak3Var.Q0().b).w(-0.0f, -0.0f, -intBitsToFloat, -intBitsToFloat2);
    }

    public abstract long h();

    public abstract void i(ak3 ak3Var);

    public void f(tc6 tc6Var) {
    }
}
