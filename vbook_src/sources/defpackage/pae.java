package defpackage;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.util.Base64;
import android.util.Xml;
import android.view.KeyEvent;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: pae  reason: default package */
/* loaded from: classes.dex */
public abstract class pae {
    public static final double[][] a = {new double[]{0.401288d, 0.650173d, -0.051461d}, new double[]{-0.250268d, 1.204414d, 0.045854d}, new double[]{-0.002079d, 0.048952d, 0.953127d}};
    public static final tu1 b = new tu1(new ov1(26), false, -1795655464);
    public static final tu1 c = new tu1(new pv1(11), false, 1147121590);
    public static final tu1 d = new tu1(new pv1(12), false, -800314607);
    public static final tu1 e = new tu1(new pv1(13), false, 2115619208);
    public static final tu1 f = new tu1(new pv1(14), false, 2144781042);
    public static final tu1 g = new tu1(new pv1(15), false, -1005188787);
    public static final tu1 h = new tu1(new pv1(16), false, -1745367470);
    public static final tu1 i = new tu1(new pv1(17), false, -2088405061);
    public static final tu1 j = new tu1(new pv1(18), false, -1837598156);
    public static final float k = 80.0f;
    public static final blf l = new blf(1);
    public static final clf m = new clf(1);

    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v16, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v17 */
    public static final void a(List list, nq7 nq7Var, xt4 xt4Var, vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z;
        rv4 rv4Var2;
        pb2 pb2Var;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        aw7 aw7Var;
        ?? r0;
        aw7 aw7Var2;
        boolean z6;
        boolean z7;
        rv4 rv4Var3 = rv4Var;
        rv4Var3.g0(69106511);
        if (rv4Var3.f(list)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i7 = i2 | i3;
        if (rv4Var3.f(nq7Var)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i8 = i7 | i4;
        if (rv4Var3.h(xt4Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i9 = i8 | i5;
        if (rv4Var3.h(vt4Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i9 | i6;
        if ((i10 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var3.U(i10 & 1, z)) {
            sdd a2 = kv6.a(rv4Var3);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                bt5 bt5Var = (bt5) ((fdd) voe.z(cm9.a(bt5.class), a2.i(), null, pb2Var, o96.a(rv4Var3), null));
                aw7 z8 = jsc.z(bt5Var.e, rv4Var3);
                Object P = rv4Var3.P();
                lh9 lh9Var = ax1.a;
                if (P == lh9Var) {
                    P = yae.z(list);
                    rv4Var3.o0(P);
                }
                aw7 aw7Var3 = (aw7) P;
                xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var3, 0);
                int hashCode = Long.hashCode(rv4Var3.T);
                xt8 l2 = rv4Var3.l();
                nq7 p = lye.p(rv4Var3, nq7Var);
                rw1.k.getClass();
                zx1 zx1Var = qw1.b;
                rv4Var3.i0();
                if (rv4Var3.S) {
                    rv4Var3.k(zx1Var);
                } else {
                    rv4Var3.r0();
                }
                np npVar = qw1.f;
                jce.F(npVar, rv4Var3, a3);
                np npVar2 = qw1.e;
                jce.F(npVar2, rv4Var3, l2);
                Integer valueOf = Integer.valueOf(hashCode);
                np npVar3 = qw1.g;
                jce.F(npVar3, rv4Var3, valueOf);
                kg kgVar = qw1.h;
                jce.C(kgVar, rv4Var3);
                np npVar4 = qw1.d;
                jce.F(npVar4, rv4Var3, p);
                kq7 kq7Var = kq7.a;
                nq7 C = zbe.C(zbe.A(pna.f(kq7Var, 1.0f), 12.0f, nae.e, 2), 12.0f, 8.0f, nae.e, nae.e, 12);
                gv9 a4 = ev9.a(lz.a, kh5.G, rv4Var3, 48);
                int hashCode2 = Long.hashCode(rv4Var3.T);
                xt8 l3 = rv4Var3.l();
                nq7 p2 = lye.p(rv4Var3, C);
                rv4Var3.i0();
                if (rv4Var3.S) {
                    rv4Var3.k(zx1Var);
                } else {
                    rv4Var3.r0();
                }
                jce.F(npVar, rv4Var3, a4);
                jce.F(npVar2, rv4Var3, l3);
                s21.t(hashCode2, rv4Var3, npVar3, rv4Var3, kgVar);
                jce.F(npVar4, rv4Var3, p2);
                String A = yqe.A((y3b) x2b.c.getValue(), rv4Var3);
                tza tzaVar = j27.a;
                cvb.c(A, new we6(1.0f, true), ((h27) rv4Var3.j(tzaVar)).a.q, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var3.j(tzaVar)).b.h, rv4Var, 0, 0, 131064);
                mfb mfbVar = jk3.w;
                ar5 c2 = rp5.c((wk3) mfbVar.getValue(), rv4Var, 0);
                long j2 = ((h27) rv4Var.j(tzaVar)).a.q;
                nq7 k2 = tte.k(pna.n(kq7Var, 32.0f), uu9.a);
                int i11 = i10 & 7168;
                if (i11 == 2048) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                Object P2 = rv4Var.P();
                if (z2 || P2 == lh9Var) {
                    P2 = new hi7(5, vt4Var);
                    rv4Var.o0(P2);
                }
                nk5.a(c2, null, zbe.y(lbe.f(15, (vt4) P2, k2, null, false), 6.0f), j2, rv4Var, 48, 0);
                rs8.u(rv4Var, true, kq7Var, 8.0f, rv4Var);
                nq7 j3 = pna.j(kq7Var, nae.e, 400.0f, 1);
                if ((i10 & 14) != 4) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                boolean f2 = z3 | rv4Var.f(z8);
                if ((i10 & 896) == 256) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean z9 = z4 | f2;
                if (i11 == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                boolean z10 = z9 | z5;
                Object P3 = rv4Var.P();
                if (!z10 && P3 != lh9Var) {
                    r0 = 0;
                    aw7Var2 = z8;
                    aw7Var = aw7Var3;
                } else {
                    aw7Var = aw7Var3;
                    r0 = 0;
                    p6 p6Var = new p6((Object) list, (Object) xt4Var, (Object) vt4Var, aw7Var, z8, 13);
                    aw7Var2 = z8;
                    rv4Var.o0(p6Var);
                    P3 = p6Var;
                }
                aw7 aw7Var4 = aw7Var;
                jce.d(j3, null, null, false, null, null, null, false, null, (xt4) P3, rv4Var, 6, 510);
                rv4 rv4Var4 = rv4Var;
                if (!((et5) aw7Var2.getValue()).a.isEmpty()) {
                    rv4Var4.e0(2107960131);
                    eg0.f(pna.n(zbe.y(new l95(kh5.J), 24.0f), 32.0f), 0L, null, rv4Var4, 0, 6);
                    rv4Var4.q(r0);
                    z6 = true;
                } else if (!((et5) aw7Var2.getValue()).c.isEmpty() || !((et5) aw7Var2.getValue()).b.isEmpty()) {
                    z6 = true;
                    rv4Var4.e0(2108257018);
                    ar5 c3 = rp5.c((wk3) mfbVar.getValue(), rv4Var4, r0);
                    String A2 = yqe.A((y3b) f2b.q0.getValue(), rv4Var4);
                    nq7 f3 = pna.f(zbe.y(kq7Var, 24.0f), 1.0f);
                    if (i11 == 2048) {
                        z7 = true;
                    } else {
                        z7 = r0;
                    }
                    Object P4 = rv4Var4.P();
                    if (z7 || P4 == lh9Var) {
                        P4 = new hi7(6, vt4Var);
                        rv4Var4.o0(P4);
                    }
                    z1d.f(c3, A2, false, null, f3, null, null, null, (vt4) P4, rv4Var4, 24576, 236);
                    rv4Var4.q(r0);
                } else {
                    rv4Var4.e0(2108587602);
                    ar5 c4 = rp5.c((wk3) jk3.a.getValue(), rv4Var4, r0);
                    String B = yqe.B((y3b) s2b.F0.getValue(), new Object[]{Integer.valueOf(((List) aw7Var4.getValue()).size())}, rv4Var4);
                    z6 = true;
                    boolean z11 = !((List) aw7Var4.getValue()).isEmpty();
                    nq7 f4 = pna.f(zbe.y(kq7Var, 24.0f), 1.0f);
                    boolean f5 = rv4Var4.f(bt5Var);
                    Object P5 = rv4Var4.P();
                    if (f5 || P5 == lh9Var) {
                        P5 = new mf6(25, bt5Var, aw7Var4);
                        rv4Var4.o0(P5);
                    }
                    z1d.f(c4, B, z11, null, f4, null, null, null, (vt4) P5, rv4Var4, 24576, 232);
                    rv4Var4.q(r0);
                }
                rv4Var4.q(z6);
                rv4Var2 = rv4Var4;
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var3.X();
            rv4Var2 = rv4Var3;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new i31(list, nq7Var, xt4Var, vt4Var, i2, 29);
        }
    }

    public static final void b(at5 at5Var, xt4 xt4Var, rv4 rv4Var, int i2) {
        int i3;
        boolean z;
        at5Var.getClass();
        rv4Var.g0(691716004);
        if (rv4Var.h(xt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i4 = i2 | i3;
        if ((i4 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i4 & 1, z)) {
            boolean booleanValue = ((Boolean) at5Var.a.getValue()).booleanValue();
            nk0 nk0Var = kh5.e;
            long b2 = zl1.b(0.1f, zl1.b);
            eu3 g2 = zt3.g(null, 3);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new ww6(28);
                rv4Var.o0(P);
            }
            eu3 a2 = g2.a(zt3.t((xt4) P));
            lz3 i5 = zt3.i(null, 3);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new si7(0);
                rv4Var.o0(P2);
            }
            lz3 a3 = i5.a(zt3.x((xt4) P2));
            nq7 y = zbe.y(mwe.x(pna.u(kq7.a, nae.e, 400.0f, 1), 15), 24.0f);
            Object P3 = rv4Var.P();
            if (P3 == lh9Var) {
                P3 = new c07(at5Var, 1);
                rv4Var.o0(P3);
            }
            z87.a(booleanValue, (xt4) P3, a2, a3, nk0Var, b2, false, false, y, jce.E(-1759459834, new t81(26, at5Var, xt4Var), rv4Var), rv4Var, 818113920, 64);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sv4(at5Var, xt4Var, i2, 19);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(defpackage.y69 r4, defpackage.vt4 r5, defpackage.n42 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.w69
            if (r0 == 0) goto L13
            r0 = r6
            w69 r0 = (defpackage.w69) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            w69 r0 = new w69
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            vt4 r5 = r0.a
            defpackage.hre.r(r6)     // Catch: java.lang.Throwable -> L28
            goto L62
        L28:
            r4 = move-exception
            goto L68
        L2a:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L30:
            defpackage.hre.r(r6)
            d82 r6 = r0.getContext()
            r0f r1 = defpackage.r0f.I
            b82 r6 = r6.get(r1)
            if (r6 != r4) goto L6c
            r0.a = r5     // Catch: java.lang.Throwable -> L28
            r0.c = r3     // Catch: java.lang.Throwable -> L28
            f61 r6 = new f61     // Catch: java.lang.Throwable -> L28
            m42 r0 = defpackage.w92.t(r0)     // Catch: java.lang.Throwable -> L28
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L28
            r6.u()     // Catch: java.lang.Throwable -> L28
            tz6 r0 = new tz6     // Catch: java.lang.Throwable -> L28
            r0.<init>(r6, r3)     // Catch: java.lang.Throwable -> L28
            xy0 r4 = r4.f     // Catch: java.lang.Throwable -> L28
            r4.D(r0)     // Catch: java.lang.Throwable -> L28
            java.lang.Object r4 = r6.s()     // Catch: java.lang.Throwable -> L28
            n82 r6 = defpackage.n82.a
            if (r4 != r6) goto L62
            return r6
        L62:
            r5.invoke()
            pvc r4 = defpackage.pvc.a
            return r4
        L68:
            r5.invoke()
            throw r4
        L6c:
            java.lang.String r4 = "awaitClose() can only be invoked from the producer context"
            defpackage.vs.k(r4)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pae.c(y69, vt4, n42):java.lang.Object");
    }

    public static mg2 e(tp9 tp9Var, String str, zg9 zg9Var, int i2) {
        Map map = Collections.EMPTY_MAP;
        Uri y = voe.y(str, zg9Var.c);
        long j2 = zg9Var.a;
        long j3 = zg9Var.b;
        String a2 = tp9Var.a();
        if (a2 == null) {
            a2 = voe.y(((mi0) tp9Var.b.get(0)).a, zg9Var.c).toString();
        }
        String str2 = a2;
        wq9.z(y, "The uri must be set.");
        return new mg2(y, 1, null, rm9.C, j2, j3, str2, i2);
    }

    public static zqa f() {
        return (zqa) dra.b.get();
    }

    public static final int g(KeyEvent keyEvent) {
        int i2;
        int i3;
        boolean isAltPressed = keyEvent.isAltPressed();
        boolean isCtrlPressed = keyEvent.isCtrlPressed();
        boolean isMetaPressed = keyEvent.isMetaPressed();
        boolean isShiftPressed = keyEvent.isShiftPressed();
        int i4 = 0;
        if (isCtrlPressed) {
            i2 = 2;
        } else {
            i2 = 0;
        }
        int i5 = isAltPressed | i2;
        if (isMetaPressed) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        int i6 = i5 | i3;
        if (isShiftPressed) {
            i4 = 8;
        }
        return i6 | i4;
    }

    public static zqa h(zqa zqaVar) {
        if (zqaVar instanceof cnc) {
            cnc cncVar = (cnc) zqaVar;
            if (cncVar.t == hc2.i()) {
                cncVar.r = null;
                return zqaVar;
            }
        }
        if (zqaVar instanceof dnc) {
            dnc dncVar = (dnc) zqaVar;
            if (dncVar.i == hc2.i()) {
                dncVar.h = null;
                return zqaVar;
            }
        }
        zqa g2 = dra.g(zqaVar, null, false);
        g2.j();
        return g2;
    }

    public static Object i(gt0 gt0Var, vt4 vt4Var) {
        yv7 yv7Var;
        zqa cncVar;
        zqa zqaVar = (zqa) dra.b.get();
        if (zqaVar instanceof cnc) {
            cnc cncVar2 = (cnc) zqaVar;
            if (cncVar2.t == hc2.i()) {
                xt4 xt4Var = cncVar2.r;
                xt4 xt4Var2 = cncVar2.s;
                try {
                    ((cnc) zqaVar).r = dra.k(gt0Var, xt4Var, true);
                    ((cnc) zqaVar).s = xt4Var2;
                    return vt4Var.invoke();
                } finally {
                    cncVar2.r = xt4Var;
                    cncVar2.s = xt4Var2;
                }
            }
        }
        if (zqaVar != null && !(zqaVar instanceof yv7)) {
            cncVar = zqaVar.u(gt0Var);
        } else {
            if (zqaVar instanceof yv7) {
                yv7Var = (yv7) zqaVar;
            } else {
                yv7Var = null;
            }
            cncVar = new cnc(yv7Var, gt0Var, null, true, false);
        }
        try {
            zqa j2 = cncVar.j();
            Object invoke = vt4Var.invoke();
            zqa.q(j2);
            cncVar.c();
            return invoke;
        } catch (Throwable th) {
            cncVar.c();
            throw th;
        }
    }

    public static jp4 j(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        TypedArray typedArray;
        do {
            next = xmlResourceParser.next();
            i2 = 2;
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), ag9.b);
                int i8 = 0;
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(5);
                String string3 = obtainAttributes.getString(6);
                String string4 = obtainAttributes.getString(2);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int i9 = 3;
                int integer = obtainAttributes.getInteger(3, 1);
                int integer2 = obtainAttributes.getInteger(4, 500);
                String string5 = obtainAttributes.getString(7);
                obtainAttributes.recycle();
                if (string != null && string2 != null) {
                    List l2 = l(resources, resourceId);
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != i9) {
                        if (xmlResourceParser.getEventType() == i2) {
                            if (xmlResourceParser.getName().equals("fallback")) {
                                TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), ag9.d);
                                try {
                                    String string6 = obtainAttributes2.getString(i8);
                                    String string7 = obtainAttributes2.getString(1);
                                    i7 = integer;
                                    String string8 = obtainAttributes2.getString(i2);
                                    if (string6 != null) {
                                        while (xmlResourceParser.next() != i9) {
                                            o(xmlResourceParser);
                                        }
                                        try {
                                            typedArray = obtainAttributes2;
                                            i6 = i9;
                                            try {
                                                cp4 cp4Var = new cp4(string, string2, string6, l2, string7, string8);
                                                typedArray.recycle();
                                                arrayList.add(cp4Var);
                                            } catch (Throwable th) {
                                                th = th;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            typedArray = obtainAttributes2;
                                        }
                                    } else {
                                        typedArray = obtainAttributes2;
                                        throw new XmlPullParserException("query attribute must be set in fallback element");
                                    }
                                    th = th;
                                } catch (Throwable th3) {
                                    th = th3;
                                    typedArray = obtainAttributes2;
                                }
                                typedArray.recycle();
                                throw th;
                            }
                            i6 = i9;
                            i7 = integer;
                            o(xmlResourceParser);
                            i9 = i6;
                            integer = i7;
                            i2 = 2;
                            i8 = 0;
                        }
                    }
                    int i10 = integer;
                    if (!arrayList.isEmpty()) {
                        return new mp4(i10, integer2, string5, arrayList);
                    }
                    if (string3 != null) {
                        arrayList.add(new cp4(string, string2, string3, l2, null, null));
                        if (string4 != null) {
                            arrayList.add(new cp4(string, string2, string4, l2, null, null));
                        }
                        return new mp4(i10, integer2, string5, arrayList);
                    }
                    vs.m("The provider font XML requires query attribute or fallback children.");
                    return null;
                }
                ArrayList arrayList2 = new ArrayList();
                while (xmlResourceParser.next() != 3) {
                    if (xmlResourceParser.getEventType() == 2) {
                        if (xmlResourceParser.getName().equals("font")) {
                            TypedArray obtainAttributes3 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), ag9.c);
                            int i11 = 8;
                            if (!obtainAttributes3.hasValue(8)) {
                                i11 = 1;
                            }
                            int i12 = obtainAttributes3.getInt(i11, 400);
                            if (obtainAttributes3.hasValue(6)) {
                                i3 = 6;
                            } else {
                                i3 = 2;
                            }
                            if (1 == obtainAttributes3.getInt(i3, 0)) {
                                z = true;
                            } else {
                                z = false;
                            }
                            int i13 = 9;
                            if (!obtainAttributes3.hasValue(9)) {
                                i13 = 3;
                            }
                            if (obtainAttributes3.hasValue(7)) {
                                i4 = 7;
                            } else {
                                i4 = 4;
                            }
                            String string9 = obtainAttributes3.getString(i4);
                            int i14 = obtainAttributes3.getInt(i13, 0);
                            if (obtainAttributes3.hasValue(5)) {
                                i5 = 5;
                            } else {
                                i5 = 0;
                            }
                            int resourceId2 = obtainAttributes3.getResourceId(i5, 0);
                            String string10 = obtainAttributes3.getString(i5);
                            obtainAttributes3.recycle();
                            while (xmlResourceParser.next() != 3) {
                                o(xmlResourceParser);
                            }
                            arrayList2.add(new lp4(i12, i14, resourceId2, string10, string9, z));
                        } else {
                            o(xmlResourceParser);
                        }
                    }
                }
                if (arrayList2.isEmpty()) {
                    return null;
                }
                return new kp4((lp4[]) arrayList2.toArray(new lp4[0]));
            }
            o(xmlResourceParser);
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static y69 k(m82 m82Var, int i2, lu4 lu4Var, int i3) {
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        y69 y69Var = new y69(tc4.s(m82Var, gs3.a), xpe.a(i2, 4, py0.a));
        y69Var.r0(p82.a, y69Var, lu4Var);
        return y69Var;
    }

    public static List l(Resources resources, int i2) {
        if (i2 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i2);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (obtainTypedArray.getType(0) == 1) {
                for (int i3 = 0; i3 < obtainTypedArray.length(); i3++) {
                    int resourceId = obtainTypedArray.getResourceId(i3, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i2);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static long m(km8 km8Var, int i2, int i3) {
        km8Var.M(i2);
        if (km8Var.a() < 5) {
            return -9223372036854775807L;
        }
        int m2 = km8Var.m();
        if ((8388608 & m2) != 0 || ((2096896 & m2) >> 8) != i3 || (m2 & 32) == 0 || km8Var.z() < 7 || km8Var.a() < 7 || (km8Var.z() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        km8Var.k(bArr, 0, 6);
        return ((bArr[0] & 255) << 25) | ((bArr[1] & 255) << 17) | ((bArr[2] & 255) << 9) | ((bArr[3] & 255) << 1) | ((bArr[4] & 255) >> 7);
    }

    public static void n(zqa zqaVar, zqa zqaVar2, xt4 xt4Var) {
        if (zqaVar == zqaVar2) {
            if (zqaVar instanceof cnc) {
                ((cnc) zqaVar).r = xt4Var;
                return;
            } else if (zqaVar instanceof dnc) {
                ((dnc) zqaVar).h = xt4Var;
                return;
            } else {
                xk5.p(zqaVar, "Non-transparent snapshot was reused: ");
                return;
            }
        }
        zqaVar2.getClass();
        zqa.q(zqaVar);
        zqaVar2.c();
    }

    public static void o(XmlPullParser xmlPullParser) {
        int i2 = 1;
        while (i2 > 0) {
            int next = xmlPullParser.next();
            if (next != 2) {
                if (next == 3) {
                    i2--;
                }
            } else {
                i2++;
            }
        }
    }

    public static Object p(f31 f31Var, hq hqVar, d98 d98Var) {
        ly0 b2 = f31Var.f().b();
        d5a g0 = b2.g0(1);
        byte[] bArr = g0.a;
        int i2 = g0.c;
        ByteBuffer wrap = ByteBuffer.wrap(bArr, i2, bArr.length - i2);
        wrap.getClass();
        hqVar.invoke(wrap);
        int position = wrap.position() - i2;
        if (position == 1) {
            g0.c += position;
            b2.c += position;
        } else if (position >= 0 && position <= g0.a()) {
            if (position != 0) {
                g0.c += position;
                b2.c += position;
            } else if (zxe.q(g0)) {
                b2.Q();
            }
        } else {
            StringBuilder s = hl5.s("Invalid number of bytes written: ", ". Should be in 0..", position);
            s.append(g0.a());
            throw new IllegalStateException(s.toString().toString());
        }
        Object c2 = f31Var.c(d98Var);
        if (c2 == n82.a) {
            return c2;
        }
        return pvc.a;
    }

    public static final Object q(f31 f31Var, ByteBuffer byteBuffer, n42 n42Var) {
        zma f2 = f31Var.f();
        f2.getClass();
        byteBuffer.getClass();
        long j2 = f2.b().c;
        ly0 b2 = f2.b();
        b2.getClass();
        int remaining = byteBuffer.remaining();
        while (remaining > 0) {
            d5a g0 = b2.g0(1);
            byte[] bArr = g0.a;
            int i2 = g0.c;
            int min = Math.min(remaining, bArr.length - i2);
            byteBuffer.get(bArr, i2, min);
            if (min == 1) {
                g0.c += min;
                b2.c += min;
            } else if (min >= 0 && min <= g0.a()) {
                if (min != 0) {
                    g0.c += min;
                    b2.c += min;
                } else if (zxe.q(g0)) {
                    b2.Q();
                }
            } else {
                StringBuilder s = hl5.s("Invalid number of bytes written: ", ". Should be in 0..", min);
                s.append(g0.a());
                throw new IllegalStateException(s.toString().toString());
            }
            remaining -= min;
        }
        long j3 = f2.b().c;
        f2.C0();
        Object c2 = f31Var.c(n42Var);
        if (c2 == n82.a) {
            return c2;
        }
        return pvc.a;
    }

    public static int r(int i2) {
        if (i2 == 0) {
            return 1;
        }
        if (i2 == 1) {
            return 2;
        }
        if (i2 == 2) {
            return 3;
        }
        if (i2 == 3) {
            return 4;
        }
        if (i2 != 4) {
            return 0;
        }
        return 5;
    }

    public static dlf s(Set set) {
        dlf dlfVar = new dlf();
        dlfVar.d = m;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            sjf sjfVar = (sjf) it.next();
            uaf.D(sjfVar, "key");
            boolean z = sjfVar.c;
            HashMap hashMap = dlfVar.b;
            HashMap hashMap2 = dlfVar.a;
            if (z) {
                if (z) {
                    hashMap2.remove(sjfVar);
                    hashMap.put(sjfVar, dlf.f);
                } else {
                    vs.m("key must be repeating");
                    return null;
                }
            } else {
                hashMap.remove(sjfVar);
                hashMap2.put(sjfVar, dlf.e);
            }
        }
        return dlfVar;
    }
}
