package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: km3  reason: default package */
/* loaded from: classes.dex */
public final class km3 {
    public String a;
    public xt4 b;
    public xt4 c;
    public boolean d;
    public xt4 e;
    public xt4 f;
    public xt4 g;
    public xt4 h;
    public xt4 i;
    public xt4 j;

    public final lm3 a() {
        xt4 xt4Var = this.f;
        if (xt4Var == null && this.g != null) {
            p1a.k(hl5.n("Color ", this.a, " has secondBackground defined, but background is not defined."));
            return null;
        } else if (xt4Var == null && this.h != null) {
            p1a.k(hl5.n("Color ", this.a, " has contrastCurve defined, but background is not defined."));
            return null;
        } else if (xt4Var != null && this.h == null) {
            p1a.k(hl5.n("Color ", this.a, " has background defined, but contrastCurve is not defined."));
            return null;
        } else {
            xt4 xt4Var2 = this.c;
            if (xt4Var2 == null) {
                if (xt4Var == null) {
                    xt4Var2 = new u83(12);
                } else {
                    xt4Var2 = new im(6, xt4Var);
                }
            }
            String str = this.a;
            str.getClass();
            xt4 xt4Var3 = this.b;
            xt4Var3.getClass();
            return new lm3(str, xt4Var3, xt4Var2, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [km3, java.lang.Object] */
    public final km3 b(final lm3 lm3Var) {
        String str;
        String str2 = this.a;
        String str3 = lm3Var.a;
        boolean i = c16.i(str2, str3);
        xm1 xm1Var = xm1.d;
        if (i) {
            boolean z = this.d;
            boolean z2 = lm3Var.d;
            String str4 = this.a;
            if (z == z2) {
                ?? obj = new Object();
                str4.getClass();
                obj.a = str4;
                obj.d = this.d;
                obj.b = new xt4() { // from class: jm3
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj2) {
                        xt4 xt4Var;
                        kfc kfcVar;
                        xt4 xt4Var2;
                        Object invoke;
                        xt4 xt4Var3;
                        xt4 xt4Var4;
                        xt4 xt4Var5;
                        xt4 xt4Var6;
                        xt4 xt4Var7;
                        xt4 xt4Var8;
                        int i2 = r3;
                        km3 km3Var = this;
                        lm3 lm3Var2 = lm3Var;
                        xm1 xm1Var2 = xm1.d;
                        switch (i2) {
                            case 0:
                                xt4 xt4Var9 = lm3Var2.b;
                                sm3 sm3Var = (sm3) obj2;
                                sm3Var.getClass();
                                if (sm3Var.l == xm1Var2) {
                                    xt4Var = xt4Var9;
                                } else {
                                    xt4Var = km3Var.b;
                                }
                                if (xt4Var == null || (kfcVar = (kfc) xt4Var.invoke(sm3Var)) == null) {
                                    return (kfc) xt4Var9.invoke(sm3Var);
                                }
                                return kfcVar;
                            case 1:
                                xt4 xt4Var10 = lm3Var2.c;
                                sm3 sm3Var2 = (sm3) obj2;
                                sm3Var2.getClass();
                                if (sm3Var2.l == xm1Var2) {
                                    xt4Var2 = xt4Var10;
                                } else {
                                    xt4Var2 = km3Var.c;
                                }
                                if (xt4Var2 != null) {
                                    invoke = xt4Var2.invoke(sm3Var2);
                                } else {
                                    invoke = xt4Var10.invoke(sm3Var2);
                                }
                                return Double.valueOf(((Number) invoke).doubleValue());
                            case 2:
                                sm3 sm3Var3 = (sm3) obj2;
                                sm3Var3.getClass();
                                if (sm3Var3.l == xm1Var2) {
                                    xt4Var3 = lm3Var2.e;
                                } else {
                                    xt4Var3 = km3Var.e;
                                }
                                if (xt4Var3 != null) {
                                    return (Double) xt4Var3.invoke(sm3Var3);
                                }
                                return Double.valueOf(1.0d);
                            case 3:
                                sm3 sm3Var4 = (sm3) obj2;
                                sm3Var4.getClass();
                                if (sm3Var4.l == xm1Var2) {
                                    xt4Var4 = lm3Var2.f;
                                } else {
                                    xt4Var4 = km3Var.f;
                                }
                                if (xt4Var4 == null) {
                                    return null;
                                }
                                return (lm3) xt4Var4.invoke(sm3Var4);
                            case 4:
                                sm3 sm3Var5 = (sm3) obj2;
                                sm3Var5.getClass();
                                if (sm3Var5.l == xm1Var2) {
                                    xt4Var5 = lm3Var2.g;
                                } else {
                                    xt4Var5 = km3Var.g;
                                }
                                if (xt4Var5 == null) {
                                    return null;
                                }
                                return (lm3) xt4Var5.invoke(sm3Var5);
                            case 5:
                                sm3 sm3Var6 = (sm3) obj2;
                                sm3Var6.getClass();
                                if (sm3Var6.l == xm1Var2) {
                                    xt4Var6 = lm3Var2.h;
                                } else {
                                    xt4Var6 = km3Var.h;
                                }
                                if (xt4Var6 == null) {
                                    return null;
                                }
                                return (y52) xt4Var6.invoke(sm3Var6);
                            case 6:
                                sm3 sm3Var7 = (sm3) obj2;
                                sm3Var7.getClass();
                                if (sm3Var7.l == xm1Var2) {
                                    xt4Var7 = lm3Var2.i;
                                } else {
                                    xt4Var7 = km3Var.i;
                                }
                                if (xt4Var7 == null) {
                                    return null;
                                }
                                return (nfc) xt4Var7.invoke(sm3Var7);
                            default:
                                sm3 sm3Var8 = (sm3) obj2;
                                sm3Var8.getClass();
                                if (sm3Var8.l == xm1Var2) {
                                    xt4Var8 = lm3Var2.j;
                                } else {
                                    xt4Var8 = km3Var.j;
                                }
                                if (xt4Var8 == null) {
                                    return null;
                                }
                                return (Double) xt4Var8.invoke(sm3Var8);
                        }
                    }
                };
                obj.c = new xt4() { // from class: jm3
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj2) {
                        xt4 xt4Var;
                        kfc kfcVar;
                        xt4 xt4Var2;
                        Object invoke;
                        xt4 xt4Var3;
                        xt4 xt4Var4;
                        xt4 xt4Var5;
                        xt4 xt4Var6;
                        xt4 xt4Var7;
                        xt4 xt4Var8;
                        int i2 = r3;
                        km3 km3Var = this;
                        lm3 lm3Var2 = lm3Var;
                        xm1 xm1Var2 = xm1.d;
                        switch (i2) {
                            case 0:
                                xt4 xt4Var9 = lm3Var2.b;
                                sm3 sm3Var = (sm3) obj2;
                                sm3Var.getClass();
                                if (sm3Var.l == xm1Var2) {
                                    xt4Var = xt4Var9;
                                } else {
                                    xt4Var = km3Var.b;
                                }
                                if (xt4Var == null || (kfcVar = (kfc) xt4Var.invoke(sm3Var)) == null) {
                                    return (kfc) xt4Var9.invoke(sm3Var);
                                }
                                return kfcVar;
                            case 1:
                                xt4 xt4Var10 = lm3Var2.c;
                                sm3 sm3Var2 = (sm3) obj2;
                                sm3Var2.getClass();
                                if (sm3Var2.l == xm1Var2) {
                                    xt4Var2 = xt4Var10;
                                } else {
                                    xt4Var2 = km3Var.c;
                                }
                                if (xt4Var2 != null) {
                                    invoke = xt4Var2.invoke(sm3Var2);
                                } else {
                                    invoke = xt4Var10.invoke(sm3Var2);
                                }
                                return Double.valueOf(((Number) invoke).doubleValue());
                            case 2:
                                sm3 sm3Var3 = (sm3) obj2;
                                sm3Var3.getClass();
                                if (sm3Var3.l == xm1Var2) {
                                    xt4Var3 = lm3Var2.e;
                                } else {
                                    xt4Var3 = km3Var.e;
                                }
                                if (xt4Var3 != null) {
                                    return (Double) xt4Var3.invoke(sm3Var3);
                                }
                                return Double.valueOf(1.0d);
                            case 3:
                                sm3 sm3Var4 = (sm3) obj2;
                                sm3Var4.getClass();
                                if (sm3Var4.l == xm1Var2) {
                                    xt4Var4 = lm3Var2.f;
                                } else {
                                    xt4Var4 = km3Var.f;
                                }
                                if (xt4Var4 == null) {
                                    return null;
                                }
                                return (lm3) xt4Var4.invoke(sm3Var4);
                            case 4:
                                sm3 sm3Var5 = (sm3) obj2;
                                sm3Var5.getClass();
                                if (sm3Var5.l == xm1Var2) {
                                    xt4Var5 = lm3Var2.g;
                                } else {
                                    xt4Var5 = km3Var.g;
                                }
                                if (xt4Var5 == null) {
                                    return null;
                                }
                                return (lm3) xt4Var5.invoke(sm3Var5);
                            case 5:
                                sm3 sm3Var6 = (sm3) obj2;
                                sm3Var6.getClass();
                                if (sm3Var6.l == xm1Var2) {
                                    xt4Var6 = lm3Var2.h;
                                } else {
                                    xt4Var6 = km3Var.h;
                                }
                                if (xt4Var6 == null) {
                                    return null;
                                }
                                return (y52) xt4Var6.invoke(sm3Var6);
                            case 6:
                                sm3 sm3Var7 = (sm3) obj2;
                                sm3Var7.getClass();
                                if (sm3Var7.l == xm1Var2) {
                                    xt4Var7 = lm3Var2.i;
                                } else {
                                    xt4Var7 = km3Var.i;
                                }
                                if (xt4Var7 == null) {
                                    return null;
                                }
                                return (nfc) xt4Var7.invoke(sm3Var7);
                            default:
                                sm3 sm3Var8 = (sm3) obj2;
                                sm3Var8.getClass();
                                if (sm3Var8.l == xm1Var2) {
                                    xt4Var8 = lm3Var2.j;
                                } else {
                                    xt4Var8 = km3Var.j;
                                }
                                if (xt4Var8 == null) {
                                    return null;
                                }
                                return (Double) xt4Var8.invoke(sm3Var8);
                        }
                    }
                };
                obj.e = new xt4() { // from class: jm3
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj2) {
                        xt4 xt4Var;
                        kfc kfcVar;
                        xt4 xt4Var2;
                        Object invoke;
                        xt4 xt4Var3;
                        xt4 xt4Var4;
                        xt4 xt4Var5;
                        xt4 xt4Var6;
                        xt4 xt4Var7;
                        xt4 xt4Var8;
                        int i2 = r3;
                        km3 km3Var = this;
                        lm3 lm3Var2 = lm3Var;
                        xm1 xm1Var2 = xm1.d;
                        switch (i2) {
                            case 0:
                                xt4 xt4Var9 = lm3Var2.b;
                                sm3 sm3Var = (sm3) obj2;
                                sm3Var.getClass();
                                if (sm3Var.l == xm1Var2) {
                                    xt4Var = xt4Var9;
                                } else {
                                    xt4Var = km3Var.b;
                                }
                                if (xt4Var == null || (kfcVar = (kfc) xt4Var.invoke(sm3Var)) == null) {
                                    return (kfc) xt4Var9.invoke(sm3Var);
                                }
                                return kfcVar;
                            case 1:
                                xt4 xt4Var10 = lm3Var2.c;
                                sm3 sm3Var2 = (sm3) obj2;
                                sm3Var2.getClass();
                                if (sm3Var2.l == xm1Var2) {
                                    xt4Var2 = xt4Var10;
                                } else {
                                    xt4Var2 = km3Var.c;
                                }
                                if (xt4Var2 != null) {
                                    invoke = xt4Var2.invoke(sm3Var2);
                                } else {
                                    invoke = xt4Var10.invoke(sm3Var2);
                                }
                                return Double.valueOf(((Number) invoke).doubleValue());
                            case 2:
                                sm3 sm3Var3 = (sm3) obj2;
                                sm3Var3.getClass();
                                if (sm3Var3.l == xm1Var2) {
                                    xt4Var3 = lm3Var2.e;
                                } else {
                                    xt4Var3 = km3Var.e;
                                }
                                if (xt4Var3 != null) {
                                    return (Double) xt4Var3.invoke(sm3Var3);
                                }
                                return Double.valueOf(1.0d);
                            case 3:
                                sm3 sm3Var4 = (sm3) obj2;
                                sm3Var4.getClass();
                                if (sm3Var4.l == xm1Var2) {
                                    xt4Var4 = lm3Var2.f;
                                } else {
                                    xt4Var4 = km3Var.f;
                                }
                                if (xt4Var4 == null) {
                                    return null;
                                }
                                return (lm3) xt4Var4.invoke(sm3Var4);
                            case 4:
                                sm3 sm3Var5 = (sm3) obj2;
                                sm3Var5.getClass();
                                if (sm3Var5.l == xm1Var2) {
                                    xt4Var5 = lm3Var2.g;
                                } else {
                                    xt4Var5 = km3Var.g;
                                }
                                if (xt4Var5 == null) {
                                    return null;
                                }
                                return (lm3) xt4Var5.invoke(sm3Var5);
                            case 5:
                                sm3 sm3Var6 = (sm3) obj2;
                                sm3Var6.getClass();
                                if (sm3Var6.l == xm1Var2) {
                                    xt4Var6 = lm3Var2.h;
                                } else {
                                    xt4Var6 = km3Var.h;
                                }
                                if (xt4Var6 == null) {
                                    return null;
                                }
                                return (y52) xt4Var6.invoke(sm3Var6);
                            case 6:
                                sm3 sm3Var7 = (sm3) obj2;
                                sm3Var7.getClass();
                                if (sm3Var7.l == xm1Var2) {
                                    xt4Var7 = lm3Var2.i;
                                } else {
                                    xt4Var7 = km3Var.i;
                                }
                                if (xt4Var7 == null) {
                                    return null;
                                }
                                return (nfc) xt4Var7.invoke(sm3Var7);
                            default:
                                sm3 sm3Var8 = (sm3) obj2;
                                sm3Var8.getClass();
                                if (sm3Var8.l == xm1Var2) {
                                    xt4Var8 = lm3Var2.j;
                                } else {
                                    xt4Var8 = km3Var.j;
                                }
                                if (xt4Var8 == null) {
                                    return null;
                                }
                                return (Double) xt4Var8.invoke(sm3Var8);
                        }
                    }
                };
                obj.f = new xt4() { // from class: jm3
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj2) {
                        xt4 xt4Var;
                        kfc kfcVar;
                        xt4 xt4Var2;
                        Object invoke;
                        xt4 xt4Var3;
                        xt4 xt4Var4;
                        xt4 xt4Var5;
                        xt4 xt4Var6;
                        xt4 xt4Var7;
                        xt4 xt4Var8;
                        int i2 = r3;
                        km3 km3Var = this;
                        lm3 lm3Var2 = lm3Var;
                        xm1 xm1Var2 = xm1.d;
                        switch (i2) {
                            case 0:
                                xt4 xt4Var9 = lm3Var2.b;
                                sm3 sm3Var = (sm3) obj2;
                                sm3Var.getClass();
                                if (sm3Var.l == xm1Var2) {
                                    xt4Var = xt4Var9;
                                } else {
                                    xt4Var = km3Var.b;
                                }
                                if (xt4Var == null || (kfcVar = (kfc) xt4Var.invoke(sm3Var)) == null) {
                                    return (kfc) xt4Var9.invoke(sm3Var);
                                }
                                return kfcVar;
                            case 1:
                                xt4 xt4Var10 = lm3Var2.c;
                                sm3 sm3Var2 = (sm3) obj2;
                                sm3Var2.getClass();
                                if (sm3Var2.l == xm1Var2) {
                                    xt4Var2 = xt4Var10;
                                } else {
                                    xt4Var2 = km3Var.c;
                                }
                                if (xt4Var2 != null) {
                                    invoke = xt4Var2.invoke(sm3Var2);
                                } else {
                                    invoke = xt4Var10.invoke(sm3Var2);
                                }
                                return Double.valueOf(((Number) invoke).doubleValue());
                            case 2:
                                sm3 sm3Var3 = (sm3) obj2;
                                sm3Var3.getClass();
                                if (sm3Var3.l == xm1Var2) {
                                    xt4Var3 = lm3Var2.e;
                                } else {
                                    xt4Var3 = km3Var.e;
                                }
                                if (xt4Var3 != null) {
                                    return (Double) xt4Var3.invoke(sm3Var3);
                                }
                                return Double.valueOf(1.0d);
                            case 3:
                                sm3 sm3Var4 = (sm3) obj2;
                                sm3Var4.getClass();
                                if (sm3Var4.l == xm1Var2) {
                                    xt4Var4 = lm3Var2.f;
                                } else {
                                    xt4Var4 = km3Var.f;
                                }
                                if (xt4Var4 == null) {
                                    return null;
                                }
                                return (lm3) xt4Var4.invoke(sm3Var4);
                            case 4:
                                sm3 sm3Var5 = (sm3) obj2;
                                sm3Var5.getClass();
                                if (sm3Var5.l == xm1Var2) {
                                    xt4Var5 = lm3Var2.g;
                                } else {
                                    xt4Var5 = km3Var.g;
                                }
                                if (xt4Var5 == null) {
                                    return null;
                                }
                                return (lm3) xt4Var5.invoke(sm3Var5);
                            case 5:
                                sm3 sm3Var6 = (sm3) obj2;
                                sm3Var6.getClass();
                                if (sm3Var6.l == xm1Var2) {
                                    xt4Var6 = lm3Var2.h;
                                } else {
                                    xt4Var6 = km3Var.h;
                                }
                                if (xt4Var6 == null) {
                                    return null;
                                }
                                return (y52) xt4Var6.invoke(sm3Var6);
                            case 6:
                                sm3 sm3Var7 = (sm3) obj2;
                                sm3Var7.getClass();
                                if (sm3Var7.l == xm1Var2) {
                                    xt4Var7 = lm3Var2.i;
                                } else {
                                    xt4Var7 = km3Var.i;
                                }
                                if (xt4Var7 == null) {
                                    return null;
                                }
                                return (nfc) xt4Var7.invoke(sm3Var7);
                            default:
                                sm3 sm3Var8 = (sm3) obj2;
                                sm3Var8.getClass();
                                if (sm3Var8.l == xm1Var2) {
                                    xt4Var8 = lm3Var2.j;
                                } else {
                                    xt4Var8 = km3Var.j;
                                }
                                if (xt4Var8 == null) {
                                    return null;
                                }
                                return (Double) xt4Var8.invoke(sm3Var8);
                        }
                    }
                };
                obj.g = new xt4() { // from class: jm3
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj2) {
                        xt4 xt4Var;
                        kfc kfcVar;
                        xt4 xt4Var2;
                        Object invoke;
                        xt4 xt4Var3;
                        xt4 xt4Var4;
                        xt4 xt4Var5;
                        xt4 xt4Var6;
                        xt4 xt4Var7;
                        xt4 xt4Var8;
                        int i2 = r3;
                        km3 km3Var = this;
                        lm3 lm3Var2 = lm3Var;
                        xm1 xm1Var2 = xm1.d;
                        switch (i2) {
                            case 0:
                                xt4 xt4Var9 = lm3Var2.b;
                                sm3 sm3Var = (sm3) obj2;
                                sm3Var.getClass();
                                if (sm3Var.l == xm1Var2) {
                                    xt4Var = xt4Var9;
                                } else {
                                    xt4Var = km3Var.b;
                                }
                                if (xt4Var == null || (kfcVar = (kfc) xt4Var.invoke(sm3Var)) == null) {
                                    return (kfc) xt4Var9.invoke(sm3Var);
                                }
                                return kfcVar;
                            case 1:
                                xt4 xt4Var10 = lm3Var2.c;
                                sm3 sm3Var2 = (sm3) obj2;
                                sm3Var2.getClass();
                                if (sm3Var2.l == xm1Var2) {
                                    xt4Var2 = xt4Var10;
                                } else {
                                    xt4Var2 = km3Var.c;
                                }
                                if (xt4Var2 != null) {
                                    invoke = xt4Var2.invoke(sm3Var2);
                                } else {
                                    invoke = xt4Var10.invoke(sm3Var2);
                                }
                                return Double.valueOf(((Number) invoke).doubleValue());
                            case 2:
                                sm3 sm3Var3 = (sm3) obj2;
                                sm3Var3.getClass();
                                if (sm3Var3.l == xm1Var2) {
                                    xt4Var3 = lm3Var2.e;
                                } else {
                                    xt4Var3 = km3Var.e;
                                }
                                if (xt4Var3 != null) {
                                    return (Double) xt4Var3.invoke(sm3Var3);
                                }
                                return Double.valueOf(1.0d);
                            case 3:
                                sm3 sm3Var4 = (sm3) obj2;
                                sm3Var4.getClass();
                                if (sm3Var4.l == xm1Var2) {
                                    xt4Var4 = lm3Var2.f;
                                } else {
                                    xt4Var4 = km3Var.f;
                                }
                                if (xt4Var4 == null) {
                                    return null;
                                }
                                return (lm3) xt4Var4.invoke(sm3Var4);
                            case 4:
                                sm3 sm3Var5 = (sm3) obj2;
                                sm3Var5.getClass();
                                if (sm3Var5.l == xm1Var2) {
                                    xt4Var5 = lm3Var2.g;
                                } else {
                                    xt4Var5 = km3Var.g;
                                }
                                if (xt4Var5 == null) {
                                    return null;
                                }
                                return (lm3) xt4Var5.invoke(sm3Var5);
                            case 5:
                                sm3 sm3Var6 = (sm3) obj2;
                                sm3Var6.getClass();
                                if (sm3Var6.l == xm1Var2) {
                                    xt4Var6 = lm3Var2.h;
                                } else {
                                    xt4Var6 = km3Var.h;
                                }
                                if (xt4Var6 == null) {
                                    return null;
                                }
                                return (y52) xt4Var6.invoke(sm3Var6);
                            case 6:
                                sm3 sm3Var7 = (sm3) obj2;
                                sm3Var7.getClass();
                                if (sm3Var7.l == xm1Var2) {
                                    xt4Var7 = lm3Var2.i;
                                } else {
                                    xt4Var7 = km3Var.i;
                                }
                                if (xt4Var7 == null) {
                                    return null;
                                }
                                return (nfc) xt4Var7.invoke(sm3Var7);
                            default:
                                sm3 sm3Var8 = (sm3) obj2;
                                sm3Var8.getClass();
                                if (sm3Var8.l == xm1Var2) {
                                    xt4Var8 = lm3Var2.j;
                                } else {
                                    xt4Var8 = km3Var.j;
                                }
                                if (xt4Var8 == null) {
                                    return null;
                                }
                                return (Double) xt4Var8.invoke(sm3Var8);
                        }
                    }
                };
                obj.h = new xt4() { // from class: jm3
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj2) {
                        xt4 xt4Var;
                        kfc kfcVar;
                        xt4 xt4Var2;
                        Object invoke;
                        xt4 xt4Var3;
                        xt4 xt4Var4;
                        xt4 xt4Var5;
                        xt4 xt4Var6;
                        xt4 xt4Var7;
                        xt4 xt4Var8;
                        int i2 = r3;
                        km3 km3Var = this;
                        lm3 lm3Var2 = lm3Var;
                        xm1 xm1Var2 = xm1.d;
                        switch (i2) {
                            case 0:
                                xt4 xt4Var9 = lm3Var2.b;
                                sm3 sm3Var = (sm3) obj2;
                                sm3Var.getClass();
                                if (sm3Var.l == xm1Var2) {
                                    xt4Var = xt4Var9;
                                } else {
                                    xt4Var = km3Var.b;
                                }
                                if (xt4Var == null || (kfcVar = (kfc) xt4Var.invoke(sm3Var)) == null) {
                                    return (kfc) xt4Var9.invoke(sm3Var);
                                }
                                return kfcVar;
                            case 1:
                                xt4 xt4Var10 = lm3Var2.c;
                                sm3 sm3Var2 = (sm3) obj2;
                                sm3Var2.getClass();
                                if (sm3Var2.l == xm1Var2) {
                                    xt4Var2 = xt4Var10;
                                } else {
                                    xt4Var2 = km3Var.c;
                                }
                                if (xt4Var2 != null) {
                                    invoke = xt4Var2.invoke(sm3Var2);
                                } else {
                                    invoke = xt4Var10.invoke(sm3Var2);
                                }
                                return Double.valueOf(((Number) invoke).doubleValue());
                            case 2:
                                sm3 sm3Var3 = (sm3) obj2;
                                sm3Var3.getClass();
                                if (sm3Var3.l == xm1Var2) {
                                    xt4Var3 = lm3Var2.e;
                                } else {
                                    xt4Var3 = km3Var.e;
                                }
                                if (xt4Var3 != null) {
                                    return (Double) xt4Var3.invoke(sm3Var3);
                                }
                                return Double.valueOf(1.0d);
                            case 3:
                                sm3 sm3Var4 = (sm3) obj2;
                                sm3Var4.getClass();
                                if (sm3Var4.l == xm1Var2) {
                                    xt4Var4 = lm3Var2.f;
                                } else {
                                    xt4Var4 = km3Var.f;
                                }
                                if (xt4Var4 == null) {
                                    return null;
                                }
                                return (lm3) xt4Var4.invoke(sm3Var4);
                            case 4:
                                sm3 sm3Var5 = (sm3) obj2;
                                sm3Var5.getClass();
                                if (sm3Var5.l == xm1Var2) {
                                    xt4Var5 = lm3Var2.g;
                                } else {
                                    xt4Var5 = km3Var.g;
                                }
                                if (xt4Var5 == null) {
                                    return null;
                                }
                                return (lm3) xt4Var5.invoke(sm3Var5);
                            case 5:
                                sm3 sm3Var6 = (sm3) obj2;
                                sm3Var6.getClass();
                                if (sm3Var6.l == xm1Var2) {
                                    xt4Var6 = lm3Var2.h;
                                } else {
                                    xt4Var6 = km3Var.h;
                                }
                                if (xt4Var6 == null) {
                                    return null;
                                }
                                return (y52) xt4Var6.invoke(sm3Var6);
                            case 6:
                                sm3 sm3Var7 = (sm3) obj2;
                                sm3Var7.getClass();
                                if (sm3Var7.l == xm1Var2) {
                                    xt4Var7 = lm3Var2.i;
                                } else {
                                    xt4Var7 = km3Var.i;
                                }
                                if (xt4Var7 == null) {
                                    return null;
                                }
                                return (nfc) xt4Var7.invoke(sm3Var7);
                            default:
                                sm3 sm3Var8 = (sm3) obj2;
                                sm3Var8.getClass();
                                if (sm3Var8.l == xm1Var2) {
                                    xt4Var8 = lm3Var2.j;
                                } else {
                                    xt4Var8 = km3Var.j;
                                }
                                if (xt4Var8 == null) {
                                    return null;
                                }
                                return (Double) xt4Var8.invoke(sm3Var8);
                        }
                    }
                };
                obj.i = new xt4() { // from class: jm3
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj2) {
                        xt4 xt4Var;
                        kfc kfcVar;
                        xt4 xt4Var2;
                        Object invoke;
                        xt4 xt4Var3;
                        xt4 xt4Var4;
                        xt4 xt4Var5;
                        xt4 xt4Var6;
                        xt4 xt4Var7;
                        xt4 xt4Var8;
                        int i2 = r3;
                        km3 km3Var = this;
                        lm3 lm3Var2 = lm3Var;
                        xm1 xm1Var2 = xm1.d;
                        switch (i2) {
                            case 0:
                                xt4 xt4Var9 = lm3Var2.b;
                                sm3 sm3Var = (sm3) obj2;
                                sm3Var.getClass();
                                if (sm3Var.l == xm1Var2) {
                                    xt4Var = xt4Var9;
                                } else {
                                    xt4Var = km3Var.b;
                                }
                                if (xt4Var == null || (kfcVar = (kfc) xt4Var.invoke(sm3Var)) == null) {
                                    return (kfc) xt4Var9.invoke(sm3Var);
                                }
                                return kfcVar;
                            case 1:
                                xt4 xt4Var10 = lm3Var2.c;
                                sm3 sm3Var2 = (sm3) obj2;
                                sm3Var2.getClass();
                                if (sm3Var2.l == xm1Var2) {
                                    xt4Var2 = xt4Var10;
                                } else {
                                    xt4Var2 = km3Var.c;
                                }
                                if (xt4Var2 != null) {
                                    invoke = xt4Var2.invoke(sm3Var2);
                                } else {
                                    invoke = xt4Var10.invoke(sm3Var2);
                                }
                                return Double.valueOf(((Number) invoke).doubleValue());
                            case 2:
                                sm3 sm3Var3 = (sm3) obj2;
                                sm3Var3.getClass();
                                if (sm3Var3.l == xm1Var2) {
                                    xt4Var3 = lm3Var2.e;
                                } else {
                                    xt4Var3 = km3Var.e;
                                }
                                if (xt4Var3 != null) {
                                    return (Double) xt4Var3.invoke(sm3Var3);
                                }
                                return Double.valueOf(1.0d);
                            case 3:
                                sm3 sm3Var4 = (sm3) obj2;
                                sm3Var4.getClass();
                                if (sm3Var4.l == xm1Var2) {
                                    xt4Var4 = lm3Var2.f;
                                } else {
                                    xt4Var4 = km3Var.f;
                                }
                                if (xt4Var4 == null) {
                                    return null;
                                }
                                return (lm3) xt4Var4.invoke(sm3Var4);
                            case 4:
                                sm3 sm3Var5 = (sm3) obj2;
                                sm3Var5.getClass();
                                if (sm3Var5.l == xm1Var2) {
                                    xt4Var5 = lm3Var2.g;
                                } else {
                                    xt4Var5 = km3Var.g;
                                }
                                if (xt4Var5 == null) {
                                    return null;
                                }
                                return (lm3) xt4Var5.invoke(sm3Var5);
                            case 5:
                                sm3 sm3Var6 = (sm3) obj2;
                                sm3Var6.getClass();
                                if (sm3Var6.l == xm1Var2) {
                                    xt4Var6 = lm3Var2.h;
                                } else {
                                    xt4Var6 = km3Var.h;
                                }
                                if (xt4Var6 == null) {
                                    return null;
                                }
                                return (y52) xt4Var6.invoke(sm3Var6);
                            case 6:
                                sm3 sm3Var7 = (sm3) obj2;
                                sm3Var7.getClass();
                                if (sm3Var7.l == xm1Var2) {
                                    xt4Var7 = lm3Var2.i;
                                } else {
                                    xt4Var7 = km3Var.i;
                                }
                                if (xt4Var7 == null) {
                                    return null;
                                }
                                return (nfc) xt4Var7.invoke(sm3Var7);
                            default:
                                sm3 sm3Var8 = (sm3) obj2;
                                sm3Var8.getClass();
                                if (sm3Var8.l == xm1Var2) {
                                    xt4Var8 = lm3Var2.j;
                                } else {
                                    xt4Var8 = km3Var.j;
                                }
                                if (xt4Var8 == null) {
                                    return null;
                                }
                                return (Double) xt4Var8.invoke(sm3Var8);
                        }
                    }
                };
                obj.j = new xt4() { // from class: jm3
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj2) {
                        xt4 xt4Var;
                        kfc kfcVar;
                        xt4 xt4Var2;
                        Object invoke;
                        xt4 xt4Var3;
                        xt4 xt4Var4;
                        xt4 xt4Var5;
                        xt4 xt4Var6;
                        xt4 xt4Var7;
                        xt4 xt4Var8;
                        int i2 = r3;
                        km3 km3Var = this;
                        lm3 lm3Var2 = lm3Var;
                        xm1 xm1Var2 = xm1.d;
                        switch (i2) {
                            case 0:
                                xt4 xt4Var9 = lm3Var2.b;
                                sm3 sm3Var = (sm3) obj2;
                                sm3Var.getClass();
                                if (sm3Var.l == xm1Var2) {
                                    xt4Var = xt4Var9;
                                } else {
                                    xt4Var = km3Var.b;
                                }
                                if (xt4Var == null || (kfcVar = (kfc) xt4Var.invoke(sm3Var)) == null) {
                                    return (kfc) xt4Var9.invoke(sm3Var);
                                }
                                return kfcVar;
                            case 1:
                                xt4 xt4Var10 = lm3Var2.c;
                                sm3 sm3Var2 = (sm3) obj2;
                                sm3Var2.getClass();
                                if (sm3Var2.l == xm1Var2) {
                                    xt4Var2 = xt4Var10;
                                } else {
                                    xt4Var2 = km3Var.c;
                                }
                                if (xt4Var2 != null) {
                                    invoke = xt4Var2.invoke(sm3Var2);
                                } else {
                                    invoke = xt4Var10.invoke(sm3Var2);
                                }
                                return Double.valueOf(((Number) invoke).doubleValue());
                            case 2:
                                sm3 sm3Var3 = (sm3) obj2;
                                sm3Var3.getClass();
                                if (sm3Var3.l == xm1Var2) {
                                    xt4Var3 = lm3Var2.e;
                                } else {
                                    xt4Var3 = km3Var.e;
                                }
                                if (xt4Var3 != null) {
                                    return (Double) xt4Var3.invoke(sm3Var3);
                                }
                                return Double.valueOf(1.0d);
                            case 3:
                                sm3 sm3Var4 = (sm3) obj2;
                                sm3Var4.getClass();
                                if (sm3Var4.l == xm1Var2) {
                                    xt4Var4 = lm3Var2.f;
                                } else {
                                    xt4Var4 = km3Var.f;
                                }
                                if (xt4Var4 == null) {
                                    return null;
                                }
                                return (lm3) xt4Var4.invoke(sm3Var4);
                            case 4:
                                sm3 sm3Var5 = (sm3) obj2;
                                sm3Var5.getClass();
                                if (sm3Var5.l == xm1Var2) {
                                    xt4Var5 = lm3Var2.g;
                                } else {
                                    xt4Var5 = km3Var.g;
                                }
                                if (xt4Var5 == null) {
                                    return null;
                                }
                                return (lm3) xt4Var5.invoke(sm3Var5);
                            case 5:
                                sm3 sm3Var6 = (sm3) obj2;
                                sm3Var6.getClass();
                                if (sm3Var6.l == xm1Var2) {
                                    xt4Var6 = lm3Var2.h;
                                } else {
                                    xt4Var6 = km3Var.h;
                                }
                                if (xt4Var6 == null) {
                                    return null;
                                }
                                return (y52) xt4Var6.invoke(sm3Var6);
                            case 6:
                                sm3 sm3Var7 = (sm3) obj2;
                                sm3Var7.getClass();
                                if (sm3Var7.l == xm1Var2) {
                                    xt4Var7 = lm3Var2.i;
                                } else {
                                    xt4Var7 = km3Var.i;
                                }
                                if (xt4Var7 == null) {
                                    return null;
                                }
                                return (nfc) xt4Var7.invoke(sm3Var7);
                            default:
                                sm3 sm3Var8 = (sm3) obj2;
                                sm3Var8.getClass();
                                if (sm3Var8.l == xm1Var2) {
                                    xt4Var8 = lm3Var2.j;
                                } else {
                                    xt4Var8 = km3Var.j;
                                }
                                if (xt4Var8 == null) {
                                    return null;
                                }
                                return (Double) xt4Var8.invoke(sm3Var8);
                        }
                    }
                };
                return obj;
            }
            String str5 = "foreground";
            if (!z) {
                str = "foreground";
            } else {
                str = "background";
            }
            if (z2) {
                str5 = "background";
            }
            StringBuilder y = nk2.y("Attempting to extend color ", str4, " as a ", str, " with color ");
            nk2.C(y, str3, " as a ", str5, " for spec version ");
            p1a.m(y, xm1Var, ".");
            return null;
        }
        p1a.m(nk2.y("Attempting to extend color ", this.a, " with color ", str3, " of different name for spec version "), xm1Var, ".");
        return null;
    }
}
