package defpackage;

import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fuc  reason: default package */
/* loaded from: classes3.dex */
public final class fuc extends rqe {
    @Override // defpackage.rqe
    public final int d(StringBuilder sb, byte[] bArr, int i) {
        bArr.getClass();
        if (bArr.length >= 0 && i >= 0 && i <= bArr.length) {
            int i2 = 0;
            while (i2 < i) {
                byte b = bArr[i2];
                int i3 = b & 255;
                int i4 = i3 >> 4;
                if (i4 >= 0 && i4 < 8) {
                    if ((55296 <= i3 && i3 < 57344) || i3 > 65535) {
                        int i5 = i3 - Parser.ARGC_LIMIT;
                        int d = h9a.d(i5, 10, 10);
                        int d2 = h9a.d(i5, 0, 10);
                        sb.append((char) (d | 55296));
                        sb.append((char) (d2 | 56320));
                    } else {
                        sb.append((char) i3);
                    }
                } else if (12 <= i4 && i4 < 14) {
                    int i6 = i2 + 1;
                    if (i6 >= i) {
                        break;
                    }
                    int i7 = ((b & 31) << 6) | (bArr[i6] & 63);
                    if ((55296 <= i7 && i7 < 57344) || i7 > 65535) {
                        int i8 = i7 - Parser.ARGC_LIMIT;
                        int d3 = h9a.d(i8, 10, 10);
                        int d4 = h9a.d(i8, 0, 10);
                        sb.append((char) (d3 | 55296));
                        sb.append((char) (d4 | 56320));
                    } else {
                        sb.append((char) i7);
                    }
                    i2 += 2;
                } else if (i4 == 14) {
                    int i9 = i2 + 2;
                    if (i9 >= i) {
                        break;
                    }
                    int i10 = ((b & 15) << 12) | ((bArr[i2 + 1] & 63) << 6) | (bArr[i9] & 63);
                    if ((55296 <= i10 && i10 < 57344) || i10 > 65535) {
                        int i11 = i10 - Parser.ARGC_LIMIT;
                        int d5 = h9a.d(i11, 10, 10);
                        int d6 = h9a.d(i11, 0, 10);
                        sb.append((char) (d5 | 55296));
                        sb.append((char) (d6 | 56320));
                    } else {
                        sb.append((char) i10);
                    }
                    i2 += 3;
                } else if (i4 == 15) {
                    int i12 = i2 + 3;
                    if (i12 >= i) {
                        break;
                    }
                    int N = h9a.N(h9a.N(h9a.N(h9a.N(0, h9a.d(b, 0, 3), 18, 3), h9a.d(bArr[i2 + 1], 0, 6), 12, 6), h9a.d(bArr[i2 + 2], 0, 6), 6, 6), h9a.d(bArr[i12], 0, 6), 0, 6);
                    if ((55296 <= N && N < 57344) || N > 65535) {
                        int i13 = N - Parser.ARGC_LIMIT;
                        int d7 = h9a.d(i13, 10, 10);
                        int d8 = h9a.d(i13, 0, 10);
                        sb.append((char) (d7 | 55296));
                        sb.append((char) (d8 | 56320));
                    } else {
                        sb.append((char) N);
                    }
                    i2 += 4;
                } else {
                    sb.append((char) 65533);
                }
                i2++;
            }
            return i2;
        }
        vs.k("Out of bounds");
        return 0;
    }

    @Override // defpackage.rqe
    public final void e(b50 b50Var, String str, int i) {
        str.getClass();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            int charAt = str.charAt(i3);
            if (55296 <= charAt && charAt < 57344) {
                int d = h9a.d(charAt, 10, 6);
                if (d != 54) {
                    if (d == 55) {
                        charAt = ((charAt & 1023) | (i2 << 10)) + Parser.ARGC_LIMIT;
                    } else {
                        cp8.j(charAt, "Unknown ");
                        return;
                    }
                } else {
                    i2 = charAt & 1023;
                }
            }
            if ((charAt & (-128)) == 0) {
                b50Var.b((byte) charAt);
            } else {
                if ((charAt & (-2048)) == 0) {
                    b50Var.b((byte) (((charAt >> 6) & 31) | 192));
                } else if (((-65536) & charAt) == 0) {
                    b50Var.b((byte) (((charAt >> 12) & 15) | 224));
                    b50Var.b((byte) (((charAt >> 6) & 63) | Token.CASE));
                } else if (((-2097152) & charAt) == 0) {
                    b50Var.b((byte) (((charAt >> 18) & 7) | 240));
                    b50Var.b((byte) (((charAt >> 12) & 63) | Token.CASE));
                    b50Var.b((byte) (((charAt >> 6) & 63) | Token.CASE));
                }
                b50Var.b((byte) ((charAt & 63) | Token.CASE));
            }
        }
    }

    @Override // defpackage.rqe
    public final int f(int i) {
        return i * 2;
    }

    @Override // defpackage.rqe
    public final int g(int i) {
        return i * 2;
    }
}
