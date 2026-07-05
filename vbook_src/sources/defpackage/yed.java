package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: yed  reason: default package */
/* loaded from: classes.dex */
public final class yed extends j1b {
    public ljc n;
    public int o;
    public boolean p;
    public at7 q;
    public l97 r;

    @Override // defpackage.j1b
    public final void a(long j) {
        boolean z;
        this.g = j;
        int i = 0;
        if (j != 0) {
            z = true;
        } else {
            z = false;
        }
        this.p = z;
        at7 at7Var = this.q;
        if (at7Var != null) {
            i = at7Var.e;
        }
        this.o = i;
    }

    @Override // defpackage.j1b
    public final long b(km8 km8Var) {
        int i;
        int i2 = 0;
        byte b = km8Var.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        ljc ljcVar = this.n;
        ljcVar.getClass();
        boolean z = ((nt5[]) ljcVar.e)[(b >> 1) & (255 >>> (8 - ljcVar.a))].b;
        at7 at7Var = (at7) ljcVar.b;
        if (!z) {
            i = at7Var.e;
        } else {
            i = at7Var.f;
        }
        if (this.p) {
            i2 = (this.o + i) / 4;
        }
        long j = i2;
        byte[] bArr = km8Var.a;
        int length = bArr.length;
        int i3 = km8Var.c + 4;
        if (length < i3) {
            byte[] copyOf = Arrays.copyOf(bArr, i3);
            km8Var.K(copyOf, copyOf.length);
        } else {
            km8Var.L(i3);
        }
        byte[] bArr2 = km8Var.a;
        int i4 = km8Var.c;
        bArr2[i4 - 4] = (byte) (j & 255);
        bArr2[i4 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i4 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i4 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    /* JADX WARN: Type inference failed for: r1v48, types: [byte[], java.io.Serializable] */
    /* JADX WARN: Type inference failed for: r8v8, types: [at7, java.lang.Object] */
    @Override // defpackage.j1b
    public final boolean c(km8 km8Var, long j, rwa rwaVar) {
        ljc ljcVar;
        int i;
        int i2;
        long j2;
        if (this.n != null) {
            ((vq4) rwaVar.b).getClass();
            return false;
        }
        at7 at7Var = this.q;
        int i3 = 4;
        int i4 = -1;
        if (at7Var == null) {
            oue.M(1, km8Var, false);
            km8Var.r();
            int z = km8Var.z();
            int r = km8Var.r();
            int o = km8Var.o();
            if (o <= 0) {
                o = -1;
            }
            int o2 = km8Var.o();
            if (o2 > 0) {
                i4 = o2;
            }
            km8Var.o();
            int z2 = km8Var.z();
            int pow = (int) Math.pow(2.0d, (z2 & 240) >> 4);
            km8Var.z();
            ?? copyOf = Arrays.copyOf(km8Var.a, km8Var.c);
            ?? obj = new Object();
            obj.a = z;
            obj.b = r;
            obj.c = o;
            obj.d = i4;
            obj.e = (int) Math.pow(2.0d, z2 & 15);
            obj.f = pow;
            obj.g = copyOf;
            this.q = obj;
        } else {
            l97 l97Var = this.r;
            if (l97Var == null) {
                this.r = oue.I(km8Var, true, true);
            } else {
                int i5 = km8Var.c;
                byte[] bArr = new byte[i5];
                System.arraycopy(km8Var.a, 0, bArr, 0, i5);
                int i6 = at7Var.a;
                int i7 = 5;
                oue.M(5, km8Var, false);
                int z3 = km8Var.z() + 1;
                ea1 ea1Var = new ea1(km8Var.a);
                int i8 = 8;
                ea1Var.o(km8Var.b * 8);
                int i9 = 0;
                while (true) {
                    int i10 = 16;
                    if (i9 < z3) {
                        int i11 = i8;
                        if (ea1Var.g(24) == 5653314) {
                            int g = ea1Var.g(16);
                            int g2 = ea1Var.g(24);
                            if (!ea1Var.f()) {
                                boolean f = ea1Var.f();
                                for (int i12 = 0; i12 < g2; i12++) {
                                    if (f) {
                                        if (ea1Var.f()) {
                                            ea1Var.o(i7);
                                        }
                                    } else {
                                        ea1Var.o(i7);
                                    }
                                }
                            } else {
                                ea1Var.o(i7);
                                int i13 = 0;
                                while (i13 < g2) {
                                    int i14 = 0;
                                    for (int i15 = g2 - i13; i15 > 0; i15 >>>= 1) {
                                        i14++;
                                    }
                                    i13 += ea1Var.g(i14);
                                }
                            }
                            int g3 = ea1Var.g(4);
                            if (g3 <= 2) {
                                if (g3 == 1 || g3 == 2) {
                                    ea1Var.o(32);
                                    ea1Var.o(32);
                                    int g4 = ea1Var.g(4) + 1;
                                    ea1Var.o(1);
                                    if (g3 == 1) {
                                        if (g != 0) {
                                            j2 = (long) Math.floor(Math.pow(g2, 1.0d / g));
                                        } else {
                                            j2 = 0;
                                        }
                                    } else {
                                        j2 = g2 * g;
                                    }
                                    ea1Var.o((int) (j2 * g4));
                                }
                                i9++;
                                i8 = i11;
                                i7 = 5;
                            } else {
                                throw xm8.a(null, "lookup type greater than 2 not decodable: " + g3);
                            }
                        } else {
                            throw xm8.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((ea1Var.d * 8) + ea1Var.e));
                        }
                    } else {
                        int i16 = i8;
                        int i17 = 6;
                        int g5 = ea1Var.g(6) + 1;
                        for (int i18 = 0; i18 < g5; i18++) {
                            if (ea1Var.g(16) != 0) {
                                throw xm8.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i19 = 1;
                        int g6 = ea1Var.g(6) + 1;
                        int i20 = 0;
                        while (true) {
                            int i21 = 3;
                            if (i20 < g6) {
                                int g7 = ea1Var.g(i10);
                                if (g7 != 0) {
                                    if (g7 == i19) {
                                        int g8 = ea1Var.g(5);
                                        int[] iArr = new int[g8];
                                        int i22 = -1;
                                        for (int i23 = 0; i23 < g8; i23++) {
                                            int g9 = ea1Var.g(i3);
                                            iArr[i23] = g9;
                                            if (g9 > i22) {
                                                i22 = g9;
                                            }
                                        }
                                        int i24 = i22 + 1;
                                        int[] iArr2 = new int[i24];
                                        int i25 = 0;
                                        while (i25 < i24) {
                                            iArr2[i25] = ea1Var.g(i21) + 1;
                                            int g10 = ea1Var.g(2);
                                            int i26 = i16;
                                            if (g10 > 0) {
                                                ea1Var.o(i26);
                                            }
                                            int[] iArr3 = iArr2;
                                            int i27 = 0;
                                            for (int i28 = 1; i27 < (i28 << g10); i28 = 1) {
                                                ea1Var.o(i26);
                                                i27++;
                                                i26 = 8;
                                            }
                                            i25++;
                                            iArr2 = iArr3;
                                            i16 = 8;
                                            i21 = 3;
                                        }
                                        int[] iArr4 = iArr2;
                                        ea1Var.o(2);
                                        int g11 = ea1Var.g(4);
                                        int i29 = 0;
                                        int i30 = 0;
                                        for (int i31 = 0; i31 < g8; i31++) {
                                            i29 += iArr4[iArr[i31]];
                                            while (i30 < i29) {
                                                ea1Var.o(g11);
                                                i30++;
                                            }
                                        }
                                    } else {
                                        throw xm8.a(null, "floor type greater than 1 not decodable: " + g7);
                                    }
                                } else {
                                    int i32 = i16;
                                    ea1Var.o(i32);
                                    ea1Var.o(16);
                                    ea1Var.o(16);
                                    ea1Var.o(6);
                                    ea1Var.o(i32);
                                    int g12 = ea1Var.g(4) + 1;
                                    int i33 = 0;
                                    while (i33 < g12) {
                                        ea1Var.o(i32);
                                        i33++;
                                        i32 = 8;
                                    }
                                }
                                i20++;
                                i16 = 8;
                                i17 = 6;
                                i3 = 4;
                                i10 = 16;
                                i19 = 1;
                            } else {
                                int g13 = ea1Var.g(i17) + 1;
                                int i34 = 0;
                                while (i34 < g13) {
                                    if (ea1Var.g(16) <= 2) {
                                        ea1Var.o(24);
                                        ea1Var.o(24);
                                        ea1Var.o(24);
                                        int g14 = ea1Var.g(i17) + 1;
                                        int i35 = 8;
                                        ea1Var.o(8);
                                        int[] iArr5 = new int[g14];
                                        for (int i36 = 0; i36 < g14; i36++) {
                                            int g15 = ea1Var.g(3);
                                            if (ea1Var.f()) {
                                                i2 = ea1Var.g(5);
                                            } else {
                                                i2 = 0;
                                            }
                                            iArr5[i36] = (i2 * 8) + g15;
                                        }
                                        int i37 = 0;
                                        while (i37 < g14) {
                                            int i38 = 0;
                                            while (i38 < i35) {
                                                if ((iArr5[i37] & (1 << i38)) != 0) {
                                                    ea1Var.o(i35);
                                                }
                                                i38++;
                                                i35 = 8;
                                            }
                                            i37++;
                                            i35 = 8;
                                        }
                                        i34++;
                                        i17 = 6;
                                    } else {
                                        throw xm8.a(null, "residueType greater than 2 is not decodable");
                                    }
                                }
                                int g16 = ea1Var.g(i17) + 1;
                                for (int i39 = 0; i39 < g16; i39++) {
                                    int g17 = ea1Var.g(16);
                                    if (g17 != 0) {
                                        st0.h("VorbisUtil", "mapping type other than 0 not supported: " + g17);
                                    } else {
                                        if (ea1Var.f()) {
                                            i = ea1Var.g(4) + 1;
                                        } else {
                                            i = 1;
                                        }
                                        if (ea1Var.f()) {
                                            int g18 = ea1Var.g(8) + 1;
                                            for (int i40 = 0; i40 < g18; i40++) {
                                                int i41 = i6 - 1;
                                                int i42 = 0;
                                                for (int i43 = i41; i43 > 0; i43 >>>= 1) {
                                                    i42++;
                                                }
                                                ea1Var.o(i42);
                                                int i44 = 0;
                                                while (i41 > 0) {
                                                    i44++;
                                                    i41 >>>= 1;
                                                }
                                                ea1Var.o(i44);
                                            }
                                        }
                                        if (ea1Var.g(2) == 0) {
                                            if (i > 1) {
                                                for (int i45 = 0; i45 < i6; i45++) {
                                                    ea1Var.o(4);
                                                }
                                            }
                                            for (int i46 = 0; i46 < i; i46++) {
                                                ea1Var.o(8);
                                                ea1Var.o(8);
                                                ea1Var.o(8);
                                            }
                                        } else {
                                            throw xm8.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                    }
                                }
                                int g19 = ea1Var.g(6);
                                int i47 = g19 + 1;
                                nt5[] nt5VarArr = new nt5[i47];
                                for (int i48 = 0; i48 < i47; i48++) {
                                    boolean f2 = ea1Var.f();
                                    ea1Var.g(16);
                                    ea1Var.g(16);
                                    ea1Var.g(8);
                                    nt5VarArr[i48] = new nt5(5, f2);
                                }
                                if (ea1Var.f()) {
                                    int i49 = 0;
                                    while (g19 > 0) {
                                        i49++;
                                        g19 >>>= 1;
                                    }
                                    ljcVar = new ljc(at7Var, l97Var, bArr, nt5VarArr, i49);
                                } else {
                                    throw xm8.a(null, "framing bit after modes not set as expected");
                                }
                            }
                        }
                    }
                }
            }
        }
        ljcVar = null;
        this.n = ljcVar;
        if (ljcVar == null) {
            return true;
        }
        at7 at7Var2 = (at7) ljcVar.b;
        ArrayList arrayList = new ArrayList();
        arrayList.add((byte[]) at7Var2.g);
        arrayList.add((byte[]) ljcVar.d);
        tb7 H = oue.H(qs5.m((String[]) ((l97) ljcVar.c).a));
        uq4 uq4Var = new uq4();
        uq4Var.m = lc7.p("audio/ogg");
        uq4Var.n = lc7.p("audio/vorbis");
        uq4Var.h = at7Var2.d;
        uq4Var.i = at7Var2.c;
        uq4Var.F = at7Var2.a;
        uq4Var.G = at7Var2.b;
        uq4Var.q = arrayList;
        uq4Var.k = H;
        rwaVar.b = new vq4(uq4Var);
        return true;
    }

    @Override // defpackage.j1b
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
