package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d35  reason: default package */
/* loaded from: classes.dex */
public final class d35 implements fp3 {
    public final q5a a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public fjc j;
    public c35 k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final n04 d = new n04(7);
    public final n04 e = new n04(8);
    public final n04 f = new n04(6);
    public long m = -9223372036854775807L;
    public final km8 o = new km8();

    public d35(q5a q5aVar, boolean z, boolean z2) {
        this.a = q5aVar;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x01b4, code lost:
        if (r3.j == r4.j) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x01be, code lost:
        if (r9 != 0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x01d0, code lost:
        if (r3.n == r4.n) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x01e1, code lost:
        if (r3.p == r4.p) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01ef, code lost:
        if (r3.l == r4.l) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x024a, code lost:
        if (r3 == 1) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:77:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r23, int r24, long r25, long r27) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d35.a(int, int, long, long):void");
    }

    @Override // defpackage.fp3
    public final void b(km8 km8Var) {
        int i;
        int i2;
        this.j.getClass();
        String str = a2d.a;
        int i3 = km8Var.b;
        int i4 = km8Var.c;
        byte[] bArr = km8Var.a;
        this.g += km8Var.a();
        this.j.e(km8Var.a(), km8Var);
        while (true) {
            int k = dae.k(bArr, i3, i4, this.h);
            if (k == i4) {
                g(bArr, i3, i4);
                return;
            }
            int i5 = bArr[k + 3] & 31;
            if (k > 0 && bArr[k - 1] == 0) {
                k--;
                i = 4;
            } else {
                i = 3;
            }
            int i6 = k;
            int i7 = i;
            int i8 = i6 - i3;
            if (i8 > 0) {
                g(bArr, i3, i6);
            }
            int i9 = i4 - i6;
            long j = this.g - i9;
            if (i8 < 0) {
                i2 = -i8;
            } else {
                i2 = 0;
            }
            a(i9, i2, j, this.m);
            h(j, this.m, i5);
            i3 = i6 + i7;
        }
    }

    @Override // defpackage.fp3
    public final void c() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        dae.g(this.h);
        this.d.f();
        this.e.f();
        this.f.f();
        this.a.d.c(0);
        c35 c35Var = this.k;
        if (c35Var != null) {
            c35Var.k = false;
            c35Var.o = false;
            b35 b35Var = c35Var.n;
            b35Var.b = false;
            b35Var.a = false;
        }
    }

    @Override // defpackage.fp3
    public final void d(boolean z) {
        this.j.getClass();
        String str = a2d.a;
        if (z) {
            this.a.d.c(0);
            a(0, 0, this.g, this.m);
            h(this.g, this.m, 9);
            a(0, 0, this.g, this.m);
        }
    }

    @Override // defpackage.fp3
    public final void e(int i, long j) {
        boolean z;
        this.m = j;
        boolean z2 = this.n;
        if ((i & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.n = z | z2;
    }

    @Override // defpackage.fp3
    public final void f(t94 t94Var, zc7 zc7Var) {
        zc7Var.a();
        zc7Var.b();
        this.i = (String) zc7Var.e;
        zc7Var.b();
        fjc s = t94Var.s(zc7Var.c, 2);
        this.j = s;
        this.k = new c35(s, this.b, this.c);
        this.a.b(t94Var, zc7Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(byte[] r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d35.g(byte[], int, int):void");
    }

    public final void h(long j, long j2, int i) {
        if (!this.l || this.k.c) {
            this.d.g(i);
            this.e.g(i);
        }
        this.f.g(i);
        c35 c35Var = this.k;
        boolean z = this.n;
        c35Var.i = i;
        c35Var.l = j2;
        c35Var.j = j;
        c35Var.s = z;
        if (!c35Var.b || i != 1) {
            if (c35Var.c) {
                if (i != 5 && i != 1 && i != 2) {
                    return;
                }
            } else {
                return;
            }
        }
        b35 b35Var = c35Var.m;
        c35Var.m = c35Var.n;
        c35Var.n = b35Var;
        b35Var.b = false;
        b35Var.a = false;
        c35Var.h = 0;
        c35Var.k = true;
    }
}
