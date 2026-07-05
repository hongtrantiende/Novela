package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: a4  reason: default package */
/* loaded from: classes.dex */
public final class a4 implements r94 {
    public final z3 a = new z3(null, 0, 1, "audio/ac4");
    public final km8 b = new km8(16384);
    public boolean c;

    @Override // defpackage.r94
    public final int b(s94 s94Var, fr2 fr2Var) {
        km8 km8Var = this.b;
        int read = s94Var.read(km8Var.a, 0, 16384);
        if (read == -1) {
            return -1;
        }
        km8Var.M(0);
        km8Var.L(read);
        boolean z = this.c;
        z3 z3Var = this.a;
        if (!z) {
            z3Var.o = 0L;
            this.c = true;
        }
        z3Var.b(km8Var);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0089, code lost:
        return false;
     */
    @Override // defpackage.r94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean c(defpackage.s94 r14) {
        /*
            r13 = this;
            km8 r13 = new km8
            r0 = 10
            r13.<init>(r0)
            r1 = 0
            r2 = r1
        L9:
            byte[] r3 = r13.a
            r4 = r14
            tt2 r4 = (defpackage.tt2) r4
            r4.f(r3, r1, r0, r1)
            r13.M(r1)
            int r3 = r13.C()
            r5 = 4801587(0x494433, float:6.728456E-39)
            r6 = 3
            if (r3 == r5) goto L90
            r4.f = r1
            r4.b(r2, r1)
            r14 = r1
            r0 = r2
        L25:
            byte[] r3 = r13.a
            r5 = 7
            r4.f(r3, r1, r5, r1)
            r13.M(r1)
            int r3 = r13.G()
            r7 = 44096(0xac40, float:6.1792E-41)
            r8 = 44097(0xac41, float:6.1793E-41)
            if (r3 == r7) goto L4c
            if (r3 == r8) goto L4c
            r4.f = r1
            int r0 = r0 + 1
            int r14 = r0 - r2
            r3 = 8192(0x2000, float:1.148E-41)
            if (r14 < r3) goto L47
            goto L89
        L47:
            r4.b(r0, r1)
            r14 = r1
            goto L25
        L4c:
            r7 = 1
            int r14 = r14 + r7
            r9 = 4
            if (r14 < r9) goto L52
            return r7
        L52:
            byte[] r7 = r13.a
            int r10 = r7.length
            r11 = -1
            if (r10 >= r5) goto L5a
            r10 = r11
            goto L87
        L5a:
            r10 = 2
            r10 = r7[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 8
            r12 = r7[r6]
            r12 = r12 & 255(0xff, float:3.57E-43)
            r10 = r10 | r12
            r12 = 65535(0xffff, float:9.1834E-41)
            if (r10 != r12) goto L81
            r9 = r7[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            int r9 = r9 << 16
            r10 = 5
            r10 = r7[r10]
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r10 = r10 << 8
            r9 = r9 | r10
            r10 = 6
            r7 = r7[r10]
            r7 = r7 & 255(0xff, float:3.57E-43)
            r10 = r9 | r7
            goto L82
        L81:
            r5 = r9
        L82:
            if (r3 != r8) goto L86
            int r5 = r5 + 2
        L86:
            int r10 = r10 + r5
        L87:
            if (r10 != r11) goto L8a
        L89:
            return r1
        L8a:
            int r10 = r10 + (-7)
            r4.b(r10, r1)
            goto L25
        L90:
            r13.N(r6)
            int r3 = r13.y()
            int r5 = r3 + 10
            int r2 = r2 + r5
            r4.b(r3, r1)
            goto L9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a4.c(s94):boolean");
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        this.c = false;
        this.a.c();
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        this.a.f(t94Var, new zc7(0, 1));
        t94Var.m();
        t94Var.v(new ge0(-9223372036854775807L));
    }

    @Override // defpackage.r94
    public final void a() {
    }
}
