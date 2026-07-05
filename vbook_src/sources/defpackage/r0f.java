package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r0f  reason: default package */
/* loaded from: classes3.dex */
public final class r0f implements s13, hu1, c82, kra, rt0, dj1, y21, eea, t94, jf5, rz6 {
    public static r0f b;
    public final /* synthetic */ int a;
    public static final r0f c = new r0f(1);
    public static final u22 d = new u22(0);
    public static final u22 e = new u22(4);
    public static final u22 f = new u22(2);
    public static final u22 C = new u22(3);
    public static final u22 D = new u22(5);
    public static final qh4 E = new Object();
    public static final u22 F = new u22(1);
    public static final r0f G = new r0f(3);
    public static final r0f H = new r0f(4);
    public static final /* synthetic */ r0f I = new r0f(5);
    public static final r0f J = new r0f(7);
    public static final /* synthetic */ r0f K = new r0f(8);
    public static final r0f L = new r0f(9);
    public static final r0f M = new r0f(10);
    public static final r0f N = new r0f(11);
    public static final r0f O = new r0f(12);
    public static final r0f P = new r0f(13);
    public static final r0f Q = new r0f(14);

    public /* synthetic */ r0f(int i) {
        this.a = i;
    }

    public static etc A(rv4 rv4Var) {
        return ((h27) rv4Var.j(j27.a)).b;
    }

    public static Object D(String str, String str2, mu4 mu4Var, n42 n42Var, int i) {
        if ((i & 16) != 0) {
            mu4Var = null;
        }
        mu4 mu4Var2 = mu4Var;
        String str3 = hn8.b;
        hn8 d2 = fn8.d(str2, false);
        m66 m66Var = pe4.a;
        if (m66Var.j0(d2)) {
            m66Var.V(d2, false);
        }
        return P.C(d6d.b(str), d6d.b(str2), false, 9, mu4Var2, n42Var);
    }

    public static SharedPreferences E(Context context, String str) {
        return context.getSharedPreferences("com.google.firebase.auth.internal.browserSignInSessionStore." + str, 0);
    }

    public static synchronized void F() {
        synchronized (r0f.class) {
            if (b == null) {
                b = new r0f(0);
            }
        }
    }

    public static void G(SharedPreferences sharedPreferences) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        for (String str : sharedPreferences.getAll().keySet()) {
            edit.remove(str);
        }
        edit.apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00fb A[LOOP:0: B:50:0x00f5->B:52:0x00fb, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [tqd, n42] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v19, types: [az0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0110 -> B:23:0x0065). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0113 -> B:23:0x0065). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x0145 -> B:60:0x0148). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x015a -> B:67:0x0156). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x015c -> B:67:0x0156). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:74:0x0161 -> B:67:0x0156). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(defpackage.j6d r10, java.lang.String r11, defpackage.n42 r12) {
        /*
            Method dump skipped, instructions count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0f.o(j6d, java.lang.String, n42):java.lang.Object");
    }

    public static final void p(boolean z) {
        cza czaVar = AndroidBookUpdateWorker.G;
        cza czaVar2 = AndroidBookUpdateWorker.G;
        Boolean valueOf = Boolean.valueOf(z);
        czaVar2.getClass();
        czaVar2.n(null, valueOf);
    }

    public static long u(qd2 qd2Var, float f2) {
        float[] fArr = qd2Var.a;
        int i = 1;
        long a = wi4.a(fArr[0], fArr[1]);
        float f3 = nae.e;
        float f4 = f2;
        while (true) {
            float f5 = i / 3.0f;
            long c2 = qd2Var.c(f5);
            float h = nc2.h(nc2.l(c2, a));
            if (h >= f4) {
                return wi4.a(f5 - ((1.0f - (f4 / h)) / 3.0f), f2);
            }
            f4 -= h;
            f3 += h;
            if (i != 3) {
                i++;
                a = c2;
            } else {
                return wi4.a(1.0f, f3);
            }
        }
    }

    public static zda x(mp8 mp8Var) {
        return new zda(System.currentTimeMillis() + 3600000, new r95(8, 6), new i50(true, false, false), 10.0d, 1.2d, 60);
    }

    public static pm1 y(rv4 rv4Var) {
        return ((h27) rv4Var.j(j27.a)).a;
    }

    public static lfa z(rv4 rv4Var) {
        return ((h27) rv4Var.j(j27.a)).c;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object B(java.lang.String r5, java.lang.String r6, defpackage.n42 r7) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.uqd
            if (r0 == 0) goto L13
            r0 = r7
            uqd r0 = (defpackage.uqd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            uqd r0 = new uqd
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.a
            int r7 = r0.c
            r1 = 1
            r2 = 0
            if (r7 == 0) goto L2c
            if (r7 != r1) goto L26
            defpackage.hre.r(r4)
            goto L54
        L26:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r2
        L2c:
            defpackage.hre.r(r4)
            m66 r4 = defpackage.pe4.a
            java.lang.String r7 = defpackage.hn8.b
            r7 = 0
            hn8 r7 = defpackage.fn8.d(r6, r7)
            r4.getClass()
            r4.C(r7)
            j6d r4 = defpackage.d6d.b(r5)
            byb r5 = new byb
            r7 = 26
            r5.<init>(r6, r2, r7)
            r0.c = r1
            java.lang.Object r4 = defpackage.jye.t(r4, r1, r1, r5, r0)
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L54
            return r5
        L54:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0f.B(java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x0351, code lost:
        if (r5.a(r0) == r7) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0295 A[Catch: all -> 0x02c6, TryCatch #2 {all -> 0x02c6, blocks: (B:99:0x028f, B:101:0x0295, B:106:0x02c9), top: B:125:0x028f }] */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0356 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02c9 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0156 A[Catch: all -> 0x015c, TryCatch #9 {all -> 0x015c, blocks: (B:45:0x014c, B:47:0x0156, B:52:0x0165), top: B:138:0x014c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019d A[Catch: all -> 0x0264, TryCatch #1 {all -> 0x0264, blocks: (B:58:0x0197, B:60:0x019d, B:62:0x01a5), top: B:123:0x0197 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01fc A[Catch: all -> 0x023d, TRY_LEAVE, TryCatch #12 {all -> 0x023d, blocks: (B:73:0x01f7, B:75:0x01fc), top: B:144:0x01f7 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0274 A[Catch: all -> 0x032c, TRY_LEAVE, TryCatch #5 {all -> 0x032c, blocks: (B:95:0x026e, B:96:0x0273, B:97:0x0274), top: B:131:0x019b }] */
    /* JADX WARN: Type inference failed for: r22v0, types: [j6d] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0232 -> B:79:0x0237). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0242 -> B:83:0x024b). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object C(defpackage.j6d r21, defpackage.j6d r22, boolean r23, int r24, defpackage.mu4 r25, defpackage.n42 r26) {
        /*
            Method dump skipped, instructions count: 876
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0f.C(j6d, j6d, boolean, int, mu4, n42):java.lang.Object");
    }

    @Override // defpackage.y21
    public byte[] a(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // defpackage.eea
    public zda b(mp8 mp8Var, JSONObject jSONObject) {
        return x(mp8Var);
    }

    @Override // defpackage.rt0
    public long c(z5a z5aVar, int i) {
        return z5aVar.f.k(i);
    }

    @Override // defpackage.jf5
    public void d(Object obj, re5 re5Var) {
        ci5 ci5Var = (ci5) obj;
        ci5Var.getClass();
        re5Var.getClass();
        re5Var.d.g(ah5.n, new bi5(ci5Var, re5Var, null));
    }

    @Override // defpackage.jf5
    public Object f(xt4 xt4Var) {
        xt4Var.invoke(new cne(26));
        return new ci5();
    }

    @Override // defpackage.s13
    public float g(Context context) {
        return context.getResources().getDisplayMetrics().density;
    }

    @Override // defpackage.jf5
    public h40 getKey() {
        return ci5.c;
    }

    public void h(tu1 tu1Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(-2101003086);
        if (rv4Var.f(this)) {
            i2 = 32;
        } else {
            i2 = 16;
        }
        int i3 = i2 | i;
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            tu1Var.invoke(rv4Var, 6);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ah7(this, tu1Var, i, 6);
        }
    }

    @Override // defpackage.kra
    public boolean i(Object obj, Object obj2) {
        switch (this.a) {
            case 7:
                return false;
            default:
                if (obj == obj2) {
                    return true;
                }
                return false;
        }
    }

    @Override // defpackage.hu1
    public Object j(yv yvVar) {
        Object h = yvVar.h(new mf9(ag0.class, Executor.class));
        h.getClass();
        return zj0.e((Executor) h);
    }

    @Override // defpackage.rz6
    public Map k() {
        return null;
    }

    public void l(float f2, rv4 rv4Var, int i) {
        boolean z;
        rv4Var.g0(107141612);
        if ((i & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i & 1, z)) {
            n(f2, rv4Var, 432);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new kj4(this, f2, i);
        }
    }

    @Override // defpackage.t94
    public void m() {
        throw new UnsupportedOperationException();
    }

    public void n(final float f2, rv4 rv4Var, final int i) {
        boolean z;
        int i2;
        rv4Var.g0(445777820);
        int i3 = i | 6;
        if ((i & 48) == 0) {
            if (rv4Var.c(f2)) {
                i2 = 32;
            } else {
                i2 = 16;
            }
            i3 |= i2;
        }
        if ((i3 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            xbe.i(rv4Var, pna.s(pna.h(kq7.a, nae.e), f2));
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4() { // from class: wua
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(i | 1);
                    r0f.this.n(f2, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    @Override // defpackage.dj1
    public void q(re5 re5Var, aab aabVar) {
        re5Var.getClass();
        re5Var.e.g(ah5.q, new wa((ou4) aabVar, (m42) null, 26));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object r(defpackage.v20 r9, defpackage.xpd r10, defpackage.n42 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.qqd
            if (r0 == 0) goto L13
            r0 = r11
            qqd r0 = (defpackage.qqd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            qqd r0 = new qqd
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r8 = r0.a
            int r11 = r0.c
            r1 = 1
            if (r11 == 0) goto L2d
            if (r11 != r1) goto L26
            defpackage.hre.r(r8)
            goto La7
        L26:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            r8 = 0
            return r8
        L2d:
            defpackage.hre.r(r8)
            b50 r8 = new b50
            r11 = 4096(0x1000, float:5.74E-42)
            r8.<init>(r11)
            yeb r11 = defpackage.q0f.d(r8)
            java.lang.String r2 = "PK\u0001\u0002"
            defpackage.yte.A(r11, r2)
            r10.getClass()
            byte[] r2 = r10.h
            byte[] r3 = r10.g
            byte[] r4 = r10.f
            r5 = 788(0x314, float:1.104E-42)
            defpackage.yte.x(r11, r5)
            r5 = 20
            defpackage.yte.x(r11, r5)
            int r5 = r10.b
            defpackage.yte.x(r11, r5)
            r5 = 8
            defpackage.yte.x(r11, r5)
            r5 = 0
            defpackage.yte.x(r11, r5)
            defpackage.yte.x(r11, r5)
            int r6 = r10.c
            defpackage.yte.y(r11, r6)
            int r6 = r10.d
            defpackage.yte.y(r11, r6)
            int r6 = r10.e
            defpackage.yte.y(r11, r6)
            int r6 = r4.length
            defpackage.yte.x(r11, r6)
            int r6 = r3.length
            defpackage.yte.x(r11, r6)
            defpackage.yte.x(r11, r5)
            defpackage.yte.x(r11, r5)
            defpackage.yte.x(r11, r5)
            defpackage.yte.y(r11, r5)
            long r6 = r10.a
            int r10 = (int) r6
            defpackage.yte.y(r11, r10)
            int r10 = r4.length
            r11.write(r4, r5, r10)
            int r10 = r3.length
            r11.write(r3, r5, r10)
            r11.write(r2, r5, r5)
            byte[] r8 = r8.d()
            r0.c = r1
            java.lang.Object r8 = defpackage.kwe.R(r9, r8, r0)
            n82 r9 = defpackage.n82.a
            if (r8 != r9) goto La7
            return r9
        La7:
            pvc r8 = defpackage.pvc.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0f.r(v20, xpd, n42):java.lang.Object");
    }

    @Override // defpackage.t94
    public fjc s(int i, int i2) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00fc, code lost:
        if (r9 == r8) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object t(defpackage.v20 r27, defpackage.j6d r28, java.lang.String r29, int r30, defpackage.n42 r31) {
        /*
            Method dump skipped, instructions count: 698
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0f.t(v20, j6d, java.lang.String, int, n42):java.lang.Object");
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "NeverEqualPolicy";
            case 8:
            default:
                return super.toString();
            case 9:
                return "ReferentialEqualityPolicy";
        }
    }

    @Override // defpackage.t94
    public void v(m4a m4aVar) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8 A[RETURN] */
    /* JADX WARN: Type inference failed for: r12v9, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0099 -> B:29:0x009b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00ce -> B:17:0x0058). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object w(defpackage.j6d r10, java.lang.String r11, defpackage.n42 r12) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0f.w(j6d, java.lang.String, n42):java.lang.Object");
    }

    @Override // defpackage.rz6
    public void clear() {
    }

    @Override // defpackage.rz6
    public void e(Map map) {
    }
}
