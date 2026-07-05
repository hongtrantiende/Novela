package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: rq1  reason: default package */
/* loaded from: classes3.dex */
public final class rq1 implements l1a {
    public final /* synthetic */ int a;

    public /* synthetic */ rq1(int i) {
        this.a = i;
    }

    public static byte[] c(String str) {
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            String substring = str.substring(i2, i2 + 2);
            nqe.u(16);
            bArr[i] = (byte) Integer.parseInt(substring, 16);
        }
        return bArr;
    }

    public static boolean d(char c) {
        if ('0' > c || c >= ':') {
            if ('a' > c || c >= 'g') {
                if ('A' <= c && c < 'G') {
                    return true;
                }
                return false;
            }
            return true;
        }
        return true;
    }

    public static byte[] e(int i, String str) {
        if (str != null && str.length() != 0) {
            if (str.length() == i * 2) {
                for (int i2 = 0; i2 < str.length(); i2++) {
                    if (d(str.charAt(i2))) {
                    }
                }
                return c(str);
            }
            return Arrays.copyOf(r4b.H(str), i);
        }
        return new byte[i];
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
        if (r4 <= 24) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] f(java.lang.Integer r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r3 != 0) goto L7d
            int r3 = r4.length()
            r1 = 32
            if (r3 != r1) goto L25
            r3 = r0
        Lc:
            int r2 = r4.length()
            if (r3 >= r2) goto L20
            char r2 = r4.charAt(r3)
            boolean r2 = d(r2)
            if (r2 != 0) goto L1d
            goto L25
        L1d:
            int r3 = r3 + 1
            goto Lc
        L20:
            byte[] r3 = c(r4)
            return r3
        L25:
            int r3 = r4.length()
            r2 = 48
            if (r3 != r2) goto L47
            r3 = r0
        L2e:
            int r2 = r4.length()
            if (r3 >= r2) goto L42
            char r2 = r4.charAt(r3)
            boolean r2 = d(r2)
            if (r2 != 0) goto L3f
            goto L47
        L3f:
            int r3 = r3 + 1
            goto L2e
        L42:
            byte[] r3 = c(r4)
            return r3
        L47:
            int r3 = r4.length()
            r2 = 64
            if (r3 != r2) goto L68
        L4f:
            int r3 = r4.length()
            if (r0 >= r3) goto L63
            char r3 = r4.charAt(r0)
            boolean r3 = d(r3)
            if (r3 != 0) goto L60
            goto L68
        L60:
            int r0 = r0 + 1
            goto L4f
        L63:
            byte[] r3 = c(r4)
            return r3
        L68:
            byte[] r3 = defpackage.r4b.H(r4)
            int r4 = r3.length
            r0 = 16
            if (r4 > r0) goto L73
        L71:
            r1 = r0
            goto L78
        L73:
            r0 = 24
            if (r4 > r0) goto L78
            goto L71
        L78:
            byte[] r3 = java.util.Arrays.copyOf(r3, r1)
            return r3
        L7d:
            int r1 = r4.length()
            int r2 = r3.intValue()
            int r2 = r2 * 2
            if (r1 != r2) goto La2
        L89:
            int r1 = r4.length()
            if (r0 >= r1) goto L9d
            char r1 = r4.charAt(r0)
            boolean r1 = d(r1)
            if (r1 != 0) goto L9a
            goto La2
        L9a:
            int r0 = r0 + 1
            goto L89
        L9d:
            byte[] r3 = c(r4)
            return r3
        La2:
            byte[] r4 = defpackage.r4b.H(r4)
            int r3 = r3.intValue()
            byte[] r3 = java.util.Arrays.copyOf(r4, r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq1.f(java.lang.Integer, java.lang.String):byte[]");
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r1.equals("CBC") != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003a, code lost:
        if (r1.equals("") != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.nh1 g(java.lang.String r4) {
        /*
            r0 = 0
            if (r4 == 0) goto Ld
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r1 = r4.toUpperCase(r1)
            r1.getClass()
            goto Le
        Ld:
            r1 = r0
        Le:
            if (r1 == 0) goto L49
            int r2 = r1.hashCode()
            if (r2 == 0) goto L34
            r3 = 66500(0x103c4, float:9.3186E-41)
            if (r2 == r3) goto L2b
            r3 = 68452(0x10b64, float:9.5922E-41)
            if (r2 != r3) goto L3d
            java.lang.String r2 = "ECB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            nh1 r4 = defpackage.nh1.b
            return r4
        L2b:
            java.lang.String r2 = "CBC"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            goto L49
        L34:
            java.lang.String r2 = ""
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L3d
            goto L49
        L3d:
            java.lang.String r1 = "Unsupported cipher mode: "
            java.lang.String r2 = ". Only CBC and ECB are supported."
            java.lang.String r4 = defpackage.hl5.n(r1, r4, r2)
            defpackage.vs.m(r4)
            return r0
        L49:
            nh1 r4 = defpackage.nh1.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq1.g(java.lang.String):nh1");
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0042, code lost:
        if (r2.equals("no") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004b, code lost:
        if (r2.equals("nopadding") == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0050, code lost:
        return defpackage.ph1.c;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.ph1 h(java.lang.String r2) {
        /*
            if (r2 == 0) goto Lc
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r2 = r2.toLowerCase(r0)
            r2.getClass()
            goto Ld
        Lc:
            r2 = 0
        Ld:
            if (r2 == 0) goto L51
            int r0 = r2.hashCode()
            r1 = -1879416016(0xffffffff8ffa6330, float:-2.4690109E-29)
            if (r0 == r1) goto L45
            r1 = 3521(0xdc1, float:4.934E-42)
            if (r0 == r1) goto L3c
            r1 = 3735208(0x38fea8, float:5.234141E-39)
            if (r0 == r1) goto L30
            r1 = 922939497(0x3702f069, float:7.804579E-6)
            if (r0 == r1) goto L27
            goto L51
        L27:
            java.lang.String r0 = "zeropadding"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L39
            goto L51
        L30:
            java.lang.String r0 = "zero"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L39
            goto L51
        L39:
            ph1 r2 = defpackage.ph1.b
            return r2
        L3c:
            java.lang.String r0 = "no"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4e
            goto L51
        L45:
            java.lang.String r0 = "nopadding"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4e
            goto L51
        L4e:
            ph1 r2 = defpackage.ph1.c
            return r2
        L51:
            ph1 r2 = defpackage.ph1.a
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rq1.h(java.lang.String):ph1");
    }

    @Override // defpackage.l1a
    public final Object b(String str, Object[] objArr, m42 m42Var) {
        Object q0;
        String obj;
        Object q02;
        String obj2;
        Object q03;
        String obj3;
        Object q04;
        String obj4;
        Object q05;
        String obj5;
        Object q06;
        String obj6;
        String str2;
        String str3;
        String str4;
        Object q07;
        String obj7;
        Object q08;
        String obj8;
        String str5;
        String str6;
        String str7;
        byte[] i;
        Object q09;
        String obj9;
        Object q010;
        String obj10;
        Object q011;
        String obj11;
        Object q012;
        String obj12;
        Object q013;
        String obj13;
        Object q014;
        String obj14;
        Object q015;
        String obj15;
        Object q016;
        String obj16;
        String str8;
        String str9;
        Object q017;
        String obj17;
        Object q018;
        String obj18;
        String str10;
        String str11;
        String str12;
        byte[] j;
        Object q019;
        String obj19;
        Object q020;
        String obj20;
        Object q021;
        String obj21;
        Object q022;
        String obj22;
        String str13 = null;
        switch (this.a) {
            case 0:
                if (str.equals("Common_sleep")) {
                    z87.C(gs3.a, new oi(objArr, (m42) null, 14));
                    return Boolean.TRUE;
                }
                return null;
            default:
                oh1 oh1Var = oh1.e;
                qh1 qh1Var = qh1.l;
                qh1 qh1Var2 = qh1.m;
                qh1 qh1Var3 = qh1.k;
                int i2 = 0;
                switch (str.hashCode()) {
                    case -1093089467:
                        if (!str.equals("Crypto_sha256") || (q0 = b00.q0(0, objArr)) == null || (obj = q0.toString()) == null) {
                            return null;
                        }
                        return kqe.s(r4b.H(obj), vv9.j).a();
                    case -1093086712:
                        if (!str.equals("Crypto_sha512") || (q02 = b00.q0(0, objArr)) == null || (obj2 = q02.toString()) == null) {
                            return null;
                        }
                        return kqe.s(r4b.H(obj2), wv9.k).a();
                    case -554010951:
                        if (!str.equals("Crypto_hmacMd5") || (q03 = b00.q0(0, objArr)) == null || (obj3 = q03.toString()) == null || (q04 = b00.q0(1, objArr)) == null || (obj4 = q04.toString()) == null) {
                            return null;
                        }
                        return xpe.h(r4b.H(obj4), r4b.H(obj3), new qz6()).a();
                    case -113744969:
                        if (!str.equals("Crypto_tripleDesDecrypt") || (q05 = b00.q0(0, objArr)) == null || (obj5 = q05.toString()) == null || (q06 = b00.q0(1, objArr)) == null || (obj6 = q06.toString()) == null) {
                            return null;
                        }
                        Object q023 = b00.q0(2, objArr);
                        if (q023 != null) {
                            str2 = q023.toString();
                        } else {
                            str2 = null;
                        }
                        Object q024 = b00.q0(3, objArr);
                        if (q024 != null) {
                            str3 = q024.toString();
                        } else {
                            str3 = null;
                        }
                        nh1 g = g(str3);
                        Object q025 = b00.q0(4, objArr);
                        if (q025 != null) {
                            str4 = q025.toString();
                        } else {
                            str4 = null;
                        }
                        ph1 h = h(str4);
                        byte[] f = f(new Integer(24), obj6);
                        byte[] e = e(8, str2);
                        int[] iArr = bh0.a;
                        byte[] a = bh0.a(obj5);
                        if (a.length % 8 == 0) {
                            return r4b.F(s9e.n(2, a, f, e, g, h));
                        }
                        vm1.f("Invalid 3DES ciphertext length ", a.length, " for ", g, " mode. Decoded ciphertext must be a multiple of 8 bytes.");
                        return null;
                    case -74443812:
                        if (!str.equals("Crypto_aesDecrypt") || (q07 = b00.q0(0, objArr)) == null || (obj7 = q07.toString()) == null || (q08 = b00.q0(1, objArr)) == null || (obj8 = q08.toString()) == null) {
                            return null;
                        }
                        Object q026 = b00.q0(2, objArr);
                        if (q026 != null) {
                            str5 = q026.toString();
                        } else {
                            str5 = null;
                        }
                        Object q027 = b00.q0(3, objArr);
                        if (q027 != null) {
                            str6 = q027.toString();
                        } else {
                            str6 = null;
                        }
                        nh1 g2 = g(str6);
                        Object q028 = b00.q0(4, objArr);
                        if (q028 != null) {
                            str7 = q028.toString();
                        } else {
                            str7 = null;
                        }
                        ph1 h2 = h(str7);
                        byte[] f2 = f(null, obj8);
                        byte[] e2 = e(16, str5);
                        int[] iArr2 = bh0.a;
                        byte[] a2 = bh0.a(obj7);
                        if (a2.length % 16 == 0) {
                            int ordinal = h2.ordinal();
                            if (ordinal != 0) {
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        qh1Var = qh1Var3;
                                    } else {
                                        xk5.o();
                                        return null;
                                    }
                                } else {
                                    qh1Var = qh1Var2;
                                }
                            }
                            int ordinal2 = g2.ordinal();
                            if (ordinal2 != 0) {
                                if (ordinal2 == 1) {
                                    h hVar = new h(f2);
                                    oh1Var.getClass();
                                    byte[] d0 = b00.d0(a2, 0, a2.length);
                                    if (qh1Var.equals(qh1Var3)) {
                                        int length = d0.length;
                                        if (length % 16 != 0) {
                                            length = ((length / 16) + 1) * 16;
                                        }
                                        i = Arrays.copyOf(oh1Var.a(Arrays.copyOf(d0, length), hVar, qh1Var2, null), d0.length);
                                    } else {
                                        i = oh1Var.a(d0, hVar, qh1Var, null);
                                    }
                                } else {
                                    xk5.o();
                                    return null;
                                }
                            } else {
                                int[] iArr3 = h.g;
                                i = cbe.i(a2, f2, e2, qh1Var);
                            }
                            return r4b.F(i);
                        }
                        vm1.f("Invalid AES ciphertext length ", a2.length, " for ", g2, " mode. Decoded ciphertext must be a multiple of 16 bytes.");
                        return null;
                    case 1399072:
                        if (!str.equals("Crypto_md5") || (q09 = b00.q0(0, objArr)) == null || (obj9 = q09.toString()) == null) {
                            return null;
                        }
                        return kqe.s(r4b.H(obj9), qz6.j).a();
                    case 5713706:
                        if (!str.equals("Crypto_hmacSha1") || (q010 = b00.q0(0, objArr)) == null || (obj10 = q010.toString()) == null || (q011 = b00.q0(1, objArr)) == null || (obj11 = q011.toString()) == null) {
                            return null;
                        }
                        return xpe.h(r4b.H(obj11), r4b.H(obj10), new uv9()).a();
                    case 43555235:
                        if (!str.equals("Crypto_sha1") || (q012 = b00.q0(0, objArr)) == null || (obj12 = q012.toString()) == null) {
                            return null;
                        }
                        return kqe.s(r4b.H(obj12), uv9.i).a();
                    case 277931707:
                        if (!str.equals("Crypto_base64Decode") || (q013 = b00.q0(0, objArr)) == null || (obj13 = q013.toString()) == null) {
                            return null;
                        }
                        int[] iArr4 = bh0.a;
                        byte[] a3 = bh0.a(obj13);
                        StringBuilder sb = new StringBuilder(a3.length);
                        int length2 = a3.length;
                        while (i2 < length2) {
                            sb.append((char) (a3[i2] & 255));
                            i2++;
                        }
                        return sb.toString();
                    case 314872547:
                        if (!str.equals("Crypto_base64Encode") || (q014 = b00.q0(0, objArr)) == null || (obj14 = q014.toString()) == null) {
                            return null;
                        }
                        int[] iArr5 = bh0.a;
                        int length3 = obj14.length();
                        byte[] bArr = new byte[length3];
                        while (i2 < length3) {
                            bArr[i2] = (byte) (obj14.charAt(i2) & 255);
                            i2++;
                        }
                        return bh0.b(bArr);
                    case 1031421071:
                        if (!str.equals("Crypto_tripleDesEncrypt") || (q015 = b00.q0(0, objArr)) == null || (obj15 = q015.toString()) == null || (q016 = b00.q0(1, objArr)) == null || (obj16 = q016.toString()) == null) {
                            return null;
                        }
                        Object q029 = b00.q0(2, objArr);
                        if (q029 != null) {
                            str8 = q029.toString();
                        } else {
                            str8 = null;
                        }
                        Object q030 = b00.q0(3, objArr);
                        if (q030 != null) {
                            str9 = q030.toString();
                        } else {
                            str9 = null;
                        }
                        nh1 g3 = g(str9);
                        Object q031 = b00.q0(4, objArr);
                        if (q031 != null) {
                            str13 = q031.toString();
                        }
                        byte[] n = s9e.n(1, r4b.H(obj15), f(new Integer(24), obj16), e(8, str8), g3, h(str13));
                        int[] iArr6 = bh0.a;
                        return bh0.b(n);
                    case 1070722228:
                        if (!str.equals("Crypto_aesEncrypt") || (q017 = b00.q0(0, objArr)) == null || (obj17 = q017.toString()) == null || (q018 = b00.q0(1, objArr)) == null || (obj18 = q018.toString()) == null) {
                            return null;
                        }
                        Object q032 = b00.q0(2, objArr);
                        if (q032 != null) {
                            str10 = q032.toString();
                        } else {
                            str10 = null;
                        }
                        Object q033 = b00.q0(3, objArr);
                        if (q033 != null) {
                            str11 = q033.toString();
                        } else {
                            str11 = null;
                        }
                        nh1 g4 = g(str11);
                        Object q034 = b00.q0(4, objArr);
                        if (q034 != null) {
                            str12 = q034.toString();
                        } else {
                            str12 = null;
                        }
                        ph1 h3 = h(str12);
                        byte[] f3 = f(null, obj18);
                        byte[] e3 = e(16, str10);
                        byte[] H = r4b.H(obj17);
                        int ordinal3 = h3.ordinal();
                        if (ordinal3 != 0) {
                            if (ordinal3 != 1) {
                                if (ordinal3 == 2) {
                                    qh1Var = qh1Var3;
                                } else {
                                    xk5.o();
                                    return null;
                                }
                            } else {
                                qh1Var = qh1Var2;
                            }
                        }
                        int ordinal4 = g4.ordinal();
                        if (ordinal4 != 0) {
                            if (ordinal4 == 1) {
                                h hVar2 = new h(f3);
                                oh1Var.getClass();
                                byte[] d02 = b00.d0(H, 0, H.length);
                                if (qh1Var.equals(qh1Var3)) {
                                    j = Arrays.copyOf(oh1Var.b(d02, hVar2, qh1Var2, null), d02.length);
                                } else {
                                    j = oh1Var.b(d02, hVar2, qh1Var, null);
                                }
                            } else {
                                xk5.o();
                                return null;
                            }
                        } else {
                            int[] iArr7 = h.g;
                            j = cbe.j(H, f3, e3, qh1Var);
                        }
                        int[] iArr8 = bh0.a;
                        return bh0.b(j);
                    case 1195906828:
                        if (!str.equals("Crypto_hmacSha256") || (q019 = b00.q0(0, objArr)) == null || (obj19 = q019.toString()) == null || (q020 = b00.q0(1, objArr)) == null || (obj20 = q020.toString()) == null) {
                            return null;
                        }
                        return xpe.h(r4b.H(obj20), r4b.H(obj19), new vv9()).a();
                    case 1195909583:
                        if (!str.equals("Crypto_hmacSha512") || (q021 = b00.q0(0, objArr)) == null || (obj21 = q021.toString()) == null || (q022 = b00.q0(1, objArr)) == null || (obj22 = q022.toString()) == null) {
                            return null;
                        }
                        return xpe.h(r4b.H(obj22), r4b.H(obj21), new wv9()).a();
                    default:
                        return null;
                }
        }
    }
}
