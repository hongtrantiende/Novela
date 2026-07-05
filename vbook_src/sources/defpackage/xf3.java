package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: xf3  reason: default package */
/* loaded from: classes3.dex */
public final class xf3 {
    public final re5 a;
    public final ii2 b;
    public final klc c;
    public final h1a d;
    public final kz1 e;
    public final Object f = new Object();
    public final LinkedHashMap g = new LinkedHashMap();
    public final LinkedHashSet h = new LinkedHashSet();

    public xf3(re5 re5Var, ii2 ii2Var, klc klcVar, h1a h1aVar, kz1 kz1Var) {
        this.a = re5Var;
        this.b = ii2Var;
        this.c = klcVar;
        this.d = h1aVar;
        this.e = kz1Var;
    }

    public static final void a(xf3 xf3Var, String str) {
        synchronized (xf3Var.f) {
            xf3Var.g.remove(str);
            xf3Var.h.remove(str);
        }
    }

    public static final void d(yl9 yl9Var, xf3 xf3Var, vf9 vf9Var, String str, boolean z) {
        long b = by5.a.k().b();
        if (!z && b - yl9Var.a <= 1000) {
            return;
        }
        yl9Var.a = b;
        gk2 gk2Var = xf3Var.b.F;
        int i = vf9Var.b;
        int i2 = vf9Var.c;
        gk2Var.getClass();
        str.getClass();
        ((mm) gk2Var.a).q(542192517, "UPDATE DbDownload\nSET downloaded = ?,\n    total = ?\nWHERE id = ?", new gn2(gk2Var, i, i2, str));
        gk2Var.C(542192517, new hn2(0));
    }

    public final void b() {
        List<fp1> C0;
        synchronized (this.f) {
            C0 = sl1.C0(this.g.values());
            this.g.clear();
            this.h.clear();
        }
        for (fp1 fp1Var : C0) {
            try {
                fp1Var.e();
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x014d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.un2 r13, defpackage.n42 r14) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf3.c(un2, n42):java.lang.Object");
    }

    public final vf9 e(hk2 hk2Var, int i, int i2) {
        Integer num;
        int i3;
        int i4;
        long b;
        Map map = hk2Var.b;
        String str = hk2Var.a;
        String f = ((plc) this.c).f(map, str, hk2Var.l);
        gk2 gk2Var = this.b.F;
        en2 en2Var = (en2) gk2Var.k0(str).e();
        if (en2Var != null) {
            num = Integer.valueOf(en2Var.k);
        } else {
            num = null;
        }
        boolean z = true;
        if ((num == null || num.intValue() != 0) && ((num == null || num.intValue() != 1) && (num == null || num.intValue() != 2))) {
            z = false;
        }
        if (z && en2Var != null) {
            i3 = en2Var.h;
        } else {
            i3 = 0;
        }
        if (z && en2Var != null) {
            i4 = en2Var.i;
        } else {
            i4 = 0;
        }
        vf9 vf9Var = new vf9(4, (byte) 0);
        vf9Var.b = i3;
        vf9Var.c = i4;
        String str2 = hk2Var.a;
        String str3 = hk2Var.d;
        String str4 = hk2Var.j;
        int i5 = hk2Var.e;
        if (z) {
            if (en2Var != null) {
                b = en2Var.l;
            } else {
                b = by5.a.k().b();
            }
        } else {
            b = by5.a.k().b();
        }
        gk2Var.A0(new en2(str2, str2, f, str3, str4, i, i2, i3, i4, i5, 0, b));
        return vf9Var;
    }

    public final un2 f(hk2 hk2Var) {
        Object obj;
        String str;
        Object gs9Var;
        String Q0;
        un2 un2Var;
        String str2 = hk2Var.l;
        String str3 = hk2Var.j;
        ii2 ii2Var = this.b;
        if (str2 != null && str2.length() != 0 && (un2Var = (un2) ii2Var.I.k0(str2).e()) != null) {
            return un2Var;
        }
        gk2 gk2Var = ii2Var.I;
        Iterator it = gk2Var.u0().c().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            boolean z = false;
            try {
                String str4 = ((vx4) next).b;
                str4.getClass();
                Pattern compile = Pattern.compile(str4);
                compile.getClass();
                str3.getClass();
                boolean z2 = true;
                if (!compile.matcher(str3).matches()) {
                    if (r4b.Q(str3, "https://", false)) {
                        Q0 = k4b.Q0(k4b.t0(str3, "https://"), '/');
                    } else if (r4b.Q(str3, "http://", false)) {
                        Q0 = k4b.Q0(k4b.t0(str3, "http://"), '/');
                    } else {
                        Q0 = k4b.Q0(str3, '/');
                    }
                    Q0.getClass();
                    if (!compile.matcher(Q0).matches()) {
                        z2 = false;
                    }
                }
                gs9Var = Boolean.valueOf(z2);
            } catch (Throwable th) {
                gs9Var = new gs9(th);
            }
            if (!(gs9Var instanceof gs9)) {
                obj = gs9Var;
            }
            Boolean bool = (Boolean) obj;
            if (bool != null) {
                z = bool.booleanValue();
                continue;
            }
            if (z) {
                obj = next;
                break;
            }
        }
        vx4 vx4Var = (vx4) obj;
        if (vx4Var != null && (str = vx4Var.a) != null) {
            un2 un2Var2 = (un2) gk2Var.k0(str).e();
            if (un2Var2 != null) {
                return un2Var2;
            }
            throw new Exception();
        }
        throw new Exception();
    }

    public final Object g(String str, n42 n42Var) {
        synchronized (this.f) {
            this.h.remove(str);
            fp1 fp1Var = (fp1) this.g.remove(str);
        }
        en2 en2Var = (en2) this.b.F.k0(str).e();
        if (en2Var != null) {
            String str2 = en2Var.b;
            int i = en2Var.f;
            return h(str2, i, en2Var.g - i, false, n42Var);
        }
        return pvc.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a2 A[Catch: all -> 0x00a6, TryCatch #3 {all -> 0x00a6, blocks: (B:39:0x009c, B:41:0x00a2, B:49:0x00af, B:52:0x00b5, B:56:0x00d2, B:59:0x00fe, B:60:0x0100, B:62:0x010b, B:63:0x010c, B:57:0x00e8, B:58:0x00e9, B:34:0x006e, B:36:0x007f, B:69:0x0115, B:70:0x011b, B:61:0x0101), top: B:85:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9 A[Catch: all -> 0x00a6, TryCatch #3 {all -> 0x00a6, blocks: (B:39:0x009c, B:41:0x00a2, B:49:0x00af, B:52:0x00b5, B:56:0x00d2, B:59:0x00fe, B:60:0x0100, B:62:0x010b, B:63:0x010c, B:57:0x00e8, B:58:0x00e9, B:34:0x006e, B:36:0x007f, B:69:0x0115, B:70:0x011b, B:61:0x0101), top: B:85:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0101 A[Catch: all -> 0x0112, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00a6, blocks: (B:39:0x009c, B:41:0x00a2, B:49:0x00af, B:52:0x00b5, B:56:0x00d2, B:59:0x00fe, B:60:0x0100, B:62:0x010b, B:63:0x010c, B:57:0x00e8, B:58:0x00e9, B:34:0x006e, B:36:0x007f, B:69:0x0115, B:70:0x011b, B:61:0x0101), top: B:85:0x006e }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x011f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(java.lang.String r23, int r24, int r25, boolean r26, defpackage.n42 r27) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xf3.h(java.lang.String, int, int, boolean, n42):java.lang.Object");
    }
}
