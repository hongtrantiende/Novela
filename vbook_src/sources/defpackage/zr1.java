package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: zr1  reason: default package */
/* loaded from: classes3.dex */
public abstract class zr1 {
    public static final tu1 a = new tu1(new nv1(2), false, 880562324);
    public static final tu1 b = new tu1(new nv1(3), false, -1131830889);
    public static final tu1 c = new tu1(new mv1(6), false, -661718501);
    public static final tu1 d = new tu1(new mv1(7), false, -1864828721);
    public static final Object e = new Object();
    public static final Object f = new Object();
    public static bfd g;

    public static final void A() {
        if (c16.i(Looper.myLooper(), Looper.getMainLooper())) {
            return;
        }
        vs.k("This method must be executed in the UI thread");
    }

    public static final long B(float f2, long j) {
        return (Float.floatToRawIntBits(Math.max((float) nae.e, Float.intBitsToFloat((int) (j >> 32)) - f2)) << 32) | (Float.floatToRawIntBits(Math.max((float) nae.e, Float.intBitsToFloat((int) (j & 4294967295L)) - f2)) & 4294967295L);
    }

    public static ComponentName C(Context context, Intent intent) {
        synchronized (f) {
            try {
                j(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName startService = context.startService(intent);
                if (startService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    g.a();
                }
                return startService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final boolean D(long j) {
        if ((j & Long.MIN_VALUE) != 0) {
            return true;
        }
        return false;
    }

    public static final boolean E(long j) {
        if ((j & 2147483648L) != 0) {
            return true;
        }
        return false;
    }

    public static final int F(long j) {
        return (int) ((j & 9223372032559808512L) >>> 32);
    }

    public static String G(String str) {
        try {
            Object invoke = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
            if (invoke instanceof String) {
                return (String) invoke;
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public static final void a(String str, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        zx1 zx1Var;
        String str2 = str;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(819147254);
        if (rv4Var2.f(str2)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var2.f(nq7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i5 & 1, z)) {
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nq7 k = tte.k(pna.n(kq7Var, 44.0f), uu9.a);
            tza tzaVar = j27.a;
            nq7 v = nmd.v(k, zl1.b(0.12f, ((h27) rv4Var2.j(tzaVar)).a.a), lre.g);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, v);
            rv4Var2.i0();
            if (rv4Var2.S) {
                zx1Var = zx1Var2;
                rv4Var2.k(zx1Var);
            } else {
                zx1Var = zx1Var2;
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            nk5.a(rp5.c((wk3) jk3.a.getValue(), rv4Var2, 0), null, pna.n(pu0.a.a(kq7Var, kh5.e), 22.0f), ((h27) rv4Var2.j(tzaVar)).a.a, rv4Var2, 48, 0);
            rv4Var2.q(true);
            xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
            we6 we6Var = new we6(1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, we6Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            str2 = str;
            cvb.c(str2, null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.i, rv4Var, i5 & 14, 0, 131070);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new o7(str2, nq7Var, i, 0);
        }
    }

    public static final void b(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        cz7 cz7Var2;
        pb2 pb2Var;
        boolean z2;
        cz7Var.getClass();
        rv4Var.g0(1978138193);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                b8 b8Var = (b8) ((fdd) voe.z(cm9.a(b8.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z3 = jsc.z(b8Var.e, rv4Var);
                Object[] objArr = new Object[0];
                Object P = rv4Var.P();
                lh9 lh9Var = ax1.a;
                if (P == lh9Var) {
                    P = new i(4);
                    rv4Var.o0(P);
                }
                aw7 j = zpe.j(objArr, (vt4) P, rv4Var, 384);
                s02 s02Var = b8Var.f;
                if ((i3 & 14) == 4) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object P2 = rv4Var.P();
                if (z2 || P2 == lh9Var) {
                    P2 = new u7(cz7Var, (m42) null, 0);
                    rv4Var.o0(P2);
                }
                jye.b(s02Var, null, (mu4) P2, rv4Var, 0);
                cz7Var2 = cz7Var;
                fxe.h(yqe.A((y3b) k2b.g.getValue(), rv4Var), pna.c, false, jce.E(294311509, new p7(cz7Var, 0), rv4Var), null, null, jce.E(-286364250, new q7(b8Var, cz7Var, z3, j, 0), rv4Var), rv4Var, 1575984, 52);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            cz7Var2 = cz7Var;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new p7(cz7Var2, i, 1);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0042, code lost:
        if (r3 == defpackage.ax1.a) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(defpackage.bzc r22, defpackage.nq7 r23, defpackage.rv4 r24, int r25) {
        /*
            Method dump skipped, instructions count: 354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr1.c(bzc, nq7, rv4, int):void");
    }

    public static final void d(int i, rv4 rv4Var) {
        boolean z;
        zt1 zt1Var;
        rv4Var.g0(-519025078);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            if (!((Boolean) rv4Var.j(lx5.a)).booleanValue()) {
                rv4Var.e0(-393746854);
                s6 a2 = bt6.a(rv4Var);
                if (a2 != null) {
                    zt1Var = a2.h();
                } else {
                    zt1Var = null;
                }
                boolean h = rv4Var.h(zt1Var);
                Object P = rv4Var.P();
                if (h || P == ax1.a) {
                    P = new rg0(zt1Var, null, 8);
                    rv4Var.o0(P);
                }
                yte.g((lu4) P, rv4Var, zt1Var);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-393256744);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new pg2(i, 26);
        }
    }

    public static final void e(final boolean z, final String str, final boolean z2, final boolean z3, int i, final xt4 xt4Var, final pu4 pu4Var, rv4 rv4Var, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z4;
        final int i13;
        int i14;
        str.getClass();
        xt4Var.getClass();
        pu4Var.getClass();
        rv4Var.g0(-640665257);
        if (rv4Var.g(z)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i15 = i2 | i4;
        if (rv4Var.f(str)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i16 = i15 | i5;
        if (rv4Var.g(z2)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i17 = i16 | i6;
        if (rv4Var.g(z3)) {
            i7 = 2048;
        } else {
            i7 = 1024;
        }
        int i18 = i17 | i7;
        int i19 = i3 & 16;
        if (i19 != 0) {
            i10 = i18 | 24576;
            i8 = i;
        } else {
            i8 = i;
            if (rv4Var.d(i8)) {
                i9 = 16384;
            } else {
                i9 = 8192;
            }
            i10 = i18 | i9;
        }
        if (rv4Var.h(xt4Var)) {
            i11 = 131072;
        } else {
            i11 = Parser.ARGC_LIMIT;
        }
        int i20 = i10 | i11;
        if (rv4Var.h(pu4Var)) {
            i12 = 1048576;
        } else {
            i12 = 524288;
        }
        int i21 = i20 | i12;
        boolean z5 = true;
        if ((599187 & i21) != 599186) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (rv4Var.U(i21 & 1, z4)) {
            if (i19 != 0) {
                i14 = 0;
            } else {
                i14 = i8;
            }
            Object[] objArr = new Object[0];
            if ((i21 & 7168) != 2048) {
                z5 = false;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (z5 || P == lh9Var) {
                P = new g64(2, z3);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 0);
            Object[] objArr2 = new Object[0];
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new qx6(12);
                rv4Var.o0(P2);
            }
            aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
            Object[] objArr3 = new Object[0];
            Object P3 = rv4Var.P();
            if (P3 == lh9Var) {
                P3 = new qx6(13);
                rv4Var.o0(P3);
            }
            aw7 aw7Var3 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var, 48);
            Object[] objArr4 = new Object[0];
            Object P4 = rv4Var.P();
            if (P4 == lh9Var) {
                P4 = new qx6(14);
                rv4Var.o0(P4);
            }
            aw7 aw7Var4 = (aw7) zpe.k(objArr4, (vt4) P4, rv4Var, 48);
            Object P5 = rv4Var.P();
            if (P5 == lh9Var) {
                P5 = yae.z(null);
                rv4Var.o0(P5);
            }
            aw7 aw7Var5 = (aw7) P5;
            Object P6 = rv4Var.P();
            if (P6 == lh9Var) {
                P6 = yae.z("0");
                rv4Var.o0(P6);
            }
            aw7 aw7Var6 = (aw7) P6;
            Object P7 = rv4Var.P();
            if (P7 == lh9Var) {
                P7 = yae.z("0");
                rv4Var.o0(P7);
            }
            aw7 aw7Var7 = (aw7) P7;
            int i22 = i14;
            xb.d(z, xt4Var, jce.E(-1741016149, new lf3(xt4Var, pu4Var, aw7Var2, aw7Var4, aw7Var3, aw7Var, aw7Var5, aw7Var6, aw7Var7), rv4Var), null, mwe.x(kq7.a, 14), jce.E(-4717714, new id1(xt4Var, 7, (byte) 0), rv4Var), jce.E(574048431, new jd1(str, 8), rv4Var), null, 0L, 0L, nae.e, false, false, jce.E(-2057108989, new c01(z2, aw7Var3, aw7Var, aw7Var4, aw7Var5, i22, aw7Var2, aw7Var6, aw7Var7), rv4Var), rv4Var, (i21 & 14) | 1769856 | ((i21 >> 12) & Token.ASSIGN_MOD), 8072);
            i13 = i22;
        } else {
            rv4Var.X();
            i13 = i8;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(z, str, z2, z3, i13, xt4Var, pu4Var, i2, i3) { // from class: sd7
                public final /* synthetic */ pu4 C;
                public final /* synthetic */ int D;
                public final /* synthetic */ boolean a;
                public final /* synthetic */ String b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ int e;
                public final /* synthetic */ xt4 f;

                {
                    this.D = i3;
                }

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(1);
                    zr1.e(this.a, this.b, this.c, this.d, this.e, this.f, this.C, (rv4) obj, p, this.D);
                    return pvc.a;
                }
            };
        }
    }

    public static final boolean f(aw7 aw7Var) {
        return ((Boolean) aw7Var.getValue()).booleanValue();
    }

    public static final boolean g(aw7 aw7Var) {
        return ((Boolean) aw7Var.getValue()).booleanValue();
    }

    public static final boolean h(aw7 aw7Var) {
        return ((Boolean) aw7Var.getValue()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void i(java.lang.String r43, java.lang.String r44, defpackage.nq7 r45, defpackage.lu4 r46, defpackage.rv4 r47, int r48) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr1.i(java.lang.String, java.lang.String, nq7, lu4, rv4, int):void");
    }

    public static void j(Context context) {
        if (g == null) {
            bfd bfdVar = new bfd(context);
            g = bfdVar;
            synchronized (bfdVar.a) {
                bfdVar.g = true;
            }
        }
    }

    public static final void k(long j) {
        boolean z;
        f4c[] f4cVarArr = e4c.b;
        if ((j & 1095216660480L) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            nv5.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void l(long j, long j2) {
        f4c[] f4cVarArr = e4c.b;
        if ((j & 1095216660480L) == 0 || (1095216660480L & j2) == 0) {
            nv5.a("Cannot perform operation for Unspecified type.");
        }
        if (!f4c.a(e4c.b(j), e4c.b(j2))) {
            String b2 = f4c.b(e4c.b(j));
            String b3 = f4c.b(e4c.b(j2));
            nv5.a("Cannot perform operation for " + b2 + " and " + b3);
        }
    }

    public static void m(Intent intent) {
        synchronized (f) {
            try {
                if (g != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    g.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:56|(1:(2:58|(1:111)(1:62))(2:113|114))|(5:106|107|(8:80|81|(1:(3:83|(1:101)(1:(1:89)(2:86|87))|88)(2:102|(1:104)))|90|(1:100)(1:94)|95|(1:97)|99)|68|(1:79)(4:70|(1:78)|76|77))|64|(1:66)|80|81|(2:(0)(0)|88)|90|(1:92)|100|95|(0)|99|68|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b7, code lost:
        if (r11 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fd, code lost:
        if (r12 == false) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0169 A[Catch: NoSuchFieldException -> 0x0198, TryCatch #1 {NoSuchFieldException -> 0x0198, blocks: (B:79:0x015c, B:81:0x0169, B:90:0x0185, B:92:0x018b, B:94:0x0191, B:96:0x0195, B:86:0x017d), top: B:115:0x015c }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0195 A[Catch: NoSuchFieldException -> 0x0198, TRY_LEAVE, TryCatch #1 {NoSuchFieldException -> 0x0198, blocks: (B:79:0x015c, B:81:0x0169, B:90:0x0185, B:92:0x018b, B:94:0x0191, B:96:0x0195, B:86:0x017d), top: B:115:0x015c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.s76 n(defpackage.gi1 r16, defpackage.s76... r17) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zr1.n(gi1, s76[]):s76");
    }

    public static final long o(double d2) {
        return x((float) d2, 8589934592L);
    }

    public static final long p(double d2) {
        return x((float) d2, 4294967296L);
    }

    public static final long q(int i) {
        return x(i, 4294967296L);
    }

    public static final s76 r(Object obj, s76... s76VarArr) {
        Class[] clsArr;
        try {
            if (s76VarArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = s76VarArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = s76.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(s76VarArr, s76VarArr.length));
            if (invoke instanceof s76) {
                return (s76) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e2.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e2;
        }
    }

    public static final boolean s(float f2, float f3, yj yjVar) {
        float f4 = f2 - 0.005f;
        float f5 = f3 - 0.005f;
        float f6 = f2 + 0.005f;
        float f7 = f3 + 0.005f;
        yj a2 = dk.a();
        if (Float.isNaN(f4) || Float.isNaN(f5) || Float.isNaN(f6) || Float.isNaN(f7)) {
            dk.b("Invalid rectangle, make sure no value is NaN");
        }
        if (a2.b == null) {
            a2.b = new RectF();
        }
        RectF rectF = a2.b;
        rectF.getClass();
        rectF.set(f4, f5, f6, f7);
        Path path = a2.a;
        RectF rectF2 = a2.b;
        rectF2.getClass();
        path.addRect(rectF2, Path.Direction.CCW);
        yj a3 = dk.a();
        a3.j(yjVar, a2, 1);
        boolean isEmpty = a3.a.isEmpty();
        a3.l();
        a2.l();
        return !isEmpty;
    }

    public static final boolean t(float f2, float f3, long j, float f4, float f5) {
        float f6 = f2 - f4;
        float f7 = f3 - f5;
        float intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (((f7 * f7) / (intBitsToFloat2 * intBitsToFloat2)) + ((f6 * f6) / (intBitsToFloat * intBitsToFloat)) <= 1.0f) {
            return true;
        }
        return false;
    }

    public static final void u(cz7 cz7Var, String str) {
        cz7Var.getClass();
        str.getClass();
        cz7Var.a.c(new bg1(str));
    }

    public static final void v(cz7 cz7Var, String str) {
        cz7Var.getClass();
        str.getClass();
        cz7Var.a.c(new tfa(str));
    }

    public static final void w(cz7 cz7Var, int i) {
        cz7Var.getClass();
        cz7Var.a.c(new zgc(i));
    }

    public static final long x(float f2, long j) {
        long floatToRawIntBits = j | (Float.floatToRawIntBits(f2) & 4294967295L);
        f4c[] f4cVarArr = e4c.b;
        return floatToRawIntBits;
    }

    public static final long y(int i, int i2, boolean z, boolean z2) {
        long j;
        long j2 = i;
        long j3 = i2 & 2147483647L;
        if (z) {
            j = (j2 << 32) | Long.MIN_VALUE;
        } else {
            j = (j2 << 32) & Long.MAX_VALUE;
        }
        if (z2) {
            j3 |= 2147483648L;
        }
        return j3 | j;
    }

    public static final void z(aw7 aw7Var, aw7 aw7Var2, aw7 aw7Var3, yya yyaVar, String str, List list) {
        List<qd4> A;
        int i;
        List list2;
        int i2;
        List list3;
        String str2 = (String) aw7Var2.getValue();
        Integer num = (Integer) aw7Var3.getValue();
        jt0 jt0Var = new jt0(yyaVar, 3);
        if (c16.i((String) aw7Var.getValue(), str) && str2 != null) {
            Object obj = null;
            aw7Var2.setValue(null);
            aw7Var3.setValue(null);
            aw7Var.setValue(null);
            ld4 ld4Var = ld4.a;
            if (list != null && !list.isEmpty()) {
                jq6 t = tl1.t();
                t.add(new pd4(list.size()));
                int i3 = 0;
                for (Object obj2 : list) {
                    int i4 = i3 + 1;
                    if (i3 >= 0) {
                        bx8 bx8Var = (bx8) obj2;
                        t.add(new od4(list.subList(0, i4), list.size()));
                        i3 = i4;
                    } else {
                        tl1.M();
                        throw null;
                    }
                }
                t.add(new md4(list));
                A = tl1.r(t);
            } else {
                A = tl1.A(ld4Var);
            }
            switch (str2.hashCode()) {
                case -1118928849:
                    if (str2.equals("single_with_state")) {
                        for (qd4 qd4Var : A) {
                            if (qd4Var instanceof ld4) {
                                jt0Var.invoke(ld4Var);
                            } else if (!(qd4Var instanceof nd4)) {
                                if (qd4Var instanceof pd4) {
                                    jt0Var.invoke(new pd4(((pd4) qd4Var).a));
                                } else if (qd4Var instanceof od4) {
                                    od4 od4Var = (od4) qd4Var;
                                    bx8 bx8Var2 = (bx8) sl1.e0((List) od4Var.a);
                                    if (bx8Var2 != null) {
                                        jt0Var.invoke(new od4(bx8Var2, od4Var.b));
                                    }
                                } else if (qd4Var instanceof md4) {
                                    bx8 bx8Var3 = (bx8) sl1.e0((List) ((md4) qd4Var).a);
                                    if (bx8Var3 != null) {
                                        jt0Var.invoke(new md4(bx8Var3));
                                    } else {
                                        jt0Var.invoke(ld4Var);
                                    }
                                } else {
                                    xk5.o();
                                    return;
                                }
                            } else {
                                throw null;
                            }
                        }
                        return;
                    }
                    return;
                case -902265784:
                    if (str2.equals("single")) {
                        qd4 qd4Var2 = (qd4) sl1.j0(A);
                        if (qd4Var2 instanceof md4) {
                            obj = (bx8) sl1.e0((List) ((md4) qd4Var2).a);
                        }
                        jt0Var.invoke(obj);
                        return;
                    }
                    return;
                case -777457305:
                    if (str2.equals("multiple_with_state")) {
                        for (qd4 qd4Var3 : A) {
                            if (qd4Var3 instanceof ld4) {
                                jt0Var.invoke(ld4Var);
                            } else if (!(qd4Var3 instanceof nd4)) {
                                if (qd4Var3 instanceof pd4) {
                                    if (num != null) {
                                        i = Math.min(((pd4) qd4Var3).a, num.intValue());
                                    } else {
                                        i = ((pd4) qd4Var3).a;
                                    }
                                    jt0Var.invoke(new pd4(i));
                                } else if (qd4Var3 instanceof od4) {
                                    if (num != null) {
                                        list2 = sl1.v0((Iterable) ((od4) qd4Var3).a, num.intValue());
                                    } else {
                                        list2 = (List) ((od4) qd4Var3).a;
                                    }
                                    if (num != null) {
                                        i2 = Math.min(((od4) qd4Var3).b, num.intValue());
                                    } else {
                                        i2 = ((od4) qd4Var3).b;
                                    }
                                    jt0Var.invoke(new od4(list2, i2));
                                } else if (qd4Var3 instanceof md4) {
                                    if (num != null) {
                                        list3 = sl1.v0((Iterable) ((md4) qd4Var3).a, num.intValue());
                                    } else {
                                        list3 = (List) ((md4) qd4Var3).a;
                                    }
                                    jt0Var.invoke(new md4(list3));
                                } else {
                                    xk5.o();
                                    return;
                                }
                            } else {
                                throw null;
                            }
                        }
                        return;
                    }
                    return;
                case 653829648:
                    if (str2.equals("multiple")) {
                        qd4 qd4Var4 = (qd4) sl1.j0(A);
                        if (qd4Var4 instanceof md4) {
                            if (num != null) {
                                obj = sl1.v0((Iterable) ((md4) qd4Var4).a, num.intValue());
                            } else {
                                obj = (List) ((md4) qd4Var4).a;
                            }
                        }
                        jt0Var.invoke(obj);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }
}
