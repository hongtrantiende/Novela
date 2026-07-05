package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: si5  reason: default package */
/* loaded from: classes.dex */
public abstract class si5 {
    public static final Map a = o17.s(new yk8(9, new pd2(0, 0, "\t")), new yk8(7, new pd2(6, 3, "￼")), new yk8(8, new pd2(6, 3, "￼")), new yk8(18, new pd2(6, 3, " ")), new yk8(19, new pd2(6, 3, "￼")), new yk8(20, new pd2(6, 3, "￼")), new yk8(21, new pd2(6, 3, "￼")), new yk8(22, new pd2(22, 11, "￼")), new yk8(23, new pd2(8, 4, "￼")), new yk8(24, new pd2(4, 2, "-")), new yk8(25, new pd2(4, 2, "-")), new yk8(26, new pd2(244, Token.FUNCTION, "￼")), new yk8(28, new pd2(62, 31, "￼")), new yk8(30, new pd2(2, 1, " ")), new yk8(31, new pd2(2, 1, " ")));

    public static final String a(u01 u01Var, int i, hl8 hl8Var) {
        ArrayList arrayList = hl8Var.b;
        StringBuilder sb = new StringBuilder();
        int i2 = 0;
        while (i2 < i) {
            int g = u01Var.g();
            int i3 = i2 + 1;
            if (g == 13) {
                sb.append("\n");
            } else if (g != 0) {
                if (g >= 32) {
                    int n = ak0.n(g);
                    if (n != -1) {
                        ak0.k(n, sb);
                    }
                } else {
                    pd2 pd2Var = (pd2) a.get(Integer.valueOf(g));
                    if (pd2Var != null) {
                        u01Var.o(pd2Var.a);
                        i2 = pd2Var.b + i3;
                        sb.append(pd2Var.c);
                    } else {
                        u01Var.a(4);
                        long n2 = rae.n(u01Var.b, u01Var.c);
                        u01Var.c += 4;
                        u01Var.g();
                        i2 += 4;
                        if (g != 29) {
                            switch (g) {
                                case 10:
                                    byte[] d = u01Var.d(84);
                                    int i4 = ((d[81] & 255) << 8) | (d[80] & 255);
                                    if (i4 == 0) {
                                        i4 = 1;
                                    }
                                    if (i4 <= 256) {
                                        u01Var.o(i4 * 27);
                                        for (int i5 = 0; i5 < i4; i5++) {
                                            c(u01Var, hl8Var);
                                        }
                                        c(u01Var, hl8Var);
                                        sb.append("");
                                        continue;
                                    } else {
                                        arrayList.add(new sm8(hl5.l("HWP3 table cell_count=", " abnormal — abandoning table body extraction", i4), gfd.C, null));
                                        throw new Exception(a82.j(i4, "HWP3 abnormal cell_count="));
                                    }
                                case 11:
                                    long n3 = rae.n(u01Var.d(348), 0);
                                    if (n3 > 0) {
                                        if (n3 < 104857600) {
                                            u01Var.o((int) n3);
                                            break;
                                        } else {
                                            break;
                                        }
                                    } else {
                                        continue;
                                    }
                                case 12:
                                    u01Var.o(84);
                                    continue;
                                default:
                                    switch (g) {
                                        case 14:
                                            u01Var.o(84);
                                            continue;
                                        case 15:
                                            u01Var.o(8);
                                            c(u01Var, hl8Var);
                                            continue;
                                        case 16:
                                            u01Var.o(10);
                                            c(u01Var, hl8Var);
                                            continue;
                                        case 17:
                                            u01Var.o(14);
                                            c(u01Var, hl8Var);
                                            continue;
                                            continue;
                                        default:
                                            boolean isEmpty = arrayList.isEmpty();
                                            gfd gfdVar = gfd.d;
                                            if (!isEmpty) {
                                                int size = arrayList.size();
                                                int i6 = 0;
                                                while (i6 < size) {
                                                    Object obj = arrayList.get(i6);
                                                    i6++;
                                                    if (((sm8) obj).b == gfdVar) {
                                                        continue;
                                                    }
                                                }
                                            }
                                            arrayList.add(new sm8(hl5.l("HWP3 partially handled control char ch=", " (further warnings for the same code suppressed)", g), gfdVar, null));
                                            break;
                                    }
                            }
                        } else if (n2 < 1000000) {
                            u01Var.o((int) n2);
                        }
                    }
                }
            }
            i2 = i3;
        }
        return k4b.N0(sb.toString()).toString();
    }

    public static final j06 b(byte[] bArr) {
        String str;
        String str2;
        String str3;
        String str4;
        ArrayList arrayList;
        bArr.getClass();
        int i = 0;
        u01 u01Var = new u01(bArr, 3, (byte) 0);
        byte[] bArr2 = ok9.a;
        byte[] d = u01Var.d(30);
        byte[] bArr3 = ok9.a;
        if (Arrays.equals(b00.d0(d, 0, bArr3.length), bArr3)) {
            int i2 = u01Var.c;
            u01Var.o(96);
            int g = u01Var.g();
            u01Var.o(26);
            int h = u01Var.h();
            u01Var.o(1);
            int g2 = u01Var.g();
            int i3 = u01Var.c;
            if (i3 == i2 + Token.CASE) {
                String m = ak0.m(u01Var.d(Token.ASSIGN_MOD));
                String m2 = ak0.m(u01Var.d(Token.ASSIGN_MOD));
                String m3 = ak0.m(u01Var.d(Token.ASSIGN_MOD));
                String m4 = ak0.m(u01Var.d(Token.ASSIGN_MOD));
                u01Var.o(560);
                if (u01Var.c == i3 + 1008) {
                    if (g == 0) {
                        u01Var.o(g2);
                        byte[] d0 = b00.d0(bArr, u01Var.c, bArr.length);
                        u01Var.c = bArr.length;
                        ArrayList arrayList2 = new ArrayList();
                        if (h != 0) {
                            try {
                                d0 = ak0.s(d0, true);
                            } catch (Throwable th) {
                                String message = th.getMessage();
                                if (message == null) {
                                    message = th.toString();
                                }
                                throw new Exception(s21.m("HWP3 decompression failed: ", message));
                            }
                        }
                        u01 u01Var2 = new u01(d0, 3, (byte) 0);
                        ArrayList arrayList3 = new ArrayList();
                        hl8 hl8Var = new hl8(arrayList3, arrayList2);
                        for (int i4 = 0; i4 < 7; i4++) {
                            try {
                                u01Var2.o(u01Var2.g() * 40);
                            } catch (Throwable th2) {
                                String message2 = th2.getMessage();
                                if (message2 == null) {
                                    message2 = th2.toString();
                                }
                                arrayList2.add(new sm8(s21.m("HWP3 parsing aborted during paragraph stream: ", message2), gfd.C, null));
                            }
                        }
                        u01Var2.o(u01Var2.g() * 238);
                        c(u01Var2, hl8Var);
                        ArrayList arrayList4 = new ArrayList();
                        int size = arrayList3.size();
                        int i5 = 0;
                        while (i5 < size) {
                            Object obj = arrayList3.get(i5);
                            i5++;
                            if (((String) obj).length() > 0) {
                                arrayList4.add(obj);
                            }
                        }
                        String i0 = sl1.i0(arrayList4, "\n\n", null, null, null, 62);
                        ArrayList arrayList5 = new ArrayList(tl1.s(arrayList3, 10));
                        int size2 = arrayList3.size();
                        while (i < size2) {
                            Object obj2 = arrayList3.get(i);
                            i++;
                            arrayList5.add(new zj5(ak5.a, (String) obj2, null, null, null, null, null, null, null, 4092));
                        }
                        if (m.length() == 0) {
                            str = null;
                        } else {
                            str = m;
                        }
                        if (m3.length() == 0) {
                            str2 = null;
                        } else {
                            str2 = m3;
                        }
                        if (m2.length() == 0) {
                            str3 = null;
                        } else {
                            str3 = m2;
                        }
                        if (m4.length() == 0) {
                            str4 = null;
                        } else {
                            str4 = m4;
                        }
                        yc3 yc3Var = new yc3(str, str2, null, str4, null, null, "3.0", str3, null, 308);
                        if (!arrayList2.isEmpty()) {
                            arrayList = arrayList2;
                        } else {
                            arrayList = null;
                        }
                        return new j06(i0, arrayList5, yc3Var, null, arrayList, null, 488);
                    }
                    throw new Exception("HWP3 body is encrypted and cannot be extracted.");
                }
                throw new Exception("HWP3: DocSummary size mismatch");
            }
            throw new Exception(hl5.l("HWP3: DocInfo size mismatch (got ", ", expected 128)", u01Var.c - i2));
        }
        throw new Exception("HWP3: invalid file signature");
    }

    public static final void c(u01 u01Var, hl8 hl8Var) {
        ArrayList arrayList = hl8Var.b;
        ArrayList arrayList2 = hl8Var.a;
        while (u01Var.c < u01Var.b.length) {
            int h = u01Var.h();
            int g = u01Var.g();
            if (g == 0) {
                u01Var.o(40);
                return;
            }
            int g2 = u01Var.g();
            gfd gfdVar = gfd.C;
            if (g <= 60000 && g2 <= 4096) {
                int h2 = u01Var.h();
                u01Var.o(1);
                u01Var.o(4);
                u01Var.o(1);
                u01Var.o(31);
                if (h == 0) {
                    u01Var.o(Token.LAST_TOKEN);
                }
                u01Var.o(g2 * 14);
                if (h2 != 0) {
                    for (int i = 0; i < g; i++) {
                        if (u01Var.h() != 1) {
                            u01Var.o(31);
                        }
                    }
                }
                try {
                    arrayList2.add(a(u01Var, g, hl8Var));
                } catch (Throwable th) {
                    int size = arrayList2.size();
                    String message = th.getMessage();
                    if (message == null) {
                        message = th.toString();
                    }
                    arrayList.add(new sm8(hl5.m("HWP3 paragraph #", " char stream parsing failed: ", size, message), gfdVar, null));
                    return;
                }
            } else {
                arrayList.add(new sm8(hl5.i(g, g2, "HWP3 abnormal paragraph header (char_count=", ", line_count=", ") -> abandoning the rest of the stream"), gfdVar, null));
                return;
            }
        }
    }
}
