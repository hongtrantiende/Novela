package defpackage;

import android.content.Context;
import androidx.work.WorkerParameters;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.StringReader;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: cne  reason: default package */
/* loaded from: classes.dex */
public final class cne implements c82, dj1, rt0, nkc, p4, gz, x21, SuccessContinuation, g32 {
    public static volatile bpd I;
    public final /* synthetic */ int a;
    public static final /* synthetic */ cne b = new cne(1);
    public static final /* synthetic */ cne c = new cne(2);
    public static final cne d = new cne(3);
    public static final cne e = new cne(4);
    public static final /* synthetic */ cne f = new cne(5);
    public static final cne C = new cne(6);
    public static final cne D = new cne(7);
    public static final cne E = new cne(9);
    public static final cne F = new cne(10);
    public static final p1a G = new p1a(8);
    public static final cne H = new cne(12);
    public static final /* synthetic */ cne J = new cne(14);

    public /* synthetic */ cne(int i) {
        this.a = i;
    }

    public static final void d(StringBuilder sb, fwb fwbVar) {
        ap3 ap3Var = cp3.E;
        String H2 = fwbVar.H();
        cp3 cp3Var = fwbVar.a;
        if (cp3Var != null) {
            int i = 0;
            while ((cp3Var.e.d & 64) == 0) {
                cp3Var = cp3Var.a;
                if (cp3Var == null) {
                    cp3Var = null;
                }
                i++;
                if (i < 6) {
                    if (cp3Var == null) {
                    }
                }
            }
            sb.append(H2);
        }
        if (!(fwbVar instanceof l41)) {
            String[] strArr = d4b.a;
            int i2 = fwb.e;
            d4b.a(H2, sb, tye.k(sb));
            return;
        }
        sb.append(H2);
    }

    public static final String g(char[] cArr, String[] strArr, int i, int i2) {
        s26 s26Var = vc1.J;
        if (i2 > 12) {
            cArr.getClass();
            return r4b.D(cArr, i, i2 + i);
        } else if (i2 < 1) {
            return "";
        } else {
            int i3 = i2 + i;
            int i4 = 0;
            int i5 = 0;
            for (int i6 = i; i6 < i3; i6++) {
                cArr.getClass();
                i5 = (i5 * 31) + cArr[i6];
            }
            int i7 = i5 & 511;
            strArr.getClass();
            String str = strArr[i7];
            if (str != null && i2 == str.length()) {
                int i8 = i;
                while (true) {
                    int i9 = i2 - 1;
                    if (i2 != 0) {
                        cArr.getClass();
                        int i10 = i8 + 1;
                        int i11 = i4 + 1;
                        if (cArr[i8] != str.charAt(i4)) {
                            break;
                        }
                        i8 = i10;
                        i2 = i9;
                        i4 = i11;
                    } else {
                        return str;
                    }
                }
            }
            cArr.getClass();
            String D2 = r4b.D(cArr, i, i3);
            strArr[i7] = D2;
            return D2;
        }
    }

    public static final int h(int i) {
        if (48 <= i && i < 58) {
            return i - 48;
        }
        if (97 <= i && i < 103) {
            return i - 87;
        }
        if (65 <= i && i < 71) {
            return i - 55;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
        r6 = r6 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int i(defpackage.ljc r5, int r6, int r7) {
        /*
            int r0 = r5.a
            r1 = 9
            int r0 = r0 - r1
            int r7 = r7 + r6
            int r7 = java.lang.Math.min(r0, r7)
            r0 = 0
            int r6 = java.lang.Math.max(r0, r6)
        Lf:
            if (r6 > r7) goto L2b
            r2 = r0
        L12:
            if (r2 >= r1) goto L2a
            int r3 = r6 + r2
            byte r3 = r5.c(r3)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r4 = "endstream"
            char r4 = r4.charAt(r2)
            if (r3 == r4) goto L27
            int r6 = r6 + 1
            goto Lf
        L27:
            int r2 = r2 + 1
            goto L12
        L2a:
            return r6
        L2b:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cne.i(ljc, int, int):int");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
        r7 = r7 - 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int j(defpackage.ljc r5, int r6, int r7) {
        /*
            int r0 = r5.a
            int r7 = java.lang.Math.min(r7, r0)
            r0 = 9
            int r7 = r7 - r0
            r1 = 0
            int r6 = java.lang.Math.max(r1, r6)
        Le:
            if (r7 < r6) goto L2a
            r2 = r1
        L11:
            if (r2 >= r0) goto L29
            int r3 = r7 + r2
            byte r3 = r5.c(r3)
            r3 = r3 & 255(0xff, float:3.57E-43)
            java.lang.String r4 = "startxref"
            char r4 = r4.charAt(r2)
            if (r3 == r4) goto L26
            int r7 = r7 + (-1)
            goto Le
        L26:
            int r2 = r2 + 1
            goto L11
        L29:
            return r7
        L2a:
            r5 = -1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cne.j(ljc, int, int):int");
    }

    public static final String l(p88 p88Var) {
        int c2;
        p88Var.B();
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = p88Var.a;
            if (i >= p88Var.b || !((48 <= (c2 = ((ljc) p88Var.c).c(i) & 255) && c2 < 58) || c2 == 43 || c2 == 45 || c2 == 46)) {
                break;
            }
            sb.append((char) c2);
            p88Var.a++;
        }
        if (sb.length() == 0) {
            return null;
        }
        return sb.toString();
    }

    public static final int m(ljc ljcVar, int i) {
        int i2 = i - 1;
        if (i2 >= 0 && (ljcVar.c(i2) & 255) == 10) {
            i--;
        }
        int i3 = i - 1;
        if (i3 >= 0 && (ljcVar.c(i3) & 255) == 13) {
            return i - 1;
        }
        return i;
    }

    public static b34 r(String str) {
        str.getClass();
        return new b34(y24.D, 0, 0, z24.c, str, 38);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17, types: [java.lang.Object] */
    public static oa6 s(String str) {
        bpd bpdVar;
        if (I == null) {
            bpd bpdVar2 = null;
            try {
                ServiceLoader load = ServiceLoader.load(bpd.class, bpd.class.getClassLoader());
                load.getClass();
                bpdVar = (bpd) sl1.d0(load);
            } catch (ServiceConfigurationError unused) {
                bpdVar = null;
            }
            if (bpdVar == null) {
                try {
                    Object newInstance = Class.forName("nl.adaptivity.xmlutil.StAXStreamingFactory").getConstructor(null).newInstance(null);
                    newInstance.getClass();
                    bpdVar = (bpd) newInstance;
                } catch (ClassNotFoundException unused2) {
                    bpdVar = null;
                }
            }
            if (bpdVar == null) {
                try {
                    Object newInstance2 = Class.forName("nl.adaptivity.xmlutil.AndroidStreamingFactory").getConstructor(null).newInstance(null);
                    newInstance2.getClass();
                    bpdVar2 = (bpd) newInstance2;
                } catch (ClassNotFoundException unused3) {
                }
                bpdVar = bpdVar2;
            }
            if (bpdVar == 0) {
                bpdVar = new Object();
            }
            I = bpdVar;
        }
        return new oa6(new StringReader(str));
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r2 != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List t(defpackage.x56 r7) {
        /*
            ks3 r0 = defpackage.ks3.a
            r7.getClass()
            ljc r1 = new ljc     // Catch: java.lang.Throwable -> L59
            long r2 = r7.size()     // Catch: java.lang.Throwable -> L59
            r4 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L13
            r2 = r4
        L13:
            int r2 = (int) r2     // Catch: java.lang.Throwable -> L59
            r3 = 0
            r1.<init>(r7, r3, r2)     // Catch: java.lang.Throwable -> L59
            yv r7 = defpackage.aze.r(r1)     // Catch: java.lang.Throwable -> L21
            java.util.List r7 = r7.p()     // Catch: java.lang.Throwable -> L21
            goto L28
        L21:
            r7 = move-exception
            gs9 r2 = new gs9     // Catch: java.lang.Throwable -> L59
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L59
            r7 = r2
        L28:
            boolean r2 = r7 instanceof defpackage.gs9     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L2e
            r7 = r3
        L2e:
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> L59
            if (r7 == 0) goto L38
            boolean r2 = r7.isEmpty()     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L60
        L38:
            yv r1 = defpackage.aze.q(r1)     // Catch: java.lang.Throwable -> L41
            java.util.List r1 = r1.p()     // Catch: java.lang.Throwable -> L41
            goto L48
        L41:
            r1 = move-exception
            gs9 r2 = new gs9     // Catch: java.lang.Throwable -> L59
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L59
            r1 = r2
        L48:
            boolean r2 = r1 instanceof defpackage.gs9     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L4e
            goto L4f
        L4e:
            r3 = r1
        L4f:
            java.util.List r3 = (java.util.List) r3     // Catch: java.lang.Throwable -> L59
            if (r3 == 0) goto L55
            r7 = r3
            goto L60
        L55:
            if (r7 != 0) goto L60
            r7 = r0
            goto L60
        L59:
            r7 = move-exception
            gs9 r1 = new gs9
            r1.<init>(r7)
            r7 = r1
        L60:
            java.lang.Throwable r1 = defpackage.hs9.a(r7)
            if (r1 != 0) goto L67
            r0 = r7
        L67:
            java.util.List r0 = (java.util.List) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cne.t(x56):java.util.List");
    }

    public static boolean u(ljc ljcVar, int i, String str) {
        if (i >= 0 && str.length() + i <= ljcVar.a) {
            int length = str.length();
            for (int i2 = 0; i2 < length; i2++) {
                if ((ljcVar.c(i + i2) & 255) == str.charAt(i2)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.x21
    public byte[] a(byte[] bArr, int i, int i2) {
        return Arrays.copyOfRange(bArr, i, i2 + i);
    }

    @Override // defpackage.nkc
    public Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override // defpackage.fz, defpackage.jz
    public float b() {
        return nae.e;
    }

    @Override // defpackage.rt0
    public long c(z5a z5aVar, int i) {
        String str = z5aVar.f.a.a.b;
        return sze.a(jqe.m(str, i), jqe.l(str, i));
    }

    @Override // defpackage.g32
    public boolean e(e32 e32Var) {
        e32Var.getClass();
        return true;
    }

    @Override // defpackage.fz
    public void f(r13 r13Var, int i, int[] iArr, tc6 tc6Var, int[] iArr2) {
        if (tc6Var == tc6.a) {
            lz.c(i, iArr, iArr2, false);
        } else {
            lz.c(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.jz
    public void k(r13 r13Var, int i, int[] iArr, int[] iArr2) {
        lz.c(i, iArr, iArr2, false);
    }

    public lr6 n(Context context, String str, WorkerParameters workerParameters) {
        context.getClass();
        str.getClass();
        workerParameters.getClass();
        try {
            Class<? extends U> asSubclass = Class.forName(str).asSubclass(lr6.class);
            asSubclass.getClass();
            try {
                Object newInstance = asSubclass.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                newInstance.getClass();
                lr6 lr6Var = (lr6) newInstance;
                if (!lr6Var.d) {
                    return lr6Var;
                }
                String name = getClass().getName();
                throw new IllegalStateException("WorkerFactory (" + name + ") returned an instance of a ListenableWorker (" + str + ") which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.");
            } catch (Throwable th) {
                r95.n().k(end.a, "Could not instantiate ".concat(str), th);
                throw th;
            }
        } catch (Throwable th2) {
            r95.n().k(end.a, "Invalid class: ".concat(str), th2);
            throw th2;
        }
    }

    public Object o(Object obj) {
        Map gs9Var;
        Integer num;
        int t;
        Integer num2;
        int i;
        Character c0;
        int t2;
        Character c02;
        String str = (String) obj;
        Map map = ls3.a;
        if (str.length() == 0) {
            return map;
        }
        try {
            s46 s46Var = v46.a;
            s46Var.getClass();
            c4b c4bVar = c4b.a;
            gs9Var = (Map) s46Var.a(new b45(c4bVar, c4bVar, 1), str);
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        Throwable a = hs9.a(gs9Var);
        if (a != null) {
            String message = a.getMessage();
            if (message == null) {
                message = "";
            }
            String concat = "Failed to decode string map from database, using fallback parser: ".concat(message);
            if (jy.a()) {
                kw6 kw6Var = kw6.b;
                iea ieaVar = iea.e;
                if (kw6Var.a.a.compareTo(ieaVar) <= 0) {
                    kw6Var.a(ieaVar, "Log", concat, null);
                }
            }
            String obj2 = k4b.N0(str).toString();
            if (obj2.length() >= 2 && k4b.a0(obj2) == '{' && k4b.k0(obj2) == '}') {
                Map linkedHashMap = new LinkedHashMap();
                int i2 = 1;
                while (i2 < obj2.length() - 1) {
                    while (i2 < obj2.length() && (nqe.y(obj2.charAt(i2)) || obj2.charAt(i2) == ',')) {
                        i2++;
                    }
                    if (i2 >= obj2.length() - 1 || obj2.charAt(i2) != '\"') {
                        break;
                    }
                    int i3 = i2 + 1;
                    for (int i4 = i3; i4 < obj2.length(); i4++) {
                        if (obj2.charAt(i4) == '\"' && ((c02 = k4b.c0(i4 - 1, obj2)) == null || c02.charValue() != '\\')) {
                            num = Integer.valueOf(i4);
                            break;
                        }
                    }
                    num = null;
                    if (num == null) {
                        break;
                    }
                    int intValue = num.intValue();
                    String substring = obj2.substring(i3, intValue);
                    int t3 = cbe.t(intValue + 1, obj2);
                    if (t3 >= obj2.length() - 1 || obj2.charAt(t3) != ':' || (t = cbe.t(t3 + 1, obj2)) >= obj2.length() - 1 || obj2.charAt(t) != '\"') {
                        break;
                    }
                    int i5 = t + 1;
                    for (int i6 = i5; i6 < obj2.length(); i6++) {
                        if (obj2.charAt(i6) == '\"' && (((c0 = k4b.c0(i6 - 1, obj2)) == null || c0.charValue() != '\\') && ((t2 = cbe.t(i6 + 1, obj2)) >= obj2.length() || obj2.charAt(t2) == ',' || obj2.charAt(t2) == '}'))) {
                            num2 = Integer.valueOf(i6);
                            break;
                        }
                    }
                    num2 = null;
                    if (num2 == null) {
                        break;
                    }
                    int intValue2 = num2.intValue();
                    String substring2 = obj2.substring(i5, intValue2);
                    StringBuilder sb = new StringBuilder(substring2.length());
                    int i7 = 0;
                    while (i7 < substring2.length()) {
                        char charAt = substring2.charAt(i7);
                        if (charAt == '\\' && (i = i7 + 1) < substring2.length()) {
                            char charAt2 = substring2.charAt(i);
                            if (charAt2 != '\"') {
                                if (charAt2 != '\\') {
                                    if (charAt2 != 'b') {
                                        if (charAt2 != 'f') {
                                            if (charAt2 != 'n') {
                                                if (charAt2 != 'r') {
                                                    if (charAt2 != 't') {
                                                        sb.append(charAt2);
                                                    } else {
                                                        sb.append('\t');
                                                    }
                                                } else {
                                                    sb.append('\r');
                                                }
                                            } else {
                                                sb.append('\n');
                                            }
                                        } else {
                                            sb.append('\f');
                                        }
                                    } else {
                                        sb.append('\b');
                                    }
                                } else {
                                    sb.append('\\');
                                }
                            } else {
                                sb.append('\"');
                            }
                            i7 += 2;
                        } else {
                            sb.append(charAt);
                            i7++;
                        }
                    }
                    linkedHashMap.put(substring, sb.toString());
                    i2 = cbe.t(intValue2 + 1, obj2);
                }
                map = linkedHashMap;
            }
            gs9Var = map;
        }
        return (Map) gs9Var;
    }

    public Object p(Object obj) {
        Map map = (Map) obj;
        map.getClass();
        s46 s46Var = v46.a;
        s46Var.getClass();
        c4b c4bVar = c4b.a;
        return s46Var.b(new b45(c4bVar, c4bVar, 1), map);
    }

    @Override // defpackage.dj1
    public void q(re5 re5Var, aab aabVar) {
        switch (this.a) {
            case 9:
                re5Var.getClass();
                re5Var.C.g(ah5.h, new x8((lu4) aabVar, null, 1));
                return;
            default:
                re5Var.getClass();
                re5Var.d.g(ah5.l, new me((ou4) aabVar, (m42) null, 10));
                return;
        }
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj) {
        Void r1 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    public String toString() {
        switch (this.a) {
            case 16:
                return "Arrangement#SpaceEvenly";
            default:
                return super.toString();
        }
    }
}
