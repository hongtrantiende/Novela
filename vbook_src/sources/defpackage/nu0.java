package defpackage;

import android.util.Pair;
import java.nio.charset.StandardCharsets;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nu0  reason: default package */
/* loaded from: classes.dex */
public abstract class nu0 {
    public static final byte[] a;

    static {
        String str = a2d.a;
        a = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void a(km8 km8Var) {
        int i = km8Var.b;
        km8Var.N(4);
        if (km8Var.m() != 1751411826) {
            i += 4;
        }
        km8Var.M(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:104:0x018f, code lost:
        if (r14 == (-1)) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x0595, code lost:
        if (r14 == 2) goto L327;
     */
    /* JADX WARN: Removed duplicated region for block: B:346:0x0669  */
    /* JADX WARN: Removed duplicated region for block: B:347:0x066d  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x06d9  */
    /* JADX WARN: Removed duplicated region for block: B:386:0x071e  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0783  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:616:0x0810 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r8v38, types: [b4, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(defpackage.km8 r49, int r50, int r51, int r52, int r53, java.lang.String r54, boolean r55, defpackage.zk3 r56, defpackage.cw r57, int r58) {
        /*
            Method dump skipped, instructions count: 3188
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu0.b(km8, int, int, int, int, java.lang.String, boolean, zk3, cw, int):void");
    }

    public static ju0 c(int i, km8 km8Var) {
        long j;
        km8Var.M(i + 12);
        km8Var.N(1);
        d(km8Var);
        km8Var.N(2);
        int z = km8Var.z();
        if ((z & Token.CASE) != 0) {
            km8Var.N(2);
        }
        if ((z & 64) != 0) {
            km8Var.N(km8Var.z());
        }
        if ((z & 32) != 0) {
            km8Var.N(2);
        }
        km8Var.N(1);
        d(km8Var);
        String f = lc7.f(km8Var.z());
        if (!"audio/mpeg".equals(f) && !"audio/vnd.dts".equals(f) && !"audio/vnd.dts.hd".equals(f)) {
            km8Var.N(4);
            long B = km8Var.B();
            long B2 = km8Var.B();
            km8Var.N(1);
            int d = d(km8Var);
            long j2 = B2;
            byte[] bArr = new byte[d];
            km8Var.k(bArr, 0, d);
            if (j2 <= 0) {
                j2 = -1;
            }
            if (B > 0) {
                j = B;
            } else {
                j = -1;
            }
            return new ju0(f, bArr, j2, j);
        }
        return new ju0(f, null, -1L, -1L);
    }

    public static int d(km8 km8Var) {
        int z = km8Var.z();
        int i = z & Token.SWITCH;
        while ((z & Token.CASE) == 128) {
            z = km8Var.z();
            i = (i << 7) | (z & Token.SWITCH);
        }
        return i;
    }

    public static int e(int i) {
        return (i >> 24) & 255;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x008a, code lost:
        r9 = r14.m();
        r10 = r14.m();
        r11 = r11 - 16;
        r12 = new byte[r11];
        r14.k(r12, 0, r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0099, code lost:
        r11 = new defpackage.v27(r8, r12, r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009f, code lost:
        defpackage.s21.A("Failed to parse metadata entry with key: ", r8, "MetadataUtil");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.tb7 f(defpackage.ss7 r14) {
        /*
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            ts7 r0 = r14.o(r0)
            r1 = 1801812339(0x6b657973, float:2.7741754E26)
            ts7 r1 = r14.o(r1)
            r2 = 1768715124(0x696c7374, float:1.7865732E25)
            ts7 r14 = r14.o(r2)
            r2 = 0
            if (r0 == 0) goto Lcb
            if (r1 == 0) goto Lcb
            if (r14 == 0) goto Lcb
            km8 r0 = r0.c
            r3 = 16
            r0.M(r3)
            int r0 = r0.m()
            r3 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r0 == r3) goto L2e
            goto Lcb
        L2e:
            km8 r0 = r1.c
            r1 = 12
            r0.M(r1)
            int r1 = r0.m()
            java.lang.String[] r3 = new java.lang.String[r1]
            r4 = 0
            r5 = r4
        L3d:
            r6 = 8
            if (r5 >= r1) goto L55
            int r7 = r0.m()
            r8 = 4
            r0.N(r8)
            int r7 = r7 - r6
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r6 = r0.x(r7, r6)
            r3[r5] = r6
            int r5 = r5 + 1
            goto L3d
        L55:
            km8 r14 = r14.c
            r14.M(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5f:
            int r5 = r14.a()
            if (r5 <= r6) goto Lbf
            int r5 = r14.b
            int r7 = r14.m()
            int r8 = r14.m()
            int r8 = r8 + (-1)
            if (r8 < 0) goto Lb3
            if (r8 >= r1) goto Lb3
            r8 = r3[r8]
            int r9 = r5 + r7
        L79:
            int r10 = r14.b
            if (r10 >= r9) goto Lac
            int r11 = r14.m()
            int r12 = r14.m()
            r13 = 1684108385(0x64617461, float:1.6635614E22)
            if (r12 != r13) goto La7
            int r9 = r14.m()
            int r10 = r14.m()
            int r11 = r11 + (-16)
            byte[] r12 = new byte[r11]
            r14.k(r12, r4, r11)
            v27 r11 = new v27     // Catch: java.lang.Exception -> L9f
            r11.<init>(r8, r12, r10, r9)     // Catch: java.lang.Exception -> L9f
            goto Lad
        L9f:
            java.lang.String r9 = "MetadataUtil"
            java.lang.String r10 = "Failed to parse metadata entry with key: "
            defpackage.s21.A(r10, r8, r9)
            goto Lac
        La7:
            int r10 = r10 + r11
            r14.M(r10)
            goto L79
        Lac:
            r11 = r2
        Lad:
            if (r11 == 0) goto Lba
            r0.add(r11)
            goto Lba
        Lb3:
            java.lang.String r9 = "BoxParsers"
            java.lang.String r10 = "Skipped metadata with unknown key index: "
            defpackage.a82.y(r10, r9, r8)
        Lba:
            int r5 = r5 + r7
            r14.M(r5)
            goto L5f
        Lbf:
            boolean r14 = r0.isEmpty()
            if (r14 == 0) goto Lc6
            goto Lcb
        Lc6:
            tb7 r2 = new tb7
            r2.<init>(r0)
        Lcb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu0.f(ss7):tb7");
    }

    public static ys7 g(km8 km8Var) {
        long t;
        long t2;
        km8Var.M(8);
        if (e(km8Var.m()) == 0) {
            t = km8Var.B();
            t2 = km8Var.B();
        } else {
            t = km8Var.t();
            t2 = km8Var.t();
        }
        return new ys7(t, t2, km8Var.B());
    }

    public static Pair h(km8 km8Var, int i, int i2) {
        boolean z;
        boolean z2;
        boolean z3;
        Integer num;
        yic yicVar;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z4;
        int i5 = km8Var.b;
        while (i5 - i < i2) {
            km8Var.M(i5);
            int m = km8Var.m();
            boolean z5 = false;
            if (m > 0) {
                z = true;
            } else {
                z = false;
            }
            hif.j("childAtomSize must be positive", z);
            if (km8Var.m() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer num3 = null;
                String str = null;
                while (i6 - i5 < m) {
                    km8Var.M(i6);
                    int m2 = km8Var.m();
                    int m3 = km8Var.m();
                    if (m3 == 1718775137) {
                        num3 = Integer.valueOf(km8Var.m());
                    } else if (m3 == 1935894637) {
                        km8Var.N(4);
                        str = km8Var.x(4, StandardCharsets.UTF_8);
                    } else if (m3 == 1935894633) {
                        i8 = i6;
                        i7 = m2;
                    }
                    i6 += m2;
                }
                byte[] bArr = null;
                if (!"cenc".equals(str) && !"cbc1".equals(str) && !"cens".equals(str) && !"cbcs".equals(str)) {
                    create = null;
                } else {
                    if (num3 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    hif.j("frma atom is mandatory", z2);
                    if (i8 != -1) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    hif.j("schi atom is mandatory", z3);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 < i7) {
                            km8Var.M(i9);
                            int m4 = km8Var.m();
                            if (km8Var.m() == 1952804451) {
                                int e = e(km8Var.m());
                                km8Var.N(1);
                                if (e == 0) {
                                    km8Var.N(1);
                                    i4 = 0;
                                    i3 = 0;
                                } else {
                                    int z6 = km8Var.z();
                                    i3 = z6 & 15;
                                    i4 = (z6 & 240) >> 4;
                                }
                                if (km8Var.z() == 1) {
                                    num2 = num3;
                                    z4 = true;
                                } else {
                                    num2 = num3;
                                    z4 = false;
                                }
                                int z7 = km8Var.z();
                                byte[] bArr2 = new byte[16];
                                km8Var.k(bArr2, 0, 16);
                                if (z4 && z7 == 0) {
                                    int z8 = km8Var.z();
                                    byte[] bArr3 = new byte[z8];
                                    km8Var.k(bArr3, 0, z8);
                                    bArr = bArr3;
                                }
                                num = num2;
                                yicVar = new yic(z4, str, z7, bArr2, i4, i3, bArr);
                            } else {
                                i9 += m4;
                            }
                        } else {
                            num = num3;
                            yicVar = null;
                            break;
                        }
                    }
                    if (yicVar != null) {
                        z5 = true;
                    }
                    hif.j("tenc atom is mandatory", z5);
                    String str2 = a2d.a;
                    create = Pair.create(num, yicVar);
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += m;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:157:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x091c  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x093c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.cw i(defpackage.km8 r72, defpackage.mu0 r73, java.lang.String r74, defpackage.zk3 r75, boolean r76) {
        /*
            Method dump skipped, instructions count: 3724
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu0.i(km8, mu0, java.lang.String, zk3, boolean):cw");
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e8, code lost:
        if (r23 == 0) goto L395;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
        r23 = -9223372036854775807L;
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x05ae  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x0745  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x0787  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x079b  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x0206 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01d9  */
    /* JADX WARN: Type inference failed for: r13v3, types: [mu0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v32, types: [p88, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList j(defpackage.ss7 r54, defpackage.zv4 r55, long r56, defpackage.zk3 r58, boolean r59, boolean r60, defpackage.tu4 r61, boolean r62) {
        /*
            Method dump skipped, instructions count: 2743
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu0.j(ss7, zv4, long, zk3, boolean, boolean, tu4, boolean):java.util.ArrayList");
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01b1, code lost:
        r1.M(r15);
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01b9, code lost:
        r0 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x01c0, code lost:
        if (r0 != 6516084) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01c2, code lost:
        r0 = r1.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01cd, code lost:
        if (r1.m() != 1684108385) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01cf, code lost:
        r1.N(8);
        r0 = r1.v(r0 - 16);
        r8 = new defpackage.gq1("und", r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01e4, code lost:
        defpackage.st0.w("MetadataUtil", "Failed to parse comment attribute: ".concat(defpackage.ny0.e(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x01f5, code lost:
        if (r0 == 7233901) goto L164;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x01fa, code lost:
        if (r0 != 7631467) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0201, code lost:
        if (r0 == 6516589) goto L163;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0206, code lost:
        if (r0 != 7828084) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x020d, code lost:
        if (r0 != 6578553) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x020f, code lost:
        r8 = defpackage.pc2.s(r13, r1, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x0219, code lost:
        if (r0 != 4280916) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x021b, code lost:
        r8 = defpackage.pc2.s(r13, r1, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0225, code lost:
        if (r0 != 7630703) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0227, code lost:
        r8 = defpackage.pc2.s(r13, r1, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0231, code lost:
        if (r0 != 6384738) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x0233, code lost:
        r8 = defpackage.pc2.s(r13, r1, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0044, code lost:
        r1.M(r7);
        r7 = r7 + r13;
        r1.N(r0);
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x023e, code lost:
        if (r0 != 7108978) goto L150;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0240, code lost:
        r8 = defpackage.pc2.s(r13, r1, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x024b, code lost:
        if (r0 != 6776174) goto L153;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x024d, code lost:
        r8 = defpackage.pc2.s(r13, r1, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0256, code lost:
        if (r0 != 6779504) goto L156;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0258, code lost:
        r8 = defpackage.pc2.s(r13, r1, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0050, code lost:
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0263, code lost:
        if (r0 != 7173742) goto L159;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x0265, code lost:
        r8 = defpackage.pc2.s(r13, r1, "MVNM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0270, code lost:
        if (r0 != 7173737) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0272, code lost:
        r0 = defpackage.pc2.r(r13, "MVIN", r1, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0279, code lost:
        r1.M(r15);
        r8 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x027e, code lost:
        defpackage.st0.g("MetadataUtil", "Skipped unknown metadata entry: ".concat(defpackage.ny0.e(r13)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x0289, code lost:
        r1.M(r15);
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x028e, code lost:
        r8 = defpackage.pc2.s(r13, r1, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0296, code lost:
        r8 = defpackage.pc2.s(r13, r1, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0052, code lost:
        if (r13 >= r7) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x029e, code lost:
        if (r8 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02a0, code lost:
        r6.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02a3, code lost:
        r3 = false;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02a9, code lost:
        r1.M(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x02ac, code lost:
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02b1, code lost:
        if (r6.isEmpty() == false) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02b5, code lost:
        r12 = new defpackage.tb7(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0054, code lost:
        r15 = r1.m() + r13;
        r13 = r1.m();
        r0 = (r13 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
        if (r0 == 169) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x006d, code lost:
        if (r0 != 253) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
        if (r13 != 1735291493) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0077, code lost:
        r0 = defpackage.yk5.a(defpackage.pc2.q(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0080, code lost:
        if (r0 == null) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0082, code lost:
        r8 = new defpackage.sub("TCON", r12, defpackage.qs5.r(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
        defpackage.st0.w("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0091, code lost:
        r8 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
        r1.M(r15);
        r8 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009b, code lost:
        if (r13 != 1684632427) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x009d, code lost:
        r8 = defpackage.pc2.p(r13, r1, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00aa, code lost:
        if (r13 != 1953655662) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ac, code lost:
        r8 = defpackage.pc2.p(r13, r1, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00b6, code lost:
        if (r13 != 1953329263) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
        r8 = defpackage.pc2.r(r13, "TBPM", r1, true, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c2, code lost:
        if (r13 != 1668311404) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00c4, code lost:
        r8 = defpackage.pc2.r(r13, "TCMP", r1, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ce, code lost:
        if (r13 != 1668249202) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
        r8 = defpackage.pc2.o(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d8, code lost:
        if (r13 != 1631670868) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00da, code lost:
        r8 = defpackage.pc2.s(r13, r1, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e4, code lost:
        if (r13 != 1936682605) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e6, code lost:
        r8 = defpackage.pc2.s(r13, r1, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f0, code lost:
        if (r13 != 1936679276) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f2, code lost:
        r8 = defpackage.pc2.s(r13, r1, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fc, code lost:
        if (r13 != 1936679282) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fe, code lost:
        r8 = defpackage.pc2.s(r13, r1, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0108, code lost:
        if (r13 != 1936679265) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010a, code lost:
        r8 = defpackage.pc2.s(r13, r1, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0114, code lost:
        if (r13 != 1936679791) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0116, code lost:
        r8 = defpackage.pc2.s(r13, r1, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0121, code lost:
        if (r13 != 1920233063) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0123, code lost:
        r8 = defpackage.pc2.r(r13, "ITUNESADVISORY", r1, r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x012e, code lost:
        if (r13 != 1885823344) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0130, code lost:
        r8 = defpackage.pc2.r(r13, "ITUNESGAPLESS", r1, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x013b, code lost:
        if (r13 != 1936683886) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x013d, code lost:
        r8 = defpackage.pc2.s(r13, r1, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0148, code lost:
        if (r13 != 1953919848) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014a, code lost:
        r8 = defpackage.pc2.s(r13, r1, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0155, code lost:
        if (r13 != 757935405) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0157, code lost:
        r0 = r12;
        r8 = r0;
        r9 = -1;
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015b, code lost:
        r13 = r1.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015d, code lost:
        if (r13 >= r15) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x015f, code lost:
        r14 = r1.m();
        r12 = r1.m();
        r1.N(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016e, code lost:
        if (r12 != 1835360622) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0170, code lost:
        r0 = r1.v(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017a, code lost:
        if (r12 != 1851878757) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017c, code lost:
        r8 = r1.v(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0186, code lost:
        if (r12 != 1684108385) goto L90;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0188, code lost:
        r9 = r13;
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x018a, code lost:
        r1.N(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0192, code lost:
        if (r0 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0194, code lost:
        if (r8 == null) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0197, code lost:
        if (r9 != (-1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x019a, code lost:
        r1.M(r9);
        r1.N(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01ad, code lost:
        r8 = new defpackage.yz5(r0, r8, r1.v(r10 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b0, code lost:
        r8 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0356  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.tb7 k(defpackage.ts7 r18) {
        /*
            Method dump skipped, instructions count: 990
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nu0.k(ts7):tb7");
    }
}
