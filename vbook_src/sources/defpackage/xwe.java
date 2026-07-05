package defpackage;

import android.content.Context;
import android.content.res.Resources;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xwe  reason: default package */
/* loaded from: classes.dex */
public abstract class xwe {
    public static final qm1 A;
    public static final float B;
    public static final qm1 C;
    public static final qm1 D;
    public static final tu1 a = new tu1(new ev1(28), false, 1035530753);
    public static final uk b = new uk(17);
    public static final qm1 c = qm1.J;
    public static final float d = 1.0f;
    public static final qm1 e;
    public static final float f;
    public static final qm1 g;
    public static final float h;
    public static final qm1 i;
    public static final float j;
    public static final qm1 k;
    public static final float l;
    public static final qm1 m;
    public static final qm1 n;
    public static final afa o;
    public static final float p;
    public static final qm1 q;
    public static final float r;
    public static final qm1 s;
    public static final qm1 t;
    public static final float u;
    public static final float v;
    public static final float w;
    public static final afa x;
    public static final float y;
    public static final qm1 z;

    static {
        qm1 qm1Var = qm1.e;
        e = qm1Var;
        f = 0.38f;
        g = qm1Var;
        h = 0.12f;
        i = qm1Var;
        j = 0.38f;
        qm1 qm1Var2 = qm1.L;
        k = qm1Var2;
        l = 0.38f;
        m = qm1Var2;
        n = qm1Var;
        afa afaVar = afa.c;
        o = afaVar;
        p = 28.0f;
        q = qm1.b;
        r = 24.0f;
        s = qm1.c;
        t = qm1.E;
        u = 40.0f;
        v = 32.0f;
        w = 2.0f;
        x = afaVar;
        y = 52.0f;
        qm1 qm1Var3 = qm1.C;
        z = qm1Var3;
        A = qm1Var3;
        B = 16.0f;
        C = qm1Var2;
        D = qm1Var2;
    }

    public static final uy1 a() {
        return new uy1();
    }

    public static final void b(to5 to5Var, String str, xy4 xy4Var, int i2, dm1 dm1Var, rv4 rv4Var, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        xy4 xy4Var2;
        Object obj = dm1Var;
        rv4Var.g0(491792371);
        if (rv4Var.f(to5Var)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i3 | i5;
        if (rv4Var.f(str)) {
            i6 = 32;
        } else {
            i6 = 16;
        }
        int i14 = i13 | i6;
        if (rv4Var.f(xy4Var)) {
            i7 = 256;
        } else {
            i7 = Token.CASE;
        }
        int i15 = i14 | i7;
        int i16 = i4 & 8;
        if (i16 != 0) {
            i9 = i15 | 3072;
        } else {
            if (rv4Var.d(i2)) {
                i8 = 2048;
            } else {
                i8 = 1024;
            }
            i9 = i15 | i8;
        }
        int i17 = i4 & 16;
        if (i17 != 0) {
            i11 = i9 | 24576;
        } else {
            int i18 = i3 & 32768;
            if (rv4Var.f(obj)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i11 = i9 | i10;
        }
        if ((i11 & 9363) == 9362 && rv4Var.E()) {
            rv4Var.X();
            i12 = i2;
        } else {
            if (i16 != 0) {
                i12 = 1;
            } else {
                i12 = i2;
            }
            if (i17 != 0) {
                obj = null;
            }
            rv4Var.f0(135631275);
            if (str != null) {
                rv4Var.f0(135633130);
                boolean f2 = rv4Var.f(str);
                Object P = rv4Var.P();
                if (f2 || P == ax1.a) {
                    P = new bo5(str, 0);
                    rv4Var.o0(P);
                }
                rv4Var.q(false);
                t7a t7aVar = new t7a();
                ((xt4) P).invoke(t7aVar);
                xy4Var2 = xy4Var.d(new w7a(t7aVar));
            } else {
                xy4Var2 = xy4Var;
            }
            rv4Var.q(false);
            zn5 zn5Var = zn5.a;
            rv4Var.f0(-1115894518);
            rv4Var.f0(1886828752);
            if (rv4Var.a instanceof my) {
                rv4Var.c0();
                if (rv4Var.S) {
                    rv4Var.k(new ik(zn5Var, 12));
                } else {
                    rv4Var.r0();
                }
                jce.F(np.X, rv4Var, to5Var);
                jce.F(np.Y, rv4Var, xy4Var2);
                jce.F(np.Z, rv4Var, new v22(i12));
                jce.F(np.a0, rv4Var, obj);
                rv4Var.q(true);
                rv4Var.q(false);
                rv4Var.q(false);
            } else {
                p17.h();
                throw null;
            }
        }
        dm1 dm1Var2 = obj;
        ek9 u2 = rv4Var.u();
        if (u2 != null) {
            u2.d = new ao5(to5Var, str, xy4Var, i12, dm1Var2, i3, i4);
        }
    }

    public static final void c(int i2, List list, int i3) {
        int f2 = f(i2, list);
        if (f2 < 0) {
            f2 = -(f2 + 1);
        }
        while (f2 < list.size() && ((t16) list.get(f2)).b < i3) {
            t16 t16Var = (t16) list.remove(f2);
        }
    }

    public static final float d(List list, Resources resources) {
        Iterator it = list.iterator();
        float f2 = nae.e;
        while (it.hasNext()) {
            f2 += resources.getDimension(((Number) it.next()).intValue()) / resources.getDisplayMetrics().density;
        }
        return f2;
    }

    public static final void e(aqa aqaVar, ArrayList arrayList, int i2) {
        boolean l2 = aqaVar.l(i2);
        int[] iArr = aqaVar.b;
        if (l2) {
            arrayList.add(aqaVar.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            e(aqaVar, arrayList, i4);
        }
    }

    public static final int f(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int l2 = c16.l(((t16) list.get(i4)).b, i2);
            if (l2 < 0) {
                i3 = i4 + 1;
            } else if (l2 > 0) {
                size = i4 - 1;
            } else {
                return i4;
            }
        }
        return -(i3 + 1);
    }

    public static final long g(long j2) {
        if (j2 < 0) {
            hq7 hq7Var = wl3.b;
            return wl3.d;
        }
        hq7 hq7Var2 = wl3.b;
        return wl3.c;
    }

    public static final boolean h(pp3 pp3Var) {
        t7a t7aVar;
        String str = null;
        w7a w7aVar = (w7a) pp3Var.a.a(null, co5.b);
        if (w7aVar != null) {
            t7aVar = w7aVar.a;
        } else {
            t7aVar = null;
        }
        if (t7aVar != null) {
            Object obj = t7aVar.a.get(g8a.a);
            if (obj == null) {
                obj = null;
            }
            List list = (List) obj;
            if (list != null) {
                str = (String) list.get(0);
            }
        }
        if (str != null && str.length() != 0) {
            return false;
        }
        return true;
    }

    public static final void i(Context context) {
        Map map;
        String str;
        context.getClass();
        File databasePath = context.getDatabasePath("androidx.work.workdb");
        databasePath.getClass();
        if (databasePath.exists()) {
            r95.n().c(bmd.a, "Migrating WorkDatabase to the no-backup directory");
            File databasePath2 = context.getDatabasePath("androidx.work.workdb");
            databasePath2.getClass();
            File noBackupFilesDir = context.getNoBackupFilesDir();
            noBackupFilesDir.getClass();
            String[] strArr = bmd.b;
            int k2 = p17.k(strArr.length);
            if (k2 < 16) {
                k2 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(k2);
            for (String str2 : strArr) {
                linkedHashMap.put(new File(databasePath2.getPath() + str2), new File(noBackupFilesDir.getPath() + str2));
            }
            if (linkedHashMap.isEmpty()) {
                map = Collections.singletonMap(databasePath2, noBackupFilesDir);
                map.getClass();
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
                linkedHashMap2.put(databasePath2, noBackupFilesDir);
                map = linkedHashMap2;
            }
            for (Map.Entry entry : map.entrySet()) {
                File file = (File) entry.getKey();
                File file2 = (File) entry.getValue();
                if (file.exists()) {
                    if (file2.exists()) {
                        r95.n().s(bmd.a, "Over-writing contents of " + file2);
                    }
                    if (file.renameTo(file2)) {
                        str = "Migrated " + file + "to " + file2;
                    } else {
                        str = "Renaming " + file + " to " + file2 + " failed";
                    }
                    r95.n().c(bmd.a, str);
                }
            }
        }
    }

    public static void j(jub jubVar, ipb ipbVar, fvb fvbVar, sc6 sc6Var, wub wubVar, boolean z2, j88 j88Var) {
        rk9 rk9Var;
        if (z2) {
            int w2 = j88Var.w(fxb.f(jubVar.b));
            String str = urb.a;
            if (w2 < fvbVar.a.a.b.length()) {
                rk9Var = fvbVar.b(w2);
            } else if (w2 != 0) {
                rk9Var = fvbVar.b(w2 - 1);
            } else {
                rk9Var = new rk9(nae.e, nae.e, 1.0f, (int) (urb.a(ipbVar.b, ipbVar.g, ipbVar.h) & 4294967295L));
            }
            float f2 = rk9Var.b;
            float f3 = rk9Var.a;
            long h0 = sc6Var.h0((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L));
            float intBitsToFloat = Float.intBitsToFloat((int) (h0 >> 32));
            float intBitsToFloat2 = Float.intBitsToFloat((int) (h0 & 4294967295L));
            rk9 n2 = npe.n((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), (Float.floatToRawIntBits(rk9Var.c - f3) << 32) | (Float.floatToRawIntBits(rk9Var.d - f2) & 4294967295L));
            if (c16.i((wub) wubVar.a.b.get(), wubVar)) {
                wubVar.b.h(n2);
            }
        }
    }

    public static final xy4 k(xy4 xy4Var, float f2) {
        mh8 s2 = s(f2);
        return xy4Var.d(new ph8(s2, s2, s2, s2));
    }

    public static final List l(String str) {
        qa5 qa5Var = qa5.a;
        ps g2 = qa5.g(qa5.d(str));
        ns nsVar = new ns();
        String str2 = g2.b;
        nsVar.f(str2);
        for (os osVar : g2.c()) {
            nsVar.b(osVar.b, osVar.c, (uva) osVar.a);
        }
        for (os osVar2 : g2.d(0, nsVar.a.length())) {
            nsVar.a(osVar2.d, osVar2.b, osVar2.c, (String) osVar2.a);
        }
        sw4 sw4Var = new sw4(gm9.c(new gm9("(https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF][a-zA-Z0-9-\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]\\.[^\\s]{2,}|www\\.[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF][a-zA-Z0-9-\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]\\.[^\\s]{2,}|https?:\\/\\/(?:www\\.|(?!www))[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+\\.[^\\s]{2,}|www\\.[a-zA-Z0-9\\u00A0-\\uD7FF\\uF900-\\uFDCF\\uFDF0-\\uFFEF]+\\.[^\\s]{2,})"), str2));
        while (sw4Var.hasNext()) {
            b27 b27Var = (b27) sw4Var.next();
            nsVar.a("androidx.compose.foundation.text.linkContent", b27Var.b().a, b27Var.b().b + 1, b27Var.c());
            nsVar.b(b27Var.b().a, b27Var.b().b + 1, new uva(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, gpb.c, null, 61439));
        }
        ps k2 = nsVar.k();
        if (k4b.j0(k2)) {
            return ks3.a;
        }
        return tl1.A(new r23(k2));
    }

    public static final List m(iw9 iw9Var) {
        int r2 = que.r(iw9Var, "id");
        int r3 = que.r(iw9Var, "seq");
        int r4 = que.r(iw9Var, "from");
        int r5 = que.r(iw9Var, "to");
        jq6 t2 = tl1.t();
        while (iw9Var.Z0()) {
            t2.add(new kq4(iw9Var.s0(r4), (int) iw9Var.getLong(r2), (int) iw9Var.getLong(r3), iw9Var.s0(r5)));
        }
        return sl1.t0(tl1.r(t2));
    }

    public static final pjb n(cw9 cw9Var, String str, boolean z2) {
        String str2;
        iw9 h1 = cw9Var.h1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int r2 = que.r(h1, "seqno");
            int r3 = que.r(h1, "cid");
            int r4 = que.r(h1, "name");
            int r5 = que.r(h1, "desc");
            if (r2 != -1 && r3 != -1 && r4 != -1 && r5 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (h1.Z0()) {
                    if (((int) h1.getLong(r3)) >= 0) {
                        int i2 = (int) h1.getLong(r2);
                        String s0 = h1.s0(r4);
                        if (h1.getLong(r5) > 0) {
                            str2 = "DESC";
                        } else {
                            str2 = "ASC";
                        }
                        linkedHashMap.put(Integer.valueOf(i2), s0);
                        linkedHashMap2.put(Integer.valueOf(i2), str2);
                    }
                }
                List<Map.Entry> u0 = sl1.u0(linkedHashMap.entrySet(), new pa5(27));
                ArrayList arrayList = new ArrayList(tl1.s(u0, 10));
                for (Map.Entry entry : u0) {
                    arrayList.add((String) entry.getValue());
                }
                List C0 = sl1.C0(arrayList);
                List<Map.Entry> u02 = sl1.u0(linkedHashMap2.entrySet(), new pa5(28));
                ArrayList arrayList2 = new ArrayList(tl1.s(u02, 10));
                for (Map.Entry entry2 : u02) {
                    arrayList2.add((String) entry2.getValue());
                }
                pjb pjbVar = new pjb(str, z2, C0, sl1.C0(arrayList2));
                dxe.r(h1, null);
                return pjbVar;
            }
            dxe.r(h1, null);
            return null;
        } finally {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x010f, code lost:
        if (r37.f(r15) == false) goto L321;
     */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x023e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0264 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0299 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0318 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:235:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0360 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x038d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x03bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:275:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x03ea A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x03ff  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x042f  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x045d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x04c1 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:355:0x04e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:359:0x052d A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.zo3 o(defpackage.uo3 r31, defpackage.ym0 r32, defpackage.wm0 r33, java.util.List r34, defpackage.qo3 r35, boolean r36, defpackage.rv4 r37, int r38) {
        /*
            Method dump skipped, instructions count: 1354
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwe.o(uo3, ym0, wm0, java.util.List, qo3, boolean, rv4, int):zo3");
    }

    public static final void p(eqa eqaVar, int i2, Object obj) {
        int h2 = eqaVar.h(i2);
        Object[] objArr = eqaVar.c;
        Object obj2 = objArr[h2];
        objArr[h2] = ax1.a;
        if (obj == obj2) {
            return;
        }
        ex1.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ")");
    }

    public static final long q(long j2, long j3) {
        long j4 = j2 - j3;
        int i2 = (((j4 ^ j2) & (~(j4 ^ j3))) > 0L ? 1 : (((j4 ^ j2) & (~(j4 ^ j3))) == 0L ? 0 : -1));
        am3 am3Var = am3.NANOSECONDS;
        if (i2 < 0) {
            am3 am3Var2 = am3.MILLISECONDS;
            if (am3Var.compareTo(am3Var2) < 0) {
                long j5 = (j2 % 1000000) - (j3 % 1000000);
                hq7 hq7Var = wl3.b;
                return wl3.h(jue.P((j2 / 1000000) - (j3 / 1000000), am3Var2), jue.P(j5, am3Var));
            }
            return wl3.k(g(j4));
        }
        return jue.P(j4, am3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x00af A[EDGE_INSN: B:86:0x00af->B:46:0x00af ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.e33 r(defpackage.r29 r24, int r25) {
        /*
            Method dump skipped, instructions count: 387
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xwe.r(r29, int):e33");
    }

    public static final mh8 s(float f2) {
        return new mh8(2, f2);
    }
}
