package defpackage;

import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nqe  reason: default package */
/* loaded from: classes3.dex */
public abstract class nqe {
    public static final tu1 a = new tu1(new tx0(19), false, 1651398571);
    public static final tu1 b = new tu1(new tx0(20), false, -1205381726);
    public static final tu1 c = new tu1(new tx0(21), false, -956103325);
    public static final tu1 d = new tu1(new tx0(22), false, 1539996263);
    public static final tu1 e = new tu1(new tx0(23), false, -2144624610);
    public static final tu1 f = new tu1(new tx0(24), false, -578693135);
    public static final tu1 g = new tu1(new tx0(25), false, 1504792401);

    public static int A(int i) {
        return (int) (Integer.rotateLeft((int) (i * (-862048943)), 15) * 461845907);
    }

    public static int B(Object obj) {
        int hashCode;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return A(hashCode);
    }

    public static String C(String str, Object... objArr) {
        int length;
        int indexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (indexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, indexOf);
            sb.append(D(objArr[i]));
            i2 = indexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(D(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String D(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            String v = nk2.v(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(v), (Throwable) e2);
            String name2 = e2.getClass().getName();
            StringBuilder sb = new StringBuilder(v.length() + 8 + name2.length() + 1);
            nk2.C(sb, "<", v, " threw ", name2);
            sb.append(">");
            return sb.toString();
        }
    }

    public static final void a(final v43 v43Var, final rh8 rh8Var, final xt4 xt4Var, final lu4 lu4Var, final lu4 lu4Var2, final xt4 xt4Var2, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final xt4 xt4Var3, final xt4 xt4Var4, rv4 rv4Var, final int i, final int i2) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        Object obj;
        List list;
        Object obj2;
        aw7 aw7Var;
        aw7 aw7Var2;
        Object obj3;
        Boolean bool;
        ya9 ya9Var;
        boolean z3;
        Object obj4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        rv4Var.g0(800650478);
        int i15 = 2;
        if ((i & 6) == 0) {
            if (rv4Var.f(v43Var)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i3 = i14 | i;
        } else {
            i3 = i;
        }
        int i16 = 16;
        if ((i & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i3 |= i13;
        }
        int i17 = i & 384;
        Object obj5 = kq7.a;
        if (i17 == 0) {
            if (rv4Var.f(obj5)) {
                i12 = 256;
            } else {
                i12 = Token.CASE;
            }
            i3 |= i12;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i3 |= i11;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(lu4Var)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i3 |= i10;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(lu4Var2)) {
                i9 = 131072;
            } else {
                i9 = Parser.ARGC_LIMIT;
            }
            i3 |= i9;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var.h(vt4Var)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i3 |= i7;
        }
        if ((100663296 & i) == 0) {
            if (rv4Var.h(vt4Var2)) {
                i6 = 67108864;
            } else {
                i6 = 33554432;
            }
            i3 |= i6;
        }
        if ((i & 805306368) == 0) {
            if (rv4Var.h(vt4Var3)) {
                i5 = 536870912;
            } else {
                i5 = 268435456;
            }
            i3 |= i5;
        }
        if ((i2 & 6) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i15 = 4;
            }
            i4 = i2 | i15;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var.h(xt4Var4)) {
                i16 = 32;
            }
            i4 |= i16;
        }
        int i18 = i4;
        if ((306783379 & i3) == 306783378 && (i18 & 19) == 18) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var.U(i3 & 1, z)) {
            ya9 b2 = ra9.b(rv4Var);
            Object a2 = tg6.a(0, 3, rv4Var);
            Object[] objArr = new Object[0];
            Object P = rv4Var.P();
            Object obj6 = ax1.a;
            if (P == obj6) {
                P = new rj2(13);
                rv4Var.o0(P);
            }
            aw7 aw7Var3 = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
            Object[] objArr2 = new Object[0];
            Object P2 = rv4Var.P();
            if (P2 == obj6) {
                P2 = new rj2(14);
                rv4Var.o0(P2);
            }
            Object j = zpe.j(objArr2, (vt4) P2, rv4Var, 384);
            Object P3 = rv4Var.P();
            if (P3 == obj6) {
                P3 = yae.z(null);
                rv4Var.o0(P3);
            }
            final aw7 aw7Var4 = (aw7) P3;
            List list2 = v43Var.d;
            Boolean bool2 = (Boolean) aw7Var3.getValue();
            bool2.getClass();
            boolean f2 = rv4Var.f(j);
            int i19 = i3;
            if ((i19 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean f3 = f2 | z2 | rv4Var.f(aw7Var3);
            Object P4 = rv4Var.P();
            if (!f3 && P4 != obj6) {
                obj = obj5;
                list = list2;
                obj4 = P4;
                bool = bool2;
                obj2 = obj6;
                aw7Var = j;
                aw7Var2 = aw7Var3;
                obj3 = a2;
                ya9Var = b2;
                z3 = false;
            } else {
                obj = obj5;
                list = list2;
                obj2 = obj6;
                aw7Var = j;
                aw7Var2 = aw7Var3;
                obj3 = a2;
                bool = bool2;
                ya9Var = b2;
                z3 = false;
                Object p43Var = new p43(aw7Var, v43Var, aw7Var2, aw7Var4, null, 0);
                rv4Var.o0(p43Var);
                obj4 = p43Var;
            }
            yte.h(list, bool, (lu4) obj4, rv4Var);
            final aw7 aw7Var5 = aw7Var2;
            final k23 k23Var = v43Var.i;
            k23Var.getClass();
            float L0 = ((r13) rv4Var.j(dy1.h)).L0(200.0f);
            boolean f4 = rv4Var.f(obj3) | rv4Var.c(L0);
            if ((i18 & 14) == 4) {
                z3 = true;
            }
            boolean z4 = f4 | z3;
            Object P5 = rv4Var.P();
            if (z4 || P5 == obj2) {
                P5 = new r43(xt4Var3, obj3, L0, null, 0);
                rv4Var.o0(P5);
            }
            yte.g((lu4) P5, rv4Var, obj3);
            Object P6 = rv4Var.P();
            if (P6 == obj2) {
                P6 = new tra();
                rv4Var.o0(P6);
            }
            final tra traVar = (tra) P6;
            final qg6 qg6Var = obj3;
            final aw7 aw7Var6 = aw7Var;
            ra9.a(v43Var.a, vt4Var3, obj, ya9Var, null, jce.E(48016391, new b43(ya9Var, v43Var, rh8Var, 1), rv4Var), false, nae.e, jce.E(-1466686646, new mu4() { // from class: d43
                @Override // defpackage.mu4
                public final Object c(Object obj7, Object obj8, Object obj9) {
                    boolean z5;
                    rv4 rv4Var2 = (rv4) obj8;
                    int intValue = ((Integer) obj9).intValue();
                    ((ou0) obj7).getClass();
                    if ((intValue & 17) != 16) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z5)) {
                        b37 d2 = fu0.d(kh5.a, false);
                        int hashCode = Long.hashCode(rv4Var2.T);
                        xt8 l = rv4Var2.l();
                        nq7 p = lye.p(rv4Var2, kq7.a);
                        rw1.k.getClass();
                        zx1 zx1Var = qw1.b;
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(zx1Var);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(qw1.f, rv4Var2, d2);
                        jce.F(qw1.e, rv4Var2, l);
                        jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
                        jce.C(qw1.h, rv4Var2);
                        jce.F(qw1.d, rv4Var2, p);
                        bkd r = mwe.r(mwe.g(14, rv4Var2), zbe.j(nae.e, nae.e, nae.e, 120.0f, 7));
                        f25 f25Var = new f25(160.0f);
                        ze4 ze4Var = pna.c;
                        bkd r2 = mwe.r(r, zbe.j(nae.e, nae.e, 4.0f, nae.e, 11));
                        final rh8 rh8Var2 = rh8.this;
                        bkd r3 = mwe.r(r2, rh8Var2);
                        final k23 k23Var2 = k23Var;
                        boolean h = rv4Var2.h(k23Var2);
                        final v43 v43Var2 = v43Var;
                        boolean f5 = h | rv4Var2.f(v43Var2) | rv4Var2.f(rh8Var2);
                        final xt4 xt4Var5 = xt4Var4;
                        boolean f6 = f5 | rv4Var2.f(xt4Var5);
                        final lu4 lu4Var3 = lu4Var;
                        final xt4 xt4Var6 = xt4Var;
                        boolean f7 = f6 | rv4Var2.f(lu4Var3) | rv4Var2.f(xt4Var6);
                        final lu4 lu4Var4 = lu4Var2;
                        boolean f8 = f7 | rv4Var2.f(lu4Var4);
                        final aw7 aw7Var7 = aw7Var6;
                        boolean f9 = f8 | rv4Var2.f(aw7Var7);
                        final aw7 aw7Var8 = aw7Var5;
                        final vt4 vt4Var4 = vt4Var2;
                        final xt4 xt4Var7 = xt4Var2;
                        final vt4 vt4Var5 = vt4Var;
                        boolean f10 = f9 | rv4Var2.f(aw7Var8) | rv4Var2.f(vt4Var4) | rv4Var2.f(xt4Var7) | rv4Var2.f(vt4Var5);
                        Object P7 = rv4Var2.P();
                        if (f10 || P7 == ax1.a) {
                            final tra traVar2 = traVar;
                            final aw7 aw7Var9 = aw7Var4;
                            xt4 xt4Var8 = new xt4() { // from class: i43
                                @Override // defpackage.xt4
                                public final Object invoke(Object obj10) {
                                    vf6 vf6Var = (vf6) obj10;
                                    vf6Var.getClass();
                                    bq2 bq2Var = new bq2(19);
                                    k23 k23Var3 = k23.this;
                                    v43 v43Var3 = v43Var2;
                                    vf6.y(vf6Var, "header", bq2Var, new tu1(new j43(k23Var3, v43Var3, rh8Var2, xt4Var5, 0), true, 1911624076), 4);
                                    List list3 = k23Var3.p;
                                    List list4 = k23Var3.s;
                                    List list5 = k23Var3.q;
                                    List list6 = k23Var3.r;
                                    boolean isEmpty = list3.isEmpty();
                                    lu4 lu4Var5 = lu4Var3;
                                    if (!isEmpty) {
                                        bce.o(vf6Var, k23Var3.p, lu4Var5);
                                    }
                                    if (k23Var3.f.length() > 0) {
                                        vf6.y(vf6Var, "info", new bq2(20), new tu1(new k43(k23Var3, 0), true, 2079790814), 4);
                                    }
                                    if (k23Var3.g.length() > 0) {
                                        vf6.y(vf6Var, "introduction", new bq2(21), new tu1(new k43(k23Var3, 1), true, -1976310049), 4);
                                    }
                                    if (!list6.isEmpty()) {
                                        vf6Var.z(list6.size(), null, new aw0(3, new pg2(6), list6), new y7(19, list6), new tu1(new t43(0, list6), true, -1117249557));
                                    }
                                    if (!list5.isEmpty()) {
                                        String str = v43Var3.b;
                                        str.getClass();
                                        obe.A(vf6Var, str, list5, xt4Var6, lu4Var5);
                                    }
                                    if (!list4.isEmpty()) {
                                        String str2 = v43Var3.b;
                                        str2.getClass();
                                        fbe.H(vf6Var, str2, list4, new cd1(15), lu4Var4);
                                    }
                                    vf6.y(vf6Var, null, new bq2(22), rqe.f, 5);
                                    aw7 aw7Var10 = aw7Var7;
                                    aw7 aw7Var11 = aw7Var8;
                                    boolean booleanValue = ((Boolean) aw7Var11.getValue()).booleanValue();
                                    boolean z6 = v43Var3.f;
                                    boolean z7 = v43Var3.g;
                                    tra traVar3 = traVar2;
                                    oue.J(vf6Var, (jub) aw7Var10.getValue(), v43Var3.e, v43Var3.i.k, booleanValue, z6, (List) aw7Var9.getValue(), traVar3, z7, new f43(traVar3, 1), vt4Var4, new as1(aw7Var11, 12), xt4Var7, vt4Var5, new as1(aw7Var10, 13));
                                    return pvc.a;
                                }
                            };
                            rv4Var2.o0(xt4Var8);
                            P7 = xt4Var8;
                        }
                        pc2.d(f25Var, ze4Var, qg6Var, r, null, null, null, false, 0L, 0L, r3, nae.e, (xt4) P7, rv4Var2, 48, 0, 6128);
                        rv4Var2.q(true);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, ((i19 >> 24) & Token.ASSIGN_MOD) | 100859904 | (i19 & 896));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: e43
                @Override // defpackage.lu4
                public final Object invoke(Object obj7, Object obj8) {
                    ((Integer) obj8).getClass();
                    int p = xoe.p(i | 1);
                    int p2 = xoe.p(i2);
                    nqe.a(v43.this, rh8Var, xt4Var, lu4Var, lu4Var2, xt4Var2, vt4Var, vt4Var2, vt4Var3, xt4Var3, xt4Var4, (rv4) obj7, p, p2);
                    return pvc.a;
                }
            };
        }
    }

    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r15v8, types: [boolean, int] */
    public static final void b(v43 v43Var, final rh8 rh8Var, final nq7 nq7Var, final boolean z, final vt4 vt4Var, vt4 vt4Var2, final xt4 xt4Var, final lu4 lu4Var, final lu4 lu4Var2, vt4 vt4Var3, final xt4 xt4Var2, final vt4 vt4Var4, final vt4 vt4Var5, final vt4 vt4Var6, final xt4 xt4Var3, final xt4 xt4Var4, rv4 rv4Var, final int i) {
        int i2;
        Object obj;
        Object obj2;
        v43 v43Var2;
        vt4 vt4Var7;
        Object obj3;
        np npVar;
        np npVar2;
        kg kgVar;
        np npVar3;
        ?? r15;
        kq7 kq7Var;
        Object obj4;
        boolean z2;
        vt4 vt4Var8;
        boolean z3;
        Object obj5 = vt4Var3;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1946733707);
        if ((i & 6) == 0) {
            i2 = (rv4Var2.f(v43Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            obj = rh8Var;
            i2 |= rv4Var2.f(obj) ? 32 : 16;
        } else {
            obj = rh8Var;
        }
        if ((i & 384) == 0) {
            i2 |= rv4Var2.f(nq7Var) ? 256 : Token.CASE;
        }
        if ((i & 3072) == 0) {
            i2 |= rv4Var2.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= rv4Var2.h(vt4Var) ? 16384 : 8192;
        }
        int i3 = 196608 & i;
        int i4 = Parser.ARGC_LIMIT;
        if (i3 == 0) {
            i2 |= rv4Var2.h(vt4Var2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            obj2 = xt4Var;
            i2 |= rv4Var2.h(obj2) ? 1048576 : 524288;
        } else {
            obj2 = xt4Var;
        }
        if ((i & 12582912) == 0) {
            i2 |= rv4Var2.h(lu4Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= rv4Var2.h(lu4Var2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= rv4Var2.h(obj5) ? 536870912 : 268435456;
        }
        int i5 = i2;
        int i6 = 24576 | (rv4Var2.h(xt4Var2) ? 4 : 2) | (rv4Var2.h(vt4Var4) ? 32 : 16) | (rv4Var2.h(vt4Var5) ? 256 : Token.CASE) | (rv4Var2.h(vt4Var6) ? 2048 : 1024);
        if (rv4Var2.h(xt4Var4)) {
            i4 = 131072;
        }
        int i7 = i6 | i4;
        if (rv4Var2.U(i5 & 1, ((i5 & 306783379) == 306783378 && (74899 & i7) == 74898) ? false : true)) {
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar4 = qw1.f;
            jce.F(npVar4, rv4Var2, d2);
            np npVar5 = qw1.e;
            jce.F(npVar5, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar6 = qw1.g;
            jce.F(npVar6, rv4Var2, valueOf);
            kg kgVar2 = qw1.h;
            jce.C(kgVar2, rv4Var2);
            np npVar7 = qw1.d;
            jce.F(npVar7, rv4Var2, p);
            boolean a2 = ikd.a(rv4Var2);
            kq7 kq7Var2 = kq7.a;
            if (a2) {
                rv4Var2.e0(-1596453928);
                int i8 = i5 >> 9;
                int i9 = i7 << 18;
                npVar2 = npVar7;
                npVar = npVar5;
                a(v43Var, obj, obj2, lu4Var, lu4Var2, xt4Var2, vt4Var4, vt4Var5, vt4Var6, xt4Var3, xt4Var4, rv4Var2, (i8 & 458752) | (i5 & 14) | 384 | (i5 & Token.ASSIGN_MOD) | (i8 & 7168) | (i8 & 57344) | (i9 & 3670016) | (i9 & 29360128) | (i9 & 234881024) | (i9 & 1879048192), (i7 >> 12) & Token.ELSE);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
                v43Var2 = v43Var;
                kgVar = kgVar2;
                npVar3 = npVar4;
                kq7Var = kq7Var2;
                r15 = 0;
            } else {
                npVar = npVar5;
                npVar2 = npVar7;
                rv4Var2.e0(-1595849800);
                int i10 = i5 >> 9;
                int i11 = (i5 & 14) | 384 | (i5 & Token.ASSIGN_MOD) | (i10 & 7168) | (i10 & 57344) | (i10 & 458752);
                int i12 = i7 << 18;
                kgVar = kgVar2;
                npVar3 = npVar4;
                r15 = 0;
                d(v43Var, rh8Var, kq7Var2, xt4Var, lu4Var, lu4Var2, xt4Var2, vt4Var4, vt4Var5, vt4Var6, xt4Var3, xt4Var4, rv4Var2, i11 | (i12 & 3670016) | (i12 & 29360128) | (i12 & 234881024) | (i12 & 1879048192), (i7 >> 12) & Token.ELSE);
                v43Var2 = v43Var;
                kq7Var = kq7Var2;
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            }
            List list = v43Var2.d;
            boolean z4 = (list == null || !list.isEmpty()) ? r15 : true;
            if (!z) {
                rv4Var2.e0(-1595121641);
                nq7 u = mwe.u(pu0.a.a(kq7Var, kh5.E), r15, 14);
                xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, r15);
                int hashCode2 = Long.hashCode(rv4Var2.T);
                xt8 l2 = rv4Var2.l();
                nq7 p2 = lye.p(rv4Var2, u);
                rv4Var2.i0();
                if (rv4Var2.S) {
                    rv4Var2.k(zx1Var);
                } else {
                    rv4Var2.r0();
                }
                jce.F(npVar3, rv4Var2, a3);
                jce.F(npVar, rv4Var2, l2);
                s21.t(hashCode2, rv4Var2, npVar6, rv4Var2, kgVar);
                jce.F(npVar2, rv4Var2, p2);
                boolean z5 = z4;
                rte.e((list == null || list.isEmpty() || v43Var2.l) ? r15 : true, zbe.z(kq7Var, 12.0f, 6.0f), zt3.k(null, nae.e, 0L, 7), zt3.m(nae.e, 0L, 7), null, jce.E(2109960975, new oq3(3, vt4Var), rv4Var2), rv4Var2, 1600902, 16);
                vt4Var7 = vt4Var2;
                rte.e((list == null || list.isEmpty() || !v43Var2.m) ? false : true, zbe.z(kq7Var, 12.0f, 6.0f), zt3.k(null, nae.e, 0L, 7), zt3.m(nae.e, 0L, 7), null, jce.E(-191533960, new oq3(4, vt4Var7), rv4Var2), rv4Var2, 1600902, 16);
                if (!z5) {
                    rv4Var2.e0(-782911725);
                    vt4Var8 = vt4Var3;
                    n(((i5 >> 21) & 896) | 48, vt4Var8, rv4Var2, zbe.z(kq7Var, 12.0f, 6.0f), list == null);
                    z3 = false;
                    rv4Var2.q(false);
                } else {
                    vt4Var8 = vt4Var3;
                    z3 = false;
                    rv4Var2.e0(-782658021);
                    rv4Var2.q(false);
                }
                z2 = true;
                rv4Var2.q(true);
                rv4Var2.q(z3);
                obj4 = vt4Var8;
            } else {
                vt4Var7 = vt4Var2;
                obj4 = vt4Var3;
                z2 = true;
                rv4Var2.e0(-1593126605);
                rv4Var2.q(r15);
            }
            rv4Var2.q(z2);
            obj3 = obj4;
        } else {
            v43Var2 = v43Var;
            vt4Var7 = vt4Var2;
            rv4Var2.X();
            obj3 = obj5;
        }
        ek9 u2 = rv4Var2.u();
        if (u2 != null) {
            final vt4 vt4Var9 = obj3;
            final v43 v43Var3 = v43Var2;
            final vt4 vt4Var10 = vt4Var7;
            u2.d = new lu4() { // from class: a43
                @Override // defpackage.lu4
                public final Object invoke(Object obj6, Object obj7) {
                    ((Integer) obj7).getClass();
                    int p3 = xoe.p(i | 1);
                    nqe.b(v43.this, rh8Var, nq7Var, z, vt4Var, vt4Var10, xt4Var, lu4Var, lu4Var2, vt4Var9, xt4Var2, vt4Var4, vt4Var5, vt4Var6, xt4Var3, xt4Var4, (rv4) obj6, p3);
                    return pvc.a;
                }
            };
        }
    }

    public static final void c(int i, vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, nq7 nq7Var, String str) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        String str2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(948321846);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var2.f(str)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var2.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var2.h(vt4Var2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i9 & 1, z)) {
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            rv4Var2.e0(1173459173);
            if (k4b.j0(str)) {
                str2 = yqe.A((y3b) s2b.a.getValue(), rv4Var2);
            } else {
                str2 = str;
            }
            rv4Var2.q(false);
            cvb.c(str2, null, 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.f, rv4Var, 0, 0, 130046);
            rv4Var2 = rv4Var;
            kq7 kq7Var = kq7.a;
            xbe.i(rv4Var2, pna.h(kq7Var, 24.0f));
            z1d.f(rp5.c((wk3) ok3.g0.getValue(), rv4Var2, 0), yqe.A((y3b) b3b.B.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var, rv4Var2, (i9 << 18) & 234881024, 252);
            xbe.i(rv4Var2, pna.h(kq7Var, 12.0f));
            z1d.f(rp5.c((wk3) ok3.F.getValue(), rv4Var2, 0), yqe.A((y3b) b3b.e.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var2, rv4Var2, (i9 << 15) & 234881024, 252);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new qp1(nq7Var, str, vt4Var, vt4Var2, i);
        }
    }

    public static final void d(final v43 v43Var, final rh8 rh8Var, final nq7 nq7Var, final xt4 xt4Var, final lu4 lu4Var, final lu4 lu4Var2, final xt4 xt4Var2, final vt4 vt4Var, final vt4 vt4Var2, final vt4 vt4Var3, final xt4 xt4Var3, final xt4 xt4Var4, rv4 rv4Var, final int i, final int i2) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        lu4 p43Var;
        aw7 aw7Var;
        int i5;
        lh9 lh9Var;
        qg6 qg6Var;
        Boolean bool;
        aw7 aw7Var2;
        aw7 aw7Var3;
        boolean z3;
        float f2;
        float f3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        v43 v43Var2 = v43Var;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1998387926);
        int i16 = 2;
        if ((i & 6) == 0) {
            if (rv4Var2.f(v43Var2)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i3 = i15 | i;
        } else {
            i3 = i;
        }
        int i17 = 16;
        if ((i & 48) == 0) {
            if (rv4Var2.f(rh8Var)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i3 |= i14;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i13 = 256;
            } else {
                i13 = Token.CASE;
            }
            i3 |= i13;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i3 |= i12;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.h(lu4Var)) {
                i11 = 16384;
            } else {
                i11 = 8192;
            }
            i3 |= i11;
        }
        if ((196608 & i) == 0) {
            if (rv4Var2.h(lu4Var2)) {
                i10 = 131072;
            } else {
                i10 = Parser.ARGC_LIMIT;
            }
            i3 |= i10;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var2.h(xt4Var2)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i3 |= i9;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i3 |= i8;
        }
        if ((i & 100663296) == 0) {
            if (rv4Var2.h(vt4Var2)) {
                i7 = 67108864;
            } else {
                i7 = 33554432;
            }
            i3 |= i7;
        }
        if ((i & 805306368) == 0) {
            if (rv4Var2.h(vt4Var3)) {
                i6 = 536870912;
            } else {
                i6 = 268435456;
            }
            i3 |= i6;
        }
        int i18 = i3;
        if ((i2 & 6) == 0) {
            if (rv4Var2.h(xt4Var3)) {
                i16 = 4;
            }
            i4 = i2 | i16;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var2.h(xt4Var4)) {
                i17 = 32;
            }
            i4 |= i17;
        }
        int i19 = i4;
        if ((i18 & 306783379) == 306783378 && (i19 & 19) == 18) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var2.U(i18 & 1, z)) {
            ya9 b2 = ra9.b(rv4Var2);
            qg6 a2 = tg6.a(0, 3, rv4Var2);
            Object[] objArr = new Object[0];
            Object P = rv4Var2.P();
            lh9 lh9Var2 = ax1.a;
            if (P == lh9Var2) {
                P = new rj2(11);
                rv4Var2.o0(P);
            }
            aw7 aw7Var4 = (aw7) zpe.k(objArr, (vt4) P, rv4Var2, 48);
            Object[] objArr2 = new Object[0];
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var2) {
                P2 = new rj2(12);
                rv4Var2.o0(P2);
            }
            aw7 j = zpe.j(objArr2, (vt4) P2, rv4Var2, 384);
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var2) {
                P3 = yae.z(null);
                rv4Var2.o0(P3);
            }
            aw7 aw7Var5 = (aw7) P3;
            List list = v43Var2.d;
            Boolean bool2 = (Boolean) aw7Var4.getValue();
            bool2.getClass();
            boolean f4 = rv4Var2.f(j);
            int i20 = i18 & 14;
            if (i20 == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean f5 = f4 | z2 | rv4Var2.f(aw7Var4);
            Object P4 = rv4Var2.P();
            if (!f5 && P4 != lh9Var2) {
                aw7Var = aw7Var4;
                i5 = i20;
                lh9Var = lh9Var2;
                p43Var = P4;
                qg6Var = a2;
                aw7Var3 = aw7Var5;
                bool = bool2;
                aw7Var2 = j;
            } else {
                aw7Var = aw7Var4;
                i5 = i20;
                lh9Var = lh9Var2;
                qg6Var = a2;
                bool = bool2;
                p43Var = new p43(j, v43Var2, aw7Var, aw7Var5, null, 1);
                aw7Var2 = j;
                v43Var2 = v43Var2;
                aw7Var3 = aw7Var5;
                rv4Var2.o0(p43Var);
            }
            yte.h(list, bool, p43Var, rv4Var2);
            k23 k23Var = v43Var2.i;
            k23Var.getClass();
            float L0 = ((r13) rv4Var2.j(dy1.h)).L0(200.0f);
            boolean f6 = rv4Var2.f(qg6Var) | rv4Var2.c(L0);
            if ((i19 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z7 = f6 | z3;
            Object P5 = rv4Var2.P();
            if (z7 || P5 == lh9Var) {
                P5 = new r43(xt4Var3, qg6Var, L0, null, 1);
                rv4Var2.o0(P5);
            }
            yte.g((lu4) P5, rv4Var2, qg6Var);
            Object P6 = rv4Var2.P();
            if (P6 == lh9Var) {
                P6 = new tra();
                rv4Var2.o0(P6);
            }
            tra traVar = (tra) P6;
            gv9 a3 = ev9.a(lz.a, kh5.F, rv4Var2, 0);
            aw7 aw7Var6 = aw7Var;
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a3);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            th8 j2 = zbe.j(nae.e, nae.e, nae.e, 120.0f, 7);
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            qg6 qg6Var2 = qg6Var;
            if (1.0f > Float.MAX_VALUE) {
                f2 = Float.MAX_VALUE;
            } else {
                f2 = 1.0f;
            }
            aw7 aw7Var7 = aw7Var2;
            lh9 lh9Var3 = lh9Var;
            boolean z8 = false;
            ra9.a(v43Var2.a, vt4Var3, new we6(f2, true), b2, null, jce.E(-847727213, new b43(b2, v43Var2, rh8Var, 0), rv4Var2), false, nae.e, jce.E(-1850740842, new l68(j2, rh8Var, qg6Var2, k23Var, v43Var, xt4Var4, lu4Var, xt4Var, lu4Var2), rv4Var2), rv4Var2, ((i18 >> 24) & Token.ASSIGN_MOD) | 100859904);
            qg6 a4 = tg6.a(0, 3, rv4Var2);
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f3 = Float.MAX_VALUE;
            } else {
                f3 = 1.0f;
            }
            we6 we6Var = new we6(f3, true);
            f25 f25Var = new f25(160.0f);
            bkd r = mwe.r(mwe.r(j2, mwe.f(12, rv4Var2, false)), rh8Var);
            bkd r2 = mwe.r(mwe.r(mwe.r(j2, mwe.f(12, rv4Var2, false)), zbe.j(nae.e, nae.e, 4.0f, nae.e, 11)), rh8Var);
            boolean f7 = rv4Var2.f(aw7Var7);
            if (i5 == 4) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean f8 = f7 | z4 | rv4Var2.f(aw7Var6);
            if ((i18 & 234881024) == 67108864) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z9 = f8 | z5;
            if ((i18 & 3670016) == 1048576) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z10 = z9 | z6;
            if ((i18 & 29360128) == 8388608) {
                z8 = true;
            }
            boolean z11 = z10 | z8;
            Object P7 = rv4Var2.P();
            if (z11 || P7 == lh9Var3) {
                rg1 rg1Var = new rg1(v43Var, traVar, vt4Var2, xt4Var2, vt4Var, aw7Var7, aw7Var3, aw7Var6, 1);
                rv4Var2.o0(rg1Var);
                P7 = rg1Var;
            }
            pc2.d(f25Var, we6Var, a4, r, null, null, null, false, 0L, 0L, r2, nae.e, (xt4) P7, rv4Var, 0, 0, 6128);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new lu4() { // from class: c43
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p2 = xoe.p(i | 1);
                    int p3 = xoe.p(i2);
                    nqe.d(v43.this, rh8Var, nq7Var, xt4Var, lu4Var, lu4Var2, xt4Var2, vt4Var, vt4Var2, vt4Var3, xt4Var3, xt4Var4, (rv4) obj, p2, p3);
                    return pvc.a;
                }
            };
        }
    }

    public static final void e(String str, String str2, String str3, String str4, boolean z, String str5, String str6, rh8 rh8Var, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z2;
        rv4 rv4Var2;
        zx1 zx1Var;
        String str7 = str5;
        vt4 vt4Var2 = vt4Var;
        rv4Var.g0(-21612781);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i11 = i | i2;
        if (rv4Var.f(str2)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i12 = i11 | i3;
        if (rv4Var.f(str3)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i13 = i12 | i4;
        if (rv4Var.f(str4)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i14 = i13 | i5;
        if (rv4Var.g(z)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i15 = i14 | i6;
        if (rv4Var.f(str7)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i16 = i15 | i7;
        if (rv4Var.f(str6)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i17 = i16 | i8;
        if (rv4Var.f(rh8Var)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i18 = i17 | i9;
        if (rv4Var.h(vt4Var2)) {
            i10 = 536870912;
        } else {
            i10 = 268435456;
        }
        int i19 = i18 | i10;
        if ((306783379 & i19) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i19 & 1, z2)) {
            nk0 nk0Var = kh5.a;
            b37 d2 = fu0.d(nk0Var, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var2);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, d2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            u22 u22Var = r0f.d;
            pu0 pu0Var = pu0.a;
            nq7 b2 = pu0Var.b();
            if (rg3.a(12.0f, nae.e) > 0) {
                rg3.a(12.0f, nae.e);
            }
            nq7 k = axe.k(b2, new un0(0, true));
            int i20 = i19 & 14;
            int i21 = i19 >> 3;
            int i22 = i20 | 3072 | (i21 & Token.ASSIGN_MOD) | (i21 & 896);
            do5.d(str, str3, str4, u22Var, k, rv4Var, i22);
            fu0.a(nmd.u(pu0Var.b(), ox9.C(new yk8[]{new yk8(Float.valueOf((float) nae.e), new zl1(zl1.b(0.08f, r0f.y(rv4Var).p))), new yk8(Float.valueOf(0.45f), new zl1(zl1.b(0.28f, r0f.y(rv4Var).p))), new yk8(Float.valueOf(1.0f), new zl1(r0f.y(rv4Var).p))})), rv4Var, 0);
            kq7 kq7Var = kq7.a;
            nq7 a2 = pu0Var.a(pna.u(pna.f(zbe.B(zbe.x(kq7Var, rh8Var), 24.0f, 12.0f, 24.0f, 16.0f), 1.0f), nae.e, 720.0f, 1), kh5.b);
            xn1 a3 = wn1.a(lz.c, kh5.J, rv4Var, 48);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, a2);
            rv4Var.i0();
            if (rv4Var.S) {
                zx1Var = zx1Var2;
                rv4Var.k(zx1Var);
            } else {
                zx1Var = zx1Var2;
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a3);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            nq7 t = jsc.t(0.6666667f, pna.s(kq7Var, 156.0f), false);
            b37 d3 = fu0.d(nk0Var, false);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, t);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, d3);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            zx1 zx1Var3 = zx1Var;
            do5.d(str, str3, str4, u22Var, tte.k(pna.c, r0f.z(rv4Var).d), rv4Var, i22);
            rs8.u(rv4Var, true, kq7Var, 16.0f, rv4Var);
            oyb oybVar = r0f.A(rv4Var).e;
            cvb.c(str, pna.f(kq7Var, 1.0f), 0L, new qa0(zr1.q(20), zr1.q(32), zr1.p(0.25d)), zr1.q(32), null, null, null, 0L, null, new tlb(3), zr1.o(1.2d), 0, false, 3, 0, null, oybVar, rv4Var, i20 | 24624, 24624, 111588);
            rv4 rv4Var3 = rv4Var;
            xbe.i(rv4Var3, pna.h(kq7Var, 10.0f));
            if (str2.length() > 0) {
                rv4Var3.e0(-2089587302);
                f(str2, null, 0L, 0L, rqe.g, rv4Var3, (i21 & 14) | 24576, 14);
                rv4Var3 = rv4Var3;
                rv4Var3.q(false);
            } else {
                rv4Var3.e0(-2089132749);
                rv4Var3.q(false);
            }
            nq7 f2 = hl5.f(kq7Var, 10.0f, rv4Var3, kq7Var, 1.0f);
            gv9 a4 = ev9.a(lz.e, kh5.G, rv4Var3, 54);
            int hashCode4 = Long.hashCode(rv4Var3.T);
            xt8 l4 = rv4Var3.l();
            nq7 p4 = lye.p(rv4Var3, f2);
            rv4Var3.i0();
            if (rv4Var3.S) {
                rv4Var3.k(zx1Var3);
            } else {
                rv4Var3.r0();
            }
            jce.F(npVar, rv4Var3, a4);
            jce.F(npVar2, rv4Var3, l4);
            s21.t(hashCode4, rv4Var3, npVar3, rv4Var3, kgVar);
            vt4Var2 = vt4Var;
            str7 = str5;
            rv4 rv4Var4 = rv4Var3;
            f(str6, q1d.t(1, vt4Var2, rv4Var3, s21.f(rv4Var3, p4, npVar4, 1.0f, false), false), 0L, 0L, jce.E(1821217865, new jd1(str7, 5), rv4Var3), rv4Var4, ((i19 >> 18) & 14) | 24576, 12);
            rv4Var2 = rv4Var4;
            if (z) {
                rs8.s(rv4Var2, 398041660, kq7Var, 8.0f, rv4Var2);
                String upperCase = yqe.A((y3b) b3b.b.getValue(), rv4Var2).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                f(upperCase, null, r0f.y(rv4Var2).a, r0f.y(rv4Var2).b, null, rv4Var2, 0, 18);
                rv4Var2 = rv4Var2;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(398398191);
                rv4Var2.q(false);
            }
            hl5.v(rv4Var2, true, true, true);
        } else {
            rv4Var2 = rv4Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new od1(str, str2, str3, str4, z, str7, str6, rh8Var, nq7Var, vt4Var2, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void f(java.lang.String r32, defpackage.nq7 r33, long r34, long r36, defpackage.lu4 r38, defpackage.rv4 r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 544
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqe.f(java.lang.String, nq7, long, long, lu4, rv4, int, int):void");
    }

    public static final void g(boolean z, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        rv4Var.g0(924017018);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.h(vt4Var3)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(vt4Var4)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i9 & 1, z2)) {
            iue.e(z, null, 0L, null, nae.e, new th8(12.0f, 12.0f, 12.0f, 12.0f), vt4Var4, jce.E(-1865974394, new y33(vt4Var2, vt4Var, vt4Var3, 0), rv4Var), rv4Var, (i9 & 14) | 12779520 | ((i9 << 6) & 3670016), 30);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z33(z, vt4Var, vt4Var2, vt4Var3, vt4Var4, i, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0427  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0434  */
    /* JADX WARN: Removed duplicated region for block: B:188:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00f3  */
    /* JADX WARN: Type inference failed for: r11v8, types: [int] */
    /* JADX WARN: Type inference failed for: r13v10, types: [int] */
    /* JADX WARN: Type inference failed for: r33v0, types: [rv4] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(final java.lang.String r28, java.lang.String r29, final defpackage.cz7 r30, boolean r31, defpackage.vt4 r32, defpackage.rv4 r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 1093
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqe.h(java.lang.String, java.lang.String, cz7, boolean, vt4, rv4, int, int):void");
    }

    public static final void i(nq7 nq7Var, tu1 tu1Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(-1540139328);
        if ((i & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            npe.f(zbe.A(pna.f(nq7Var, 1.0f), 16.0f, nae.e, 2), null, tu1Var, rv4Var, 384);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new a62(nq7Var, tu1Var, i, 1);
        }
    }

    public static final void j(String str, nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-93941538);
        if (rv4Var2.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i3 & 1, z)) {
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            String A = yqe.A((y3b) x2b.k.getValue(), rv4Var2);
            tza tzaVar = j27.a;
            cvb.c(A, null, ((h27) rv4Var2.j(tzaVar)).a.a, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(tzaVar)).b.g, rv4Var, 0, 0, 131066);
            rv4Var2 = rv4Var;
            xbe.i(rv4Var2, pna.h(kq7.a, 16.0f));
            dye.b(null, jce.E(-174089609, new jd1(str, 4), rv4Var2), rv4Var2, 48, 1);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new o7(str, nq7Var, i, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void k(int r33, int r34, int r35, defpackage.rv4 r36, defpackage.nq7 r37, java.lang.String r38) {
        /*
            Method dump skipped, instructions count: 351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqe.k(int, int, int, rv4, nq7, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x03c1  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0408  */
    /* JADX WARN: Type inference failed for: r0v18, types: [xg6, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(final defpackage.nq7 r38, defpackage.kj6 r39, final defpackage.rh8 r40, final boolean r41, final boolean r42, final defpackage.li4 r43, final boolean r44, final defpackage.wi r45, defpackage.lk0 r46, defpackage.jz r47, defpackage.mk0 r48, defpackage.fz r49, final defpackage.xt4 r50, defpackage.rv4 r51, final int r52, final int r53, final int r54) {
        /*
            Method dump skipped, instructions count: 1166
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nqe.l(nq7, kj6, rh8, boolean, boolean, li4, boolean, wi, lk0, jz, mk0, fz, xt4, rv4, int, int, int):void");
    }

    public static final void m(final int i, int i2, long j, long j2, mu4 mu4Var, rv4 rv4Var, nq7 nq7Var) {
        int i3;
        boolean z;
        long j3;
        long j4;
        int i4;
        final long j5;
        final long b2;
        int i5;
        int i6;
        int i7;
        rv4Var.g0(-849216856);
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
            i3 |= 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= Token.CASE;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var.h(mu4Var)) {
                i6 = 2048;
            } else {
                i6 = 1024;
            }
            i3 |= i6;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 16384;
            } else {
                i5 = 8192;
            }
            i3 |= i5;
        }
        boolean z2 = false;
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            rv4Var.Z();
            if ((i2 & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                i4 = i3 & (-1009);
                j5 = j;
                b2 = j2;
            } else {
                tza tzaVar = j27.a;
                i4 = i3 & (-1009);
                j5 = ((h27) rv4Var.j(tzaVar)).a.a;
                b2 = zl1.b(0.2f, ((h27) rv4Var.j(tzaVar)).a.a);
            }
            rv4Var.r();
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            ze4 ze4Var = pna.c;
            boolean e2 = rv4Var.e(b2) | rv4Var.e(j5);
            if ((i4 & 14) == 4) {
                z2 = true;
            }
            boolean z3 = e2 | z2;
            Object P = rv4Var.P();
            if (z3 || P == ax1.a) {
                xt4 xt4Var = new xt4() { // from class: h79
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj) {
                        ak3 ak3Var = (ak3) obj;
                        ak3Var.getClass();
                        ak3.R0(ak3Var, b2, 0L, ak3Var.b(), nae.e, null, 0, Token.FUNCTION);
                        ak3.R0(ak3Var, j5, 0L, (Float.floatToRawIntBits((Float.intBitsToFloat((int) (ak3Var.b() >> 32)) * i) / 100.0f) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (ak3Var.b() & 4294967295L))) & 4294967295L), nae.e, null, 0, Token.FUNCTION);
                        return pvc.a;
                    }
                };
                rv4Var.o0(xt4Var);
                P = xt4Var;
            }
            bce.a(ze4Var, (xt4) P, rv4Var, 6);
            mu4Var.c(pu0.a, rv4Var, Integer.valueOf(((i4 >> 6) & Token.ASSIGN_MOD) | 6));
            rv4Var.q(true);
            j4 = b2;
            j3 = j5;
        } else {
            rv4Var.X();
            j3 = j;
            j4 = j2;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new vg0(i, j3, j4, mu4Var, nq7Var, i2);
        }
    }

    public static final void n(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, boolean z) {
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(746248112);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(nq7Var)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(vt4Var)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        if ((i2 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            if ((i2 & 14) == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if ((i2 & 896) == 256) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z5 = z3 | z4;
            Object P = rv4Var.P();
            if (z5 || P == ax1.a) {
                P = new d42(1, vt4Var, z);
                rv4Var.o0(P);
            }
            wq9.c((vt4) P, nq7Var, null, null, 0L, 0L, null, jce.E(600706163, new nd1(z, 2, (byte) 0), rv4Var), rv4Var, (i2 & Token.ASSIGN_MOD) | 100663296, 252);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new am(z, nq7Var, vt4Var, i, 3);
        }
    }

    public static final void o(mo9 mo9Var, Object obj, nq7 nq7Var, boolean z, boolean z2, tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        mo9Var.getClass();
        obj.getClass();
        rv4Var.g0(1129341741);
        if ((i & 6) == 0) {
            if (rv4Var.f(mo9Var)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.h(obj)) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            z3 = z;
            if (rv4Var.g(z3)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        } else {
            z3 = z;
        }
        if ((i & 24576) == 0) {
            z4 = z2;
            if (rv4Var.g(z4)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        } else {
            z4 = z2;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(tu1Var)) {
                i3 = 131072;
            } else {
                i3 = Parser.ARGC_LIMIT;
            }
            i2 |= i3;
        }
        if ((74899 & i2) == 74898 && rv4Var.E()) {
            rv4Var.X();
        } else {
            rv4Var.e0(-1931603123);
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(new y78(0L));
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            rv4Var.q(false);
            rv4Var.e0(-1931600257);
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = new jc(aw7Var, 29);
                rv4Var.o0(P2);
            }
            rv4Var.q(false);
            nq7 y = obe.y(nq7Var, (xt4) P2);
            b37 d2 = fu0.d(kh5.a, false);
            int e2 = p17.e(rv4Var);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, y);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l);
            np npVar = qw1.g;
            if (rv4Var.S || !c16.i(rv4Var.P(), Integer.valueOf(e2))) {
                rv4Var.o0(Integer.valueOf(e2));
                rv4Var.b(Integer.valueOf(e2), npVar);
            }
            jce.F(qw1.d, rv4Var, p);
            rv4Var.e0(872013070);
            int i9 = i2 & 14;
            boolean z7 = true;
            if (i9 == 4) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean f2 = z5 | rv4Var.f(obj);
            Object P3 = rv4Var.P();
            if (f2 || P3 == lh9Var) {
                P3 = new do9(mo9Var, obj, new ik(aw7Var, 22));
                rv4Var.o0(P3);
            }
            rv4Var.q(false);
            tu1Var.h((do9) P3, Boolean.valueOf(z4), rv4Var, Integer.valueOf((i2 >> 9) & 1008));
            rv4Var.q(true);
            HashSet hashSet = mo9Var.r;
            Boolean valueOf = Boolean.valueOf(z3);
            rv4Var.e0(-1931586729);
            if ((i2 & 7168) == 2048) {
                z6 = true;
            } else {
                z6 = false;
            }
            if (i9 != 4) {
                z7 = false;
            }
            boolean h = z6 | z7 | rv4Var.h(obj);
            Object P4 = rv4Var.P();
            if (h || P4 == lh9Var) {
                er0 er0Var = new er0(6, (m42) null, mo9Var, obj, z3);
                rv4Var.o0(er0Var);
                P4 = er0Var;
            }
            rv4Var.q(false);
            yte.h(hashSet, valueOf, (lu4) P4, rv4Var);
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new eo9(mo9Var, obj, nq7Var, z, z4, tu1Var, i);
        }
    }

    public static final void p(us9 us9Var, nq7 nq7Var, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(74804898);
        int i2 = i & 1;
        if (i2 != 0) {
            z = true;
        } else {
            z = false;
        }
        if (!rv4Var.U(i2, z)) {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ah7(us9Var, nq7Var, i, 26);
        }
    }

    public static final v3b q(r36 r36Var, String str) {
        r36Var.getClass();
        str.getClass();
        return new v3b(str, r36Var.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.List, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [z17] */
    /* JADX WARN: Type inference failed for: r8v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public static final jq6 r(String str, List list, boolean z) {
        boolean z2;
        boolean z3;
        ?? arrayList;
        if (list == null) {
            return null;
        }
        String obj = k4b.N0(str).toString();
        if (obj.length() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        jq6 t = tl1.t();
        if (z) {
            list = new z17(list);
        }
        for (u43 u43Var : list) {
            List list2 = u43Var.b;
            boolean z4 = u43Var.d;
            if (z != z4) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (!z2 && !z3) {
                arrayList = list2;
            } else if (!z2 && z3) {
                arrayList = new z17(list2);
            } else {
                arrayList = new ArrayList();
                for (Object obj2 : list2) {
                    if (k4b.V(((t23) obj2).b, obj, true)) {
                        arrayList.add(obj2);
                    }
                }
                if (!arrayList.isEmpty()) {
                    if (z3) {
                        arrayList = new z17((List) arrayList);
                    }
                }
            }
            if (!arrayList.isEmpty()) {
                if (arrayList == list2 && !z3) {
                    t.add(u43Var);
                } else {
                    t.add(new u43(u43Var.a, arrayList, u43Var.c, z4));
                }
            }
        }
        return tl1.r(t);
    }

    public static final boolean s(float f2) {
        if (!Float.isNaN(f2) && Math.abs(f2) >= 0.5f) {
            return false;
        }
        return true;
    }

    public static final void t(n42 n42Var) {
        d82 context = n42Var.getContext();
        context.getClass();
        if (context.get(lh9.b) == null) {
            throw new IllegalStateException(("Android context not set! Please call `withAndroidContext()` method in your coroutine body. Current context: " + context).toString());
        }
        throw new ClassCastException();
    }

    public static void u(int i) {
        if (2 <= i && i < 37) {
            return;
        }
        vs.l(hl5.s("radix ", " was not in valid range ", i), new ry5(2, 36, 1));
    }

    public static Integer v(char c2, int i) {
        u(i);
        int digit = Character.digit((int) c2, i);
        Integer valueOf = Integer.valueOf(digit);
        if (digit >= 0) {
            return valueOf;
        }
        return null;
    }

    public static final boolean w(char c2, char c3, boolean z) {
        if (c2 == c3) {
            return true;
        }
        if (!z) {
            return false;
        }
        char upperCase = Character.toUpperCase(c2);
        char upperCase2 = Character.toUpperCase(c3);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static final int x(RemoteViews remoteViews, smc smcVar, int i, int i2, Integer num) {
        int incrementAndGet;
        if (i != -1) {
            if (num != null) {
                incrementAndGet = num.intValue();
            } else {
                incrementAndGet = smcVar.g.incrementAndGet();
            }
            if (incrementAndGet != -1) {
                remoteViews.setInt(i, "setInflatedId", incrementAndGet);
            }
            if (i2 != 0) {
                remoteViews.setInt(i, "setLayoutResource", i2);
            }
            remoteViews.setViewVisibility(i, 0);
            return incrementAndGet;
        }
        vs.m("viewStubId must not be View.NO_ID");
        return 0;
    }

    public static boolean y(char c2) {
        if (!Character.isWhitespace(c2) && !Character.isSpaceChar(c2)) {
            return false;
        }
        return true;
    }

    public static final void z(f61 f61Var, m42 m42Var, boolean z) {
        Object f2;
        gvc gvcVar;
        Object t = f61Var.t();
        Throwable e2 = f61Var.e(t);
        if (e2 != null) {
            f2 = new gs9(e2);
        } else {
            f2 = f61Var.f(t);
        }
        if (z) {
            m42Var.getClass();
            ta3 ta3Var = (ta3) m42Var;
            n42 n42Var = ta3Var.e;
            Object obj = ta3Var.C;
            d82 context = n42Var.getContext();
            Object c2 = a7c.c(context, obj);
            if (c2 != a7c.a) {
                gvcVar = tc4.t(n42Var, context, c2);
            } else {
                gvcVar = null;
            }
            try {
                n42Var.resumeWith(f2);
                if (gvcVar != null && !gvcVar.t0()) {
                    return;
                }
                a7c.a(context, c2);
                return;
            } catch (Throwable th) {
                if (gvcVar == null || gvcVar.t0()) {
                    a7c.a(context, c2);
                }
                throw th;
            }
        }
        m42Var.resumeWith(f2);
    }
}
