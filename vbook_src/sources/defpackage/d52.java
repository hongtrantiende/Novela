package defpackage;

import java.util.List;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: d52  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class d52 implements mu4 {
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ d52(iw2 iw2Var, m82 m82Var, cz7 cz7Var, vt4 vt4Var, aw7 aw7Var, aw7 aw7Var2, j95 j95Var, aw7 aw7Var3, aw7 aw7Var4, aw7 aw7Var5) {
        this.a = 4;
        this.b = iw2Var;
        this.c = m82Var;
        this.d = cz7Var;
        this.E = vt4Var;
        this.e = aw7Var;
        this.f = aw7Var2;
        this.C = j95Var;
        this.D = aw7Var3;
        this.F = aw7Var4;
        this.G = aw7Var5;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        boolean z;
        ee5 ee5Var;
        yya yyaVar;
        rv4 rv4Var;
        String str;
        Object[] objArr;
        int i;
        ee5 ee5Var2 = (ee5) this.b;
        ix5 ix5Var = (ix5) this.c;
        cz7 cz7Var = (cz7) this.d;
        String str2 = (String) this.e;
        rh8 rh8Var = (rh8) this.f;
        aw7 aw7Var = (aw7) this.C;
        yya yyaVar2 = (yya) this.D;
        yya yyaVar3 = (yya) this.E;
        aw7 aw7Var2 = (aw7) this.F;
        yya yyaVar4 = (yya) this.G;
        su0 su0Var = (su0) obj;
        rv4 rv4Var2 = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        su0Var.getClass();
        if ((intValue & 6) == 0) {
            if (rv4Var2.f(su0Var)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        int i2 = intValue;
        boolean z2 = true;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            nn a = vvb.a(rv4Var2);
            r13 r13Var = (r13) rv4Var2.j(dy1.h);
            WeakHashMap weakHashMap = yjd.w;
            ix5 o = w92.o(h88.n(rv4Var2).b, rv4Var2);
            tc6 tc6Var = (tc6) rv4Var2.j(dy1.n);
            Object[] objArr2 = {ee5Var2, ix5Var, r13Var, a, new rg3(su0Var.d()), new rg3(su0Var.c())};
            boolean f = rv4Var2.f(ix5Var) | rv4Var2.d(tc6Var.ordinal()) | rv4Var2.f(o) | rv4Var2.f(ee5Var2) | rv4Var2.f(r13Var) | rv4Var2.h(a);
            if ((i2 & 14) != 4) {
                z2 = false;
            }
            boolean z3 = f | z2;
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z3 || P == lh9Var) {
                ee5Var = ee5Var2;
                yyaVar = yyaVar4;
                rv4Var = rv4Var2;
                str = str2;
                objArr = objArr2;
                pc3 pc3Var = new pc3(ix5Var, tc6Var, o, ee5Var, r13Var, a, su0Var, null, 3);
                rv4Var.o0(pc3Var);
                P = pc3Var;
            } else {
                yyaVar = yyaVar4;
                rv4Var = rv4Var2;
                str = str2;
                objArr = objArr2;
                ee5Var = ee5Var2;
            }
            yte.j(objArr, (lu4) P, rv4Var);
            long j = ((e6c) aw7Var.getValue()).d;
            String str3 = ((e6c) aw7Var.getValue()).e;
            ze4 ze4Var = pna.c;
            fca.c(384, j, rv4Var, ze4Var, str3);
            if (((rc5) yyaVar2.getValue()).a) {
                rv4Var.e0(733997047);
                String str4 = ((rc5) yyaVar2.getValue()).e;
                nq7 y = zbe.y(ze4Var, 24.0f);
                boolean f2 = rv4Var.f(cz7Var);
                Object P2 = rv4Var.P();
                if (f2 || P2 == lh9Var) {
                    P2 = new oc3(cz7Var, 24);
                    rv4Var.o0(P2);
                }
                zxe.c(48, (vt4) P2, rv4Var, y, str4);
                rv4Var.q(false);
            } else if (((rc5) yyaVar2.getValue()).d) {
                rv4Var.e0(734421685);
                String str5 = ((rc5) yyaVar2.getValue()).h;
                Object P3 = rv4Var.P();
                if (P3 == lh9Var) {
                    P3 = new cd1(15);
                    rv4Var.o0(P3);
                }
                vt4 vt4Var = (vt4) P3;
                boolean f3 = rv4Var.f(cz7Var);
                Object P4 = rv4Var.P();
                if (f3 || P4 == lh9Var) {
                    P4 = new oc3(cz7Var, 25);
                    rv4Var.o0(P4);
                }
                zxe.a(432, vt4Var, (vt4) P4, rv4Var, ze4Var, str5);
                rv4Var.q(false);
            } else if (!((rc5) yyaVar2.getValue()).c) {
                rv4Var.e0(734893040);
                String str6 = ((rc5) yyaVar2.getValue()).e;
                String str7 = ((rc5) yyaVar2.getValue()).f;
                String str8 = ((rc5) yyaVar2.getValue()).g;
                boolean z4 = ((rc5) yyaVar2.getValue()).b;
                nq7 x = zbe.x(zbe.y(ze4Var, 24.0f), mwe.g(15, rv4Var));
                boolean f4 = rv4Var.f(ee5Var);
                Object P5 = rv4Var.P();
                if (f4 || P5 == lh9Var) {
                    qc3 qc3Var = new qc3(4, ee5Var, ee5.class, "importBook", "importBook(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/core/io/KFile;)V", 0, 4);
                    rv4Var.o0(qc3Var);
                    P5 = qc3Var;
                }
                nu4 nu4Var = (nu4) ((i76) P5);
                boolean f5 = rv4Var.f(cz7Var);
                Object P6 = rv4Var.P();
                if (f5 || P6 == lh9Var) {
                    P6 = new oc3(cz7Var, 26);
                    rv4Var.o0(P6);
                }
                rv4 rv4Var3 = rv4Var;
                zxe.b(str, str6, str7, str8, x, z4, nu4Var, (vt4) P6, rv4Var3, 0);
                rv4Var3.q(false);
            } else {
                rv4 rv4Var4 = rv4Var;
                rv4Var4.e0(735669838);
                kwe.f(cz7Var, ee5Var, (kub) yyaVar3.getValue(), (nnb) aw7Var2.getValue(), (e6c) aw7Var.getValue(), (j2c) yyaVar.getValue(), rh8Var, ze4Var, rv4Var4, 12582912);
                rv4Var4.q(false);
            }
        } else {
            rv4Var2.X();
        }
        return pvc.a;
    }

    private final Object b(Object obj, Object obj2, Object obj3) {
        boolean z;
        kd7 kd7Var;
        yya yyaVar;
        rv4 rv4Var;
        String str;
        rh8 rh8Var;
        int i;
        Object[] objArr;
        int i2;
        kd7 kd7Var2 = (kd7) this.b;
        ix5 ix5Var = (ix5) this.c;
        cz7 cz7Var = (cz7) this.d;
        String str2 = (String) this.e;
        rh8 rh8Var2 = (rh8) this.f;
        aw7 aw7Var = (aw7) this.C;
        yya yyaVar2 = (yya) this.D;
        yya yyaVar3 = (yya) this.E;
        aw7 aw7Var2 = (aw7) this.F;
        yya yyaVar4 = (yya) this.G;
        su0 su0Var = (su0) obj;
        rv4 rv4Var2 = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        su0Var.getClass();
        if ((intValue & 6) == 0) {
            if (rv4Var2.f(su0Var)) {
                i2 = 4;
            } else {
                i2 = 2;
            }
            intValue |= i2;
        }
        int i3 = intValue;
        boolean z2 = true;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            nn a = vvb.a(rv4Var2);
            r13 r13Var = (r13) rv4Var2.j(dy1.h);
            WeakHashMap weakHashMap = yjd.w;
            ix5 o = w92.o(h88.n(rv4Var2).b, rv4Var2);
            tc6 tc6Var = (tc6) rv4Var2.j(dy1.n);
            Object[] objArr2 = {kd7Var2, ix5Var, r13Var, a, new rg3(su0Var.d()), new rg3(su0Var.c())};
            boolean f = rv4Var2.f(ix5Var) | rv4Var2.d(tc6Var.ordinal()) | rv4Var2.f(o) | rv4Var2.f(kd7Var2) | rv4Var2.f(r13Var) | rv4Var2.h(a);
            if ((i3 & 14) != 4) {
                z2 = false;
            }
            boolean z3 = f | z2;
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z3 || P == lh9Var) {
                kd7Var = kd7Var2;
                yyaVar = yyaVar4;
                rv4Var = rv4Var2;
                str = str2;
                rh8Var = rh8Var2;
                i = 4;
                objArr = objArr2;
                pc3 pc3Var = new pc3(ix5Var, tc6Var, o, kd7Var, r13Var, a, su0Var, null, 4);
                rv4Var.o0(pc3Var);
                P = pc3Var;
            } else {
                yyaVar = yyaVar4;
                rv4Var = rv4Var2;
                str = str2;
                rh8Var = rh8Var2;
                i = 4;
                objArr = objArr2;
                kd7Var = kd7Var2;
            }
            yte.j(objArr, (lu4) P, rv4Var);
            long j = ((e6c) aw7Var.getValue()).d;
            String str3 = ((e6c) aw7Var.getValue()).e;
            ze4 ze4Var = pna.c;
            fca.c(384, j, rv4Var, ze4Var, str3);
            if (((jd7) yyaVar2.getValue()).a) {
                rv4Var.e0(-1031163343);
                String str4 = ((jd7) yyaVar2.getValue()).e;
                nq7 y = zbe.y(ze4Var, 24.0f);
                boolean f2 = rv4Var.f(cz7Var);
                Object P2 = rv4Var.P();
                if (f2 || P2 == lh9Var) {
                    P2 = new px6(cz7Var, 3);
                    rv4Var.o0(P2);
                }
                nq2.g(48, (vt4) P2, rv4Var, y, str4);
                rv4Var.q(false);
            } else if (((jd7) yyaVar2.getValue()).d) {
                rv4Var.e0(-1030737806);
                String str5 = ((jd7) yyaVar2.getValue()).h;
                Object P3 = rv4Var.P();
                if (P3 == lh9Var) {
                    P3 = new cd1(15);
                    rv4Var.o0(P3);
                }
                vt4 vt4Var = (vt4) P3;
                boolean f3 = rv4Var.f(cz7Var);
                Object P4 = rv4Var.P();
                if (f3 || P4 == lh9Var) {
                    P4 = new px6(cz7Var, i);
                    rv4Var.o0(P4);
                }
                nq2.e(432, vt4Var, (vt4) P4, rv4Var, ze4Var, str5);
                rv4Var.q(false);
            } else if (!((jd7) yyaVar2.getValue()).c) {
                rv4Var.e0(-1030238582);
                String str6 = ((jd7) yyaVar2.getValue()).e;
                String str7 = ((jd7) yyaVar2.getValue()).f;
                String str8 = ((jd7) yyaVar2.getValue()).g;
                boolean z4 = ((jd7) yyaVar2.getValue()).b;
                nq7 x = zbe.x(zbe.y(ze4Var, 24.0f), mwe.g(15, rv4Var));
                boolean f4 = rv4Var.f(kd7Var);
                Object P5 = rv4Var.P();
                if (f4 || P5 == lh9Var) {
                    qc3 qc3Var = new qc3(4, kd7Var, kd7.class, "importBook", "importBook(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/core/io/KFile;)V", 0, 5);
                    rv4Var.o0(qc3Var);
                    P5 = qc3Var;
                }
                nu4 nu4Var = (nu4) ((i76) P5);
                boolean f5 = rv4Var.f(cz7Var);
                Object P6 = rv4Var.P();
                if (f5 || P6 == lh9Var) {
                    P6 = new px6(cz7Var, 5);
                    rv4Var.o0(P6);
                }
                rv4 rv4Var3 = rv4Var;
                nq2.f(str, str6, str7, str8, x, z4, nu4Var, (vt4) P6, rv4Var3, 0);
                rv4Var3.q(false);
            } else {
                rv4 rv4Var4 = rv4Var;
                rv4Var4.e0(-1029461784);
                kwe.f(cz7Var, kd7Var, (kub) yyaVar3.getValue(), (nnb) aw7Var2.getValue(), (e6c) aw7Var.getValue(), (j2c) yyaVar.getValue(), rh8Var, ze4Var, rv4Var4, 12582912);
                rv4Var4.q(false);
            }
        } else {
            rv4Var2.X();
        }
        return pvc.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        boolean z;
        nqd nqdVar;
        yya yyaVar;
        rv4 rv4Var;
        String str;
        Object[] objArr;
        int i;
        nqd nqdVar2 = (nqd) this.b;
        ix5 ix5Var = (ix5) this.c;
        cz7 cz7Var = (cz7) this.d;
        String str2 = (String) this.e;
        rh8 rh8Var = (rh8) this.f;
        aw7 aw7Var = (aw7) this.C;
        yya yyaVar2 = (yya) this.D;
        yya yyaVar3 = (yya) this.E;
        aw7 aw7Var2 = (aw7) this.F;
        yya yyaVar4 = (yya) this.G;
        su0 su0Var = (su0) obj;
        rv4 rv4Var2 = (rv4) obj2;
        int intValue = ((Integer) obj3).intValue();
        su0Var.getClass();
        if ((intValue & 6) == 0) {
            if (rv4Var2.f(su0Var)) {
                i = 4;
            } else {
                i = 2;
            }
            intValue |= i;
        }
        int i2 = intValue;
        boolean z2 = true;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            nn a = vvb.a(rv4Var2);
            r13 r13Var = (r13) rv4Var2.j(dy1.h);
            WeakHashMap weakHashMap = yjd.w;
            ix5 o = w92.o(h88.n(rv4Var2).b, rv4Var2);
            tc6 tc6Var = (tc6) rv4Var2.j(dy1.n);
            Object[] objArr2 = {nqdVar2, ix5Var, r13Var, a, new rg3(su0Var.d()), new rg3(su0Var.c())};
            boolean f = rv4Var2.f(ix5Var) | rv4Var2.d(tc6Var.ordinal()) | rv4Var2.f(o) | rv4Var2.f(nqdVar2) | rv4Var2.f(r13Var) | rv4Var2.h(a);
            if ((i2 & 14) != 4) {
                z2 = false;
            }
            boolean z3 = f | z2;
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z3 || P == lh9Var) {
                nqdVar = nqdVar2;
                yyaVar = yyaVar4;
                rv4Var = rv4Var2;
                str = str2;
                objArr = objArr2;
                pc3 pc3Var = new pc3(ix5Var, tc6Var, o, nqdVar, r13Var, a, su0Var, null, 7);
                rv4Var.o0(pc3Var);
                P = pc3Var;
            } else {
                yyaVar = yyaVar4;
                rv4Var = rv4Var2;
                str = str2;
                objArr = objArr2;
                nqdVar = nqdVar2;
            }
            yte.j(objArr, (lu4) P, rv4Var);
            long j = ((e6c) aw7Var.getValue()).d;
            String str3 = ((e6c) aw7Var.getValue()).e;
            ze4 ze4Var = pna.c;
            fca.c(384, j, rv4Var, ze4Var, str3);
            if (((lqd) yyaVar2.getValue()).a) {
                rv4Var.e0(-237573041);
                String str4 = ((lqd) yyaVar2.getValue()).e;
                nq7 y = zbe.y(ze4Var, 24.0f);
                boolean f2 = rv4Var.f(cz7Var);
                Object P2 = rv4Var.P();
                if (f2 || P2 == lh9Var) {
                    P2 = new qhb(cz7Var, 23);
                    rv4Var.o0(P2);
                }
                yf2.e(48, (vt4) P2, rv4Var, y, str4);
                rv4Var.q(false);
            } else if (((lqd) yyaVar2.getValue()).d) {
                rv4Var.e0(-237147504);
                String str5 = ((lqd) yyaVar2.getValue()).h;
                Object P3 = rv4Var.P();
                if (P3 == lh9Var) {
                    P3 = new cd1(15);
                    rv4Var.o0(P3);
                }
                vt4 vt4Var = (vt4) P3;
                boolean f3 = rv4Var.f(cz7Var);
                Object P4 = rv4Var.P();
                if (f3 || P4 == lh9Var) {
                    P4 = new qhb(cz7Var, 24);
                    rv4Var.o0(P4);
                }
                yf2.c(432, vt4Var, (vt4) P4, rv4Var, ze4Var, str5);
                rv4Var.q(false);
            } else if (!((lqd) yyaVar2.getValue()).c) {
                rv4Var.e0(-236648280);
                String str6 = ((lqd) yyaVar2.getValue()).e;
                String str7 = ((lqd) yyaVar2.getValue()).f;
                String str8 = ((lqd) yyaVar2.getValue()).g;
                boolean z4 = ((lqd) yyaVar2.getValue()).b;
                nq7 x = zbe.x(zbe.y(ze4Var, 24.0f), mwe.g(15, rv4Var));
                boolean f4 = rv4Var.f(nqdVar);
                Object P5 = rv4Var.P();
                if (f4 || P5 == lh9Var) {
                    qc3 qc3Var = new qc3(4, nqdVar, nqd.class, "importBook", "importBook(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/core/io/KFile;)V", 0, 7);
                    rv4Var.o0(qc3Var);
                    P5 = qc3Var;
                }
                nu4 nu4Var = (nu4) ((i76) P5);
                boolean f5 = rv4Var.f(cz7Var);
                Object P6 = rv4Var.P();
                if (f5 || P6 == lh9Var) {
                    P6 = new qhb(cz7Var, 25);
                    rv4Var.o0(P6);
                }
                rv4 rv4Var3 = rv4Var;
                yf2.d(str, str6, str7, str8, x, z4, nu4Var, (vt4) P6, rv4Var3, 0);
                rv4Var3.q(false);
            } else {
                rv4 rv4Var4 = rv4Var;
                rv4Var4.e0(-235871482);
                kwe.f(cz7Var, nqdVar, (kub) yyaVar3.getValue(), (nnb) aw7Var2.getValue(), (e6c) aw7Var.getValue(), (j2c) yyaVar.getValue(), rh8Var, ze4Var, rv4Var4, 12582912);
                rv4Var4.q(false);
            }
        } else {
            rv4Var2.X();
        }
        return pvc.a;
    }

    @Override // defpackage.mu4
    public final Object c(Object obj, Object obj2, Object obj3) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        da4 da4Var;
        boolean z10;
        rv4 rv4Var;
        int i;
        rh8 h;
        float f;
        boolean z11;
        float f2;
        boolean z12;
        boolean z13;
        int i2;
        boolean z14;
        int i3;
        int i4;
        int i5 = this.a;
        pvc pvcVar = pvc.a;
        Object obj4 = ax1.a;
        Object obj5 = this.G;
        Object obj6 = this.F;
        Object obj7 = this.E;
        Object obj8 = this.D;
        Object obj9 = this.C;
        Object obj10 = this.f;
        Object obj11 = this.e;
        Object obj12 = this.d;
        Object obj13 = this.c;
        Object obj14 = this.b;
        boolean z15 = true;
        switch (i5) {
            case 0:
                int i6 = 2;
                h2a h2aVar = (h2a) obj14;
                cyb cybVar = (cyb) obj13;
                kob kobVar = (kob) obj12;
                e6c e6cVar = (e6c) obj11;
                j2c j2cVar = (j2c) obj10;
                sxb sxbVar = (sxb) obj9;
                ymb ymbVar = (ymb) obj8;
                vt4 vt4Var = (vt4) obj7;
                xt4 xt4Var = (xt4) obj6;
                xt4 xt4Var2 = (xt4) obj5;
                su0 su0Var = (su0) obj;
                rv4 rv4Var2 = (rv4) obj2;
                int intValue = ((Integer) obj3).intValue();
                su0Var.getClass();
                if ((intValue & 6) == 0) {
                    if (rv4Var2.f(su0Var)) {
                        i6 = 4;
                    }
                    intValue |= i6;
                }
                if ((intValue & 19) != 18) {
                    z = true;
                } else {
                    z = false;
                }
                if (rv4Var2.U(intValue & 1, z)) {
                    ze4 ze4Var = pna.c;
                    kj6 i7 = h2aVar.i();
                    if (cybVar.d() == p7a.a) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean f3 = rv4Var2.f(kobVar);
                    boolean z16 = z2;
                    if ((intValue & 14) == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean f4 = f3 | z3 | rv4Var2.f(e6cVar) | rv4Var2.f(cybVar) | rv4Var2.f(j2cVar) | rv4Var2.f(sxbVar) | rv4Var2.f(ymbVar) | rv4Var2.f(vt4Var) | rv4Var2.f(xt4Var) | rv4Var2.f(xt4Var2);
                    Object P = rv4Var2.P();
                    if (f4 || P == obj4) {
                        P = new p52(kobVar, su0Var, e6cVar, cybVar, j2cVar, sxbVar, ymbVar, vt4Var, xt4Var, xt4Var2);
                        rv4Var2.o0(P);
                    }
                    jce.d(ze4Var, i7, null, false, null, null, null, z16, null, (xt4) P, rv4Var2, 6, 380);
                } else {
                    rv4Var2.X();
                }
                return pvcVar;
            case 1:
                int i8 = 2;
                kc3 kc3Var = (kc3) obj14;
                ix5 ix5Var = (ix5) obj13;
                cz7 cz7Var = (cz7) obj12;
                String str = (String) obj11;
                rh8 rh8Var = (rh8) obj10;
                aw7 aw7Var = (aw7) obj9;
                yya yyaVar = (yya) obj8;
                yya yyaVar2 = (yya) obj7;
                aw7 aw7Var2 = (aw7) obj6;
                yya yyaVar3 = (yya) obj5;
                su0 su0Var2 = (su0) obj;
                rv4 rv4Var3 = (rv4) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                su0Var2.getClass();
                if ((intValue2 & 6) == 0) {
                    if (rv4Var3.f(su0Var2)) {
                        i8 = 4;
                    }
                    intValue2 |= i8;
                }
                int i9 = intValue2;
                if ((i9 & 19) != 18) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (rv4Var3.U(i9 & 1, z4)) {
                    nn a = vvb.a(rv4Var3);
                    r13 r13Var = (r13) rv4Var3.j(dy1.h);
                    WeakHashMap weakHashMap = yjd.w;
                    ix5 o = w92.o(h88.n(rv4Var3).b, rv4Var3);
                    tc6 tc6Var = (tc6) rv4Var3.j(dy1.n);
                    Object[] objArr = {kc3Var, ix5Var, r13Var, a, new rg3(su0Var2.d()), new rg3(su0Var2.c())};
                    boolean d = rv4Var3.d(tc6Var.ordinal()) | rv4Var3.f(ix5Var) | rv4Var3.f(o) | rv4Var3.f(kc3Var) | rv4Var3.f(r13Var) | rv4Var3.h(a);
                    if ((i9 & 14) == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z17 = d | z5;
                    Object P2 = rv4Var3.P();
                    if (z17 || P2 == obj4) {
                        P2 = new pc3(ix5Var, tc6Var, o, kc3Var, r13Var, a, su0Var2, null, 0);
                        rv4Var3.o0(P2);
                    }
                    yte.j(objArr, (lu4) P2, rv4Var3);
                    long j = ((e6c) aw7Var.getValue()).d;
                    String str2 = ((e6c) aw7Var.getValue()).e;
                    ze4 ze4Var2 = pna.c;
                    fca.c(384, j, rv4Var3, ze4Var2, str2);
                    if (((hc3) yyaVar.getValue()).a) {
                        rv4Var3.e0(208551371);
                        String str3 = ((hc3) yyaVar.getValue()).e;
                        nq7 y = zbe.y(ze4Var2, 24.0f);
                        boolean f5 = rv4Var3.f(cz7Var);
                        Object P3 = rv4Var3.P();
                        if (f5 || P3 == obj4) {
                            P3 = new n7(cz7Var, 28);
                            rv4Var3.o0(P3);
                        }
                        qre.d(48, (vt4) P3, rv4Var3, y, str3);
                        rv4Var3.q(false);
                    } else if (((hc3) yyaVar.getValue()).d) {
                        rv4Var3.e0(208881800);
                        String str4 = ((hc3) yyaVar.getValue()).h;
                        Object P4 = rv4Var3.P();
                        if (P4 == obj4) {
                            P4 = new cd1(15);
                            rv4Var3.o0(P4);
                        }
                        vt4 vt4Var2 = (vt4) P4;
                        boolean f6 = rv4Var3.f(cz7Var);
                        Object P5 = rv4Var3.P();
                        if (f6 || P5 == obj4) {
                            P5 = new n7(cz7Var, 29);
                            rv4Var3.o0(P5);
                        }
                        qre.a(432, vt4Var2, (vt4) P5, rv4Var3, ze4Var2, str4);
                        rv4Var3.q(false);
                    } else if (!((hc3) yyaVar.getValue()).c) {
                        rv4Var3.e0(209290566);
                        String str5 = ((hc3) yyaVar.getValue()).e;
                        String str6 = ((hc3) yyaVar.getValue()).f;
                        String str7 = ((hc3) yyaVar.getValue()).g;
                        boolean z18 = ((hc3) yyaVar.getValue()).b;
                        nq7 x = zbe.x(zbe.y(ze4Var2, 24.0f), mwe.g(15, rv4Var3));
                        boolean f7 = rv4Var3.f(kc3Var);
                        Object P6 = rv4Var3.P();
                        if (f7 || P6 == obj4) {
                            Object qc3Var = new qc3(4, kc3Var, kc3.class, "importBook", "importBook(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/core/io/KFile;)V", 0, 0);
                            rv4Var3.o0(qc3Var);
                            P6 = qc3Var;
                        }
                        nu4 nu4Var = (nu4) ((i76) P6);
                        boolean f8 = rv4Var3.f(cz7Var);
                        Object P7 = rv4Var3.P();
                        if (!f8 && P7 != obj4) {
                            z6 = false;
                        } else {
                            z6 = false;
                            P7 = new oc3(cz7Var, 0);
                            rv4Var3.o0(P7);
                        }
                        qre.b(str, str5, str6, str7, x, z18, nu4Var, (vt4) P7, rv4Var3, 0);
                        rv4Var3.q(z6);
                    } else {
                        rv4Var3.e0(210004899);
                        kwe.f(cz7Var, kc3Var, (kub) yyaVar2.getValue(), (nnb) aw7Var2.getValue(), (e6c) aw7Var.getValue(), (j2c) yyaVar3.getValue(), rh8Var, ze4Var2, rv4Var3, 12582912);
                        rv4Var3.q(false);
                    }
                } else {
                    rv4Var3.X();
                }
                return pvcVar;
            case 2:
                int i10 = 2;
                bw3 bw3Var = (bw3) obj14;
                ix5 ix5Var2 = (ix5) obj13;
                cz7 cz7Var2 = (cz7) obj12;
                String str8 = (String) obj11;
                rh8 rh8Var2 = (rh8) obj10;
                aw7 aw7Var3 = (aw7) obj9;
                yya yyaVar4 = (yya) obj8;
                yya yyaVar5 = (yya) obj7;
                aw7 aw7Var4 = (aw7) obj6;
                yya yyaVar6 = (yya) obj5;
                su0 su0Var3 = (su0) obj;
                rv4 rv4Var4 = (rv4) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                su0Var3.getClass();
                if ((intValue3 & 6) == 0) {
                    if (rv4Var4.f(su0Var3)) {
                        i10 = 4;
                    }
                    intValue3 |= i10;
                }
                int i11 = intValue3;
                if ((i11 & 19) != 18) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (rv4Var4.U(i11 & 1, z7)) {
                    nn a2 = vvb.a(rv4Var4);
                    r13 r13Var2 = (r13) rv4Var4.j(dy1.h);
                    WeakHashMap weakHashMap2 = yjd.w;
                    ix5 o2 = w92.o(h88.n(rv4Var4).b, rv4Var4);
                    tc6 tc6Var2 = (tc6) rv4Var4.j(dy1.n);
                    Object[] objArr2 = {bw3Var, ix5Var2, r13Var2, a2, new rg3(su0Var3.d()), new rg3(su0Var3.c())};
                    boolean d2 = rv4Var4.d(tc6Var2.ordinal()) | rv4Var4.f(ix5Var2) | rv4Var4.f(o2) | rv4Var4.f(bw3Var) | rv4Var4.f(r13Var2) | rv4Var4.h(a2);
                    if ((i11 & 14) == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z19 = d2 | z8;
                    Object P8 = rv4Var4.P();
                    if (z19 || P8 == obj4) {
                        P8 = new pc3(ix5Var2, tc6Var2, o2, bw3Var, r13Var2, a2, su0Var3, null, 1);
                        rv4Var4.o0(P8);
                    }
                    yte.j(objArr2, (lu4) P8, rv4Var4);
                    long j2 = ((e6c) aw7Var3.getValue()).d;
                    String str9 = ((e6c) aw7Var3.getValue()).e;
                    ze4 ze4Var3 = pna.c;
                    fca.c(384, j2, rv4Var4, ze4Var3, str9);
                    if (((xv3) yyaVar4.getValue()).a) {
                        rv4Var4.e0(621903326);
                        String str10 = ((xv3) yyaVar4.getValue()).e;
                        nq7 y2 = zbe.y(ze4Var3, 24.0f);
                        boolean f9 = rv4Var4.f(cz7Var2);
                        Object P9 = rv4Var4.P();
                        if (f9 || P9 == obj4) {
                            P9 = new oc3(cz7Var2, 4);
                            rv4Var4.o0(P9);
                        }
                        gue.c(48, (vt4) P9, rv4Var4, y2, str10);
                        rv4Var4.q(false);
                    } else if (((xv3) yyaVar4.getValue()).d) {
                        rv4Var4.e0(622328863);
                        String str11 = ((xv3) yyaVar4.getValue()).h;
                        Object P10 = rv4Var4.P();
                        if (P10 == obj4) {
                            P10 = new cd1(15);
                            rv4Var4.o0(P10);
                        }
                        vt4 vt4Var3 = (vt4) P10;
                        boolean f10 = rv4Var4.f(cz7Var2);
                        Object P11 = rv4Var4.P();
                        if (f10 || P11 == obj4) {
                            P11 = new oc3(cz7Var2, 5);
                            rv4Var4.o0(P11);
                        }
                        gue.a(432, vt4Var3, (vt4) P11, rv4Var4, ze4Var3, str11);
                        rv4Var4.q(false);
                    } else if (!((xv3) yyaVar4.getValue()).c) {
                        rv4Var4.e0(622828087);
                        String str12 = ((xv3) yyaVar4.getValue()).e;
                        String str13 = ((xv3) yyaVar4.getValue()).f;
                        String str14 = ((xv3) yyaVar4.getValue()).g;
                        boolean z20 = ((xv3) yyaVar4.getValue()).b;
                        nq7 x2 = zbe.x(zbe.y(ze4Var3, 24.0f), mwe.g(15, rv4Var4));
                        boolean f11 = rv4Var4.f(bw3Var);
                        Object P12 = rv4Var4.P();
                        if (f11 || P12 == obj4) {
                            Object qc3Var2 = new qc3(4, bw3Var, bw3.class, "importBook", "importBook(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/core/io/KFile;)V", 0, 2);
                            rv4Var4.o0(qc3Var2);
                            P12 = qc3Var2;
                        }
                        nu4 nu4Var2 = (nu4) ((i76) P12);
                        boolean f12 = rv4Var4.f(cz7Var2);
                        Object P13 = rv4Var4.P();
                        if (f12 || P13 == obj4) {
                            P13 = new oc3(cz7Var2, 6);
                            rv4Var4.o0(P13);
                        }
                        gue.b(str8, str12, str13, str14, x2, z20, nu4Var2, (vt4) P13, rv4Var4, 0);
                        rv4Var4.q(false);
                    } else {
                        rv4Var4.e0(623604885);
                        kwe.f(cz7Var2, bw3Var, (kub) yyaVar5.getValue(), (nnb) aw7Var4.getValue(), (e6c) aw7Var3.getValue(), (j2c) yyaVar6.getValue(), rh8Var2, ze4Var3, rv4Var4, 12582912);
                        rv4Var4.q(false);
                    }
                } else {
                    rv4Var4.X();
                }
                return pvcVar;
            case 3:
                int i12 = 2;
                da4 da4Var2 = (da4) obj14;
                ix5 ix5Var3 = (ix5) obj13;
                cz7 cz7Var3 = (cz7) obj12;
                String str15 = (String) obj11;
                rh8 rh8Var3 = (rh8) obj10;
                aw7 aw7Var5 = (aw7) obj9;
                yya yyaVar7 = (yya) obj8;
                yya yyaVar8 = (yya) obj7;
                aw7 aw7Var6 = (aw7) obj6;
                yya yyaVar9 = (yya) obj5;
                su0 su0Var4 = (su0) obj;
                rv4 rv4Var5 = (rv4) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                su0Var4.getClass();
                if ((intValue4 & 6) == 0) {
                    if (rv4Var5.f(su0Var4)) {
                        i12 = 4;
                    }
                    intValue4 |= i12;
                }
                if ((intValue4 & 19) != 18) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (rv4Var5.U(intValue4 & 1, z9)) {
                    nn a3 = vvb.a(rv4Var5);
                    r13 r13Var3 = (r13) rv4Var5.j(dy1.h);
                    WeakHashMap weakHashMap3 = yjd.w;
                    ix5 o3 = w92.o(h88.n(rv4Var5).b, rv4Var5);
                    tc6 tc6Var3 = (tc6) rv4Var5.j(dy1.n);
                    Object[] objArr3 = {da4Var2, ix5Var3, r13Var3, a3, new rg3(su0Var4.d()), new rg3(su0Var4.c())};
                    boolean f13 = rv4Var5.f(ix5Var3) | rv4Var5.d(tc6Var3.ordinal()) | rv4Var5.f(o3) | rv4Var5.f(da4Var2) | rv4Var5.f(r13Var3) | rv4Var5.h(a3);
                    if ((intValue4 & 14) != 4) {
                        z15 = false;
                    }
                    boolean z21 = f13 | z15;
                    Object P14 = rv4Var5.P();
                    if (!z21 && P14 != obj4) {
                        da4Var = da4Var2;
                    } else {
                        P14 = new pc3(ix5Var3, tc6Var3, o3, da4Var2, r13Var3, a3, su0Var4, null, 2);
                        da4Var = da4Var2;
                        rv4Var5.o0(P14);
                    }
                    yte.j(objArr3, (lu4) P14, rv4Var5);
                    long j3 = ((e6c) aw7Var5.getValue()).d;
                    String str16 = ((e6c) aw7Var5.getValue()).e;
                    ze4 ze4Var4 = pna.c;
                    fca.c(384, j3, rv4Var5, ze4Var4, str16);
                    if (((ca4) yyaVar7.getValue()).a) {
                        rv4Var5.e0(-183915286);
                        String str17 = ((ca4) yyaVar7.getValue()).e;
                        nq7 y3 = zbe.y(ze4Var4, 24.0f);
                        boolean f14 = rv4Var5.f(cz7Var3);
                        Object P15 = rv4Var5.P();
                        if (f14 || P15 == obj4) {
                            P15 = new oc3(cz7Var3, 14);
                            rv4Var5.o0(P15);
                        }
                        uue.c(48, (vt4) P15, rv4Var5, y3, str17);
                        rv4Var5.q(false);
                        return pvcVar;
                    } else if (((ca4) yyaVar7.getValue()).d) {
                        rv4Var5.e0(-183489749);
                        String str18 = ((ca4) yyaVar7.getValue()).h;
                        Object P16 = rv4Var5.P();
                        if (P16 == obj4) {
                            P16 = new cd1(15);
                            rv4Var5.o0(P16);
                        }
                        vt4 vt4Var4 = (vt4) P16;
                        boolean f15 = rv4Var5.f(cz7Var3);
                        Object P17 = rv4Var5.P();
                        if (f15 || P17 == obj4) {
                            P17 = new oc3(cz7Var3, 15);
                            rv4Var5.o0(P17);
                        }
                        uue.a(432, vt4Var4, (vt4) P17, rv4Var5, ze4Var4, str18);
                        rv4Var5.q(false);
                        return pvcVar;
                    } else if (!((ca4) yyaVar7.getValue()).c) {
                        rv4Var5.e0(-182990525);
                        String str19 = ((ca4) yyaVar7.getValue()).e;
                        String str20 = ((ca4) yyaVar7.getValue()).f;
                        String str21 = ((ca4) yyaVar7.getValue()).g;
                        boolean z22 = ((ca4) yyaVar7.getValue()).b;
                        nq7 x3 = zbe.x(zbe.y(ze4Var4, 24.0f), mwe.g(15, rv4Var5));
                        boolean f16 = rv4Var5.f(da4Var);
                        Object P18 = rv4Var5.P();
                        if (f16 || P18 == obj4) {
                            P18 = new qc3(4, da4Var, da4.class, "importBook", "importBook(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/core/io/KFile;)V", 0, 3);
                            rv4Var5.o0(P18);
                        }
                        nu4 nu4Var3 = (nu4) ((i76) P18);
                        boolean f17 = rv4Var5.f(cz7Var3);
                        Object P19 = rv4Var5.P();
                        if (f17 || P19 == obj4) {
                            P19 = new oc3(cz7Var3, 16);
                            rv4Var5.o0(P19);
                        }
                        uue.b(str15, str19, str20, str21, x3, z22, nu4Var3, (vt4) P19, rv4Var5, 0);
                        rv4Var5.q(false);
                        return pvcVar;
                    } else {
                        rv4Var5.e0(-182213727);
                        kwe.f(cz7Var3, da4Var, (kub) yyaVar8.getValue(), (nnb) aw7Var6.getValue(), (e6c) aw7Var5.getValue(), (j2c) yyaVar9.getValue(), rh8Var3, ze4Var4, rv4Var5, 12582912);
                        rv4Var5.q(false);
                        return pvcVar;
                    }
                }
                rv4Var5.X();
                return pvcVar;
            case 4:
                rj8 rj8Var = (rj8) obj14;
                m82 m82Var = (m82) obj13;
                cz7 cz7Var4 = (cz7) obj12;
                vt4 vt4Var5 = (vt4) obj7;
                aw7 aw7Var7 = (aw7) obj11;
                aw7 aw7Var8 = (aw7) obj10;
                final j95 j95Var = (j95) obj9;
                aw7 aw7Var9 = (aw7) obj8;
                yya yyaVar10 = (yya) obj6;
                yya yyaVar11 = (yya) obj5;
                rv4 rv4Var6 = (rv4) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                ((ou0) obj).getClass();
                if ((intValue5 & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (rv4Var6.U(intValue5 & 1, z10)) {
                    boolean a4 = ikd.a(rv4Var6);
                    boolean f18 = ((om3) rv4Var6.j(nm3.a)).f();
                    if (a4) {
                        rv4Var6.e0(1288443835);
                        th8 f19 = mwe.f(1, rv4Var6, !f18);
                        if (f18) {
                            f2 = 0.0f;
                        } else {
                            f2 = 80.0f;
                        }
                        h = mwe.h(f19, nae.e, 106.0f, nae.e, f2, rv4Var6, 384, 5);
                        rv4Var = rv4Var6;
                        i = 0;
                        rv4Var.q(false);
                    } else {
                        rv4Var = rv4Var6;
                        i = 0;
                        rv4Var.e0(1288782541);
                        h = mwe.h(mwe.f(1, rv4Var, false), nae.e, 54.0f, nae.e, nae.e, rv4Var, 384, 13);
                        rv4Var.q(false);
                    }
                    th8 f20 = mwe.f(i, rv4Var, f18);
                    if (f18 && a4) {
                        f = 80.0f;
                    } else {
                        f = 0.0f;
                    }
                    rh8 h2 = mwe.h(f20, 12.0f, nae.e, 12.0f, f + 68.0f, rv4Var, 3120, 2);
                    bkd q = mwe.q(h2, zbe.j(nae.e, nae.e, 8.0f, nae.e, 11));
                    if (rj8Var.k() != 2) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean h3 = rv4Var.h(m82Var) | rv4Var.f(rj8Var);
                    Object P20 = rv4Var.P();
                    if (h3 || P20 == obj4) {
                        P20 = new l85(m82Var, rj8Var);
                        rv4Var.o0(P20);
                    }
                    sf0.a(z11, (vt4) P20, rv4Var, 0, 0);
                    int i13 = ((f95) yyaVar10.getValue()).a;
                    kq7 kq7Var = kq7.a;
                    rv4 rv4Var7 = rv4Var;
                    nxe.b(cz7Var4, i13, rj8Var, false, h2, q, zbe.x(kq7Var, h).a0(pna.c), vt4Var5, rv4Var7, 0);
                    if (a4) {
                        rv4Var7.e0(1289978955);
                        int i14 = ((f95) yyaVar10.getValue()).a;
                        List list = ((f95) yyaVar10.getValue()).c;
                        String str22 = ((y0d) yyaVar11.getValue()).h;
                        int i15 = ((y0d) yyaVar11.getValue()).k + ((y0d) yyaVar11.getValue()).j;
                        int i16 = ((f95) yyaVar10.getValue()).b;
                        ((f95) yyaVar10.getValue()).getClass();
                        nq7 f21 = pna.f(kq7Var, 1.0f);
                        boolean f22 = rv4Var7.f(aw7Var7);
                        Object P21 = rv4Var7.P();
                        if (f22 || P21 == obj4) {
                            P21 = new ea4(aw7Var7, 4);
                            rv4Var7.o0(P21);
                        }
                        vt4 vt4Var6 = (vt4) P21;
                        boolean f23 = rv4Var7.f(aw7Var8);
                        Object P22 = rv4Var7.P();
                        if (f23 || P22 == obj4) {
                            P22 = new ea4(aw7Var8, 5);
                            rv4Var7.o0(P22);
                        }
                        vt4 vt4Var7 = (vt4) P22;
                        boolean h4 = rv4Var7.h(m82Var) | rv4Var7.f(rj8Var);
                        Object P23 = rv4Var7.P();
                        if (h4 || P23 == obj4) {
                            P23 = new bs1(5, m82Var, rj8Var);
                            rv4Var7.o0(P23);
                        }
                        xt4 xt4Var3 = (xt4) P23;
                        boolean f24 = rv4Var7.f(j95Var);
                        Object P24 = rv4Var7.P();
                        if (f24 || P24 == obj4) {
                            P24 = new xt4() { // from class: m85
                                @Override // defpackage.xt4
                                public final Object invoke(Object obj15) {
                                    int i17 = r2;
                                    pvc pvcVar2 = pvc.a;
                                    j95 j95Var2 = j95Var;
                                    int intValue6 = ((Integer) obj15).intValue();
                                    switch (i17) {
                                        case 0:
                                            hk1 a5 = jdd.a(j95Var2);
                                            sw2 sw2Var = ab3.a;
                                            j95Var2.f(a5, ru2.c, new rr0(j95Var2, intValue6, (m42) null, 3));
                                            return pvcVar2;
                                        default:
                                            hk1 a6 = jdd.a(j95Var2);
                                            sw2 sw2Var2 = ab3.a;
                                            j95Var2.f(a6, ru2.c, new rr0(j95Var2, intValue6, (m42) null, 3));
                                            return pvcVar2;
                                    }
                                }
                            };
                            rv4Var7.o0(P24);
                        }
                        xt4 xt4Var4 = (xt4) P24;
                        boolean f25 = rv4Var7.f(aw7Var9);
                        Object P25 = rv4Var7.P();
                        if (f25 || P25 == obj4) {
                            P25 = new ea4(aw7Var9, 6);
                            rv4Var7.o0(P25);
                        }
                        vt4 vt4Var8 = (vt4) P25;
                        boolean f26 = rv4Var7.f(cz7Var4);
                        Object P26 = rv4Var7.P();
                        if (f26 || P26 == obj4) {
                            P26 = new oc3(cz7Var4, 22);
                            rv4Var7.o0(P26);
                        }
                        nxe.h(str22, i15, i14, list, i16, rj8Var, f21, vt4Var6, vt4Var7, xt4Var3, xt4Var4, vt4Var8, (vt4) P26, rv4Var7, 12582912);
                        rv4Var7.q(false);
                    } else {
                        rv4Var7.e0(1291092320);
                        int i17 = ((f95) yyaVar10.getValue()).a;
                        List list2 = ((f95) yyaVar10.getValue()).c;
                        String str23 = ((y0d) yyaVar11.getValue()).h;
                        int i18 = ((y0d) yyaVar11.getValue()).k + ((y0d) yyaVar11.getValue()).j;
                        int i19 = ((f95) yyaVar10.getValue()).b;
                        ((f95) yyaVar10.getValue()).getClass();
                        nq7 f27 = pna.f(kq7Var, 1.0f);
                        boolean f28 = rv4Var7.f(aw7Var7);
                        Object P27 = rv4Var7.P();
                        if (f28 || P27 == obj4) {
                            P27 = new ea4(aw7Var7, 7);
                            rv4Var7.o0(P27);
                        }
                        vt4 vt4Var9 = (vt4) P27;
                        boolean f29 = rv4Var7.f(aw7Var8);
                        Object P28 = rv4Var7.P();
                        if (f29 || P28 == obj4) {
                            P28 = new ea4(aw7Var8, 8);
                            rv4Var7.o0(P28);
                        }
                        vt4 vt4Var10 = (vt4) P28;
                        boolean h5 = rv4Var7.h(m82Var) | rv4Var7.f(rj8Var);
                        Object P29 = rv4Var7.P();
                        if (h5 || P29 == obj4) {
                            P29 = new bs1(6, m82Var, rj8Var);
                            rv4Var7.o0(P29);
                        }
                        xt4 xt4Var5 = (xt4) P29;
                        boolean f30 = rv4Var7.f(j95Var);
                        Object P30 = rv4Var7.P();
                        if (f30 || P30 == obj4) {
                            P30 = new xt4() { // from class: m85
                                @Override // defpackage.xt4
                                public final Object invoke(Object obj15) {
                                    int i172 = r2;
                                    pvc pvcVar2 = pvc.a;
                                    j95 j95Var2 = j95Var;
                                    int intValue6 = ((Integer) obj15).intValue();
                                    switch (i172) {
                                        case 0:
                                            hk1 a5 = jdd.a(j95Var2);
                                            sw2 sw2Var = ab3.a;
                                            j95Var2.f(a5, ru2.c, new rr0(j95Var2, intValue6, (m42) null, 3));
                                            return pvcVar2;
                                        default:
                                            hk1 a6 = jdd.a(j95Var2);
                                            sw2 sw2Var2 = ab3.a;
                                            j95Var2.f(a6, ru2.c, new rr0(j95Var2, intValue6, (m42) null, 3));
                                            return pvcVar2;
                                    }
                                }
                            };
                            rv4Var7.o0(P30);
                        }
                        xt4 xt4Var6 = (xt4) P30;
                        boolean f31 = rv4Var7.f(cz7Var4);
                        Object P31 = rv4Var7.P();
                        if (f31 || P31 == obj4) {
                            P31 = new oc3(cz7Var4, 21);
                            rv4Var7.o0(P31);
                        }
                        vt4 vt4Var11 = (vt4) P31;
                        boolean f32 = rv4Var7.f(aw7Var9);
                        Object P32 = rv4Var7.P();
                        if (f32 || P32 == obj4) {
                            P32 = new ea4(aw7Var9, 3);
                            rv4Var7.o0(P32);
                        }
                        nxe.i(str23, i18, i17, list2, i19, rj8Var, f27, vt4Var9, vt4Var10, xt4Var5, xt4Var6, vt4Var11, (vt4) P32, rv4Var7, 12582912);
                        rv4Var7.q(false);
                    }
                } else {
                    rv4Var6.X();
                }
                return pvcVar;
            case 5:
                return a(obj, obj2, obj3);
            case 6:
                return b(obj, obj2, obj3);
            case 7:
                kj6 kj6Var = (kj6) obj14;
                List list3 = (List) obj13;
                yya yyaVar12 = (yya) obj12;
                lu4 lu4Var = (lu4) obj11;
                lu4 lu4Var2 = (lu4) obj10;
                mu4 mu4Var = (mu4) obj9;
                vt4 vt4Var12 = (vt4) obj7;
                xt4 xt4Var7 = (xt4) obj6;
                xt4 xt4Var8 = (xt4) obj5;
                aw7 aw7Var10 = (aw7) obj8;
                su0 su0Var5 = (su0) obj;
                rv4 rv4Var8 = (rv4) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                su0Var5.getClass();
                if ((intValue6 & 6) == 0) {
                    if (rv4Var8.f(su0Var5)) {
                        i2 = 4;
                    } else {
                        i2 = 2;
                    }
                    intValue6 |= i2;
                }
                if ((intValue6 & 19) != 18) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (rv4Var8.U(intValue6 & 1, z12)) {
                    ze4 ze4Var5 = pna.c;
                    boolean h6 = rv4Var8.h(list3) | rv4Var8.f(yyaVar12);
                    if ((intValue6 & 14) == 4) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean f33 = h6 | z13 | rv4Var8.f(lu4Var) | rv4Var8.f(lu4Var2) | rv4Var8.f(mu4Var) | rv4Var8.f(vt4Var12) | rv4Var8.f(xt4Var7) | rv4Var8.f(xt4Var8);
                    Object P33 = rv4Var8.P();
                    if (f33 || P33 == obj4) {
                        P33 = new bk8(list3, su0Var5, lu4Var, lu4Var2, mu4Var, vt4Var12, xt4Var7, xt4Var8, yyaVar12, aw7Var10, 0);
                        rv4Var8.o0(P33);
                    }
                    vqe.n(ze4Var5, kj6Var, null, null, null, null, false, (xt4) P33, rv4Var8, 6);
                } else {
                    rv4Var8.X();
                }
                return pvcVar;
            case 8:
                return e(obj, obj2, obj3);
            default:
                shc shcVar = (shc) obj14;
                e33 e33Var = (e33) obj13;
                List list4 = (List) obj12;
                p59 p59Var = (p59) obj11;
                cz7 cz7Var5 = (cz7) obj10;
                w43 w43Var = (w43) obj9;
                g13 g13Var = (g13) obj8;
                yya yyaVar13 = (yya) obj7;
                aw7 aw7Var11 = (aw7) obj6;
                aw7 aw7Var12 = (aw7) obj5;
                rv4 rv4Var9 = (rv4) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((xg6) obj).getClass();
                if ((intValue7 & 17) != 16) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (rv4Var9.U(intValue7 & 1, z14)) {
                    String str24 = ((y0d) yyaVar13.getValue()).b;
                    int i20 = ((y0d) yyaVar13.getValue()).g;
                    nq7 C = zbe.C(kq7.a, nae.e, nae.e, nae.e, 14.0f, 7);
                    boolean f34 = rv4Var9.f(shcVar);
                    Object P34 = rv4Var9.P();
                    if (f34 || P34 == obj4) {
                        P34 = new wob(1, shcVar, shc.class, "handleLink", "handleLink(Ljava/lang/String;)V", 0, 21);
                        rv4Var9.o0(P34);
                    }
                    i76 i76Var = (i76) P34;
                    boolean f35 = rv4Var9.f(shcVar) | rv4Var9.h(e33Var);
                    Object P35 = rv4Var9.P();
                    if (!f35 && P35 != obj4) {
                        i3 = i20;
                    } else {
                        i3 = i20;
                        P35 = new fhc(shcVar, e33Var, 0);
                        rv4Var9.o0(P35);
                    }
                    vt4 vt4Var13 = (vt4) P35;
                    xt4 xt4Var9 = (xt4) i76Var;
                    boolean f36 = rv4Var9.f(p59Var);
                    Object P36 = rv4Var9.P();
                    if (!f36 && P36 != obj4) {
                        i4 = 0;
                    } else {
                        i4 = 0;
                        P36 = new r93(p59Var, 2, (byte) 0);
                        rv4Var9.o0(P36);
                    }
                    lu4 lu4Var3 = (lu4) P36;
                    Object P37 = rv4Var9.P();
                    if (P37 == obj4) {
                        P37 = new ghc(aw7Var11, aw7Var12, i4);
                        rv4Var9.o0(P37);
                    }
                    xt4 xt4Var10 = (xt4) P37;
                    boolean f37 = rv4Var9.f(cz7Var5) | rv4Var9.h(w43Var) | rv4Var9.h(e33Var);
                    Object P38 = rv4Var9.P();
                    if (f37 || P38 == obj4) {
                        P38 = new hhc(cz7Var5, w43Var, e33Var, 0);
                        rv4Var9.o0(P38);
                    }
                    vt4 vt4Var14 = (vt4) P38;
                    boolean f38 = rv4Var9.f(g13Var) | rv4Var9.h(e33Var);
                    Object P39 = rv4Var9.P();
                    if (f38 || P39 == obj4) {
                        P39 = new ihc(g13Var, e33Var, 0);
                        rv4Var9.o0(P39);
                    }
                    rgc.k(e33Var, vt4Var13, C, list4, str24, i3, xt4Var9, lu4Var3, xt4Var10, vt4Var14, (vt4) P39, rv4Var9, 100663688);
                } else {
                    rv4Var9.X();
                }
                return pvcVar;
        }
    }

    public /* synthetic */ d52(kj6 kj6Var, List list, yya yyaVar, lu4 lu4Var, lu4 lu4Var2, mu4 mu4Var, vt4 vt4Var, xt4 xt4Var, xt4 xt4Var2, aw7 aw7Var) {
        this.a = 7;
        this.b = kj6Var;
        this.c = list;
        this.d = yyaVar;
        this.e = lu4Var;
        this.f = lu4Var2;
        this.C = mu4Var;
        this.E = vt4Var;
        this.F = xt4Var;
        this.G = xt4Var2;
        this.D = aw7Var;
    }

    public /* synthetic */ d52(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.C = obj6;
        this.D = obj7;
        this.E = obj8;
        this.F = obj9;
        this.G = obj10;
    }
}
