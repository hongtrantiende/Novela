package defpackage;

import java.util.Iterator;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g54  reason: default package */
/* loaded from: classes3.dex */
public final class g54 {
    public static final g54 a = new Object();

    public static un2 a(ii2 ii2Var, String str, String str2) {
        un2 un2Var;
        String str3;
        Object gs9Var;
        String Q0;
        ii2Var.getClass();
        str.getClass();
        Object obj = null;
        if (str2 != null && str2.length() != 0) {
            un2Var = (un2) ii2Var.I.k0(str2).e();
        } else {
            un2Var = null;
        }
        if (un2Var == null) {
            gk2 gk2Var = ii2Var.I;
            Iterator it = gk2Var.u0().c().iterator();
            while (true) {
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
                    boolean z2 = true;
                    if (!compile.matcher(str).matches()) {
                        if (r4b.Q(str, "https://", false)) {
                            Q0 = k4b.Q0(k4b.t0(str, "https://"), '/');
                        } else if (r4b.Q(str, "http://", false)) {
                            Q0 = k4b.Q0(k4b.t0(str, "http://"), '/');
                        } else {
                            Q0 = k4b.Q0(str, '/');
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
                if (gs9Var instanceof gs9) {
                    gs9Var = null;
                }
                Boolean bool = (Boolean) gs9Var;
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
            if (vx4Var != null && (str3 = vx4Var.a) != null) {
                un2 un2Var2 = (un2) gk2Var.k0(str3).e();
                if (un2Var2 != null) {
                    return un2Var2;
                }
                throw new Exception();
            }
            throw new Exception();
        }
        return un2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.ii2 r35, java.lang.String r36, java.lang.String r37, boolean r38, byte[] r39, defpackage.n42 r40) {
        /*
            Method dump skipped, instructions count: 452
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g54.b(ii2, java.lang.String, java.lang.String, boolean, byte[], n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x00c1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0194  */
    /* JADX WARN: Type inference failed for: r5v0, types: [vl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r30, byte[] r31, defpackage.n42 r32) {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g54.c(java.lang.String, byte[], n42):java.lang.Object");
    }
}
