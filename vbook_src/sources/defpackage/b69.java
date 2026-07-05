package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: b69  reason: default package */
/* loaded from: classes.dex */
public class b69 extends zg4 {
    public boolean e;

    public b69(y28 y28Var, bp3 bp3Var, sc3 sc3Var) {
        super(26, y28Var, bp3Var, sc3Var);
        while (y28Var != null) {
            if ((y28Var instanceof cp3) && ((cp3) y28Var).e.b(64)) {
                this.e = true;
                return;
            }
            y28Var = y28Var.a;
        }
    }

    public boolean n0(y28 y28Var) {
        if (y28Var != null && (y28Var instanceof cp3)) {
            cp3 cp3Var = (cp3) y28Var;
            if (!cp3Var.r("br")) {
                int i = cp3Var.e.d;
                if ((i & 4) != 0) {
                    return true;
                }
                if ((i & 1) == 0) {
                    if (!(cp3Var.a instanceof uc3)) {
                        cp3 P = cp3Var.P();
                        for (int i2 = 0; i2 < 5 && P != null; i2++) {
                            int i3 = P.e.d;
                            if ((i3 & 4) == 0 && (i3 & 1) != 0) {
                                P = P.s();
                            }
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean o0(y28 y28Var) {
        if (y28Var != null && y28Var != ((y28) this.b) && !this.e) {
            if (y28Var instanceof fwb) {
                String[] strArr = d4b.a;
                if (d4b.e(((fwb) y28Var).H())) {
                    return false;
                }
            }
            if (!n0(y28Var)) {
                y28 B = y28Var.B();
                while (B instanceof fwb) {
                    String[] strArr2 = d4b.a;
                    if (!d4b.e(((fwb) B).H())) {
                        break;
                    } else if (B != null) {
                        B = B.B();
                    } else {
                        B = null;
                    }
                }
                if (!n0(B)) {
                    cp3 cp3Var = y28Var.a;
                    if (n0(cp3Var)) {
                        cp3Var.getClass();
                        if (!cp3Var.e.b(8)) {
                            y28 m = cp3Var.m();
                            int i = 0;
                            while (true) {
                                if (i >= 5 || m == null) {
                                    break;
                                } else if (!(m instanceof fwb)) {
                                    if (B != null) {
                                        if ((B instanceof fwb) || (!n0(B) && (B instanceof cp3))) {
                                            break;
                                        }
                                        return true;
                                    }
                                    return true;
                                } else {
                                    m = ((fwb) m).t();
                                    i++;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.zg4
    public final void w(cp3 cp3Var, int i) {
        if (o0(cp3Var)) {
            a0(i);
        }
        cp3Var.y((bp3) this.c, (sc3) this.d);
        if (cp3Var.e.b(64)) {
            this.e = true;
        }
    }

    @Override // defpackage.zg4
    public final void x(al6 al6Var, int i) {
        if (o0(al6Var)) {
            a0(i);
        }
        al6Var.y((bp3) this.c, (sc3) this.d);
    }

    @Override // defpackage.zg4
    public final void y(cp3 cp3Var, int i) {
        y28 m = cp3Var.m();
        while (m instanceof fwb) {
            String[] strArr = d4b.a;
            if (!d4b.e(((fwb) m).H())) {
                break;
            }
            m = m.t();
        }
        if (o0(m)) {
            a0(i);
        }
        cp3Var.U((bp3) this.c, (sc3) this.d);
        if (this.e && cp3Var.e.b(64)) {
            cp3 cp3Var2 = cp3Var.a;
            if (cp3Var2 == null) {
                cp3Var2 = null;
            }
            while (cp3Var2 != null) {
                if ((cp3Var2.e.d & 64) != 0) {
                    return;
                }
                cp3Var2 = cp3Var2.a;
                if (cp3Var2 == null) {
                    cp3Var2 = null;
                }
            }
            this.e = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0071, code lost:
        if (defpackage.d4b.i(r7) != false) goto L40;
     */
    @Override // defpackage.zg4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void z(defpackage.fwb r6, int r7, int r8) {
        /*
            r5 = this;
            boolean r7 = r5.e
            r0 = 0
            if (r7 != 0) goto L9a
            cp3 r7 = r6.a
            boolean r7 = r5.n0(r7)
            r1 = 4
            if (r7 != 0) goto L11
        Le:
            r0 = r1
            goto L7d
        L11:
            y28 r7 = r6.B()
            y28 r2 = r6.t()
            boolean r3 = r7 instanceof defpackage.cp3
            if (r3 == 0) goto L23
            boolean r3 = r5.n0(r7)
            if (r3 == 0) goto L31
        L23:
            if (r7 == 0) goto L2f
            boolean r3 = r7 instanceof defpackage.fwb
            if (r3 != 0) goto L31
            boolean r7 = r5.o0(r7)
            if (r7 == 0) goto L31
        L2f:
            r1 = 12
        L31:
            if (r2 == 0) goto L73
            boolean r7 = r2 instanceof defpackage.fwb
            if (r7 != 0) goto L3e
            boolean r7 = r5.o0(r2)
            if (r7 == 0) goto L3e
            goto L73
        L3e:
            boolean r7 = r2 instanceof defpackage.fwb
            if (r7 == 0) goto L56
            r3 = r2
            fwb r3 = (defpackage.fwb) r3
            java.lang.String[] r4 = defpackage.d4b.a
            java.lang.String r3 = r3.H()
            boolean r3 = defpackage.d4b.e(r3)
            if (r3 == 0) goto L56
            y28 r2 = r2.t()
            goto L3e
        L56:
            if (r7 == 0) goto Le
            java.lang.String[] r7 = defpackage.d4b.a
            fwb r2 = (defpackage.fwb) r2
            java.lang.String r7 = r2.H()
            int r7 = defpackage.kqe.h(r7, r0)
            int r2 = r7 >>> 16
            r3 = 17
            if (r2 >= r3) goto L6b
            r0 = 1
        L6b:
            if (r0 == 0) goto L77
            boolean r7 = defpackage.d4b.i(r7)
            if (r7 == 0) goto Le
        L73:
            r7 = r1 | 16
            r0 = r7
            goto L7d
        L77:
            java.lang.String r5 = "Not a valid code point"
            defpackage.vs.m(r5)
            return
        L7d:
            java.lang.String[] r7 = defpackage.d4b.a
            java.lang.String r7 = r6.H()
            boolean r7 = defpackage.d4b.e(r7)
            if (r7 != 0) goto L9a
            cp3 r7 = r6.a
            boolean r7 = r5.n0(r7)
            if (r7 == 0) goto L9a
            boolean r7 = r5.o0(r6)
            if (r7 == 0) goto L9a
            r5.a0(r8)
        L9a:
            super.z(r6, r0, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b69.z(fwb, int, int):void");
    }
}
