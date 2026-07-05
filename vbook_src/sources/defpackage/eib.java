package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: eib  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class eib implements lu4 {
    public final /* synthetic */ rq9 C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ rq9 E;
    public final /* synthetic */ rq9 F;
    public final /* synthetic */ float G;
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ rq9 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ rq9 f;

    public /* synthetic */ eib(String str, String str2, rq9 rq9Var, String str3, rq9 rq9Var2, rq9 rq9Var3, boolean z, rq9 rq9Var4, rq9 rq9Var5, float f, int i) {
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = rq9Var;
        this.e = str3;
        this.f = rq9Var2;
        this.C = rq9Var3;
        this.D = z;
        this.E = rq9Var4;
        this.F = rq9Var5;
        this.G = f;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        pvc pvcVar = pvc.a;
        vy4 vy4Var = vy4.a;
        boolean z = false;
        switch (i) {
            case 0:
                rv4 rv4Var = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                if ((intValue & 3) != 2) {
                    z = true;
                }
                if (rv4Var.U(intValue & 1, z)) {
                    xy4 r = s9e.r(vy4Var);
                    final String str = this.b;
                    final String str2 = this.c;
                    final rq9 rq9Var = this.d;
                    final String str3 = this.e;
                    final rq9 rq9Var2 = this.f;
                    final rq9 rq9Var3 = this.C;
                    final boolean z2 = this.D;
                    final rq9 rq9Var4 = this.E;
                    final rq9 rq9Var5 = this.F;
                    final float f = this.G;
                    kwe.b(r, 0, 1, jce.E(231397684, new mu4() { // from class: oib
                        @Override // defpackage.mu4
                        public final Object c(Object obj3, Object obj4, Object obj5) {
                            boolean z3;
                            boolean h;
                            int i2;
                            boolean z4;
                            int i3 = r11;
                            pvc pvcVar2 = pvc.a;
                            vy4 vy4Var2 = vy4.a;
                            switch (i3) {
                                case 0:
                                    yn1 yn1Var = (yn1) obj3;
                                    rv4 rv4Var2 = (rv4) obj4;
                                    int intValue2 = ((Integer) obj5).intValue();
                                    yn1Var.getClass();
                                    if ((intValue2 & 6) == 0) {
                                        if ((intValue2 & 8) == 0) {
                                            h = rv4Var2.f(yn1Var);
                                        } else {
                                            h = rv4Var2.h(yn1Var);
                                        }
                                        if (h) {
                                            i2 = 4;
                                        } else {
                                            i2 = 2;
                                        }
                                        intValue2 |= i2;
                                    }
                                    if ((intValue2 & 19) != 18) {
                                        z3 = true;
                                    } else {
                                        z3 = false;
                                    }
                                    if (rv4Var2.U(1 & intValue2, z3)) {
                                        xy4 s = s9e.s(vy4Var2);
                                        final String str4 = str;
                                        final String str5 = str2;
                                        final rq9 rq9Var6 = rq9Var;
                                        final String str6 = str3;
                                        jue.y(s, 0, 1, jce.E(1426413976, new mu4() { // from class: wib
                                            @Override // defpackage.mu4
                                            public final Object c(Object obj6, Object obj7, Object obj8) {
                                                boolean z5;
                                                boolean h2;
                                                boolean z6;
                                                boolean h3;
                                                int i4 = r5;
                                                pvc pvcVar3 = pvc.a;
                                                int i5 = 2;
                                                String str7 = str6;
                                                rq9 rq9Var7 = rq9Var6;
                                                String str8 = str5;
                                                String str9 = str4;
                                                switch (i4) {
                                                    case 0:
                                                        iv9 iv9Var = (iv9) obj6;
                                                        rv4 rv4Var3 = (rv4) obj7;
                                                        int intValue3 = ((Integer) obj8).intValue();
                                                        iv9Var.getClass();
                                                        if ((intValue3 & 6) == 0) {
                                                            if ((intValue3 & 8) == 0) {
                                                                h2 = rv4Var3.f(iv9Var);
                                                            } else {
                                                                h2 = rv4Var3.h(iv9Var);
                                                            }
                                                            if (h2) {
                                                                i5 = 4;
                                                            }
                                                            intValue3 |= i5;
                                                        }
                                                        if ((intValue3 & 19) != 18) {
                                                            z5 = true;
                                                        } else {
                                                            z5 = false;
                                                        }
                                                        if (rv4Var3.U(intValue3 & 1, z5)) {
                                                            iue.a(s9e.w(64.0f), str9, 18.0f, rv4Var3, 384);
                                                            ube.p(s9e.z(12.0f), rv4Var3, 0);
                                                            kwe.b(iv9.a(), 0, 0, jce.E(-373103602, new bib(str8, rq9Var7, str7, 3), rv4Var3), rv4Var3, 3072, 6);
                                                        } else {
                                                            rv4Var3.X();
                                                        }
                                                        return pvcVar3;
                                                    default:
                                                        iv9 iv9Var2 = (iv9) obj6;
                                                        rv4 rv4Var4 = (rv4) obj7;
                                                        int intValue4 = ((Integer) obj8).intValue();
                                                        iv9Var2.getClass();
                                                        if ((intValue4 & 6) == 0) {
                                                            if ((intValue4 & 8) == 0) {
                                                                h3 = rv4Var4.f(iv9Var2);
                                                            } else {
                                                                h3 = rv4Var4.h(iv9Var2);
                                                            }
                                                            if (h3) {
                                                                i5 = 4;
                                                            }
                                                            intValue4 |= i5;
                                                        }
                                                        if ((intValue4 & 19) != 18) {
                                                            z6 = true;
                                                        } else {
                                                            z6 = false;
                                                        }
                                                        if (rv4Var4.U(intValue4 & 1, z6)) {
                                                            iue.a(s9e.w(80.0f), str9, 16.0f, rv4Var4, 384);
                                                            ube.p(s9e.z(12.0f), rv4Var4, 0);
                                                            kwe.b(iv9.a(), 0, 0, jce.E(-1933920114, new bib(str8, rq9Var7, str7, 1), rv4Var4), rv4Var4, 3072, 6);
                                                        } else {
                                                            rv4Var4.X();
                                                        }
                                                        return pvcVar3;
                                                }
                                            }
                                        }, rv4Var2), rv4Var2, 3072, 2);
                                        ube.p(s9e.t(vy4Var2, 12.0f), rv4Var2, 0);
                                        jue.y(s9e.s(new u55(u63.a)), 0, 1, jce.E(806789967, new qib(rq9Var2, rq9Var3, z2, rq9Var4, rq9Var5, f, 3), rv4Var2), rv4Var2, 3072, 2);
                                    } else {
                                        rv4Var2.X();
                                    }
                                    return pvcVar2;
                                default:
                                    rv4 rv4Var3 = (rv4) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    ((yn1) obj3).getClass();
                                    if ((intValue3 & 17) != 16) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (rv4Var3.U(1 & intValue3, z4)) {
                                        xy4 d = s9e.s(vy4Var2).d(new ph8(xwe.s(nae.e), xwe.s(nae.e), xwe.s(nae.e), xwe.s(8.0f)));
                                        final String str7 = str;
                                        final String str8 = str2;
                                        final rq9 rq9Var7 = rq9Var;
                                        final String str9 = str3;
                                        jue.y(d, 0, 1, jce.E(-126158396, new mu4() { // from class: wib
                                            @Override // defpackage.mu4
                                            public final Object c(Object obj6, Object obj7, Object obj8) {
                                                boolean z5;
                                                boolean h2;
                                                boolean z6;
                                                boolean h3;
                                                int i4 = r5;
                                                pvc pvcVar3 = pvc.a;
                                                int i5 = 2;
                                                String str72 = str9;
                                                rq9 rq9Var72 = rq9Var7;
                                                String str82 = str8;
                                                String str92 = str7;
                                                switch (i4) {
                                                    case 0:
                                                        iv9 iv9Var = (iv9) obj6;
                                                        rv4 rv4Var32 = (rv4) obj7;
                                                        int intValue32 = ((Integer) obj8).intValue();
                                                        iv9Var.getClass();
                                                        if ((intValue32 & 6) == 0) {
                                                            if ((intValue32 & 8) == 0) {
                                                                h2 = rv4Var32.f(iv9Var);
                                                            } else {
                                                                h2 = rv4Var32.h(iv9Var);
                                                            }
                                                            if (h2) {
                                                                i5 = 4;
                                                            }
                                                            intValue32 |= i5;
                                                        }
                                                        if ((intValue32 & 19) != 18) {
                                                            z5 = true;
                                                        } else {
                                                            z5 = false;
                                                        }
                                                        if (rv4Var32.U(intValue32 & 1, z5)) {
                                                            iue.a(s9e.w(64.0f), str92, 18.0f, rv4Var32, 384);
                                                            ube.p(s9e.z(12.0f), rv4Var32, 0);
                                                            kwe.b(iv9.a(), 0, 0, jce.E(-373103602, new bib(str82, rq9Var72, str72, 3), rv4Var32), rv4Var32, 3072, 6);
                                                        } else {
                                                            rv4Var32.X();
                                                        }
                                                        return pvcVar3;
                                                    default:
                                                        iv9 iv9Var2 = (iv9) obj6;
                                                        rv4 rv4Var4 = (rv4) obj7;
                                                        int intValue4 = ((Integer) obj8).intValue();
                                                        iv9Var2.getClass();
                                                        if ((intValue4 & 6) == 0) {
                                                            if ((intValue4 & 8) == 0) {
                                                                h3 = rv4Var4.f(iv9Var2);
                                                            } else {
                                                                h3 = rv4Var4.h(iv9Var2);
                                                            }
                                                            if (h3) {
                                                                i5 = 4;
                                                            }
                                                            intValue4 |= i5;
                                                        }
                                                        if ((intValue4 & 19) != 18) {
                                                            z6 = true;
                                                        } else {
                                                            z6 = false;
                                                        }
                                                        if (rv4Var4.U(intValue4 & 1, z6)) {
                                                            iue.a(s9e.w(80.0f), str92, 16.0f, rv4Var4, 384);
                                                            ube.p(s9e.z(12.0f), rv4Var4, 0);
                                                            kwe.b(iv9.a(), 0, 0, jce.E(-1933920114, new bib(str82, rq9Var72, str72, 1), rv4Var4), rv4Var4, 3072, 6);
                                                        } else {
                                                            rv4Var4.X();
                                                        }
                                                        return pvcVar3;
                                                }
                                            }
                                        }, rv4Var3), rv4Var3, 3072, 2);
                                        ube.p(s9e.t(vy4Var2, 14.0f), rv4Var3, 0);
                                        jue.y(s9e.q(s9e.s(vy4Var2)), 0, 1, jce.E(130948397, new qib(rq9Var2, rq9Var3, z2, rq9Var4, rq9Var5, f, 2), rv4Var3), rv4Var3, 3072, 2);
                                    } else {
                                        rv4Var3.X();
                                    }
                                    return pvcVar2;
                            }
                        }
                    }, rv4Var), rv4Var, 3072, 2);
                } else {
                    rv4Var.X();
                }
                return pvcVar;
            default:
                rv4 rv4Var2 = (rv4) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if ((intValue2 & 3) != 2) {
                    z = true;
                }
                if (rv4Var2.U(intValue2 & 1, z)) {
                    xy4 r2 = s9e.r(vy4Var);
                    final String str4 = this.b;
                    final String str5 = this.c;
                    final rq9 rq9Var6 = this.d;
                    final String str6 = this.e;
                    final rq9 rq9Var7 = this.f;
                    final rq9 rq9Var8 = this.C;
                    final boolean z3 = this.D;
                    final rq9 rq9Var9 = this.E;
                    final rq9 rq9Var10 = this.F;
                    final float f2 = this.G;
                    kwe.b(r2, 0, 1, jce.E(528029352, new mu4() { // from class: oib
                        @Override // defpackage.mu4
                        public final Object c(Object obj3, Object obj4, Object obj5) {
                            boolean z32;
                            boolean h;
                            int i2;
                            boolean z4;
                            int i3 = r11;
                            pvc pvcVar2 = pvc.a;
                            vy4 vy4Var2 = vy4.a;
                            switch (i3) {
                                case 0:
                                    yn1 yn1Var = (yn1) obj3;
                                    rv4 rv4Var22 = (rv4) obj4;
                                    int intValue22 = ((Integer) obj5).intValue();
                                    yn1Var.getClass();
                                    if ((intValue22 & 6) == 0) {
                                        if ((intValue22 & 8) == 0) {
                                            h = rv4Var22.f(yn1Var);
                                        } else {
                                            h = rv4Var22.h(yn1Var);
                                        }
                                        if (h) {
                                            i2 = 4;
                                        } else {
                                            i2 = 2;
                                        }
                                        intValue22 |= i2;
                                    }
                                    if ((intValue22 & 19) != 18) {
                                        z32 = true;
                                    } else {
                                        z32 = false;
                                    }
                                    if (rv4Var22.U(1 & intValue22, z32)) {
                                        xy4 s = s9e.s(vy4Var2);
                                        final String str42 = str4;
                                        final String str52 = str5;
                                        final rq9 rq9Var62 = rq9Var6;
                                        final String str62 = str6;
                                        jue.y(s, 0, 1, jce.E(1426413976, new mu4() { // from class: wib
                                            @Override // defpackage.mu4
                                            public final Object c(Object obj6, Object obj7, Object obj8) {
                                                boolean z5;
                                                boolean h2;
                                                boolean z6;
                                                boolean h3;
                                                int i4 = r5;
                                                pvc pvcVar3 = pvc.a;
                                                int i5 = 2;
                                                String str72 = str62;
                                                rq9 rq9Var72 = rq9Var62;
                                                String str82 = str52;
                                                String str92 = str42;
                                                switch (i4) {
                                                    case 0:
                                                        iv9 iv9Var = (iv9) obj6;
                                                        rv4 rv4Var32 = (rv4) obj7;
                                                        int intValue32 = ((Integer) obj8).intValue();
                                                        iv9Var.getClass();
                                                        if ((intValue32 & 6) == 0) {
                                                            if ((intValue32 & 8) == 0) {
                                                                h2 = rv4Var32.f(iv9Var);
                                                            } else {
                                                                h2 = rv4Var32.h(iv9Var);
                                                            }
                                                            if (h2) {
                                                                i5 = 4;
                                                            }
                                                            intValue32 |= i5;
                                                        }
                                                        if ((intValue32 & 19) != 18) {
                                                            z5 = true;
                                                        } else {
                                                            z5 = false;
                                                        }
                                                        if (rv4Var32.U(intValue32 & 1, z5)) {
                                                            iue.a(s9e.w(64.0f), str92, 18.0f, rv4Var32, 384);
                                                            ube.p(s9e.z(12.0f), rv4Var32, 0);
                                                            kwe.b(iv9.a(), 0, 0, jce.E(-373103602, new bib(str82, rq9Var72, str72, 3), rv4Var32), rv4Var32, 3072, 6);
                                                        } else {
                                                            rv4Var32.X();
                                                        }
                                                        return pvcVar3;
                                                    default:
                                                        iv9 iv9Var2 = (iv9) obj6;
                                                        rv4 rv4Var4 = (rv4) obj7;
                                                        int intValue4 = ((Integer) obj8).intValue();
                                                        iv9Var2.getClass();
                                                        if ((intValue4 & 6) == 0) {
                                                            if ((intValue4 & 8) == 0) {
                                                                h3 = rv4Var4.f(iv9Var2);
                                                            } else {
                                                                h3 = rv4Var4.h(iv9Var2);
                                                            }
                                                            if (h3) {
                                                                i5 = 4;
                                                            }
                                                            intValue4 |= i5;
                                                        }
                                                        if ((intValue4 & 19) != 18) {
                                                            z6 = true;
                                                        } else {
                                                            z6 = false;
                                                        }
                                                        if (rv4Var4.U(intValue4 & 1, z6)) {
                                                            iue.a(s9e.w(80.0f), str92, 16.0f, rv4Var4, 384);
                                                            ube.p(s9e.z(12.0f), rv4Var4, 0);
                                                            kwe.b(iv9.a(), 0, 0, jce.E(-1933920114, new bib(str82, rq9Var72, str72, 1), rv4Var4), rv4Var4, 3072, 6);
                                                        } else {
                                                            rv4Var4.X();
                                                        }
                                                        return pvcVar3;
                                                }
                                            }
                                        }, rv4Var22), rv4Var22, 3072, 2);
                                        ube.p(s9e.t(vy4Var2, 12.0f), rv4Var22, 0);
                                        jue.y(s9e.s(new u55(u63.a)), 0, 1, jce.E(806789967, new qib(rq9Var7, rq9Var8, z3, rq9Var9, rq9Var10, f2, 3), rv4Var22), rv4Var22, 3072, 2);
                                    } else {
                                        rv4Var22.X();
                                    }
                                    return pvcVar2;
                                default:
                                    rv4 rv4Var3 = (rv4) obj4;
                                    int intValue3 = ((Integer) obj5).intValue();
                                    ((yn1) obj3).getClass();
                                    if ((intValue3 & 17) != 16) {
                                        z4 = true;
                                    } else {
                                        z4 = false;
                                    }
                                    if (rv4Var3.U(1 & intValue3, z4)) {
                                        xy4 d = s9e.s(vy4Var2).d(new ph8(xwe.s(nae.e), xwe.s(nae.e), xwe.s(nae.e), xwe.s(8.0f)));
                                        final String str7 = str4;
                                        final String str8 = str5;
                                        final rq9 rq9Var72 = rq9Var6;
                                        final String str9 = str6;
                                        jue.y(d, 0, 1, jce.E(-126158396, new mu4() { // from class: wib
                                            @Override // defpackage.mu4
                                            public final Object c(Object obj6, Object obj7, Object obj8) {
                                                boolean z5;
                                                boolean h2;
                                                boolean z6;
                                                boolean h3;
                                                int i4 = r5;
                                                pvc pvcVar3 = pvc.a;
                                                int i5 = 2;
                                                String str72 = str9;
                                                rq9 rq9Var722 = rq9Var72;
                                                String str82 = str8;
                                                String str92 = str7;
                                                switch (i4) {
                                                    case 0:
                                                        iv9 iv9Var = (iv9) obj6;
                                                        rv4 rv4Var32 = (rv4) obj7;
                                                        int intValue32 = ((Integer) obj8).intValue();
                                                        iv9Var.getClass();
                                                        if ((intValue32 & 6) == 0) {
                                                            if ((intValue32 & 8) == 0) {
                                                                h2 = rv4Var32.f(iv9Var);
                                                            } else {
                                                                h2 = rv4Var32.h(iv9Var);
                                                            }
                                                            if (h2) {
                                                                i5 = 4;
                                                            }
                                                            intValue32 |= i5;
                                                        }
                                                        if ((intValue32 & 19) != 18) {
                                                            z5 = true;
                                                        } else {
                                                            z5 = false;
                                                        }
                                                        if (rv4Var32.U(intValue32 & 1, z5)) {
                                                            iue.a(s9e.w(64.0f), str92, 18.0f, rv4Var32, 384);
                                                            ube.p(s9e.z(12.0f), rv4Var32, 0);
                                                            kwe.b(iv9.a(), 0, 0, jce.E(-373103602, new bib(str82, rq9Var722, str72, 3), rv4Var32), rv4Var32, 3072, 6);
                                                        } else {
                                                            rv4Var32.X();
                                                        }
                                                        return pvcVar3;
                                                    default:
                                                        iv9 iv9Var2 = (iv9) obj6;
                                                        rv4 rv4Var4 = (rv4) obj7;
                                                        int intValue4 = ((Integer) obj8).intValue();
                                                        iv9Var2.getClass();
                                                        if ((intValue4 & 6) == 0) {
                                                            if ((intValue4 & 8) == 0) {
                                                                h3 = rv4Var4.f(iv9Var2);
                                                            } else {
                                                                h3 = rv4Var4.h(iv9Var2);
                                                            }
                                                            if (h3) {
                                                                i5 = 4;
                                                            }
                                                            intValue4 |= i5;
                                                        }
                                                        if ((intValue4 & 19) != 18) {
                                                            z6 = true;
                                                        } else {
                                                            z6 = false;
                                                        }
                                                        if (rv4Var4.U(intValue4 & 1, z6)) {
                                                            iue.a(s9e.w(80.0f), str92, 16.0f, rv4Var4, 384);
                                                            ube.p(s9e.z(12.0f), rv4Var4, 0);
                                                            kwe.b(iv9.a(), 0, 0, jce.E(-1933920114, new bib(str82, rq9Var722, str72, 1), rv4Var4), rv4Var4, 3072, 6);
                                                        } else {
                                                            rv4Var4.X();
                                                        }
                                                        return pvcVar3;
                                                }
                                            }
                                        }, rv4Var3), rv4Var3, 3072, 2);
                                        ube.p(s9e.t(vy4Var2, 14.0f), rv4Var3, 0);
                                        jue.y(s9e.q(s9e.s(vy4Var2)), 0, 1, jce.E(130948397, new qib(rq9Var7, rq9Var8, z3, rq9Var9, rq9Var10, f2, 2), rv4Var3), rv4Var3, 3072, 2);
                                    } else {
                                        rv4Var3.X();
                                    }
                                    return pvcVar2;
                            }
                        }
                    }, rv4Var2), rv4Var2, 3072, 2);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
        }
    }
}
