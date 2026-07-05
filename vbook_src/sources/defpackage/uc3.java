package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: uc3  reason: default package */
/* loaded from: classes.dex */
public final class uc3 extends cp3 {
    public static final ww3 L = new ww3("title", 9);
    public final String G;
    public final String H;
    public t6f I;
    public sc3 J;
    public tc3 K;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public uc3(java.lang.String r10, java.lang.String r11, defpackage.t6f r12) {
        /*
            r9 = this;
            r10.getClass()
            r12.getClass()
            wjb r0 = new wjb
            r1 = 0
            r2 = 4
            r3 = r1
            r4 = r3
        Lc:
            java.lang.String r5 = "#root"
            r6 = 1
            if (r3 > r2) goto L34
            if (r4 != 0) goto L15
            r7 = r3
            goto L16
        L15:
            r7 = r2
        L16:
            char r7 = r5.charAt(r7)
            r8 = 32
            int r7 = defpackage.c16.l(r7, r8)
            if (r7 > 0) goto L24
            r7 = r6
            goto L25
        L24:
            r7 = r1
        L25:
            if (r4 != 0) goto L2e
            if (r7 != 0) goto L2b
            r4 = r6
            goto Lc
        L2b:
            int r3 = r3 + 1
            goto Lc
        L2e:
            if (r7 != 0) goto L31
            goto L34
        L31:
            int r2 = r2 + (-1)
            goto Lc
        L34:
            int r2 = r2 + r6
            java.lang.CharSequence r1 = r5.subSequence(r3, r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = defpackage.tte.r(r1)
            r0.<init>(r5, r1, r10)
            r1 = 0
            r9.<init>(r0, r11, r1)
            r9.G = r10
            r9.H = r11
            r9.I = r12
            sc3 r10 = new sc3
            r10.<init>()
            r9.J = r10
            tc3 r10 = defpackage.tc3.a
            r9.K = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uc3.<init>(java.lang.String, java.lang.String, t6f):void");
    }

    public final cp3 a0() {
        cp3 P = P();
        while (true) {
            if (P != null) {
                if (P.r("html")) {
                    break;
                }
                P = P.s();
            } else {
                P = cp3.I(this, "html");
                break;
            }
        }
        for (cp3 P2 = P.P(); P2 != null; P2 = P2.s()) {
            if (P2.r("body") || P2.r("frameset")) {
                return P2;
            }
        }
        return cp3.I(P, "body");
    }

    @Override // defpackage.cp3, defpackage.y28
    /* renamed from: b0 */
    public final uc3 i() {
        j40 j40Var;
        uc3 uc3Var = (uc3) super.i();
        uc3Var.J = this.J.clone();
        j40 j40Var2 = this.D;
        if (j40Var2 != null) {
            j40Var = j40Var2.clone();
        } else {
            j40Var = null;
        }
        uc3Var.D = j40Var;
        return uc3Var;
    }

    @Override // defpackage.cp3
    /* renamed from: c0 */
    public final uc3 Y() {
        j40 j40Var;
        uc3 uc3Var = new uc3(this.e.c, f(), this.I);
        j40 j40Var2 = this.D;
        if (j40Var2 != null) {
            j40Var = j40Var2.clone();
        } else {
            j40Var = null;
        }
        uc3Var.D = j40Var;
        uc3Var.J = this.J.clone();
        return uc3Var;
    }

    public final String d0() {
        t6f t6fVar;
        cp3 P = P();
        while (true) {
            if (P != null) {
                if (P.r("html")) {
                    break;
                }
                P = P.s();
            } else {
                P = cp3.I(this, "html");
                break;
            }
        }
        cp3 P2 = P.P();
        while (true) {
            if (P2 != null) {
                if (P2.r("head")) {
                    break;
                }
                P2 = P2.s();
            } else {
                String str = P.e.c;
                str.getClass();
                uc3 z = P.z();
                if (z == null || (t6fVar = z.I) == null) {
                    t6fVar = new t6f(new ed5());
                }
                fkb n = t6fVar.n();
                qm8 qm8Var = (qm8) t6fVar.e;
                qm8Var.getClass();
                cp3 cp3Var = new cp3(n.c("head", qm8Var.a, null, str), P.f(), null);
                P.b(0, cp3Var);
                P2 = cp3Var;
            }
        }
        ww3 ww3Var = L;
        ww3Var.getClass();
        cp3 cp3Var2 = (cp3) g9a.c0(new ff4(g9a.b0(new n38(P2, cm9.a(cp3.class))), true, new uw3(ww3Var, P2, 1)));
        if (cp3Var2 != null) {
            String[] strArr = d4b.a;
            return k4b.N0(d4b.k(cp3Var2.Z())).toString();
        }
        return "";
    }

    @Override // defpackage.cp3, defpackage.y28
    public final y28 j() {
        uc3 uc3Var = new uc3(this.G, this.H);
        uc3Var.J = this.J;
        uc3Var.I = this.I;
        uc3Var.D = this.D;
        ap3 ap3Var = this.C;
        ap3Var.getClass();
        uc3Var.C = ap3Var;
        wjb wjbVar = this.e;
        wjbVar.getClass();
        uc3Var.e = wjbVar;
        uc3Var.N(f());
        return uc3Var;
    }

    @Override // defpackage.cp3, defpackage.y28
    public final String u() {
        return "#document";
    }

    @Override // defpackage.y28
    public final String x() {
        return R();
    }

    public uc3(String str) {
        this("http://www.w3.org/1999/xhtml", str);
    }

    public uc3(String str, String str2) {
        this(str, str2, new t6f(new ed5()));
    }
}
