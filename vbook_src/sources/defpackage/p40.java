package defpackage;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Display;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p40  reason: default package */
/* loaded from: classes.dex */
public final class p40 implements yt0, c82, hu1, w9a, dj1, z1e, bo4, y22 {
    public final /* synthetic */ int a;
    public static final p40 b = new p40(1);
    public static final p40 c = new p40(2);
    public static final /* synthetic */ p40 d = new p40(3);
    public static final p40 e = new p40(4);
    public static final p40 f = new p40(5);
    public static final p40 C = new p40(6);
    public static final p40 D = new p40(7);
    public static final p40 E = new p40(8);
    public static final p40 F = new p40(9);
    public static final p40 G = new p40(10);
    public static final p40 H = new p40(11);
    public static final p40 I = new p40(12);
    public static final p40 J = new p40(13);
    public static final p40 K = new p40(14);
    public static final p40 L = new p40(15);

    public p40(String str, float f2) {
        this.a = 19;
        str.getClass();
        if (nae.e <= f2) {
            return;
        }
        vs.m("min must be less than or equal to max");
        throw null;
    }

    public static final rp6 a(String str, boolean z, String str2, String str3) {
        cq6 bq6Var;
        str2.getClass();
        String obj = k4b.N0(str2).toString();
        boolean z2 = false;
        if (obj.length() == 0) {
            bq6Var = new aq6();
        } else {
            if (!k4b.V(obj, "://", false)) {
                obj = "https://".concat(obj);
            }
            bq6Var = new bq6(obj);
        }
        String a = bq6Var.a();
        zp6 b2 = bq6Var.b();
        if (bq6Var.a() != null) {
            z2 = true;
        }
        return new rp6(str, str2, a, b2, str3, z2, z);
    }

    public static final void f(e30 e30Var) {
        jt1 jt1Var = e30.h;
        if (e30.i == null) {
            e30.i = new e30();
            d30 d30Var = new d30("Okio Watchdog");
            d30Var.setDaemon(true);
            d30Var.start();
        }
        long nanoTime = System.nanoTime();
        long j = e30Var.c;
        boolean z = e30Var.a;
        int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
        if (i != 0 && z) {
            e30Var.g = Math.min(j, e30Var.c() - nanoTime) + nanoTime;
        } else if (i != 0) {
            e30Var.g = nanoTime + j;
        } else if (z) {
            e30Var.g = e30Var.c();
        } else {
            cp8.i();
            return;
        }
        jt1 jt1Var2 = e30.h;
        int i2 = jt1Var2.b + 1;
        jt1Var2.b = i2;
        e30[] e30VarArr = (e30[]) jt1Var2.c;
        if (i2 == e30VarArr.length) {
            e30[] e30VarArr2 = new e30[i2 * 2];
            b00.a0(0, 0, 14, e30VarArr, e30VarArr2);
            jt1Var2.c = e30VarArr2;
        }
        jt1Var2.i(i2, e30Var);
        if (e30Var.f == 1) {
            e30.k.signal();
        }
    }

    public static e30 g() {
        jt1 jt1Var = e30.h;
        e30 e30Var = ((e30[]) jt1Var.c)[1];
        if (e30Var == null) {
            long nanoTime = System.nanoTime();
            e30.k.await(e30.l, TimeUnit.MILLISECONDS);
            if (((e30[]) jt1Var.c)[1] != null || System.nanoTime() - nanoTime < e30.m) {
                return null;
            }
            return e30.i;
        }
        long nanoTime2 = e30Var.g - System.nanoTime();
        if (nanoTime2 > 0) {
            e30.k.await(nanoTime2, TimeUnit.NANOSECONDS);
            return null;
        }
        jt1Var.m(e30Var);
        e30Var.e = 2;
        return e30Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x007a, code lost:
        r6 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.e31 l(java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p40.l(java.lang.String):e31");
    }

    public static e31 m(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (rae.c(str.charAt(i2 + 1)) + (rae.c(str.charAt(i2)) << 4));
            }
            return new e31(bArr);
        }
        p1a.k("Unexpected hex string: ".concat(str));
        return null;
    }

    public static byte[] n(qs5 qs5Var, long j) {
        uz0 uz0Var = new uz0(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(qs5Var.size());
        int size = qs5Var.size();
        int i = 0;
        while (i < size) {
            Object obj = qs5Var.get(i);
            i++;
            arrayList.add((Bundle) uz0Var.apply(obj));
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("c", arrayList);
        bundle.putLong("d", j);
        Parcel obtain = Parcel.obtain();
        obtain.writeBundle(bundle);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static e31 o(String str) {
        str.getClass();
        byte[] bytes = str.getBytes(ed1.a);
        bytes.getClass();
        e31 e31Var = new e31(bytes);
        e31Var.c = str;
        return e31Var;
    }

    public static e31 p(byte[] bArr) {
        int length = bArr.length;
        bArr.getClass();
        bbe.n(bArr.length, 0L, length);
        return new e31(b00.d0(bArr, 0, length));
    }

    public static void r(String str, String str2, byte[] bArr) {
        m66 m66Var = pe4.a;
        hn8 f2 = hn8.f(hn8.f(ie2.r(m66Var), str), "images");
        m66Var.C(f2);
        lj9 lj9Var = new lj9(m66Var.g1(hn8.f(f2, str2), false));
        try {
            lj9Var.write(bArr);
            try {
                lj9Var.close();
                th = null;
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                lj9Var.close();
            } catch (Throwable th3) {
                pye.e(th, th3);
            }
        }
        if (th == null) {
            return;
        }
        throw th;
    }

    @Override // defpackage.w9a
    public Object b() {
        return new pv7(true);
    }

    @Override // defpackage.w9a
    public void c(Object obj, kj9 kj9Var) {
        qw4 a;
        Map a2 = ((pv7) obj).a();
        q49 o = s49.o();
        for (Map.Entry entry : a2.entrySet()) {
            Object value = entry.getValue();
            String str = ((e49) entry.getKey()).a;
            if (value instanceof Boolean) {
                v49 E2 = w49.E();
                boolean booleanValue = ((Boolean) value).booleanValue();
                E2.c();
                w49.r((w49) E2.b, booleanValue);
                a = E2.a();
            } else if (value instanceof Float) {
                v49 E3 = w49.E();
                float floatValue = ((Number) value).floatValue();
                E3.c();
                w49.s((w49) E3.b, floatValue);
                a = E3.a();
            } else if (value instanceof Double) {
                v49 E4 = w49.E();
                double doubleValue = ((Number) value).doubleValue();
                E4.c();
                w49.p((w49) E4.b, doubleValue);
                a = E4.a();
            } else if (value instanceof Integer) {
                v49 E5 = w49.E();
                int intValue = ((Number) value).intValue();
                E5.c();
                w49.t((w49) E5.b, intValue);
                a = E5.a();
            } else if (value instanceof Long) {
                v49 E6 = w49.E();
                long longValue = ((Number) value).longValue();
                E6.c();
                w49.m((w49) E6.b, longValue);
                a = E6.a();
            } else if (value instanceof String) {
                v49 E7 = w49.E();
                E7.c();
                w49.n((w49) E7.b, (String) value);
                a = E7.a();
            } else if (value instanceof Set) {
                v49 E8 = w49.E();
                t49 p = u49.p();
                p.c();
                u49.m((u49) p.b, (Set) value);
                E8.c();
                w49.o((w49) E8.b, (u49) p.a());
                a = E8.a();
            } else if (value instanceof byte[]) {
                v49 E9 = w49.E();
                byte[] bArr = (byte[]) value;
                c31 c2 = c31.c(bArr, 0, bArr.length);
                E9.c();
                w49.q((w49) E9.b, c2);
                a = E9.a();
            } else {
                vs.k("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                return;
            }
            o.getClass();
            str.getClass();
            o.c();
            s49.m((s49) o.b).put(str, (w49) a);
        }
        ((s49) o.a()).c(kj9Var);
    }

    @Override // defpackage.yt0
    public Rect d(Activity activity) {
        int i;
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Resources resources = activity.getResources();
            int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                i = resources.getDimensionPixelSize(identifier);
            } else {
                i = 0;
            }
            int i2 = rect.bottom + i;
            if (i2 == point.y) {
                rect.bottom = i2;
                return rect;
            }
            int i3 = rect.right + i;
            if (i3 == point.x) {
                rect.right = i3;
            }
        }
        return rect;
    }

    @Override // defpackage.y22
    public long e(long j, long j2) {
        float max = Math.max(mna.b(j2) / mna.b(j), mna.a(j2) / mna.a(j));
        return mz9.a(max, max);
    }

    @Override // defpackage.w9a
    public Object h(FileInputStream fileInputStream) {
        int i;
        byte[] bArr;
        try {
            s49 p = s49.p(fileInputStream);
            pv7 pv7Var = new pv7(false);
            f49[] f49VarArr = (f49[]) Arrays.copyOf(new f49[0], 0);
            pv7Var.b();
            if (f49VarArr.length <= 0) {
                Map n = p.n();
                n.getClass();
                for (Map.Entry entry : n.entrySet()) {
                    String str = (String) entry.getKey();
                    w49 w49Var = (w49) entry.getValue();
                    str.getClass();
                    w49Var.getClass();
                    int D2 = w49Var.D();
                    if (D2 == 0) {
                        i = -1;
                    } else {
                        i = m49.a[a82.C(D2)];
                    }
                    switch (i) {
                        case -1:
                            throw new IOException("Value case is null.", null);
                        case 0:
                        default:
                            xk5.o();
                            return null;
                        case 1:
                            pv7Var.f(new e49(str), Boolean.valueOf(w49Var.u()));
                            break;
                        case 2:
                            pv7Var.f(new e49(str), Float.valueOf(w49Var.y()));
                            break;
                        case 3:
                            pv7Var.f(new e49(str), Double.valueOf(w49Var.x()));
                            break;
                        case 4:
                            pv7Var.f(new e49(str), Integer.valueOf(w49Var.z()));
                            break;
                        case 5:
                            pv7Var.f(new e49(str), Long.valueOf(w49Var.A()));
                            break;
                        case 6:
                            pv7Var.f(new e49(str), w49Var.B());
                            break;
                        case 7:
                            e49 e49Var = new e49(str);
                            tz5 o = w49Var.C().o();
                            o.getClass();
                            pv7Var.f(e49Var, sl1.H0(o));
                            break;
                        case 8:
                            e49 e49Var2 = new e49(str);
                            c31 v = w49Var.v();
                            int size = v.size();
                            if (size == 0) {
                                bArr = wz5.b;
                            } else {
                                byte[] bArr2 = new byte[size];
                                v.d(bArr2, size);
                                bArr = bArr2;
                            }
                            pv7Var.f(e49Var2, bArr);
                            break;
                        case 9:
                            throw new IOException("Value not set.", null);
                    }
                }
                return pv7Var.h();
            }
            f49 f49Var = f49VarArr[0];
            throw null;
        } catch (q16 e2) {
            throw new IOException("Unable to parse preferences proto.", e2);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|17)(2:20|21))(2:22|23))(6:30|31|32|33|(1:35)|28)|24|25|26))|43|6|7|(0)(0)|24|25|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0032, code lost:
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0044, code lost:
        r7 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
        if (r7 != r5) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0092, code lost:
        android.util.Log.w("FirebaseSessions", "Error getting Firebase installation id .", r7);
        r8 = r8;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0046  */
    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v22 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v6, types: [java.lang.String] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(defpackage.ig4 r8, defpackage.n42 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.vx5
            if (r0 == 0) goto L13
            r0 = r9
            vx5 r0 = (defpackage.vx5) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            vx5 r0 = new vx5
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r7 = r0.b
            int r9 = r0.d
            java.lang.String r1 = "FirebaseSessions"
            r2 = 2
            r3 = 1
            java.lang.String r4 = ""
            n82 r5 = defpackage.n82.a
            if (r9 == 0) goto L46
            if (r9 == r3) goto L3c
            if (r9 != r2) goto L35
            java.lang.Object r8 = r0.a
            java.lang.String r8 = (java.lang.String) r8
            defpackage.hre.r(r7)     // Catch: java.lang.Exception -> L32
            goto L8b
        L32:
            r7 = move-exception
            goto L92
        L35:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r7)
            r7 = 0
            return r7
        L3c:
            java.lang.Object r8 = r0.a
            ig4 r8 = (defpackage.ig4) r8
            defpackage.hre.r(r7)     // Catch: java.lang.Exception -> L44
            goto L61
        L44:
            r7 = move-exception
            goto L70
        L46:
            defpackage.hre.r(r7)
            r7 = r8
            hg4 r7 = (defpackage.hg4) r7     // Catch: java.lang.Exception -> L44
            com.google.android.gms.tasks.Task r8 = r7.d()     // Catch: java.lang.Exception -> L44
            r8.getClass()     // Catch: java.lang.Exception -> L6c
            r0.a = r7     // Catch: java.lang.Exception -> L6c
            r0.d = r3     // Catch: java.lang.Exception -> L6c
            java.lang.Object r8 = defpackage.kve.a(r8, r0)     // Catch: java.lang.Exception -> L6c
            if (r8 != r5) goto L5e
            goto L8a
        L5e:
            r6 = r8
            r8 = r7
            r7 = r6
        L61:
            rc0 r7 = (defpackage.rc0) r7     // Catch: java.lang.Exception -> L44
            java.lang.String r7 = r7.a     // Catch: java.lang.Exception -> L44
            r7.getClass()     // Catch: java.lang.Exception -> L44
            r6 = r8
            r8 = r7
            r7 = r6
            goto L77
        L6c:
            r8 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
        L70:
            java.lang.String r9 = "Error getting authentication token."
            android.util.Log.w(r1, r9, r7)
            r7 = r8
            r8 = r4
        L77:
            hg4 r7 = (defpackage.hg4) r7     // Catch: java.lang.Exception -> L32
            com.google.android.gms.tasks.Task r7 = r7.c()     // Catch: java.lang.Exception -> L32
            r7.getClass()     // Catch: java.lang.Exception -> L32
            r0.a = r8     // Catch: java.lang.Exception -> L32
            r0.d = r2     // Catch: java.lang.Exception -> L32
            java.lang.Object r7 = defpackage.kve.a(r7, r0)     // Catch: java.lang.Exception -> L32
            if (r7 != r5) goto L8b
        L8a:
            return r5
        L8b:
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L32
            if (r7 != 0) goto L90
            goto L97
        L90:
            r4 = r7
            goto L97
        L92:
            java.lang.String r9 = "Error getting Firebase installation id ."
            android.util.Log.w(r1, r9, r7)
        L97:
            wx5 r7 = new wx5
            r7.<init>(r4, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p40.i(ig4, n42):java.lang.Object");
    }

    @Override // defpackage.hu1
    public Object j(yv yvVar) {
        Object h = yvVar.h(new mf9(in0.class, Executor.class));
        h.getClass();
        return zj0.e((Executor) h);
    }

    public jsc k(vq4 vq4Var) {
        String str = vq4Var.o;
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    return new yw(0);
                case 1:
                    return new qk5();
                case 2:
                    return new vk5(null);
                case 3:
                    return new yw(1);
                case 4:
                    return new wwa();
            }
        }
        vs.m(s21.m("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    @Override // defpackage.dj1
    public void q(re5 re5Var, aab aabVar) {
        switch (this.a) {
            case 10:
                re5Var.getClass();
                re5Var.d.g(ah5.j, new w8((mu4) aabVar, null, 4));
                return;
            default:
                re5Var.getClass();
                ((ci5) kf5.a(re5Var, ci5.b)).a.add(new we1((mu4) aabVar, re5Var, (m42) null, 13));
                return;
        }
    }

    public boolean s(vq4 vq4Var) {
        String str = vq4Var.o;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return false;
        }
        return true;
    }

    @Override // defpackage.z1e
    public boolean zzb(Class cls) {
        return o0e.class.isAssignableFrom(cls);
    }

    @Override // defpackage.z1e
    public k2e zzc(Class cls) {
        if (o0e.class.isAssignableFrom(cls)) {
            try {
                return (k2e) o0e.n(cls.asSubclass(o0e.class)).s(3);
            } catch (Exception e2) {
                cp8.p("Unable to get message info for ".concat(cls.getName()), e2);
                return null;
            }
        }
        vs.m("Unsupported message type: ".concat(cls.getName()));
        return null;
    }

    public /* synthetic */ p40(int i) {
        this.a = i;
    }
}
