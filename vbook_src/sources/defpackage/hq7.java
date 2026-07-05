package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hq7  reason: default package */
/* loaded from: classes3.dex */
public class hq7 implements kg9, c82, y22 {
    public static m96 J;
    public static final ok0 a = new ok0(-1.0f, -1.0f);
    public static final ok0 b = new ok0(nae.e, -1.0f);
    public static final ok0 c = new ok0(1.0f, -1.0f);
    public static final ok0 d = new ok0(-1.0f, nae.e);
    public static final ok0 e = new ok0(nae.e, nae.e);
    public static final ok0 f = new ok0(1.0f, nae.e);
    public static final ok0 C = new ok0(-1.0f, 1.0f);
    public static final ok0 D = new ok0(nae.e, 1.0f);
    public static final ok0 E = new ok0(1.0f, 1.0f);
    public static final vs F = new vs(21);
    public static final hq7 G = new Object();
    public static final hq7 H = new Object();
    public static final hq7 I = new Object();
    public static final hq7 K = new Object();
    public static final hq7 L = new Object();
    public static final /* synthetic */ hq7 M = new Object();
    public static final jw2 N = new Object();
    public static final /* synthetic */ hq7 O = new Object();
    public static final ph9 P = new Object();
    public static final hq7 Q = new Object();
    public static final /* synthetic */ hq7 R = new Object();
    public static final hq7 S = new Object();
    public static final p1a T = new p1a(29);
    public static final hq7 U = new Object();

    public static final String a(String str, String str2) {
        if (str == null) {
            return str2;
        }
        return str + ':' + str2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(1:16)|17|18|19|20|21|22|23|(3:25|26|27)(10:29|30|31|32|(1:14)|45|(0)(0)|(0)|50|51)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:16|17|18|19|20|21|22|23|(3:25|26|27)(10:29|30|31|32|(1:14)|45|(0)(0)|(0)|50|51)) */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0102, code lost:
        r14 = r9;
        r9 = r8;
        r8 = r14;
        r14 = r10;
        r10 = r13;
        r13 = r2;
        r2 = r12;
        r12 = r1;
        r1 = r11;
        r11 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010d, code lost:
        r5 = r19;
        r1 = r20;
        r10 = r21;
        r2 = r22;
        r0 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0150, code lost:
        r0 = r11;
        r11 = r1;
        r1 = r13;
        r13 = r10;
        r10 = r5;
        r5 = r0;
        r0 = r9;
        r9 = r8;
        r8 = r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0173  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x00e8 -> B:20:0x0096). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0150 -> B:13:0x004f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.ps r18, defpackage.oyb r19, defpackage.nn r20, java.util.List r21, int r22, int r23, int r24, defpackage.n42 r25) {
        /*
            Method dump skipped, instructions count: 401
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq7.b(ps, oyb, nn, java.util.List, int, int, int, n42):java.lang.Object");
    }

    public static final boolean d(List list, cp3 cp3Var) {
        int i;
        int size = list.size();
        int i2 = size - 1;
        if (i2 >= 256) {
            i = size - 257;
        } else {
            i = 0;
        }
        if (i <= i2) {
            while (((cp3) list.get(i2)) != cp3Var) {
                if (i2 != i) {
                    i2--;
                }
            }
            return true;
        }
        return false;
    }

    public static final int f(Reader reader, char[] cArr) {
        int length = cArr.length;
        int read = reader.read(cArr, 0, length);
        if (read < 0) {
            return -1;
        }
        while (read < length) {
            int read2 = reader.read(cArr, read, length - read);
            if (read2 < 0) {
                break;
            }
            read += read2;
        }
        return read;
    }

    public static ab i(String str) {
        Object obj;
        str.getClass();
        qu3 qu3Var = ab.f;
        qu3Var.getClass();
        b2 b2Var = new b2(qu3Var, 0);
        while (true) {
            if (b2Var.hasNext()) {
                obj = b2Var.next();
                ab abVar = (ab) obj;
                if (!abVar.a.equalsIgnoreCase(str)) {
                    if (r4b.J(abVar.name(), str, true)) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        ab abVar2 = (ab) obj;
        if (abVar2 == null) {
            return ab.d;
        }
        return abVar2;
    }

    public static mv j(String str) {
        String str2;
        mv mvVar = null;
        if (str != null) {
            str2 = k4b.N0(str).toString();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        qu3 qu3Var = mv.f;
        qu3Var.getClass();
        b2 b2Var = new b2(qu3Var, 0);
        while (true) {
            if (!b2Var.hasNext()) {
                break;
            }
            Object next = b2Var.next();
            if (((mv) next).a.equalsIgnoreCase(str2)) {
                mvVar = next;
                break;
            }
        }
        mv mvVar2 = mvVar;
        if (mvVar2 == null) {
            return mv.c;
        }
        return mvVar2;
    }

    public static yk8 l(lwb lwbVar, int i, float f2) {
        int i2;
        int i3 = lwbVar.a;
        mn mnVar = lwbVar.e;
        if (f2 < nae.e && mnVar != null) {
            ArrayList arrayList = mnVar.a;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                if ((mnVar.b(i4) + ((jvb) arrayList.get(i4)).d) / 2.0f > (-f2)) {
                    i2 = ((jvb) arrayList.get(i4)).a + i3;
                    break;
                }
            }
        }
        i2 = i3;
        int i5 = lwbVar.b;
        float f3 = i;
        if (lwbVar.d + f2 > f3 && mnVar != null) {
            float f4 = (-f2) + f3;
            ArrayList arrayList2 = mnVar.a;
            int size2 = arrayList2.size();
            while (true) {
                size2--;
                if (-1 >= size2) {
                    break;
                } else if (mnVar.b(size2) <= f4) {
                    i5 = ((jvb) arrayList2.get(size2)).b + i3;
                    break;
                }
            }
        }
        return new yk8(Integer.valueOf(i2), Integer.valueOf(i5));
    }

    public static boolean n(cp3 cp3Var) {
        wjb wjbVar = cp3Var.e;
        String str = wjbVar.c;
        String str2 = wjbVar.b;
        int hashCode = str.hashCode();
        if (hashCode != -2078206768) {
            if (hashCode != -296110905) {
                if (hashCode == 1725132794 && str.equals("http://www.w3.org/1998/Math/MathML")) {
                    String[] strArr = d4b.a;
                    return d4b.c(str2, ed5.J);
                }
                return false;
            } else if (str.equals("http://www.w3.org/2000/svg")) {
                String[] strArr2 = d4b.a;
                return d4b.c(str2, ed5.L);
            } else {
                return false;
            }
        } else if (!str.equals("http://www.w3.org/1999/xhtml")) {
            return false;
        } else {
            String[] strArr3 = d4b.a;
            return d4b.c(str2, ed5.I);
        }
    }

    @Override // defpackage.kg9
    public float c(float f2) {
        double t;
        double d2 = f2;
        if (d2 <= 0.04045d) {
            t = d2 / 12.92d;
        } else {
            t = ch0.t((d2 + 0.055d) / 1.055d, 2.4d);
        }
        return (float) t;
    }

    @Override // defpackage.y22
    public long e(long j, long j2) {
        if (mna.b(j) <= mna.b(j2) && mna.a(j) <= mna.a(j2)) {
            return mz9.a(1.0f, 1.0f);
        }
        float min = Math.min(mna.b(j2) / mna.b(j), mna.a(j2) / mna.a(j));
        return mz9.a(min, min);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
        if (r3.contains(r5) != false) goto L73;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ff  */
    /* JADX WARN: Type inference failed for: r0v10, types: [ly0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [ly0, java.lang.Object, psa] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object g(java.lang.Long r18, defpackage.e32 r19, defpackage.n45 r20, defpackage.s11 r21, defpackage.n42 r22) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq7.g(java.lang.Long, e32, n45, s11, n42):java.lang.Object");
    }

    @Override // defpackage.kg9
    public float h(float f2) {
        double t;
        double d2 = f2;
        if (d2 <= 0.0031308d) {
            t = d2 * 12.92d;
        } else {
            t = (ch0.t(d2, 0.4166666666666667d) * 1.055d) - 0.055d;
        }
        return (float) t;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable k(defpackage.n42 r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.rv6
            if (r0 == 0) goto L13
            r0 = r5
            rv6 r0 = (defpackage.rv6) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            rv6 r0 = new rv6
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r4 = r0.b
            int r5 = r0.d
            r1 = 0
            r2 = 1
            if (r5 == 0) goto L2e
            if (r5 != r2) goto L28
            q36 r5 = r0.a
            defpackage.hre.r(r4)
            goto L44
        L28:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            return r1
        L2e:
            defpackage.hre.r(r4)
            q36 r5 = defpackage.r36.d
            r0.a = r5
            r0.d = r2
            tza r4 = defpackage.fr9.a
            java.lang.String r4 = "composeResources/com.reader.resources/files/all_language.json"
            java.lang.Object r4 = defpackage.ns2.b(r4)
            n82 r0 = defpackage.n82.a
            if (r4 != r0) goto L44
            return r0
        L44:
            byte[] r4 = (byte[]) r4
            java.lang.String r4 = defpackage.r4b.F(r4)
            k46 r4 = r5.c(r4)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            t36 r4 = defpackage.l46.f(r4)
            java.util.List r4 = r4.a
            java.util.Iterator r4 = r4.iterator()
        L5d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto Laa
            java.lang.Object r0 = r4.next()
            k46 r0 = (defpackage.k46) r0
            java.lang.String r0 = defpackage.oc2.x(r0)
            if (r0 != 0) goto L70
            goto L5d
        L70:
            r2 = 95
            r3 = 45
            java.lang.String r0 = defpackage.rs8.j(r0, r2, r3)
            int r2 = r0.length()
            if (r2 != 0) goto L7f
            goto L87
        L7f:
            java.lang.String r2 = "und"
            boolean r2 = r0.equalsIgnoreCase(r2)
            if (r2 == 0) goto L88
        L87:
            r0 = r1
        L88:
            if (r0 != 0) goto L8c
            r2 = r1
            goto La3
        L8c:
            mv6 r2 = new mv6     // Catch: java.lang.Throwable -> L96
            n07 r0 = defpackage.xve.c(r0)     // Catch: java.lang.Throwable -> L96
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L96
            goto L9c
        L96:
            r0 = move-exception
            gs9 r2 = new gs9
            r2.<init>(r0)
        L9c:
            boolean r0 = r2 instanceof defpackage.gs9
            if (r0 == 0) goto La1
            r2 = r1
        La1:
            mv6 r2 = (defpackage.mv6) r2
        La3:
            if (r2 != 0) goto La6
            goto L5d
        La6:
            r5.add(r2)
            goto L5d
        Laa:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq7.k(n42):java.io.Serializable");
    }

    public Signature[] m(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.Serializable o(defpackage.ps r34, int r35, defpackage.oyb r36, float r37, defpackage.r13 r38, defpackage.nn r39, java.util.List r40, int r41, int r42, int r43, defpackage.n42 r44) {
        /*
            Method dump skipped, instructions count: 735
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hq7.o(ps, int, oyb, float, r13, nn, java.util.List, int, int, int, n42):java.io.Serializable");
    }
}
