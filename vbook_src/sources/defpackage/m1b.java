package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: m1b  reason: default package */
/* loaded from: classes3.dex */
public final class m1b extends hbe implements g46 {
    public final r36 e;
    public final znd f;
    public final z1 g;
    public final wf2 h;
    public int i;
    public lie j;
    public final a46 k;
    public final m46 l;

    public m1b(r36 r36Var, znd zndVar, z1 z1Var, o9a o9aVar, lie lieVar) {
        m46 m46Var;
        r36Var.getClass();
        o9aVar.getClass();
        this.e = r36Var;
        this.f = zndVar;
        this.g = z1Var;
        this.h = r36Var.b;
        this.i = -1;
        this.j = lieVar;
        a46 a46Var = r36Var.a;
        this.k = a46Var;
        if (a46Var.e) {
            m46Var = null;
        } else {
            m46Var = new m46(o9aVar);
        }
        this.l = m46Var;
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final byte A() {
        z1 z1Var = this.g;
        long j = z1Var.j();
        byte b = (byte) j;
        if (j == b) {
            return b;
        }
        z1.r(z1Var, "Failed to parse byte for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final short B() {
        z1 z1Var = this.g;
        long j = z1Var.j();
        short s = (short) j;
        if (j == s) {
            return s;
        }
        z1.r(z1Var, "Failed to parse short for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final float C() {
        z1 z1Var = this.g;
        String m = z1Var.m();
        try {
            float parseFloat = Float.parseFloat(m);
            if (!this.e.a.i && Math.abs(parseFloat) > Float.MAX_VALUE) {
                z1.r(z1Var, am8.D(Float.valueOf(parseFloat), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
                throw null;
            }
            return parseFloat;
        } catch (IllegalArgumentException unused) {
            z1.r(z1Var, eub.n('\'', "Failed to parse type 'float' for input '", m), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final double E() {
        z1 z1Var = this.g;
        String m = z1Var.m();
        try {
            double parseDouble = Double.parseDouble(m);
            if (!this.e.a.i && Math.abs(parseDouble) > Double.MAX_VALUE) {
                z1.r(z1Var, am8.D(Double.valueOf(parseDouble), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
                throw null;
            }
            return parseDouble;
        } catch (IllegalArgumentException unused) {
            z1.r(z1Var, eub.n('\'', "Failed to parse type 'double' for input '", m), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final boolean b() {
        boolean z;
        boolean z2;
        z1 z1Var = this.g;
        int z3 = z1Var.z();
        if (z3 != z1Var.t().length()) {
            if (z1Var.t().charAt(z3) == '\"') {
                z3++;
                z = true;
            } else {
                z = false;
            }
            int y = z1Var.y(z3);
            if (y < z1Var.t().length() && y != -1) {
                int i = y + 1;
                int charAt = z1Var.t().charAt(y) | ' ';
                if (charAt != 102) {
                    if (charAt == 116) {
                        z1Var.e(i, "rue");
                        z2 = true;
                    } else {
                        z1.r(z1Var, "Expected valid boolean literal prefix, but had '" + z1Var.m() + '\'', 0, null, 6);
                        throw null;
                    }
                } else {
                    z1Var.e(i, "alse");
                    z2 = false;
                }
                if (z) {
                    if (z1Var.b != z1Var.t().length()) {
                        if (z1Var.t().charAt(z1Var.b) == '\"') {
                            z1Var.b++;
                            return z2;
                        }
                        z1.r(z1Var, "Expected closing quotation mark", 0, null, 6);
                        throw null;
                    }
                    z1.r(z1Var, "EOF", 0, null, 6);
                    throw null;
                }
                return z2;
            }
            z1.r(z1Var, "EOF", 0, null, 6);
            throw null;
        }
        z1.r(z1Var, "EOF", 0, null, 6);
        throw null;
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final char c() {
        z1 z1Var = this.g;
        String m = z1Var.m();
        if (m.length() == 1) {
            return m.charAt(0);
        }
        z1.r(z1Var, eub.n('\'', "Expected single char, but got '", m), 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x013b  */
    @Override // defpackage.yq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.s76 r11) {
        /*
            Method dump skipped, instructions count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m1b.d(s76):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0171, code lost:
        r0 = r3.b;
        r1 = (int[]) r3.e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x017a, code lost:
        if (r1[r0] != (-2)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x017c, code lost:
        r1[r0] = r19;
        r3.b = r0 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0182, code lost:
        r0 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0186, code lost:
        if (r0 == r19) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0188, code lost:
        r3.b = r0 + r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x018b, code lost:
        r2.q(defpackage.eub.n('\'', "Encountered an unknown key '", r12), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.", defpackage.k4b.m0(r2.A(0, r2.b), r12, 6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x01a5, code lost:
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0130, code lost:
        r0 = r7.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0134, code lost:
        if (r8 >= 64) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0136, code lost:
        r0.a |= 1 << r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0140, code lost:
        r1 = (r8 >>> 6) - 1;
        r0 = (long[]) r0.d;
        r0[r1] = r0[r1] | (1 << (r8 & 63));
     */
    @Override // defpackage.fx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f(defpackage.o9a r23) {
        /*
            Method dump skipped, instructions count: 709
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m1b.f(o9a):int");
    }

    @Override // defpackage.g46
    public final k46 i() {
        return new s56(this.e.a, this.g).b();
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final int l() {
        z1 z1Var = this.g;
        long j = z1Var.j();
        int i = (int) j;
        if (j == i) {
            return i;
        }
        z1.r(z1Var, "Failed to parse int for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.hbe, defpackage.fx1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(defpackage.o9a r5) {
        /*
            r4 = this;
            r5.getClass()
            int r0 = r5.f()
            r1 = -1
            r36 r2 = r4.e
            if (r0 != 0) goto L18
            boolean r0 = defpackage.z46.c(r2, r5)
            if (r0 == 0) goto L18
        L12:
            int r0 = r4.f(r5)
            if (r0 != r1) goto L12
        L18:
            z1 r5 = r4.g
            boolean r0 = r5.B()
            if (r0 == 0) goto L2e
            a46 r0 = r2.a
            boolean r0 = r0.k
            if (r0 == 0) goto L27
            goto L2e
        L27:
            java.lang.String r4 = ""
            defpackage.am8.A(r5, r4)
            r4 = 0
            throw r4
        L2e:
            znd r4 = r4.f
            char r4 = r4.b
            r5.i(r4)
            java.lang.Object r4 = r5.e
            vdf r4 = (defpackage.vdf) r4
            int r5 = r4.b
            java.lang.Object r0 = r4.e
            int[] r0 = (int[]) r0
            r2 = r0[r5]
            r3 = -2
            if (r2 != r3) goto L49
            r0[r5] = r1
            int r5 = r5 + r1
            r4.b = r5
        L49:
            int r5 = r4.b
            if (r5 == r1) goto L50
            int r5 = r5 + r1
            r4.b = r5
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m1b.n(o9a):void");
    }

    @Override // defpackage.fx1
    public final wf2 o() {
        return this.h;
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final yq2 p(o9a o9aVar) {
        o9aVar.getClass();
        if (o1b.a(o9aVar)) {
            return new h46(this.g, this.e);
        }
        return this;
    }

    @Override // defpackage.hbe, defpackage.fx1
    public final Object q(o9a o9aVar, int i, s76 s76Var, Object obj) {
        boolean z;
        Object obj2;
        vdf vdfVar = (vdf) this.g.e;
        o9aVar.getClass();
        s76Var.getClass();
        if (this.f == znd.e && (i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = vdfVar.b;
            if (((int[]) vdfVar.e)[i2] == -2) {
                ((Object[]) vdfVar.d)[i2] = zj1.f;
            }
        }
        Object d = d(s76Var);
        if (z) {
            int i3 = vdfVar.b;
            if (((int[]) vdfVar.e)[i3] != -2) {
                int i4 = i3 + 1;
                vdfVar.b = i4;
                if (i4 == ((Object[]) vdfVar.d).length) {
                    vdfVar.h();
                }
            }
            Object[] objArr = (Object[]) vdfVar.d;
            int i5 = vdfVar.b;
            if (((a46) vdfVar.c).m) {
                obj2 = d;
            } else {
                obj2 = p40.C;
            }
            objArr[i5] = obj2;
            ((int[]) vdfVar.e)[i5] = -2;
        }
        return d;
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final String s() {
        boolean z = this.k.c;
        z1 z1Var = this.g;
        if (z) {
            return z1Var.n();
        }
        return z1Var.k();
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final fx1 t(o9a o9aVar) {
        o9aVar.getClass();
        r36 r36Var = this.e;
        znd y = hxe.y(r36Var, o9aVar);
        z1 z1Var = this.g;
        vdf vdfVar = (vdf) z1Var.e;
        vdfVar.getClass();
        int i = vdfVar.b + 1;
        vdfVar.b = i;
        if (i == ((Object[]) vdfVar.d).length) {
            vdfVar.h();
        }
        ((Object[]) vdfVar.d)[i] = o9aVar;
        z1Var.i(y.a);
        if (z1Var.w() != 4) {
            int ordinal = y.ordinal();
            if (ordinal != 1 && ordinal != 2 && ordinal != 3) {
                if (this.f == y && r36Var.a.e) {
                    return this;
                }
                return new m1b(this.e, y, z1Var, o9aVar, this.j);
            }
            return new m1b(this.e, y, z1Var, o9aVar, this.j);
        }
        z1.r(z1Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final int u(o9a o9aVar) {
        o9aVar.getClass();
        return z46.b(o9aVar, this.e, s(), " at path ".concat(((vdf) this.g.e).f()));
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final long v() {
        return this.g.j();
    }

    @Override // defpackage.hbe, defpackage.yq2
    public final boolean w() {
        boolean z;
        m46 m46Var = this.l;
        if (m46Var != null) {
            z = m46Var.b;
        } else {
            z = false;
        }
        if (z || this.g.D(true)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.g46
    public final r36 y() {
        return this.e;
    }
}
