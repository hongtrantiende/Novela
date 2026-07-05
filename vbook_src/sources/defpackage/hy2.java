package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hy2  reason: default package */
/* loaded from: classes.dex */
public final class hy2 extends jy2 implements Comparable {
    public final boolean C;
    public final boolean D;
    public final int E;
    public final int F;
    public final int G;
    public final int H;
    public final int I;
    public final boolean J;
    public final int e;
    public final boolean f;

    public hy2(int i, ajc ajcVar, int i2, gy2 gy2Var, int i3, String str, String str2) {
        super(i, ajcVar, i2);
        boolean z;
        boolean z2;
        qs5 qs5Var;
        int i4;
        int i5;
        int bitCount;
        boolean z3;
        boolean z4;
        boolean z5;
        int i6 = 0;
        this.f = ei0.n(i3, false);
        int i7 = this.d.e;
        int i8 = gy2Var.u;
        qs5 qs5Var2 = gy2Var.r;
        int i9 = i7 & (~i8);
        if ((i9 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.C = z;
        if ((i9 & 2) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.D = z2;
        if (str2 != null) {
            qs5Var = qs5.r(str2);
        } else if (qs5Var2.isEmpty()) {
            qs5Var = qs5.r("");
        } else {
            qs5Var = qs5Var2;
        }
        int i10 = 0;
        while (true) {
            if (i10 < qs5Var.size()) {
                i4 = ly2.g(this.d, (String) qs5Var.get(i10), false);
                if (i4 > 0) {
                    break;
                }
                i10++;
            } else {
                i4 = 0;
                i10 = Integer.MAX_VALUE;
                break;
            }
        }
        this.E = i10;
        this.F = i4;
        if (str2 != null) {
            i5 = 1088;
        } else {
            i5 = 0;
        }
        int i11 = this.d.f;
        ef8 ef8Var = ly2.k;
        if (i11 != 0 && i11 == i5) {
            bitCount = Integer.MAX_VALUE;
        } else {
            bitCount = Integer.bitCount(i5 & i11);
        }
        this.G = bitCount;
        vq4 vq4Var = this.d;
        if ((1088 & vq4Var.f) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this.J = z3;
        int a = ly2.a(vq4Var, gy2Var.s);
        this.H = a;
        if (ly2.j(str) == null) {
            z4 = true;
        } else {
            z4 = false;
        }
        int g = ly2.g(this.d, str, z4);
        this.I = g;
        if (i4 <= 0 && ((!qs5Var2.isEmpty() || bitCount <= 0) && ((!qs5Var2.isEmpty() || a == Integer.MAX_VALUE) && !this.C && (!this.D || g <= 0)))) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (ei0.n(i3, gy2Var.C) && z5) {
            i6 = 1;
        }
        this.e = i6;
    }

    @Override // defpackage.jy2
    public final int a() {
        return this.e;
    }

    @Override // defpackage.jy2
    public final /* bridge */ /* synthetic */ boolean b(jy2 jy2Var) {
        hy2 hy2Var = (hy2) jy2Var;
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public final int compareTo(hy2 hy2Var) {
        ys1 c = ys1.a.c(this.f, hy2Var.f);
        Integer valueOf = Integer.valueOf(this.E);
        Integer valueOf2 = Integer.valueOf(hy2Var.E);
        az7 az7Var = az7.b;
        az7 az7Var2 = az7.c;
        ys1 b = c.b(valueOf, valueOf2, az7Var2);
        int i = hy2Var.F;
        int i2 = this.F;
        ys1 a = b.a(i2, i);
        int i3 = hy2Var.G;
        int i4 = this.G;
        ys1 c2 = a.a(i4, i3).b(Integer.valueOf(this.H), Integer.valueOf(hy2Var.H), az7Var2).c(this.C, hy2Var.C);
        Boolean valueOf3 = Boolean.valueOf(this.D);
        Boolean valueOf4 = Boolean.valueOf(hy2Var.D);
        if (i2 != 0) {
            az7Var = az7Var2;
        }
        ys1 a2 = c2.b(valueOf3, valueOf4, az7Var).a(this.I, hy2Var.I);
        if (i4 == 0) {
            a2 = a2.d(this.J, hy2Var.J);
        }
        return a2.e();
    }
}
