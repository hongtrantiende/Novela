package defpackage;

import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: frb  reason: default package */
/* loaded from: classes.dex */
public final class frb implements Appendable {
    public fxb C;
    public gw7 D;
    public yk8 E;
    public final grb a;
    public final bz5 b;
    public final tb1 c;
    public pyb d;
    public kw5 e;
    public long f;

    public frb(grb grbVar, kw5 kw5Var, grb grbVar2, bz5 bz5Var, int i) {
        pyb pybVar;
        kw5 kw5Var2;
        gw7 gw7Var = null;
        kw5Var = (i & 2) != 0 ? null : kw5Var;
        grbVar2 = (i & 4) != 0 ? grbVar : grbVar2;
        bz5Var = (i & 8) != 0 ? null : bz5Var;
        this.a = grbVar2;
        this.b = bz5Var;
        tb1 tb1Var = new tb1();
        tb1Var.d = grbVar;
        tb1Var.b = -1;
        tb1Var.c = -1;
        this.c = tb1Var;
        hub hubVar = grbVar.c;
        List list = grbVar.a;
        if (hubVar != null) {
            pybVar = new pyb(hubVar.a, 2);
        } else {
            pybVar = null;
        }
        this.d = pybVar;
        if (kw5Var != null) {
            kw5Var2 = new kw5(kw5Var);
        } else {
            kw5Var2 = null;
        }
        this.e = kw5Var2;
        this.f = grbVar.e;
        this.C = grbVar.f;
        if (list != null && !list.isEmpty()) {
            int size = list.size();
            os[] osVarArr = new os[size];
            for (int i2 = 0; i2 < size; i2++) {
                osVarArr[i2] = (os) list.get(i2);
            }
            gw7Var = new gw7(osVarArr, size);
        }
        this.D = gw7Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.grb h(defpackage.frb r10, long r11, defpackage.fxb r13, java.util.List r14, int r15) {
        /*
            r0 = r15 & 1
            if (r0 == 0) goto L6
            long r11 = r10.f
        L6:
            r2 = r11
            r11 = r15 & 2
            if (r11 == 0) goto Ld
            fxb r13 = r10.C
        Ld:
            r4 = r13
            gw7 r11 = r10.D
            r12 = 0
            if (r11 == 0) goto L22
            java.util.List r11 = r11.f()
            r13 = r11
            iv7 r13 = (defpackage.iv7) r13
            boolean r13 = r13.isEmpty()
            if (r13 != 0) goto L22
            r6 = r11
            goto L23
        L22:
            r6 = r12
        L23:
            r11 = r15 & 8
            if (r11 == 0) goto L29
            r7 = r12
            goto L2a
        L29:
            r7 = r14
        L2a:
            grb r0 = new grb
            tb1 r11 = r10.c
            java.lang.String r1 = r11.toString()
            hub r8 = defpackage.xxe.u(r10)
            r9 = 8
            r5 = 0
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frb.h(frb, long, fxb, java.util.List, int):grb");
    }

    public final kw5 a() {
        kw5 kw5Var = this.e;
        if (kw5Var == null) {
            kw5 kw5Var2 = new kw5((kw5) null);
            this.e = kw5Var2;
            return kw5Var2;
        }
        return kw5Var;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        if (charSequence != null) {
            tb1 tb1Var = this.c;
            b(tb1Var.length(), tb1Var.length(), charSequence.length());
            tb1Var.e(tb1Var.length(), tb1Var.length(), charSequence, 0, charSequence.length());
        }
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:262:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0442  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(int r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 1182
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.frb.b(int, int, int):void");
    }

    public final void c(int i, int i2, CharSequence charSequence) {
        int length = charSequence.length();
        if (i > i2) {
            ov5.a("Expected start=" + i + " <= end=" + i2);
        }
        if (length < 0) {
            ov5.a("Expected textStart=0 <= textEnd=" + length);
        }
        tb1 tb1Var = this.c;
        int n = dce.n(i, 0, tb1Var.length());
        int n2 = dce.n(i2, 0, tb1Var.length());
        int n3 = dce.n(0, 0, charSequence.length());
        int n4 = dce.n(length, 0, charSequence.length());
        b(n, n2, n4 - n3);
        tb1Var.e(n, n2, charSequence, n3, n4);
        f(null);
        this.E = null;
    }

    public final void d(long j) {
        long a = sze.a(0, this.c.length());
        if (!fxb.a(a, j)) {
            String i = fxb.i(j);
            String i2 = fxb.i(a);
            ov5.a("Expected " + i + " to be in " + i2);
        }
    }

    public final void e(int i, List list, int i2) {
        tb1 tb1Var = this.c;
        if (i >= 0 && i <= tb1Var.length()) {
            if (i2 >= 0 && i2 <= tb1Var.length()) {
                if (i < i2) {
                    f(new fxb(sze.a(i, i2)));
                    gw7 gw7Var = this.D;
                    if (gw7Var != null) {
                        gw7Var.g();
                    }
                    if (list != null && !list.isEmpty()) {
                        if (this.D == null) {
                            this.D = new gw7(new os[16], 0);
                        }
                        int size = list.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            os osVar = (os) list.get(i3);
                            gw7 gw7Var2 = this.D;
                            if (gw7Var2 != null) {
                                gw7Var2.b(os.a(osVar, null, osVar.b + i, osVar.c + i, 9));
                            }
                        }
                        return;
                    }
                    return;
                }
                vs.m(rs8.k("Do not set reversed or empty range: ", i, i2, " > "));
                return;
            }
            cy7.k(rs8.k("end (", i2, tb1Var.length(), ") offset is outside of text region "));
            return;
        }
        cy7.k(rs8.k("start (", i, tb1Var.length(), ") offset is outside of text region "));
    }

    public final void f(fxb fxbVar) {
        if (fxbVar != null && !fxb.d(fxbVar.a)) {
            this.C = fxbVar;
            return;
        }
        this.C = null;
        gw7 gw7Var = this.D;
        if (gw7Var != null) {
            gw7Var.g();
        }
    }

    public final void g(long j) {
        d(j);
        this.f = j;
        this.E = null;
    }

    public final String toString() {
        return this.c.toString();
    }

    @Override // java.lang.Appendable
    public final Appendable append(char c) {
        tb1 tb1Var = this.c;
        b(tb1Var.length(), tb1Var.length(), 1);
        tb1.f(tb1Var, tb1Var.length(), tb1Var.length(), String.valueOf(c));
        return this;
    }

    @Override // java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        if (charSequence != null) {
            tb1 tb1Var = this.c;
            b(tb1Var.length(), tb1Var.length(), i2 - i);
            tb1.f(tb1Var, tb1Var.length(), tb1Var.length(), charSequence.subSequence(i, i2));
        }
        return this;
    }
}
