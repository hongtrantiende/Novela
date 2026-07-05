package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: n1b  reason: default package */
/* loaded from: classes3.dex */
public final class n1b extends jbe {
    public final ih1 C;
    public final r36 D;
    public final znd E;
    public final n1b[] F;
    public final wf2 G;
    public final a46 H;
    public boolean I;
    public String J;
    public String K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1b(ih1 ih1Var, r36 r36Var, znd zndVar, n1b[] n1bVarArr) {
        super(4);
        ih1Var.getClass();
        r36Var.getClass();
        this.C = ih1Var;
        this.D = r36Var;
        this.E = zndVar;
        this.F = n1bVarArr;
        this.G = r36Var.b;
        this.H = r36Var.a;
        int ordinal = zndVar.ordinal();
        if (n1bVarArr != null) {
            n1b n1bVar = n1bVarArr[ordinal];
            if (n1bVar != null || n1bVar != this) {
                n1bVarArr[ordinal] = this;
            }
        }
    }

    @Override // defpackage.jbe
    public final void A(long j) {
        if (this.I) {
            I(String.valueOf(j));
        } else {
            this.C.i(j);
        }
    }

    @Override // defpackage.jbe
    public final void D() {
        ih1 ih1Var = this.C;
        ih1Var.getClass();
        ((g06) ih1Var.c).j("null");
    }

    @Override // defpackage.jbe
    public final void E(o9a o9aVar, int i, s76 s76Var, Object obj) {
        o9aVar.getClass();
        s76Var.getClass();
        if (obj == null && !this.H.e) {
            return;
        }
        super.E(o9aVar, i, s76Var, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0039, code lost:
        if (defpackage.c16.i(r1, defpackage.a5b.i) == false) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x000f, code lost:
        if (r1 != defpackage.yh1.a) goto L40;
     */
    @Override // defpackage.jbe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(defpackage.s76 r5, java.lang.Object r6) {
        /*
            r4 = this;
            r5.getClass()
            r36 r0 = r4.D
            a46 r1 = r0.a
            boolean r2 = r5 instanceof defpackage.f3
            yh1 r1 = r1.l
            if (r2 == 0) goto L12
            yh1 r3 = defpackage.yh1.a
            if (r1 == r3) goto L44
            goto L3b
        L12:
            int r1 = r1.ordinal()
            if (r1 == 0) goto L44
            r3 = 1
            if (r1 == r3) goto L23
            r3 = 2
            if (r1 != r3) goto L1f
            goto L44
        L1f:
            defpackage.xk5.o()
            return
        L23:
            o9a r1 = r5.e()
            bze r1 = r1.e()
            a5b r3 = defpackage.a5b.f
            boolean r3 = defpackage.c16.i(r1, r3)
            if (r3 != 0) goto L3b
            a5b r3 = defpackage.a5b.i
            boolean r1 = defpackage.c16.i(r1, r3)
            if (r1 == 0) goto L44
        L3b:
            o9a r1 = r5.e()
            java.lang.String r1 = defpackage.tc4.o(r0, r1)
            goto L45
        L44:
            r1 = 0
        L45:
            if (r2 == 0) goto L5d
            r2 = r5
            f3 r2 = (defpackage.f3) r2
            if (r6 == 0) goto L51
            s76 r2 = defpackage.b16.O(r2, r4, r6)
            goto L5e
        L51:
            o9a r4 = r2.e()
            java.lang.String r5 = " should always be non-null. Please report issue to the kotlinx.serialization tracker."
            java.lang.String r6 = "Value for serializer "
            defpackage.hfd.h(r4, r5, r6)
            return
        L5d:
            r2 = r5
        L5e:
            if (r1 == 0) goto Leb
            o9a r3 = r2.e()
            r3.getClass()
            defpackage.z46.d(r0, r3)
            java.util.Set r3 = defpackage.q1d.e(r3)
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto Lb5
            o9a r4 = r5.e()
            java.lang.String r4 = r4.a()
            o9a r5 = r2.e()
            java.lang.String r5 = r5.a()
            a46 r6 = r0.a
            yh1 r6 = r6.l
            yh1 r0 = defpackage.yh1.b
            if (r6 != r0) goto L95
            boolean r6 = defpackage.c16.i(r4, r5)
            if (r6 == 0) goto L95
            java.lang.String r4 = "in ALL_JSON_OBJECTS class discriminator mode"
            goto L9d
        L95:
            java.lang.String r6 = "as base class '"
            r0 = 39
            java.lang.String r4 = defpackage.eub.n(r0, r6, r4)
        L9d:
            java.lang.String r6 = "' cannot be serialized "
            java.lang.String r0 = " because it has property name that conflicts with JSON class discriminator '"
            java.lang.String r2 = "Class '"
            java.lang.StringBuilder r4 = defpackage.nk2.y(r2, r5, r6, r4, r0)
            java.lang.String r5 = "'."
            java.lang.String r4 = defpackage.s21.q(r4, r1, r5)
            p46 r5 = new p46
            java.lang.String r6 = "You can either change class discriminator in JsonConfiguration, or rename property with @SerialName annotation."
            r5.<init>(r4, r6)
            throw r5
        Lb5:
            o9a r5 = r2.e()
            bze r5 = r5.e()
            r5.getClass()
            boolean r0 = r5 instanceof defpackage.t9a
            if (r0 != 0) goto Le5
            boolean r0 = r5 instanceof defpackage.w59
            if (r0 != 0) goto Ldf
            boolean r5 = r5 instanceof defpackage.l19
            if (r5 != 0) goto Ld9
            o9a r5 = r2.e()
            java.lang.String r5 = r5.a()
            r4.J = r1
            r4.K = r5
            goto Leb
        Ld9:
            java.lang.String r4 = "Actual serializer for polymorphic cannot be polymorphic itself"
            defpackage.vs.k(r4)
            return
        Ldf:
            java.lang.String r4 = "Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead"
            defpackage.vs.k(r4)
            return
        Le5:
            java.lang.String r4 = "Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead"
            defpackage.vs.k(r4)
            return
        Leb:
            r2.a(r4, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.n1b.G(s76, java.lang.Object):void");
    }

    @Override // defpackage.jbe
    public final void H(short s) {
        if (this.I) {
            I(String.valueOf((int) s));
        } else {
            this.C.j(s);
        }
    }

    @Override // defpackage.jbe
    public final void I(String str) {
        str.getClass();
        this.C.k(str);
    }

    @Override // defpackage.jbe
    public final void K(o9a o9aVar) {
        o9aVar.getClass();
        ih1 ih1Var = this.C;
        ih1Var.getClass();
        ih1Var.b = false;
        ih1Var.g(this.E.b);
    }

    @Override // defpackage.jbe
    public final wf2 T() {
        return this.G;
    }

    @Override // defpackage.jbe
    public final boolean V(o9a o9aVar) {
        o9aVar.getClass();
        return this.H.a;
    }

    @Override // defpackage.jbe
    public final jbe k(o9a o9aVar) {
        n1b n1bVar;
        o9aVar.getClass();
        r36 r36Var = this.D;
        znd y = hxe.y(r36Var, o9aVar);
        char c = y.a;
        ih1 ih1Var = this.C;
        ih1Var.g(c);
        ih1Var.b = true;
        String str = this.J;
        if (str != null) {
            String str2 = this.K;
            if (str2 == null) {
                str2 = o9aVar.a();
            }
            ih1Var.d();
            ih1Var.k(str);
            ih1Var.g(':');
            I(str2);
            this.J = null;
            this.K = null;
        }
        if (this.E == y) {
            return this;
        }
        n1b[] n1bVarArr = this.F;
        if (n1bVarArr != null && (n1bVar = n1bVarArr[y.ordinal()]) != null) {
            return n1bVar;
        }
        return new n1b(ih1Var, r36Var, y, n1bVarArr);
    }

    @Override // defpackage.jbe
    public final void n(boolean z) {
        if (this.I) {
            I(String.valueOf(z));
        } else {
            ((g06) this.C.c).j(String.valueOf(z));
        }
    }

    @Override // defpackage.jbe
    public final void p(byte b) {
        if (this.I) {
            I(String.valueOf((int) b));
        } else {
            this.C.e(b);
        }
    }

    @Override // defpackage.jbe
    public final void q(char c) {
        I(String.valueOf(c));
    }

    @Override // defpackage.jbe
    public final void r(double d) {
        if (this.I) {
            I(String.valueOf(d));
        } else {
            ((g06) this.C.c).j(String.valueOf(d));
        }
        if (!this.H.i && Math.abs(d) > Double.MAX_VALUE) {
            throw new p46(am8.D(Double.valueOf(d), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    @Override // defpackage.jbe
    public final void s(o9a o9aVar, int i) {
        o9aVar.getClass();
        int ordinal = this.E.ordinal();
        ih1 ih1Var = this.C;
        boolean z = true;
        if (ordinal != 1) {
            if (ordinal != 2) {
                if (ordinal != 3) {
                    if (!ih1Var.b) {
                        ih1Var.g(',');
                    }
                    ih1Var.d();
                    r36 r36Var = this.D;
                    r36Var.getClass();
                    z46.d(r36Var, o9aVar);
                    I(o9aVar.g(i));
                    ih1Var.g(':');
                    ih1Var.l();
                    return;
                }
                if (i == 0) {
                    this.I = true;
                }
                if (i == 1) {
                    ih1Var.g(',');
                    ih1Var.l();
                    this.I = false;
                    return;
                }
                return;
            } else if (!ih1Var.b) {
                if (i % 2 == 0) {
                    ih1Var.g(',');
                    ih1Var.d();
                } else {
                    ih1Var.g(':');
                    ih1Var.l();
                    z = false;
                }
                this.I = z;
                return;
            } else {
                this.I = true;
                ih1Var.d();
                return;
            }
        }
        if (!ih1Var.b) {
            ih1Var.g(',');
        }
        ih1Var.d();
    }

    @Override // defpackage.jbe
    public final void t(o9a o9aVar, int i) {
        o9aVar.getClass();
        I(o9aVar.g(i));
    }

    @Override // defpackage.jbe
    public final void u(float f) {
        if (this.I) {
            I(String.valueOf(f));
        } else {
            ((g06) this.C.c).j(String.valueOf(f));
        }
        if (!this.H.i && Math.abs(f) > Float.MAX_VALUE) {
            throw new p46(am8.D(Float.valueOf(f), null), "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'");
        }
    }

    @Override // defpackage.jbe
    public final jbe w(o9a o9aVar) {
        o9aVar.getClass();
        boolean a = o1b.a(o9aVar);
        znd zndVar = this.E;
        r36 r36Var = this.D;
        ih1 ih1Var = this.C;
        if (a) {
            if (!(ih1Var instanceof dx1)) {
                ih1Var = new dx1((g06) ih1Var.c, this.I);
            }
            return new n1b(ih1Var, r36Var, zndVar, null);
        } else if (o9aVar.isInline() && o9aVar.equals(l46.a)) {
            if (!(ih1Var instanceof cx1)) {
                ih1Var = new cx1((g06) ih1Var.c, this.I);
            }
            return new n1b(ih1Var, r36Var, zndVar, null);
        } else {
            if (this.J != null) {
                this.K = o9aVar.a();
            }
            return this;
        }
    }

    @Override // defpackage.jbe
    public final void y(int i) {
        if (this.I) {
            I(String.valueOf(i));
        } else {
            this.C.h(i);
        }
    }
}
