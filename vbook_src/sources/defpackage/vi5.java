package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: vi5  reason: default package */
/* loaded from: classes.dex */
public abstract class vi5 {
    public static final gm9 A;
    public static final gm9 B;
    public static final gm9 C;
    public static final long a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;
    public static final long g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;
    public static final long l;
    public static final long m;
    public static final long n;
    public static final long o;
    public static final long p;
    public static final long q;
    public static final long r;
    public static final long s;
    public static final long t;
    public static final long u;
    public static final HashSet v;
    public static final gm9 w;
    public static final gm9 x;
    public static final gm9 y;
    public static final gm9 z;

    static {
        long d2 = d("tbl ");
        a = d2;
        long d3 = d("gso ");
        b = d3;
        long d4 = d("eqed");
        c = d4;
        long d5 = d("head");
        d = d5;
        long d6 = d("foot");
        e = d6;
        long d7 = d("fn  ");
        f = d7;
        long d8 = d("en  ");
        g = d8;
        long d9 = d("atno");
        h = d9;
        long d10 = d("nwno");
        i = d10;
        long d11 = d("pgnp");
        j = d11;
        long d12 = d("pghd");
        k = d12;
        long d13 = d("idxm");
        l = d13;
        long d14 = d("bokm");
        m = d14;
        long d15 = d("tcps");
        n = d15;
        long d16 = d("tdut");
        o = d16;
        long d17 = d("tcmt");
        p = d17;
        long d18 = d("secd");
        q = d18;
        long d19 = d("cold");
        r = d19;
        long d20 = d("form");
        s = d20;
        long d21 = d("ole ");
        t = d21;
        u = d("%hlk");
        d("%clk");
        v = fca.m(Long.valueOf(d2), Long.valueOf(d3), Long.valueOf(d4), Long.valueOf(d5), Long.valueOf(d6), Long.valueOf(d7), Long.valueOf(d8), Long.valueOf(d9), Long.valueOf(d10), Long.valueOf(d11), Long.valueOf(d12), Long.valueOf(d13), Long.valueOf(d14), Long.valueOf(d15), Long.valueOf(d16), Long.valueOf(d17), Long.valueOf(d18), Long.valueOf(d19), Long.valueOf(d20), Long.valueOf(d21));
        w = new gm9("^\\d+$");
        x = new gm9("^제\\d+[장절편]\\s");
        y = new gm9("^제\\d+(조의?\\d*)\\s*[\\(（]");
        z = new gm9("\u0000+$");
        A = new gm9("\\$");
        B = new gm9("\\$\\$");
        C = new gm9("\u0000+$");
    }

    /* JADX WARN: Code restructure failed: missing block: B:168:0x0402, code lost:
        if (r1.a > 0) goto L170;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x05b2, code lost:
        if (r3.length() == 0) goto L298;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ae, code lost:
        if (r7.length() > 0) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0530  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0539 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:505:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:521:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(defpackage.tm8 r49, java.util.ArrayList r50, defpackage.ui5 r51) {
        /*
            Method dump skipped, instructions count: 2300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi5.a(tm8, java.util.ArrayList, ui5):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:68:0x00f7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList b(java.util.ArrayList r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi5.b(java.util.ArrayList, int, int):java.util.ArrayList");
    }

    public static final String c(String str, List list) {
        String str2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zj5 zj5Var = (zj5) it.next();
            ak5 ak5Var = zj5Var.a;
            if (ak5Var != ak5.e && ak5Var != ak5.b && (str2 = zj5Var.b) != null) {
                String str3 = zj5Var.j;
                if (str3 != null) {
                    str2 = rs8.l(str2, " (주: ", str3, ")");
                }
                arrayList.add(str2);
            }
        }
        return k4b.N0(sl1.i0(arrayList, str, null, null, null, 62)).toString();
    }

    public static final long d(String str) {
        return ((str.charAt(0) << 24) | (str.charAt(1) << 16) | (str.charAt(2) << 8) | str.charAt(3)) & 4294967295L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0239 A[LOOP:1: B:113:0x0233->B:115:0x0239, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:320:0x06d2  */
    /* JADX WARN: Removed duplicated region for block: B:412:0x084b  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x0871  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x087f  */
    /* JADX WARN: Removed duplicated region for block: B:426:0x08aa A[LOOP:15: B:425:0x08a8->B:426:0x08aa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:429:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:430:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x08e2  */
    /* JADX WARN: Removed duplicated region for block: B:434:0x08e5  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x08ed  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x08f0  */
    /* JADX WARN: Removed duplicated region for block: B:441:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.j06 e(byte[] r47) {
        /*
            Method dump skipped, instructions count: 2354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi5.e(byte[]):j06");
    }

    public static final List f(tm8 tm8Var, ArrayList arrayList, ui5 ui5Var) {
        if (ui5Var.b < 8) {
            int i2 = tm8Var.e;
            for (int i3 = tm8Var.d; i3 < i2; i3++) {
                if (((cj5) arrayList.get(i3)).a == 72) {
                    return g(arrayList, i3 + 1, i2, ui5Var.b());
                }
            }
        }
        return ks3.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x04ab, code lost:
        if (defpackage.c16.i(r4, "\uffff") == false) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x04ad, code lost:
        r6 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0603, code lost:
        if (r4.length() > 0) goto L267;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x06f0, code lost:
        if (defpackage.c16.i(r5, r6) == false) goto L303;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01fe A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0472  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0708  */
    /* JADX WARN: Removed duplicated region for block: B:378:0x070c  */
    /* JADX WARN: Removed duplicated region for block: B:380:0x0712  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0717  */
    /* JADX WARN: Removed duplicated region for block: B:384:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:385:0x072f  */
    /* JADX WARN: Removed duplicated region for block: B:387:0x074e  */
    /* JADX WARN: Removed duplicated region for block: B:393:0x0793  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.ArrayList g(java.util.ArrayList r46, int r47, int r48, defpackage.ui5 r49) {
        /*
            Method dump skipped, instructions count: 2030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vi5.g(java.util.ArrayList, int, int, ui5):java.util.ArrayList");
    }

    public static final String h(byte[] bArr, int i2) {
        int o2 = vae.o(bArr, i2);
        if (o2 > 0) {
            return String.valueOf((char) o2);
        }
        return "";
    }
}
