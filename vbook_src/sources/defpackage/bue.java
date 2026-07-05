package defpackage;

import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.os.Trace;
import android.view.View;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: bue  reason: default package */
/* loaded from: classes.dex */
public abstract class bue {
    public static final tu1 a = new tu1(new cv1(21), false, -1543683025);
    public static final tu1 b = new tu1(new dv1(6), false, -857313435);
    public static final tu1 c = new tu1(new dv1(7), false, -1254284670);
    public static final tu1 d = new tu1(new cv1(22), false, 1386020734);
    public static final tu1 e = new tu1(new cv1(23), false, 2057746506);
    public static final gs5 f = new gs5(false);
    public static final rk9 g = new rk9(nae.e, nae.e, 10.0f, 10.0f);

    public static final v72 a(float f2) {
        if (Build.VERSION.SDK_INT >= 29) {
            return yte.l(f2, f2, f2, f2);
        }
        return uu9.a(f2);
    }

    public static final v72 b(float f2, float f3, float f4, float f5) {
        if (Build.VERSION.SDK_INT >= 29) {
            return yte.l(f2, f3, f4, f5);
        }
        su9 su9Var = uu9.a;
        return new v72(new sg3(f2), new sg3(f3), new sg3(f4), new sg3(f5));
    }

    public static v72 c(int i, float f2) {
        float f3;
        float f4;
        float f5 = 8.0f;
        if ((i & 1) != 0) {
            f3 = 0.0f;
        } else {
            f3 = 8.0f;
        }
        if ((i & 2) != 0) {
            f4 = 0.0f;
        } else {
            f4 = 4.0f;
        }
        if ((i & 4) != 0) {
            f5 = 0.0f;
        }
        if ((i & 8) != 0) {
            f2 = 0.0f;
        }
        return b(f3, f4, f5, f2);
    }

    public static final void d(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                pye.e(th, th2);
            }
        }
    }

    public static final js e(js jsVar) {
        js c2 = jsVar.c();
        int b2 = c2.b();
        for (int i = 0; i < b2; i++) {
            c2.e(i, jsVar.a(i));
        }
        return c2;
    }

    public static List f(String str, oc5 oc5Var) {
        ta5 ta5Var;
        str.getClass();
        oc5Var.getClass();
        int length = str.length();
        ks3 ks3Var = ks3.a;
        if (length > 4000000) {
            ta5Var = new ta5(ks3Var, tl1.A(new ya5(str.length())));
        } else {
            try {
                hc5 u = yte.u(str, oc5Var);
                ArrayList arrayList = new ArrayList(u.b);
                ArrayList arrayList2 = u.a;
                ArrayList arrayList3 = new ArrayList(tl1.s(arrayList2, 10));
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    arrayList3.add(vte.t((dc5) obj));
                }
                ta5Var = new ta5(tl1.H(qwe.o(new zg4(str, oc5Var, arrayList).C(null, arrayList3))), arrayList);
            } catch (Throwable th) {
                String message = th.getMessage();
                if (message == null) {
                    message = th.toString();
                }
                ta5Var = new ta5(ks3Var, tl1.A(new va5(null, message, 0)));
            }
        }
        return ta5Var.a;
    }

    public static boolean g(Object obj, Object obj2) {
        if (obj != obj2) {
            if (obj == null || !obj.equals(obj2)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public static final gj6 h(float f2, fj6 fj6Var) {
        Object obj;
        fj6Var.getClass();
        Iterator it = fj6Var.k.iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                gj6 gj6Var = (gj6) obj;
                int i = gj6Var.p;
                if (f2 >= i && f2 < i + gj6Var.q) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (gj6) obj;
    }

    public static final wu7 i(e8a e8aVar, xt4 xt4Var) {
        Trace.beginSection("getAllUncoveredSemanticsNodesToIntObjectMap");
        try {
            b8a a2 = e8aVar.a();
            od6 od6Var = a2.c;
            if (od6Var.K() && od6Var.J()) {
                rk9 g2 = a2.g();
                wu7 wu7Var = new wu7(48);
                g99 g99Var = new g99(4);
                g99Var.z(pc2.t(g2));
                l(xt4Var, wu7Var, new g99(4), g99Var, a2, a2);
                return wu7Var;
            }
            wu7 wu7Var2 = oy5.a;
            wu7Var2.getClass();
            return wu7Var2;
        } finally {
            Trace.endSection();
        }
    }

    public static final void j(xt4 xt4Var, wu7 wu7Var, g99 g99Var, g99 g99Var2, b8a b8aVar, b8a b8aVar2) {
        boolean z;
        g99 g99Var3 = g99Var;
        Region region = (Region) g99Var3.b;
        g99 g99Var4 = g99Var2;
        Region region2 = (Region) g99Var4.b;
        od6 od6Var = b8aVar2.c;
        od6 od6Var2 = b8aVar2.c;
        if (od6Var.K() && od6Var2.J() && !region2.isEmpty()) {
            rk9 m = b8aVar2.m();
            if (m.l()) {
                z7a f2 = b8aVar2.f();
                if (f2 == null) {
                    wv5 wv5Var = (wv5) od6Var2.c0.d;
                    m = obe.t(wv5Var).g0(wv5Var, false);
                } else {
                    mq7 mq7Var = ((mq7) f2).a;
                    Object g2 = b8aVar2.d.a.g(s7a.b);
                    if (g2 == null) {
                        g2 = null;
                    }
                    if (g2 != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    m = ak0.p(mq7Var, z, false);
                }
            }
            uy5 t = pc2.t(m);
            g99Var3.z(t);
            if (region.op(region2, Region.Op.INTERSECT)) {
                int i = b8aVar2.f;
                if (i == b8aVar.f) {
                    i = -1;
                }
                Rect bounds = region.getBounds();
                wu7Var.i(i, new d8a(b8aVar2, new uy5(bounds.left, bounds.top, bounds.right, bounds.bottom)));
                List j = b8a.j(4, b8aVar2);
                int size = j.size() - 1;
                while (-1 < size) {
                    if (!((Boolean) xt4Var.invoke(j.get(size))).booleanValue()) {
                        j(xt4Var, wu7Var, g99Var3, g99Var4, b8aVar, (b8a) j.get(size));
                    }
                    size--;
                    g99Var3 = g99Var;
                    g99Var4 = g99Var2;
                }
                if (p(b8aVar2)) {
                    region2.op(t.a, t.b, t.c, t.d, Region.Op.DIFFERENCE);
                }
            }
        } else if (b8aVar2.o()) {
            k(wu7Var, b8aVar, b8aVar2);
        }
    }

    public static final void k(wu7 wu7Var, b8a b8aVar, b8a b8aVar2) {
        rk9 rk9Var;
        od6 od6Var;
        b8a l = b8aVar2.l();
        if (l != null && (od6Var = l.c) != null && od6Var.K()) {
            rk9Var = l.g();
        } else {
            rk9Var = g;
        }
        int i = b8aVar2.f;
        if (i == b8aVar.f) {
            i = -1;
        }
        wu7Var.i(i, new d8a(b8aVar2, pc2.t(rk9Var)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x00ad, code lost:
        if (r5 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00c1, code lost:
        if (r2 != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0196  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(defpackage.xt4 r17, defpackage.wu7 r18, defpackage.g99 r19, defpackage.g99 r20, defpackage.b8a r21, defpackage.b8a r22) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bue.l(xt4, wu7, g99, g99, b8a, b8a):void");
    }

    public static zd0 m(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new zd0(h50.o(view));
        }
        return null;
    }

    public static final ovc n(rv4 rv4Var) {
        WeakHashMap weakHashMap = yjd.w;
        return new ovc(h88.n(rv4Var).g, h88.n(rv4Var).b);
    }

    public static final boolean o(b8a b8aVar) {
        boolean z;
        i38 d2 = b8aVar.d();
        tv7 tv7Var = b8aVar.d.a;
        if (d2 != null) {
            z = d2.M1();
        } else {
            z = false;
        }
        if (!z && !tv7Var.c(h8a.q) && !tv7Var.c(h8a.p)) {
            return false;
        }
        return true;
    }

    public static final boolean p(b8a b8aVar) {
        if (!o(b8aVar)) {
            u7a u7aVar = b8aVar.d;
            if (!u7aVar.c) {
                tv7 tv7Var = u7aVar.a;
                Object[] objArr = tv7Var.b;
                Object[] objArr2 = tv7Var.c;
                long[] jArr = tv7Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    int i4 = (i << 3) + i3;
                                    Object obj = objArr[i4];
                                    Object obj2 = objArr2[i4];
                                    if (((k8a) obj).c) {
                                        return true;
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            } else {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:108:0x019e, code lost:
        if (r13 == r9.size()) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0040, code lost:
        if (r8 > r3) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0043, code lost:
        r3 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0066, code lost:
        if (r8 > r3) goto L222;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0135, code lost:
        if (r9 != null) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:252:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:254:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [xl0] */
    /* JADX WARN: Type inference failed for: r10v28 */
    /* JADX WARN: Type inference failed for: r10v7, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [to8] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.Collection, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r8v28 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.wi3 q(defpackage.fj6 r16, float r17, defpackage.vi3 r18, defpackage.cj3 r19, float r20, float r21) {
        /*
            Method dump skipped, instructions count: 865
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bue.q(fj6, float, vi3, cj3, float, float):wi3");
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0042, code lost:
        if (r24.f(r19) == false) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0028, code lost:
        if (r24.f(r4) == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0085 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ca A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0108 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012b A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.kp6 r(defpackage.qp6 r17, defpackage.fv2 r18, defpackage.uo3 r19, defpackage.ym0 r20, defpackage.wm0 r21, defpackage.yya r22, defpackage.qo3 r23, defpackage.rv4 r24, int r25) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bue.r(qp6, fv2, uo3, ym0, wm0, yya, qo3, rv4, int):kp6");
    }
}
