package defpackage;

import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.PasswordTransformationMethod;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yz1  reason: default package */
/* loaded from: classes.dex */
public abstract class yz1 {
    public static final int[] a = {99, Token.IMPORT, Token.INC, Token.EXPORT, 242, Token.ASSIGN_URSH, Token.ASSIGN_DIV, 197, 48, 1, Token.ASSIGN_BITAND, 43, 254, 215, Token.ARRAYCOMP, Token.AND, 202, 130, 201, Token.IF, Context.VERSION_ECMASCRIPT, 89, 71, 240, Token.WITHEXPR, 212, Token.XMLEND, Token.COMMENT, Token.SET_REF_OP, Token.TO_DOUBLE, 114, 192, Token.TAGGED_TEMPLATE_LITERAL, 253, Token.EXPR_VOID, 38, 54, 63, 247, 204, 52, Token.GET, 229, 241, Token.ASSIGN_EXP, 216, 49, 21, 4, 199, 35, 195, 24, 150, 5, Token.SETELEM_OP, 7, 18, Token.CASE, 226, 235, 39, Token.ARROW, Token.OR, 9, Token.DO, 44, 26, 27, 110, 90, 160, 82, 59, 214, Token.YIELD_STAR, 41, 227, 47, Token.FOR, 83, 209, 0, 237, 32, 252, Token.METHOD, 91, Token.ASSIGN_RSH, 203, 190, 57, 74, 76, 88, 207, 208, 239, 170, 251, 67, 77, 51, Token.BREAK, 69, 249, 2, Token.SWITCH, 80, 60, Token.XML, Token.CONST, 81, Token.TO_OBJECT, 64, Token.BLOCK, Token.LOOP, Token.DOTDOT, 56, 245, 188, Token.TEMPLATE_LITERAL_SUBST, 218, 33, 16, 255, 243, 210, 205, 12, 19, 236, 95, Token.TYPEOFNAME, 68, 23, 196, Token.LET, Token.ELSE, 61, 100, 93, 25, Token.HOOK, 96, Token.DEFAULT, 79, 220, 34, 42, Token.LABEL, Token.WITH, 70, 238, Token.DOTDOTDOT, 20, 222, 94, 11, 219, 224, 50, 58, 10, 73, 6, 36, 92, 194, 211, Token.LETEXPR, 98, Token.TARGET, Token.JSR, 228, Token.DOT, 231, Context.VERSION_ES6, 55, Token.ASSIGN_SUB, Token.EMPTY, 213, 78, Token.SETCONST, Token.ASSIGN_ADD, 86, 244, 234, 101, Token.FUNCTION, Token.DEBUGGER, 8, Token.QUESTION_DOT, 120, 37, 46, 28, Token.SET, 180, 198, 232, 221, Token.COLON, 31, 75, 189, Token.VOID, Token.FINALLY, Token.ASSIGN_MOD, 62, Token.TEMPLATE_CHARS, 102, 72, 3, 246, 14, 97, 53, 87, 185, Token.CONTINUE, 193, 29, Token.COLONCOLON, 225, 248, Token.USE_STACK, 17, Token.ASSIGN_LSH, 217, Token.COMPUTED_PROPERTY, Token.EXPR_RESULT, Token.LOCAL_BLOCK, 30, Token.VAR, 233, 206, 85, 40, 223, 140, Token.XMLATTR, Token.CATCH, 13, 191, 230, 66, Token.ASSIGN_LOGICAL_AND, 65, Token.SETPROP_OP, 45, 15, Token.GENEXPR, 84, Token.LAST_TOKEN, 22};
    public static final int[] b = {82, 9, Token.ASSIGN_RSH, 213, 48, 54, Token.GET, 56, 191, 64, Token.TO_OBJECT, Token.COLONCOLON, Token.DEFAULT, 243, 215, 251, Token.IMPORT, 227, 57, 130, Token.LOCAL_BLOCK, 47, 255, Token.VAR, 52, Token.COMPUTED_PROPERTY, 67, 68, 196, 222, 233, 203, 84, Token.EXPORT, Token.EXPR_RESULT, 50, Token.SET, 194, 35, 61, 238, 76, Token.JSR, 11, 66, Context.VERSION_ECMASCRIPT, 195, 78, 8, 46, Token.XMLATTR, 102, 40, 217, 36, Token.ARROW, Token.AND, 91, Token.XMLEND, 73, Token.ASSIGN_SUB, Token.VOID, 209, 37, 114, 248, 246, 100, Token.CONTINUE, Token.ASSIGN_LOGICAL_AND, Token.USE_STACK, 22, 212, Token.TO_DOUBLE, 92, 204, 93, 101, Token.TEMPLATE_LITERAL_SUBST, Token.LOOP, Token.ASSIGN_ADD, Token.ASSIGN_MOD, 72, 80, 253, 237, 185, 218, 94, 21, 70, 87, Token.LET, Token.EMPTY, Token.DOTDOT, Token.FOR, Token.LABEL, 216, Token.ARRAYCOMP, 0, 140, 188, 211, 10, 247, 228, 88, 5, Token.DOTDOTDOT, Token.YIELD_STAR, 69, 6, 208, 44, 30, Token.BLOCK, 202, 63, 15, 2, 193, Token.COMMENT, 189, 3, 1, 19, Token.FINALLY, Token.ASSIGN_URSH, 58, Token.TARGET, 17, 65, 79, Token.ASSIGN_BITAND, 220, 234, Token.TYPEOFNAME, 242, 207, 206, 240, 180, 230, Token.HOOK, 150, Token.LETEXPR, Token.COLON, 34, 231, Token.WITHEXPR, 53, Token.BREAK, 226, 249, 55, 232, 28, Token.OR, 223, 110, 71, 241, 26, Token.ASSIGN_EXP, 29, 41, 197, Token.CATCH, Token.ASSIGN_DIV, Token.TAGGED_TEMPLATE_LITERAL, 98, 14, 170, 24, 190, 27, 252, 86, 62, 75, 198, 210, Token.DOT, 32, Token.SETELEM_OP, 219, 192, 254, 120, 205, 90, 244, 31, 221, Token.CONST, 51, Token.WITH, 7, 199, 49, Token.METHOD, 18, 16, 89, 39, Token.CASE, 236, 95, 96, 81, Token.SWITCH, Token.SETCONST, 25, Token.TEMPLATE_CHARS, 74, 13, 45, 229, Token.FUNCTION, Token.XML, Token.EXPR_VOID, 201, Token.SET_REF_OP, 239, 160, 224, 59, 77, Token.DEBUGGER, 42, 245, Token.GENEXPR, Context.VERSION_ES6, 235, Token.LAST_TOKEN, 60, Token.DO, 83, Token.SETPROP_OP, 97, 23, 43, 4, Token.ELSE, Token.QUESTION_DOT, Token.INC, 214, 38, 225, Token.ASSIGN_LSH, 20, 99, 85, 33, 12, Token.IF};
    public static final int[] c = {1, 2, 4, 8, 16, 32, 64, Token.CASE, 27, 54};
    public static final tu1 d = new tu1(new mv1(8), false, -804347323);
    public static final byte[] e = {0, 0, 0, 0, 16, 0, Byte.MIN_VALUE, 0, 0, -86, 0, 56, -101, 113};
    public static final byte[] f = {0, 0, 33, 7, -45, 17, -122, 68, -56, -63, -54, 0, 0, 0};

    public static final String A(float f2) {
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f3 = f2 * pow;
        int i = (int) f3;
        if (f3 - i >= 0.5f) {
            i++;
        }
        float f4 = i / pow;
        if (max > 0) {
            return String.valueOf(f4);
        }
        return String.valueOf((int) f4);
    }

    public static String B(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length);
        for (byte b2 : bArr) {
            if (b2 != 34) {
                if (b2 != 39) {
                    if (b2 != 92) {
                        switch (b2) {
                            case 7:
                                sb.append("\\a");
                                continue;
                            case 8:
                                sb.append("\\b");
                                continue;
                            case 9:
                                sb.append("\\t");
                                continue;
                            case 10:
                                sb.append("\\n");
                                continue;
                            case 11:
                                sb.append("\\v");
                                continue;
                            case 12:
                                sb.append("\\f");
                                continue;
                            case 13:
                                sb.append("\\r");
                                continue;
                            default:
                                if (b2 >= 32 && b2 <= 126) {
                                    sb.append((char) b2);
                                    continue;
                                } else {
                                    sb.append('\\');
                                    sb.append((char) (((b2 >>> 6) & 3) + 48));
                                    sb.append((char) (((b2 >>> 3) & 7) + 48));
                                    sb.append((char) ((b2 & 7) + 48));
                                    break;
                                }
                        }
                    } else {
                        sb.append("\\\\");
                    }
                } else {
                    sb.append("\\'");
                }
            } else {
                sb.append("\\\"");
            }
        }
        return sb.toString();
    }

    public static final void a(List list, rh8 rh8Var, nq7 nq7Var, mu4 mu4Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean h;
        int i7;
        rv4Var.g0(-1392758667);
        if ((i & 6) == 0) {
            if ((i & 8) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(rh8Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        if ((i & 384) == 0) {
            if (rv4Var.f(nq7Var)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i2 |= i5;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(mu4Var)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i2 |= i4;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(xt4Var)) {
                i3 = 16384;
            } else {
                i3 = 8192;
            }
            i2 |= i3;
        }
        if ((i2 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i2 & 1, z)) {
            if ((i2 & 14) != 4 && ((i2 & 8) == 0 || !rv4Var.f(list))) {
                z2 = false;
            } else {
                z2 = true;
            }
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (z2 || P == obj) {
                P = yae.z(list);
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            bkd r = mwe.r(mwe.r(rh8Var, mwe.g(14, rv4Var)), zbe.j(nae.e, nae.e, nae.e, 80.0f, 7));
            kj6 a2 = mj6.a(0, rv4Var, 0, 3);
            boolean f2 = rv4Var.f(aw7Var);
            Object P2 = rv4Var.P();
            if (f2 || P2 == obj) {
                P2 = new a42(aw7Var, null, 2);
                rv4Var.o0(P2);
            }
            vo9 B = vqe.B(a2, r, (nu4) P2, rv4Var, 12);
            bkd r2 = mwe.r(r, zbe.j(16.0f, nae.e, 16.0f, nae.e, 10));
            bkd r3 = mwe.r(r, zbe.j(nae.e, nae.e, 4.0f, nae.e, 11));
            hz hzVar = new hz(4.0f, true, new vs(2));
            boolean f3 = rv4Var.f(aw7Var) | rv4Var.f(B);
            if ((i2 & 7168) == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean z5 = f3 | z3;
            if ((57344 & i2) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z6 = z5 | z4;
            Object P3 = rv4Var.P();
            if (z6 || P3 == obj) {
                Object bz6Var = new bz6(aw7Var, B, mu4Var, xt4Var, 0);
                rv4Var.o0(bz6Var);
                P3 = bz6Var;
            }
            pc2.c(nq7Var, a2, r2, hzVar, null, null, false, r3, 0L, 0L, nae.e, (xt4) P3, rv4Var, ((i2 >> 6) & 14) | 24576, 0, 3816);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new cz6(list, rh8Var, nq7Var, mu4Var, xt4Var, i, 0);
        }
    }

    public static final void b(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var) {
        int i2;
        int i3;
        boolean z;
        nq7 nq7Var2;
        int i4;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(200878002);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i2 | i;
        if (rv4Var2.h(vt4Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3;
        if ((i6 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i6 & 1, z)) {
            nq7 y = zbe.y(nq7Var, 24.0f);
            xn1 a2 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, y);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(qw1.f, rv4Var2, a2);
            jce.F(qw1.e, rv4Var2, l);
            jce.F(qw1.g, rv4Var2, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var2);
            jce.F(qw1.d, rv4Var2, p);
            cvb.c(yqe.A((y3b) x2b.r0.getValue(), rv4Var2), null, 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.f, rv4Var2, 0, 0, 130046);
            rv4Var2 = rv4Var2;
            xbe.i(rv4Var2, pna.h(kq7.a, 24.0f));
            i4 = 3;
            nq7Var2 = nq7Var;
            z1d.f(rp5.c((wk3) jk3.a.getValue(), rv4Var2, 0), yqe.A((y3b) v1b.f.getValue(), rv4Var2), false, null, null, null, null, null, vt4Var, rv4Var2, (i6 << 21) & 234881024, 252);
            rv4Var2.q(true);
        } else {
            nq7Var2 = nq7Var;
            i4 = 3;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new u81(nq7Var2, vt4Var, i, i4);
        }
    }

    public static final void c(cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        pb2 pb2Var;
        cz7Var.getClass();
        rv4Var.g0(2052815590);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i2 | i;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                iz6 iz6Var = (iz6) ((fdd) voe.z(cm9.a(iz6.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z2 = jsc.z(iz6Var.d, rv4Var);
                do3 I = z1d.I(rv4Var);
                fxe.h(yqe.A((y3b) z1b.e.getValue(), rv4Var), pna.c, false, jce.E(-1427562774, new h64(cz7Var, 15), rv4Var), null, jce.E(-1759475579, new dz6(z2, I, 0), rv4Var), jce.E(-292398789, new cs1(7, I, iz6Var, z2), rv4Var), rv4Var, 1772592, 20);
                boolean f2 = rv4Var.f(iz6Var);
                Object P = rv4Var.P();
                if (f2 || P == ax1.a) {
                    P = new qo4(iz6Var, 22);
                    rv4Var.o0(P);
                }
                z1d.i(I, (mu4) P, rv4Var, 0);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new h64(cz7Var, i, 16);
        }
    }

    public static final void d(String str, boolean z, int i, boolean z2, xt4 xt4Var, lu4 lu4Var, rv4 rv4Var, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        boolean z3;
        int i12;
        int i13;
        str.getClass();
        xt4Var.getClass();
        lu4Var.getClass();
        rv4Var.g0(-731565353);
        if (rv4Var.f(str)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i14 = i2 | i4;
        if (rv4Var.g(z)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i15 = i14 | i5;
        int i16 = i3 & 4;
        if (i16 != 0) {
            i8 = i15 | 384;
            i6 = i;
        } else {
            i6 = i;
            if (rv4Var.d(i6)) {
                i7 = 256;
            } else {
                i7 = Token.CASE;
            }
            i8 = i15 | i7;
        }
        if (rv4Var.g(z2)) {
            i9 = 2048;
        } else {
            i9 = 1024;
        }
        int i17 = i8 | i9;
        if (rv4Var.h(xt4Var)) {
            i10 = 16384;
        } else {
            i10 = 8192;
        }
        int i18 = i17 | i10;
        if (rv4Var.h(lu4Var)) {
            i11 = 131072;
        } else {
            i11 = Parser.ARGC_LIMIT;
        }
        int i19 = i18 | i11;
        if ((74899 & i19) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var.U(i19 & 1, z3)) {
            if (i16 != 0) {
                i13 = 0;
            } else {
                i13 = i6;
            }
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.valueOf(z));
                rv4Var.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = yae.z(ks3.a);
                rv4Var.o0(P2);
            }
            aw7 aw7Var2 = (aw7) P2;
            int i20 = i19 >> 9;
            xb.d(z2, xt4Var, jce.E(1582919211, new td7(lu4Var, xt4Var, aw7Var, aw7Var2), rv4Var), null, mwe.x(kq7.a, 14), jce.E(2100161454, new id1(xt4Var, 8, (byte) 0), rv4Var), jce.E(-2022391761, new jd1(str, 9), rv4Var), null, 0L, 0L, nae.e, false, false, jce.E(1767602819, new gk7(i13, 17, (Object) aw7Var2, (Object) aw7Var, false), rv4Var), rv4Var, (i20 & 14) | 1769856 | (i20 & Token.ASSIGN_MOD), 8072);
            i12 = i13;
        } else {
            rv4Var.X();
            i12 = i6;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ud7(str, z, i12, z2, xt4Var, lu4Var, i2, i3);
        }
    }

    public static final boolean e(float f2, float f3, float f4) {
        if (k(2, Math.abs(f2 - f3)) <= f4) {
            return true;
        }
        return false;
    }

    public static final int f(int i, gw7 gw7Var) {
        int i2 = gw7Var.c - 1;
        int i3 = 0;
        while (i3 < i2) {
            int i4 = ((i2 - i3) / 2) + i3;
            Object[] objArr = gw7Var.a;
            int i5 = ((q06) objArr[i4]).a;
            if (i5 != i) {
                if (i5 < i) {
                    i3 = i4 + 1;
                    if (i < ((q06) objArr[i3]).a) {
                    }
                } else {
                    i2 = i4 - 1;
                }
            }
            return i4;
        }
        return i3;
    }

    public static final void g(int[] iArr, int[] iArr2, int i) {
        int i2 = i * 4;
        for (int i3 = 0; i3 < 4; i3++) {
            int i4 = iArr2[i2 + i3];
            int i5 = i3 * 4;
            iArr[i5] = iArr[i5] ^ ((i4 >>> 24) & 255);
            int i6 = i5 + 1;
            iArr[i6] = iArr[i6] ^ ((i4 >>> 16) & 255);
            int i7 = i5 + 2;
            iArr[i7] = iArr[i7] ^ ((i4 >>> 8) & 255);
            int i8 = i5 + 3;
            iArr[i8] = (i4 & 255) ^ iArr[i8];
        }
    }

    public static boolean h(s94 s94Var) {
        km8 km8Var = new km8(8);
        int i = cy5.b(s94Var, km8Var).a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        s94Var.x(km8Var.a, 0, 4);
        km8Var.M(0);
        int m = km8Var.m();
        if (m != 1463899717) {
            st0.h("WavHeaderReader", "Unsupported form type: " + m);
            return false;
        }
        return true;
    }

    public static final float i(float f2) {
        if (f2 == -0.0f) {
            return nae.e;
        }
        return f2;
    }

    public static final y3b j(int i) {
        if (i != 1 && i != 2) {
            if (i != 4) {
                return (y3b) s2b.j0.getValue();
            }
            return (y3b) s2b.k0.getValue();
        }
        return (y3b) s2b.i0.getValue();
    }

    public static final float k(int i, float f2) {
        if (Float.isNaN(f2)) {
            return f2;
        }
        double pow = Math.pow(10.0d, i);
        return (float) (Math.rint(f2 * pow) / pow);
    }

    public static c39 l(lw lwVar) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            return new c39(ru.y(lwVar));
        }
        TextPaint textPaint = new TextPaint(lwVar.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = lwVar.getBreakStrategy();
        int hyphenationFrequency = lwVar.getHyphenationFrequency();
        if (lwVar.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z = true;
            if (i >= 28 && (lwVar.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(ru.n(DecimalFormatSymbols.getInstance(lwVar.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                if (lwVar.getLayoutDirection() != 1) {
                    z = false;
                }
                switch (lwVar.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case 5:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case 6:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            }
        }
        return new c39(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static final int m(int i, int i2) {
        int i3 = 0;
        for (int i4 = 0; i4 < 8; i4++) {
            if ((i2 & 1) != 0) {
                i3 ^= i;
            }
            int i5 = i & Token.CASE;
            i = (i << 1) & 255;
            if (i5 != 0) {
                i ^= 27;
            }
            i2 >>= 1;
        }
        return i3;
    }

    public static final void n(int[] iArr) {
        int i = iArr[13];
        iArr[13] = iArr[9];
        iArr[9] = iArr[5];
        iArr[5] = iArr[1];
        iArr[1] = i;
        int i2 = iArr[2];
        iArr[2] = iArr[10];
        iArr[10] = i2;
        int i3 = iArr[6];
        iArr[6] = iArr[14];
        iArr[14] = i3;
        int i4 = iArr[3];
        iArr[3] = iArr[7];
        iArr[7] = iArr[11];
        iArr[11] = iArr[15];
        iArr[15] = i4;
    }

    public static boolean o() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    public static final boolean p(long j, long j2) {
        yk8 yk8Var;
        boolean z;
        boolean z2;
        if (!eh.q(j) && !eh.q(j2)) {
            int i = az5.c;
            int i2 = (int) (j >> 32);
            int i3 = (int) (j & 4294967295L);
            if ((i2 <= i3 || ((int) (j2 >> 32)) >= ((int) (j2 & 4294967295L))) && (i2 >= i3 || ((int) (j2 >> 32)) <= ((int) (j2 & 4294967295L)))) {
                int i4 = (int) (j2 >> 32);
                if (i2 > i4 && i3 > ((int) (j2 & 4294967295L))) {
                    yk8Var = new yk8(new az5(j), new az5(j2));
                } else if (i2 < i4 && i3 < ((int) (j2 & 4294967295L))) {
                    yk8Var = new yk8(new az5(j2), new az5(j));
                }
                long j3 = ((az5) yk8Var.a).a;
                long j4 = ((az5) yk8Var.b).a;
                float f2 = (int) (j3 >> 32);
                float f3 = (int) (j4 >> 32);
                float f4 = (int) (j3 & 4294967295L);
                float f5 = (int) (j4 & 4294967295L);
                if (Math.abs((f4 / (f2 / f3)) - f5) <= 2.0f) {
                    z = true;
                } else {
                    z = false;
                }
                if (Math.abs((f2 / (f4 / f5)) - f3) <= 2.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z || z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final float q(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static final void r(yj yjVar, jq6 jq6Var, float f2, float f3) {
        yjVar.m();
        int a2 = jq6Var.a();
        boolean z = true;
        for (int i = 0; i < a2; i++) {
            qd2 qd2Var = (qd2) jq6Var.get(i);
            if (z) {
                float[] fArr = qd2Var.a;
                yjVar.i(fArr[0], fArr[1]);
                z = false;
            }
            float[] fArr2 = qd2Var.a;
            yjVar.f(fArr2[2], fArr2[3], fArr2[4], fArr2[5], qd2Var.a(), qd2Var.b());
        }
        yjVar.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x008a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s(java.lang.String r9, java.lang.String r10, defpackage.n42 r11) {
        /*
            boolean r0 = r11 instanceof defpackage.wd4
            if (r0 == 0) goto L13
            r0 = r11
            wd4 r0 = (defpackage.wd4) r0
            int r1 = r0.b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.b = r1
            goto L18
        L13:
            wd4 r0 = new wd4
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.a
            int r1 = r0.b
            r2 = 1
            r7 = 0
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L26
            defpackage.hre.r(r11)
            goto L81
        L26:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            r9 = 0
            return r9
        L2d:
            defpackage.hre.r(r11)
            java.lang.ref.WeakReference r11 = defpackage.fd4.a
            java.lang.Object r11 = r11.get()
            r4 = r11
            zt1 r4 = (defpackage.zt1) r4
            if (r4 == 0) goto L8b
            java.lang.String r10 = defpackage.hc2.o(r10)
            android.webkit.MimeTypeMap r11 = android.webkit.MimeTypeMap.getSingleton()
            if (r10 == 0) goto L4c
            java.lang.String r11 = r11.getMimeTypeFromExtension(r10)
            if (r11 == 0) goto L4c
            goto L4e
        L4c:
        */
        //  java.lang.String r11 = "*/*"
        /*
        L4e:
            b6 r5 = new b6
            r1 = 6
            r5.<init>(r1)
            r9.getClass()
            java.lang.String r10 = defpackage.hc2.o(r10)
            if (r10 != 0) goto L5e
            goto L64
        L5e:
            java.lang.String r1 = "."
            java.lang.String r9 = defpackage.eub.o(r9, r1, r10)
        L64:
            eb2 r6 = new eb2
            r6.<init>(r11, r9, r7)
            r0.b = r2
            sw2 r9 = defpackage.ab3.a
            n35 r9 = defpackage.zz6.a
            n35 r9 = r9.f
            uw2 r3 = new uw2
            r8 = 23
            r3.<init>(r4, r5, r6, r7, r8)
            java.lang.Object r11 = defpackage.z87.E(r9, r3, r0)
            n82 r9 = defpackage.n82.a
            if (r11 != r9) goto L81
            return r9
        L81:
            android.net.Uri r11 = (android.net.Uri) r11
            if (r11 == 0) goto L8a
            bx8 r9 = defpackage.fpe.k(r11)
            return r9
        L8a:
            return r7
        L8b:
            ed4 r9 = new ed4
            r10 = 10
            r11 = 0
            java.lang.String r0 = "FileKit not initialized on Android. Please call FileKit.init(activity) first."
            r9.<init>(r10, r0, r11)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz1.s(java.lang.String, java.lang.String, n42):java.lang.Object");
    }

    public static final float t(float f2, tt0 tt0Var) {
        tt0Var.getClass();
        return ((Number) dce.p(Float.valueOf(f2), new jk1(tt0Var.a, tt0Var.b))).floatValue();
    }

    public static void u(TextView textView, int i) {
        int i2;
        if (i >= 0) {
            if (Build.VERSION.SDK_INT >= 28) {
                ru.J(textView, i);
                return;
            }
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i2 = fontMetricsInt.top;
            } else {
                i2 = fontMetricsInt.ascent;
            }
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
                return;
            }
            return;
        }
        p1a.g();
    }

    public static void v(TextView textView, int i) {
        int i2;
        if (i >= 0) {
            Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
            if (textView.getIncludeFontPadding()) {
                i2 = fontMetricsInt.bottom;
            } else {
                i2 = fontMetricsInt.descent;
            }
            if (i > Math.abs(i2)) {
                textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
                return;
            }
            return;
        }
        p1a.g();
    }

    public static void w(TextView textView, int i) {
        if (i >= 0) {
            int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
            if (i != fontMetricsInt) {
                textView.setLineSpacing(i - fontMetricsInt, 1.0f);
                return;
            }
            return;
        }
        p1a.g();
    }

    public static final long x(long j, tt0 tt0Var, tt0 tt0Var2) {
        tt0Var.getClass();
        tt0Var2.getClass();
        return (Float.floatToRawIntBits(t(Float.intBitsToFloat((int) (j >> 32)), tt0Var)) << 32) | (Float.floatToRawIntBits(t(Float.intBitsToFloat((int) (j & 4294967295L)), tt0Var2)) & 4294967295L);
    }

    public static cy5 y(int i, s94 s94Var, km8 km8Var) {
        cy5 b2 = cy5.b(s94Var, km8Var);
        while (true) {
            int i2 = b2.a;
            if (i2 != i) {
                a82.y("Ignoring unknown WAV chunk: ", "WavHeaderReader", i2);
                long j = b2.b;
                long j2 = 8 + j;
                if (j % 2 != 0) {
                    j2 = 9 + j;
                }
                if (j2 <= 2147483647L) {
                    s94Var.q((int) j2);
                    b2 = cy5.b(s94Var, km8Var);
                } else {
                    throw xm8.c("Chunk is too large (~2GB+) to skip; id: " + i2);
                }
            } else {
                return b2;
            }
        }
    }

    public static yj z(ir7 ir7Var, float f2, yj yjVar) {
        ir7Var.getClass();
        jq6 t = tl1.t();
        ArrayList arrayList = ir7Var.a;
        int size = arrayList.size();
        qd2 qd2Var = null;
        int i = 0;
        qd2 qd2Var2 = null;
        while (i < size) {
            float[] fArr = new float[8];
            for (int i2 = 0; i2 < 8; i2++) {
                fArr[i2] = d2d.b(((qd2) ((yk8) arrayList.get(i)).a).a[i2], ((qd2) ((yk8) arrayList.get(i)).b).a[i2], f2);
            }
            qd2 qd2Var3 = new qd2(fArr);
            if (qd2Var2 == null) {
                qd2Var2 = qd2Var3;
            }
            if (qd2Var != null) {
                t.add(qd2Var);
            }
            i++;
            qd2Var = qd2Var3;
        }
        if (qd2Var != null && qd2Var2 != null) {
            float[] fArr2 = qd2Var.a;
            float f3 = fArr2[0];
            float f4 = fArr2[1];
            float f5 = fArr2[2];
            float f6 = fArr2[3];
            float f7 = fArr2[4];
            float f8 = fArr2[5];
            float[] fArr3 = qd2Var2.a;
            t.add(w9e.a(f3, f4, f5, f6, f7, f8, fArr3[0], fArr3[1]));
        }
        r(yjVar, tl1.r(t), nae.e, nae.e);
        return yjVar;
    }
}
