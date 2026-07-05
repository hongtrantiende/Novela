package defpackage;

import com.google.firebase.components.ComponentRegistrar;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import nl.adaptivity.xmlutil.EventType;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: kh5  reason: default package */
/* loaded from: classes3.dex */
public final class kh5 implements gz0, os9, oi8, kg9, dj1, hu1, ju1, y22 {
    public static final nk0 a = new nk0(-1.0f, -1.0f);
    public static final nk0 b = new nk0(nae.e, -1.0f);
    public static final nk0 c = new nk0(1.0f, -1.0f);
    public static final nk0 d = new nk0(-1.0f, nae.e);
    public static final nk0 e = new nk0(nae.e, nae.e);
    public static final nk0 f = new nk0(1.0f, nae.e);
    public static final nk0 C = new nk0(-1.0f, 1.0f);
    public static final nk0 D = new nk0(nae.e, 1.0f);
    public static final nk0 E = new nk0(1.0f, 1.0f);
    public static final mk0 F = new mk0(-1.0f);
    public static final mk0 G = new mk0(nae.e);
    public static final mk0 H = new mk0(1.0f);
    public static final lk0 I = new lk0(-1.0f);
    public static final lk0 J = new lk0(nae.e);
    public static final lk0 K = new lk0(1.0f);
    public static final /* synthetic */ kh5 L = new Object();
    public static final z01 M = new z01(null);
    public static final kh5 N = new Object();
    public static final kh5 O = new Object();
    public static final tc6 P = tc6.a;
    public static final u13 Q = new u13(1.0f, 1.0f);
    public static final kh5 R = new Object();
    public static final kh5 S = new Object();
    public static final kh5 T = new Object();
    public static final kh5 U = new Object();
    public static final kh5 V = new Object();
    public static final kh5 W = new Object();
    public static final kh5 X = new Object();
    public static final p1a Y = new p1a(15);
    public static final p1a Z = new p1a(16);
    public static final kh5 a0 = new Object();
    public static final /* synthetic */ kh5 b0 = new Object();

    public static m9 i(String str) {
        Object obj;
        str.getClass();
        qu3 qu3Var = m9.C;
        qu3Var.getClass();
        b2 b2Var = new b2(qu3Var, 0);
        while (true) {
            if (b2Var.hasNext()) {
                obj = b2Var.next();
                m9 m9Var = (m9) obj;
                if (!m9Var.a.equalsIgnoreCase(str)) {
                    if (r4b.J(m9Var.name(), str, true)) {
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
        m9 m9Var2 = (m9) obj;
        if (m9Var2 == null) {
            return m9.e;
        }
        return m9Var2;
    }

    public static hw3 l(oa6 oa6Var) {
        StringBuilder sb = new StringBuilder();
        if (oa6Var.G().isTextElement()) {
            sb.append(oa6Var.I0());
        }
        while (true) {
            EventType next = oa6Var.next();
            if (next != EventType.END_ELEMENT) {
                switch (apd.a[next.ordinal()]) {
                    case 1:
                    case 2:
                        break;
                    case 3:
                        if (sb.length() == 0) {
                            break;
                        } else {
                            sb.append(oa6Var.I0());
                            break;
                        }
                    case 4:
                    case 5:
                    case 6:
                        sb.append(oa6Var.I0());
                        break;
                    default:
                        throw new IOException("Found unexpected child tag with type: " + next);
                }
            } else {
                return new hw3(sb.toString());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [ks3] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.util.ArrayList] */
    public static l89 m(oa6 oa6Var) {
        n89 n;
        try {
            ?? r2 = ks3.a;
            i0b i0bVar = null;
            String str = null;
            hw3 hw3Var = null;
            while (p17.l(oa6Var) && p17.j(oa6Var, "propstat")) {
                if (oa6Var.Q0()) {
                    String S2 = oa6Var.S();
                    switch (S2.hashCode()) {
                        case -892481550:
                            if (!S2.equals("status")) {
                                break;
                            } else {
                                i0bVar = r(oa6Var);
                                continue;
                            }
                        case -635114213:
                            if (!S2.equals("responsedescription")) {
                                break;
                            } else {
                                str = s(oa6Var);
                                continue;
                            }
                        case 3449699:
                            if (!S2.equals("prop")) {
                                break;
                            } else {
                                r2 = new ArrayList();
                                while (true) {
                                    if (!p17.l(oa6Var)) {
                                        continue;
                                    } else if (p17.j(oa6Var, "prop")) {
                                        if (oa6Var.Q0() && (n = n(oa6Var)) != null) {
                                            r2.add(n);
                                        }
                                    }
                                }
                            }
                            break;
                        case 96784904:
                            if (!S2.equals("error")) {
                                break;
                            } else {
                                hw3Var = l(oa6Var);
                                continue;
                            }
                        default:
                            continue;
                    }
                }
            }
            return new l89(r2, i0bVar, str, hw3Var);
        } catch (Throwable unused) {
            if (jy.a()) {
                kw6 kw6Var = kw6.b;
                iea ieaVar = iea.e;
                if (kw6Var.a.a.compareTo(ieaVar) <= 0) {
                    kw6Var.a(ieaVar, "Log", "Could not read MultiStatus Response's PropStat element", null);
                }
            }
            return null;
        }
    }

    public static n89 n(oa6 oa6Var) {
        try {
            String S2 = oa6Var.S();
            String j0 = oa6Var.j0();
            String m0 = oa6Var.m0();
            int i = wt7.a[oa6Var.next().ordinal()];
            if (i != 1) {
                if (i != 2) {
                    return new n89(S2, j0, m0, (String) null, 24);
                }
                return new n89(S2, j0, m0, (String) null, o(oa6Var, S2));
            }
            return new n89(S2, j0, m0, s(oa6Var), 16);
        } catch (Throwable unused) {
            if (jy.a()) {
                kw6 kw6Var = kw6.b;
                iea ieaVar = iea.e;
                if (kw6Var.a.a.compareTo(ieaVar) <= 0) {
                    kw6Var.a(ieaVar, "Log", "Could not read MultiStatus Response PropStat's Property element", null);
                }
            }
            return null;
        }
    }

    public static ArrayList o(oa6 oa6Var, String str) {
        n89 n;
        ArrayList arrayList = new ArrayList();
        n89 n2 = n(oa6Var);
        if (n2 != null) {
            arrayList.add(n2);
        }
        while (oa6Var.hasNext()) {
            oa6Var.next();
            if ((oa6Var.G() == EventType.END_ELEMENT || oa6Var.G() == EventType.END_DOCUMENT) && oa6Var.S().equals(str)) {
                break;
            } else if (oa6Var.Q0() && (n = n(oa6Var)) != null) {
                arrayList.add(n);
            }
        }
        return arrayList;
    }

    public static pr9 p(oa6 oa6Var) {
        try {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            i0b i0bVar = null;
            String str = null;
            String str2 = null;
            hw3 hw3Var = null;
            while (p17.l(oa6Var) && p17.j(oa6Var, "response")) {
                if (oa6Var.Q0()) {
                    String S2 = oa6Var.S();
                    switch (S2.hashCode()) {
                        case -992722889:
                            if (!S2.equals("propstat")) {
                                break;
                            } else {
                                l89 m = m(oa6Var);
                                if (m != null) {
                                    arrayList2.add(m);
                                    break;
                                } else {
                                    continue;
                                }
                            }
                        case -892481550:
                            if (!S2.equals("status")) {
                                break;
                            } else {
                                i0bVar = r(oa6Var);
                                continue;
                            }
                        case -635114213:
                            if (!S2.equals("responsedescription")) {
                                break;
                            } else {
                                str = s(oa6Var);
                                continue;
                            }
                        case 3211051:
                            if (!S2.equals("href")) {
                                break;
                            } else {
                                String s = s(oa6Var);
                                if (s != null) {
                                    arrayList.add(s);
                                    break;
                                } else {
                                    continue;
                                }
                            }
                        case 96784904:
                            if (!S2.equals("error")) {
                                break;
                            } else {
                                hw3Var = l(oa6Var);
                                continue;
                            }
                        case 1901043637:
                            if (!S2.equals("location")) {
                                break;
                            } else {
                                str2 = s(oa6Var);
                                continue;
                            }
                        default:
                            continue;
                    }
                }
            }
            return new pr9(arrayList, arrayList2, i0bVar, str, str2, hw3Var);
        } catch (Throwable unused) {
            if (jy.a()) {
                kw6 kw6Var = kw6.b;
                iea ieaVar = iea.e;
                if (kw6Var.a.a.compareTo(ieaVar) <= 0) {
                    kw6Var.a(ieaVar, "Log", "Could not read MultiStatus' Response element", null);
                }
            }
            return null;
        }
    }

    public static i0b r(oa6 oa6Var) {
        String s;
        String str;
        try {
            s = s(oa6Var);
        } catch (Throwable unused) {
            if (jy.a()) {
                kw6 kw6Var = kw6.b;
                iea ieaVar = iea.e;
                if (kw6Var.a.a.compareTo(ieaVar) <= 0) {
                    kw6Var.a(ieaVar, "Log", "Could not read Status", null);
                }
            }
        }
        if (s == null) {
            return null;
        }
        List<String> y0 = k4b.y0(s, new char[]{' '}, 3, 2);
        ArrayList arrayList = new ArrayList(tl1.s(y0, 10));
        for (String str2 : y0) {
            arrayList.add(k4b.N0(str2).toString());
        }
        if (arrayList.size() != 3) {
            return new i0b(s, null, null, null);
        }
        if (r4b.Q((String) arrayList.get(0), "HTTP/", true)) {
            str = ((String) arrayList.get(0)).substring(4);
        } else {
            str = null;
        }
        return new i0b(s, r4b.S((String) arrayList.get(1)), str, (String) arrayList.get(2));
    }

    public static String s(oa6 oa6Var) {
        EventType G2 = oa6Var.G();
        EventType eventType = EventType.TEXT;
        if (G2 == eventType) {
            return xk1.c(oa6Var.I0());
        }
        eventType.getClass();
        if (oa6Var.hasNext() && oa6Var.next() == eventType) {
            return xk1.c(oa6Var.I0());
        }
        return null;
    }

    @Override // defpackage.ju1
    public List a(ComponentRegistrar componentRegistrar) {
        ArrayList arrayList = new ArrayList();
        for (pt1 pt1Var : componentRegistrar.getComponents()) {
            String str = pt1Var.a;
            if (str != null) {
                pt1Var = new pt1(str, pt1Var.b, pt1Var.c, pt1Var.d, pt1Var.e, new iu1(0, str, pt1Var), pt1Var.g);
            }
            arrayList.add(pt1Var);
        }
        return arrayList;
    }

    @Override // defpackage.gz0
    public long b() {
        return 9205357640488583168L;
    }

    @Override // defpackage.kg9
    public float c(float f2) {
        double t;
        double d2 = f2;
        if (d2 < 0.031248d) {
            t = d2 / 16.0d;
        } else {
            t = ch0.t(d2, 1.8d);
        }
        return (float) t;
    }

    @Override // defpackage.y22
    public long e(long j, long j2) {
        float min = Math.min(mna.b(j2) / mna.b(j), mna.a(j2) / mna.a(j));
        return mz9.a(min, min);
    }

    @Override // defpackage.gz0
    public r13 f() {
        return Q;
    }

    public Object g(Object obj) {
        Object gs9Var;
        String str = (String) obj;
        Object obj2 = ks3.a;
        if (str.length() == 0) {
            return obj2;
        }
        try {
            s46 s46Var = v46.a;
            s46Var.getClass();
            gs9Var = (List) s46Var.a(new sz(c4b.a, 0), str);
        } catch (Throwable th) {
            gs9Var = new gs9(th);
        }
        Throwable a2 = hs9.a(gs9Var);
        if (a2 == null) {
            obj2 = gs9Var;
        } else {
            String message = a2.getMessage();
            if (message == null) {
                message = "";
            }
            String concat = "Failed to decode string list from database: ".concat(message);
            if (jy.a()) {
                kw6 kw6Var = kw6.b;
                iea ieaVar = iea.e;
                if (kw6Var.a.a.compareTo(ieaVar) <= 0) {
                    kw6Var.a(ieaVar, "Log", concat, null);
                }
            }
        }
        return (List) obj2;
    }

    @Override // defpackage.gz0
    public tc6 getLayoutDirection() {
        return P;
    }

    @Override // defpackage.kg9
    public float h(float f2) {
        double t;
        double d2 = f2;
        if (d2 < 0.001953d) {
            t = d2 * 16.0d;
        } else {
            t = ch0.t(d2, 0.5555555555555556d);
        }
        return (float) t;
    }

    @Override // defpackage.hu1
    public Object j(yv yvVar) {
        return new pb6((dne) yvVar.a(dne.class), (wy3) yvVar.a(wy3.class));
    }

    /* JADX WARN: Code restructure failed: missing block: B:143:0x021f, code lost:
        if (defpackage.e86.a(defpackage.rae.a(r15.getKeyCode()), defpackage.e86.u) != false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:214:0x032b, code lost:
        if (defpackage.e86.a(r14, defpackage.e86.U) == false) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.f86 k(android.view.KeyEvent r15) {
        /*
            Method dump skipped, instructions count: 1116
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh5.k(android.view.KeyEvent):f86");
    }

    @Override // defpackage.dj1
    public void q(re5 re5Var, aab aabVar) {
        re5Var.getClass();
        re5Var.d.g(ah5.j, new w8((mu4) aabVar, null, 8));
    }

    @Override // defpackage.oi8
    public int d(int i, int i2) {
        return i;
    }
}
