package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vrd  reason: default package */
/* loaded from: classes.dex */
public final class vrd extends aab implements lu4 {
    public boolean C;
    public int D;
    public final /* synthetic */ yrd E;
    public final /* synthetic */ float F;
    public final /* synthetic */ long G;
    public final /* synthetic */ boolean H;
    public long a;
    public long b;
    public akc c;
    public akc d;
    public y22 e;
    public ok0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vrd(yrd yrdVar, float f, long j, boolean z, m42 m42Var) {
        super(2, m42Var);
        this.E = yrdVar;
        this.F = f;
        this.G = j;
        this.H = z;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new vrd(this.E, this.F, this.G, this.H, m42Var);
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        return ((vrd) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        long j;
        long j2;
        akc akcVar;
        akc akcVar2;
        y22 y22Var;
        ok0 ok0Var;
        boolean z;
        int i = this.D;
        final yrd yrdVar = this.E;
        n82 n82Var = n82.a;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    hre.r(obj);
                    return Boolean.TRUE;
                }
                vs.k("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            z = this.C;
            j2 = this.b;
            j = this.a;
            ok0Var = this.f;
            y22Var = this.e;
            akcVar2 = this.d;
            akcVar = this.c;
            hre.r(obj);
        } else {
            hre.r(obj);
            zr1.A();
            long j3 = yrdVar.d;
            az5 az5Var = new az5(j3);
            if (!eh.r(j3)) {
                az5Var = null;
            }
            if (az5Var != null) {
                j = az5Var.a;
                long j4 = yrdVar.e;
                az5 az5Var2 = new az5(j4);
                if (!eh.r(j4)) {
                    az5Var2 = null;
                }
                if (az5Var2 != null) {
                    j2 = az5Var2.a;
                    akcVar = yrdVar.q;
                    akcVar2 = yrdVar.r;
                    y22Var = yrdVar.g;
                    ok0Var = yrdVar.h;
                    z = yrdVar.i;
                    this.c = akcVar;
                    this.d = akcVar2;
                    this.e = y22Var;
                    this.f = ok0Var;
                    this.a = j;
                    this.b = j2;
                    this.C = z;
                    this.D = 1;
                    if (yrdVar.g("scale", this) == n82Var) {
                        return n82Var;
                    }
                } else {
                    return Boolean.FALSE;
                }
            } else {
                return Boolean.FALSE;
            }
        }
        boolean z2 = z;
        long j5 = j2;
        long j6 = j;
        ok0 ok0Var2 = ok0Var;
        y22 y22Var2 = y22Var;
        final akc akcVar3 = akcVar2;
        final float b = this.F / lz9.b(akcVar.a);
        final float d = yrdVar.d(b, false);
        final float b2 = lz9.b(akcVar3.a);
        final long j7 = akcVar3.b;
        final long k = vye.k(j6, j5, y22Var2, ok0Var2, z2, 0, b2, j7, this.G);
        final long i2 = vye.i(b2, j7, d, k, z78.b);
        final long c = yrdVar.c(d, i2);
        final akc a = akc.a(akcVar3, mz9.a(d, d), c, 0L, 28);
        qw6 qw6Var = yrdVar.a;
        final float f = this.F;
        final long j8 = this.G;
        final boolean z3 = this.H;
        vt4 vt4Var = new vt4(b, b2, d, i2, j7, c, yrdVar, f, j8, z3, k, akcVar3, a) { // from class: urd
            public final /* synthetic */ float C;
            public final /* synthetic */ long D;
            public final /* synthetic */ boolean E;
            public final /* synthetic */ long F;
            public final /* synthetic */ akc G;
            public final /* synthetic */ akc H;
            public final /* synthetic */ float a;
            public final /* synthetic */ float b;
            public final /* synthetic */ float c;
            public final /* synthetic */ long d;
            public final /* synthetic */ long e;
            public final /* synthetic */ long f;

            {
                this.C = f;
                this.D = j8;
                this.E = z3;
                this.F = k;
                this.G = akcVar3;
                this.H = a;
            }

            @Override // defpackage.vt4
            public final Object invoke() {
                float f2 = this.a;
                float f3 = this.b;
                float f4 = f2 - f3;
                float f5 = this.c - f3;
                long j9 = this.d;
                long j10 = this.e;
                long d2 = z78.d(j9, j10);
                long d3 = z78.d(this.f, j10);
                return "ZoomableState. scale. targetScale=" + yz1.k(4, this.C) + ", centroidContentPoint=" + mue.t(this.D) + ", animated=" + this.E + ". touchPoint=" + mue.t(this.F) + ", targetUserScale=" + yz1.k(4, f2) + ", addUserScale=" + yz1.k(4, f4) + " -> " + yz1.k(4, f5) + ", addUserOffset=" + mue.t(d2) + " -> " + mue.t(d3) + ", userTransform=" + v9e.P(this.G) + " -> " + v9e.P(this.H);
            }
        };
        qw6Var.getClass();
        qw6Var.b(mw6.b, vt4Var);
        if (this.H) {
            Integer num = new Integer(1);
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.D = 2;
            if (yrd.a(yrdVar, a, num, "scale", this) == n82Var) {
                return n82Var;
            }
        } else {
            yrdVar.j(a);
        }
        return Boolean.TRUE;
    }
}
