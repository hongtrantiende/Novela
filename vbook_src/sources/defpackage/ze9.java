package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ze9  reason: default package */
/* loaded from: classes3.dex */
public final class ze9 implements zmc {
    public static final gm9 q = new gm9("^(第(.+)\\s*([章节幕回折])\\s\\d+\\.)(\\s)(.+)");
    public static final gm9 r = new gm9("^(第?\\s*([零〇一二两三四五六七八九十百千]+|\\d+)\\s*([章节幕回]?))([,.:，。：．、\\s]*)(.*)$");
    public final String a;
    public final q63 b;
    public final rc9 c;
    public final se9 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public boolean k;
    public final sw7 l;
    public aw4 m;
    public i69 n;
    public oaa o;
    public final ArrayList p;

    public ze9(String str, q63 q63Var, rc9 rc9Var, se9 se9Var) {
        str.getClass();
        this.a = str;
        this.b = q63Var;
        this.c = rc9Var;
        this.d = se9Var;
        this.e = rc9Var.b();
        this.f = rc9Var.k();
        this.g = rc9Var.f();
        this.h = rc9Var.e();
        this.i = rc9Var.c();
        this.j = rc9Var.i();
        this.k = rc9Var.l();
        this.l = new sw7();
        this.p = tl1.m(new vmc("zh", "Tiếng Trung", true, false), new vmc("vp", "Việt (VP)", false, true), new vmc("hv", "Hán Việt", false, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:121:0x0170, code lost:
        if (r15 < ':') goto L116;
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x019e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList d(java.util.List r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze9.d(java.util.List, boolean):java.util.ArrayList");
    }

    public static String e(String str) {
        int f0;
        if (str.length() > 0 && (f0 = k4b.f0(str, (char) 166, 0, 6)) != -1) {
            return k4b.L0(f0, str);
        }
        return str;
    }

    public static String k(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != 21367) {
                if (hashCode != 22238) {
                    if (hashCode != 24149) {
                        if (hashCode != 25240) {
                            if (hashCode != 31456) {
                                if (hashCode != 33410) {
                                    if (hashCode == 38598 && str.equals("集")) {
                                        return "Tập";
                                    }
                                    return "Chương";
                                } else if (str.equals("节")) {
                                    return "Tiết";
                                } else {
                                    return "Chương";
                                }
                            }
                            str.equals("章");
                            return "Chương";
                        } else if (str.equals("折")) {
                            return "Chiết";
                        } else {
                            return "Chương";
                        }
                    } else if (str.equals("幕")) {
                        return "Màn";
                    } else {
                        return "Chương";
                    }
                } else if (str.equals("回")) {
                    return "Hồi";
                } else {
                    return "Chương";
                }
            } else if (str.equals("卷")) {
                return "Quyển";
            } else {
                return "Chương";
            }
        }
        return "Chương";
    }

    public static List m(String str) {
        return k4b.y0(str, new char[]{166}, 0, 6);
    }

    public static ArrayList z(ze9 ze9Var, String str) {
        ArrayList arrayList;
        aw4 aw4Var;
        ArrayList arrayList2 = new ArrayList();
        if (str.length() != 0) {
            ArrayList z = lh9.z(str, '\n', 65533);
            Map map = null;
            if (ze9Var.j == 0 && (aw4Var = ze9Var.m) != null) {
                map = aw4Var.k;
            }
            if (map == null) {
                map = ls3.a;
            }
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            int size = z.size();
            int i = 0;
            int i2 = 0;
            while (i2 < size) {
                Object obj = z.get(i2);
                i2++;
                yk8 yk8Var = (yk8) obj;
                sb.setLength(i);
                sb2.setLength(i);
                Object obj2 = yk8Var.a;
                Object obj3 = yk8Var.b;
                String str2 = (String) obj2;
                int length = str2.length();
                int i3 = i;
                int i4 = i3;
                boolean z2 = true;
                while (i3 < length) {
                    char charAt = str2.charAt(i3);
                    Character ch = (Character) map.get(Character.valueOf(charAt));
                    if (ch != null) {
                        arrayList = z;
                        if (z2) {
                            sb.setLength(0);
                            sb2.setLength(0);
                            z2 = false;
                        }
                        sb2.append(charAt);
                        sb.append(ch.charValue());
                    } else {
                        arrayList = z;
                        if (!z2) {
                            arrayList2.addAll(ze9Var.v(str2.substring(i4, i3 - sb2.length())));
                            arrayList2.add(new te9(4, sb2.toString(), sb.toString(), false));
                            sb.setLength(0);
                            sb2.setLength(0);
                            i4 = i3;
                            z2 = true;
                        }
                    }
                    i3++;
                    z = arrayList;
                }
                ArrayList arrayList3 = z;
                if (!z2) {
                    arrayList2.addAll(ze9Var.v(str2.substring(i4, str2.length() - sb2.length())));
                    arrayList2.add(new te9(4, sb2.toString(), sb.toString(), false));
                } else if (i4 < str2.length()) {
                    arrayList2.addAll(ze9Var.v(str2.substring(i4)));
                }
                if (obj3 != null) {
                    arrayList2.add(new te9(0, String.valueOf(obj3), String.valueOf(obj3), false));
                    i = 0;
                    z = arrayList3;
                } else {
                    z = arrayList3;
                    i = 0;
                }
            }
        }
        return arrayList2;
    }

    public final void A(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.d.a();
        aw4 aw4Var = this.m;
        if (aw4Var != null) {
            a63 a63Var = aw4Var.e;
            if (a63Var != null) {
                String str3 = (String) a63Var.a(str, str2);
            }
            a63 a63Var2 = aw4Var.h;
            if (a63Var2 != null) {
                String str4 = (String) a63Var2.c(str);
            }
        }
    }

    public final void B(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.d.a();
        aw4 aw4Var = this.m;
        if (aw4Var != null) {
            a63 a63Var = aw4Var.f;
            if (a63Var != null) {
                String str3 = (String) a63Var.a(str, str2);
            }
            a63 a63Var2 = aw4Var.g;
            if (a63Var2 != null) {
                String str4 = (String) a63Var2.c(str);
            }
        }
    }

    public final void C(String str, String str2, String str3) {
        i69 i69Var;
        rs8.w(str, str2, str3);
        this.d.a();
        if (c16.i(this.a, str) && (i69Var = this.n) != null) {
            i69Var.b.a(str2, str3);
        }
    }

    public final void D(String str, String str2, String str3) {
        i69 i69Var;
        rs8.w(str, str2, str3);
        this.d.a();
        if (c16.i(this.a, str) && (i69Var = this.n) != null) {
            i69Var.a.a(str2, str3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b5  */
    /* JADX WARN: Type inference failed for: r11v21 */
    /* JADX WARN: Type inference failed for: r11v7, types: [int] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v23 */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r4v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean] */
    @Override // defpackage.zmc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r21, java.lang.String r22, java.lang.String r23, java.util.Map r24, defpackage.n42 r25) {
        /*
            Method dump skipped, instructions count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze9.a(java.lang.String, java.lang.String, java.lang.String, java.util.Map, n42):java.lang.Object");
    }

    @Override // defpackage.zmc
    public final Object b(n42 n42Var) {
        return this.p;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0054, code lost:
        if (l(r6) == r9) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0070, code lost:
        if (r13 == r9) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d8  */
    @Override // defpackage.zmc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(java.lang.String r12, defpackage.n42 r13) {
        /*
            Method dump skipped, instructions count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze9.c(java.lang.String, n42):java.lang.Object");
    }

    @Override // defpackage.zmc
    public final void close() {
        this.m = null;
        this.n = null;
    }

    public final String f(int i, String str) {
        aw4 aw4Var = this.m;
        if (aw4Var != null) {
            str.getClass();
            Map map = aw4Var.d;
            if (map != null) {
                return (String) map.get(Character.valueOf(str.charAt(i)));
            }
        }
        return null;
    }

    public final yk8 g(int i, int i2, String str) {
        String str2;
        i69 i69Var = this.n;
        String str3 = null;
        if (i69Var != null) {
            if (this.g == 0) {
                str.getClass();
                String str4 = (String) i69Var.b.b(i, i2, str);
                if (str4 != null) {
                    return new yk8(str4, Boolean.TRUE);
                }
                aw4 aw4Var = this.m;
                if (aw4Var != null) {
                    str3 = aw4Var.a(i, i2, str);
                }
            } else {
                aw4 aw4Var2 = this.m;
                if (aw4Var2 != null) {
                    str2 = aw4Var2.a(i, i2, str);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    return new yk8(str2, Boolean.FALSE);
                }
                i69 i69Var2 = this.n;
                if (i69Var2 != null) {
                    str.getClass();
                    str3 = (String) i69Var2.b.b(i, i2, str);
                }
                if (str3 != null) {
                    return new yk8(str3, Boolean.TRUE);
                }
            }
        } else {
            aw4 aw4Var3 = this.m;
            if (aw4Var3 != null) {
                str3 = aw4Var3.a(i, i2, str);
            }
        }
        return new yk8(str3, Boolean.FALSE);
    }

    public final String h(int i, int i2, String str) {
        aw4 aw4Var = this.m;
        if (aw4Var != null) {
            str.getClass();
            a63 a63Var = aw4Var.c;
            if (a63Var != null) {
                return (String) a63Var.b(i, i2, str);
            }
            return null;
        }
        return null;
    }

    public final Character i(char c) {
        Map map;
        aw4 aw4Var = this.m;
        if (aw4Var == null || (map = aw4Var.j) == null) {
            return null;
        }
        return (Character) map.get(Character.valueOf(c));
    }

    public final yk8 j(int i, int i2, String str) {
        String str2;
        i69 i69Var = this.n;
        String str3 = null;
        if (i69Var != null) {
            if (this.g == 0) {
                str.getClass();
                String str4 = (String) i69Var.a.b(i, i2, str);
                if (str4 != null) {
                    return new yk8(str4, Boolean.TRUE);
                }
                aw4 aw4Var = this.m;
                if (aw4Var != null) {
                    str3 = aw4Var.b(i, i2, str);
                }
            } else {
                aw4 aw4Var2 = this.m;
                if (aw4Var2 != null) {
                    str2 = aw4Var2.b(i, i2, str);
                } else {
                    str2 = null;
                }
                if (str2 != null) {
                    return new yk8(str2, Boolean.FALSE);
                }
                i69 i69Var2 = this.n;
                if (i69Var2 != null) {
                    str.getClass();
                    str3 = (String) i69Var2.a.b(i, i2, str);
                }
                if (str3 != null) {
                    return new yk8(str3, Boolean.TRUE);
                }
            }
        } else {
            aw4 aw4Var3 = this.m;
            if (aw4Var3 != null) {
                str3 = aw4Var3.b(i, i2, str);
            }
        }
        return new yk8(str3, Boolean.FALSE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
        if (r9.o(r0) == r7) goto L30;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009f  */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [qw7] */
    /* JADX WARN: Type inference failed for: r1v7, types: [qw7] */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [qw7] */
    /* JADX WARN: Type inference failed for: r4v4, types: [qw7] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object l(defpackage.n42 r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof defpackage.ve9
            if (r0 == 0) goto L13
            r0 = r9
            ve9 r0 = (defpackage.ve9) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            ve9 r0 = new ve9
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.c
            int r1 = r0.e
            q63 r2 = r8.b
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            n82 r7 = defpackage.n82.a
            if (r1 == 0) goto L51
            if (r1 == r5) goto L4a
            if (r1 == r4) goto L3e
            if (r1 != r3) goto L38
            ze9 r8 = r0.b
            qw7 r0 = r0.a
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L35
            goto La0
        L35:
            r8 = move-exception
            goto Lad
        L38:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r6
        L3e:
            ze9 r1 = r0.b
            qw7 r4 = r0.a
            defpackage.hre.r(r9)     // Catch: java.lang.Throwable -> L46
            goto L8c
        L46:
            r8 = move-exception
            r0 = r4
            goto Lad
        L4a:
            qw7 r1 = r0.a
            defpackage.hre.r(r9)
            r9 = r1
            goto L61
        L51:
            defpackage.hre.r(r9)
            sw7 r9 = r8.l
            r0.a = r9
            r0.e = r5
            java.lang.Object r1 = r9.o(r0)
            if (r1 != r7) goto L61
            goto L9e
        L61:
            aw4 r1 = r8.m     // Catch: java.lang.Throwable -> Lab
            if (r1 == 0) goto L7c
            a63 r5 = r1.a     // Catch: java.lang.Throwable -> Lab
            if (r5 == 0) goto L7c
            a63 r5 = r1.b     // Catch: java.lang.Throwable -> Lab
            if (r5 == 0) goto L7c
            a63 r5 = r1.c     // Catch: java.lang.Throwable -> Lab
            if (r5 == 0) goto L7c
            java.util.Map r5 = r1.d     // Catch: java.lang.Throwable -> Lab
            if (r5 == 0) goto L7c
            nz6 r1 = r1.i     // Catch: java.lang.Throwable -> Lab
            if (r1 == 0) goto L7c
            goto La5
        L7a:
            r0 = r9
            goto Lad
        L7c:
            r0.a = r9     // Catch: java.lang.Throwable -> Lab
            r0.b = r8     // Catch: java.lang.Throwable -> Lab
            r0.e = r4     // Catch: java.lang.Throwable -> Lab
            java.lang.Object r1 = r2.c(r0)     // Catch: java.lang.Throwable -> Lab
            if (r1 != r7) goto L89
            goto L9e
        L89:
            r4 = r9
            r9 = r1
            r1 = r8
        L8c:
            aw4 r9 = (defpackage.aw4) r9     // Catch: java.lang.Throwable -> L46
            r1.m = r9     // Catch: java.lang.Throwable -> L46
            java.lang.String r9 = r8.a     // Catch: java.lang.Throwable -> L46
            r0.a = r4     // Catch: java.lang.Throwable -> L46
            r0.b = r8     // Catch: java.lang.Throwable -> L46
            r0.e = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r9 = r2.d(r9, r0)     // Catch: java.lang.Throwable -> L46
            if (r9 != r7) goto L9f
        L9e:
            return r7
        L9f:
            r0 = r4
        La0:
            i69 r9 = (defpackage.i69) r9     // Catch: java.lang.Throwable -> L35
            r8.n = r9     // Catch: java.lang.Throwable -> L35
            r9 = r0
        La5:
            r9.q(r6)
            pvc r8 = defpackage.pvc.a
            return r8
        Lab:
            r8 = move-exception
            goto L7a
        Lad:
            r0.q(r6)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze9.l(n42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0133  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(java.lang.String r20, defpackage.te9[] r21, boolean[] r22) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze9.n(java.lang.String, te9[], boolean[]):void");
    }

    public final void o(String str, te9[] te9VarArr, boolean[] zArr) {
        boolean z;
        String str2;
        for (int min = Math.min(this.i, str.length()); min >= 1; min--) {
            int length = str.length() - min;
            int i = 0;
            while (i <= length) {
                int i2 = 0;
                while (true) {
                    if (i2 < min) {
                        if (zArr[i + i2]) {
                            i += i2 + 1;
                            z = true;
                            break;
                        }
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    i69 i69Var = this.n;
                    if (i69Var != null) {
                        str2 = (String) i69Var.b.b(i, min, str);
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        int i3 = i + min;
                        te9VarArr[i] = new te9(2, str.substring(i, i3), e(str2), true);
                        for (int i4 = 0; i4 < min; i4++) {
                            zArr[i + i4] = true;
                        }
                        i = i3;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public final void p(String str, te9[] te9VarArr, boolean[] zArr) {
        boolean z;
        String str2;
        for (int min = Math.min(this.i, str.length()); min >= 2; min--) {
            int length = str.length() - min;
            int i = 0;
            while (i <= length) {
                int i2 = 0;
                while (true) {
                    if (i2 < min) {
                        if (zArr[i + i2]) {
                            i += i2 + 1;
                            z = true;
                            break;
                        }
                        i2++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    aw4 aw4Var = this.m;
                    if (aw4Var != null) {
                        str2 = aw4Var.a(i, min, str);
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        int i3 = i + min;
                        te9VarArr[i] = new te9(2, str.substring(i, i3), e(str2), false);
                        for (int i4 = 0; i4 < min; i4++) {
                            zArr[i + i4] = true;
                        }
                        i = i3;
                    } else {
                        i++;
                    }
                }
            }
        }
    }

    public final void q(String str, te9[] te9VarArr, boolean[] zArr, int i) {
        boolean z;
        int min = Math.min(i, str.length());
        int i2 = 0;
        while (i2 < str.length()) {
            int min2 = Math.min(min, str.length() - i2);
            while (true) {
                if (min2 > 1) {
                    int i3 = 0;
                    while (true) {
                        if (i3 < min2) {
                            if (zArr[i2 + i3]) {
                                min2 = i3;
                                z = true;
                                break;
                            }
                            i3++;
                        } else {
                            z = false;
                            break;
                        }
                    }
                    if (!z) {
                        yk8 j = j(i2, min2, str);
                        String str2 = (String) j.a;
                        boolean booleanValue = ((Boolean) j.b).booleanValue();
                        if (str2 != null) {
                            te9VarArr[i2] = new te9(1, str.substring(i2, i2 + min2), e(str2), booleanValue);
                            for (int i4 = 0; i4 < min2; i4++) {
                                zArr[i2 + i4] = true;
                            }
                            i2 += min2 - 1;
                        } else {
                            min2--;
                        }
                    }
                }
            }
            i2++;
        }
    }

    public final void r(String str, te9[] te9VarArr, boolean[] zArr, int i) {
        boolean z;
        for (int min = Math.min(i, str.length()); min > 1; min--) {
            int length = str.length() - min;
            int i2 = 0;
            while (i2 <= length) {
                int i3 = 0;
                while (true) {
                    if (i3 < min) {
                        if (zArr[i2 + i3]) {
                            i2 += i3 + 1;
                            z = true;
                            break;
                        }
                        i3++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    yk8 j = j(i2, min, str);
                    String str2 = (String) j.a;
                    boolean booleanValue = ((Boolean) j.b).booleanValue();
                    if (str2 != null) {
                        int i4 = i2 + min;
                        te9VarArr[i2] = new te9(1, str.substring(i2, i4), e(str2), booleanValue);
                        for (int i5 = 0; i5 < min; i5++) {
                            zArr[i2 + i5] = true;
                        }
                        i2 = i4;
                    } else {
                        i2++;
                    }
                }
            }
        }
    }

    public final void s(String str, te9[] te9VarArr, boolean[] zArr, int i) {
        boolean z;
        for (int min = Math.min(this.i, str.length()); min >= i; min--) {
            int length = str.length() - min;
            int i2 = 0;
            while (i2 <= length) {
                int i3 = 0;
                while (true) {
                    if (i3 < min) {
                        if (zArr[i2 + i3]) {
                            i2 += i3 + 1;
                            z = true;
                            break;
                        }
                        i3++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    yk8 j = j(i2, min, str);
                    String str2 = (String) j.a;
                    boolean booleanValue = ((Boolean) j.b).booleanValue();
                    if (str2 != null) {
                        int i4 = i2 + min;
                        te9VarArr[i2] = new te9(1, str.substring(i2, i4), e(str2), booleanValue);
                        for (int i5 = 0; i5 < min; i5++) {
                            zArr[i2 + i5] = true;
                        }
                        i2 = i4;
                    } else {
                        i2++;
                    }
                }
            }
        }
    }

    public final ArrayList t(String str) {
        ArrayList arrayList = new ArrayList();
        if (str.length() != 0) {
            ArrayList z = lh9.z(str, '\n', 65533);
            int size = z.size();
            int i = 0;
            while (i < size) {
                Object obj = z.get(i);
                i++;
                yk8 yk8Var = (yk8) obj;
                String str2 = (String) yk8Var.a;
                int length = str2.length();
                int i2 = 0;
                StringBuilder sb = null;
                StringBuilder sb2 = null;
                for (int i3 = 0; i3 < length; i3++) {
                    char charAt = str2.charAt(i3);
                    Character i4 = i(charAt);
                    if (i4 != null) {
                        if (sb == null) {
                            sb2 = new StringBuilder();
                            sb = new StringBuilder();
                        }
                        if (sb2 != null) {
                            sb2.append(charAt);
                        }
                        sb.append(i4.charValue());
                    } else if (sb != null) {
                        sb2.getClass();
                        arrayList.addAll(w(str2.substring(i2, i3 - sb2.length())));
                        arrayList.add(new te9(4, sb2.toString(), sb.toString(), false));
                        sb = null;
                        sb2 = null;
                        i2 = i3;
                    }
                }
                if (sb != null) {
                    int length2 = str2.length();
                    sb2.getClass();
                    arrayList.addAll(w(str2.substring(i2, length2 - sb2.length())));
                    arrayList.add(new te9(4, sb2.toString(), sb.toString(), false));
                } else if (i2 < str2.length()) {
                    arrayList.addAll(w(str2.substring(i2)));
                }
                arrayList.add(new te9(0, String.valueOf(yk8Var.b), null, false));
            }
            if (!arrayList.isEmpty()) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01cd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object u(int r13, defpackage.n42 r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze9.u(int, n42, java.lang.String):java.lang.Object");
    }

    public final ArrayList v(String str) {
        int i;
        int i2;
        String str2;
        boolean z;
        int i3;
        String str3;
        if (this.h == 0) {
            boolean[] zArr = new boolean[str.length()];
            te9[] te9VarArr = new te9[str.length()];
            if (this.e != 0) {
                n(str, te9VarArr, zArr);
            }
            if (this.g == 1) {
                p(str, te9VarArr, zArr);
                o(str, te9VarArr, zArr);
            } else {
                o(str, te9VarArr, zArr);
                p(str, te9VarArr, zArr);
            }
            int i4 = this.f;
            if (i4 != 0) {
                if (i4 != 1) {
                    if (i4 != 2) {
                        if (i4 == 3) {
                            s(str, te9VarArr, zArr, 5);
                            q(str, te9VarArr, zArr, 4);
                        }
                    } else {
                        s(str, te9VarArr, zArr, 4);
                        q(str, te9VarArr, zArr, 3);
                    }
                } else {
                    r(str, te9VarArr, zArr, this.i);
                }
            } else {
                q(str, te9VarArr, zArr, this.i);
            }
            int i5 = 0;
            while (i5 < str.length()) {
                if (!zArr[i5]) {
                    zArr[i5] = true;
                    yk8 g = g(i5, 1, str);
                    String str4 = (String) g.a;
                    boolean booleanValue = ((Boolean) g.b).booleanValue();
                    if (str4 != null && str4.length() != 0) {
                        te9VarArr[i5] = new te9(2, String.valueOf(str.charAt(i5)), e(str4), booleanValue);
                    } else {
                        yk8 j = j(i5, 1, str);
                        String str5 = (String) j.a;
                        boolean booleanValue2 = ((Boolean) j.b).booleanValue();
                        if (str5 != null) {
                            te9VarArr[i5] = new te9(1, String.valueOf(str.charAt(i5)), e(str5), booleanValue2);
                        } else {
                            Character i6 = i(str.charAt(i5));
                            if (i6 != null) {
                                te9VarArr[i5] = new te9(4, String.valueOf(str.charAt(i5)), String.valueOf(i6.charValue()), false);
                            } else {
                                String f = f(i5, str);
                                if (f != null) {
                                    te9VarArr[i5] = new te9(3, String.valueOf(str.charAt(i5)), e(f), false);
                                } else {
                                    int h = kqe.h(str, i5);
                                    if (h >= 65536) {
                                        i3 = 2;
                                    } else {
                                        i3 = 1;
                                    }
                                    if ((h >>> 16) < 17) {
                                        if (i3 > 1) {
                                            str3 = str.substring(i5, i3 + i5);
                                        } else {
                                            str3 = null;
                                        }
                                        if (str3 != null) {
                                            te9VarArr[i5] = new te9(0, str3, null, false);
                                            i5 += str3.length();
                                        } else {
                                            te9VarArr[i5] = new te9(0, String.valueOf(str.charAt(i5)), null, false);
                                        }
                                    } else {
                                        vs.m("Not a valid code point");
                                        return null;
                                    }
                                }
                            }
                        }
                    }
                }
                i5++;
            }
            return b00.l0(te9VarArr);
        }
        boolean[] zArr2 = new boolean[str.length()];
        te9[] te9VarArr2 = new te9[str.length()];
        if (this.e != 0) {
            n(str, te9VarArr2, zArr2);
        }
        int i7 = this.f;
        if (i7 != 0) {
            if (i7 != 1) {
                if (i7 != 2) {
                    if (i7 == 3) {
                        s(str, te9VarArr2, zArr2, 5);
                        q(str, te9VarArr2, zArr2, 4);
                    }
                } else {
                    s(str, te9VarArr2, zArr2, 4);
                    q(str, te9VarArr2, zArr2, 3);
                }
            } else {
                r(str, te9VarArr2, zArr2, this.i);
            }
        } else {
            q(str, te9VarArr2, zArr2, this.i);
        }
        for (int min = Math.min(this.i, str.length()); min > 1; min--) {
            int length = str.length() - min;
            int i8 = 0;
            while (i8 <= length) {
                int i9 = 0;
                while (true) {
                    if (i9 < min) {
                        if (zArr2[i8 + i9]) {
                            i8 += i9 + 1;
                            z = true;
                            break;
                        }
                        i9++;
                    } else {
                        z = false;
                        break;
                    }
                }
                if (!z) {
                    yk8 g2 = g(i8, min, str);
                    String str6 = (String) g2.a;
                    boolean booleanValue3 = ((Boolean) g2.b).booleanValue();
                    if (str6 != null && str6.length() != 0) {
                        int i10 = i8 + min;
                        te9VarArr2[i8] = new te9(2, str.substring(i8, i10), e(str6), booleanValue3);
                        for (int i11 = 0; i11 < min; i11++) {
                            zArr2[i8 + i11] = true;
                        }
                        i8 = i10;
                    } else {
                        i8++;
                    }
                }
            }
        }
        int i12 = 0;
        while (i12 < str.length()) {
            if (!zArr2[i12]) {
                zArr2[i12] = true;
                yk8 j2 = j(i12, 1, str);
                String str7 = (String) j2.a;
                boolean booleanValue4 = ((Boolean) j2.b).booleanValue();
                if (str7 != null) {
                    i = i12 + 1;
                    te9VarArr2[i12] = new te9(1, str.substring(i12, i), e(str7), booleanValue4);
                } else {
                    yk8 g3 = g(i12, 1, str);
                    String str8 = (String) g3.a;
                    boolean booleanValue5 = ((Boolean) g3.b).booleanValue();
                    if (str8 != null && str8.length() != 0) {
                        i = i12 + 1;
                        te9VarArr2[i12] = new te9(2, str.substring(i12, i), e(str8), booleanValue5);
                    } else {
                        Character i13 = i(str.charAt(i12));
                        if (i13 != null) {
                            te9VarArr2[i12] = new te9(4, String.valueOf(str.charAt(i12)), String.valueOf(i13.charValue()), false);
                        } else {
                            String f2 = f(i12, str);
                            if (f2 != null) {
                                te9VarArr2[i12] = new te9(3, String.valueOf(str.charAt(i12)), e(f2), false);
                            } else {
                                int h2 = kqe.h(str, i12);
                                if (h2 >= 65536) {
                                    i2 = 2;
                                } else {
                                    i2 = 1;
                                }
                                if ((h2 >>> 16) < 17) {
                                    if (i2 > 1) {
                                        str2 = str.substring(i12, i2 + i12);
                                    } else {
                                        str2 = null;
                                    }
                                    if (str2 != null) {
                                        te9VarArr2[i12] = new te9(0, str2, null, false);
                                        i12 += str2.length();
                                    } else {
                                        te9VarArr2[i12] = new te9(0, String.valueOf(str.charAt(i12)), null, false);
                                    }
                                } else {
                                    vs.m("Not a valid code point");
                                    return null;
                                }
                            }
                        }
                    }
                }
                i12 = i;
            }
            i12++;
        }
        return b00.l0(te9VarArr2);
    }

    public final ArrayList w(String str) {
        Character i;
        ArrayList arrayList = new ArrayList();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            String valueOf = String.valueOf(str.charAt(i2));
            String f = f(0, valueOf);
            if (f == null && (i = i(valueOf.charAt(0))) != null) {
                f = String.valueOf(i.charValue());
            }
            arrayList.add(new te9(3, valueOf, f, false));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0084  */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0073 -> B:24:0x0074). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object x(java.lang.String r6, defpackage.n42 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.ye9
            if (r0 == 0) goto L13
            r0 = r7
            ye9 r0 = (defpackage.ye9) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            ye9 r0 = new ye9
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            int r1 = r0.f
            r2 = 1
            java.lang.String r3 = "\n"
            if (r1 == 0) goto L36
            if (r1 != r2) goto L2f
            java.util.List r6 = r0.c
            java.util.Iterator r1 = r0.b
            java.util.Iterator r1 = (java.util.Iterator) r1
            java.util.List r4 = r0.a
            defpackage.hre.r(r7)
            goto L74
        L2f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L36:
            defpackage.hre.r(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            int r1 = r6.length()
            if (r1 != 0) goto L45
            return r7
        L45:
            java.lang.String[] r1 = new java.lang.String[]{r3}
            java.util.List r6 = defpackage.k4b.z0(r6, r1)
            java.util.Iterator r6 = r6.iterator()
            r1 = r6
            r6 = r7
        L53:
            boolean r7 = r1.hasNext()
            if (r7 == 0) goto L84
            java.lang.Object r7 = r1.next()
            java.lang.String r7 = (java.lang.String) r7
            r0.a = r6
            r4 = r1
            java.util.Iterator r4 = (java.util.Iterator) r4
            r0.b = r4
            r0.c = r6
            r0.f = r2
            java.util.ArrayList r7 = r5.y(r7)
            n82 r4 = defpackage.n82.a
            if (r7 != r4) goto L73
            return r4
        L73:
            r4 = r6
        L74:
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            defpackage.xl1.P(r6, r7)
            te9 r6 = new te9
            r7 = 0
            r6.<init>(r7, r3, r3, r7)
            r4.add(r6)
            r6 = r4
            goto L53
        L84:
            defpackage.xl1.S(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze9.x(java.lang.String, n42):java.lang.Object");
    }

    public final ArrayList y(String str) {
        Object v;
        Object v2;
        ArrayList arrayList = new ArrayList();
        b27 f = q.f(str);
        if (f != null) {
            String str2 = (String) ((z17) f.a()).get(3);
            String str3 = (String) ((z17) f.a()).get(2);
            ArrayList v3 = v((String) ((z17) f.a()).get(5));
            Serializable b = dh1.b(str3);
            if (b == null || (v2 = b.toString()) == null) {
                v2 = v(str3);
            }
            String k = k(str2);
            arrayList.add(new te9(0, (String) ((z17) f.a()).get(1), k + " " + v2, false));
            if (!v3.isEmpty()) {
                arrayList.add(new te9(4, "", ":", false));
                xl1.P(arrayList, v3);
                return arrayList;
            }
        } else {
            b27 f2 = r.f(str);
            if (f2 != null) {
                String str4 = (String) ((z17) f2.a()).get(3);
                String str5 = (String) ((z17) f2.a()).get(2);
                ArrayList v4 = v((String) ((z17) f2.a()).get(5));
                Serializable b2 = dh1.b(str5);
                if (b2 == null || (v = b2.toString()) == null) {
                    v = v(str5);
                }
                String k2 = k(str4);
                arrayList.add(new te9(0, (String) ((z17) f2.a()).get(1), k2 + " " + v, false));
                if (!v4.isEmpty()) {
                    arrayList.add(new te9(4, (String) ((z17) f2.a()).get(4), ":", false));
                    xl1.P(arrayList, v4);
                }
            } else {
                return v(str);
            }
        }
        return arrayList;
    }
}
