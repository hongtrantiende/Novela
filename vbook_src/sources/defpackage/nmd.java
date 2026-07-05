package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.util.SizeF;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nmd */
/* loaded from: classes.dex */
public abstract class nmd {
    public static final tu1 a = new tu1(new ov1(5), false, -40689037);
    public static final tu1 b = new tu1(new ov1(6), false, 791529368);
    public static final tu1 c = new tu1(new ov1(7), false, -1925574577);
    public static final mb4 d;
    public static final mb4[] e;

    static {
        mb4 mb4Var = new mb4("register", -1, 1L, true);
        d = mb4Var;
        e = new mb4[]{mb4Var, new mb4("unregister", -1, 1L, true)};
    }

    public static final gi1 A(Annotation annotation) {
        annotation.getClass();
        Class<? extends Annotation> annotationType = annotation.annotationType();
        annotationType.getClass();
        return cm9.a(annotationType);
    }

    public static final Class B(gi1 gi1Var) {
        gi1Var.getClass();
        Class c2 = gi1Var.c();
        c2.getClass();
        return c2;
    }

    public static final Class C(gi1 gi1Var) {
        gi1Var.getClass();
        Class c2 = gi1Var.c();
        if (c2.isPrimitive()) {
            String name = c2.getName();
            switch (name.hashCode()) {
                case -1325958191:
                    if (name.equals("double")) {
                        return Double.class;
                    }
                    break;
                case 104431:
                    if (name.equals("int")) {
                        return Integer.class;
                    }
                    break;
                case 3039496:
                    if (name.equals("byte")) {
                        return Byte.class;
                    }
                    break;
                case 3052374:
                    if (name.equals("char")) {
                        return Character.class;
                    }
                    break;
                case 3327612:
                    if (name.equals("long")) {
                        return Long.class;
                    }
                    break;
                case 3625364:
                    if (name.equals("void")) {
                        return Void.class;
                    }
                    break;
                case 64711720:
                    if (name.equals("boolean")) {
                        return Boolean.class;
                    }
                    break;
                case 97526364:
                    if (name.equals("float")) {
                        return Float.class;
                    }
                    break;
                case 109413500:
                    if (name.equals("short")) {
                        return Short.class;
                    }
                    break;
            }
        }
        return c2;
    }

    public static final Class D(gi1 gi1Var) {
        Class c2 = gi1Var.c();
        if (c2.isPrimitive()) {
            return c2;
        }
        String name = c2.getName();
        switch (name.hashCode()) {
            case -2056817302:
                if (!name.equals("java.lang.Integer")) {
                    return null;
                }
                return Integer.TYPE;
            case -527879800:
                if (name.equals("java.lang.Float")) {
                    return Float.TYPE;
                }
                return null;
            case -515992664:
                if (name.equals("java.lang.Short")) {
                    return Short.TYPE;
                }
                return null;
            case 155276373:
                if (name.equals("java.lang.Character")) {
                    return Character.TYPE;
                }
                return null;
            case 344809556:
                if (name.equals("java.lang.Boolean")) {
                    return Boolean.TYPE;
                }
                return null;
            case 398507100:
                if (name.equals("java.lang.Byte")) {
                    return Byte.TYPE;
                }
                return null;
            case 398795216:
                if (name.equals("java.lang.Long")) {
                    return Long.TYPE;
                }
                return null;
            case 399092968:
                if (name.equals("java.lang.Void")) {
                    return Void.TYPE;
                }
                return null;
            case 761287205:
                if (name.equals("java.lang.Double")) {
                    return Double.TYPE;
                }
                return null;
            default:
                return null;
        }
    }

    public static a49 E(String str, bp9 bp9Var, m26 m26Var, int i) {
        if ((i & 2) != 0) {
            bp9Var = null;
        }
        xt4 xt4Var = m26Var;
        if ((i & 4) != 0) {
            xt4Var = new rg8(15);
        }
        sw2 sw2Var = ab3.a;
        ru2 ru2Var = ru2.c;
        b9b b2 = rse.b();
        ru2Var.getClass();
        return new a49(str, bp9Var, xt4Var, k27.a(nq2.C(ru2Var, b2)));
    }

    public static final eo3 F(rv4 rv4Var) {
        Object[] objArr = new Object[0];
        yy9 yy9Var = eo3.f;
        Object P = rv4Var.P();
        if (P == ax1.a) {
            P = new qx6(24);
            rv4Var.o0(P);
        }
        return (eo3) zpe.m(objArr, yy9Var, (vt4) P, rv4Var, 384);
    }

    public static final ArrayList G(String str) {
        str.getClass();
        int i = 0;
        List<String> y0 = k4b.y0(str, new char[]{166, '\n', '\r'}, 0, 6);
        ArrayList arrayList = new ArrayList(tl1.s(y0, 10));
        for (String str2 : y0) {
            arrayList.add(k4b.N0(str2).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static boolean H(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj != null && obj.equals(obj2)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:274:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:402:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:407:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.vt4 r25, defpackage.nq7 r26, boolean r27, defpackage.wea r28, defpackage.wz0 r29, defpackage.a01 r30, defpackage.vs0 r31, defpackage.rh8 r32, defpackage.mu4 r33, defpackage.rv4 r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmd.a(vt4, nq7, boolean, wea, wz0, a01, vs0, rh8, mu4, rv4, int, int):void");
    }

    public static final void b(vt4 vt4Var, nq7 nq7Var, boolean z, wea weaVar, wz0 wz0Var, a01 a01Var, rh8 rh8Var, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        wea weaVar2;
        wz0 wz0Var2;
        a01 a01Var2;
        rh8 rh8Var2;
        wz0 wz0Var3;
        a01 a01Var3;
        int i3;
        th8 th8Var;
        boolean z4;
        wz0 wz0Var4;
        wea weaVar3;
        tu1 tu1Var = h9a.a;
        rv4Var.g0(-102343472);
        if (rv4Var.h(vt4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2 | 114894208;
        if ((306783379 & i4) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i4 & 1, z2)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i3 = i4 & (-523265);
                z4 = z;
                weaVar3 = weaVar;
                wz0Var4 = wz0Var;
                a01Var3 = a01Var;
                th8Var = rh8Var;
            } else {
                th8 th8Var2 = xz0.a;
                wea a2 = pfa.a(dae.a, rv4Var);
                pm1 pm1Var = ((h27) rv4Var.j(j27.a)).a;
                wz0 wz0Var5 = pm1Var.X;
                if (wz0Var5 == null) {
                    wz0Var3 = new wz0(rm1.d(pm1Var, cwe.d), rm1.d(pm1Var, cwe.h), zl1.b(0.12f, rm1.d(pm1Var, cwe.e)), zl1.b(0.38f, rm1.d(pm1Var, cwe.f)));
                    pm1Var.X = wz0Var3;
                } else {
                    wz0Var3 = wz0Var5;
                }
                a01Var3 = new a01(cwe.g);
                i3 = i4 & (-523265);
                th8Var = xz0.a;
                z4 = true;
                wz0Var4 = wz0Var3;
                weaVar3 = a2;
            }
            rv4Var.r();
            a(vt4Var, nq7Var, z4, weaVar3, wz0Var4, a01Var3, null, th8Var, tu1Var, rv4Var, i3 & 2147483646, 0);
            z3 = z4;
            weaVar2 = weaVar3;
            wz0Var2 = wz0Var4;
            a01Var2 = a01Var3;
            rh8Var2 = th8Var;
        } else {
            rv4Var.X();
            z3 = z;
            weaVar2 = weaVar;
            wz0Var2 = wz0Var;
            a01Var2 = a01Var;
            rh8Var2 = rh8Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new xa4(vt4Var, nq7Var, z3, weaVar2, wz0Var2, a01Var2, rh8Var2, i);
        }
    }

    /* JADX WARN: Type inference failed for: r1v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v33, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v34 */
    /* JADX WARN: Type inference failed for: r1v35, types: [java.util.ArrayList] */
    public static final void c(int i, long j, lu4 lu4Var, rv4 rv4Var, sna snaVar) {
        int i2;
        int i3;
        int i4;
        ug3 ug3Var;
        Collection collection;
        ?? A;
        Collection collection2;
        sna snaVar2 = snaVar;
        rv4Var.g0(1526030150);
        if (rv4Var.f(snaVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.e(j)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        Object obj = lu4Var;
        if (rv4Var.f(obj)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        if ((i7 & Token.EXPR_VOID) == 146 && rv4Var.E()) {
            rv4Var.X();
        } else {
            if (snaVar2 instanceof rna) {
                rv4Var.f0(-1173540356);
                rv4Var.q(false);
                collection2 = tl1.A(new ug3(j));
            } else if (snaVar2 instanceof qna) {
                rv4Var.f0(-1173538668);
                if (Build.VERSION.SDK_INT >= 31) {
                    rv4Var.f0(-2019914396);
                    Bundle bundle = (Bundle) rv4Var.j(cy1.a);
                    rv4Var.f0(-1173535336);
                    boolean e2 = rv4Var.e(j);
                    Object P = rv4Var.P();
                    if (e2 || P == ax1.a) {
                        P = new jna(j);
                        rv4Var.o0(P);
                    }
                    vt4 vt4Var = (vt4) P;
                    rv4Var.q(false);
                    ArrayList parcelableArrayList = bundle.getParcelableArrayList("appWidgetSizes");
                    if (parcelableArrayList != null && !parcelableArrayList.isEmpty()) {
                        A = new ArrayList(tl1.s(parcelableArrayList, 10));
                        int size = parcelableArrayList.size();
                        int i8 = 0;
                        while (i8 < size) {
                            Object obj2 = parcelableArrayList.get(i8);
                            i8++;
                            SizeF sizeF = (SizeF) obj2;
                            A.add(new ug3(ote.a(sizeF.getWidth(), sizeF.getHeight())));
                        }
                    } else {
                        int i9 = bundle.getInt("appWidgetMinHeight", 0);
                        int i10 = bundle.getInt("appWidgetMaxHeight", 0);
                        int i11 = bundle.getInt("appWidgetMinWidth", 0);
                        int i12 = bundle.getInt("appWidgetMaxWidth", 0);
                        if (i9 != 0 && i10 != 0 && i11 != 0 && i12 != 0) {
                            A = tl1.B(new ug3(ote.a(i11, i10)), new ug3(ote.a(i12, i9)));
                        } else {
                            A = tl1.A(vt4Var.invoke());
                        }
                    }
                    rv4Var.q(false);
                    collection = A;
                } else {
                    rv4Var.f0(-2019826759);
                    Bundle bundle2 = (Bundle) rv4Var.j(cy1.a);
                    int i13 = bundle2.getInt("appWidgetMinHeight", 0);
                    int i14 = bundle2.getInt("appWidgetMaxWidth", 0);
                    ug3 ug3Var2 = null;
                    if (i13 != 0 && i14 != 0) {
                        ug3Var = new ug3(ote.a(i14, i13));
                    } else {
                        ug3Var = null;
                    }
                    int i15 = bundle2.getInt("appWidgetMaxHeight", 0);
                    int i16 = bundle2.getInt("appWidgetMinWidth", 0);
                    if (i15 != 0 && i16 != 0) {
                        ug3Var2 = new ug3(ote.a(i16, i15));
                    }
                    ArrayList l0 = b00.l0(new ug3[]{ug3Var, ug3Var2});
                    boolean isEmpty = l0.isEmpty();
                    Collection collection3 = l0;
                    if (isEmpty) {
                        collection3 = tl1.A(new ug3(j));
                    }
                    rv4Var.q(false);
                    collection = collection3;
                }
                rv4Var.q(false);
                collection2 = collection;
            } else {
                rv4Var.f0(-1173645715);
                rv4Var.q(false);
                xk5.o();
                return;
            }
            List<ug3> C0 = sl1.C0(sl1.G0(collection2));
            ArrayList arrayList = new ArrayList(tl1.s(C0, 10));
            for (ug3 ug3Var3 : C0) {
                i(((i7 << 3) & Token.ASSIGN_MOD) | (i7 & 896), ug3Var3.a, obj, rv4Var, snaVar2);
                arrayList.add(pvc.a);
                obj = lu4Var;
                snaVar2 = snaVar;
            }
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ina(i, j, lu4Var, snaVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:181:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:301:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final boolean r28, final defpackage.xt4 r29, defpackage.nq7 r30, boolean r31, defpackage.xt4 r32, defpackage.wea r33, long r34, long r36, float r38, long r39, defpackage.lu4 r41, final defpackage.tu1 r42, defpackage.rv4 r43, final int r44, final int r45, final int r46) {
        /*
            Method dump skipped, instructions count: 766
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmd.d(boolean, xt4, nq7, boolean, xt4, wea, long, long, float, long, lu4, tu1, rv4, int, int, int):void");
    }

    public static final void e(final eo3 eo3Var, lu4 lu4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        eo3Var.getClass();
        lu4Var.getClass();
        rv4Var.g0(1784444376);
        if (rv4Var.f(eo3Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.h(lu4Var)) {
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
        if (rv4Var.U(i5 & 1, z)) {
            boolean booleanValue = ((Boolean) eo3Var.a.getValue()).booleanValue();
            nq7 x = mwe.x(kq7.a, 14);
            if ((i5 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new nf7(eo3Var, 0);
                rv4Var.o0(P);
            }
            xb.d(booleanValue, (xt4) P, jce.E(1443463172, new pf7(eo3Var, lu4Var), rv4Var), null, x, jce.E(767411745, new lu4() { // from class: qf7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    boolean z4;
                    y3b y3bVar;
                    boolean z5;
                    int i6 = r2;
                    lh9 lh9Var = ax1.a;
                    pvc pvcVar = pvc.a;
                    eo3 eo3Var2 = eo3Var;
                    switch (i6) {
                        case 0:
                            rv4 rv4Var2 = (rv4) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if ((intValue & 3) != 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (rv4Var2.U(intValue & 1, z3)) {
                                boolean f = rv4Var2.f(eo3Var2);
                                Object P2 = rv4Var2.P();
                                if (f || P2 == lh9Var) {
                                    P2 = new of7(eo3Var2, 1);
                                    rv4Var2.o0(P2);
                                }
                                nmd.j((vt4) P2, null, false, null, null, null, jye.a, rv4Var2, 805306368, 510);
                            } else {
                                rv4Var2.X();
                            }
                            return pvcVar;
                        case 1:
                            rv4 rv4Var3 = (rv4) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if ((intValue2 & 3) != 2) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (rv4Var3.U(intValue2 & 1, z4)) {
                                if (((Boolean) eo3Var2.e.getValue()).booleanValue()) {
                                    y3bVar = (y3b) v1b.v.getValue();
                                } else {
                                    y3bVar = (y3b) o2b.d0.getValue();
                                }
                                cvb.c(yqe.A(y3bVar, rv4Var3), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var3, 0, 0, 262142);
                            } else {
                                rv4Var3.X();
                            }
                            return pvcVar;
                        default:
                            rv4 rv4Var4 = (rv4) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            if ((intValue3 & 3) != 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (rv4Var4.U(intValue3 & 1, z5)) {
                                Object P3 = rv4Var4.P();
                                if (P3 == lh9Var) {
                                    P3 = s21.e(rv4Var4);
                                }
                                zm4 zm4Var = (zm4) P3;
                                Object P4 = rv4Var4.P();
                                if (P4 == lh9Var) {
                                    P4 = new sr3(zm4Var, null, 9);
                                    rv4Var4.o0(P4);
                                }
                                yte.g((lu4) P4, rv4Var4, zm4Var);
                                kj6 a2 = mj6.a(0, rv4Var4, 0, 3);
                                boolean f2 = rv4Var4.f(eo3Var2);
                                Object P5 = rv4Var4.P();
                                if (f2 || P5 == lh9Var) {
                                    P5 = new xd(eo3Var2, (m42) null, 3);
                                    rv4Var4.o0(P5);
                                }
                                vo9 B = vqe.B(a2, null, (nu4) P5, rv4Var4, 14);
                                kq7 kq7Var = kq7.a;
                                nq7 f3 = pna.f(kq7Var, 1.0f);
                                xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var4, 0);
                                int hashCode = Long.hashCode(rv4Var4.T);
                                xt8 l = rv4Var4.l();
                                nq7 p = lye.p(rv4Var4, f3);
                                rw1.k.getClass();
                                zx1 zx1Var = qw1.b;
                                rv4Var4.i0();
                                if (rv4Var4.S) {
                                    rv4Var4.k(zx1Var);
                                } else {
                                    rv4Var4.r0();
                                }
                                jce.F(qw1.f, rv4Var4, a3);
                                jce.F(qw1.e, rv4Var4, l);
                                jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode));
                                jce.C(qw1.h, rv4Var4);
                                jce.F(qw1.d, rv4Var4, p);
                                String str = (String) eo3Var2.b.getValue();
                                t86 t86Var = new t86(0, 7, Token.INC);
                                v72 v72Var = ((h27) rv4Var4.j(j27.a)).c.b;
                                nq7 n = mwe.n(zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2), zm4Var);
                                boolean f4 = rv4Var4.f(eo3Var2);
                                Object P6 = rv4Var4.P();
                                if (f4 || P6 == lh9Var) {
                                    P6 = new nf7(eo3Var2, 1);
                                    rv4Var4.o0(P6);
                                }
                                uwe.h(str, (xt4) P6, n, false, false, null, jye.b, null, null, null, false, null, t86Var, null, true, 0, 0, v72Var, null, rv4Var4, 1572864, 12779520, 6127544);
                                nq7 j = pna.j(hl5.f(kq7Var, 12.0f, rv4Var4, kq7Var, 1.0f), nae.e, 300.0f, 1);
                                th8 h = zbe.h(2, 8.0f);
                                boolean f5 = rv4Var4.f(eo3Var2) | rv4Var4.f(B);
                                Object P7 = rv4Var4.P();
                                if (f5 || P7 == lh9Var) {
                                    P7 = new j34(28, eo3Var2, B);
                                    rv4Var4.o0(P7);
                                }
                                jce.d(j, a2, h, false, null, null, null, false, null, (xt4) P7, rv4Var4, 390, 504);
                                boolean f6 = rv4Var4.f(eo3Var2);
                                Object P8 = rv4Var4.P();
                                if (f6 || P8 == lh9Var) {
                                    P8 = new of7(eo3Var2, 0);
                                    rv4Var4.o0(P8);
                                }
                                nmd.j((vt4) P8, zbe.A(kq7Var, 8.0f, nae.e, 2), false, null, null, null, jye.d, rv4Var4, 805306416, 508);
                                hl5.w(kq7Var, 12.0f, rv4Var4, true);
                            } else {
                                rv4Var4.X();
                            }
                            return pvcVar;
                    }
                }
            }, rv4Var), jce.E(-889594496, new lu4() { // from class: qf7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    boolean z4;
                    y3b y3bVar;
                    boolean z5;
                    int i6 = r2;
                    lh9 lh9Var = ax1.a;
                    pvc pvcVar = pvc.a;
                    eo3 eo3Var2 = eo3Var;
                    switch (i6) {
                        case 0:
                            rv4 rv4Var2 = (rv4) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if ((intValue & 3) != 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (rv4Var2.U(intValue & 1, z3)) {
                                boolean f = rv4Var2.f(eo3Var2);
                                Object P2 = rv4Var2.P();
                                if (f || P2 == lh9Var) {
                                    P2 = new of7(eo3Var2, 1);
                                    rv4Var2.o0(P2);
                                }
                                nmd.j((vt4) P2, null, false, null, null, null, jye.a, rv4Var2, 805306368, 510);
                            } else {
                                rv4Var2.X();
                            }
                            return pvcVar;
                        case 1:
                            rv4 rv4Var3 = (rv4) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if ((intValue2 & 3) != 2) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (rv4Var3.U(intValue2 & 1, z4)) {
                                if (((Boolean) eo3Var2.e.getValue()).booleanValue()) {
                                    y3bVar = (y3b) v1b.v.getValue();
                                } else {
                                    y3bVar = (y3b) o2b.d0.getValue();
                                }
                                cvb.c(yqe.A(y3bVar, rv4Var3), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var3, 0, 0, 262142);
                            } else {
                                rv4Var3.X();
                            }
                            return pvcVar;
                        default:
                            rv4 rv4Var4 = (rv4) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            if ((intValue3 & 3) != 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (rv4Var4.U(intValue3 & 1, z5)) {
                                Object P3 = rv4Var4.P();
                                if (P3 == lh9Var) {
                                    P3 = s21.e(rv4Var4);
                                }
                                zm4 zm4Var = (zm4) P3;
                                Object P4 = rv4Var4.P();
                                if (P4 == lh9Var) {
                                    P4 = new sr3(zm4Var, null, 9);
                                    rv4Var4.o0(P4);
                                }
                                yte.g((lu4) P4, rv4Var4, zm4Var);
                                kj6 a2 = mj6.a(0, rv4Var4, 0, 3);
                                boolean f2 = rv4Var4.f(eo3Var2);
                                Object P5 = rv4Var4.P();
                                if (f2 || P5 == lh9Var) {
                                    P5 = new xd(eo3Var2, (m42) null, 3);
                                    rv4Var4.o0(P5);
                                }
                                vo9 B = vqe.B(a2, null, (nu4) P5, rv4Var4, 14);
                                kq7 kq7Var = kq7.a;
                                nq7 f3 = pna.f(kq7Var, 1.0f);
                                xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var4, 0);
                                int hashCode = Long.hashCode(rv4Var4.T);
                                xt8 l = rv4Var4.l();
                                nq7 p = lye.p(rv4Var4, f3);
                                rw1.k.getClass();
                                zx1 zx1Var = qw1.b;
                                rv4Var4.i0();
                                if (rv4Var4.S) {
                                    rv4Var4.k(zx1Var);
                                } else {
                                    rv4Var4.r0();
                                }
                                jce.F(qw1.f, rv4Var4, a3);
                                jce.F(qw1.e, rv4Var4, l);
                                jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode));
                                jce.C(qw1.h, rv4Var4);
                                jce.F(qw1.d, rv4Var4, p);
                                String str = (String) eo3Var2.b.getValue();
                                t86 t86Var = new t86(0, 7, Token.INC);
                                v72 v72Var = ((h27) rv4Var4.j(j27.a)).c.b;
                                nq7 n = mwe.n(zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2), zm4Var);
                                boolean f4 = rv4Var4.f(eo3Var2);
                                Object P6 = rv4Var4.P();
                                if (f4 || P6 == lh9Var) {
                                    P6 = new nf7(eo3Var2, 1);
                                    rv4Var4.o0(P6);
                                }
                                uwe.h(str, (xt4) P6, n, false, false, null, jye.b, null, null, null, false, null, t86Var, null, true, 0, 0, v72Var, null, rv4Var4, 1572864, 12779520, 6127544);
                                nq7 j = pna.j(hl5.f(kq7Var, 12.0f, rv4Var4, kq7Var, 1.0f), nae.e, 300.0f, 1);
                                th8 h = zbe.h(2, 8.0f);
                                boolean f5 = rv4Var4.f(eo3Var2) | rv4Var4.f(B);
                                Object P7 = rv4Var4.P();
                                if (f5 || P7 == lh9Var) {
                                    P7 = new j34(28, eo3Var2, B);
                                    rv4Var4.o0(P7);
                                }
                                jce.d(j, a2, h, false, null, null, null, false, null, (xt4) P7, rv4Var4, 390, 504);
                                boolean f6 = rv4Var4.f(eo3Var2);
                                Object P8 = rv4Var4.P();
                                if (f6 || P8 == lh9Var) {
                                    P8 = new of7(eo3Var2, 0);
                                    rv4Var4.o0(P8);
                                }
                                nmd.j((vt4) P8, zbe.A(kq7Var, 8.0f, nae.e, 2), false, null, null, null, jye.d, rv4Var4, 805306416, 508);
                                hl5.w(kq7Var, 12.0f, rv4Var4, true);
                            } else {
                                rv4Var4.X();
                            }
                            return pvcVar;
                    }
                }
            }, rv4Var), null, 0L, 0L, nae.e, false, false, jce.E(1726515372, new lu4() { // from class: qf7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    boolean z4;
                    y3b y3bVar;
                    boolean z5;
                    int i6 = r2;
                    lh9 lh9Var = ax1.a;
                    pvc pvcVar = pvc.a;
                    eo3 eo3Var2 = eo3Var;
                    switch (i6) {
                        case 0:
                            rv4 rv4Var2 = (rv4) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if ((intValue & 3) != 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (rv4Var2.U(intValue & 1, z3)) {
                                boolean f = rv4Var2.f(eo3Var2);
                                Object P2 = rv4Var2.P();
                                if (f || P2 == lh9Var) {
                                    P2 = new of7(eo3Var2, 1);
                                    rv4Var2.o0(P2);
                                }
                                nmd.j((vt4) P2, null, false, null, null, null, jye.a, rv4Var2, 805306368, 510);
                            } else {
                                rv4Var2.X();
                            }
                            return pvcVar;
                        case 1:
                            rv4 rv4Var3 = (rv4) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if ((intValue2 & 3) != 2) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (rv4Var3.U(intValue2 & 1, z4)) {
                                if (((Boolean) eo3Var2.e.getValue()).booleanValue()) {
                                    y3bVar = (y3b) v1b.v.getValue();
                                } else {
                                    y3bVar = (y3b) o2b.d0.getValue();
                                }
                                cvb.c(yqe.A(y3bVar, rv4Var3), null, 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rv4Var3, 0, 0, 262142);
                            } else {
                                rv4Var3.X();
                            }
                            return pvcVar;
                        default:
                            rv4 rv4Var4 = (rv4) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            if ((intValue3 & 3) != 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (rv4Var4.U(intValue3 & 1, z5)) {
                                Object P3 = rv4Var4.P();
                                if (P3 == lh9Var) {
                                    P3 = s21.e(rv4Var4);
                                }
                                zm4 zm4Var = (zm4) P3;
                                Object P4 = rv4Var4.P();
                                if (P4 == lh9Var) {
                                    P4 = new sr3(zm4Var, null, 9);
                                    rv4Var4.o0(P4);
                                }
                                yte.g((lu4) P4, rv4Var4, zm4Var);
                                kj6 a2 = mj6.a(0, rv4Var4, 0, 3);
                                boolean f2 = rv4Var4.f(eo3Var2);
                                Object P5 = rv4Var4.P();
                                if (f2 || P5 == lh9Var) {
                                    P5 = new xd(eo3Var2, (m42) null, 3);
                                    rv4Var4.o0(P5);
                                }
                                vo9 B = vqe.B(a2, null, (nu4) P5, rv4Var4, 14);
                                kq7 kq7Var = kq7.a;
                                nq7 f3 = pna.f(kq7Var, 1.0f);
                                xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var4, 0);
                                int hashCode = Long.hashCode(rv4Var4.T);
                                xt8 l = rv4Var4.l();
                                nq7 p = lye.p(rv4Var4, f3);
                                rw1.k.getClass();
                                zx1 zx1Var = qw1.b;
                                rv4Var4.i0();
                                if (rv4Var4.S) {
                                    rv4Var4.k(zx1Var);
                                } else {
                                    rv4Var4.r0();
                                }
                                jce.F(qw1.f, rv4Var4, a3);
                                jce.F(qw1.e, rv4Var4, l);
                                jce.F(qw1.g, rv4Var4, Integer.valueOf(hashCode));
                                jce.C(qw1.h, rv4Var4);
                                jce.F(qw1.d, rv4Var4, p);
                                String str = (String) eo3Var2.b.getValue();
                                t86 t86Var = new t86(0, 7, Token.INC);
                                v72 v72Var = ((h27) rv4Var4.j(j27.a)).c.b;
                                nq7 n = mwe.n(zbe.A(pna.f(kq7Var, 1.0f), 8.0f, nae.e, 2), zm4Var);
                                boolean f4 = rv4Var4.f(eo3Var2);
                                Object P6 = rv4Var4.P();
                                if (f4 || P6 == lh9Var) {
                                    P6 = new nf7(eo3Var2, 1);
                                    rv4Var4.o0(P6);
                                }
                                uwe.h(str, (xt4) P6, n, false, false, null, jye.b, null, null, null, false, null, t86Var, null, true, 0, 0, v72Var, null, rv4Var4, 1572864, 12779520, 6127544);
                                nq7 j = pna.j(hl5.f(kq7Var, 12.0f, rv4Var4, kq7Var, 1.0f), nae.e, 300.0f, 1);
                                th8 h = zbe.h(2, 8.0f);
                                boolean f5 = rv4Var4.f(eo3Var2) | rv4Var4.f(B);
                                Object P7 = rv4Var4.P();
                                if (f5 || P7 == lh9Var) {
                                    P7 = new j34(28, eo3Var2, B);
                                    rv4Var4.o0(P7);
                                }
                                jce.d(j, a2, h, false, null, null, null, false, null, (xt4) P7, rv4Var4, 390, 504);
                                boolean f6 = rv4Var4.f(eo3Var2);
                                Object P8 = rv4Var4.P();
                                if (f6 || P8 == lh9Var) {
                                    P8 = new of7(eo3Var2, 0);
                                    rv4Var4.o0(P8);
                                }
                                nmd.j((vt4) P8, zbe.A(kq7Var, 8.0f, nae.e, 2), false, null, null, null, jye.d, rv4Var4, 805306416, 508);
                                hl5.w(kq7Var, 12.0f, rv4Var4, true);
                            } else {
                                rv4Var4.X();
                            }
                            return pvcVar;
                    }
                }
            }, rv4Var), rv4Var, 1769856, 8072);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new pf7(eo3Var, lu4Var, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:163:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:265:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(final boolean r21, final defpackage.xt4 r22, defpackage.nq7 r23, boolean r24, long r25, long r27, float r29, long r30, float r32, final defpackage.tu1 r33, defpackage.rv4 r34, final int r35, final int r36) {
        /*
            Method dump skipped, instructions count: 633
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmd.f(boolean, xt4, nq7, boolean, long, long, float, long, float, tu1, rv4, int, int):void");
    }

    public static final void g(vt4 vt4Var, nq7 nq7Var, boolean z, wea weaVar, wz0 wz0Var, vs0 vs0Var, rh8 rh8Var, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        wz0 wz0Var2;
        vs0 vs0Var2;
        th8 th8Var;
        wz0 wz0Var3;
        int i5;
        long b2;
        int i6;
        qm1 qm1Var = ube.j;
        rv4Var.g0(399974542);
        if (rv4Var.h(vt4Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2;
        if (rv4Var.g(z)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i8 = i7 | i3;
        if (rv4Var.f(weaVar)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i9 = i8 | i4 | 113975296;
        if ((306783379 & i9) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i9 & 1, z2)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i6 = i9 & (-3727361);
                wz0Var3 = wz0Var;
                vs0Var2 = vs0Var;
                th8Var = rh8Var;
            } else {
                th8 th8Var2 = xz0.a;
                pm1 pm1Var = ((h27) rv4Var.j(j27.a)).a;
                wz0Var3 = pm1Var.Y;
                if (wz0Var3 == null) {
                    long j = zl1.h;
                    i5 = -3727361;
                    wz0 wz0Var4 = new wz0(j, rm1.d(pm1Var, ube.i), j, zl1.b(ube.h, rm1.d(pm1Var, ube.g)));
                    pm1Var.Y = wz0Var4;
                    wz0Var3 = wz0Var4;
                } else {
                    i5 = -3727361;
                }
                float f = dae.b;
                if (z) {
                    rv4Var.e0(-112362814);
                    b2 = rm1.e(qm1Var, rv4Var);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(-112275208);
                    b2 = zl1.b(0.1f, rm1.e(qm1Var, rv4Var));
                    rv4Var.q(false);
                }
                vs0Var2 = new vs0(f, new esa(b2));
                i6 = i9 & i5;
                th8Var = xz0.a;
            }
            rv4Var.r();
            wz0 wz0Var5 = wz0Var3;
            a(vt4Var, nq7Var, z, weaVar, wz0Var5, null, vs0Var2, th8Var, tu1Var, rv4Var, i6 & 2147483646, 0);
            wz0Var2 = wz0Var5;
        } else {
            rv4Var.X();
            wz0Var2 = wz0Var;
            vs0Var2 = vs0Var;
            th8Var = rh8Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new va4(vt4Var, nq7Var, z, weaVar, wz0Var2, vs0Var2, th8Var, tu1Var, i);
        }
    }

    public static final void h(int i, long j, vt4 vt4Var, rv4 rv4Var, boolean z) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        float f;
        boolean z3;
        rv4Var.g0(-432413022);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (rv4Var.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if (rv4Var.g(z)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i7 = i6 | i4;
        boolean z4 = true;
        if ((i7 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            if (j != 16) {
                rv4Var.e0(-1409282350);
                if (z) {
                    f = 1.0f;
                } else {
                    f = nae.e;
                }
                yya b2 = nq.b(f, new arc(0, (mn3) null, 7), null, rv4Var, 48, 28);
                nq7 nq7Var = kq7.a;
                Object obj = ax1.a;
                if (z) {
                    rv4Var.e0(-1409110486);
                    if ((i7 & Token.ASSIGN_MOD) == 32) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    Object P = rv4Var.P();
                    if (z3 || P == obj) {
                        P = new ba0(4, vt4Var);
                        rv4Var.o0(P);
                    }
                    nq7 b3 = dab.b(nq7Var, vt4Var, (PointerInputEventHandler) P);
                    Object P2 = rv4Var.P();
                    if (P2 == obj) {
                        P2 = new si7(18);
                        rv4Var.o0(P2);
                    }
                    nq7Var = y7a.b(b3, (xt4) P2);
                    rv4Var.q(false);
                } else {
                    rv4Var.e0(-1408867136);
                    rv4Var.q(false);
                }
                nq7 a0 = pna.c.a0(nq7Var);
                if ((i7 & 14) != 4) {
                    z4 = false;
                }
                boolean f2 = rv4Var.f(b2) | z4;
                Object P3 = rv4Var.P();
                if (f2 || P3 == obj) {
                    P3 = new sk7(j, b2, 0);
                    rv4Var.o0(P3);
                }
                bce.a(a0, (xt4) P3, rv4Var, 0);
                rv4Var.q(false);
            } else {
                rv4Var.e0(-1408653856);
                rv4Var.q(false);
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new aa3(j, vt4Var, z, i);
        }
    }

    public static final void i(int i, long j, lu4 lu4Var, rv4 rv4Var, sna snaVar) {
        int i2;
        int i3;
        int i4;
        rv4Var.g0(-53921383);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if ((i & 48) == 0) {
            int i6 = i & 64;
            if (rv4Var.f(snaVar)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i5 |= i4;
        }
        if (rv4Var.f(lu4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        if (((i5 | i3) & Token.EXPR_VOID) == 146 && rv4Var.E()) {
            rv4Var.X();
        } else {
            pye.b(new i99[]{by1.a.a(new ug3(j))}, jce.v(rv4Var, -1209815847, new ina(lu4Var, j, snaVar)), rv4Var, 48);
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lna(i, j, lu4Var, snaVar);
        }
    }

    public static final void j(vt4 vt4Var, nq7 nq7Var, boolean z, wea weaVar, wz0 wz0Var, rh8 rh8Var, mu4 mu4Var, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        Object obj;
        boolean z2;
        nq7 nq7Var2;
        wea weaVar2;
        rh8 rh8Var2;
        wz0 wz0Var2;
        boolean z3;
        int i6;
        wz0 wz0Var3;
        wz0 wz0Var4;
        th8 th8Var;
        boolean z4;
        wea weaVar3;
        nq7 nq7Var3;
        int i7;
        int i8;
        int i9;
        rv4Var.g0(-1061374109);
        if ((i & 6) == 0) {
            if (rv4Var.h(vt4Var)) {
                i9 = 4;
            } else {
                i9 = 2;
            }
            i3 = i9 | i;
        } else {
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i3 |= i4;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (rv4Var.g(z)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            i3 |= 1024;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                obj = wz0Var;
                if (rv4Var.f(obj)) {
                    i8 = 16384;
                    i3 |= i8;
                }
            } else {
                obj = wz0Var;
            }
            i8 = 8192;
            i3 |= i8;
        } else {
            obj = wz0Var;
        }
        int i12 = i3 | 115015680;
        if ((805306368 & i) == 0) {
            if (rv4Var.h(mu4Var)) {
                i7 = 536870912;
            } else {
                i7 = 268435456;
            }
            i12 |= i7;
        }
        if ((306783379 & i12) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i12 & 1, z2)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                int i13 = i12 & (-7169);
                if ((i2 & 16) != 0) {
                    i13 = i12 & (-64513);
                }
                z4 = z;
                th8Var = rh8Var;
                i6 = i13;
                wz0Var4 = obj;
                nq7Var3 = nq7Var;
                weaVar3 = weaVar;
            } else {
                if (i10 != 0) {
                    nq7Var = kq7.a;
                }
                if (i11 != 0) {
                    z = true;
                }
                th8 th8Var2 = xz0.a;
                wea a2 = pfa.a(dae.a, rv4Var);
                int i14 = i12 & (-7169);
                if ((i2 & 16) != 0) {
                    wz0Var3 = xz0.c(((h27) rv4Var.j(j27.a)).a);
                    i6 = i12 & (-64513);
                } else {
                    i6 = i14;
                    wz0Var3 = obj;
                }
                wz0Var4 = wz0Var3;
                th8Var = xz0.b;
                z4 = z;
                weaVar3 = a2;
                nq7Var3 = nq7Var;
            }
            rv4Var.r();
            a(vt4Var, nq7Var3, z4, weaVar3, wz0Var4, null, null, th8Var, mu4Var, rv4Var, i6 & 2147483646, 0);
            wz0Var2 = wz0Var4;
            rh8Var2 = th8Var;
            weaVar2 = weaVar3;
            z3 = z4;
            nq7Var2 = nq7Var3;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            weaVar2 = weaVar;
            rh8Var2 = rh8Var;
            wz0Var2 = obj;
            z3 = z;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new e01(vt4Var, nq7Var2, z3, weaVar2, wz0Var2, rh8Var2, mu4Var, i, i2);
        }
    }

    public static final void k(int i, int i2, xt4 xt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i3;
        boolean z;
        boolean z2;
        boolean z3;
        int i4;
        int i5;
        int i6;
        int i7;
        xt4Var.getClass();
        rv4Var.g0(1752200449);
        if ((i2 & 6) == 0) {
            if (rv4Var.d(i)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i3 |= i6;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var.c(0.75f)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i3 |= i5;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        boolean z4 = false;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if ((i3 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i3 & 896) == 256) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = z2 | z3;
            if ((i3 & 7168) == 2048) {
                z4 = true;
            }
            boolean z6 = z5 | z4;
            Object P = rv4Var.P();
            if (z6 || P == ax1.a) {
                P = new al(i, xt4Var, 7);
                rv4Var.o0(P);
            }
            ej6.a(nq7Var, i, null, null, null, null, null, false, (xt4) P, rv4Var, ((i3 >> 3) & 14) | ((i3 << 3) & Token.ASSIGN_MOD), 508);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new wi9(i, nq7Var, xt4Var, i2, 2);
        }
    }

    public static final void l(long j, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(1600995213);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z2 = false;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if ((i3 & 14) == 4) {
                z2 = true;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new th(j, 21);
                rv4Var.o0(P);
            }
            bce.a(nq7Var, (xt4) P, rv4Var, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qh(j, nq7Var, i, 4);
        }
    }

    public static final void m(long j, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(-1893436530);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z2 = false;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if ((i3 & 14) == 4) {
                z2 = true;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new th(j, 26);
                rv4Var.o0(P);
            }
            bce.a(nq7Var, (xt4) P, rv4Var, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qh(j, nq7Var, i, 9);
        }
    }

    public static final void n(long j, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(-1092900977);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z2 = false;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if ((i3 & 14) == 4) {
                z2 = true;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new th(j, 23);
                rv4Var.o0(P);
            }
            bce.a(nq7Var, (xt4) P, rv4Var, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qh(j, nq7Var, i, 6);
        }
    }

    public static final void o(long j, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(-292365424);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z2 = false;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if ((i3 & 14) == 4) {
                z2 = true;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new th(j, 20);
                rv4Var.o0(P);
            }
            bce.a(nq7Var, (xt4) P, rv4Var, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qh(j, nq7Var, i, 3);
        }
    }

    public static final void p(long j, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(508170129);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z2 = false;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if ((i3 & 14) == 4) {
                z2 = true;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new th(j, 22);
                rv4Var.o0(P);
            }
            bce.a(nq7Var, (xt4) P, rv4Var, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qh(j, nq7Var, i, 5);
        }
    }

    public static final void q(long j, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(1308705682);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z2 = false;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if ((i3 & 14) == 4) {
                z2 = true;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new th(j, 19);
                rv4Var.o0(P);
            }
            bce.a(nq7Var, (xt4) P, rv4Var, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qh(j, nq7Var, i, 2);
        }
    }

    public static final void r(long j, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(2109241235);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z2 = false;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if ((i3 & 14) == 4) {
                z2 = true;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new th(j, 25);
                rv4Var.o0(P);
            }
            bce.a(nq7Var, (xt4) P, rv4Var, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qh(j, nq7Var, i, 8);
        }
    }

    public static final void s(long j, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(-1385190508);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        boolean z2 = false;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            if ((i3 & 14) == 4) {
                z2 = true;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new th(j, 24);
                rv4Var.o0(P);
            }
            bce.a(nq7Var, (xt4) P, rv4Var, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qh(j, nq7Var, i, 7);
        }
    }

    public static nq7 u(nq7 nq7Var, hy0 hy0Var) {
        return nq7Var.a0(new dg0(0L, hy0Var, lre.g, 1));
    }

    public static final nq7 v(nq7 nq7Var, long j, wea weaVar) {
        return nq7Var.a0(new dg0(j, null, weaVar, 2));
    }

    public static /* synthetic */ nq7 w(long j, nq7 nq7Var) {
        return v(nq7Var, j, lre.g);
    }

    /* JADX WARN: Removed duplicated region for block: B:386:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x047a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.lmd y(android.content.Context r32, defpackage.xy1 r33) {
        /*
            Method dump skipped, instructions count: 1298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmd.y(android.content.Context, xy1):lmd");
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0083, code lost:
        if (r1.b(r10, r0) == r5) goto L17;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0071 A[Catch: all -> 0x0035, TRY_LEAVE, TryCatch #0 {all -> 0x0035, blocks: (B:62:0x002f, B:74:0x0054, B:78:0x0069, B:80:0x0071, B:69:0x0045, B:73:0x0050), top: B:94:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0086  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:81:0x0083 -> B:63:0x0032). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(defpackage.tj4 r7, defpackage.ta1 r8, boolean r9, defpackage.m42 r10) {
        /*
            boolean r0 = r10 instanceof defpackage.yj4
            if (r0 == 0) goto L13
            r0 = r10
            yj4 r0 = (defpackage.yj4) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            yj4 r0 = new yj4
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.e
            int r1 = r0.f
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L49
            if (r1 == r3) goto L3d
            if (r1 != r2) goto L37
            boolean r9 = r0.d
            qy0 r7 = r0.c
            ta1 r8 = r0.b
            tj4 r1 = r0.a
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L35
        L32:
            r10 = r7
            r7 = r1
            goto L54
        L35:
            r7 = move-exception
            goto L8e
        L37:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            return r4
        L3d:
            boolean r9 = r0.d
            qy0 r7 = r0.c
            ta1 r8 = r0.b
            tj4 r1 = r0.a
            defpackage.hre.r(r10)     // Catch: java.lang.Throwable -> L35
            goto L69
        L49:
            defpackage.hre.r(r10)
            boolean r10 = r7 instanceof defpackage.l7c
            if (r10 != 0) goto L96
            qy0 r10 = r8.iterator()     // Catch: java.lang.Throwable -> L35
        L54:
            r0.a = r7     // Catch: java.lang.Throwable -> L35
            r0.b = r8     // Catch: java.lang.Throwable -> L35
            r0.c = r10     // Catch: java.lang.Throwable -> L35
            r0.d = r9     // Catch: java.lang.Throwable -> L35
            r0.f = r3     // Catch: java.lang.Throwable -> L35
            java.lang.Object r1 = r10.a(r0)     // Catch: java.lang.Throwable -> L35
            if (r1 != r5) goto L65
            goto L85
        L65:
            r6 = r1
            r1 = r7
            r7 = r10
            r10 = r6
        L69:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L86
            java.lang.Object r10 = r7.c()     // Catch: java.lang.Throwable -> L35
            r0.a = r1     // Catch: java.lang.Throwable -> L35
            r0.b = r8     // Catch: java.lang.Throwable -> L35
            r0.c = r7     // Catch: java.lang.Throwable -> L35
            r0.d = r9     // Catch: java.lang.Throwable -> L35
            r0.f = r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r10 = r1.b(r10, r0)     // Catch: java.lang.Throwable -> L35
            if (r10 != r5) goto L32
        L85:
            return r5
        L86:
            if (r9 == 0) goto L8b
            r8.cancel(r4)
        L8b:
            pvc r7 = defpackage.pvc.a
            return r7
        L8e:
            throw r7     // Catch: java.lang.Throwable -> L8f
        L8f:
            r10 = move-exception
            if (r9 == 0) goto L95
            defpackage.zpe.e(r8, r7)
        L95:
            throw r10
        L96:
            l7c r7 = (defpackage.l7c) r7
            java.lang.Throwable r7 = r7.a
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nmd.z(tj4, ta1, boolean, m42):java.lang.Object");
    }

    public abstract int t(int i, int i2, tc6 tc6Var, mw8 mw8Var, int i3);

    public Integer x(mw8 mw8Var) {
        return null;
    }
}
