package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: abf  reason: default package */
/* loaded from: classes.dex */
public final class abf implements c82, hu1, g32, ura, dj1, z21, m8b, k9b, w35 {
    public static abf b;
    public final /* synthetic */ int a;
    public static final abf c = new abf(1);
    public static final /* synthetic */ abf d = new abf(2);
    public static final abf e = new abf(3);
    public static final abf f = new abf(4);
    public static final abf C = new abf(5);
    public static final /* synthetic */ abf D = new abf(6);
    public static final abf E = new abf(7);
    public static final /* synthetic */ abf F = new abf(8);
    public static final abf G = new abf(9);
    public static final h6a H = new h6a(0);
    public static final h6a I = new h6a(1);
    public static final h6a J = new h6a(2);
    public static final h6a K = new h6a(3);
    public static final h6a L = new h6a(4);
    public static final abf M = new abf(12);
    public static final /* synthetic */ abf N = new abf(13);
    public static final abf O = new abf(14);

    public /* synthetic */ abf(int i) {
        this.a = i;
    }

    public static void l(abf abfVar, gn8 gn8Var) {
        abfVar.getClass();
        File file = gn8Var.a;
        if (!file.mkdirs() && file.isFile()) {
            hfd.i(gn8Var, "Path already exists and it's a file: ");
        }
    }

    public static xu9 n(abf abfVar, List list, int i, int i2) {
        boolean z;
        char c2;
        long j;
        List<e27> list2;
        int i3;
        int i4;
        long j2;
        float floatValue;
        double d2;
        float f2;
        ArrayList arrayList;
        long j3;
        char c3 = ' ';
        long j4 = 4294967295L;
        long floatToRawIntBits = (Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(0.5f) & 4294967295L);
        if ((i2 & 8) != 0) {
            z = false;
        } else {
            z = true;
        }
        abfVar.getClass();
        float f3 = 360.0f;
        if (z) {
            jq6 t = tl1.t();
            ArrayList arrayList2 = new ArrayList(list.size());
            int size = list.size();
            int i5 = 0;
            while (i5 < size) {
                char c4 = c3;
                e27 e27Var = (e27) list.get(i5);
                abf abfVar2 = f27.a;
                long i6 = y78.i(e27Var.a, floatToRawIntBits);
                arrayList2.add(Float.valueOf((((float) Math.atan2(Float.intBitsToFloat((int) (i6 & j3)), Float.intBitsToFloat((int) (i6 >> c4)))) * 180.0f) / 3.1415927f));
                i5++;
                c3 = c4;
                j4 = j4;
            }
            c2 = c3;
            j = j4;
            ArrayList arrayList3 = new ArrayList(list.size());
            int size2 = list.size();
            for (int i7 = 0; i7 < size2; i7++) {
                arrayList3.add(Float.valueOf(y78.e(y78.i(((e27) list.get(i7)).a, floatToRawIntBits))));
            }
            int i8 = i * 2;
            float f4 = 360.0f / i8;
            for (int i9 = 0; i9 < i8; i9++) {
                Iterator it = tl1.w(list).iterator();
                while (true) {
                    sy5 sy5Var = (sy5) it;
                    if (sy5Var.c) {
                        int nextInt = sy5Var.nextInt();
                        int i10 = i9 % 2;
                        if (i10 != 0) {
                            nextInt = (list.size() - 1) - nextInt;
                        }
                        if (nextInt <= 0 && i10 != 0) {
                            f2 = f3;
                            arrayList = arrayList2;
                        } else {
                            abf abfVar3 = f27.a;
                            float f5 = i9 * f4;
                            if (i10 == 0) {
                                floatValue = ((Number) arrayList2.get(nextInt)).floatValue();
                            } else {
                                floatValue = (((Number) arrayList2.get(0)).floatValue() * 2.0f) + (f4 - ((Number) arrayList2.get(nextInt)).floatValue());
                            }
                            f2 = f3;
                            arrayList = arrayList2;
                            t.add(new e27(y78.j(y78.k(((Number) arrayList3.get(nextInt)).floatValue(), (Float.floatToRawIntBits((float) Math.sin(d2)) & j) | (Float.floatToRawIntBits((float) Math.cos((((f5 + floatValue) / f3) * 2.0f) * 3.1415927f)) << c2)), floatToRawIntBits), ((e27) list.get(nextInt)).b));
                        }
                        f3 = f2;
                        arrayList2 = arrayList;
                    }
                }
            }
            list2 = tl1.r(t);
        } else {
            c2 = ' ';
            j = 4294967295L;
            float f6 = 3.1415927f;
            int size3 = list.size();
            ty5 F2 = dce.F(0, size3 * i);
            ArrayList arrayList4 = new ArrayList(tl1.s(F2, 10));
            Iterator it2 = F2.iterator();
            while (true) {
                sy5 sy5Var2 = (sy5) it2;
                if (!sy5Var2.c) {
                    break;
                }
                int nextInt2 = sy5Var2.nextInt();
                abf abfVar4 = f27.a;
                int i11 = nextInt2 % size3;
                long i12 = y78.i(((e27) list.get(i11)).a, floatToRawIntBits);
                double d3 = ((((nextInt2 / size3) * 360.0f) / i) / 360.0f) * 2.0f * f6;
                long j5 = floatToRawIntBits;
                float intBitsToFloat = (Float.intBitsToFloat((int) (i12 >> 32)) * ((float) Math.cos(d3))) - (Float.intBitsToFloat((int) (i12 & 4294967295L)) * ((float) Math.sin(d3)));
                arrayList4.add(new e27(y78.j((Float.floatToRawIntBits((Float.intBitsToFloat(i4) * ((float) Math.cos(d3))) + (Float.intBitsToFloat(i3) * ((float) Math.sin(d3)))) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), j5), ((e27) list.get(i11)).b));
                floatToRawIntBits = j5;
                f6 = 3.1415927f;
            }
            list2 = arrayList4;
        }
        long j6 = floatToRawIntBits;
        int size4 = list2.size() * 2;
        float[] fArr = new float[size4];
        for (int i13 = 0; i13 < size4; i13++) {
            long j7 = ((e27) list2.get(i13 / 2)).a;
            if (i13 % 2 == 0) {
                j2 = j7 >> c2;
            } else {
                j2 = j7 & j;
            }
            fArr[i13] = Float.intBitsToFloat((int) j2);
        }
        jq6 t2 = tl1.t();
        for (e27 e27Var2 : list2) {
            t2.add(e27Var2.b);
        }
        return hud.g(fArr, x72.c, tl1.r(t2), Float.intBitsToFloat((int) (j6 >> c2)), Float.intBitsToFloat((int) (j6 & j)));
    }

    public static View o(View view, int i) {
        if (Build.VERSION.SDK_INT < 29) {
            Method method = rg.l1;
            if (method == null) {
                method = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", null);
                rg.l1 = method;
                method.setAccessible(true);
            }
            if (c16.i(method.invoke(view, null), Integer.valueOf(i))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View o = o(viewGroup.getChildAt(i2), i);
                    if (o != null) {
                        return o;
                    }
                }
            }
        }
        return null;
    }

    public static xu9 r() {
        xu9 xu9Var = f27.o;
        if (xu9Var == null) {
            xu9 b2 = w92.w(7, 0.75f, f27.c).c(new f7(f27.e, 2)).b();
            f27.o = b2;
            return b2;
        }
        return xu9Var;
    }

    public static xu9 s() {
        xu9 xu9Var = f27.p;
        if (xu9Var == null) {
            xu9 b2 = w92.w(9, 0.8f, f27.c).c(new f7(f27.e, 2)).b();
            f27.p = b2;
            return b2;
        }
        return xu9Var;
    }

    public static boolean t() {
        Object obj;
        Method method;
        try {
            if (rg.f1 == null) {
                rg.f1 = Class.forName("android.os.SystemProperties");
            }
            Boolean bool = null;
            if (rg.g1 == null) {
                Class cls = rg.f1;
                if (cls != null) {
                    method = cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE);
                } else {
                    method = null;
                }
                rg.g1 = method;
            }
            Method method2 = rg.g1;
            if (method2 != null) {
                obj = method2.invoke(null, "debug.layout", Boolean.FALSE);
            } else {
                obj = null;
            }
            if (obj instanceof Boolean) {
                bool = obj;
            }
            return c16.i(bool, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0045, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0075, code lost:
        if (r11 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00a2, code lost:
        if (r10 != (-1)) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean v(defpackage.iq3 r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 240
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abf.v(iq3, android.text.Editable, int, int, boolean):boolean");
    }

    public static Object w(tva tvaVar) {
        tvaVar.getClass();
        if (tvaVar instanceof hva) {
            return hva.a;
        }
        if (tvaVar instanceof ova) {
            return ova.a;
        }
        if (tvaVar instanceof rva) {
            return rva.a;
        }
        if (tvaVar instanceof qva) {
            return qva.a;
        }
        if (tvaVar instanceof lva) {
            return lva.a;
        }
        if (tvaVar instanceof jva) {
            return cm9.a(jva.class);
        }
        if (tvaVar instanceof iva) {
            return cm9.a(iva.class);
        }
        if (tvaVar instanceof pva) {
            return tvaVar;
        }
        if (tvaVar instanceof mva) {
            return tvaVar;
        }
        if (tvaVar instanceof sva) {
            return tvaVar;
        }
        if (tvaVar instanceof nva) {
            return tvaVar;
        }
        if (tvaVar instanceof kva) {
            return tvaVar;
        }
        xk5.o();
        return null;
    }

    public static boolean x(tva tvaVar, tva tvaVar2) {
        tvaVar.getClass();
        tvaVar2.getClass();
        return w(tvaVar).equals(w(tvaVar2));
    }

    public static mg8 z(abf abfVar, gn8 gn8Var) {
        abfVar.getClass();
        FileOutputStream fileOutputStream = new FileOutputStream(gn8Var.a, false);
        int i = w56.a;
        return new mg8(fileOutputStream);
    }

    public n21 A(gn8 gn8Var) {
        gn8Var.getClass();
        FileInputStream fileInputStream = new FileInputStream(gn8Var.a);
        int i = w56.a;
        return new n21(fileInputStream);
    }

    @Override // defpackage.z21
    public byte[] a(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // defpackage.w35
    public boolean b(cna cnaVar) {
        int i;
        z63 z63Var = cnaVar.a;
        int i2 = Integer.MAX_VALUE;
        if (z63Var instanceof w63) {
            i = ((w63) z63Var).a;
        } else {
            i = Integer.MAX_VALUE;
        }
        if (i > 100) {
            z63 z63Var2 = cnaVar.b;
            if (z63Var2 instanceof w63) {
                i2 = ((w63) z63Var2).a;
            }
            if (i2 > 100) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.m8b
    public boolean c(vq4 vq4Var) {
        String str = vq4Var.o;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override // defpackage.k9b
    public l9b d(j9b j9bVar) {
        return new nt4((Context) j9bVar.c, (String) j9bVar.d, (ny0) j9bVar.e, j9bVar.a, j9bVar.b);
    }

    @Override // defpackage.g32
    public boolean e(e32 e32Var) {
        e32Var.getClass();
        if (!e32Var.a(a32.a)) {
            if (!e32Var.b.isEmpty()) {
                e32Var = new e32(e32Var.c, e32Var.d, ks3.a);
            }
            String e32Var2 = e32Var.toString();
            if (!k4b.A0(e32Var2, "application/", true) || !r4b.I(e32Var2, "+json", true)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.m8b
    public o8b f(vq4 vq4Var) {
        String str = vq4Var.o;
        List list = vq4Var.r;
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c2 = '\b';
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    return new qu1(list);
                case 1:
                    return new oaa(20);
                case 2:
                    return new n07(26);
                case 3:
                    return new cid();
                case 4:
                    return new erc(list);
                case 5:
                    return new jxa(list);
                case 6:
                    return new ved(list);
                case 7:
                    return new s6b();
                case '\b':
                    return new yoc();
            }
        }
        vs.m(s21.m("Unsupported MIME type: ", str));
        return null;
    }

    @Override // defpackage.w35
    public boolean g() {
        boolean z;
        synchronized (lc4.a) {
            try {
                int i = lc4.c;
                lc4.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > lc4.d + 30000) {
                    boolean z2 = false;
                    lc4.c = 0;
                    lc4.d = SystemClock.uptimeMillis();
                    String[] list = lc4.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    if (list.length < 800) {
                        z2 = true;
                    }
                    lc4.e = z2;
                }
                z = lc4.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.m8b
    public int h(vq4 vq4Var) {
        String str = vq4Var.o;
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c2 = '\b';
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                    return 2;
                case 5:
                    return 1;
                case 6:
                    return 2;
                case 7:
                case '\b':
                    return 1;
            }
        }
        vs.m(s21.m("Unsupported MIME type: ", str));
        return 0;
    }

    public void i(nq7 nq7Var, float f2, float f3, wea weaVar, long j, rv4 rv4Var, final int i) {
        boolean z;
        final nq7 nq7Var2;
        final float f4;
        final float f5;
        final wea weaVar2;
        final long j2;
        wea weaVar3;
        long b2;
        kq7 kq7Var;
        final float f6;
        final float f7;
        rv4Var.g0(-731969307);
        int i2 = i | 9654;
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                kq7Var = nq7Var;
                f6 = f2;
                f7 = f3;
                weaVar3 = weaVar;
                b2 = j;
            } else {
                tza tzaVar = j27.a;
                weaVar3 = ((h27) rv4Var.j(tzaVar)).c.e;
                b2 = zl1.b(0.4f, ((h27) rv4Var.j(tzaVar)).a.s);
                kq7Var = kq7.a;
                f6 = 32.0f;
                f7 = 3.0f;
            }
            rv4Var.r();
            long j3 = b2;
            v9b.a(zbe.A(kq7Var, nae.e, 12.0f, 1), weaVar3, j3, 0L, nae.e, nae.e, null, jce.E(-560808726, new lu4() { // from class: ys0
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z2;
                    rv4 rv4Var2 = (rv4) obj;
                    int intValue = ((Integer) obj2).intValue();
                    if ((intValue & 3) != 2) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (rv4Var2.U(intValue & 1, z2)) {
                        fu0.a(pna.p(kq7.a, f6, f7), rv4Var2, 0);
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, 12582912, 120);
            weaVar2 = weaVar3;
            j2 = j3;
            nq7Var2 = kq7Var;
            f4 = f6;
            f5 = f7;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            f4 = f2;
            f5 = f3;
            weaVar2 = weaVar;
            j2 = j;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new lu4(nq7Var2, f4, f5, weaVar2, j2, i) { // from class: zs0
                public final /* synthetic */ nq7 b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ wea e;
                public final /* synthetic */ long f;

                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int p = xoe.p(196609);
                    abf.this.i(this.b, this.c, this.d, this.e, this.f, (rv4) obj, p);
                    return pvc.a;
                }
            };
        }
    }

    @Override // defpackage.hu1
    public Object j(yv yvVar) {
        switch (this.a) {
            case 4:
                Object h = yvVar.h(new mf9(jo6.class, Executor.class));
                h.getClass();
                return zj0.e((Executor) h);
            default:
                ArrayList arrayList = new ArrayList(yvVar.b(mf9.a(zvd.class)));
                am8.u("No delegate creator registered.", !arrayList.isEmpty());
                Collections.sort(arrayList, kn4.D);
                return new dne((Context) yvVar.a(Context.class), (zvd) arrayList.get(0));
        }
    }

    public void k(long j, nq7 nq7Var, float f2, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        kq7 kq7Var;
        float f3;
        rv4Var.g0(-941793476);
        if (rv4Var.e(j)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i | 432;
        if ((i3 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            kq7 kq7Var2 = kq7.a;
            fu0.a(nmd.v(pna.h(pna.f(kq7Var2, 1.0f), 1.0f), j, lre.g), rv4Var, 0);
            f3 = 1.0f;
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
            f3 = f2;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new xb3(this, j, kq7Var, f3, i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object m(int r5, int r6, defpackage.n42 r7, java.lang.String r8) {
        /*
            r4 = this;
            boolean r0 = r7 instanceof defpackage.o20
            if (r0 == 0) goto L13
            r0 = r7
            o20 r0 = (defpackage.o20) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            o20 r0 = new o20
            r0.<init>(r4, r7)
        L18:
            java.lang.Object r4 = r0.a
            int r7 = r0.c
            r1 = 1
            if (r7 == 0) goto L2c
            if (r7 != r1) goto L25
            defpackage.hre.r(r4)
            goto L3a
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.hre.r(r4)
            r0.c = r1
            java.lang.Object r4 = defpackage.owe.H(r5, r6, r0, r8)
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L3a
            return r5
        L3a:
            m20 r4 = (defpackage.m20) r4
            zra r5 = new zra
            r5.<init>(r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abf.m(int, int, n42, java.lang.String):java.lang.Object");
    }

    public xu9 p() {
        xu9 xu9Var = f27.n;
        if (xu9Var == null) {
            xu9 b2 = n(this, tl1.B(new e27((Float.floatToRawIntBits(0.723f) << 32) | (Float.floatToRawIntBits(0.884f) & 4294967295L), new x72(2, 0.394f)), new e27((Float.floatToRawIntBits(0.5f) << 32) | (Float.floatToRawIntBits(1.099f) & 4294967295L), new x72(2, 0.398f))), 6, 12).b();
            f27.n = b2;
            return b2;
        }
        return xu9Var;
    }

    @Override // defpackage.dj1
    public void q(re5 re5Var, aab aabVar) {
        re5Var.getClass();
        re5Var.d.g(ah5.m, new y8((mu4) aabVar, null, 1));
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "NoDeclaredBrand";
            default:
                return super.toString();
        }
    }

    public xu9 u() {
        xu9 xu9Var = f27.q;
        if (xu9Var == null) {
            xu9 b2 = n(this, tl1.B(new e27((Float.floatToRawIntBits(0.193f) << 32) | (Float.floatToRawIntBits(0.277f) & 4294967295L), new x72(2, 0.053f)), new e27((Float.floatToRawIntBits(0.176f) << 32) | (Float.floatToRawIntBits(0.055f) & 4294967295L), new x72(2, 0.053f))), 10, 12).b();
            f27.q = b2;
            return b2;
        }
        return xu9Var;
    }

    public jq6 y(gn8 gn8Var) {
        File file = gn8Var.a;
        if (file.exists()) {
            if (file.isDirectory()) {
                jq6 t = tl1.t();
                String[] list = file.list();
                if (list != null) {
                    for (String str : list) {
                        str.getClass();
                        t.add(sye.b(gn8Var, str));
                    }
                }
                return tl1.r(t);
            }
            fb4.n(file.getAbsolutePath(), "Not a directory: ");
            return null;
        }
        throw new FileNotFoundException(file.getAbsolutePath());
    }
}
