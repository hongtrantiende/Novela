package defpackage;

import android.util.Pair;
import android.util.SparseArray;
import java.math.RoundingMode;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: us4  reason: default package */
/* loaded from: classes.dex */
public final class us4 implements r94 {
    public static final byte[] O = {-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    public static final vq4 P;
    public long A;
    public long B;
    public ts4 C;
    public int D;
    public int E;
    public int F;
    public boolean G;
    public boolean H;
    public t94 I;
    public fjc[] J;
    public fjc[] K;
    public boolean L;
    public boolean M;
    public long N;
    public final m8b a;
    public final int b;
    public final List c;
    public final byte[] h;
    public final km8 i;
    public final lac j;
    public final t6f o;
    public final fjc p;
    public final uwd q;
    public mm9 r;
    public int s;
    public int t;
    public long u;
    public int v;
    public km8 w;
    public long x;
    public int y;
    public long z;
    public final s6f k = new s6f(22);
    public final km8 l = new km8(16);
    public final km8 e = new km8(dae.i);
    public final km8 f = new km8(6);
    public final km8 g = new km8();
    public final ArrayDeque m = new ArrayDeque();
    public final ArrayDeque n = new ArrayDeque();
    public final SparseArray d = new SparseArray();

    static {
        uq4 uq4Var = new uq4();
        uq4Var.n = lc7.p("application/x-emsg");
        P = new vq4(uq4Var);
    }

    public us4(m8b m8bVar, int i, lac lacVar, List list, xz8 xz8Var) {
        this.a = m8bVar;
        this.b = i;
        this.j = lacVar;
        this.c = Collections.unmodifiableList(list);
        this.p = xz8Var;
        byte[] bArr = new byte[16];
        this.h = bArr;
        this.i = new km8(bArr);
        ms5 ms5Var = qs5.b;
        this.r = mm9.e;
        this.A = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.I = t94.m;
        this.J = new fjc[0];
        this.K = new fjc[0];
        this.o = new t6f(new q6(this, 21));
        this.q = new uwd(10);
        this.N = -1L;
    }

    public static int g(int i) {
        int i2;
        if ((i & 1) != 0) {
            i2 = 64;
        } else {
            i2 = 0;
        }
        if ((i & 2) != 0) {
            return i2 | Token.CASE;
        }
        return i2;
    }

    public static zk3 i(List list) {
        UUID uuid;
        int size = list.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ts7 ts7Var = (ts7) list.get(i);
            if (ts7Var.b == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = ts7Var.c.a;
                fz4 j0 = hbe.j0(bArr);
                if (j0 == null) {
                    uuid = null;
                } else {
                    uuid = (UUID) j0.a;
                }
                if (uuid == null) {
                    st0.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList.add(new yk3(uuid, null, "video/mp4", bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new zk3(null, false, (yk3[]) arrayList.toArray(new yk3[0]));
    }

    public static void j(km8 km8Var, int i, zic zicVar) {
        boolean z;
        km8Var.M(i + 8);
        int m = km8Var.m();
        byte[] bArr = nu0.a;
        if ((m & 1) == 0) {
            if ((m & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            int D = km8Var.D();
            if (D == 0) {
                Arrays.fill(zicVar.l, 0, zicVar.e, false);
                return;
            }
            int i2 = zicVar.e;
            km8 km8Var2 = zicVar.n;
            if (D == i2) {
                Arrays.fill(zicVar.l, 0, D, z);
                km8Var2.J(km8Var.a());
                zicVar.k = true;
                zicVar.o = true;
                km8Var.k(km8Var2.a, 0, km8Var2.c);
                km8Var2.M(0);
                zicVar.o = false;
                return;
            }
            StringBuilder s = hl5.s("Senc sample count ", " is different from fragment sample count", D);
            s.append(zicVar.e);
            throw xm8.a(null, s.toString());
        }
        throw xm8.c("Overriding TrackEncryptionBox parameters is unsupported.");
    }

    public static Pair k(long j, km8 km8Var) {
        long F;
        long F2;
        km8 km8Var2 = km8Var;
        km8Var2.M(8);
        int e = nu0.e(km8Var2.m());
        km8Var2.N(4);
        long B = km8Var2.B();
        if (e == 0) {
            F = km8Var2.B();
            F2 = km8Var2.B();
        } else {
            F = km8Var2.F();
            F2 = km8Var2.F();
        }
        long j2 = F2 + j;
        String str = a2d.a;
        long Y = a2d.Y(F, 1000000L, B, RoundingMode.DOWN);
        km8Var2.N(2);
        int G = km8Var2.G();
        int[] iArr = new int[G];
        long[] jArr = new long[G];
        long[] jArr2 = new long[G];
        long[] jArr3 = new long[G];
        long j3 = j2;
        long j4 = Y;
        int i = 0;
        while (i < G) {
            int m = km8Var2.m();
            if ((Integer.MIN_VALUE & m) == 0) {
                long B2 = km8Var2.B();
                iArr[i] = m & Integer.MAX_VALUE;
                jArr[i] = j3;
                jArr3[i] = j4;
                F += B2;
                long[] jArr4 = jArr2;
                long[] jArr5 = jArr3;
                long Y2 = a2d.Y(F, 1000000L, B, RoundingMode.DOWN);
                jArr4[i] = Y2 - jArr5[i];
                km8Var2.N(4);
                j3 += iArr[i];
                i++;
                G = G;
                km8Var2 = km8Var;
                j4 = Y2;
                jArr2 = jArr4;
                jArr3 = jArr5;
            } else {
                throw xm8.a(null, "Unhandled indirect reference");
            }
        }
        return Pair.create(Long.valueOf(Y), new jh1(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e3, code lost:
        if (r32.E >= r32.D) goto L483;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01e5, code lost:
        r2 = r32.F;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x01e7, code lost:
        if (r2 != 0) goto L466;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x01ec, code lost:
        if (r32.K.length > 0) goto L463;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01f0, code lost:
        if (r32.G != false) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01f2, code lost:
        r2 = defpackage.dae.u(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0202, code lost:
        if ((r22 + r2) > (r32.D - r32.E)) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0204, code lost:
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x0207, code lost:
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0208, code lost:
        r33.readFully(r15, r6, r22 + r2);
        r9.M(0);
        r19 = r9.m();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0215, code lost:
        if (r19 < 0) goto L460;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0217, code lost:
        r32.F = r19 - r2;
        r4 = r32.e;
        r26 = r6;
        r4.M(0);
        r5.e(4, r4);
        r32.E += 4;
        r32.D += r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0235, code lost:
        if (r32.K.length <= 0) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0237, code lost:
        if (r2 <= 0) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0239, code lost:
        r4 = defpackage.dae.p(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x023d, code lost:
        if (r4 != null) goto L429;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0244, code lost:
        switch(r4.hashCode()) {
            case -1662541442: goto L456;
            case 1331836730: goto L453;
            case 1331856911: goto L450;
            default: goto L431;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x0247, code lost:
        r4 = 65535;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x024f, code lost:
        if (r4.equals("video/vvc") != false) goto L452;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0252, code lost:
        r4 = r20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0259, code lost:
        if (r4.equals("video/avc") != false) goto L455;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x025c, code lost:
        r4 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0262, code lost:
        if (r4.equals("video/hevc") != false) goto L458;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x0265, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0266, code lost:
        switch(r4) {
            case 0: goto L448;
            case 1: goto L446;
            case 2: goto L433;
            default: goto L459;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0275, code lost:
        if (((r15[5] & 248) >> 3) != 23) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x0280, code lost:
        if ((r15[4] & 31) != 6) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0290, code lost:
        if (((r15[4] & 126) >> 1) != 39) goto L459;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0292, code lost:
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0294, code lost:
        r4 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0295, code lost:
        r32.H = r4;
        r5.e(r2, r9);
        r32.E += r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x029f, code lost:
        if (r2 <= 0) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x02a3, code lost:
        if (r32.G != false) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x02a9, code lost:
        if (defpackage.dae.s(r15, r2, r8) == false) goto L443;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x02ab, code lost:
        r32.G = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x02ae, code lost:
        r4 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x02b0, code lost:
        r6 = r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x02bb, code lost:
        throw defpackage.xm8.a(null, "Invalid NAL length");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x02bc, code lost:
        r26 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x02c0, code lost:
        if (r32.H == false) goto L482;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x02c2, code lost:
        r4 = r32.g;
        r4.J(r2);
        r25 = r9;
        r33.readFully(r4.a, 0, r32.F);
        r5.e(r32.F, r4);
        r2 = r32.F;
        r2 = defpackage.dae.I(r4.a, r4.c);
        r4.M(0);
        r4.L(r2);
        r2 = r8.q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x02eb, code lost:
        if (r2 != (-1)) goto L479;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x02ef, code lost:
        if (r7.b == 0) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x02f1, code lost:
        r7.m(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x02f7, code lost:
        if (r7.b == r2) goto L473;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02f9, code lost:
        r7.m(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x02fc, code lost:
        r7.a(r12, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0306, code lost:
        if ((r17.a() & 4) == 0) goto L476;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0308, code lost:
        r7.c(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x030b, code lost:
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x030e, code lost:
        r25 = r9;
        r2 = r5.f(r33, r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0316, code lost:
        r32.E += r2;
        r32.F -= r2;
        r4 = r22;
        r9 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0325, code lost:
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0327, code lost:
        r2 = r32.E;
        r4 = r32.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:175:0x032b, code lost:
        if (r2 >= r4) goto L515;
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x032d, code lost:
        r32.E += r5.f(r33, r4 - r2, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:177:0x0339, code lost:
        r1 = r17.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:178:0x033f, code lost:
        if (r32.G != false) goto L487;
     */
    /* JADX WARN: Code restructure failed: missing block: B:179:0x0341, code lost:
        r1 = r1 | 67108864;
     */
    /* JADX WARN: Code restructure failed: missing block: B:180:0x0344, code lost:
        r28 = r1;
        r1 = r17.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:181:0x034a, code lost:
        if (r1 == null) goto L510;
     */
    /* JADX WARN: Code restructure failed: missing block: B:182:0x034c, code lost:
        r31 = r1.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:183:0x0351, code lost:
        r31 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:184:0x0353, code lost:
        r26 = r12;
        r5.a(r26, r28, r32.D, 0, r31);
     */
    /* JADX WARN: Code restructure failed: missing block: B:186:0x0364, code lost:
        if (r3.isEmpty() != false) goto L504;
     */
    /* JADX WARN: Code restructure failed: missing block: B:187:0x0366, code lost:
        r1 = (defpackage.ss4) r3.removeFirst();
        r32.y -= r1.c;
        r4 = r1.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:188:0x0377, code lost:
        if (r1.b == false) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:189:0x0379, code lost:
        r4 = r4 + r26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:190:0x037b, code lost:
        if (r14 == null) goto L498;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x037d, code lost:
        r4 = r14.a(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:192:0x0381, code lost:
        r7 = r4;
        r2 = r32.J;
        r4 = r2.length;
        r5 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:193:0x0386, code lost:
        if (r5 >= r4) goto L503;
     */
    /* JADX WARN: Code restructure failed: missing block: B:194:0x0388, code lost:
        r2[r5].a(r7, 1, r1.c, r32.y, null);
        r5 = r5 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x039a, code lost:
        if (r17.c() != false) goto L508;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x039c, code lost:
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:198:0x039f, code lost:
        r32.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x03a4, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x0672, code lost:
        throw defpackage.xm8.c("Atom size less than header length (unsupported).");
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00ce, code lost:
        r5 = r2.a;
        r6 = r2.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00db, code lost:
        if (r32.s != 3) goto L404;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00df, code lost:
        if (r2.m != false) goto L403;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00e1, code lost:
        r9 = r2.d.d[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ea, code lost:
        r9 = r6.h[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f0, code lost:
        r32.D = r9;
        r9 = r2.d.a.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fe, code lost:
        if (java.util.Objects.equals(r9.o, "video/avc") == false) goto L399;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0102, code lost:
        if ((r4 & 64) == 0) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0104, code lost:
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0107, code lost:
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0110, code lost:
        if (java.util.Objects.equals(r9.o, "video/hevc") == false) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0114, code lost:
        if ((r4 & org.mozilla.javascript.Token.CASE) == 0) goto L398;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0117, code lost:
        r32.G = r4 ^ 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011f, code lost:
        if (r2.f >= r2.i) goto L390;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0121, code lost:
        r33.q(r32.D);
        r1 = r2.b();
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x012a, code lost:
        if (r1 != null) goto L377;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x012d, code lost:
        r3 = r6.n;
        r1 = r1.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0131, code lost:
        if (r1 == 0) goto L380;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0133, code lost:
        r3.N(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0136, code lost:
        r1 = r2.f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x013a, code lost:
        if (r6.k == false) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0140, code lost:
        if (r6.l[r1] == false) goto L385;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0142, code lost:
        r3.N(r3.G() * 6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x014e, code lost:
        if (r2.c() != false) goto L388;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0150, code lost:
        r32.C = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0153, code lost:
        r32.s = 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0156, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015f, code lost:
        if (r2.d.a.h != r21) goto L393;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0161, code lost:
        r32.D -= 8;
        r33.q(r22);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x016c, code lost:
        r4 = "audio/ac4".equals(r2.d.a.g.o);
        r9 = r32.D;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017c, code lost:
        if (r4 == false) goto L397;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x017e, code lost:
        r32.E = r2.d(r9, 7);
        defpackage.st0.k(r32.D, r8);
        r5.e(7, r8);
        r32.E += 7;
        r4 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0195, code lost:
        r4 = 0;
        r32.E = r2.d(r9, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x019d, code lost:
        r32.D += r32.E;
        r32.s = 4;
        r32.F = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01a8, code lost:
        r4 = r2.d;
        r8 = r4.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x01ae, code lost:
        if (r2.m != false) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b0, code lost:
        r15 = r4.f[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01b6, code lost:
        r12 = r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x01b8, code lost:
        r15 = r6.i[r2.f];
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x01bf, code lost:
        if (r14 == null) goto L410;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01c1, code lost:
        r12 = r14.a(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x01c5, code lost:
        r4 = r8.k;
        r8 = r8.g;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01c9, code lost:
        if (r4 == 0) goto L511;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01cb, code lost:
        r9 = r32.f;
        r15 = r9.a;
        r15[0] = 0;
        r15[1] = 0;
        r15[r20] = 0;
        r6 = 4 - r4;
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01dd, code lost:
        r22 = r4;
     */
    @Override // defpackage.r94
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(defpackage.s94 r33, defpackage.fr2 r34) {
        /*
            Method dump skipped, instructions count: 2180
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us4.b(s94, fr2):int");
    }

    @Override // defpackage.r94
    public final boolean c(s94 s94Var) {
        mm9 mm9Var;
        ura t = cwe.t(s94Var, true, false);
        if (t != null) {
            mm9Var = qs5.r(t);
        } else {
            ms5 ms5Var = qs5.b;
            mm9Var = mm9.e;
        }
        this.r = mm9Var;
        if (t == null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.r94
    public final void d(long j, long j2) {
        SparseArray sparseArray = this.d;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            ((ts4) sparseArray.valueAt(i)).e();
        }
        this.n.clear();
        this.y = 0;
        ((PriorityQueue) this.o.f).clear();
        this.z = j2;
        this.m.clear();
        h();
    }

    @Override // defpackage.r94
    public final List e() {
        return this.r;
    }

    @Override // defpackage.r94
    public final void f(t94 t94Var) {
        int i;
        int i2 = this.b;
        if ((i2 & 32) == 0) {
            t94Var = new o40(t94Var, this.a);
        }
        this.I = t94Var;
        h();
        fjc[] fjcVarArr = new fjc[2];
        this.J = fjcVarArr;
        int i3 = 0;
        fjc fjcVar = this.p;
        if (fjcVar != null) {
            fjcVarArr[0] = fjcVar;
            i = 1;
        } else {
            i = 0;
        }
        int i4 = 100;
        if ((i2 & 4) != 0) {
            fjcVarArr[i] = this.I.s(100, 5);
            i4 = 101;
            i++;
        }
        fjc[] fjcVarArr2 = (fjc[]) a2d.S(i, this.J);
        this.J = fjcVarArr2;
        for (fjc fjcVar2 : fjcVarArr2) {
            fjcVar2.g(P);
        }
        List list = this.c;
        this.K = new fjc[list.size()];
        while (i3 < this.K.length) {
            fjc s = this.I.s(i4, 3);
            s.g((vq4) list.get(i3));
            this.K[i3] = s;
            i3++;
            i4++;
        }
    }

    public final void h() {
        this.s = 0;
        this.v = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:162:0x0435, code lost:
        if ((defpackage.a2d.Y(r40, 1000000, r7, r46) + defpackage.a2d.Y(r7[0], 1000000, r2.c, r46)) >= r2.e) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:345:0x0804, code lost:
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:346:0x0807, code lost:
        return;
     */
    /* JADX WARN: Removed duplicated region for block: B:308:0x071a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(long r56) {
        /*
            Method dump skipped, instructions count: 2056
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.us4.l(long):void");
    }

    @Override // defpackage.r94
    public final void a() {
    }
}
