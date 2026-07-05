package defpackage;

import android.text.SpannableStringBuilder;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fa1  reason: default package */
/* loaded from: classes.dex */
public final class fa1 extends ia1 {
    public final km8 h = new km8();
    public final ea1 i = new ea1();
    public int j = -1;
    public final int k;
    public final da1[] l;
    public da1 m;
    public List n;
    public List o;
    public ea1 p;
    public int q;

    public fa1(int i, List list) {
        this.k = i == -1 ? 1 : i;
        if (list != null) {
            byte[] bArr = vk1.a;
            if (list.size() == 1 && ((byte[]) list.get(0)).length == 1) {
                byte b = ((byte[]) list.get(0))[0];
            }
        }
        this.l = new da1[8];
        int i2 = 0;
        while (true) {
            da1[] da1VarArr = this.l;
            if (i2 < 8) {
                da1VarArr[i2] = new da1();
                i2++;
            } else {
                this.m = da1VarArr[0];
                return;
            }
        }
    }

    @Override // defpackage.ia1, defpackage.zq2
    public final void flush() {
        super.flush();
        this.n = null;
        this.o = null;
        this.q = 0;
        this.m = this.l[0];
        m();
        this.p = null;
    }

    @Override // defpackage.ia1
    public final ja1 g() {
        List list = this.n;
        this.o = list;
        list.getClass();
        return new ja1(list);
    }

    @Override // defpackage.ia1
    public final void h(ga1 ga1Var) {
        boolean z;
        ByteBuffer byteBuffer = ga1Var.e;
        byteBuffer.getClass();
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        km8 km8Var = this.h;
        km8Var.K(array, limit);
        while (km8Var.a() >= 3) {
            int z2 = km8Var.z();
            int i = z2 & 3;
            boolean z3 = false;
            if ((z2 & 4) == 4) {
                z = true;
            } else {
                z = false;
            }
            byte z4 = (byte) km8Var.z();
            byte z5 = (byte) km8Var.z();
            if (i == 2 || i == 3) {
                if (z) {
                    if (i == 3) {
                        k();
                        int i2 = (z4 & 192) >> 6;
                        int i3 = this.j;
                        if (i3 != -1 && i2 != (i3 + 1) % 4) {
                            m();
                            st0.w("Cea708Decoder", "Sequence number discontinuity. previous=" + this.j + " current=" + i2);
                        }
                        this.j = i2;
                        int i4 = z4 & 63;
                        if (i4 == 0) {
                            i4 = 64;
                        }
                        ea1 ea1Var = new ea1(i2, i4);
                        this.p = ea1Var;
                        byte[] bArr = ea1Var.b;
                        ea1Var.e = 1;
                        bArr[0] = z5;
                    } else {
                        if (i == 2) {
                            z3 = true;
                        }
                        wq9.s(z3);
                        ea1 ea1Var2 = this.p;
                        if (ea1Var2 == null) {
                            st0.h("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                        } else {
                            byte[] bArr2 = ea1Var2.b;
                            int i5 = ea1Var2.e;
                            int i6 = i5 + 1;
                            ea1Var2.e = i6;
                            bArr2[i5] = z4;
                            ea1Var2.e = i5 + 2;
                            bArr2[i6] = z5;
                        }
                    }
                    ea1 ea1Var3 = this.p;
                    if (ea1Var3.e == (ea1Var3.d * 2) - 1) {
                        k();
                    }
                }
            }
        }
    }

    @Override // defpackage.ia1
    public final boolean j() {
        if (this.n != this.o) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final void k() {
        char c;
        int i;
        boolean z;
        da1 da1Var;
        ea1 ea1Var = this.p;
        if (ea1Var == null) {
            return;
        }
        int i2 = 2;
        if (ea1Var.e != (ea1Var.d * 2) - 1) {
            st0.g("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.p.d * 2) - 1) + ", but current index is " + this.p.e + " (sequence number " + this.p.c + ");");
        }
        ea1 ea1Var2 = this.p;
        byte[] bArr = ea1Var2.b;
        int i3 = ea1Var2.e;
        ea1 ea1Var3 = this.i;
        ea1Var3.l(bArr, i3);
        boolean z2 = false;
        while (true) {
            if (ea1Var3.b() > 0) {
                int i4 = 3;
                int g = ea1Var3.g(3);
                int g2 = ea1Var3.g(5);
                if (g == 7) {
                    ea1Var3.o(i2);
                    g = ea1Var3.g(6);
                    if (g < 7) {
                        a82.y("Invalid extended service number: ", "Cea708Decoder", g);
                    }
                }
                if (g2 == 0) {
                    if (g != 0) {
                        st0.w("Cea708Decoder", "serviceNumber is non-zero (" + g + ") when blockSize is 0");
                    }
                } else if (g != this.k) {
                    ea1Var3.p(g2);
                } else {
                    int e = (g2 * 8) + ea1Var3.e();
                    while (ea1Var3.e() < e) {
                        int g3 = ea1Var3.g(8);
                        if (g3 != 16) {
                            if (g3 <= 31) {
                                if (g3 != 0) {
                                    if (g3 != i4) {
                                        if (g3 != 8) {
                                            switch (g3) {
                                                case 12:
                                                    m();
                                                    break;
                                                case 13:
                                                    this.m.a('\n');
                                                    break;
                                                case 14:
                                                    break;
                                                default:
                                                    if (g3 >= 17 && g3 <= 23) {
                                                        st0.w("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + g3);
                                                        ea1Var3.o(8);
                                                        break;
                                                    } else if (g3 >= 24 && g3 <= 31) {
                                                        st0.w("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + g3);
                                                        ea1Var3.o(16);
                                                        break;
                                                    } else {
                                                        a82.y("Invalid C0 command: ", "Cea708Decoder", g3);
                                                        break;
                                                    }
                                            }
                                        } else {
                                            SpannableStringBuilder spannableStringBuilder = this.m.b;
                                            int length = spannableStringBuilder.length();
                                            if (length > 0) {
                                                spannableStringBuilder.delete(length - 1, length);
                                            }
                                        }
                                    } else {
                                        this.n = l();
                                    }
                                }
                                i = i2;
                            } else if (g3 <= 127) {
                                da1 da1Var2 = this.m;
                                if (g3 == 127) {
                                    da1Var2.a((char) 9835);
                                } else {
                                    da1Var2.a((char) (g3 & 255));
                                }
                                i = i2;
                                z2 = true;
                            } else {
                                if (g3 <= 159) {
                                    da1[] da1VarArr = this.l;
                                    switch (g3) {
                                        case Token.CASE /* 128 */:
                                        case Token.DEFAULT /* 129 */:
                                        case 130:
                                        case Token.DO /* 131 */:
                                        case Token.FOR /* 132 */:
                                        case Token.BREAK /* 133 */:
                                        case Token.CONTINUE /* 134 */:
                                        case Token.VAR /* 135 */:
                                            z = true;
                                            int i5 = g3 - 128;
                                            if (this.q != i5) {
                                                this.q = i5;
                                                this.m = da1VarArr[i5];
                                                break;
                                            }
                                            break;
                                        case Token.WITH /* 136 */:
                                            z = true;
                                            for (int i6 = 1; i6 <= 8; i6++) {
                                                if (ea1Var3.f()) {
                                                    da1 da1Var3 = da1VarArr[8 - i6];
                                                    da1Var3.a.clear();
                                                    da1Var3.b.clear();
                                                    da1Var3.o = -1;
                                                    da1Var3.p = -1;
                                                    da1Var3.q = -1;
                                                    da1Var3.s = -1;
                                                    da1Var3.u = 0;
                                                }
                                            }
                                            break;
                                        case Token.CATCH /* 137 */:
                                            for (int i7 = 1; i7 <= 8; i7++) {
                                                if (ea1Var3.f()) {
                                                    da1VarArr[8 - i7].d = true;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case Token.FINALLY /* 138 */:
                                            for (int i8 = 1; i8 <= 8; i8++) {
                                                if (ea1Var3.f()) {
                                                    da1VarArr[8 - i8].d = false;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case Token.VOID /* 139 */:
                                            for (int i9 = 1; i9 <= 8; i9++) {
                                                if (ea1Var3.f()) {
                                                    da1VarArr[8 - i9].d = !da1Var.d;
                                                }
                                            }
                                            z = true;
                                            break;
                                        case 140:
                                            for (int i10 = 1; i10 <= 8; i10++) {
                                                if (ea1Var3.f()) {
                                                    da1VarArr[8 - i10].d();
                                                }
                                            }
                                            z = true;
                                            break;
                                        case Token.EMPTY /* 141 */:
                                            ea1Var3.o(8);
                                            z = true;
                                            break;
                                        case Token.COMPUTED_PROPERTY /* 142 */:
                                            z = true;
                                            break;
                                        case Token.BLOCK /* 143 */:
                                            m();
                                            z = true;
                                            break;
                                        case Token.LABEL /* 144 */:
                                            int i11 = i2;
                                            if (!this.m.c) {
                                                ea1Var3.o(16);
                                                z = true;
                                                i4 = 3;
                                                break;
                                            } else {
                                                ea1Var3.g(4);
                                                ea1Var3.g(i11);
                                                ea1Var3.g(i11);
                                                boolean f = ea1Var3.f();
                                                boolean f2 = ea1Var3.f();
                                                i4 = 3;
                                                ea1Var3.g(3);
                                                ea1Var3.g(3);
                                                this.m.e(f, f2);
                                                z = true;
                                            }
                                        case Token.TARGET /* 145 */:
                                            if (!this.m.c) {
                                                ea1Var3.o(24);
                                            } else {
                                                int c2 = da1.c(ea1Var3.g(2), ea1Var3.g(2), ea1Var3.g(2), ea1Var3.g(2));
                                                int c3 = da1.c(ea1Var3.g(2), ea1Var3.g(2), ea1Var3.g(2), ea1Var3.g(2));
                                                ea1Var3.o(2);
                                                da1.c(ea1Var3.g(2), ea1Var3.g(2), ea1Var3.g(2), 0);
                                                this.m.f(c2, c3);
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case Token.LOOP /* 146 */:
                                            if (!this.m.c) {
                                                ea1Var3.o(16);
                                            } else {
                                                ea1Var3.o(4);
                                                int g4 = ea1Var3.g(4);
                                                ea1Var3.o(2);
                                                ea1Var3.g(6);
                                                da1 da1Var4 = this.m;
                                                if (da1Var4.u != g4) {
                                                    da1Var4.a('\n');
                                                }
                                                da1Var4.u = g4;
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case Token.EXPR_VOID /* 147 */:
                                        case Token.EXPR_RESULT /* 148 */:
                                        case Token.JSR /* 149 */:
                                        case 150:
                                        default:
                                            a82.y("Invalid C1 command: ", "Cea708Decoder", g3);
                                            z = true;
                                            break;
                                        case Token.TYPEOFNAME /* 151 */:
                                            if (!this.m.c) {
                                                ea1Var3.o(32);
                                            } else {
                                                int c4 = da1.c(ea1Var3.g(2), ea1Var3.g(2), ea1Var3.g(2), ea1Var3.g(2));
                                                ea1Var3.g(2);
                                                da1.c(ea1Var3.g(2), ea1Var3.g(2), ea1Var3.g(2), 0);
                                                ea1Var3.f();
                                                ea1Var3.f();
                                                ea1Var3.g(2);
                                                ea1Var3.g(2);
                                                int g5 = ea1Var3.g(2);
                                                ea1Var3.o(8);
                                                da1 da1Var5 = this.m;
                                                da1Var5.n = c4;
                                                da1Var5.k = g5;
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                        case Token.USE_STACK /* 152 */:
                                        case Token.SETPROP_OP /* 153 */:
                                        case Token.SETELEM_OP /* 154 */:
                                        case Token.LOCAL_BLOCK /* 155 */:
                                        case Token.SET_REF_OP /* 156 */:
                                        case Token.DOTDOT /* 157 */:
                                        case Token.COLONCOLON /* 158 */:
                                        case Token.XML /* 159 */:
                                            int i12 = g3 - 152;
                                            da1 da1Var6 = da1VarArr[i12];
                                            ea1Var3.o(i2);
                                            boolean f3 = ea1Var3.f();
                                            ea1Var3.o(i2);
                                            int g6 = ea1Var3.g(i4);
                                            boolean f4 = ea1Var3.f();
                                            int g7 = ea1Var3.g(7);
                                            int g8 = ea1Var3.g(8);
                                            int g9 = ea1Var3.g(4);
                                            int g10 = ea1Var3.g(4);
                                            ea1Var3.o(i2);
                                            ea1Var3.o(6);
                                            ea1Var3.o(i2);
                                            int g11 = ea1Var3.g(3);
                                            int g12 = ea1Var3.g(3);
                                            ArrayList arrayList = da1Var6.a;
                                            da1Var6.c = true;
                                            da1Var6.d = f3;
                                            da1Var6.e = g6;
                                            da1Var6.f = f4;
                                            da1Var6.g = g7;
                                            da1Var6.h = g8;
                                            da1Var6.i = g9;
                                            int i13 = g10 + 1;
                                            if (da1Var6.j != i13) {
                                                da1Var6.j = i13;
                                                while (true) {
                                                    if (arrayList.size() >= da1Var6.j || arrayList.size() >= 15) {
                                                        arrayList.remove(0);
                                                    }
                                                }
                                            }
                                            if (g11 != 0 && da1Var6.l != g11) {
                                                da1Var6.l = g11;
                                                int i14 = g11 - 1;
                                                int i15 = da1.B[i14];
                                                boolean z3 = da1.A[i14];
                                                int i16 = da1.y[i14];
                                                int i17 = da1.z[i14];
                                                int i18 = da1.x[i14];
                                                da1Var6.n = i15;
                                                da1Var6.k = i18;
                                            }
                                            if (g12 != 0 && da1Var6.m != g12) {
                                                da1Var6.m = g12;
                                                int i19 = g12 - 1;
                                                int i20 = da1.D[i19];
                                                int i21 = da1.C[i19];
                                                da1Var6.e(false, false);
                                                da1Var6.f(da1.v, da1.E[i19]);
                                            }
                                            if (this.q != i12) {
                                                this.q = i12;
                                                this.m = da1VarArr[i12];
                                            }
                                            z = true;
                                            i4 = 3;
                                            break;
                                    }
                                } else {
                                    z = true;
                                    if (g3 <= 255) {
                                        this.m.a((char) (g3 & 255));
                                    } else {
                                        a82.y("Invalid base command: ", "Cea708Decoder", g3);
                                        i = 2;
                                        c = 7;
                                    }
                                }
                                z2 = z;
                                i = 2;
                                c = 7;
                            }
                            c = 7;
                        } else {
                            int g13 = ea1Var3.g(8);
                            if (g13 <= 31) {
                                c = 7;
                                if (g13 > 7) {
                                    if (g13 <= 15) {
                                        ea1Var3.o(8);
                                    } else if (g13 <= 23) {
                                        ea1Var3.o(16);
                                    } else if (g13 <= 31) {
                                        ea1Var3.o(24);
                                    }
                                }
                            } else {
                                c = 7;
                                if (g13 <= 127) {
                                    if (g13 != 32) {
                                        if (g13 != 33) {
                                            if (g13 != 37) {
                                                if (g13 != 42) {
                                                    if (g13 != 44) {
                                                        if (g13 != 63) {
                                                            if (g13 != 57) {
                                                                if (g13 != 58) {
                                                                    if (g13 != 60) {
                                                                        if (g13 != 61) {
                                                                            switch (g13) {
                                                                                case Token.THIS /* 48 */:
                                                                                    this.m.a((char) 9608);
                                                                                    break;
                                                                                case Token.FALSE /* 49 */:
                                                                                    this.m.a((char) 8216);
                                                                                    break;
                                                                                case Token.TRUE /* 50 */:
                                                                                    this.m.a((char) 8217);
                                                                                    break;
                                                                                case Token.SHEQ /* 51 */:
                                                                                    this.m.a((char) 8220);
                                                                                    break;
                                                                                case Token.SHNE /* 52 */:
                                                                                    this.m.a((char) 8221);
                                                                                    break;
                                                                                case Token.REGEXP /* 53 */:
                                                                                    this.m.a((char) 8226);
                                                                                    break;
                                                                                default:
                                                                                    switch (g13) {
                                                                                        case Token.AND /* 118 */:
                                                                                            this.m.a((char) 8539);
                                                                                            break;
                                                                                        case Token.INC /* 119 */:
                                                                                            this.m.a((char) 8540);
                                                                                            break;
                                                                                        case 120:
                                                                                            this.m.a((char) 8541);
                                                                                            break;
                                                                                        case Token.DOT /* 121 */:
                                                                                            this.m.a((char) 8542);
                                                                                            break;
                                                                                        case Token.FUNCTION /* 122 */:
                                                                                            this.m.a((char) 9474);
                                                                                            break;
                                                                                        case Token.EXPORT /* 123 */:
                                                                                            this.m.a((char) 9488);
                                                                                            break;
                                                                                        case Token.IMPORT /* 124 */:
                                                                                            this.m.a((char) 9492);
                                                                                            break;
                                                                                        case Token.IF /* 125 */:
                                                                                            this.m.a((char) 9472);
                                                                                            break;
                                                                                        case Token.ELSE /* 126 */:
                                                                                            this.m.a((char) 9496);
                                                                                            break;
                                                                                        case Token.SWITCH /* 127 */:
                                                                                            this.m.a((char) 9484);
                                                                                            break;
                                                                                        default:
                                                                                            a82.y("Invalid G2 character: ", "Cea708Decoder", g13);
                                                                                            break;
                                                                                    }
                                                                            }
                                                                        } else {
                                                                            this.m.a((char) 8480);
                                                                        }
                                                                    } else {
                                                                        this.m.a((char) 339);
                                                                    }
                                                                } else {
                                                                    this.m.a((char) 353);
                                                                }
                                                            } else {
                                                                this.m.a((char) 8482);
                                                            }
                                                        } else {
                                                            this.m.a((char) 376);
                                                        }
                                                    } else {
                                                        this.m.a((char) 338);
                                                    }
                                                } else {
                                                    this.m.a((char) 352);
                                                }
                                            } else {
                                                this.m.a((char) 8230);
                                            }
                                        } else {
                                            this.m.a((char) 160);
                                        }
                                    } else {
                                        this.m.a(' ');
                                    }
                                    i = 2;
                                    z2 = true;
                                } else if (g13 <= 159) {
                                    if (g13 <= 135) {
                                        ea1Var3.o(32);
                                    } else if (g13 <= 143) {
                                        ea1Var3.o(40);
                                    } else if (g13 <= 159) {
                                        i = 2;
                                        ea1Var3.o(2);
                                        ea1Var3.o(ea1Var3.g(6) * 8);
                                    }
                                } else {
                                    i = 2;
                                    if (g13 <= 255) {
                                        if (g13 == 160) {
                                            this.m.a((char) 13252);
                                        } else {
                                            a82.y("Invalid G3 character: ", "Cea708Decoder", g13);
                                            this.m.a('_');
                                        }
                                        z2 = true;
                                    } else {
                                        a82.y("Invalid extended command: ", "Cea708Decoder", g13);
                                    }
                                }
                            }
                            i = 2;
                        }
                        i2 = i;
                    }
                }
            }
        }
        if (z2) {
            this.n = l();
        }
        this.p = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List l() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fa1.l():java.util.List");
    }

    public final void m() {
        for (int i = 0; i < 8; i++) {
            this.l[i].d();
        }
    }
}
