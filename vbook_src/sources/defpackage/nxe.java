package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParser;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: nxe  reason: default package */
/* loaded from: classes.dex */
public abstract class nxe {
    public static final tu1 a = new tu1(new iv1(19), false, -1360104727);
    public static final tu1 b = new tu1(new iv1(20), false, 827075052);
    public static final tu1 c = new tu1(new jv1(11), false, 796592752);
    public static final dva d = new dva(26);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0054 -> B:19:0x0057). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object A(defpackage.w26[] r6, defpackage.n42 r7) {
        /*
            boolean r0 = r7 instanceof defpackage.qe0
            if (r0 == 0) goto L13
            r0 = r7
            qe0 r0 = (defpackage.qe0) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            qe0 r0 = new qe0
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.e
            int r1 = r0.f
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L30
            int r6 = r0.d
            int r1 = r0.c
            int r3 = r0.b
            java.lang.Object[] r4 = r0.a
            w26[] r4 = (defpackage.w26[]) r4
            defpackage.hre.r(r7)
            r7 = r4
            goto L57
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            r6 = 0
            return r6
        L37:
            defpackage.hre.r(r7)
            int r7 = r6.length
            r1 = 0
            r3 = r7
            r7 = r6
            r6 = r3
            r3 = r1
        L40:
            if (r1 >= r6) goto L59
            r4 = r7[r1]
            r0.a = r7
            r0.b = r3
            r0.c = r1
            r0.d = r6
            r0.f = r2
            java.lang.Object r4 = r4.join(r0)
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L57
            return r5
        L57:
            int r1 = r1 + r2
            goto L40
        L59:
            pvc r6 = defpackage.pvc.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxe.A(w26[], n42):java.lang.Object");
    }

    public static byte[] B(InputStream inputStream, int i) {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                vs.k(a82.j(i, "Not enough bytes to read: "));
                return null;
            }
        }
        return bArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] C(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxe.C(java.io.FileInputStream, int, int):byte[]");
    }

    public static long D(InputStream inputStream, int i) {
        byte[] B = B(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += (B[i2] & 255) << (i2 * 8);
        }
        return j;
    }

    public static final Object E(Object obj) {
        if (obj instanceof ft1) {
            return hre.i(((ft1) obj).a);
        }
        return obj;
    }

    public static void F(ByteArrayOutputStream byteArrayOutputStream, long j, int i) {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void G(ByteArrayOutputStream byteArrayOutputStream, int i) {
        F(byteArrayOutputStream, i, 2);
    }

    public static final void a(int i, List list, int i2, rj8 rj8Var, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, rv4 rv4Var, int i3) {
        int i4;
        int i5;
        Object obj;
        boolean z;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean h;
        int i11;
        int i12;
        rv4Var.g0(-87536292);
        if ((i3 & 6) == 0) {
            if (rv4Var.d(i)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i4 = i12 | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            if ((i3 & 64) == 0) {
                h = rv4Var.f(list);
            } else {
                h = rv4Var.h(list);
            }
            if (h) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i4 |= i11;
        }
        if ((i3 & 384) == 0) {
            i5 = i2;
            if (rv4Var.d(i5)) {
                i10 = 256;
            } else {
                i10 = Token.CASE;
            }
            i4 |= i10;
        } else {
            i5 = i2;
        }
        if ((i3 & 3072) == 0) {
            if (rv4Var.f(rj8Var)) {
                i9 = 2048;
            } else {
                i9 = 1024;
            }
            i4 |= i9;
        }
        if ((i3 & 24576) == 0) {
            if (rv4Var.f(nq7Var)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i4 |= i8;
        }
        if ((196608 & i3) == 0) {
            if (rv4Var.h(xt4Var)) {
                i7 = 131072;
            } else {
                i7 = Parser.ARGC_LIMIT;
            }
            i4 |= i7;
        }
        if ((1572864 & i3) == 0) {
            obj = xt4Var2;
            if (rv4Var.h(obj)) {
                i6 = 1048576;
            } else {
                i6 = 524288;
            }
            i4 |= i6;
        } else {
            obj = xt4Var2;
        }
        int i13 = i4;
        if ((599187 & i13) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i13 & 1, z)) {
            int k = rj8Var.k();
            long j = zl1.h;
            d3a.c(k, nq7Var, j, j, nae.e, jce.E(328795260, new os1(rj8Var, 3), rv4Var), oue.a, jce.E(631607932, new bt0(k, xt4Var, list, i5, i, obj), rv4Var), rv4Var, ((i13 >> 9) & Token.ASSIGN_MOD) | 14380416, 0);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new jl4(i, list, i2, rj8Var, nq7Var, xt4Var, xt4Var2, i3);
        }
    }

    public static final void b(final cz7 cz7Var, final int i, rj8 rj8Var, boolean z, final rh8 rh8Var, final bkd bkdVar, nq7 nq7Var, final vt4 vt4Var, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z2;
        boolean z3;
        rv4Var.g0(1163933817);
        if (rv4Var.f(cz7Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i2 | i3;
        if (rv4Var.d(i)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        if (rv4Var.f(rj8Var)) {
            i5 = 256;
        } else {
            i5 = Token.CASE;
        }
        int i12 = i11 | i5 | 3072;
        if (rv4Var.f(rh8Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i12 | i6;
        if (rv4Var.f(bkdVar)) {
            i7 = 131072;
        } else {
            i7 = Parser.ARGC_LIMIT;
        }
        int i14 = i13 | i7;
        if (rv4Var.f(nq7Var)) {
            i8 = 1048576;
        } else {
            i8 = 524288;
        }
        int i15 = i14 | i8;
        if (rv4Var.h(vt4Var)) {
            i9 = 8388608;
        } else {
            i9 = 4194304;
        }
        int i16 = i15 | i9;
        if ((4793491 & i16) != 4793490) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i16 & 1, z2)) {
            kxe.c(rj8Var, nq7Var, null, null, 1, nae.e, null, null, true, null, null, null, null, jce.E(-1358907880, new nu4() { // from class: n85
                @Override // defpackage.nu4
                public final Object h(Object obj, Object obj2, Object obj3, Object obj4) {
                    boolean z4;
                    int i17;
                    int intValue = ((Integer) obj2).intValue();
                    rv4 rv4Var2 = (rv4) obj3;
                    int intValue2 = ((Integer) obj4).intValue();
                    ((jj8) obj).getClass();
                    if ((intValue2 & 48) == 0) {
                        if (rv4Var2.d(intValue)) {
                            i17 = 32;
                        } else {
                            i17 = 16;
                        }
                        intValue2 |= i17;
                    }
                    if ((intValue2 & Token.TARGET) != 144) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (rv4Var2.U(intValue2 & 1, z4)) {
                        cz7 cz7Var2 = cz7.this;
                        rh8 rh8Var2 = rh8Var;
                        bkd bkdVar2 = bkdVar;
                        vt4 vt4Var2 = vt4Var;
                        if (intValue != 0) {
                            if (intValue != 1) {
                                if (intValue != 2) {
                                    if (intValue != 3) {
                                        if (intValue != 4) {
                                            if (intValue != 5) {
                                                rv4Var2.e0(1140954762);
                                                rv4Var2.q(false);
                                            } else {
                                                rv4Var2.e0(1140630595);
                                                qwe.f(3072, vt4Var2, rv4Var2, pna.c, cz7Var2, rh8Var2, bkdVar2);
                                                rv4Var2.q(false);
                                            }
                                        } else {
                                            rv4Var2.e0(1140286402);
                                            kxe.a(3072, vt4Var2, rv4Var2, pna.c, cz7Var2, rh8Var2, bkdVar2);
                                            rv4Var2.q(false);
                                        }
                                    } else {
                                        rv4Var2.e0(1138184075);
                                        int i18 = i;
                                        if (i18 != 0) {
                                            if (i18 != 1) {
                                                if (i18 != 2) {
                                                    if (i18 != 3) {
                                                        if (i18 != 4) {
                                                            rv4Var2.e0(1140243498);
                                                            rv4Var2.q(false);
                                                        } else {
                                                            rv4Var2.e0(1139846047);
                                                            z87.n(48, vt4Var2, rv4Var2, pna.c, cz7Var2, rh8Var2, bkdVar2);
                                                            rv4Var2.q(false);
                                                        }
                                                    } else {
                                                        rv4Var2.e0(1139427423);
                                                        b16.l(48, vt4Var2, rv4Var2, pna.c, cz7Var2, rh8Var2, bkdVar2);
                                                        rv4Var2.q(false);
                                                    }
                                                } else {
                                                    rv4Var2.e0(1139008799);
                                                    tc4.j(48, vt4Var2, rv4Var2, pna.c, cz7Var2, rh8Var2, bkdVar2);
                                                    rv4Var2.q(false);
                                                }
                                            } else {
                                                rv4Var2.e0(1138590175);
                                                k27.k(48, vt4Var2, rv4Var2, pna.c, cz7Var2, rh8Var2, bkdVar2);
                                                rv4Var2.q(false);
                                            }
                                        } else {
                                            rv4Var2.e0(1138173473);
                                            yf2.m(48, vt4Var2, rv4Var2, pna.c, cz7Var2, rh8Var2, bkdVar2);
                                            rv4Var2.q(false);
                                        }
                                        rv4Var2.q(false);
                                    }
                                } else {
                                    rv4Var2.e0(1137763808);
                                    oue.t(3072, vt4Var2, rv4Var2, pna.c, cz7Var2, rh8Var2, bkdVar2);
                                    rv4Var2.q(false);
                                }
                            } else {
                                rv4Var2.e0(1137471416);
                                bbe.c(cz7Var2, rh8Var2, bkdVar2, pna.c, rv4Var2, 3072);
                                rv4Var2.q(false);
                            }
                        } else {
                            rv4Var2.e0(1137127905);
                            ese.c(3072, vt4Var2, rv4Var2, pna.c, cz7Var2, rh8Var2, bkdVar2);
                            rv4Var2.q(false);
                        }
                    } else {
                        rv4Var2.X();
                    }
                    return pvc.a;
                }
            }, rv4Var), rv4Var, ((i16 >> 15) & Token.ASSIGN_MOD) | ((i16 >> 6) & 14) | 24576 | 100663296, 24576, 16108);
            z3 = true;
        } else {
            rv4Var.X();
            z3 = z;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qg1(cz7Var, i, rj8Var, z3, rh8Var, bkdVar, nq7Var, vt4Var, i2);
        }
    }

    public static final void c(cz7 cz7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        cz7 cz7Var2;
        vt4 vt4Var2;
        int i4;
        pb2 pb2Var;
        pb2 pb2Var2;
        iw2 iw2Var;
        aw7 aw7Var;
        qt8 qt8Var;
        boolean z2;
        boolean z3;
        kn6 kn6Var;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        cz7 cz7Var3 = cz7Var;
        vt4 vt4Var3 = vt4Var;
        rv4 rv4Var2 = rv4Var;
        cz7Var3.getClass();
        vt4Var3.getClass();
        rv4Var2.g0(-581271692);
        if (rv4Var2.f(cz7Var3)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.h(vt4Var3)) {
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
            Object[] objArr = new Object[0];
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = new k24(26);
                rv4Var2.o0(P);
            }
            aw7 aw7Var2 = (aw7) zpe.k(objArr, (vt4) P, rv4Var2, 48);
            Object[] objArr2 = new Object[0];
            Object P2 = rv4Var2.P();
            if (P2 == lh9Var) {
                P2 = new k24(27);
                rv4Var2.o0(P2);
            }
            aw7 aw7Var3 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var2, 48);
            Object[] objArr3 = new Object[0];
            Object P3 = rv4Var2.P();
            if (P3 == lh9Var) {
                P3 = new k24(28);
                rv4Var2.o0(P3);
            }
            aw7 aw7Var4 = (aw7) zpe.k(objArr3, (vt4) P3, rv4Var2, 48);
            Object[] objArr4 = new Object[0];
            Object P4 = rv4Var2.P();
            if (P4 == lh9Var) {
                P4 = new k24(29);
                rv4Var2.o0(P4);
            }
            aw7 aw7Var5 = (aw7) zpe.k(objArr4, (vt4) P4, rv4Var2, 48);
            Object[] objArr5 = new Object[0];
            Object P5 = rv4Var2.P();
            if (P5 == lh9Var) {
                P5 = new k85(0);
                rv4Var2.o0(P5);
            }
            aw7 aw7Var6 = (aw7) zpe.k(objArr5, (vt4) P5, rv4Var2, 48);
            Object P6 = rv4Var2.P();
            if (P6 == lh9Var) {
                P6 = new k85(1);
                rv4Var2.o0(P6);
            }
            iw2 b2 = uj8.b(2, (vt4) P6, rv4Var2, 390, 2);
            Object P7 = rv4Var2.P();
            if (P7 == lh9Var) {
                P7 = new at5();
                rv4Var2.o0(P7);
            }
            at5 at5Var = (at5) P7;
            sdd a2 = kv6.a(rv4Var2);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                j95 j95Var = (j95) ((fdd) voe.z(cm9.a(j95.class), a2.i(), null, pb2Var, o96.a(rv4Var2), null));
                sdd sddVar = (sdd) rv4Var2.j(idd.b);
                if (sddVar == null) {
                    rv4Var2.e0(1368428688);
                    sddVar = kv6.a(rv4Var2);
                } else {
                    rv4Var2.e0(1368426673);
                }
                rv4Var2.q(false);
                if (sddVar != null) {
                    if (sddVar instanceof y35) {
                        pb2Var2 = ((y35) sddVar).f();
                    } else {
                        pb2Var2 = ob2.b;
                    }
                    d1d d1dVar = (d1d) ((fdd) voe.z(cm9.a(d1d.class), sddVar.i(), null, pb2Var2, o96.a(rv4Var2), null));
                    aw7 z11 = jsc.z(d1dVar.f, rv4Var2);
                    aw7 z12 = jsc.z(j95Var.f, rv4Var2);
                    Object P8 = rv4Var2.P();
                    if (P8 == lh9Var) {
                        P8 = new rg8(14);
                        rv4Var2.o0(P8);
                    }
                    xt4 xt4Var = (xt4) P8;
                    Object P9 = rv4Var2.P();
                    if (P9 == lh9Var) {
                        P9 = pt8.b;
                        rv4Var2.o0(P9);
                    }
                    pt8 pt8Var = (pt8) P9;
                    pt8Var.getClass();
                    aw7 aw7Var7 = aw7Var2;
                    if (((Boolean) rv4Var2.j(lx5.a)).booleanValue()) {
                        rv4Var2.e0(-308110445);
                        Object P10 = rv4Var2.P();
                        if (P10 == lh9Var) {
                            P10 = new Object();
                            rv4Var2.o0(P10);
                        }
                        rv4Var2.q(false);
                        iw2Var = b2;
                        aw7Var = aw7Var3;
                        qt8Var = (st8) P10;
                    } else {
                        rv4Var2.e0(-308108505);
                        Context context = (Context) rv4Var2.j(gh.b);
                        boolean f = rv4Var2.f(pt8Var);
                        Object P11 = rv4Var2.P();
                        if (!f && P11 != lh9Var) {
                            iw2Var = b2;
                            aw7Var = aw7Var3;
                        } else {
                            context.getClass();
                            iw2Var = b2;
                            aw7Var = aw7Var3;
                            Context context2 = context;
                            while (context2 instanceof ContextWrapper) {
                                if (context2 instanceof Activity) {
                                    P11 = new ov7(pt8Var, context, (Activity) context2, xt4Var);
                                    rv4Var2.o0(P11);
                                } else {
                                    context2 = ((ContextWrapper) context2).getBaseContext();
                                    context2.getClass();
                                    aw7Var7 = aw7Var7;
                                    aw7Var4 = aw7Var4;
                                    vt4Var3 = vt4Var3;
                                    cz7Var3 = cz7Var3;
                                    lh9Var = lh9Var;
                                    j95Var = j95Var;
                                    z12 = z12;
                                    i6 = i6;
                                    rv4Var2 = rv4Var;
                                }
                            }
                            vs.k("Permissions should be called in the context of an Activity");
                            return;
                        }
                        ov7 ov7Var = (ov7) P11;
                        uaf.i(ov7Var, null, rv4Var2, 0);
                        b6 b6Var = new b6(4);
                        boolean f2 = rv4Var2.f(ov7Var) | rv4Var2.f(xt4Var);
                        Object P12 = rv4Var2.P();
                        if (f2 || P12 == lh9Var) {
                            P12 = new fl7(5, ov7Var, xt4Var);
                            rv4Var2.o0(P12);
                        }
                        i07 n = xoe.n(b6Var, (xt4) P12, rv4Var2);
                        boolean f3 = rv4Var2.f(ov7Var) | rv4Var2.h(n);
                        Object P13 = rv4Var2.P();
                        if (f3 || P13 == lh9Var) {
                            P13 = new fl7(6, ov7Var, n);
                            rv4Var2.o0(P13);
                        }
                        yte.c(ov7Var, n, (xt4) P13, rv4Var2);
                        rv4Var2.q(false);
                        qt8Var = ov7Var;
                    }
                    boolean f4 = rv4Var2.f(qt8Var);
                    Object P14 = rv4Var2.P();
                    if (f4 || P14 == lh9Var) {
                        P14 = new rt8(qt8Var);
                        rv4Var2.o0(P14);
                    }
                    rt8 rt8Var = (rt8) P14;
                    boolean f5 = rv4Var2.f(rt8Var);
                    Object P15 = rv4Var2.P();
                    if (f5 || P15 == lh9Var) {
                        P15 = new rg0(rt8Var, null, 13);
                        rv4Var2.o0(P15);
                    }
                    yte.g((lu4) P15, rv4Var2, rt8Var);
                    boolean f6 = rv4Var2.f(d1dVar);
                    Object P16 = rv4Var2.P();
                    if (!f6 && P16 != lh9Var) {
                        z2 = true;
                    } else {
                        z2 = true;
                        P16 = new es1(d1dVar, 1);
                        rv4Var2.o0(P16);
                    }
                    tte.d(d1dVar, null, (xt4) P16, rv4Var2, 0);
                    kb kbVar = (kb) rv4Var2.j(yb.a);
                    s02 s02Var = j95Var.C;
                    int i7 = i6 & 14;
                    if (i7 == 4) {
                        z3 = z2;
                    } else {
                        z3 = false;
                    }
                    boolean f7 = z3 | rv4Var2.f(kbVar);
                    Object P17 = rv4Var2.P();
                    if (!f7 && P17 != lh9Var) {
                        kn6Var = null;
                    } else {
                        kn6Var = null;
                        P17 = new u7(cz7Var3, kbVar, (m42) null);
                        rv4Var2.o0(P17);
                    }
                    jye.b(s02Var, kn6Var, (mu4) P17, rv4Var2, 0);
                    Object P18 = rv4Var2.P();
                    if (P18 == lh9Var) {
                        P18 = yte.s(rv4Var2);
                        rv4Var2.o0(P18);
                    }
                    boolean z13 = z2;
                    int i8 = i6;
                    aw7 aw7Var8 = aw7Var7;
                    aw7 aw7Var9 = aw7Var;
                    i4 = 3;
                    cz7 cz7Var4 = cz7Var3;
                    lh9 lh9Var2 = lh9Var;
                    aw7 aw7Var10 = aw7Var4;
                    vt4Var2 = vt4Var3;
                    fxe.i(jue.J(pna.c), jce.E(-425978990, new d52(iw2Var, (m82) P18, cz7Var4, vt4Var3, aw7Var9, aw7Var8, j95Var, aw7Var10, z12, z11), rv4Var2), rv4Var2, 48);
                    boolean booleanValue = ((Boolean) aw7Var8.getValue()).booleanValue();
                    boolean f8 = rv4Var2.f(aw7Var8);
                    Object P19 = rv4Var2.P();
                    if (f8 || P19 == lh9Var2) {
                        P19 = new qp4(aw7Var8, 4);
                        rv4Var2.o0(P19);
                    }
                    xbe.a(booleanValue, (xt4) P19, rv4Var2, 0);
                    boolean booleanValue2 = ((Boolean) aw7Var9.getValue()).booleanValue();
                    boolean f9 = rv4Var2.f(aw7Var9);
                    Object P20 = rv4Var2.P();
                    if (f9 || P20 == lh9Var2) {
                        P20 = new qp4(aw7Var9, 5);
                        rv4Var2.o0(P20);
                    }
                    xt4 xt4Var2 = (xt4) P20;
                    boolean f10 = rv4Var2.f(aw7Var9);
                    if (i7 == 4) {
                        z4 = z13;
                    } else {
                        z4 = false;
                    }
                    boolean z14 = f10 | z4;
                    Object P21 = rv4Var2.P();
                    if (z14 || P21 == lh9Var2) {
                        P21 = new w73(cz7Var4, aw7Var9, 9);
                        rv4Var2.o0(P21);
                    }
                    xt4 xt4Var3 = (xt4) P21;
                    boolean f11 = rv4Var2.f(aw7Var9);
                    if (i7 == 4) {
                        z5 = z13;
                    } else {
                        z5 = false;
                    }
                    boolean z15 = f11 | z5;
                    Object P22 = rv4Var2.P();
                    if (z15 || P22 == lh9Var2) {
                        P22 = new w73(cz7Var4, aw7Var9, 10);
                        rv4Var2.o0(P22);
                    }
                    rv4 rv4Var3 = rv4Var2;
                    k27.f(booleanValue2, cz7Var4, null, xt4Var2, xt4Var3, (xt4) P22, rv4Var3, (i8 << 3) & Token.ASSIGN_MOD);
                    cz7Var2 = cz7Var4;
                    boolean booleanValue3 = ((Boolean) aw7Var10.getValue()).booleanValue();
                    boolean f12 = rv4Var3.f(aw7Var10);
                    Object P23 = rv4Var3.P();
                    if (f12 || P23 == lh9Var2) {
                        P23 = new qp4(aw7Var10, 6);
                        rv4Var3.o0(P23);
                    }
                    xt4 xt4Var4 = (xt4) P23;
                    boolean f13 = rv4Var3.f(aw7Var10);
                    if (i7 == 4) {
                        z6 = z13;
                    } else {
                        z6 = false;
                    }
                    boolean z16 = f13 | z6;
                    Object P24 = rv4Var3.P();
                    if (z16 || P24 == lh9Var2) {
                        P24 = new rp0(cz7Var2, aw7Var10, 12);
                        rv4Var3.o0(P24);
                    }
                    vt4 vt4Var4 = (vt4) P24;
                    boolean f14 = rv4Var3.f(aw7Var10);
                    if (i7 == 4) {
                        z7 = z13;
                    } else {
                        z7 = false;
                    }
                    boolean z17 = f14 | z7;
                    Object P25 = rv4Var3.P();
                    if (z17 || P25 == lh9Var2) {
                        P25 = new rp0(cz7Var2, aw7Var10, 13);
                        rv4Var3.o0(P25);
                    }
                    vt4 vt4Var5 = (vt4) P25;
                    boolean f15 = rv4Var3.f(aw7Var10);
                    if (i7 == 4) {
                        z8 = z13;
                    } else {
                        z8 = false;
                    }
                    boolean z18 = f15 | z8;
                    Object P26 = rv4Var3.P();
                    if (z18 || P26 == lh9Var2) {
                        P26 = new rp0(cz7Var2, aw7Var10, 14);
                        rv4Var3.o0(P26);
                    }
                    vt4 vt4Var6 = (vt4) P26;
                    boolean f16 = rv4Var3.f(aw7Var10);
                    if (i7 == 4) {
                        z9 = z13;
                    } else {
                        z9 = false;
                    }
                    boolean z19 = f16 | z9;
                    Object P27 = rv4Var3.P();
                    if (z19 || P27 == lh9Var2) {
                        P27 = new rp0(cz7Var2, aw7Var10, 15);
                        rv4Var3.o0(P27);
                    }
                    vt4 vt4Var7 = (vt4) P27;
                    boolean f17 = rv4Var3.f(aw7Var10);
                    if (i7 == 4) {
                        z10 = z13;
                    } else {
                        z10 = false;
                    }
                    boolean z20 = f17 | z10;
                    Object P28 = rv4Var3.P();
                    if (z20 || P28 == lh9Var2) {
                        P28 = new rp0(cz7Var2, aw7Var10, 16);
                        rv4Var3.o0(P28);
                    }
                    vt4 vt4Var8 = (vt4) P28;
                    boolean f18 = rv4Var3.f(aw7Var10);
                    if (i7 != 4) {
                        z13 = false;
                    }
                    boolean z21 = f18 | z13;
                    Object P29 = rv4Var3.P();
                    if (z21 || P29 == lh9Var2) {
                        P29 = new rp0(cz7Var2, aw7Var10, 17);
                        rv4Var3.o0(P29);
                    }
                    wq9.i(booleanValue3, xt4Var4, vt4Var4, vt4Var5, vt4Var6, vt4Var7, vt4Var8, (vt4) P29, rv4Var3, 0);
                } else {
                    vs.k("No ViewModelStoreOwner was provided via LocalRootViewModelStoreOwner or LocalViewModelStoreOwner");
                    return;
                }
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            cz7Var2 = cz7Var3;
            vt4Var2 = vt4Var3;
            i4 = 3;
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sv4(cz7Var2, vt4Var2, i, i4);
        }
    }

    public static final void d(aw7 aw7Var, boolean z) {
        aw7Var.setValue(Boolean.valueOf(z));
    }

    public static final void e(String str, int i, boolean z, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, vt4 vt4Var3, vt4 vt4Var4, rv4 rv4Var, int i2) {
        int i3;
        int i4;
        boolean z2;
        int i5;
        boolean z3;
        boolean z4;
        zx1 zx1Var;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        rv4 rv4Var2 = rv4Var;
        nk0 nk0Var = kh5.c;
        rv4Var2.g0(77863633);
        if ((i2 & 6) == 0) {
            if (rv4Var2.f(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i3 = i14 | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rv4Var2.d(i)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i3 |= i13;
        }
        if ((i2 & 384) == 0) {
            if (rv4Var2.d(0)) {
                i12 = 256;
            } else {
                i12 = Token.CASE;
            }
            i3 |= i12;
        }
        if ((i2 & 3072) == 0) {
            if (rv4Var2.g(z)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i3 |= i11;
        }
        if ((i2 & 24576) == 0) {
            if (rv4Var2.f(nq7Var)) {
                i10 = 16384;
            } else {
                i10 = 8192;
            }
            i3 |= i10;
        }
        if ((196608 & i2) == 0) {
            if (rv4Var2.h(vt4Var)) {
                i9 = 131072;
            } else {
                i9 = Parser.ARGC_LIMIT;
            }
            i3 |= i9;
        }
        if ((1572864 & i2) == 0) {
            if (rv4Var2.h(vt4Var2)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i3 |= i8;
        }
        int i15 = i3;
        if ((12582912 & i2) == 0) {
            if (rv4Var2.h(vt4Var3)) {
                i7 = 8388608;
            } else {
                i7 = 4194304;
            }
            i4 = i15 | i7;
        } else {
            i4 = i15;
        }
        if ((i2 & 100663296) == 0) {
            if (rv4Var2.h(vt4Var4)) {
                i6 = 67108864;
            } else {
                i6 = 33554432;
            }
            i4 |= i6;
        }
        int i16 = i4;
        if ((i16 & 38347923) != 38347922) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var2.U(i16 & 1, z2)) {
            nq7 h = pna.h(nq7Var, 40.0f);
            mk0 mk0Var = kh5.G;
            gv9 a2 = ev9.a(lz.e, mk0Var, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, h);
            rw1.k.getClass();
            zx1 zx1Var2 = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nq7 g = c16.g(kq7Var, null, 3);
            gv9 a3 = ev9.a(lz.a, mk0Var, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, g);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var2);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            xbe.i(rv4Var2, pna.s(kq7Var, 4.0f));
            nq7 n = pna.n(kq7Var, 40.0f);
            su9 su9Var = uu9.a;
            nq7 k = tte.k(n, su9Var);
            if ((i16 & 458752) == 131072) {
                z3 = true;
            } else {
                z3 = false;
            }
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z3 || P == lh9Var) {
                P = new jf3(23, vt4Var);
                rv4Var2.o0(P);
            }
            nk5.a(rp5.c((wk3) ok3.l0.getValue(), rv4Var2, 0), null, zbe.y(lbe.f(15, (vt4) P, k, null, false), 10.0f), 0L, rv4Var2, 48, 8);
            if (z) {
                rs8.s(rv4Var2, -1555220230, kq7Var, 4.0f, rv4Var2);
                nq7 k2 = tte.k(pna.n(kq7Var, 40.0f), su9Var);
                if ((i16 & 3670016) == 1048576) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                Object P2 = rv4Var2.P();
                if (z8 || P2 == lh9Var) {
                    P2 = new jf3(24, vt4Var2);
                    rv4Var2.o0(P2);
                }
                nq7 y = zbe.y(lbe.f(15, (vt4) P2, k2, null, false), 10.0f);
                z4 = false;
                nk5.a(rp5.c((wk3) jk3.b0.getValue(), rv4Var2, 0), null, y, 0L, rv4Var2, 48, 8);
                rv4Var2.q(false);
            } else {
                z4 = false;
                rv4Var2.e0(-1554775287);
                rv4Var2.q(false);
            }
            s21.x(rv4Var2, true, kq7Var, 4.0f, rv4Var2);
            nk0 nk0Var2 = kh5.a;
            b37 d2 = fu0.d(nk0Var2, z4);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, kq7Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                zx1Var = zx1Var2;
                rv4Var2.k(zx1Var);
            } else {
                zx1Var = zx1Var2;
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d2);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            nq7 k3 = tte.k(pna.n(kq7Var, 40.0f), su9Var);
            if ((i16 & 234881024) == 67108864) {
                z5 = true;
            } else {
                z5 = false;
            }
            Object P3 = rv4Var2.P();
            if (z5 || P3 == lh9Var) {
                P3 = new jf3(25, vt4Var4);
                rv4Var2.o0(P3);
            }
            zx1 zx1Var3 = zx1Var;
            nk5.a(rp5.c((wk3) ok3.a.getValue(), rv4Var2, 0), null, zbe.y(lbe.f(15, (vt4) P3, k3, null, false), 10.0f), 0L, rv4Var2, 48, 8);
            rv4Var2.e0(-1597729721);
            rv4Var2.q(false);
            rv4Var2.q(true);
            xbe.i(rv4Var2, pna.s(kq7Var, 4.0f));
            nq7 n2 = pna.n(kq7Var, 40.0f);
            b37 d3 = fu0.d(nk0Var2, false);
            int hashCode4 = Long.hashCode(rv4Var2.T);
            xt8 l4 = rv4Var2.l();
            nq7 p4 = lye.p(rv4Var2, n2);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var3);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d3);
            jce.F(npVar2, rv4Var2, l4);
            s21.t(hashCode4, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p4);
            ze4 ze4Var = pna.c;
            nq7 v = nmd.v(tte.k(zbe.y(ze4Var, 6.0f), su9Var), ((h27) rv4Var2.j(j27.a)).a.a, lre.g);
            if ((i16 & 29360128) == 8388608) {
                z6 = true;
            } else {
                z6 = false;
            }
            Object P4 = rv4Var2.P();
            if (z6 || P4 == lh9Var) {
                P4 = new jf3(26, vt4Var3);
                rv4Var2.o0(P4);
            }
            nq7 f = lbe.f(15, (vt4) P4, v, null, false);
            b37 d4 = fu0.d(nk0Var2, false);
            int hashCode5 = Long.hashCode(rv4Var2.T);
            xt8 l5 = rv4Var2.l();
            nq7 p5 = lye.p(rv4Var2, f);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var3);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d4);
            jce.F(npVar2, rv4Var2, l5);
            s21.t(hashCode5, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p5);
            if (str.length() > 0) {
                rv4Var2.e0(-28308763);
                z7 = true;
                do5.a(str, r0f.d, false, null, null, null, ze4Var, null, rv4Var, (i16 & 14) | 12582960, 892);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                z7 = true;
                rv4Var2.e0(-28088694);
                rv4Var2.q(false);
            }
            rv4Var2.q(z7);
            if (i > 0) {
                rv4Var2.e0(1956970028);
                i5 = i;
                ctd.a(3072, 6, 0L, 0L, jce.E(1458096826, new zj7(i5, 6), rv4Var2), rv4Var, pu0.a.a(kq7Var, nk0Var));
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                i5 = i;
                rv4Var2.e0(1957127632);
                rv4Var2.q(false);
            }
            rv4Var2.q(z7);
            rv4Var2.q(z7);
        } else {
            i5 = i;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new p85(str, i5, z, nq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, i2, 1);
        }
    }

    public static final void f(ar5 ar5Var, boolean z, nq7 nq7Var, vt4 vt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z2;
        nq7 nq7Var2;
        long j;
        rv4Var.g0(1633554807);
        if (rv4Var.f(ar5Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var.g(z)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i6 = i5 | i3 | 384;
        if (rv4Var.h(vt4Var)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i7 & 1, z2)) {
            nq7Var2 = kq7.a;
            nq7 r = vte.r(tte.k(pna.h(nq7Var2, 40.0f), uu9.a), z, new xt9(4), vt4Var);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode = Long.hashCode(rv4Var.T);
            xt8 l = rv4Var.l();
            nq7 p = lye.p(rv4Var, r);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var.i0();
            if (rv4Var.S) {
                rv4Var.k(zx1Var);
            } else {
                rv4Var.r0();
            }
            jce.F(qw1.f, rv4Var, d2);
            jce.F(qw1.e, rv4Var, l);
            jce.F(qw1.g, rv4Var, Integer.valueOf(hashCode));
            jce.C(qw1.h, rv4Var);
            jce.F(qw1.d, rv4Var, p);
            nq7 a2 = pu0.a.a(zbe.y(pna.h(nq7Var2, 40.0f), 10.0f), kh5.e);
            if (z) {
                rv4Var.e0(667434576);
                j = ((h27) rv4Var.j(j27.a)).a.a;
                rv4Var.q(false);
            } else {
                rv4Var.e0(667505070);
                j = ((h27) rv4Var.j(j27.a)).a.q;
                rv4Var.q(false);
            }
            nk5.a(ar5Var, null, a2, j, rv4Var, (i7 & 14) | 48, 0);
            rv4Var.q(true);
        } else {
            rv4Var.X();
            nq7Var2 = nq7Var;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rd0(ar5Var, z, nq7Var2, vt4Var, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03be  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0400  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void g(java.lang.String r31, int r32, boolean r33, defpackage.nq7 r34, defpackage.vt4 r35, defpackage.vt4 r36, defpackage.vt4 r37, defpackage.vt4 r38, defpackage.rv4 r39, int r40) {
        /*
            Method dump skipped, instructions count: 1080
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxe.g(java.lang.String, int, boolean, nq7, vt4, vt4, vt4, vt4, rv4, int):void");
    }

    public static final void h(String str, int i, int i2, List list, int i3, rj8 rj8Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var3, vt4 vt4Var4, rv4 rv4Var, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z;
        float f;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(264670988);
        if (rv4Var2.f(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i15 = i4 | i5;
        int i16 = 16;
        if (rv4Var2.d(i)) {
            i6 = 32;
        } else {
            i6 = 16;
        }
        int i17 = i15 | i6;
        int i18 = 256;
        if (rv4Var2.d(i2)) {
            i7 = 256;
        } else {
            i7 = 128;
        }
        int i19 = i17 | i7;
        int i20 = 1024;
        if (rv4Var2.f(list)) {
            i8 = 2048;
        } else {
            i8 = 1024;
        }
        int i21 = i19 | i8;
        if (rv4Var2.d(i3)) {
            i9 = 16384;
        } else {
            i9 = 8192;
        }
        int i22 = i21 | i9;
        if (rv4Var2.d(0)) {
            i10 = 131072;
        } else {
            i10 = Parser.ARGC_LIMIT;
        }
        int i23 = i22 | i10;
        if (rv4Var2.f(rj8Var)) {
            i11 = 1048576;
        } else {
            i11 = 524288;
        }
        int i24 = i23 | i11;
        if (rv4Var2.h(vt4Var)) {
            i12 = 67108864;
        } else {
            i12 = 33554432;
        }
        int i25 = i24 | i12;
        if (rv4Var2.h(vt4Var2)) {
            i13 = 536870912;
        } else {
            i13 = 268435456;
        }
        int i26 = i25 | i13;
        if (rv4Var2.h(xt4Var)) {
            i14 = 4;
        } else {
            i14 = 2;
        }
        if (rv4Var2.h(xt4Var2)) {
            i16 = 32;
        }
        int i27 = i14 | i16;
        if (!rv4Var2.h(vt4Var3)) {
            i18 = 128;
        }
        int i28 = i27 | i18;
        if (rv4Var2.h(vt4Var4)) {
            i20 = 2048;
        }
        int i29 = i28 | i20;
        if ((i26 & 306783379) == 306783378 && (i29 & 1171) == 1170) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var2.U(i26 & 1, z)) {
            nq7 h = q1d.h(rv4Var2, nq7Var);
            xn1 a2 = wn1.a(lz.c, kh5.I, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, h);
            rw1.k.getClass();
            zx1 zx1Var = qw1.b;
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            np npVar = qw1.f;
            jce.F(npVar, rv4Var2, a2);
            np npVar2 = qw1.e;
            jce.F(npVar2, rv4Var2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            np npVar3 = qw1.g;
            jce.F(npVar3, rv4Var2, valueOf);
            kg kgVar = qw1.h;
            jce.C(kgVar, rv4Var2);
            np npVar4 = qw1.d;
            jce.F(npVar4, rv4Var2, p);
            kq7 kq7Var = kq7.a;
            nq7 C = zbe.C(zbe.A(mwe.u(pna.f(kq7Var, 1.0f), false, 1), 12.0f, nae.e, 2), nae.e, 12.0f, nae.e, 6.0f, 5);
            gv9 a3 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, C);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            String A = yqe.A((y3b) s2b.w0.getValue(), rv4Var2);
            oyb oybVar = ((h27) rv4Var2.j(j27.a)).b.g;
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            float f2 = Float.MAX_VALUE;
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            } else {
                f = 1.0f;
            }
            nq7 C2 = zbe.C(new we6(f, true), 12.0f, nae.e, nae.e, nae.e, 14);
            if (1.0f <= 0.0d) {
                jv5.a("invalid weight; must be greater than zero");
            }
            if (1.0f <= Float.MAX_VALUE) {
                f2 = 1.0f;
            }
            cvb.c(A, C2.a0(new we6(f2, true)), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, oybVar, rv4Var, 0, 24576, 114684);
            int k = rj8Var.k();
            if (2 <= k && k < 5) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i30 = i26 >> 9;
            int i31 = i29 << 15;
            e(str, i, z2, kq7Var, vt4Var, vt4Var2, vt4Var3, vt4Var4, rv4Var, (i26 & 14) | 24576 | (i26 & Token.ASSIGN_MOD) | (i30 & 896) | (i30 & 458752) | (i30 & 3670016) | (i31 & 29360128) | (i31 & 234881024));
            rv4Var.q(true);
            rv4Var2 = rv4Var;
            a(i2, list, i3, rj8Var, zbe.C(pna.f(kq7Var, 1.0f), 12.0f, nae.e, 12.0f, 6.0f, 2), xt4Var, xt4Var2, rv4Var2, ((i26 >> 6) & 1022) | (i30 & 7168) | (i31 & 458752) | (i31 & 3670016));
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new o85(str, i, i2, list, i3, rj8Var, nq7Var, vt4Var, vt4Var2, xt4Var, xt4Var2, vt4Var3, vt4Var4, i4, 1);
        }
    }

    public static final void i(String str, int i, int i2, List list, int i3, rj8 rj8Var, nq7 nq7Var, vt4 vt4Var, vt4 vt4Var2, xt4 xt4Var, xt4 xt4Var2, vt4 vt4Var3, vt4 vt4Var4, rv4 rv4Var, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        boolean z;
        nq7 nq7Var2;
        boolean z2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(-1336002838);
        if (rv4Var2.f(str)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i17 = i4 | i5;
        if (rv4Var2.d(i)) {
            i6 = 32;
        } else {
            i6 = 16;
        }
        int i18 = i17 | i6;
        int i19 = 256;
        if (rv4Var2.d(0)) {
            i7 = 256;
        } else {
            i7 = 128;
        }
        int i20 = i18 | i7;
        if (rv4Var2.d(i2)) {
            i8 = 2048;
        } else {
            i8 = 1024;
        }
        int i21 = i20 | i8;
        if (rv4Var2.f(list)) {
            i9 = 16384;
        } else {
            i9 = 8192;
        }
        int i22 = i21 | i9;
        if (rv4Var2.d(i3)) {
            i10 = 131072;
        } else {
            i10 = Parser.ARGC_LIMIT;
        }
        int i23 = i22 | i10;
        if (rv4Var2.f(rj8Var)) {
            i11 = 1048576;
        } else {
            i11 = 524288;
        }
        int i24 = i23 | i11;
        if (rv4Var2.h(vt4Var)) {
            i12 = 67108864;
        } else {
            i12 = 33554432;
        }
        int i25 = i24 | i12;
        if (rv4Var2.h(vt4Var2)) {
            i13 = 536870912;
        } else {
            i13 = 268435456;
        }
        int i26 = i25 | i13;
        if (rv4Var2.h(xt4Var)) {
            i14 = 4;
        } else {
            i14 = 2;
        }
        if (rv4Var2.h(xt4Var2)) {
            i15 = 32;
        } else {
            i15 = 16;
        }
        int i27 = i14 | i15;
        if (!rv4Var2.h(vt4Var3)) {
            i19 = 128;
        }
        int i28 = i27 | i19;
        if (rv4Var2.h(vt4Var4)) {
            i16 = 2048;
        } else {
            i16 = 1024;
        }
        int i29 = i28 | i16;
        if ((i26 & 306783379) == 306783378 && (i29 & 1171) == 1170) {
            z = false;
        } else {
            z = true;
        }
        if (rv4Var2.U(i26 & 1, z)) {
            nq7Var2 = nq7Var;
            nq7 A = zbe.A(mwe.u(q1d.h(rv4Var2, nq7Var2), false, 1), nae.e, 8.0f, 1);
            gv9 a2 = ev9.a(lz.e, kh5.G, rv4Var2, 54);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, A);
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
            int i30 = i26 >> 9;
            int i31 = i29 << 15;
            a(i2, list, i3, rj8Var, new we6(1.0f, true), xt4Var, xt4Var2, rv4Var2, (i31 & 458752) | (i30 & 8190) | (i31 & 3670016));
            int k = rj8Var.k();
            if (2 <= k && k < 5) {
                z2 = true;
            } else {
                z2 = false;
            }
            g(str, i, z2, zbe.A(kq7.a, 12.0f, nae.e, 2), vt4Var, vt4Var2, vt4Var3, vt4Var4, rv4Var, (i26 & 14) | 24576 | (i26 & Token.ASSIGN_MOD) | (i26 & 896) | (i30 & 458752) | (i30 & 3670016) | (29360128 & i31) | (234881024 & i31));
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            nq7Var2 = nq7Var;
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new o85(str, i, i2, list, i3, rj8Var, nq7Var2, vt4Var, vt4Var2, xt4Var, xt4Var2, vt4Var3, vt4Var4, i4, 0);
        }
    }

    public static final void j(int i, int i2, nq7 nq7Var, rv4 rv4Var, int i3) {
        int i4;
        int i5;
        int i6;
        boolean z;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1983007968);
        if (rv4Var2.d(i)) {
            i4 = 4;
        } else {
            i4 = 2;
        }
        int i7 = i3 | i4;
        if (rv4Var2.d(i2)) {
            i5 = 32;
        } else {
            i5 = 16;
        }
        int i8 = i7 | i5;
        if (rv4Var2.f(nq7Var)) {
            i6 = 256;
        } else {
            i6 = Token.CASE;
        }
        int i9 = i8 | i6;
        if ((i9 & Token.EXPR_VOID) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i9 & 1, z)) {
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z("");
                rv4Var2.o0(P);
            }
            aw7 aw7Var = (aw7) P;
            Object P2 = rv4Var2.P();
            Object obj = null;
            if (P2 == lh9Var) {
                P2 = new as2(aw7Var, null, 1);
                rv4Var2.o0(P2);
            }
            yte.g((lu4) P2, rv4Var2, pvc.a);
            nq7 z2 = zbe.z(nmd.v(tte.k(nq7Var, uu9.a), zl1.b(0.5f, zl1.b), lre.g), 8.0f, 2.0f);
            gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, z2);
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
            Object valueOf = Integer.valueOf(i);
            if (i <= 0) {
                valueOf = null;
            }
            if (valueOf == null) {
                valueOf = "0";
            }
            Integer valueOf2 = Integer.valueOf(i2);
            if (i2 > 0) {
                obj = valueOf2;
            }
            if (obj == null) {
                obj = "--";
            }
            String str = valueOf + "/" + obj;
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.o;
            long j = zl1.e;
            cvb.c(str, null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, oybVar, rv4Var, 384, 0, 131066);
            xbe.i(rv4Var, pna.s(kq7.a, 6.0f));
            cvb.c((String) aw7Var.getValue(), null, j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((h27) rv4Var.j(tzaVar)).b.o, rv4Var, 384, 0, 131066);
            rv4Var2 = rv4Var;
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new jq5(i, i2, i3, nq7Var);
        }
    }

    public static final void k(boolean z, List list, vt4 vt4Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z2;
        rv4Var.g0(1808725873);
        if (rv4Var.g(z)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(list)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i7 = i6 | i3;
        if (rv4Var.h(vt4Var)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i9 = i8 | i5;
        if ((i9 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i9 & 1, z2)) {
            iue.e(z, null, 0L, null, nae.e, new th8(12.0f, 12.0f, 12.0f, 12.0f), vt4Var, jce.E(618125437, new xv0(list, xt4Var, 1), rv4Var), rv4Var, (i9 & 14) | 12779520 | ((i9 << 12) & 3670016), 30);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new rd0(z, list, vt4Var, xt4Var, i);
        }
    }

    public static final void l(String str, final boolean z, boolean z2, final vt4 vt4Var, vt4 vt4Var2, rv4 rv4Var, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Object obj;
        int i8;
        int i9;
        boolean z3;
        boolean z4;
        vt4 vt4Var3;
        final boolean z5;
        final vt4 vt4Var4;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        long j;
        long j2;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1841740031);
        if (rv4Var2.f(str)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i10 = i | i3;
        if (rv4Var2.g(z)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i11 = i10 | i4;
        int i12 = i2 & 4;
        if (i12 != 0) {
            i6 = i11 | 384;
        } else {
            if (rv4Var2.g(z2)) {
                i5 = 256;
            } else {
                i5 = Token.CASE;
            }
            i6 = i11 | i5;
        }
        if (rv4Var2.h(vt4Var)) {
            i7 = 16384;
        } else {
            i7 = 8192;
        }
        int i13 = i6 | i7;
        int i14 = i2 & 32;
        if (i14 != 0) {
            i9 = i13 | 196608;
            obj = vt4Var2;
        } else {
            obj = vt4Var2;
            if (rv4Var2.h(obj)) {
                i8 = 131072;
            } else {
                i8 = Parser.ARGC_LIMIT;
            }
            i9 = i13 | i8;
        }
        if ((74899 & i9) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (rv4Var2.U(i9 & 1, z3)) {
            if (i12 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            lh9 lh9Var = ax1.a;
            if (i14 != 0) {
                Object P = rv4Var2.P();
                if (P == lh9Var) {
                    P = new cd1(15);
                    rv4Var2.o0(P);
                }
                vt4Var4 = (vt4) P;
            } else {
                vt4Var4 = obj;
            }
            kq7 kq7Var = kq7.a;
            nq7 k = tte.k(pna.j(kq7Var, 40.0f, nae.e, 2), uu9.a);
            xt9 xt9Var = new xt9(4);
            if ((i9 & Token.ASSIGN_MOD) == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            if ((i9 & 896) == 256) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z11 = z6 | z7;
            if ((458752 & i9) == 131072) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z12 = z11 | z8;
            if ((57344 & i9) == 16384) {
                z9 = true;
            } else {
                z9 = false;
            }
            boolean z13 = z12 | z9;
            Object P2 = rv4Var2.P();
            if (z13 || P2 == lh9Var) {
                P2 = new vt4() { // from class: q85
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        if (z && z5) {
                            vt4Var4.invoke();
                        } else {
                            vt4Var.invoke();
                        }
                        return pvc.a;
                    }
                };
                rv4Var2.o0(P2);
            }
            nq7 A = zbe.A(vte.r(k, z, xt9Var, (vt4) P2), 16.0f, nae.e, 2);
            gv9 a2 = ev9.a(lz.a, kh5.F, rv4Var2, 0);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, A);
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
            if (z) {
                rv4Var2.e0(847212906);
                j = ((h27) rv4Var2.j(j27.a)).a.a;
                z10 = false;
            } else {
                z10 = false;
                rv4Var2.e0(847214156);
                j = ((h27) rv4Var2.j(j27.a)).a.q;
            }
            rv4Var2.q(z10);
            tza tzaVar = j27.a;
            oyb oybVar = ((h27) rv4Var2.j(tzaVar)).b.i;
            dq4 dq4Var = dq4.f;
            mk0 mk0Var = kh5.G;
            boolean z14 = z5;
            int i15 = (i9 & 14) | 1572864;
            boolean z15 = z10;
            vt4 vt4Var5 = vt4Var4;
            cvb.c(str, new k5d(mk0Var), j, null, 0L, null, dq4Var, null, 0L, null, null, 0L, 0, false, 1, 0, null, oybVar, rv4Var, i15, 24576, 114616);
            rv4Var2 = rv4Var;
            if (z14) {
                rs8.s(rv4Var2, 494087402, kq7Var, 6.0f, rv4Var2);
                ar5 c2 = rp5.c((wk3) ok3.t.getValue(), rv4Var2, z15 ? 1 : 0);
                nq7 a0 = pna.n(kq7Var, 16.0f).a0(new k5d(mk0Var));
                if (z) {
                    rv4Var2.e0(847232138);
                    j2 = ((h27) rv4Var2.j(tzaVar)).a.a;
                } else {
                    rv4Var2.e0(847233388);
                    j2 = ((h27) rv4Var2.j(tzaVar)).a.q;
                }
                rv4Var2.q(z15);
                nk5.a(c2, null, a0, j2, rv4Var2, 48, 0);
                rv4Var2.q(z15);
            } else {
                rv4Var2.e0(494507359);
                rv4Var2.q(z15);
            }
            rv4Var2.q(true);
            vt4Var3 = vt4Var5;
            z4 = z14;
        } else {
            rv4Var2.X();
            z4 = z2;
            vt4Var3 = obj;
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new ra(str, z, z4, vt4Var, vt4Var3, i, i2);
        }
    }

    public static final void m(boolean z, oq9 oq9Var, gtb gtbVar, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        long j;
        float f;
        gvb d2;
        int i3;
        int i4;
        int i5;
        rv4Var.g0(-1344558920);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.d(oq9Var.ordinal())) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(gtbVar)) {
                i3 = 256;
            } else {
                i3 = Token.CASE;
            }
            i2 |= i3;
        }
        boolean z4 = false;
        if ((i2 & Token.EXPR_VOID) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            int i6 = i2 & 14;
            if (i6 == 4) {
                z3 = true;
            } else {
                z3 = false;
            }
            boolean f2 = z3 | rv4Var.f(gtbVar);
            Object P = rv4Var.P();
            Object obj = ax1.a;
            if (f2 || P == obj) {
                P = new dtb(gtbVar, z);
                rv4Var.o0(P);
            }
            npb npbVar = (npb) P;
            boolean h = rv4Var.h(gtbVar);
            if (i6 == 4) {
                z4 = true;
            }
            boolean z5 = h | z4;
            Object P2 = rv4Var.P();
            if (z5 || P2 == obj) {
                P2 = new htb(gtbVar, z);
                rv4Var.o0(P2);
            }
            l88 l88Var = (l88) P2;
            boolean h2 = fxb.h(gtbVar.n().b);
            if (z) {
                j = gtbVar.n().b >> 32;
            } else {
                j = gtbVar.n().b & 4294967295L;
            }
            int i7 = (int) j;
            ol6 ol6Var = gtbVar.d;
            if (ol6Var != null && (d2 = ol6Var.d()) != null) {
                f = nye.u(d2.a, i7);
            } else {
                f = nae.e;
            }
            float f3 = f;
            boolean h3 = rv4Var.h(npbVar);
            Object P3 = rv4Var.P();
            if (h3 || P3 == obj) {
                P3 = new n6a(npbVar, 1);
                rv4Var.o0(P3);
            }
            qre.n(l88Var, z, oq9Var, h2, 0L, f3, dab.b(kq7.a, npbVar, (PointerInputEventHandler) P3), rv4Var, (i2 << 3) & 1008, 16);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new z52(i, 8, oq9Var, gtbVar, z);
        }
    }

    public static final Object n(List list, m42 m42Var) {
        if (list.isEmpty()) {
            return ks3.a;
        }
        return new ne0((gz2[]) list.toArray(new gz2[0])).a(m42Var);
    }

    public static final Object o(gz2[] gz2VarArr, aab aabVar) {
        if (gz2VarArr.length == 0) {
            return ks3.a;
        }
        return new ne0(gz2VarArr).a(aabVar);
    }

    public static int p(int i) {
        if (i < 3) {
            kue.e(i, "expectedSize");
            return i + 1;
        } else if (i < 1073741824) {
            return (int) Math.ceil(i / 0.75d);
        } else {
            return Integer.MAX_VALUE;
        }
    }

    public static byte[] q(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            deflater.end();
            throw th;
        }
    }

    public static int r(nl9 nl9Var, yp3 yp3Var, View view, View view2, el9 el9Var, boolean z) {
        if (el9Var.u() != 0 && nl9Var.b() != 0 && view != null && view2 != null) {
            if (!z) {
                return Math.abs(el9.E(view) - el9.E(view2)) + 1;
            }
            return Math.min(yp3Var.n(), yp3Var.d(view2) - yp3Var.g(view));
        }
        return 0;
    }

    public static int s(nl9 nl9Var, yp3 yp3Var, View view, View view2, el9 el9Var, boolean z, boolean z2) {
        int max;
        if (el9Var.u() == 0 || nl9Var.b() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(el9.E(view), el9.E(view2));
        int max2 = Math.max(el9.E(view), el9.E(view2));
        if (z2) {
            max = Math.max(0, (nl9Var.b() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(yp3Var.d(view2) - yp3Var.g(view)) / (Math.abs(el9.E(view) - el9.E(view2)) + 1))) + (yp3Var.m() - yp3Var.g(view)));
    }

    public static int t(nl9 nl9Var, yp3 yp3Var, View view, View view2, el9 el9Var, boolean z) {
        if (el9Var.u() != 0 && nl9Var.b() != 0 && view != null && view2 != null) {
            if (!z) {
                return nl9Var.b();
            }
            return (int) (((yp3Var.d(view2) - yp3Var.g(view)) / (Math.abs(el9.E(view) - el9.E(view2)) + 1)) * nl9Var.b());
        }
        return 0;
    }

    public static boolean u(Object obj, Map map) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static String v(XmlPullParser xmlPullParser, String str) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            if (xmlPullParser.getAttributeName(i).equals(str)) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }

    public static final int w(ij8 ij8Var) {
        long i;
        if (ij8Var.e == ff8.a) {
            i = ij8Var.i() & 4294967295L;
        } else {
            i = ij8Var.i() >> 32;
        }
        return (int) i;
    }

    public static boolean x(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 3 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean y(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getEventType() == 2 && xmlPullParser.getName().equals(str)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z(java.util.List r4, defpackage.n42 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.re0
            if (r0 == 0) goto L13
            r0 = r5
            re0 r0 = (defpackage.re0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            re0 r0 = new re0
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.c
            int r1 = r0.d
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            int r4 = r0.b
            java.util.Iterator r1 = r0.a
            java.util.Iterator r1 = (java.util.Iterator) r1
            defpackage.hre.r(r5)
            goto L3c
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L32:
            defpackage.hre.r(r5)
            java.util.Iterator r4 = r4.iterator()
            r5 = 0
            r1 = r4
            r4 = r5
        L3c:
            boolean r5 = r1.hasNext()
            if (r5 == 0) goto L5a
            java.lang.Object r5 = r1.next()
            w26 r5 = (defpackage.w26) r5
            r3 = r1
            java.util.Iterator r3 = (java.util.Iterator) r3
            r0.a = r3
            r0.b = r4
            r0.d = r2
            java.lang.Object r5 = r5.join(r0)
            n82 r3 = defpackage.n82.a
            if (r5 != r3) goto L3c
            return r3
        L5a:
            pvc r4 = defpackage.pvc.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxe.z(java.util.List, n42):java.lang.Object");
    }
}
