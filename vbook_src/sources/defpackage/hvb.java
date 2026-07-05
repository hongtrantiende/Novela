package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hvb  reason: default package */
/* loaded from: classes.dex */
public final class hvb {
    public final msb a;
    public lu4 b;
    public final msb c;
    public final hm8 d;
    public final hm8 e;
    public final hm8 f;
    public final hm8 g;
    public final zu0 h;

    public hvb() {
        msb msbVar = new msb();
        this.a = msbVar;
        this.c = msbVar;
        r0f r0fVar = r0f.J;
        this.d = new hm8(null, r0fVar);
        this.e = new hm8(null, r0fVar);
        this.f = new hm8(null, r0fVar);
        this.g = yae.z(new rg3(nae.e));
        this.h = new zu0();
    }

    public final long a(long j) {
        rk9 rk9Var;
        sc6 e = e();
        rk9 rk9Var2 = rk9.e;
        if (e != null) {
            if (e.t()) {
                sc6 b = b();
                if (b != null) {
                    rk9Var = b.g0(e, true);
                } else {
                    rk9Var = null;
                }
            } else {
                rk9Var = rk9Var2;
            }
            if (rk9Var != null) {
                rk9Var2 = rk9Var;
            }
        }
        return pye.g(j, rk9Var2);
    }

    public final sc6 b() {
        return (sc6) this.f.getValue();
    }

    public final fvb c() {
        return (fvb) this.c.getValue();
    }

    public final int d(boolean z, long j) {
        fvb c = c();
        if (c == null) {
            return -1;
        }
        if (z) {
            j = a(j);
        }
        return c.b.g(pye.m(this, j));
    }

    public final sc6 e() {
        return (sc6) this.d.getValue();
    }

    public final boolean f(long j) {
        fvb c = c();
        if (c != null) {
            long m = pye.m(this, a(j));
            int e = c.b.e(Float.intBitsToFloat((int) (4294967295L & m)));
            int i = (int) (m >> 32);
            if (Float.intBitsToFloat(i) >= c.g(e) && Float.intBitsToFloat(i) <= c.h(e)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
