package defpackage;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sze  reason: default package */
/* loaded from: classes3.dex */
public abstract class sze {
    public static volatile se8 a;
    public static final tu1 b = new tu1(new kv1(20), false, 1411156895);
    public static final Object c = new Object();

    public static final long a(int i, int i2) {
        if (i < 0 || i2 < 0) {
            mv5.a("start and end cannot be negative. [start: " + i + ", end: " + i2 + "]");
        }
        long j = (i2 & 4294967295L) | (i << 32);
        int i3 = fxb.c;
        return j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v6, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [zl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.gab r6, long r7, long r9, defpackage.hh0 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.fm0
            if (r0 == 0) goto L13
            r0 = r11
            fm0 r0 = (defpackage.fm0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            fm0 r0 = new fm0
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.c
            int r1 = r0.d
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L30
            if (r1 != r2) goto L2a
            zl9 r6 = r0.b
            z09 r7 = r0.a
            defpackage.hre.r(r11)     // Catch: defpackage.t09 -> L82
            return r3
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r3
        L30:
            defpackage.hre.r(r11)
            hab r11 = r6.f
            r09 r11 = r11.P
            java.util.List r11 = r11.a
            java.util.Iterator r11 = r11.iterator()
        L3d:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r11.next()
            r4 = r1
            z09 r4 = (defpackage.z09) r4
            long r4 = r4.a
            boolean r4 = defpackage.y09.a(r4, r7)
            if (r4 == 0) goto L3d
            goto L54
        L53:
            r1 = r3
        L54:
            r7 = r1
            z09 r7 = (defpackage.z09) r7
            if (r7 != 0) goto L5a
            goto L80
        L5a:
            boolean r8 = r7.d
            if (r8 != 0) goto L5f
            goto L80
        L5f:
            zl9 r8 = new zl9
            r8.<init>()
            zl9 r11 = new zl9
            r11.<init>()
            r11.a = r7
            gm0 r1 = new gm0     // Catch: defpackage.t09 -> L81
            r4 = 0
            r1.<init>(r11, r8, r3, r4)     // Catch: defpackage.t09 -> L81
            r0.a = r7     // Catch: defpackage.t09 -> L81
            r0.b = r8     // Catch: defpackage.t09 -> L81
            r0.d = r2     // Catch: defpackage.t09 -> L81
            java.lang.Object r6 = r6.t(r9, r1, r0)     // Catch: defpackage.t09 -> L81
            n82 r7 = defpackage.n82.a
            if (r6 != r7) goto L80
            return r7
        L80:
            return r3
        L81:
            r6 = r8
        L82:
            java.lang.Object r6 = r6.a
            z09 r6 = (defpackage.z09) r6
            if (r6 != 0) goto L89
            goto L8a
        L89:
            r7 = r6
        L8a:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sze.b(gab, long, long, hh0):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
        if (r5 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
        return r2 - r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sze.c(int, int, int, boolean):int");
    }

    public static final long d(int i, long j) {
        int i2;
        int i3 = fxb.c;
        int i4 = (int) (j >> 32);
        int i5 = 0;
        if (i4 < 0) {
            i2 = 0;
        } else {
            i2 = i4;
        }
        if (i2 > i) {
            i2 = i;
        }
        int i6 = (int) (4294967295L & j);
        if (i6 >= 0) {
            i5 = i6;
        }
        if (i5 <= i) {
            i = i5;
        }
        if (i2 == i4 && i == i6) {
            return j;
        }
        return a(i2, i);
    }

    public static final float e(pr8 pr8Var, float f) {
        float f2 = pr8Var.a;
        if (f < f2) {
            return f2 - f;
        }
        float f3 = pr8Var.c;
        if (f > f3) {
            return f - f3;
        }
        return nae.e;
    }

    public static final nq7 f(nq7 nq7Var, mu4 mu4Var) {
        return nq7Var.a0(new uc6(mu4Var));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [g97, w20, java.lang.Object] */
    public static v20 g(byte[] bArr) {
        bArr.getClass();
        b50 b50Var = new b50(bArr, 2);
        ?? obj = new Object();
        obj.a = b50Var;
        return new v20(obj, 0L);
    }

    public static final s76 h(gi1 gi1Var, ArrayList arrayList, vt4 vt4Var) {
        s76 szVar;
        s76 bm9Var;
        s76 nocVar;
        gi1Var.getClass();
        if (!gi1Var.equals(cm9.a(Collection.class)) && !gi1Var.equals(cm9.a(List.class)) && !gi1Var.equals(cm9.a(List.class)) && !gi1Var.equals(cm9.a(ArrayList.class))) {
            if (gi1Var.equals(cm9.a(HashSet.class))) {
                szVar = new sz((s76) arrayList.get(0), 1);
            } else if (!gi1Var.equals(cm9.a(Set.class)) && !gi1Var.equals(cm9.a(Set.class)) && !gi1Var.equals(cm9.a(LinkedHashSet.class))) {
                if (gi1Var.equals(cm9.a(HashMap.class))) {
                    szVar = new b45((s76) arrayList.get(0), (s76) arrayList.get(1), 0);
                } else if (!gi1Var.equals(cm9.a(Map.class)) && !gi1Var.equals(cm9.a(Map.class)) && !gi1Var.equals(cm9.a(LinkedHashMap.class))) {
                    if (gi1Var.equals(cm9.a(Map.Entry.class))) {
                        s76 s76Var = (s76) arrayList.get(0);
                        s76 s76Var2 = (s76) arrayList.get(1);
                        s76Var.getClass();
                        s76Var2.getClass();
                        bm9Var = new y07(s76Var, s76Var2, 0);
                    } else {
                        if (gi1Var.equals(cm9.a(yk8.class))) {
                            s76 s76Var3 = (s76) arrayList.get(0);
                            s76 s76Var4 = (s76) arrayList.get(1);
                            s76Var3.getClass();
                            s76Var4.getClass();
                            nocVar = new y07(s76Var3, s76Var4, 1);
                        } else if (gi1Var.equals(cm9.a(moc.class))) {
                            s76 s76Var5 = (s76) arrayList.get(0);
                            s76 s76Var6 = (s76) arrayList.get(1);
                            s76 s76Var7 = (s76) arrayList.get(2);
                            s76Var5.getClass();
                            s76Var6.getClass();
                            s76Var7.getClass();
                            nocVar = new noc(s76Var5, s76Var6, s76Var7);
                        } else if (nmd.B(gi1Var).isArray()) {
                            Object invoke = vt4Var.invoke();
                            invoke.getClass();
                            s76 s76Var8 = (s76) arrayList.get(0);
                            s76Var8.getClass();
                            bm9Var = new bm9((gi1) invoke, s76Var8);
                        } else {
                            szVar = null;
                        }
                        szVar = nocVar;
                    }
                    szVar = bm9Var;
                } else {
                    szVar = new b45((s76) arrayList.get(0), (s76) arrayList.get(1), 1);
                }
            } else {
                szVar = new sz((s76) arrayList.get(0), 2);
            }
        } else {
            szVar = new sz((s76) arrayList.get(0), 0);
        }
        if (szVar == null) {
            s76[] s76VarArr = (s76[]) arrayList.toArray(new s76[0]);
            return zr1.n(gi1Var, (s76[]) Arrays.copyOf(s76VarArr, s76VarArr.length));
        }
        return szVar;
    }

    public static final xt6 i(xt6 xt6Var, long j, jj2 jj2Var) {
        nt6 a2 = rt6.a(xt6Var.a(), j, jj2Var);
        LocalTime localTime = xt6Var.a.toLocalTime();
        localTime.getClass();
        return new xt6(a2, new fv6(localTime));
    }

    public static final s76 j(gi1 gi1Var) {
        gi1Var.getClass();
        s76 n = zr1.n(gi1Var, new s76[0]);
        if (n == null) {
            return (s76) z59.a.get(gi1Var);
        }
        return n;
    }

    public static final ArrayList k(wf2 wf2Var, List list, boolean z) {
        wf2Var.getClass();
        list.getClass();
        if (z) {
            ArrayList arrayList = new ArrayList(tl1.s(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                t76 t76Var = (t76) it.next();
                t76Var.getClass();
                s76 p = q0f.p(wf2Var, t76Var, true);
                if (p != null) {
                    arrayList.add(p);
                } else {
                    q1d.s(q1d.n(t76Var));
                    throw null;
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(tl1.s(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            t76 t76Var2 = (t76) it2.next();
            wf2Var.getClass();
            t76Var2.getClass();
            s76 p2 = q0f.p(wf2Var, t76Var2, false);
            if (p2 == null) {
                return null;
            }
            arrayList2.add(p2);
        }
        return arrayList2;
    }

    public static final String l(long j, CharSequence charSequence) {
        return charSequence.subSequence(fxb.g(j), fxb.f(j)).toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0070, code lost:
        if (r0.equals("global") == false) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [ks3] */
    /* JADX WARN: Type inference failed for: r5v18, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.f34 m(defpackage.un2 r38) {
        /*
            Method dump skipped, instructions count: 717
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sze.m(un2):f34");
    }

    public static final l54 n(un2 un2Var) {
        return p(un2Var.a, un2Var.b, un2Var.c, un2Var.d, un2Var.e, un2Var.f, un2Var.i, un2Var.j, un2Var.k, un2Var.l, un2Var.m, un2Var.n, un2Var.u, un2Var.x);
    }

    public static final l54 o(ux4 ux4Var) {
        ux4Var.getClass();
        return p(ux4Var.a, ux4Var.b, ux4Var.c, ux4Var.d, ux4Var.e, ux4Var.f, ux4Var.g, ux4Var.h, ux4Var.i, ux4Var.j, ux4Var.k, ux4Var.l, ux4Var.m, ux4Var.n);
    }

    public static final l54 p(String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, int i2, boolean z, boolean z2, boolean z3, long j, long j2) {
        Object gs9Var;
        mv6 mv6Var;
        String Q0;
        String str8;
        String str9;
        String str10;
        boolean z4;
        str7.getClass();
        String O = r4b.O(k4b.N0(str7).toString(), '_', '-');
        String str11 = null;
        if (O.length() == 0 || O.equalsIgnoreCase("und")) {
            O = null;
        }
        if (O == null) {
            mv6Var = null;
        } else {
            try {
                gs9Var = new mv6(xve.c(O));
            } catch (Throwable th) {
                gs9Var = new gs9(th);
            }
            if (gs9Var instanceof gs9) {
                gs9Var = null;
            }
            mv6Var = (mv6) gs9Var;
        }
        str4.getClass();
        if (r4b.Q(str4, "https://", false)) {
            Q0 = k4b.Q0(k4b.t0(str4, "https://"), '/');
        } else if (r4b.Q(str4, "http://", false)) {
            Q0 = k4b.Q0(k4b.t0(str4, "http://"), '/');
        } else {
            Q0 = k4b.Q0(str4, '/');
        }
        String str12 = Q0;
        if (mv6Var != null) {
            str8 = mv6Var.d();
        } else {
            str8 = null;
        }
        if (str8 == null) {
            str9 = "";
        } else {
            str9 = str8;
        }
        if (mv6Var != null) {
            String a2 = mv6Var.a();
            if (!a2.equals("global")) {
                str11 = a2;
            }
        }
        if (str11 == null) {
            str10 = "";
        } else {
            str10 = str11;
        }
        if (j > 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        return new l54(str, str2, "", str12, str4, str3, i, z, i2, str9, str10, str6, str5, z2, z3, true, z4, j2);
    }

    public static final xt6 q(zx5 zx5Var, f1d f1dVar) {
        try {
            zx5Var.getClass();
            try {
                Instant ofEpochSecond = Instant.ofEpochSecond(zx5Var.a, zx5Var.b);
                ofEpochSecond.getClass();
                return new xt6(LocalDateTime.ofInstant(ofEpochSecond, f1dVar.a));
            } catch (DateTimeException e) {
                throw new gt1(1, e);
            }
        } catch (IllegalArgumentException e2) {
            throw new gt1(1, "Can not convert instant " + zx5Var + " to LocalDateTime to perform computations", e2);
        }
    }

    public static String r(String str, Object... objArr) {
        int length;
        int length2;
        int indexOf;
        String o;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                o = "null";
            } else {
                try {
                    o = obj.toString();
                } catch (Exception e) {
                    String o2 = eub.o(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(o2), (Throwable) e);
                    o = hl5.o("<", o2, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = o;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (indexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, indexOf);
            sb.append(objArr[i]);
            i++;
            i3 = indexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:8|(4:10|(1:12)|13|14)|15|(4:17|(1:19)|13|14)|20|(1:22)(1:82)|23|24|25|26|27|28|(1:30)(1:78)|31|(9:33|34|35|36|37|(2:38|(3:40|(3:56|57|58)(7:42|43|(2:45|(1:48))|49|(1:51)(1:55)|52|53)|54)(1:59))|60|61|62)(1:77)|63|14) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x006f, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0070, code lost:
        android.util.Log.e("HermeticFileOverrides", "no data dir", r0);
        r5 = defpackage.b0.a;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.se8 s(android.content.Context r16) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sze.s(android.content.Context):se8");
    }
}
