package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zqa  reason: default package */
/* loaded from: classes.dex */
public abstract class zqa {
    public cra a;
    public long b;
    public boolean c;
    public int d;

    public zqa(long j, cra craVar) {
        int i;
        int numberOfTrailingZeros;
        this.a = craVar;
        this.b = j;
        eja ejaVar = dra.a;
        if (j != 0) {
            cra d = d();
            long j2 = d.c;
            long[] jArr = d.d;
            if (jArr != null) {
                j = jArr[0];
            } else {
                long j3 = d.b;
                if (j3 != 0) {
                    numberOfTrailingZeros = Long.numberOfTrailingZeros(j3);
                } else {
                    long j4 = d.a;
                    if (j4 != 0) {
                        j2 += 64;
                        numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
                    }
                }
                j = numberOfTrailingZeros + j2;
            }
            synchronized (dra.c) {
                i = dra.f.a(j);
            }
        } else {
            i = -1;
        }
        this.d = i;
    }

    public static void q(zqa zqaVar) {
        dra.b.n(zqaVar);
    }

    public final void a() {
        synchronized (dra.c) {
            b();
            p();
        }
    }

    public void b() {
        dra.d = dra.d.b(g());
    }

    public abstract void c();

    public cra d() {
        return this.a;
    }

    public abstract xt4 e();

    public abstract boolean f();

    public long g() {
        return this.b;
    }

    public int h() {
        return 0;
    }

    public abstract xt4 i();

    public final zqa j() {
        yx9 yx9Var = dra.b;
        zqa zqaVar = (zqa) yx9Var.get();
        yx9Var.n(this);
        return zqaVar;
    }

    public abstract void k();

    public abstract void l();

    public abstract void m();

    public abstract void n(iza izaVar);

    public final void o() {
        int i = this.d;
        if (i >= 0) {
            dra.u(i);
            this.d = -1;
        }
    }

    public void p() {
        o();
    }

    public void r(cra craVar) {
        this.a = craVar;
    }

    public void s(long j) {
        this.b = j;
    }

    public void t(int i) {
        throw new IllegalStateException("Updating write count is not supported for this snapshot");
    }

    public abstract zqa u(xt4 xt4Var);
}
