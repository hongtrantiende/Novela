package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;
/* renamed from: k27  reason: default package */
/* loaded from: classes.dex */
public abstract class k27 {
    public static final ftc a = ftc.a;
    public static final tu1 b = new tu1(new mv1(26), false, -744304928);
    public static final mb4 c;
    public static final mb4 d;
    public static final mb4 e;
    public static final mb4[] f;
    public static ar5 g;

    static {
        mb4 mb4Var = new mb4("auth_api_credentials_begin_sign_in", 9L);
        mb4 mb4Var2 = new mb4("auth_api_credentials_sign_out", 2L);
        mb4 mb4Var3 = new mb4("auth_api_credentials_authorize", 1L);
        c = mb4Var3;
        mb4 mb4Var4 = new mb4("auth_api_credentials_revoke_access", 1L);
        mb4 mb4Var5 = new mb4("auth_api_credentials_save_password", 4L);
        d = mb4Var5;
        mb4 mb4Var6 = new mb4("auth_api_credentials_get_sign_in_intent", 6L);
        e = mb4Var6;
        f = new mb4[]{mb4Var, mb4Var2, mb4Var3, mb4Var4, mb4Var5, mb4Var6, new mb4("auth_api_credentials_save_account_linking_token", 3L), new mb4("auth_api_credentials_get_phone_number_hint_intent", 3L), new mb4("auth_api_credentials_verify_with_google", 1L), new mb4("auth_api_credentials_credential_provider", 1L)};
    }

    public static int A(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        vs.m("Cannot round NaN value.");
        return 0;
    }

    public static long B(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        vs.m("Cannot round NaN value.");
        return 0L;
    }

    public static final Object C(gac gacVar, lu4 lu4Var) {
        t(gacVar, true, new nb3(ade.s(gacVar.f.getContext()).o(gacVar.C, gacVar, gacVar.e)));
        return zbe.J(gacVar, false, gacVar, lu4Var);
    }

    public static final byte[] D(byte[] bArr, int i, int i2) {
        if (i2 > 0 && i >= 0 && i < bArr.length) {
            return b00.d0(bArr, i, Math.min(i2 + i, bArr.length));
        }
        return new byte[0];
    }

    public static final Object E(long j, lu4 lu4Var, n42 n42Var) {
        if (j > 0) {
            return C(new gac(j, n42Var), lu4Var);
        }
        throw new eac("Timed out immediately", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Type inference failed for: r9v3, types: [zl9, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object F(long r6, defpackage.lu4 r8, defpackage.n42 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.hac
            if (r0 == 0) goto L13
            r0 = r9
            hac r0 = (defpackage.hac) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            hac r0 = new hac
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.b
            int r1 = r0.c
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L30
            if (r1 != r3) goto L2a
            zl9 r6 = r0.a
            defpackage.hre.r(r9)     // Catch: defpackage.eac -> L28
            return r9
        L28:
            r7 = move-exception
            goto L56
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L30:
            defpackage.hre.r(r9)
            r4 = 0
            int r9 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r9 > 0) goto L3a
            goto L5c
        L3a:
            zl9 r9 = new zl9
            r9.<init>()
            r0.a = r9     // Catch: defpackage.eac -> L54
            r0.c = r3     // Catch: defpackage.eac -> L54
            gac r1 = new gac     // Catch: defpackage.eac -> L54
            r1.<init>(r6, r0)     // Catch: defpackage.eac -> L54
            r9.a = r1     // Catch: defpackage.eac -> L54
            java.lang.Object r6 = C(r1, r8)     // Catch: defpackage.eac -> L54
            n82 r7 = defpackage.n82.a
            if (r6 != r7) goto L53
            return r7
        L53:
            return r6
        L54:
            r7 = move-exception
            r6 = r9
        L56:
            w26 r8 = r7.a
            java.lang.Object r6 = r6.a
            if (r8 != r6) goto L5d
        L5c:
            return r2
        L5d:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k27.F(long, lu4, n42):java.lang.Object");
    }

    public static final Object G(long j, lu4 lu4Var, n42 n42Var) {
        return F(ade.z(j), lu4Var, n42Var);
    }

    public static String H(byte[] bArr) {
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

    public static final m41 a(d82 d82Var) {
        if (d82Var.get(r0f.I) == null) {
            d82Var = d82Var.plus(c());
        }
        return new m41(d82Var);
    }

    public static final void b(String str, List list, List list2, nq7 nq7Var, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, xt4 xt4Var5, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        rv4Var.g0(-2023620535);
        if (rv4Var.f(str)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i9 = i | i2;
        if (rv4Var.f(list)) {
            i3 = 32;
        } else {
            i3 = 16;
        }
        int i10 = i9 | i3;
        if (rv4Var.f(list2)) {
            i4 = 256;
        } else {
            i4 = Token.CASE;
        }
        int i11 = i10 | i4;
        if (rv4Var.h(xt4Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i12 = i11 | i5;
        if (rv4Var.h(xt4Var2)) {
            i6 = 131072;
        } else {
            i6 = Parser.ARGC_LIMIT;
        }
        int i13 = i12 | i6;
        if (rv4Var.h(xt4Var3)) {
            i7 = 1048576;
        } else {
            i7 = 524288;
        }
        int i14 = i13 | i7;
        if (rv4Var.h(xt4Var5)) {
            i8 = 67108864;
        } else {
            i8 = 33554432;
        }
        int i15 = i14 | i8;
        boolean z8 = false;
        if ((38347923 & i15) != 38347922) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i15 & 1, z)) {
            if ((i15 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            if ((i15 & Token.ASSIGN_MOD) != 32) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean z9 = z2 | z3;
            if ((57344 & i15) == 16384) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z10 = z9 | z4;
            if ((458752 & i15) == 131072) {
                z5 = true;
            } else {
                z5 = false;
            }
            boolean z11 = z10 | z5;
            if ((i15 & 896) != 256) {
                z6 = false;
            } else {
                z6 = true;
            }
            boolean z12 = z11 | z6;
            if ((3670016 & i15) == 1048576) {
                z7 = true;
            } else {
                z7 = false;
            }
            boolean z13 = z12 | z7;
            if ((i15 & 234881024) == 67108864) {
                z8 = true;
            }
            boolean z14 = z13 | z8;
            Object P = rv4Var.P();
            if (z14 || P == ax1.a) {
                rg1 rg1Var = new rg1(str, list, list2, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, 3);
                rv4Var.o0(rg1Var);
                P = rg1Var;
            }
            jce.d(nq7Var, null, null, false, null, null, null, false, null, (xt4) P, rv4Var, 6, 510);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sw5(str, list, list2, nq7Var, xt4Var, xt4Var2, xt4Var3, xt4Var4, xt4Var5, i, 1);
        }
    }

    public static y26 c() {
        return new y26(null);
    }

    public static final m41 d() {
        b9b b2 = rse.b();
        sw2 sw2Var = ab3.a;
        return new m41(nq2.C(b2, zz6.a));
    }

    public static final void e(final e13 e13Var, xt4 xt4Var, rv4 rv4Var, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        e13Var.getClass();
        rv4Var.g0(-2012052701);
        if (rv4Var.f(e13Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i4 = i | i2;
        if (rv4Var.h(xt4Var)) {
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
            boolean booleanValue = ((Boolean) e13Var.a.getValue()).booleanValue();
            if ((i5 & 14) == 4) {
                z2 = true;
            } else {
                z2 = false;
            }
            Object P = rv4Var.P();
            if (z2 || P == ax1.a) {
                P = new u74(e13Var, 1);
                rv4Var.o0(P);
            }
            xb.a(booleanValue, (xt4) P, jce.E(-687991188, new ue7(xt4Var, e13Var), rv4Var), null, null, jce.E(1499188591, new lu4() { // from class: ve7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    int i6 = r2;
                    pvc pvcVar = pvc.a;
                    boolean z4 = false;
                    e13 e13Var2 = e13Var;
                    switch (i6) {
                        case 0:
                            rv4 rv4Var2 = (rv4) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if ((intValue & 3) != 2) {
                                z4 = true;
                            }
                            if (rv4Var2.U(intValue & 1, z4)) {
                                boolean f2 = rv4Var2.f(e13Var2);
                                Object P2 = rv4Var2.P();
                                if (f2 || P2 == ax1.a) {
                                    P2 = new u76(e13Var2, 9);
                                    rv4Var2.o0(P2);
                                }
                                nmd.j((vt4) P2, null, false, null, null, null, nxe.b, rv4Var2, 805306368, 510);
                            } else {
                                rv4Var2.X();
                            }
                            return pvcVar;
                        default:
                            rv4 rv4Var3 = (rv4) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if ((intValue2 & 3) != 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (rv4Var3.U(intValue2 & 1, z3)) {
                                kq7 kq7Var = kq7.a;
                                nq7 f3 = pna.f(kq7Var, 1.0f);
                                b37 d2 = fu0.d(kh5.a, false);
                                int hashCode = Long.hashCode(rv4Var3.T);
                                xt8 l = rv4Var3.l();
                                nq7 p = lye.p(rv4Var3, f3);
                                rw1.k.getClass();
                                zx1 zx1Var = qw1.b;
                                rv4Var3.i0();
                                if (rv4Var3.S) {
                                    rv4Var3.k(zx1Var);
                                } else {
                                    rv4Var3.r0();
                                }
                                jce.F(qw1.f, rv4Var3, d2);
                                jce.F(qw1.e, rv4Var3, l);
                                jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode));
                                jce.C(qw1.h, rv4Var3);
                                jce.F(qw1.d, rv4Var3, p);
                                qa5 qa5Var = qa5.a;
                                cvb.d(qa5.d(yqe.B((y3b) o2b.H.getValue(), new Object[]{(String) e13Var2.c.getValue()}, rv4Var3)), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((h27) rv4Var3.j(j27.a)).b.j, rv4Var3, 0, 0, 262142);
                                rs8.u(rv4Var3, true, kq7Var, 12.0f, rv4Var3);
                            } else {
                                rv4Var3.X();
                            }
                            return pvcVar;
                    }
                }
            }, rv4Var), nxe.c, null, 0L, 0L, nae.e, null, null, null, false, false, jce.E(859948487, new lu4() { // from class: ve7
                @Override // defpackage.lu4
                public final Object invoke(Object obj, Object obj2) {
                    boolean z3;
                    int i6 = r2;
                    pvc pvcVar = pvc.a;
                    boolean z4 = false;
                    e13 e13Var2 = e13Var;
                    switch (i6) {
                        case 0:
                            rv4 rv4Var2 = (rv4) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if ((intValue & 3) != 2) {
                                z4 = true;
                            }
                            if (rv4Var2.U(intValue & 1, z4)) {
                                boolean f2 = rv4Var2.f(e13Var2);
                                Object P2 = rv4Var2.P();
                                if (f2 || P2 == ax1.a) {
                                    P2 = new u76(e13Var2, 9);
                                    rv4Var2.o0(P2);
                                }
                                nmd.j((vt4) P2, null, false, null, null, null, nxe.b, rv4Var2, 805306368, 510);
                            } else {
                                rv4Var2.X();
                            }
                            return pvcVar;
                        default:
                            rv4 rv4Var3 = (rv4) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if ((intValue2 & 3) != 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (rv4Var3.U(intValue2 & 1, z3)) {
                                kq7 kq7Var = kq7.a;
                                nq7 f3 = pna.f(kq7Var, 1.0f);
                                b37 d2 = fu0.d(kh5.a, false);
                                int hashCode = Long.hashCode(rv4Var3.T);
                                xt8 l = rv4Var3.l();
                                nq7 p = lye.p(rv4Var3, f3);
                                rw1.k.getClass();
                                zx1 zx1Var = qw1.b;
                                rv4Var3.i0();
                                if (rv4Var3.S) {
                                    rv4Var3.k(zx1Var);
                                } else {
                                    rv4Var3.r0();
                                }
                                jce.F(qw1.f, rv4Var3, d2);
                                jce.F(qw1.e, rv4Var3, l);
                                jce.F(qw1.g, rv4Var3, Integer.valueOf(hashCode));
                                jce.C(qw1.h, rv4Var3);
                                jce.F(qw1.d, rv4Var3, p);
                                qa5 qa5Var = qa5.a;
                                cvb.d(qa5.d(yqe.B((y3b) o2b.H.getValue(), new Object[]{(String) e13Var2.c.getValue()}, rv4Var3)), null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, ((h27) rv4Var3.j(j27.a)).b.j, rv4Var3, 0, 0, 262142);
                                rs8.u(rv4Var3, true, kq7Var, 12.0f, rv4Var3);
                            } else {
                                rv4Var3.X();
                            }
                            return pvcVar;
                    }
                }
            }, rv4Var), rv4Var, 1769856, 1572864, 65432);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new ue7(e13Var, xt4Var, i);
        }
    }

    public static final void f(boolean z, final cz7 cz7Var, String str, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, rv4 rv4Var, int i) {
        int i2;
        xt4 xt4Var4;
        Object obj;
        boolean z2;
        final xt4 xt4Var5;
        String str2;
        aw7 aw7Var;
        final aw7 aw7Var2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        cz7Var.getClass();
        xt4Var.getClass();
        xt4Var2.getClass();
        xt4Var3.getClass();
        rv4Var.g0(316394022);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f(cz7Var)) {
                i6 = 32;
            } else {
                i6 = 16;
            }
            i2 |= i6;
        }
        int i8 = i2 | 384;
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i8 |= i5;
        }
        if ((i & 24576) == 0) {
            xt4Var4 = xt4Var2;
            if (rv4Var.h(xt4Var4)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i8 |= i4;
        } else {
            xt4Var4 = xt4Var2;
        }
        if ((i & 196608) == 0) {
            obj = xt4Var3;
            if (rv4Var.h(obj)) {
                i3 = 131072;
            } else {
                i3 = Parser.ARGC_LIMIT;
            }
            i8 |= i3;
        } else {
            obj = xt4Var3;
        }
        if ((74899 & i8) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i8 & 1, z2)) {
            Object P = rv4Var.P();
            lh9 lh9Var = ax1.a;
            if (P == lh9Var) {
                P = yae.z(Boolean.FALSE);
                rv4Var.o0(P);
            }
            aw7 aw7Var3 = (aw7) P;
            Object P2 = rv4Var.P();
            if (P2 == lh9Var) {
                P2 = yae.z("");
                rv4Var.o0(P2);
            }
            aw7 aw7Var4 = (aw7) P2;
            if (ikd.a(rv4Var)) {
                rv4Var.e0(-1758223998);
                Object P3 = rv4Var.P();
                if (P3 == lh9Var) {
                    P3 = new pr0(aw7Var4, aw7Var3, 18);
                    rv4Var.o0(P3);
                }
                xt4 xt4Var6 = (xt4) P3;
                int i9 = i8 >> 3;
                int i10 = (i9 & 57344) | (i9 & 896) | (i8 & 14) | 196608 | (i9 & Token.ASSIGN_MOD) | (i9 & 7168);
                aw7Var = aw7Var4;
                aw7Var2 = aw7Var3;
                i(z, xt4Var, xt4Var4, obj, xt4Var6, rv4Var, i10);
                rv4Var.q(false);
                xt4Var5 = xt4Var;
            } else {
                aw7Var = aw7Var4;
                aw7Var2 = aw7Var3;
                rv4Var.e0(-1757874845);
                Object P4 = rv4Var.P();
                if (P4 == lh9Var) {
                    P4 = new pr0(aw7Var, aw7Var2, 19);
                    rv4Var.o0(P4);
                }
                int i11 = i8 >> 3;
                h(z, xt4Var, xt4Var2, xt4Var3, (xt4) P4, rv4Var, (i8 & 14) | 196608 | (i11 & Token.ASSIGN_MOD) | (i11 & 896) | (i11 & 7168) | (i11 & 57344));
                xt4Var5 = xt4Var;
                rv4Var.q(false);
            }
            boolean booleanValue = ((Boolean) aw7Var2.getValue()).booleanValue();
            String str3 = (String) aw7Var.getValue();
            Object P5 = rv4Var.P();
            if (P5 == lh9Var) {
                P5 = new ig7(aw7Var2, 8);
                rv4Var.o0(P5);
            }
            xt4 xt4Var7 = (xt4) P5;
            int i12 = i8 & 7168;
            if (i12 == 2048) {
                z3 = true;
            } else {
                z3 = false;
            }
            int i13 = i8 & Token.ASSIGN_MOD;
            if (i13 == 32) {
                z4 = true;
            } else {
                z4 = false;
            }
            boolean z15 = z3 | z4;
            Object P6 = rv4Var.P();
            if (z15 || P6 == lh9Var) {
                P6 = new vg7(0, xt4Var5, cz7Var, aw7Var2);
                rv4Var.o0(P6);
            }
            lu4 lu4Var = (lu4) P6;
            if (i12 == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (i13 == 32) {
                z6 = true;
            } else {
                z6 = false;
            }
            boolean z16 = z5 | z6;
            Object P7 = rv4Var.P();
            if (z16 || P7 == lh9Var) {
                P7 = new xt4() { // from class: wg7
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj2) {
                        int i14 = r4;
                        pvc pvcVar = pvc.a;
                        aw7 aw7Var5 = aw7Var2;
                        cz7 cz7Var2 = cz7Var;
                        xt4 xt4Var8 = xt4Var5;
                        String str4 = (String) obj2;
                        switch (i14) {
                            case 0:
                                str4.getClass();
                                Boolean bool = Boolean.FALSE;
                                aw7Var5.setValue(bool);
                                xt4Var8.invoke(bool);
                                qre.t(cz7Var2, str4);
                                return pvcVar;
                            case 1:
                                str4.getClass();
                                Boolean bool2 = Boolean.FALSE;
                                aw7Var5.setValue(bool2);
                                xt4Var8.invoke(bool2);
                                eh.s(cz7Var2, str4);
                                return pvcVar;
                            case 2:
                                str4.getClass();
                                Boolean bool3 = Boolean.FALSE;
                                aw7Var5.setValue(bool3);
                                xt4Var8.invoke(bool3);
                                aze.u(cz7Var2, str4);
                                return pvcVar;
                            default:
                                str4.getClass();
                                Boolean bool4 = Boolean.FALSE;
                                aw7Var5.setValue(bool4);
                                xt4Var8.invoke(bool4);
                                qre.s(cz7Var2, str4);
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P7);
            }
            xt4 xt4Var8 = (xt4) P7;
            if (i12 == 2048) {
                z7 = true;
            } else {
                z7 = false;
            }
            if (i13 == 32) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z17 = z7 | z8;
            Object P8 = rv4Var.P();
            if (z17 || P8 == lh9Var) {
                P8 = new xt4() { // from class: wg7
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj2) {
                        int i14 = r4;
                        pvc pvcVar = pvc.a;
                        aw7 aw7Var5 = aw7Var2;
                        cz7 cz7Var2 = cz7Var;
                        xt4 xt4Var82 = xt4Var5;
                        String str4 = (String) obj2;
                        switch (i14) {
                            case 0:
                                str4.getClass();
                                Boolean bool = Boolean.FALSE;
                                aw7Var5.setValue(bool);
                                xt4Var82.invoke(bool);
                                qre.t(cz7Var2, str4);
                                return pvcVar;
                            case 1:
                                str4.getClass();
                                Boolean bool2 = Boolean.FALSE;
                                aw7Var5.setValue(bool2);
                                xt4Var82.invoke(bool2);
                                eh.s(cz7Var2, str4);
                                return pvcVar;
                            case 2:
                                str4.getClass();
                                Boolean bool3 = Boolean.FALSE;
                                aw7Var5.setValue(bool3);
                                xt4Var82.invoke(bool3);
                                aze.u(cz7Var2, str4);
                                return pvcVar;
                            default:
                                str4.getClass();
                                Boolean bool4 = Boolean.FALSE;
                                aw7Var5.setValue(bool4);
                                xt4Var82.invoke(bool4);
                                qre.s(cz7Var2, str4);
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P8);
            }
            xt4 xt4Var9 = (xt4) P8;
            if (i12 == 2048) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (i13 == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z18 = z9 | z10;
            Object P9 = rv4Var.P();
            if (z18 || P9 == lh9Var) {
                P9 = new xt4() { // from class: wg7
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj2) {
                        int i14 = r4;
                        pvc pvcVar = pvc.a;
                        aw7 aw7Var5 = aw7Var2;
                        cz7 cz7Var2 = cz7Var;
                        xt4 xt4Var82 = xt4Var5;
                        String str4 = (String) obj2;
                        switch (i14) {
                            case 0:
                                str4.getClass();
                                Boolean bool = Boolean.FALSE;
                                aw7Var5.setValue(bool);
                                xt4Var82.invoke(bool);
                                qre.t(cz7Var2, str4);
                                return pvcVar;
                            case 1:
                                str4.getClass();
                                Boolean bool2 = Boolean.FALSE;
                                aw7Var5.setValue(bool2);
                                xt4Var82.invoke(bool2);
                                eh.s(cz7Var2, str4);
                                return pvcVar;
                            case 2:
                                str4.getClass();
                                Boolean bool3 = Boolean.FALSE;
                                aw7Var5.setValue(bool3);
                                xt4Var82.invoke(bool3);
                                aze.u(cz7Var2, str4);
                                return pvcVar;
                            default:
                                str4.getClass();
                                Boolean bool4 = Boolean.FALSE;
                                aw7Var5.setValue(bool4);
                                xt4Var82.invoke(bool4);
                                qre.s(cz7Var2, str4);
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P9);
            }
            xt4 xt4Var10 = (xt4) P9;
            if (i12 == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i13 == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z19 = z12 | z11;
            Object P10 = rv4Var.P();
            if (z19 || P10 == lh9Var) {
                P10 = new xt4() { // from class: wg7
                    @Override // defpackage.xt4
                    public final Object invoke(Object obj2) {
                        int i14 = r4;
                        pvc pvcVar = pvc.a;
                        aw7 aw7Var5 = aw7Var2;
                        cz7 cz7Var2 = cz7Var;
                        xt4 xt4Var82 = xt4Var5;
                        String str4 = (String) obj2;
                        switch (i14) {
                            case 0:
                                str4.getClass();
                                Boolean bool = Boolean.FALSE;
                                aw7Var5.setValue(bool);
                                xt4Var82.invoke(bool);
                                qre.t(cz7Var2, str4);
                                return pvcVar;
                            case 1:
                                str4.getClass();
                                Boolean bool2 = Boolean.FALSE;
                                aw7Var5.setValue(bool2);
                                xt4Var82.invoke(bool2);
                                eh.s(cz7Var2, str4);
                                return pvcVar;
                            case 2:
                                str4.getClass();
                                Boolean bool3 = Boolean.FALSE;
                                aw7Var5.setValue(bool3);
                                xt4Var82.invoke(bool3);
                                aze.u(cz7Var2, str4);
                                return pvcVar;
                            default:
                                str4.getClass();
                                Boolean bool4 = Boolean.FALSE;
                                aw7Var5.setValue(bool4);
                                xt4Var82.invoke(bool4);
                                qre.s(cz7Var2, str4);
                                return pvcVar;
                        }
                    }
                };
                rv4Var.o0(P10);
            }
            xt4 xt4Var11 = (xt4) P10;
            if (i12 == 2048) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (i13 == 32) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z20 = z13 | z14;
            Object P11 = rv4Var.P();
            if (z20 || P11 == lh9Var) {
                P11 = new j34(29, xt4Var5, cz7Var);
                rv4Var.o0(P11);
            }
            ube.e(booleanValue, str3, xt4Var7, lu4Var, xt4Var8, xt4Var9, xt4Var10, xt4Var11, (xt4) P11, rv4Var, 384);
            str2 = "";
        } else {
            xt4Var5 = xt4Var;
            rv4Var.X();
            str2 = str;
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new sg1(z, cz7Var, str2, xt4Var5, xt4Var2, xt4Var3, i, 4);
        }
    }

    public static final void g(aw7 aw7Var, boolean z) {
        aw7Var.setValue(Boolean.valueOf(z));
    }

    public static final void h(boolean z, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, rv4 rv4Var, int i) {
        int i2;
        Object obj;
        boolean z2;
        pb2 pb2Var;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        rv4Var.g0(722082155);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i8 = 4;
            } else {
                i8 = 2;
            }
            i2 = i8 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (rv4Var.f("")) {
                i7 = 32;
            } else {
                i7 = 16;
            }
            i2 |= i7;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            obj = xt4Var2;
            if (rv4Var.h(obj)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        } else {
            obj = xt4Var2;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(xt4Var4)) {
                i3 = 131072;
            } else {
                i3 = Parser.ARGC_LIMIT;
            }
            i2 |= i3;
        }
        if ((74899 & i2) != 74898) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            aw7 D = yae.D(xt4Var3, rv4Var);
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                pb2 pb2Var2 = pb2Var;
                a95 a95Var = (a95) ((fdd) voe.z(cm9.a(a95.class), a2.i(), null, pb2Var2, o96.a(rv4Var), null));
                z87.a(z, xt4Var, null, null, kh5.c, zl1.b(0.3f, zl1.b), false, false, null, jce.E(20517837, new tw5(a95Var, obj, xt4Var4, D, xt4Var, jsc.z(a95Var.f, rv4Var)), rv4Var), rv4Var, 805527552 | (i2 & 14) | ((i2 >> 3) & Token.ASSIGN_MOD), 460);
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qg7(z, xt4Var, xt4Var2, xt4Var3, xt4Var4, i, 1);
        }
    }

    public static final void i(boolean z, xt4 xt4Var, xt4 xt4Var2, xt4 xt4Var3, xt4 xt4Var4, rv4 rv4Var, int i) {
        int i2;
        boolean z2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        rv4Var.g0(-1610798409);
        if ((i & 6) == 0) {
            if (rv4Var.g(z)) {
                i7 = 4;
            } else {
                i7 = 2;
            }
            i2 = i7 | i;
        } else {
            i2 = i;
        }
        if ((i & 384) == 0) {
            if (rv4Var.h(xt4Var)) {
                i6 = 256;
            } else {
                i6 = Token.CASE;
            }
            i2 |= i6;
        }
        if ((i & 3072) == 0) {
            if (rv4Var.h(xt4Var2)) {
                i5 = 2048;
            } else {
                i5 = 1024;
            }
            i2 |= i5;
        }
        if ((i & 24576) == 0) {
            if (rv4Var.h(xt4Var3)) {
                i4 = 16384;
            } else {
                i4 = 8192;
            }
            i2 |= i4;
        }
        if ((196608 & i) == 0) {
            if (rv4Var.h(xt4Var4)) {
                i3 = 131072;
            } else {
                i3 = Parser.ARGC_LIMIT;
            }
            i2 |= i3;
        }
        if ((74883 & i2) != 74882) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (rv4Var.U(i2 & 1, z2)) {
            z87.a(z, xt4Var, null, null, null, 0L, false, false, null, jce.E(-1884455787, new g83(xt4Var2, xt4Var4, yae.D(xt4Var3, rv4Var), xt4Var), rv4Var), rv4Var, 805306368 | (i2 & 14) | ((i2 >> 3) & Token.ASSIGN_MOD), 508);
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new qg7(z, xt4Var, xt4Var2, xt4Var3, xt4Var4, i, 0);
        }
    }

    public static final void j(final v8b v8bVar, nq7 nq7Var, final xt4 xt4Var, final xt4 xt4Var2, rv4 rv4Var, int i) {
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        rv4 rv4Var2 = rv4Var;
        rv4Var2.g0(1808479325);
        if (rv4Var2.f(v8bVar)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i5 = i | i2;
        if (rv4Var2.h(xt4Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i6 = i5 | i3;
        if (rv4Var2.h(xt4Var2)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i7 = i6 | i4;
        if ((i7 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var2.U(i7 & 1, z)) {
            if ((i7 & 896) == 256) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i8 = i7 & 14;
            if (i8 != 4) {
                z3 = false;
            } else {
                z3 = true;
            }
            boolean z6 = z2 | z3;
            Object P = rv4Var2.P();
            lh9 lh9Var = ax1.a;
            if (z6 || P == lh9Var) {
                P = new vt4() { // from class: ug7
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i9 = r3;
                        pvc pvcVar = pvc.a;
                        v8b v8bVar2 = v8bVar;
                        xt4 xt4Var3 = xt4Var;
                        switch (i9) {
                            case 0:
                                xt4Var3.invoke(v8bVar2.a);
                                return pvcVar;
                            default:
                                xt4Var3.invoke(v8bVar2.a);
                                return pvcVar;
                        }
                    }
                };
                rv4Var2.o0(P);
            }
            vt4 vt4Var = (vt4) P;
            if ((i7 & 7168) == 2048) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (i8 != 4) {
                z5 = false;
            } else {
                z5 = true;
            }
            boolean z7 = z4 | z5;
            Object P2 = rv4Var2.P();
            if (z7 || P2 == lh9Var) {
                P2 = new vt4() { // from class: ug7
                    @Override // defpackage.vt4
                    public final Object invoke() {
                        int i9 = r3;
                        pvc pvcVar = pvc.a;
                        v8b v8bVar2 = v8bVar;
                        xt4 xt4Var3 = xt4Var2;
                        switch (i9) {
                            case 0:
                                xt4Var3.invoke(v8bVar2.a);
                                return pvcVar;
                            default:
                                xt4Var3.invoke(v8bVar2.a);
                                return pvcVar;
                        }
                    }
                };
                rv4Var2.o0(P2);
            }
            nq7 c2 = q1d.c(6, vt4Var, (vt4) P2, rv4Var2, nq7Var);
            gv9 a2 = ev9.a(lz.a, kh5.G, rv4Var2, 48);
            int hashCode = Long.hashCode(rv4Var2.T);
            xt8 l = rv4Var2.l();
            nq7 p = lye.p(rv4Var2, c2);
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
            nq7 s = pna.s(kq7Var, 30.0f);
            tza tzaVar = j27.a;
            nq7 t = jsc.t(0.6666667f, tte.k(s, ((h27) rv4Var2.j(tzaVar)).c.a), false);
            b37 d2 = fu0.d(kh5.a, false);
            int hashCode2 = Long.hashCode(rv4Var2.T);
            xt8 l2 = rv4Var2.l();
            nq7 p2 = lye.p(rv4Var2, t);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, d2);
            jce.F(npVar2, rv4Var2, l2);
            s21.t(hashCode2, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p2);
            String str = v8bVar.a;
            String str2 = v8bVar.b;
            do5.c(str, str2, v8bVar.c, v8bVar.e, r0f.d, pna.c, rv4Var2, 221184);
            rv4Var2.q(true);
            xbe.i(rv4Var2, pna.s(kq7Var, 12.0f));
            we6 we6Var = new we6(1.0f, true);
            xn1 a3 = wn1.a(lz.c, kh5.J, rv4Var2, 48);
            int hashCode3 = Long.hashCode(rv4Var2.T);
            xt8 l3 = rv4Var2.l();
            nq7 p3 = lye.p(rv4Var2, we6Var);
            rv4Var2.i0();
            if (rv4Var2.S) {
                rv4Var2.k(zx1Var);
            } else {
                rv4Var2.r0();
            }
            jce.F(npVar, rv4Var2, a3);
            jce.F(npVar2, rv4Var2, l3);
            s21.t(hashCode3, rv4Var2, npVar3, rv4Var2, kgVar);
            jce.F(npVar4, rv4Var2, p3);
            cvb.c(str2, pna.f(kq7Var, 1.0f), 0L, null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 2, 0, null, ((h27) rv4Var2.j(tzaVar)).b.k, rv4Var, 48, 24960, 109564);
            rv4Var2 = rv4Var;
            if (v8bVar.d.length() > 0) {
                rv4Var2.e0(-41447340);
                cvb.c(v8bVar.d, pna.f(kq7Var, 1.0f), zl1.b(0.5f, ((h27) rv4Var2.j(tzaVar)).a.o), null, 0L, null, null, null, 0L, null, new tlb(5), 0L, 2, false, 2, 0, null, ((h27) rv4Var2.j(tzaVar)).b.l, rv4Var, 48, 24960, 109560);
                rv4Var2 = rv4Var;
                rv4Var2.q(false);
            } else {
                rv4Var2.e0(-41042325);
                rv4Var2.q(false);
            }
            s21.x(rv4Var2, true, kq7Var, 12.0f, rv4Var2);
            rv4Var2.q(true);
        } else {
            rv4Var2.X();
        }
        ek9 u = rv4Var2.u();
        if (u != null) {
            u.d = new i31(v8bVar, nq7Var, xt4Var, xt4Var2, i, 27);
        }
    }

    public static final void k(int i, vt4 vt4Var, rv4 rv4Var, nq7 nq7Var, cz7 cz7Var, rh8 rh8Var, bkd bkdVar) {
        int i2;
        int i3;
        int i4;
        int i5;
        boolean z;
        pb2 pb2Var;
        pb2 pb2Var2;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        cz7Var.getClass();
        vt4Var.getClass();
        rv4Var.g0(1304420603);
        if (rv4Var.f(cz7Var)) {
            i2 = 4;
        } else {
            i2 = 2;
        }
        int i6 = i | i2;
        if (rv4Var.f(rh8Var)) {
            i3 = 256;
        } else {
            i3 = Token.CASE;
        }
        int i7 = i6 | i3;
        if (rv4Var.f(bkdVar)) {
            i4 = 2048;
        } else {
            i4 = 1024;
        }
        int i8 = i7 | i4;
        if (rv4Var.h(vt4Var)) {
            i5 = 16384;
        } else {
            i5 = 8192;
        }
        int i9 = i8 | i5;
        if ((i9 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (rv4Var.U(i9 & 1, z)) {
            sdd a2 = kv6.a(rv4Var);
            if (a2 != null) {
                if (a2 instanceof y35) {
                    pb2Var = ((y35) a2).f();
                } else {
                    pb2Var = ob2.b;
                }
                tja tjaVar = (tja) ((fdd) voe.z(cm9.a(tja.class), a2.i(), null, pb2Var, o96.a(rv4Var), null));
                sdd sddVar = (sdd) rv4Var.j(idd.b);
                if (sddVar == null) {
                    rv4Var.e0(1368428688);
                    sddVar = kv6.a(rv4Var);
                } else {
                    rv4Var.e0(1368426673);
                }
                rv4Var.q(false);
                if (sddVar != null) {
                    if (sddVar instanceof y35) {
                        pb2Var2 = ((y35) sddVar).f();
                    } else {
                        pb2Var2 = ob2.b;
                    }
                    aw7 z9 = jsc.z(((d1d) ((fdd) voe.z(cm9.a(d1d.class), sddVar.i(), null, pb2Var2, o96.a(rv4Var), null))).f, rv4Var);
                    aw7 z10 = jsc.z(tjaVar.e, rv4Var);
                    Object[] objArr = new Object[0];
                    Object P = rv4Var.P();
                    Object obj = ax1.a;
                    if (P == obj) {
                        P = new mia(6);
                        rv4Var.o0(P);
                    }
                    aw7 aw7Var = (aw7) zpe.k(objArr, (vt4) P, rv4Var, 48);
                    Object[] objArr2 = new Object[0];
                    Object P2 = rv4Var.P();
                    if (P2 == obj) {
                        P2 = new mia(7);
                        rv4Var.o0(P2);
                    }
                    aw7 aw7Var2 = (aw7) zpe.k(objArr2, (vt4) P2, rv4Var, 48);
                    uja ujaVar = (uja) z10.getValue();
                    boolean z11 = ((y0d) z9.getValue()).i;
                    boolean f2 = rv4Var.f(tjaVar);
                    Object P3 = rv4Var.P();
                    if (f2 || P3 == obj) {
                        P3 = new yw7(0, tjaVar, tja.class, "loadMore", "loadMore()V", 0, 29);
                        rv4Var.o0(P3);
                    }
                    i76 i76Var = (i76) P3;
                    int i10 = i9 & 14;
                    if (i10 == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    Object P4 = rv4Var.P();
                    if (z2 || P4 == obj) {
                        P4 = new ar0(cz7Var, 25);
                        rv4Var.o0(P4);
                    }
                    xt4 xt4Var = (xt4) P4;
                    boolean f3 = rv4Var.f(aw7Var2) | rv4Var.f(aw7Var);
                    Object P5 = rv4Var.P();
                    if (f3 || P5 == obj) {
                        P5 = new pr0(aw7Var2, aw7Var, 27);
                        rv4Var.o0(P5);
                    }
                    tl1.k(ujaVar, z11, rh8Var, bkdVar, nq7Var, xt4Var, (xt4) P5, vt4Var, (vt4) i76Var, rv4Var, ((i9 << 9) & 29360128) | (i9 & 8064) | 24576);
                    String str = (String) aw7Var2.getValue();
                    boolean booleanValue = ((Boolean) aw7Var.getValue()).booleanValue();
                    boolean f4 = rv4Var.f(aw7Var);
                    Object P6 = rv4Var.P();
                    if (f4 || P6 == obj) {
                        P6 = new jia(aw7Var, 5);
                        rv4Var.o0(P6);
                    }
                    xt4 xt4Var2 = (xt4) P6;
                    boolean f5 = rv4Var.f(aw7Var);
                    if (i10 == 4) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    boolean z12 = f5 | z3;
                    Object P7 = rv4Var.P();
                    if (z12 || P7 == obj) {
                        P7 = new if3(cz7Var, aw7Var, 7);
                        rv4Var.o0(P7);
                    }
                    lu4 lu4Var = (lu4) P7;
                    boolean f6 = rv4Var.f(aw7Var);
                    if (i10 == 4) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    boolean z13 = f6 | z4;
                    Object P8 = rv4Var.P();
                    if (z13 || P8 == obj) {
                        P8 = new hja(cz7Var, aw7Var, 4);
                        rv4Var.o0(P8);
                    }
                    xt4 xt4Var3 = (xt4) P8;
                    boolean f7 = rv4Var.f(aw7Var);
                    if (i10 == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    boolean z14 = f7 | z5;
                    Object P9 = rv4Var.P();
                    if (z14 || P9 == obj) {
                        P9 = new hja(cz7Var, aw7Var, 5);
                        rv4Var.o0(P9);
                    }
                    xt4 xt4Var4 = (xt4) P9;
                    boolean f8 = rv4Var.f(aw7Var);
                    if (i10 == 4) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    boolean z15 = f8 | z6;
                    Object P10 = rv4Var.P();
                    if (z15 || P10 == obj) {
                        P10 = new hja(cz7Var, aw7Var, 2);
                        rv4Var.o0(P10);
                    }
                    xt4 xt4Var5 = (xt4) P10;
                    boolean f9 = rv4Var.f(aw7Var);
                    if (i10 == 4) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    boolean z16 = f9 | z7;
                    Object P11 = rv4Var.P();
                    if (z16 || P11 == obj) {
                        P11 = new hja(cz7Var, aw7Var, 3);
                        rv4Var.o0(P11);
                    }
                    xt4 xt4Var6 = (xt4) P11;
                    if (i10 == 4) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    Object P12 = rv4Var.P();
                    if (z8 || P12 == obj) {
                        P12 = new ar0(cz7Var, 24);
                        rv4Var.o0(P12);
                    }
                    ube.e(booleanValue, str, xt4Var2, lu4Var, xt4Var3, xt4Var4, xt4Var5, xt4Var6, (xt4) P12, rv4Var, 0);
                } else {
                    vs.k("No ViewModelStoreOwner was provided via LocalRootViewModelStoreOwner or LocalViewModelStoreOwner");
                    return;
                }
            } else {
                vs.k("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
        } else {
            rv4Var.X();
        }
        ek9 u = rv4Var.u();
        if (u != null) {
            u.d = new nf3(cz7Var, nq7Var, rh8Var, bkdVar, vt4Var, i, 7);
        }
    }

    public static final void l(aw7 aw7Var, boolean z) {
        aw7Var.setValue(Boolean.valueOf(z));
    }

    public static final void m(d82 d82Var, CancellationException cancellationException) {
        w26 w26Var = (w26) d82Var.get(r0f.I);
        if (w26Var != null) {
            w26Var.cancel(cancellationException);
        }
    }

    public static final void n(m82 m82Var, CancellationException cancellationException) {
        w26 w26Var = (w26) m82Var.q().get(r0f.I);
        if (w26Var != null) {
            w26Var.cancel(cancellationException);
        } else {
            xk5.p(m82Var, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static final void o(w26 w26Var, String str, Throwable th) {
        w26Var.cancel(nye.b(str, th));
    }

    public static final Object p(lu4 lu4Var, m42 m42Var) {
        r0a r0aVar = new r0a(m42Var, m42Var.getContext());
        return zbe.J(r0aVar, true, r0aVar, lu4Var);
    }

    public static final void q(d82 d82Var) {
        w26 w26Var = (w26) d82Var.get(r0f.I);
        if (w26Var != null && !w26Var.isActive()) {
            throw w26Var.getCancellationException();
        }
    }

    public static final w26 r(d82 d82Var) {
        w26 w26Var = (w26) d82Var.get(r0f.I);
        if (w26Var != null) {
            return w26Var;
        }
        xk5.p(d82Var, "Current context doesn't contain Job in it: ");
        return null;
    }

    public static final byte[] s(int i, ArrayList arrayList) {
        long j = i;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            wq4 wq4Var = (wq4) obj;
            if (j >= wq4Var.a && j < wq4Var.b) {
                return wq4Var.c;
            }
        }
        return null;
    }

    public static final kb3 t(w26 w26Var, boolean z, b36 b36Var) {
        if (w26Var instanceof l36) {
            return ((l36) w26Var).M(z, b36Var);
        }
        return w26Var.invokeOnCompletion(b36Var.q(), z, new mz1(1, b36Var, b36.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0, 27));
    }

    public static final boolean u(d82 d82Var) {
        w26 w26Var = (w26) d82Var.get(r0f.I);
        if (w26Var != null) {
            return w26Var.isActive();
        }
        return true;
    }

    public static final boolean v(m82 m82Var) {
        w26 w26Var = (w26) m82Var.q().get(r0f.I);
        if (w26Var != null) {
            return w26Var.isActive();
        }
        return true;
    }

    public static final ArrayList w(byte[] bArr, byte[] bArr2, long j, int i, boolean z) {
        int i2;
        int i3;
        byte[] D;
        ArrayList arrayList = new ArrayList();
        if (i >= 4 && j >= 0) {
            int i4 = (int) j;
            if (i4 + i <= bArr2.length && (i2 = (i - 4) / 8) > 0) {
                int i5 = ((i2 + 1) * 4) + i4;
                for (int i6 = 0; i6 < i2; i6++) {
                    int i7 = (i6 * 4) + i5;
                    if (i7 + 4 > bArr2.length) {
                        break;
                    }
                    int J = ((int) yae.J(bArr2, i7)) * 512;
                    if (J >= 0 && J + 512 <= bArr.length) {
                        if (z) {
                            int i8 = bArr[J + 511] & 255;
                            if (i8 != 0) {
                                int i9 = i8 + 1;
                                long[] jArr = new long[i9];
                                if (i8 >= 0) {
                                    int i10 = 0;
                                    while (true) {
                                        jArr[i10] = yae.J(bArr, (i10 * 4) + J);
                                        if (i10 == i8) {
                                            break;
                                        }
                                        i10++;
                                    }
                                }
                                int i11 = (i9 * 4) + J;
                                for (int i12 = 0; i12 < i8; i12++) {
                                    int i13 = bArr[(i12 * 13) + i11] & 255;
                                    if (i13 == 0) {
                                        arrayList.add(new wq4(jArr[i12], jArr[i12 + 1], new byte[0]));
                                    } else {
                                        int i14 = (i13 * 2) + J;
                                        int i15 = i14 + 1;
                                        if (i15 <= bArr.length) {
                                            if ((bArr[i14] & 255) == 0) {
                                                D = D(bArr, i14 + 2, (bArr[i15] & 255) * 2);
                                            } else {
                                                D = D(bArr, i15, (i3 * 2) - 1);
                                            }
                                            arrayList.add(new wq4(jArr[i12], jArr[i12 + 1], D));
                                        }
                                    }
                                }
                            }
                        } else {
                            int i16 = bArr[J + 511] & 255;
                            if (i16 != 0) {
                                int i17 = i16 + 1;
                                long[] jArr2 = new long[i17];
                                if (i16 >= 0) {
                                    int i18 = 0;
                                    while (true) {
                                        jArr2[i18] = yae.J(bArr, (i18 * 4) + J);
                                        if (i18 == i16) {
                                            break;
                                        }
                                        i18++;
                                    }
                                }
                                int i19 = (i17 * 4) + J;
                                for (int i20 = 0; i20 < i16; i20++) {
                                    int i21 = bArr[i19 + i20] & 255;
                                    if (i21 == 0) {
                                        arrayList.add(new wq4(jArr2[i20], jArr2[i20 + 1], new byte[0]));
                                    } else {
                                        int i22 = (i21 * 2) + J;
                                        int i23 = i22 + 1;
                                        if (i23 <= bArr.length) {
                                            arrayList.add(new wq4(jArr2[i20], jArr2[i20 + 1], D(bArr, i23, bArr[i22] & 255)));
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x038b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03c9 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x03d2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:194:0x03e9  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x042d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x043c  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x045b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:244:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [int] */
    /* JADX WARN: Type inference failed for: r38v12 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void x(android.view.ViewStructure r41, defpackage.od6 r42, android.view.autofill.AutofillId r43, java.lang.String r44, defpackage.vk9 r45) {
        /*
            Method dump skipped, instructions count: 1122
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k27.x(android.view.ViewStructure, od6, android.view.autofill.AutofillId, java.lang.String, vk9):void");
    }

    public static final e13 y(rv4 rv4Var) {
        Object[] objArr = new Object[0];
        yy9 yy9Var = e13.d;
        Object P = rv4Var.P();
        if (P == ax1.a) {
            P = new qx6(18);
            rv4Var.o0(P);
        }
        return (e13) zpe.m(objArr, yy9Var, (vt4) P, rv4Var, 384);
    }

    public static int z(double d2) {
        if (!Double.isNaN(d2)) {
            if (d2 > 2.147483647E9d) {
                return Integer.MAX_VALUE;
            }
            if (d2 < -2.147483648E9d) {
                return Integer.MIN_VALUE;
            }
            return (int) Math.round(d2);
        }
        vs.m("Cannot round NaN value.");
        return 0;
    }
}
