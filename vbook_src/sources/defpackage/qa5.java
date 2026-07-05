package defpackage;

import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: qa5  reason: default package */
/* loaded from: classes.dex */
public final class qa5 {
    public static final qa5 a = new Object();
    public static final mfb b = new mfb(new k85(5));

    public static void a(HashMap hashMap, int i, int i2, String str) {
        Integer valueOf = Integer.valueOf(i);
        Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new ArrayList();
            hashMap.put(valueOf, obj);
        }
        ((List) obj).add(new oa5(i2, str));
    }

    public static String b(long j, String str) {
        if (zl1.c(j, zl1.i)) {
            return null;
        }
        int n = dce.n((int) (zl1.h(j) * 255.0f), 0, 255);
        int n2 = dce.n((int) (zl1.g(j) * 255.0f), 0, 255);
        int n3 = dce.n((int) (zl1.e(j) * 255.0f), 0, 255);
        nqe.u(16);
        String num = Integer.toString(n, 16);
        num.getClass();
        String r0 = k4b.r0(2, num);
        nqe.u(16);
        String num2 = Integer.toString(n2, 16);
        num2.getClass();
        String r02 = k4b.r0(2, num2);
        nqe.u(16);
        String num3 = Integer.toString(n3, 16);
        num3.getClass();
        String r03 = k4b.r0(2, num3);
        return str + ":#" + r0 + r02 + r03;
    }

    public static String c(String str) {
        return r4b.N(r4b.N(r4b.N(r4b.N(r4b.N(str, false, "&", "&amp;"), false, "<", "&lt;"), false, ">", "&gt;"), false, "\"", "&quot;"), false, "'", "&#39;");
    }

    public static ps d(String str) {
        str.getClass();
        ed5 ed5Var = new ed5();
        return e().d(ed5Var.q(new StringReader(str), "", new t6f(ed5Var)).a0());
    }

    public static ra5 e() {
        return (ra5) b.getValue();
    }

    public static uc3 f(String str) {
        str.getClass();
        ed5 ed5Var = new ed5();
        return ed5Var.q(new StringReader(str), "", new t6f(ed5Var));
    }

    public static ps g(ps psVar) {
        char c;
        psVar.getClass();
        String str = psVar.b;
        int length = str.length();
        o29[] o29VarArr = new o29[length];
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            o29VarArr[i2] = new o29(str.charAt(i2), i2);
        }
        int i3 = 0;
        while (true) {
            if (i < length) {
                o29 o29Var = o29VarArr[i];
                if (o29Var == null || !nqe.y(o29Var.a)) {
                    break;
                }
                o29VarArr[i] = null;
                int i4 = i;
                i++;
                i3 = i4;
            } else {
                i = i3;
                break;
            }
        }
        int i5 = length - 1;
        int i6 = -1;
        while (true) {
            if (-1 < i5) {
                o29 o29Var2 = o29VarArr[i5];
                if (o29Var2 == null || !nqe.y(o29Var2.a)) {
                    break;
                }
                o29VarArr[i5] = null;
                i6 = i5;
                i5--;
            } else {
                i5 = i6;
                break;
            }
        }
        int i7 = i;
        while (i7 <= i5) {
            o29 o29Var3 = o29VarArr[i7];
            if (o29Var3 != null && ((c = o29Var3.a) == '\n' || c == '\r')) {
                o29VarArr[i7] = new o29('\n', i7);
                int i8 = i7 - 1;
                if (i <= i8) {
                    while (true) {
                        o29 o29Var4 = o29VarArr[i8];
                        if (o29Var4 == null || !nqe.y(o29Var4.a)) {
                            break;
                        }
                        o29VarArr[i8] = null;
                        if (i8 == i) {
                            break;
                        }
                        i8--;
                    }
                }
                int i9 = i7 + 1;
                if (i9 <= i5) {
                    while (true) {
                        o29 o29Var5 = o29VarArr[i9];
                        if (o29Var5 == null || !nqe.y(o29Var5.a)) {
                            break;
                        }
                        o29VarArr[i9] = null;
                        if (i9 != i5) {
                            i9++;
                        }
                    }
                    i7 = i9 - 1;
                }
            }
            i7++;
        }
        return new tb1(b00.l0(o29VarArr)).g(psVar);
    }

    public static final void h(String str, ArrayList arrayList, ArrayList arrayList2) {
        arrayList.add("<" + str + ">");
        arrayList2.add(0, "</" + str + ">");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:74:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01fc  */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String i(defpackage.ps r24) {
        /*
            Method dump skipped, instructions count: 1023
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qa5.i(ps):java.lang.String");
    }
}
