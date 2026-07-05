package defpackage;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yhb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class yhb implements lu4 {
    public final /* synthetic */ String C;
    public final /* synthetic */ boolean D;
    public final /* synthetic */ rq9 E;
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ xy4 b;
    public final /* synthetic */ lid c;
    public final /* synthetic */ rq9 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    public /* synthetic */ yhb(xy4 xy4Var, lid lidVar, rq9 rq9Var, String str, String str2, String str3, boolean z, rq9 rq9Var2, int i) {
        this.b = xy4Var;
        this.c = lidVar;
        this.d = rq9Var;
        this.e = str;
        this.f = str2;
        this.C = str3;
        this.D = z;
        this.E = rq9Var2;
    }

    @Override // defpackage.lu4
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        rv4 rv4Var;
        rv4 rv4Var2;
        rv4 rv4Var3;
        int i = this.a;
        pvc pvcVar = pvc.a;
        switch (i) {
            case 0:
                rv4 rv4Var4 = (rv4) obj;
                int intValue = ((Integer) obj2).intValue();
                boolean z3 = true;
                if ((intValue & 3) != 2) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var4.U(intValue & 1, z)) {
                    lid lidVar = this.c;
                    int i2 = lidVar.b;
                    int i3 = lidVar.c;
                    if (i2 <= 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (i3 > 2) {
                        z3 = false;
                    }
                    xy4 xy4Var = this.b;
                    rq9 rq9Var = this.d;
                    String str = this.e;
                    boolean z4 = this.D;
                    if (z2) {
                        rv4Var4.e0(-1010217846);
                        if (i3 <= 2) {
                            rv4Var4.e0(521603536);
                            iue.w(xy4Var, lidVar, rq9Var, str, z4, rv4Var4, 3072);
                            rv4Var2 = rv4Var4;
                            rv4Var2.q(false);
                        } else {
                            rv4Var2 = rv4Var4;
                            if (i3 <= 3) {
                                rv4Var2.e0(521615978);
                                iue.r(xy4Var, rq9Var, str, z4, rv4Var2, 384);
                                rv4Var2.q(false);
                            } else {
                                rv4Var2.e0(521626114);
                                iue.q(xy4Var, rq9Var, str, z4, rv4Var2, 384);
                                rv4Var3 = rv4Var2;
                                rv4Var3.q(false);
                                rv4Var3.q(false);
                            }
                        }
                        rv4Var3 = rv4Var2;
                        rv4Var3.q(false);
                    } else {
                        String str2 = this.f;
                        String str3 = this.C;
                        rq9 rq9Var2 = this.E;
                        if (z3) {
                            rv4Var4.e0(-1009104574);
                            if (i2 <= 3) {
                                rv4Var4.e0(-1009035971);
                                iue.F(xy4Var, lidVar, str2, rq9Var, str3, z4, rq9Var2, rv4Var4, 24576);
                                rv4Var = rv4Var4;
                                rv4Var.q(false);
                            } else {
                                rv4Var = rv4Var4;
                                rv4Var.e0(521653904);
                                iue.E(3072, rv4Var, xy4Var, rq9Var, rq9Var2, lidVar, str2, str3, str, z4);
                                rv4Var.q(false);
                            }
                            rv4Var.q(false);
                        } else {
                            rv4Var4.e0(-1008068337);
                            if (i2 <= 3) {
                                rv4Var4.e0(521672130);
                                iue.D(xy4Var, rq9Var, str, z4, rv4Var4, 384);
                                rv4Var4.q(false);
                            } else if (i2 <= 4) {
                                rv4Var4.e0(-1007690757);
                                iue.u(24576, rv4Var4, xy4Var, rq9Var, rq9Var2, str2, str3, str, z4);
                                rv4Var4.q(false);
                            } else if (i3 <= 3) {
                                rv4Var4.e0(521698374);
                                iue.t(196608, rv4Var4, xy4Var, rq9Var, rq9Var2, str2, str3, str, z4);
                                rv4Var4.q(false);
                            } else {
                                rv4Var4.e0(521712534);
                                iue.p(12582912, rv4Var4, xy4Var, rq9Var, rq9Var2, lidVar, str2, str3, str, z4);
                                rv4Var4.q(false);
                            }
                            rv4Var4.q(false);
                        }
                    }
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 1:
                ((Integer) obj2).getClass();
                iue.E(xoe.p(3073), (rv4) obj, this.b, this.d, this.E, this.c, this.e, this.f, this.C, this.D);
                return pvcVar;
            default:
                ((Integer) obj2).getClass();
                iue.p(xoe.p(12582913), (rv4) obj, this.b, this.d, this.E, this.c, this.e, this.f, this.C, this.D);
                return pvcVar;
        }
    }

    public /* synthetic */ yhb(xy4 xy4Var, lid lidVar, String str, String str2, String str3, boolean z, rq9 rq9Var, rq9 rq9Var2, int i) {
        this.b = xy4Var;
        this.c = lidVar;
        this.e = str;
        this.f = str2;
        this.C = str3;
        this.D = z;
        this.d = rq9Var;
        this.E = rq9Var2;
    }

    public /* synthetic */ yhb(lid lidVar, xy4 xy4Var, rq9 rq9Var, String str, boolean z, String str2, String str3, rq9 rq9Var2) {
        this.c = lidVar;
        this.b = xy4Var;
        this.d = rq9Var;
        this.e = str;
        this.D = z;
        this.f = str2;
        this.C = str3;
        this.E = rq9Var2;
    }
}
