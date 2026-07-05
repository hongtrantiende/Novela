package defpackage;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: k47  reason: default package */
/* loaded from: classes.dex */
public abstract class k47 extends ei0 {
    public static final byte[] d1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};
    public int A0;
    public ByteBuffer B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public int H0;
    public int I0;
    public int J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public long N0;
    public final Context O;
    public boolean O0;
    public final c47 P;
    public boolean P0;
    public final sz0 Q;
    public boolean Q0;
    public final float R;
    public boolean R0;
    public final cr2 S;
    public pz3 S0;
    public final cr2 T;
    public ar2 T0;
    public final cr2 U;
    public j47 U0;
    public final sj0 V;
    public long V0;
    public final MediaCodec.BufferInfo W;
    public boolean W0;
    public final ArrayDeque X;
    public boolean X0;
    public final p88 Y;
    public boolean Y0;
    public final AtomicInteger Z;
    public long Z0;
    public vq4 a0;
    public uk1 a1;
    public vq4 b0;
    public uk1 b1;
    public mu9 c0;
    public ts5 c1;
    public mu9 d0;
    public l04 e0;
    public MediaCrypto f0;
    public final long g0;
    public float h0;
    public float i0;
    public d47 j0;
    public vq4 k0;
    public MediaFormat l0;
    public boolean m0;
    public float n0;
    public ArrayDeque o0;
    public i47 p0;
    public h47 q0;
    public int r0;
    public boolean s0;
    public boolean t0;
    public boolean u0;
    public boolean v0;
    public long w0;
    public boolean x0;
    public long y0;
    public int z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r3v11, types: [ar2, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [cr2, sj0] */
    /* JADX WARN: Type inference failed for: r3v8, types: [p88, java.lang.Object] */
    public k47(Context context, int i, c47 c47Var, float f) {
        super(i);
        sz0 sz0Var = sz0.f;
        this.O = context.getApplicationContext();
        this.P = c47Var;
        this.Q = sz0Var;
        this.R = f;
        this.Z = new AtomicInteger();
        this.S = new cr2(0);
        this.T = new cr2(0);
        this.U = new cr2(2);
        ?? cr2Var = new cr2(2);
        cr2Var.H = 32;
        this.V = cr2Var;
        this.W = new MediaCodec.BufferInfo();
        this.h0 = 1.0f;
        this.i0 = 1.0f;
        this.g0 = -9223372036854775807L;
        this.X = new ArrayDeque();
        this.U0 = j47.g;
        cr2Var.p(0);
        cr2Var.e.order(ByteOrder.nativeOrder());
        ?? obj = new Object();
        obj.c = y50.a;
        obj.b = 0;
        obj.a = 2;
        this.Y = obj;
        this.n0 = -1.0f;
        this.r0 = 0;
        this.H0 = 0;
        this.z0 = -1;
        this.A0 = -1;
        this.y0 = -9223372036854775807L;
        this.N0 = -9223372036854775807L;
        this.V0 = -9223372036854775807L;
        this.w0 = -9223372036854775807L;
        this.I0 = 0;
        this.J0 = 0;
        this.T0 = new Object();
        this.Y0 = false;
        this.Z0 = 0L;
        int i2 = ts5.c;
        this.c1 = tm9.F;
        uk1 uk1Var = uk1.b;
        this.a1 = uk1Var;
        this.b1 = uk1Var;
    }

    public abstract int A0(sz0 sz0Var, vq4 vq4Var);

    public final boolean B0(vq4 vq4Var) {
        if (this.j0 != null && this.J0 != 3 && this.D != 0) {
            float f = this.i0;
            vq4Var.getClass();
            vq4[] vq4VarArr = this.F;
            vq4VarArr.getClass();
            float Q = Q(f, vq4Var, vq4VarArr);
            float f2 = this.n0;
            if (f2 != Q) {
                if (Q == -1.0f) {
                    if (this.K0) {
                        this.I0 = 1;
                        this.J0 = 3;
                        return false;
                    }
                    o0();
                    Y();
                    return false;
                } else if (f2 != -1.0f || Q > this.R) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", Q);
                    d47 d47Var = this.j0;
                    d47Var.getClass();
                    d47Var.b(bundle);
                    this.n0 = Q;
                }
            }
        }
        return true;
    }

    @Override // defpackage.ei0
    public void C(float f, float f2) {
        this.h0 = f;
        this.i0 = f2;
        B0(this.k0);
    }

    public final void C0() {
        mu9 mu9Var = this.d0;
        mu9Var.getClass();
        mu9Var.q();
        t0(this.d0);
        this.I0 = 0;
        this.J0 = 0;
    }

    @Override // defpackage.ei0
    public final int D(vq4 vq4Var) {
        try {
            return A0(this.Q, vq4Var);
        } catch (m47 e) {
            throw this.g(e, vq4Var, false, 4002);
        }
    }

    public final void D0(long j) {
        vq4 vq4Var = (vq4) this.U0.d.j(j);
        if (vq4Var == null && this.W0 && this.l0 != null) {
            vq4Var = (vq4) this.U0.d.i();
        }
        if (vq4Var != null) {
            this.b0 = vq4Var;
        } else if (!this.m0 || this.b0 == null) {
            return;
        }
        vq4 vq4Var2 = this.b0;
        vq4Var2.getClass();
        g0(vq4Var2, this.l0);
        this.m0 = false;
        this.W0 = false;
    }

    @Override // defpackage.ei0
    public final int E() {
        return 8;
    }

    public final void G(MediaFormat mediaFormat) {
        if (Build.VERSION.SDK_INT >= 29) {
            for (Map.Entry entry : this.a1.a.entrySet()) {
                String str = (String) entry.getKey();
                Object value = entry.getValue();
                if (value == null) {
                    mediaFormat.setString(str, null);
                } else if (value instanceof Integer) {
                    mediaFormat.setInteger(str, ((Integer) value).intValue());
                } else if (value instanceof Long) {
                    mediaFormat.setLong(str, ((Long) value).longValue());
                } else if (value instanceof Float) {
                    mediaFormat.setFloat(str, ((Float) value).floatValue());
                } else if (value instanceof String) {
                    mediaFormat.setString(str, (String) value);
                } else if (value instanceof ByteBuffer) {
                    mediaFormat.setByteBuffer(str, (ByteBuffer) value);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02fe  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean H(long r25, long r27) {
        /*
            Method dump skipped, instructions count: 824
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.H(long, long):boolean");
    }

    public abstract er2 I(h47 h47Var, vq4 vq4Var, vq4 vq4Var2, boolean z);

    public g47 J(IllegalStateException illegalStateException, h47 h47Var) {
        return new g47(illegalStateException, h47Var);
    }

    public final boolean K() {
        if (this.K0) {
            this.I0 = 1;
            this.J0 = 2;
            return true;
        }
        C0();
        return true;
    }

    public final boolean L(long j, long j2) {
        boolean z;
        boolean z2;
        boolean z3;
        d47 d47Var = this.j0;
        d47Var.getClass();
        int i = this.A0;
        MediaCodec.BufferInfo bufferInfo = this.W;
        if (i < 0) {
            int k = d47Var.k(bufferInfo);
            if (k < 0) {
                if (k == -2) {
                    this.M0 = true;
                    d47 d47Var2 = this.j0;
                    d47Var2.getClass();
                    MediaFormat g = d47Var2.g();
                    if (this.r0 != 0 && g.getInteger("width") == 32 && g.getInteger("height") == 32) {
                        this.u0 = true;
                        return true;
                    }
                    if (Build.VERSION.SDK_INT >= 29 && !this.c1.isEmpty()) {
                        uk1 uk1Var = new uk1(uk1.a(g, this.c1).a);
                        if (!uk1Var.equals(this.b1)) {
                            this.b1 = uk1Var;
                            d0(uk1Var);
                        }
                    }
                    this.l0 = g;
                    this.m0 = true;
                    return true;
                }
                if (this.v0 && (this.O0 || this.I0 == 2)) {
                    l0();
                }
                long j3 = this.w0;
                if (j3 != -9223372036854775807L) {
                    this.C.getClass();
                    if (j3 + 100 < System.currentTimeMillis()) {
                        l0();
                        return false;
                    }
                }
                return false;
            }
            bufferInfo.presentationTimeUs -= this.Z0;
            if (this.u0) {
                this.u0 = false;
                d47Var.e(k);
                return true;
            } else if (bufferInfo.size == 0 && (bufferInfo.flags & 4) != 0) {
                l0();
                return false;
            } else {
                this.A0 = k;
                ByteBuffer p = d47Var.p(k);
                this.B0 = p;
                if (p != null) {
                    p.position(bufferInfo.offset);
                    this.B0.limit(bufferInfo.offset + bufferInfo.size);
                }
                D0(bufferInfo.presentationTimeUs);
            }
        }
        if (!this.Y0 && bufferInfo.presentationTimeUs >= this.H) {
            z = false;
        } else {
            z = true;
        }
        long j4 = this.U0.f;
        if (j4 != -9223372036854775807L && j4 <= bufferInfo.presentationTimeUs) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.C0 = z2;
        ByteBuffer byteBuffer = this.B0;
        int i2 = this.A0;
        int i3 = bufferInfo.flags;
        long j5 = bufferInfo.presentationTimeUs;
        vq4 vq4Var = this.b0;
        vq4Var.getClass();
        if (!m0(j, j2, d47Var, byteBuffer, i2, i3, 1, j5, z, z2, vq4Var)) {
            return false;
        }
        i0(bufferInfo.presentationTimeUs);
        if ((bufferInfo.flags & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && this.L0 && this.C0) {
            this.C.getClass();
            this.w0 = System.currentTimeMillis();
        }
        this.A0 = -1;
        this.B0 = null;
        if (!z3) {
            return true;
        }
        l0();
        return false;
    }

    public final boolean M() {
        d47 d47Var = this.j0;
        if (d47Var != null && this.I0 != 2 && !this.O0) {
            int i = this.z0;
            cr2 cr2Var = this.T;
            if (i < 0) {
                int j = d47Var.j();
                this.z0 = j;
                if (j >= 0) {
                    cr2Var.e = d47Var.m(j);
                    cr2Var.n();
                }
            }
            if (this.I0 == 1) {
                if (!this.v0) {
                    this.L0 = true;
                    d47Var.d(this.z0, 0, 4, 0L);
                    this.z0 = -1;
                    cr2Var.e = null;
                }
                this.I0 = 2;
                return false;
            } else if (this.t0) {
                this.t0 = false;
                ByteBuffer byteBuffer = cr2Var.e;
                byteBuffer.getClass();
                byteBuffer.put(d1);
                d47Var.d(this.z0, 38, 0, 0L);
                this.z0 = -1;
                cr2Var.e = null;
                this.K0 = true;
                return true;
            } else {
                if (this.H0 == 1) {
                    int i2 = 0;
                    while (true) {
                        vq4 vq4Var = this.k0;
                        vq4Var.getClass();
                        if (i2 >= vq4Var.r.size()) {
                            break;
                        }
                        ByteBuffer byteBuffer2 = cr2Var.e;
                        byteBuffer2.getClass();
                        byteBuffer2.put((byte[]) this.k0.r.get(i2));
                        i2++;
                    }
                    this.H0 = 2;
                }
                ByteBuffer byteBuffer3 = cr2Var.e;
                byteBuffer3.getClass();
                int position = byteBuffer3.position();
                s6f s6fVar = this.c;
                s6fVar.k();
                try {
                    d47Var.f(new ex2(10, this, s6fVar));
                    int i3 = this.Z.get();
                    if (i3 == -3) {
                        if (l()) {
                            T().f = this.N0;
                            return false;
                        }
                    } else if (i3 == -5) {
                        if (this.H0 == 2) {
                            cr2Var.n();
                            this.H0 = 1;
                        }
                        f0(s6fVar);
                        return true;
                    } else if (cr2Var.h(4)) {
                        T().f = this.N0;
                        if (this.H0 == 2) {
                            cr2Var.n();
                            this.H0 = 1;
                        }
                        this.O0 = true;
                        if (!this.K0) {
                            l0();
                            return false;
                        } else if (!this.v0) {
                            this.L0 = true;
                            d47Var.d(this.z0, 0, 4, 0L);
                            this.z0 = -1;
                            cr2Var.e = null;
                            return false;
                        }
                    } else {
                        if (!this.K0 && !cr2Var.h(1)) {
                            cr2Var.n();
                            if (this.H0 == 2) {
                                this.H0 = 1;
                                return true;
                            }
                        } else {
                            long j2 = cr2Var.C;
                            if (!v0(cr2Var)) {
                                boolean h = cr2Var.h(1073741824);
                                if (h) {
                                    nd2 nd2Var = cr2Var.d;
                                    if (position == 0) {
                                        nd2Var.getClass();
                                    } else {
                                        if (nd2Var.d == null) {
                                            int[] iArr = new int[1];
                                            nd2Var.d = iArr;
                                            nd2Var.i.numBytesOfClearData = iArr;
                                        }
                                        int[] iArr2 = nd2Var.d;
                                        iArr2[0] = iArr2[0] + position;
                                    }
                                }
                                if (this.Q0) {
                                    j47 T = T();
                                    cw cwVar = T.d;
                                    vq4 vq4Var2 = this.a0;
                                    vq4Var2.getClass();
                                    cwVar.a(vq4Var2, j2);
                                    T.e = true;
                                    this.Q0 = false;
                                }
                                this.N0 = Math.max(this.N0, j2);
                                if (l() || cr2Var.h(536870912)) {
                                    T().f = this.N0;
                                }
                                cr2Var.q();
                                if (cr2Var.h(268435456)) {
                                    V(cr2Var);
                                }
                                if (this.Y0) {
                                    long j3 = this.N0;
                                    if (j2 <= j3) {
                                        this.Z0 = (j3 - j2) + 1 + this.Z0;
                                    }
                                    this.N0 = j2;
                                    this.Y0 = false;
                                }
                                k0(cr2Var);
                                int P = P(cr2Var);
                                long j4 = j2 + this.Z0;
                                int i4 = this.z0;
                                if (h) {
                                    d47Var.c(i4, cr2Var.d, j4, P);
                                } else {
                                    ByteBuffer byteBuffer4 = cr2Var.e;
                                    byteBuffer4.getClass();
                                    d47Var.d(i4, byteBuffer4.limit(), P, j4);
                                }
                                this.z0 = -1;
                                cr2Var.e = null;
                                this.K0 = true;
                                this.H0 = 0;
                                this.T0.c++;
                                return true;
                            }
                        }
                        return true;
                    }
                } catch (br2 e) {
                    b0(e);
                    n0(0);
                    N();
                    return true;
                }
            }
        }
        return false;
    }

    public final void N() {
        try {
            d47 d47Var = this.j0;
            d47Var.getClass();
            d47Var.flush();
        } finally {
            r0();
        }
    }

    public final List O(boolean z) {
        vq4 vq4Var = this.a0;
        vq4Var.getClass();
        sz0 sz0Var = this.Q;
        ArrayList R = R(sz0Var, vq4Var, z);
        if (R.isEmpty() && z) {
            ArrayList R2 = R(sz0Var, vq4Var, false);
            if (!R2.isEmpty()) {
                st0.w("MediaCodecRenderer", "Drm session requires secure decoder for " + vq4Var.o + ", but no secure decoder available. Trying to proceed with " + R2 + ".");
            }
            return R2;
        }
        return R;
    }

    public int P(cr2 cr2Var) {
        return 0;
    }

    public abstract float Q(float f, vq4 vq4Var, vq4[] vq4VarArr);

    public abstract ArrayList R(sz0 sz0Var, vq4 vq4Var, boolean z);

    public long S(long j, long j2, boolean z) {
        return super.i(j, j2);
    }

    public final j47 T() {
        ArrayDeque arrayDeque = this.X;
        if (!arrayDeque.isEmpty()) {
            return (j47) arrayDeque.getLast();
        }
        return this.U0;
    }

    public abstract yv U(h47 h47Var, vq4 vq4Var, MediaCrypto mediaCrypto, float f);

    public abstract void V(cr2 cr2Var);

    /* JADX WARN: Removed duplicated region for block: B:58:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void W(defpackage.h47 r13, android.media.MediaCrypto r14) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.W(h47, android.media.MediaCrypto):void");
    }

    public final boolean X(long j, long j2) {
        if (j2 < j) {
            vq4 vq4Var = this.b0;
            if (vq4Var == null || !Objects.equals(vq4Var.o, "audio/opus") || j - j2 > 80000) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0068, code lost:
        if (r2.r() != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y() {
        /*
            r5 = this;
            d47 r0 = r5.j0
            if (r0 != 0) goto La4
            boolean r0 = r5.D0
            if (r0 != 0) goto La4
            vq4 r0 = r5.a0
            if (r0 != 0) goto Le
            goto La4
        Le:
            java.lang.String r1 = r0.o
            mu9 r2 = r5.d0
            r3 = 0
            r4 = 1
            if (r2 != 0) goto L4b
            boolean r2 = r5.z0(r0)
            if (r2 == 0) goto L4b
            r5.D0 = r3
            r5.q0()
            java.lang.String r0 = "audio/mp4a-latm"
            boolean r0 = r0.equals(r1)
            sj0 r2 = r5.V
            if (r0 != 0) goto L41
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            java.lang.String r0 = "audio/opus"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L41
            r2.getClass()
            r2.H = r4
            goto L48
        L41:
            r2.getClass()
            r0 = 32
            r2.H = r0
        L48:
            r5.D0 = r4
            return
        L4b:
            mu9 r2 = r5.d0
            r5.t0(r2)
            mu9 r2 = r5.c0
            if (r2 == 0) goto L6a
            android.media.MediaCrypto r2 = r5.f0
            if (r2 != 0) goto L59
            goto L5a
        L59:
            r4 = r3
        L5a:
            defpackage.wq9.D(r4)
            mu9 r2 = r5.c0
            r2.getClass()
            boolean r4 = defpackage.gt4.a
            al3 r2 = r2.r()
            if (r2 == 0) goto L8e
        L6a:
            mu9 r2 = r5.c0     // Catch: defpackage.i47 -> L7f
            if (r2 == 0) goto L89
            int r2 = r2.v()     // Catch: defpackage.i47 -> L7f
            r4 = 3
            if (r2 == r4) goto L81
            mu9 r2 = r5.c0     // Catch: defpackage.i47 -> L7f
            int r2 = r2.v()     // Catch: defpackage.i47 -> L7f
            r4 = 4
            if (r2 != r4) goto L89
            goto L81
        L7f:
            r1 = move-exception
            goto L9d
        L81:
            mu9 r2 = r5.c0     // Catch: defpackage.i47 -> L7f
            r1.getClass()     // Catch: defpackage.i47 -> L7f
            r2.getClass()     // Catch: defpackage.i47 -> L7f
        L89:
            android.media.MediaCrypto r1 = r5.f0     // Catch: defpackage.i47 -> L7f
            r5.Z(r1, r3)     // Catch: defpackage.i47 -> L7f
        L8e:
            android.media.MediaCrypto r0 = r5.f0
            if (r0 == 0) goto La4
            d47 r1 = r5.j0
            if (r1 != 0) goto La4
            r0.release()
            r0 = 0
            r5.f0 = r0
            return
        L9d:
            r2 = 4001(0xfa1, float:5.607E-42)
            pz3 r5 = r5.g(r1, r0, r3, r2)
            throw r5
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.Y():void");
    }

    public final void Z(MediaCrypto mediaCrypto, boolean z) {
        String str;
        vq4 vq4Var = this.a0;
        vq4Var.getClass();
        if (this.o0 == null) {
            try {
                List O = O(z);
                this.o0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) O;
                if (!arrayList.isEmpty()) {
                    this.o0.add((h47) arrayList.get(0));
                }
                this.p0 = null;
            } catch (m47 e) {
                throw new i47(vq4Var, e, z, -49998);
            }
        }
        if (!this.o0.isEmpty()) {
            ArrayDeque arrayDeque = this.o0;
            arrayDeque.getClass();
            while (this.j0 == null) {
                h47 h47Var = (h47) arrayDeque.peekFirst();
                h47Var.getClass();
                if (!a0(vq4Var) || !x0(h47Var)) {
                    return;
                }
                try {
                    W(h47Var, mediaCrypto);
                } catch (Exception e2) {
                    st0.x("MediaCodecRenderer", "Failed to initialize decoder: " + h47Var, e2);
                    arrayDeque.removeFirst();
                    String str2 = "Decoder init failed: " + h47Var.a + ", " + vq4Var;
                    String str3 = vq4Var.o;
                    if (e2 instanceof MediaCodec.CodecException) {
                        str = ((MediaCodec.CodecException) e2).getDiagnosticInfo();
                    } else {
                        str = null;
                    }
                    i47 i47Var = new i47(str2, e2, str3, z, h47Var, str);
                    b0(i47Var);
                    i47 i47Var2 = this.p0;
                    if (i47Var2 == null) {
                        this.p0 = i47Var;
                    } else {
                        this.p0 = new i47(i47Var2.getMessage(), i47Var2.getCause(), i47Var2.a, i47Var2.b, i47Var2.c, i47Var2.d);
                    }
                    if (arrayDeque.isEmpty()) {
                        throw this.p0;
                    }
                }
            }
            this.o0 = null;
            return;
        }
        throw new i47(vq4Var, null, z, -49999);
    }

    public boolean a0(vq4 vq4Var) {
        return true;
    }

    public abstract void b0(Exception exc);

    public abstract void c0(long j, long j2, String str);

    @Override // defpackage.ei0, defpackage.b09
    public void d(int i, Object obj) {
        int i2;
        if (i != 11) {
            if (i != 21) {
                if (i == 22 && (i2 = Build.VERSION.SDK_INT) >= 29) {
                    obj.getClass();
                    ts5 ts5Var = (ts5) obj;
                    if (!this.c1.equals(ts5Var)) {
                        if (i2 >= 31) {
                            HashSet hashSet = new HashSet(ts5Var);
                            HashSet hashSet2 = new HashSet();
                            jwc it = this.c1.iterator();
                            while (it.hasNext()) {
                                String str = (String) it.next();
                                if (!hashSet.remove(str)) {
                                    hashSet2.add(str);
                                }
                            }
                            d47 d47Var = this.j0;
                            if (d47Var != null) {
                                if (!hashSet2.isEmpty()) {
                                    d47Var.s(new ArrayList(hashSet2));
                                }
                                if (!hashSet.isEmpty()) {
                                    d47Var.q(new ArrayList(hashSet));
                                }
                            }
                        }
                        this.c1 = ts5Var;
                        return;
                    }
                    return;
                }
                return;
            } else if (Build.VERSION.SDK_INT >= 29) {
                obj.getClass();
                uk1 uk1Var = (uk1) obj;
                this.a1 = uk1Var;
                d47 d47Var2 = this.j0;
                if (d47Var2 != null) {
                    Bundle bundle = new Bundle();
                    for (Map.Entry entry : uk1Var.a.entrySet()) {
                        String str2 = (String) entry.getKey();
                        Object value = entry.getValue();
                        if (value != null) {
                            if (value instanceof Integer) {
                                bundle.putInt(str2, ((Integer) value).intValue());
                            } else if (value instanceof Long) {
                                bundle.putLong(str2, ((Long) value).longValue());
                            } else if (value instanceof Float) {
                                bundle.putFloat(str2, ((Float) value).floatValue());
                            } else if (value instanceof String) {
                                bundle.putString(str2, (String) value);
                            } else if (value instanceof ByteBuffer) {
                                ByteBuffer byteBuffer = (ByteBuffer) value;
                                byte[] bArr = new byte[byteBuffer.remaining()];
                                byteBuffer.duplicate().get(bArr);
                                bundle.putByteArray(str2, bArr);
                            }
                        }
                    }
                    d47Var2.b(bundle);
                    return;
                }
                return;
            } else {
                return;
            }
        }
        l04 l04Var = (l04) obj;
        l04Var.getClass();
        this.e0 = l04Var;
    }

    public abstract void d0(uk1 uk1Var);

    public abstract void e0(String str);

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
        if (java.util.Objects.equals(r2, "video/av01") == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.er2 f0(defpackage.s6f r15) {
        /*
            Method dump skipped, instructions count: 356
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.f0(s6f):er2");
    }

    public abstract void g0(vq4 vq4Var, MediaFormat mediaFormat);

    @Override // defpackage.ei0
    public final long i(long j, long j2) {
        return S(j, j2, this.x0);
    }

    public void i0(long j) {
        this.V0 = j;
        while (true) {
            ArrayDeque arrayDeque = this.X;
            if (!arrayDeque.isEmpty() && j >= ((j47) arrayDeque.peek()).a) {
                j47 j47Var = (j47) arrayDeque.poll();
                j47Var.getClass();
                u0(j47Var);
                j0();
            } else {
                return;
            }
        }
    }

    public abstract void j0();

    public final void l0() {
        int i = this.J0;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    this.P0 = true;
                    p0();
                    return;
                }
                o0();
                Y();
                return;
            }
            N();
            C0();
            return;
        }
        N();
    }

    public abstract boolean m0(long j, long j2, d47 d47Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, vq4 vq4Var);

    public final boolean n0(int i) {
        s6f s6fVar = this.c;
        s6fVar.k();
        cr2 cr2Var = this.S;
        cr2Var.n();
        int y = y(s6fVar, cr2Var, i | 4);
        if (y == -5) {
            f0(s6fVar);
            return true;
        } else if (y == -4 && cr2Var.h(4)) {
            this.O0 = true;
            l0();
            return false;
        } else {
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [mu9, android.media.MediaCrypto] */
    public final void o0() {
        try {
            d47 d47Var = this.j0;
            if (d47Var != null) {
                d47Var.a();
                this.T0.b++;
                h47 h47Var = this.q0;
                h47Var.getClass();
                e0(h47Var.a);
            }
            this.j0 = null;
            try {
                MediaCrypto mediaCrypto = this.f0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
            }
        } catch (Throwable th) {
            this.j0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.ei0
    public void p() {
        this.a0 = null;
        u0(j47.g);
        this.X.clear();
        if (this.D0) {
            this.D0 = false;
            q0();
        } else if (this.j0 == null) {
        } else {
            if (y0()) {
                o0();
            } else if (w0()) {
                N();
            } else {
                this.Y0 = true;
            }
        }
    }

    public abstract void p0();

    public final void q0() {
        this.N0 = -9223372036854775807L;
        T().f = -9223372036854775807L;
        this.V0 = -9223372036854775807L;
        this.F0 = false;
        this.V.n();
        this.U.n();
        this.E0 = false;
        p88 p88Var = this.Y;
        p88Var.getClass();
        p88Var.c = y50.a;
        p88Var.b = 0;
        p88Var.a = 2;
    }

    @Override // defpackage.ei0
    public void r(long j, boolean z, boolean z2) {
        ArrayDeque arrayDeque = this.X;
        if (!arrayDeque.isEmpty()) {
            this.U0 = (j47) arrayDeque.getLast();
        }
        arrayDeque.clear();
        if (!z2) {
            return;
        }
        this.O0 = false;
        this.P0 = false;
        this.R0 = false;
        if (this.D0) {
            q0();
        } else if (this.j0 != null) {
            if (y0()) {
                o0();
                Y();
            } else if (w0()) {
                N();
            } else {
                this.Y0 = true;
            }
        }
        if (this.U0.d.n() > 0) {
            this.Q0 = true;
        }
        this.U0.d.c();
        this.U0.e = false;
    }

    public void r0() {
        this.z0 = -1;
        this.T.e = null;
        this.A0 = -1;
        this.B0 = null;
        this.N0 = -9223372036854775807L;
        T().f = -9223372036854775807L;
        this.V0 = -9223372036854775807L;
        this.y0 = -9223372036854775807L;
        this.L0 = false;
        this.w0 = -9223372036854775807L;
        this.K0 = false;
        this.t0 = false;
        this.u0 = false;
        this.C0 = false;
        this.I0 = 0;
        this.J0 = 0;
        this.H0 = this.G0 ? 1 : 0;
        this.Y0 = false;
        this.Z0 = 0L;
    }

    public final void s0() {
        r0();
        this.S0 = null;
        this.o0 = null;
        this.q0 = null;
        this.k0 = null;
        this.l0 = null;
        this.m0 = false;
        this.M0 = false;
        this.n0 = -1.0f;
        this.r0 = 0;
        this.s0 = false;
        this.v0 = false;
        this.x0 = false;
        this.G0 = false;
        this.H0 = 0;
    }

    public final void t0(mu9 mu9Var) {
        mu9 mu9Var2 = this.c0;
        this.c0 = mu9Var;
    }

    public final void u0(j47 j47Var) {
        this.U0 = j47Var;
        if (j47Var.c != -9223372036854775807L) {
            this.W0 = true;
            h0();
        }
    }

    public boolean v0(cr2 cr2Var) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
        if (r4 >= r0) goto L17;
     */
    @Override // defpackage.ei0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void w(defpackage.vq4[] r12, long r13, long r15, defpackage.e67 r17) {
        /*
            r11 = this;
            j47 r12 = r11.U0
            long r0 = r12.c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L24
            j47 r4 = new j47
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.u0(r4)
            boolean r12 = r11.X0
            if (r12 == 0) goto L56
            r11.j0()
            return
        L24:
            java.util.ArrayDeque r12 = r11.X
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L57
            long r0 = r11.N0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L3c
            long r4 = r11.V0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L57
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L57
        L3c:
            j47 r4 = new j47
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r13
            r9 = r15
            r4.<init>(r5, r7, r9)
            r11.u0(r4)
            j47 r12 = r11.U0
            long r12 = r12.c
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 == 0) goto L56
            r11.j0()
        L56:
            return
        L57:
            j47 r0 = new j47
            long r1 = r11.N0
            r3 = r13
            r5 = r15
            r0.<init>(r1, r3, r5)
            r12.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.w(vq4[], long, long, e67):void");
    }

    public boolean w0() {
        return true;
    }

    public boolean x0(h47 h47Var) {
        return true;
    }

    public boolean y0() {
        int i = this.J0;
        if (i == 3 || (this.s0 && !this.M0)) {
            return true;
        }
        if (i == 2) {
            try {
                C0();
                return false;
            } catch (pz3 e) {
                st0.x("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0078 A[LOOP:1: B:31:0x0053->B:41:0x0078, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099 A[LOOP:2: B:42:0x0079->B:52:0x0099, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0079 A[EDGE_INSN: B:86:0x0079->B:90:0x0079 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x009a A[EDGE_INSN: B:88:0x009a->B:53:0x009a ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.ei0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void z(long r12, long r14) {
        /*
            Method dump skipped, instructions count: 275
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k47.z(long, long):void");
    }

    public boolean z0(vq4 vq4Var) {
        return false;
    }

    public void h0() {
    }

    public void k0(cr2 cr2Var) {
    }
}
