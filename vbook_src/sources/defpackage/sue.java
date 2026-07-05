package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: sue  reason: default package */
/* loaded from: classes.dex */
public abstract class sue {
    public static final tu1 a = new tu1(new ev1(6), false, 1239523763);
    public static final tu1 b = new tu1(new ev1(7), false, -849669014);
    public static final long[] c = new long[0];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean A(hn4 hn4Var, gp gpVar) {
        hn4[] hn4VarArr = new hn4[16];
        if (!hn4Var.a.J) {
            lv5.c("visitChildren called on an unattached node");
        }
        gw7 gw7Var = new gw7(new mq7[16], 0);
        mq7 mq7Var = hn4Var.a;
        mq7 mq7Var2 = mq7Var.f;
        if (mq7Var2 == null) {
            voe.g(gw7Var, mq7Var);
        } else {
            gw7Var.b(mq7Var2);
        }
        int i = 0;
        while (true) {
            int i2 = gw7Var.c;
            if (i2 == 0) {
                break;
            }
            mq7 mq7Var3 = (mq7) gw7Var.k(i2 - 1);
            if ((mq7Var3.d & 1024) == 0) {
                voe.g(gw7Var, mq7Var3);
            } else {
                while (true) {
                    if (mq7Var3 == null) {
                        break;
                    } else if ((mq7Var3.c & 1024) != 0) {
                        gw7 gw7Var2 = null;
                        while (mq7Var3 != null) {
                            if (mq7Var3 instanceof hn4) {
                                hn4 hn4Var2 = (hn4) mq7Var3;
                                int i3 = i + 1;
                                if (hn4VarArr.length < i3) {
                                    int length = hn4VarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(hn4VarArr, 0, r10, 0, length);
                                    hn4VarArr = r10;
                                }
                                hn4VarArr[i] = hn4Var2;
                                i = i3;
                            } else if ((mq7Var3.c & 1024) != 0 && (mq7Var3 instanceof m03)) {
                                int i4 = 0;
                                for (mq7 mq7Var4 = ((m03) mq7Var3).L; mq7Var4 != null; mq7Var4 = mq7Var4.f) {
                                    if ((mq7Var4.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            mq7Var3 = mq7Var4;
                                        } else {
                                            if (gw7Var2 == null) {
                                                gw7Var2 = new gw7(new mq7[16], 0);
                                            }
                                            if (mq7Var3 != null) {
                                                gw7Var2.b(mq7Var3);
                                                mq7Var3 = null;
                                            }
                                            gw7Var2.b(mq7Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            mq7Var3 = voe.h(gw7Var2);
                        }
                    } else {
                        mq7Var3 = mq7Var3.f;
                    }
                }
            }
        }
        Arrays.sort(hn4VarArr, 0, i, kn4.b);
        int i5 = i - 1;
        if (i5 < hn4VarArr.length) {
            while (i5 >= 0) {
                hn4 hn4Var3 = hn4VarArr[i5];
                if (dae.t(hn4Var3) && i(hn4Var3, gpVar)) {
                    return true;
                }
                i5--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object[], java.lang.Object] */
    public static final boolean B(hn4 hn4Var, gp gpVar) {
        hn4[] hn4VarArr = new hn4[16];
        if (!hn4Var.a.J) {
            lv5.c("visitChildren called on an unattached node");
        }
        gw7 gw7Var = new gw7(new mq7[16], 0);
        mq7 mq7Var = hn4Var.a;
        mq7 mq7Var2 = mq7Var.f;
        if (mq7Var2 == null) {
            voe.g(gw7Var, mq7Var);
        } else {
            gw7Var.b(mq7Var2);
        }
        int i = 0;
        while (true) {
            int i2 = gw7Var.c;
            if (i2 == 0) {
                break;
            }
            mq7 mq7Var3 = (mq7) gw7Var.k(i2 - 1);
            if ((mq7Var3.d & 1024) == 0) {
                voe.g(gw7Var, mq7Var3);
            } else {
                while (true) {
                    if (mq7Var3 == null) {
                        break;
                    } else if ((mq7Var3.c & 1024) != 0) {
                        gw7 gw7Var2 = null;
                        while (mq7Var3 != null) {
                            if (mq7Var3 instanceof hn4) {
                                hn4 hn4Var2 = (hn4) mq7Var3;
                                int i3 = i + 1;
                                if (hn4VarArr.length < i3) {
                                    int length = hn4VarArr.length;
                                    ?? r10 = new Object[Math.max(i3, length * 2)];
                                    System.arraycopy(hn4VarArr, 0, r10, 0, length);
                                    hn4VarArr = r10;
                                }
                                hn4VarArr[i] = hn4Var2;
                                i = i3;
                            } else if ((mq7Var3.c & 1024) != 0 && (mq7Var3 instanceof m03)) {
                                int i4 = 0;
                                for (mq7 mq7Var4 = ((m03) mq7Var3).L; mq7Var4 != null; mq7Var4 = mq7Var4.f) {
                                    if ((mq7Var4.c & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            mq7Var3 = mq7Var4;
                                        } else {
                                            if (gw7Var2 == null) {
                                                gw7Var2 = new gw7(new mq7[16], 0);
                                            }
                                            if (mq7Var3 != null) {
                                                gw7Var2.b(mq7Var3);
                                                mq7Var3 = null;
                                            }
                                            gw7Var2.b(mq7Var4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            mq7Var3 = voe.h(gw7Var2);
                        }
                    } else {
                        mq7Var3 = mq7Var3.f;
                    }
                }
            }
        }
        Arrays.sort(hn4VarArr, 0, i, kn4.b);
        for (int i5 = 0; i5 < i; i5++) {
            hn4 hn4Var3 = hn4VarArr[i5];
            if (dae.t(hn4Var3) && y(hn4Var3, gpVar)) {
                return true;
            }
        }
        return false;
    }

    public static boolean C(Parcel parcel, int i) {
        P(parcel, i, 4);
        if (parcel.readInt() != 0) {
            return true;
        }
        return false;
    }

    public static Boolean D(Parcel parcel, int i) {
        boolean z;
        int J = J(parcel, i);
        if (J == 0) {
            return null;
        }
        Q(parcel, J, 4);
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static IBinder E(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + J);
        return readStrongBinder;
    }

    public static int F(Parcel parcel, int i) {
        P(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer G(Parcel parcel, int i) {
        int J = J(parcel, i);
        if (J == 0) {
            return null;
        }
        Q(parcel, J, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long H(Parcel parcel, int i) {
        P(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long I(Parcel parcel, int i) {
        int J = J(parcel, i);
        if (J == 0) {
            return null;
        }
        Q(parcel, J, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static int J(Parcel parcel, int i) {
        if ((i & (-65536)) != -65536) {
            return (char) (i >> 16);
        }
        return parcel.readInt();
    }

    public static final void K(a06 a06Var, String str) {
        a06Var.getClass();
        str.getClass();
        a06Var.b.b = r4b.H(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x019b A[EDGE_INSN: B:160:0x019b->B:127:0x019b ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object[], java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean L(defpackage.hn4 r12, defpackage.hn4 r13, int r14, defpackage.gp r15) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sue.L(hn4, hn4, int, gp):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x0203, code lost:
        if (r42 > 100.01d) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0207, code lost:
        if (r44 > 100.01d) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x020b, code lost:
        if (r8 <= 100.01d) goto L138;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x020e, code lost:
        r0 = ((((defpackage.vae.i(r42) & 255) << 16) | (-16777216)) | ((defpackage.vae.i(r44) & 255) << 8)) | (defpackage.vae.i(r8) & 255);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final long M(float r64, long r65) {
        /*
            Method dump skipped, instructions count: 1422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sue.M(float, long):long");
    }

    public static void N(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + J(parcel, i));
    }

    public static int O(Parcel parcel) {
        int readInt = parcel.readInt();
        int J = J(parcel, readInt);
        char c2 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c2 == 20293) {
            int i = J + dataPosition;
            if (i >= dataPosition && i <= parcel.dataSize()) {
                return i;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(dataPosition).length() + 32 + String.valueOf(i).length());
            sb.append("Size read is invalid start=");
            sb.append(dataPosition);
            sb.append(" end=");
            sb.append(i);
            throw new vw9(sb.toString(), parcel);
        }
        throw new vw9("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
    }

    public static void P(Parcel parcel, int i, int i2) {
        int J = J(parcel, i);
        if (J == i2) {
            return;
        }
        String hexString = Integer.toHexString(J);
        int length = String.valueOf(i2).length();
        int length2 = String.valueOf(J).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + length2 + 4 + 1);
        a82.t(i2, J, "Expected size ", " got ", sb);
        throw new vw9(nk2.v(sb, " (0x", hexString, ")"), parcel);
    }

    public static void Q(Parcel parcel, int i, int i2) {
        if (i == i2) {
            return;
        }
        String hexString = Integer.toHexString(i);
        int length = String.valueOf(i2).length();
        int length2 = String.valueOf(i).length();
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + length + 19 + length2 + 4 + 1);
        a82.t(i2, i, "Expected size ", " got ", sb);
        throw new vw9(nk2.v(sb, " (0x", hexString, ")"), parcel);
    }

    public static final void a(l54 l54Var, g34 g34Var, boolean z, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        vt4 vt4Var2;
        boolean z4;
        boolean z5;
        wk3 wk3Var;
        long j;
        long j2;
        zx1 zx1Var;
        boolean z6;
        np npVar;
        kg kgVar;
        boolean z7;
        float f;
        np npVar2;
        String str;
        boolean z8;
        l54 l54Var2 = l54Var;
        rv4 rv4Var2 = rv4Var;
        nk0 nk0Var = kh5.e;
        rv4Var2.g0(1442359588);
        if (rv4Var2.f(l54Var2)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i8 = i | i3;
        int i9 = i2 & 4;
        if (i9 != 0) {
            i5 = i8 | 384;
            z2 = z;
        } else {
            z2 = z;
            if (rv4Var2.g(z2)) {
                i4 = 256;
            } else {
                i4 = Token.CASE;
            }
            i5 = i8 | i4;
        }
        if (rv4Var2.f(nq7Var)) {
            i6 = 2048;
        } else {
            i6 = 1024;
        }
        int i10 = i5 | i6;
        if (rv4Var2.h(vt4Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i11 = i10 | i7;
        if ((i11 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var2.U(i11 & 1, z3)) {
            if (i9 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            int ordinal = g34Var.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        wk3Var = (wk3) rk3.q.getValue();
                    } else {
                        xk5.o();
                        return;
                    }
                } else {
                    wk3Var = (wk3) jk3.H.getValue();
                }
            } else {
                wk3Var = (wk3) jk3.L.getValue();
            }
            int[] iArr = z74.a;
            if (iArr[g34Var.ordinal()] == 2) {
                rv4Var2.e0(-1166855401);
                j = zl1.b(0.35f, ((h27) rv4Var2.j(j27.a)).a.y);
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-1166853420);
                j = ((h27) rv4Var2.j(j27.a)).a.c;
                rv4Var2.q(false);
            }
            if (iArr[g34Var.ordinal()] == 2) {
                rv4Var2.e0(-1166849367);
                j2 = ((h27) rv4Var2.j(j27.a)).a.w;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-1166847818);
                j2 = ((h27) rv4Var2.j(j27.a)).a.d;
                rv4Var2.q(false);
            }
            long j3 = j2;
            mk0 mk0Var = kh5.G;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            np npVar3 = qw1.f;
            jce.F(npVar3, rv4Var2, a2);
            np npVar4 = qw1.e;
            jce.F(npVar4, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar5 = qw1.g;
            jce.F(npVar5, rv4Var2, valueOf);
            kg kgVar2 = qw1.h;
            jce.C(kgVar2, rv4Var2);
            np npVar6 = qw1.d;
            jce.F(npVar6, rv4Var2, p);
            wk3 wk3Var2 = wk3Var;
            String str2 = l54Var2.a;
            String str3 = l54Var2.k;
            h54 h54Var = new h54(l54Var2.r, str2, l54Var2.c);
            u22 u22Var = r0f.d;
            kq7 kq7Var = kq7.a;
            long j4 = j;
            do5.a(h54Var, u22Var, false, null, null, hud.f, tte.k(pna.n(kq7Var, 60.0f), r0f.z(rv4Var2).d), null, rv4Var2, 1572912, 828);
            we6 d = rs8.d(kq7Var, 14.0f, rv4Var2, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, d);
            rv4Var2.i0();
            if (rv4Var2.S) {
                zx1Var = zx1Var2;
                rv4Var2.k(zx1Var);
            } else {
                zx1Var = zx1Var2;
                rv4Var2.r0();
            }
            jce.F(npVar3, rv4Var2, a3);
            jce.F(npVar4, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar5, rv4Var2, kgVar2);
            jce.F(npVar6, rv4Var2, p2);
            nq7 f2 = pna.f(kq7Var, 1.0f);
            gv9 a4 = ev9.a(dzVar, mk0Var, rv4Var2, 48);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, f2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar3, rv4Var2, a4);
            jce.F(npVar4, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar5, rv4Var2, kgVar2);
            jce.F(npVar6, rv4Var2, p3);
            if (str3.length() > 0) {
                rv4Var2.e0(1539138699);
                do5.e(str3, pna.n(kq7Var, 24.0f), rv4Var2, 48);
                z6 = false;
                rs8.v(kq7Var, 8.0f, rv4Var2, false);
            } else {
                z6 = false;
                rv4Var2.e0(1539370300);
                rv4Var2.q(false);
            }
            zx1 zx1Var3 = zx1Var;
            cvb.c(l54Var2.b, l0e.u(pna.f(kq7Var, 1.0f)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, oyb.a(r0f.A(rv4Var2).j, 0L, 0L, dq4.f, null, null, 0L, null, 0, 0L, null, 16777211), rv4Var, 48, 24576, 114684);
            rs8.u(rv4Var, true, kq7Var, 6.0f, rv4Var);
            nq7 f3 = pna.f(kq7Var, 1.0f);
            gv9 a5 = ev9.a(dzVar, mk0Var, rv4Var, 48);
            int hashCode4 = Long.hashCode(rv4Var.T);
            xt8 l4 = rv4Var.l();
            nq7 p4 = lye.p(rv4Var, f3);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var3);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar3, rv4Var, a5);
            jce.F(npVar4, rv4Var, l4);
            s21.t(hashCode4, rv4Var, npVar5, rv4Var, kgVar2);
            jce.F(npVar6, rv4Var, p4);
            l54Var2 = l54Var;
            if (l54Var2.n) {
                rv4Var.e0(-768355307);
                kgVar = kgVar2;
                f = 4.0f;
                npVar = npVar6;
                d("DEV", null, r0f.y(rv4Var).l, r0f.y(rv4Var).m, rv4Var, 6, 2);
                z7 = false;
                rs8.v(kq7Var, 4.0f, rv4Var, false);
            } else {
                npVar = npVar6;
                kgVar = kgVar2;
                z7 = false;
                f = 4.0f;
                rv4Var.e0(-768018957);
                rv4Var.q(false);
            }
            if (l54Var2.h) {
                rv4Var.e0(-767970535);
                npVar2 = npVar5;
                d("18+", null, zl1.f, zl1.e, rv4Var, 3462, 2);
                rs8.v(kq7Var, f, rv4Var, z7);
            } else {
                npVar2 = npVar5;
                rv4Var.e0(-767699533);
                rv4Var.q(z7);
            }
            String str4 = (String) sl1.f0(l54Var2.i - 1, cqe.m((q3b) nz.c.getValue(), rv4Var));
            if (str4 != null) {
                str = str4.toUpperCase(Locale.ROOT);
                str.getClass();
            } else {
                str = null;
            }
            if (str == null) {
                str = "";
            }
            d(str, null, 0L, 0L, rv4Var, 0, 14);
            xbe.i(rv4Var, pna.s(kq7Var, f));
            d(l54Var2.f, null, 0L, 0L, rv4Var, 0, 14);
            rs8.u(rv4Var, true, kq7Var, f, rv4Var);
            kg kgVar3 = kgVar;
            cvb.c(l54Var2.d, null, zl1.b(0.5f, ((zl1) rv4Var.j(r12.a)).a), null, 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, r0f.A(rv4Var).l, rv4Var, 0, 24960, 110586);
            rv4Var.q(true);
            nq7 v = nmd.v(tte.k(c16.g(pna.n(kq7Var, 32.0f), null, 3), r0f.z(rv4Var).d), j4, lre.g);
            if ((i11 & 57344) == 16384) {
                z8 = true;
            } else {
                z8 = false;
            }
            Object P = rv4Var.P();
            if (!z8 && P != ax1.a) {
                vt4Var2 = vt4Var;
            } else {
                vt4Var2 = vt4Var;
                P = new jf3(12, vt4Var2);
                rv4Var.o0(P);
            }
            nq7 f4 = lbe.f(15, (vt4) P, v, null, false);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode5 = Long.hashCode(rv4Var.T);
            xt8 l5 = rv4Var.l();
            nq7 p5 = lye.p(rv4Var, f4);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var3);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar3, rv4Var, d2);
            jce.F(npVar4, rv4Var, l5);
            s21.t(hashCode5, rv4Var, npVar2, rv4Var, kgVar3);
            jce.F(npVar, rv4Var, p5);
            pu0 pu0Var = pu0.a;
            if (z5) {
                rv4Var.e0(63444124);
                eg0.f(pu0Var.a(pna.n(kq7Var, 28.0f), nk0Var), r0f.y(rv4Var).d, null, rv4Var, 0, 4);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rv4Var.e0(63734687);
                nk5.a(rp5.c(wk3Var2, rv4Var, 0), null, pu0Var.a(pna.n(kq7Var, 26.0f), nk0Var), j3, rv4Var, 48, 0);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            }
            rv4Var2.q(true);
            rv4Var2.q(true);
            z4 = z5;
        } else {
            vt4Var2 = vt4Var;
            rv4Var2.X();
            z4 = z2;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new a83(l54Var2, g34Var, z4, nq7Var, vt4Var2, i, i2);
        }
    }

    public static final void b(String str, l84 l84Var, rh8 rh8Var, nq7 nq7Var, xt4 xt4Var, vt4 vt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, rv4 rv4Var, int i) {
        int i2;
        vt4 vt4Var2;
        boolean z;
        rh8 rh8Var2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        lh9 lh9Var;
        lh9 lh9Var2;
        hz hzVar;
        aw7 aw7Var;
        np npVar;
        zx1 zx1Var;
        l84 l84Var2;
        np npVar2;
        int i3;
        aw7 aw7Var2;
        int length;
        kq7 kq7Var;
        kq7 kq7Var2;
        boolean z9;
        boolean f;
        Object P;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(363295813);
        if ((i & 6) == 0) {
            if (rv4Var2.f(str)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i2 = i12 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var2.f(l84Var)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i2 |= i11;
        }
        if ((i & 384) == 0) {
            if (rv4Var2.f(rh8Var)) {
                i10 = 256;
            } else {
                i10 = Token.CASE;
            }
            i2 |= i10;
        }
        if ((i & 3072) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i2 |= i9;
        }
        if ((i & 24576) == 0) {
            if (rv4Var2.h(xt4Var)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i2 |= i8;
        }
        if ((196608 & i) == 0) {
            vt4Var2 = vt4Var;
            if (rv4Var2.h(vt4Var2)) {
                i7 = 131072;
            } else {
                i7 = Parser.ARGC_LIMIT;
            }
            i2 |= i7;
        } else {
            vt4Var2 = vt4Var;
        }
        if ((1572864 & i) == 0) {
            if (rv4Var2.h(xt4Var2)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i2 |= i6;
        }
        if ((12582912 & i) == 0) {
            if (rv4Var2.h(xt4Var3)) {
                i5 = 8388608;
            } else {
                i5 = 4194304;
            }
            i2 |= i5;
        }
        if ((i & 100663296) == 0) {
            if (rv4Var2.h(xt4Var4)) {
                i4 = 67108864;
            } else {
                i4 = 33554432;
            }
            i2 |= i4;
        }
        if ((i2 & 38347923) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i2 & 1, z)) {
            Object[] objArr = new Object[0];
            if ((i2 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P2 = rv4Var2.P();
            lh9 lh9Var3 = ax1.a;
            if (z2 || P2 == lh9Var3) {
                P2 = new op0(str, 25);
                rv4Var2.o0(P2);
            }
            aw7 j = zpe.j(objArr, (vt4) P2, rv4Var2, 0);
            qg6 a2 = tg6.a(0, 3, rv4Var2);
            aw7 D = yae.D(xt4Var, rv4Var2);
            String str2 = ((jub) j.getValue()).a.b;
            boolean f2 = rv4Var2.f(D) | rv4Var2.f(j);
            Object P3 = rv4Var2.P();
            if (f2 || P3 == lh9Var3) {
                P3 = new db(D, j, null, 17);
                rv4Var2.o0(P3);
            }
            yte.g((lu4) P3, rv4Var2, str2);
            Integer valueOf = Integer.valueOf(l84Var.j.size());
            int i13 = i2 & Token.ASSIGN_MOD;
            if (i13 == 32) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean f3 = z3 | rv4Var2.f(a2);
            Object P4 = rv4Var2.P();
            if (f3 || P4 == lh9Var3) {
                P4 = new d53(l84Var, a2, (m42) null, 14);
                rv4Var2.o0(P4);
            }
            yte.g((lu4) P4, rv4Var2, valueOf);
            Set set = l84Var.i;
            b37 d = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, nq7Var);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            np npVar3 = qw1.f;
            jce.F(npVar3, rv4Var2, d);
            np npVar4 = qw1.e;
            jce.F(npVar4, rv4Var2, l);
            Integer valueOf2 = Integer.valueOf(hashCode);
            np npVar5 = qw1.g;
            jce.F(npVar5, rv4Var2, valueOf2);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar6 = qw1.d;
            jce.F(npVar6, rv4Var2, p);
            bkd r = mwe.r(rh8Var, mwe.g(14, rv4Var2));
            ze4 ze4Var = pna.c;
            nq7 l2 = q1d.l(ze4Var, rv4Var2, 6);
            rh8 h = mwe.h(r, 16.0f, 76.0f, 16.0f, 12.0f, rv4Var2, 28080, 0);
            rh8 h2 = mwe.h(r, nae.e, 68.0f, 4.0f, 8.0f, rv4Var, 28032, 1);
            f25 f25Var = new f25(320.0f);
            int i14 = i2;
            hz hzVar2 = new hz(8.0f, true, new vs(2));
            hz hzVar3 = new hz(8.0f, true, new vs(2));
            if (i13 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            if ((i14 & 458752) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean h3 = z4 | z5 | rv4Var.h(set);
            if ((i14 & 234881024) == 67108864) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z10 = h3 | z6;
            if ((i14 & 3670016) == 1048576) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z11 = z10 | z7;
            if ((i14 & 29360128) == 8388608) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z12 = z11 | z8;
            Object P5 = rv4Var.P();
            if (!z12) {
                lh9Var = lh9Var3;
                if (P5 != lh9Var) {
                    l84Var2 = l84Var;
                    lh9Var2 = lh9Var;
                    i3 = 2;
                    aw7Var = j;
                    npVar = npVar3;
                    npVar2 = npVar4;
                    zx1Var = zx1Var2;
                    hzVar = hzVar3;
                    aw7Var2 = aw7Var;
                    pc2.d(f25Var, l2, a2, h, hzVar, hzVar2, null, false, 0L, 0L, h2, nae.e, (xt4) P5, rv4Var, 1769472, 0, 6032);
                    rv4Var2 = rv4Var;
                    length = ((jub) aw7Var2.getValue()).a.b.length();
                    kq7Var = kq7.a;
                    if (length <= 0 && l84Var2.j.isEmpty() && l84Var2.k.isEmpty() && l84Var2.l.isEmpty()) {
                        rv4Var2.e0(320229148);
                        rv4Var2 = rv4Var;
                        nq7 x = zbe.x(ze4Var, mwe.h(r, nae.e, 68.0f, nae.e, nae.e, rv4Var, 384, 13));
                        xn1 a3 = wn1.a(lz.e, kh5.J, rv4Var2, 54);
                        int hashCode2 = Long.hashCode(rv4Var2.T);
                        xt8 l3 = rv4Var2.l();
                        nq7 p2 = lye.p(rv4Var2, x);
                        rv4Var2.i0();
                        if (rv4Var2.S) {
                            rv4Var2.k(zx1Var);
                        } else {
                            rv4Var2.r0();
                        }
                        jce.F(npVar, rv4Var2, a3);
                        jce.F(npVar2, rv4Var2, l3);
                        s21.t(hashCode2, rv4Var2, npVar5, rv4Var2, kgVar);
                        jce.F(npVar6, rv4Var2, p2);
                        dxe.g(owe.G(rv4Var2), pna.p(kq7Var, 250.0f, 200.0f), null, rv4Var2, 432, 120);
                        aw7Var2 = aw7Var2;
                        kq7Var2 = kq7Var;
                        cvb.c(yqe.A((y3b) b3b.M.getValue(), rv4Var2), zbe.A(kq7Var, 24.0f, nae.e, i3), 0L, null, 0L, null, null, null, 0L, null, new tlb(3), 0L, 0, false, 0, 0, null, ((h27) rv4Var2.j(j27.a)).b.f, rv4Var2, 48, 0, 130044);
                        rv4Var2.q(true);
                        z9 = false;
                        rv4Var2.q(false);
                    } else {
                        kq7Var2 = kq7Var;
                        z9 = false;
                        rv4Var2.e0(321004675);
                        rv4Var2.q(false);
                    }
                    jub jubVar = (jub) aw7Var2.getValue();
                    String A = yqe.A((y3b) b3b.O.getValue(), rv4Var2);
                    long g = rm1.g(((h27) rv4Var2.j(j27.a)).a, 6.0f);
                    rh8Var2 = rh8Var;
                    nq7 u = mwe.u(zbe.z(zbe.x(pna.f(kq7Var2, 1.0f), rh8Var2), 16.0f, 10.0f), z9, 6);
                    f = rv4Var2.f(aw7Var2);
                    P = rv4Var2.P();
                    if (!f || P == lh9Var2) {
                        P = new zn3(aw7Var2, 22);
                        rv4Var2.o0(P);
                    }
                    xxe.m(jubVar, A, 0L, g, null, null, u, null, (xt4) P, null, rv4Var2, 0, 692);
                    rv4Var2.q(true);
                }
            } else {
                lh9Var = lh9Var3;
            }
            lh9Var2 = lh9Var;
            i3 = 2;
            aw7Var = j;
            npVar = npVar3;
            npVar2 = npVar4;
            zx1Var = zx1Var2;
            hzVar = hzVar3;
            l84Var2 = l84Var;
            hm0 hm0Var = new hm0(l84Var2, vt4Var2, set, xt4Var4, xt4Var2, xt4Var3, 6);
            rv4Var.o0(hm0Var);
            P5 = hm0Var;
            aw7Var2 = aw7Var;
            pc2.d(f25Var, l2, a2, h, hzVar, hzVar2, null, false, 0L, 0L, h2, nae.e, (xt4) P5, rv4Var, 1769472, 0, 6032);
            rv4Var2 = rv4Var;
            length = ((jub) aw7Var2.getValue()).a.b.length();
            kq7Var = kq7.a;
            if (length <= 0) {
            }
            kq7Var2 = kq7Var;
            z9 = false;
            rv4Var2.e0(321004675);
            rv4Var2.q(false);
            jub jubVar2 = (jub) aw7Var2.getValue();
            String A2 = yqe.A((y3b) b3b.O.getValue(), rv4Var2);
            long g2 = rm1.g(((h27) rv4Var2.j(j27.a)).a, 6.0f);
            rh8Var2 = rh8Var;
            nq7 u2 = mwe.u(zbe.z(zbe.x(pna.f(kq7Var2, 1.0f), rh8Var2), 16.0f, 10.0f), z9, 6);
            f = rv4Var2.f(aw7Var2);
            P = rv4Var2.P();
            if (!f) {
            }
            P = new zn3(aw7Var2, 22);
            rv4Var2.o0(P);
            xxe.m(jubVar2, A2, 0L, g2, null, null, u2, null, (xt4) P, null, rv4Var2, 0, 692);
            rv4Var2.q(true);
        } else {
            rh8Var2 = rh8Var;
            rv4Var2.X();
        }
        ek9 u3 = rv4Var2.u();
        if (u3 != null) {
            u3.d = new dr0(str, l84Var, rh8Var2, nq7Var, xt4Var, vt4Var, xt4Var2, xt4Var3, xt4Var4, i);
        }
    }

    public static final void c(nq7 nq7Var, rv4 rv4Var, int i) {
        int i2;
        boolean z;
        rv4Var.g0(-91880431);
        if (rv4Var.f(nq7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i3 = i | i2;
        if ((i3 & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i3 & 1, z)) {
            nq7 A = zbe.A(nq7Var, nae.e, 8.0f, 1);
            mk0 mk0Var = kh5.G;
            dz dzVar = lz.a;
            gv9 a2 = ev9.a(dzVar, mk0Var, rv4Var, 48);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, A);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var, p);
            kq7 kq7Var = kq7.a;
            nq7 n = pna.n(kq7Var, 56.0f);
            tza tzaVar = j27.a;
            dpe.f(null, tte.k(n, ((h27) rv4Var.j(tzaVar)).c.c), rv4Var, 0, 1);
            we6 d = rs8.d(kq7Var, 12.0f, rv4Var, 1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.I, rv4Var, 0);
            int hashCode2 = Long.hashCode(rv4Var.T);
            xt8 l2 = rv4Var.l();
            nq7 p2 = lye.p(rv4Var, d);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a3);
            jce.F(npVar2, rv4Var, l2);
            s21.t(hashCode2, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p2);
            dpe.f(null, tte.k(pna.h(pna.s(kq7Var, 150.0f), 16.0f), ((h27) rv4Var.j(tzaVar)).c.b), rv4Var, 0, 1);
            nq7 f = hl5.f(kq7Var, 4.0f, rv4Var, kq7Var, 1.0f);
            gv9 a4 = ev9.a(dzVar, mk0Var, rv4Var, 48);
            int hashCode3 = Long.hashCode(rv4Var.T);
            xt8 l3 = rv4Var.l();
            nq7 p3 = lye.p(rv4Var, f);
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(npVar, rv4Var, a4);
            jce.F(npVar2, rv4Var, l3);
            s21.t(hashCode3, rv4Var, npVar3, rv4Var, kgVar);
            jce.F(npVar4, rv4Var, p3);
            dpe.f(null, tte.k(pna.h(pna.s(kq7Var, 50.0f), 12.0f), ((h27) rv4Var.j(tzaVar)).c.b), rv4Var, 0, 1);
            xbe.i(rv4Var, pna.s(kq7Var, 4.0f));
            dpe.f(null, tte.k(pna.h(pna.s(kq7Var, 40.0f), 12.0f), ((h27) rv4Var.j(tzaVar)).c.b), rv4Var, 0, 1);
            rs8.u(rv4Var, true, kq7Var, 4.0f, rv4Var);
            dpe.f(null, tte.k(pna.h(pna.s(kq7Var, 200.0f), 10.0f), ((h27) rv4Var.j(tzaVar)).c.b), rv4Var, 0, 1);
            rv4Var.q(true);
            rv4Var.q(true);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new oa(nq7Var, i, 8);
        }
    }

    public static final void d(String str, nq7 nq7Var, long j, long j2, rv4 rv4Var, int i, int i2) {
        int i3;
        long j3;
        long j4;
        boolean z;
        nq7 nq7Var2;
        long j5;
        long j6;
        int i4;
        kq7 kq7Var;
        int i5;
        int i6;
        int i7;
        rv4Var.g0(119084919);
        if ((i & 6) == 0) {
            if (rv4Var.f(str)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i3 = i7 | i;
        } else {
            i3 = i;
        }
        int i8 = i3 | 48;
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                j3 = j;
                if (rv4Var.e(j3)) {
                    i6 = 256;
                    i8 |= i6;
                }
            } else {
                j3 = j;
            }
            i6 = Token.CASE;
            i8 |= i6;
        } else {
            j3 = j;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                j4 = j2;
                if (rv4Var.e(j4)) {
                    i5 = 2048;
                    i8 |= i5;
                }
            } else {
                j4 = j2;
            }
            i5 = 1024;
            i8 |= i5;
        } else {
            j4 = j2;
        }
        if ((i8 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i8 & 1, z)) {
            rv4Var.Z();
            if ((i & 1) != 0 && !rv4Var.B()) {
                rv4Var.X();
                if ((i2 & 4) != 0) {
                    i8 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i8 &= -7169;
                }
                i4 = i8;
                kq7Var = nq7Var;
            } else {
                if ((i2 & 4) != 0) {
                    j3 = rm1.g(((h27) rv4Var.j(j27.a)).a, 6.0f);
                    i8 &= -897;
                }
                int i9 = i2 & 8;
                kq7 kq7Var2 = kq7.a;
                if (i9 != 0) {
                    j4 = rm1.b(((h27) rv4Var.j(j27.a)).a.h, rv4Var);
                    i8 &= -7169;
                }
                i4 = i8;
                kq7Var = kq7Var2;
            }
            rv4Var.r();
            long q = zr1.q(10);
            tza tzaVar = j27.a;
            long j7 = j4;
            cvb.c(str, zbe.z(nmd.v(tte.k(kq7Var, ((h27) rv4Var.j(tzaVar)).c.a), j3, lre.g), 7.0f, 2.0f), j7, null, q, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, ((h27) rv4Var.j(tzaVar)).b.l, rv4Var, (i4 & 14) | 24576 | ((i4 >> 3) & 896), 24576, 114664);
            j6 = j7;
            nq7Var2 = kq7Var;
            j5 = j3;
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
            j5 = j3;
            j6 = j4;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new x34(str, nq7Var2, j5, j6, i, i2, 1);
        }
    }

    public static final void e(boolean z, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        boolean z2;
        kq7 kq7Var;
        rv4Var.g0(-1276575605);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i7 = i | i2 | 48;
        if (rv4Var.h(vt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i8 = i7 | i3;
        if (rv4Var.h(vt4Var2)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i9 = i8 | i4;
        if (rv4Var.h(vt4Var3)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i10 = i9 | i5;
        if (rv4Var.h(vt4Var4)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i11 = i10 | i6;
        if ((74899 & i11) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i11 & 1, z2)) {
            kq7 kq7Var2 = kq7.a;
            iue.e(z, null, 0L, kq7Var2, nae.e, new th8(12.0f, 12.0f, 12.0f, 12.0f), vt4Var4, jce.E(-817188457, new y33(vt4Var, vt4Var2, vt4Var3, 2), rv4Var), rv4Var, (i11 & 14) | 12782592 | ((i11 << 3) & 3670016), 22);
            kq7Var = kq7Var2;
        } else {
            rv4Var.X();
            kq7Var = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ds1(z, kq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, i);
        }
    }

    public static final void f(String str, cz7 cz7Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        cz7 cz7Var2;
        String str2;
        pb2 pb2Var;
        str.getClass();
        cz7Var.getClass();
        rv4Var.g0(1142816619);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i2 | i;
        if (rv4Var.f(cz7Var)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i5 = i4 | i3;
        if ((i5 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i5 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                v84 v84Var = (v84) ((fdd) voe.z(cm9.a(v84.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                aw7 z2 = jsc.z(v84Var.f, rv4Var);
                Object[] objArr = new Object[0];
                Object P = rv4Var.P();
                Object obj = ax1.a;
                if (P == obj) {
                    P = new k24(5);
                    rv4Var.o0(P);
                }
                aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
                Object[] objArr2 = new Object[0];
                Object P2 = rv4Var.P();
                if (P2 == obj) {
                    P2 = new k24(6);
                    rv4Var.o0(P2);
                }
                aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
                Object P3 = rv4Var.P();
                if (P3 == obj) {
                    P3 = yae.q(new jw0(z2, 16));
                    rv4Var.o0(P3);
                }
                yya yyaVar = (yya) P3;
                zu8 zu8Var = new zu8(tl1.A("zip"));
                boolean f = rv4Var.f(v84Var);
                Object P4 = rv4Var.P();
                if (f || P4 == obj) {
                    P4 = new t74(v84Var, 7);
                    rv4Var.o0(P4);
                }
                kd4 v = w92.v(zu8Var, (xt4) P4, rv4Var, 8);
                kb kbVar = (kb) rv4Var.j(yb.a);
                s02 s02Var = v84Var.C;
                boolean f2 = rv4Var.f(kbVar);
                Object P5 = rv4Var.P();
                if (f2 || P5 == obj) {
                    P5 = new wa(10, kbVar, (m42) null);
                    rv4Var.o0(P5);
                }
                jye.b(s02Var, null, (mu4) P5, rv4Var, 0);
                ze4 ze4Var = pna.c;
                String A = yqe.A((y3b) f3b.C.getValue(), rv4Var);
                tu1 E = jce.E(625269735, new h64(cz7Var, 1), rv4Var);
                tu1 E2 = jce.E(305676432, new w81(yyaVar, aw7Var2, aw7Var, v, cz7Var), rv4Var);
                jb2 jb2Var = new jb2(cz7Var, str, v84Var, aw7Var2, z2);
                cz7Var2 = cz7Var;
                str2 = str;
                fxe.h(A, ze4Var, false, E, E2, null, jce.E(1455614902, jb2Var, rv4Var), rv4Var, 1600560, 36);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            cz7Var2 = cz7Var;
            str2 = str;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new yp0(str2, cz7Var2, i, 8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(int r38, int r39, int r40, defpackage.lu4 r41, defpackage.rv4 r42, defpackage.nq7 r43, java.lang.String r44) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sue.g(int, int, int, lu4, rv4, nq7, java.lang.String):void");
    }

    public static final Object h(ListenableFuture listenableFuture, n42 n42Var) {
        try {
            if (listenableFuture.isDone()) {
                return n3.g(listenableFuture);
            }
            f61 f61Var = new f61(1, w92.t(n42Var));
            listenableFuture.a(new pac(listenableFuture, f61Var, 1), g73.a);
            f61Var.w(new jc(listenableFuture, 25));
            return f61Var.s();
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause != null) {
                throw cause;
            }
            NullPointerException nullPointerException = new NullPointerException();
            c16.v(nullPointerException, c16.class.getName());
            throw nullPointerException;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean i(defpackage.hn4 r7, defpackage.gp r8) {
        /*
            dn4 r0 = r7.M1()
            int r0 = r0.ordinal()
            if (r0 == 0) goto L81
            r1 = 3
            r2 = 0
            r3 = 2
            r4 = 1
            if (r0 == r4) goto L35
            if (r0 == r3) goto L81
            if (r0 != r1) goto L31
            boolean r0 = A(r7, r8)
            if (r0 != 0) goto L77
            vm4 r0 = r7.J1()
            boolean r0 = r0.a
            if (r0 == 0) goto L2d
            java.lang.Object r7 = r8.invoke(r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L2e
        L2d:
            r7 = r2
        L2e:
            if (r7 == 0) goto L76
            goto L77
        L31:
            defpackage.xk5.o()
            return r2
        L35:
            hn4 r0 = defpackage.dae.n(r7)
            java.lang.String r5 = "ActiveParent must have a focusedChild"
            if (r0 == 0) goto L7d
            dn4 r6 = r0.M1()
            int r6 = r6.ordinal()
            if (r6 == 0) goto L78
            if (r6 == r4) goto L55
            if (r6 == r3) goto L78
            if (r6 == r1) goto L51
            defpackage.xk5.o()
            return r2
        L51:
            defpackage.vs.k(r5)
            return r2
        L55:
            boolean r1 = i(r0, r8)
            if (r1 != 0) goto L77
            boolean r7 = z(r7, r0, r3, r8)
            if (r7 != 0) goto L77
            vm4 r7 = r0.J1()
            boolean r7 = r7.a
            if (r7 == 0) goto L76
            java.lang.Object r7 = r8.invoke(r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L76
            goto L77
        L76:
            return r2
        L77:
            return r4
        L78:
            boolean r7 = z(r7, r0, r3, r8)
            return r7
        L7d:
            defpackage.vs.k(r5)
            return r2
        L81:
            boolean r7 = A(r7, r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sue.i(hn4, gp):boolean");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:3|(5:5|6|7|(1:(1:(3:11|12|13)(2:15|16))(2:17|18))(3:22|23|(2:25|21))|19))|27|6|7|(0)(0)|19) */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0052, code lost:
        if (r6.Q(r0) != r5) goto L12;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object j(defpackage.egd r6, defpackage.dk1 r7, defpackage.n42 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.fgd
            if (r0 == 0) goto L13
            r0 = r8
            fgd r0 = (defpackage.fgd) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            fgd r0 = new fgd
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.c
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2b
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L55
            goto L55
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r4
        L31:
            egd r6 = r0.a
            defpackage.hre.r(r8)     // Catch: java.lang.Throwable -> L55
            goto L4a
        L37:
            defpackage.hre.r(r8)
            ws4 r8 = new ws4     // Catch: java.lang.Throwable -> L55
            r8.<init>(r7)     // Catch: java.lang.Throwable -> L55
            r0.a = r6     // Catch: java.lang.Throwable -> L55
            r0.c = r3     // Catch: java.lang.Throwable -> L55
            java.lang.Object r7 = r6.V(r8, r0)     // Catch: java.lang.Throwable -> L55
            if (r7 != r5) goto L4a
            goto L54
        L4a:
            r0.a = r4     // Catch: java.lang.Throwable -> L55
            r0.c = r2     // Catch: java.lang.Throwable -> L55
            java.lang.Object r6 = r6.Q(r0)     // Catch: java.lang.Throwable -> L55
            if (r6 != r5) goto L55
        L54:
            return r5
        L55:
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sue.j(egd, dk1, n42):java.lang.Object");
    }

    public static Object k(egd egdVar, n42 n42Var) {
        r0f r0fVar = ck1.b;
        return j(egdVar, new dk1((short) 1000, ""), n42Var);
    }

    public static hp3 l(ex3 ex3Var, cp3 cp3Var) {
        ff4 ff4Var;
        if (ex3Var.f()) {
            gi1 a2 = cm9.a(cp3.class);
            ex3Var.e();
            ff4Var = new ff4(g9a.b0(new n38(cp3Var, a2)), true, new uw3(ex3Var, cp3Var, 0));
        } else {
            ex3Var.e();
            ff4Var = new ff4(g9a.b0(new n38(cp3Var, cm9.a(cp3.class))), true, new uw3(ex3Var, cp3Var, 1));
        }
        hp3 hp3Var = new hp3();
        Iterator it = ff4Var.iterator();
        while (true) {
            ef4 ef4Var = (ef4) it;
            if (ef4Var.hasNext()) {
                hp3Var.add(ef4Var.next());
            } else {
                ex3Var.e();
                return hp3Var;
            }
        }
    }

    public static final void m(int i, int i2) {
        if (i <= i2) {
            return;
        }
        cy7.k(hl5.i(i, i2, "toIndex (", ") is greater than size (", ")."));
    }

    public static Bundle n(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + J);
        return readBundle;
    }

    public static byte[] o(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + J);
        return createByteArray;
    }

    public static byte[][] p(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + J);
        return bArr;
    }

    public static int[] q(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + J);
        return createIntArray;
    }

    public static Parcelable r(Parcel parcel, int i, Parcelable.Creator creator) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + J);
        return parcelable;
    }

    public static String s(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + J);
        return readString;
    }

    public static ArrayList t(Parcel parcel, int i) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + J);
        return createStringArrayList;
    }

    public static Object[] u(Parcel parcel, int i, Parcelable.Creator creator) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + J);
        return createTypedArray;
    }

    public static ArrayList v(Parcel parcel, int i, Parcelable.Creator creator) {
        int J = J(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (J == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + J);
        return createTypedArrayList;
    }

    public static final lfc w(Context context) {
        xve.j(context, 17170461);
        xve.j(context, 17170462);
        M(98.0f, xve.j(context, 17170469));
        M(96.0f, xve.j(context, 17170469));
        xve.j(context, 17170463);
        M(94.0f, xve.j(context, 17170469));
        M(92.0f, xve.j(context, 17170469));
        xve.j(context, 17170464);
        M(87.0f, xve.j(context, 17170469));
        xve.j(context, 17170465);
        xve.j(context, 17170466);
        xve.j(context, 17170467);
        xve.j(context, 17170468);
        xve.j(context, 17170469);
        xve.j(context, 17170470);
        M(24.0f, xve.j(context, 17170469));
        M(22.0f, xve.j(context, 17170469));
        xve.j(context, 17170471);
        M(17.0f, xve.j(context, 17170469));
        M(12.0f, xve.j(context, 17170469));
        xve.j(context, 17170472);
        M(6.0f, xve.j(context, 17170469));
        M(4.0f, xve.j(context, 17170469));
        xve.j(context, 17170473);
        long j = xve.j(context, 17170474);
        xve.j(context, 17170475);
        long M = M(98.0f, xve.j(context, 17170482));
        long M2 = M(96.0f, xve.j(context, 17170482));
        long j2 = xve.j(context, 17170476);
        long M3 = M(94.0f, xve.j(context, 17170482));
        long M4 = M(92.0f, xve.j(context, 17170482));
        long j3 = xve.j(context, 17170477);
        long M5 = M(87.0f, xve.j(context, 17170482));
        long j4 = xve.j(context, 17170478);
        xve.j(context, 17170479);
        long j5 = xve.j(context, 17170480);
        long j6 = xve.j(context, 17170481);
        xve.j(context, 17170482);
        long j7 = xve.j(context, 17170483);
        long M6 = M(24.0f, xve.j(context, 17170482));
        long M7 = M(22.0f, xve.j(context, 17170482));
        long j8 = xve.j(context, 17170484);
        long M8 = M(17.0f, xve.j(context, 17170482));
        long M9 = M(12.0f, xve.j(context, 17170482));
        long j9 = xve.j(context, 17170485);
        long M10 = M(6.0f, xve.j(context, 17170482));
        long M11 = M(4.0f, xve.j(context, 17170482));
        long j10 = xve.j(context, 17170486);
        long j11 = xve.j(context, 17170487);
        xve.j(context, 17170488);
        xve.j(context, 17170489);
        long j12 = xve.j(context, 17170490);
        long j13 = xve.j(context, 17170491);
        xve.j(context, 17170492);
        xve.j(context, 17170493);
        xve.j(context, 17170494);
        long j14 = xve.j(context, 17170495);
        long j15 = xve.j(context, 17170496);
        long j16 = xve.j(context, 17170497);
        long j17 = xve.j(context, 17170498);
        xve.j(context, 17170499);
        long j18 = xve.j(context, 17170500);
        xve.j(context, 17170501);
        xve.j(context, 17170502);
        long j19 = xve.j(context, 17170503);
        long j20 = xve.j(context, 17170504);
        xve.j(context, 17170505);
        xve.j(context, 17170506);
        xve.j(context, 17170507);
        long j21 = xve.j(context, 17170508);
        long j22 = xve.j(context, 17170509);
        long j23 = xve.j(context, 17170510);
        long j24 = xve.j(context, 17170511);
        xve.j(context, 17170512);
        long j25 = xve.j(context, 17170513);
        xve.j(context, 17170514);
        xve.j(context, 17170515);
        long j26 = xve.j(context, 17170516);
        long j27 = xve.j(context, 17170517);
        xve.j(context, 17170518);
        xve.j(context, 17170519);
        xve.j(context, 17170520);
        long j28 = xve.j(context, 17170521);
        long j29 = xve.j(context, 17170522);
        long j30 = xve.j(context, 17170523);
        long j31 = xve.j(context, 17170524);
        xve.j(context, 17170525);
        return new lfc(j, M, M2, j2, M3, M4, j3, M5, j4, j5, j6, j7, M6, M7, j8, M8, M9, j9, M10, M11, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31);
    }

    public static void x(Parcel parcel, int i) {
        if (parcel.dataPosition() == i) {
            return;
        }
        throw new vw9(nk2.s(i, "Overread allowed size end=", new StringBuilder(String.valueOf(i).length() + 26)), parcel);
    }

    public static final boolean y(hn4 hn4Var, gp gpVar) {
        int ordinal = hn4Var.M1().ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal == 3) {
                        if (hn4Var.J1().a) {
                            return ((Boolean) gpVar.invoke(hn4Var)).booleanValue();
                        }
                        return B(hn4Var, gpVar);
                    }
                    xk5.o();
                    return false;
                }
            } else {
                hn4 n = dae.n(hn4Var);
                if (n != null) {
                    if (!y(n, gpVar) && !z(hn4Var, n, 1, gpVar)) {
                        return false;
                    }
                    return true;
                }
                vs.k("ActiveParent must have a focusedChild");
                return false;
            }
        }
        return B(hn4Var, gpVar);
    }

    public static final boolean z(hn4 hn4Var, hn4 hn4Var2, int i, gp gpVar) {
        if (L(hn4Var, hn4Var2, i, gpVar)) {
            return true;
        }
        Boolean bool = (Boolean) tye.o(hn4Var, i, new fc8(((rm4) ((rg) voe.w(hn4Var)).getFocusOwner()).f(), hn4Var, hn4Var2, i, gpVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
