package defpackage;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: e47  reason: default package */
/* loaded from: classes.dex */
public final class e47 extends k47 implements b47 {
    public final Context e1;
    public final b60 f1;
    public final vs2 g1;
    public final kz6 h1;
    public int i1;
    public boolean j1;
    public vq4 k1;
    public vq4 l1;
    public long m1;
    public boolean n1;
    public boolean o1;
    public boolean p1;
    public boolean q1;
    public int r1;
    public boolean s1;
    public long t1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e47(Context context, c47 c47Var, Handler handler, c04 c04Var, vs2 vs2Var) {
        super(context.getApplicationContext(), 1, c47Var, 44100.0f);
        kz6 kz6Var;
        if (Build.VERSION.SDK_INT >= 35) {
            kz6Var = new kz6();
        } else {
            kz6Var = null;
        }
        this.e1 = context.getApplicationContext();
        this.g1 = vs2Var;
        this.h1 = kz6Var;
        this.r1 = -1000;
        this.f1 = new b60(handler, c04Var, 0);
        this.t1 = -9223372036854775807L;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
        if (r7 != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
    @Override // defpackage.k47
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int A0(defpackage.sz0 r19, defpackage.vq4 r20) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e47.A0(sz0, vq4):int");
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [i50, java.lang.Object] */
    public final int E0(vq4 vq4Var) {
        j50 a;
        int i;
        vs2 vs2Var = this.g1;
        if (vs2Var.X) {
            a = j50.d;
        } else {
            o50 b = ((r60) vs2Var.r).b(vs2Var.g(vq4Var));
            ?? obj = new Object();
            obj.a = b.a;
            obj.b = b.b;
            obj.c = b.c;
            a = obj.a();
        }
        if (!a.a) {
            return 0;
        }
        if (a.b) {
            i = 1536;
        } else {
            i = 512;
        }
        if (a.c) {
            return i | 2048;
        }
        return i;
    }

    public final void F0() {
        long j;
        long j2;
        long j3;
        ksa ksaVar;
        m();
        vs2 vs2Var = this.g1;
        ij1 ij1Var = vs2Var.b;
        if (!vs2Var.n() || vs2Var.F) {
            j = Long.MIN_VALUE;
            j2 = Long.MIN_VALUE;
        } else {
            long min = Math.min(vs2Var.t.a(), a2d.W(vs2Var.p.e.b, vs2Var.j()));
            ArrayDeque arrayDeque = vs2Var.h;
            while (!arrayDeque.isEmpty() && min >= ((ts2) arrayDeque.getFirst()).c) {
                vs2Var.w = (ts2) arrayDeque.remove();
            }
            ts2 ts2Var = vs2Var.w;
            long j4 = min - ts2Var.c;
            long A = a2d.A(ts2Var.a.a, j4);
            if (arrayDeque.isEmpty()) {
                lsa lsaVar = (lsa) ij1Var.d;
                if (lsaVar.isActive()) {
                    if (lsaVar.n >= 1024) {
                        long j5 = lsaVar.m;
                        lsaVar.j.getClass();
                        long o = j5 - (ksaVar.i.o() * (ksaVar.j * ksaVar.b));
                        int i = lsaVar.h.a;
                        int i2 = lsaVar.g.a;
                        j = Long.MIN_VALUE;
                        long j6 = lsaVar.n;
                        if (i == i2) {
                            j4 = a2d.Y(j4, o, j6, RoundingMode.DOWN);
                        } else {
                            j4 = a2d.Y(j4, o * i, j6 * i2, RoundingMode.DOWN);
                        }
                    } else {
                        j = Long.MIN_VALUE;
                        j4 = (long) (lsaVar.c * j4);
                    }
                } else {
                    j = Long.MIN_VALUE;
                }
                ts2 ts2Var2 = vs2Var.w;
                j3 = ts2Var2.b + j4;
                ts2Var2.d = j4 - A;
            } else {
                j = Long.MIN_VALUE;
                ts2 ts2Var3 = vs2Var.w;
                j3 = ts2Var3.b + A + ts2Var3.d;
            }
            long j7 = ((ila) ij1Var.c).q;
            j2 = a2d.W(vs2Var.p.e.b, j7) + j3;
            long j8 = vs2Var.Z;
            if (j7 > j8) {
                long W = a2d.W(vs2Var.p.e.b, j7 - j8);
                vs2Var.Z = j7;
                vs2Var.a0 += W;
                if (vs2Var.b0 == null) {
                    vs2Var.b0 = new Handler(Looper.myLooper());
                }
                vs2Var.b0.removeCallbacksAndMessages(null);
                vs2Var.b0.postDelayed(new x0(vs2Var, 15), 100L);
            }
        }
        if (j2 != j) {
            if (!this.n1) {
                j2 = Math.max(this.m1, j2);
            }
            this.m1 = j2;
            this.n1 = false;
        }
    }

    @Override // defpackage.k47
    public final er2 I(h47 h47Var, vq4 vq4Var, vq4 vq4Var2, boolean z) {
        int i;
        er2 b = h47Var.b(vq4Var, vq4Var2);
        int i2 = b.e;
        if (this.d0 == null && z0(vq4Var2)) {
            i2 |= 32768;
        }
        "OMX.google.raw.decoder".equals(h47Var.a);
        if (vq4Var2.p > this.i1) {
            i2 |= 64;
        }
        int i3 = i2;
        String str = h47Var.a;
        if (i3 != 0) {
            i = 0;
        } else {
            i = b.d;
        }
        return new er2(str, vq4Var, vq4Var2, i, i3);
    }

    @Override // defpackage.k47
    public final float Q(float f, vq4 vq4Var, vq4[] vq4VarArr) {
        int i = -1;
        for (vq4 vq4Var2 : vq4VarArr) {
            int i2 = vq4Var2.H;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return i * f;
    }

    @Override // defpackage.k47
    public final ArrayList R(sz0 sz0Var, vq4 vq4Var, boolean z) {
        mm9 g;
        h47 h47Var;
        if (vq4Var.o == null) {
            g = mm9.e;
        } else {
            if (this.g1.h(vq4Var) != 0) {
                List e = o47.e("audio/raw", false, false);
                if (e.isEmpty()) {
                    h47Var = null;
                } else {
                    h47Var = (h47) e.get(0);
                }
                if (h47Var != null) {
                    g = qs5.r(h47Var);
                }
            }
            g = o47.g(sz0Var, vq4Var, z, false);
        }
        HashMap hashMap = o47.a;
        ArrayList arrayList = new ArrayList(g);
        Collections.sort(arrayList, new oo1(new iu1(7, this.e1, vq4Var), 4));
        return arrayList;
    }

    @Override // defpackage.k47
    public final long S(long j, long j2, boolean z) {
        boolean z2;
        long Y;
        float f;
        vs2 vs2Var = this.g1;
        boolean z3 = false;
        if (vs2Var.l() && this.t1 != -9223372036854775807L) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!this.s1) {
            if (z2 || this.P0) {
                return 1000000L;
            }
        } else {
            if (!vs2Var.n()) {
                Y = -9223372036854775807L;
            } else if (ss2.a(vs2Var.p)) {
                Y = a2d.W(vs2Var.p.e.b, vs2Var.t.a.getBufferSizeInFrames());
            } else {
                long bufferSizeInFrames = vs2Var.t.a.getBufferSizeInFrames();
                int o = hif.o(vs2Var.p.e.a);
                if (o != -2147483647) {
                    z3 = true;
                }
                wq9.D(z3);
                Y = a2d.Y(bufferSizeInFrames, 1000000L, o, RoundingMode.DOWN);
            }
            if (this.q1 && z2 && Y != -9223372036854775807L) {
                float min = (float) Math.min(Y, this.t1 - j);
                my8 my8Var = vs2Var.x;
                if (my8Var != null) {
                    f = my8Var.a;
                } else {
                    f = 1.0f;
                }
                return Math.max(10000L, (min / f) / 2.0f);
            }
        }
        return 10000L;
    }

    @Override // defpackage.k47
    public final yv U(h47 h47Var, vq4 vq4Var, MediaCrypto mediaCrypto, float f) {
        boolean z;
        r40 r40Var;
        int i;
        int i2;
        vq4[] vq4VarArr = this.F;
        vq4VarArr.getClass();
        String str = h47Var.a;
        "OMX.google.raw.decoder".equals(str);
        int i3 = vq4Var.p;
        String str2 = vq4Var.o;
        int i4 = vq4Var.G;
        int i5 = 0;
        if (vq4VarArr.length != 1) {
            for (vq4 vq4Var2 : vq4VarArr) {
                if (h47Var.b(vq4Var, vq4Var2).d != 0) {
                    "OMX.google.raw.decoder".equals(str);
                    i3 = Math.max(i3, vq4Var2.p);
                }
            }
        }
        this.i1 = i3;
        if (!str.equals("OMX.google.opus.decoder") && !str.equals("c2.android.opus.decoder") && !str.equals("OMX.google.vorbis.decoder") && !str.equals("c2.android.vorbis.decoder")) {
            z = false;
        } else {
            z = true;
        }
        this.j1 = z;
        String str3 = h47Var.c;
        int i6 = this.i1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        mediaFormat.setInteger("channel-count", i4);
        int i7 = vq4Var.H;
        mediaFormat.setInteger("sample-rate", i7);
        h9a.S(mediaFormat, vq4Var.r);
        h9a.P(mediaFormat, "max-input-size", i6);
        mediaFormat.setInteger("priority", 0);
        if (f != -1.0f) {
            mediaFormat.setFloat("operating-rate", f);
        }
        if ("audio/ac4".equals(str2)) {
            Pair b = vk1.b(vq4Var);
            if (b != null) {
                h9a.P(mediaFormat, "profile", ((Integer) b.first).intValue());
                h9a.P(mediaFormat, "level", ((Integer) b.second).intValue());
            }
            if (Build.VERSION.SDK_INT <= 28) {
                mediaFormat.setInteger("ac4-is-sync", 1);
            }
        }
        uq4 uq4Var = new uq4();
        uq4Var.n = lc7.p("audio/raw");
        uq4Var.F = i4;
        uq4Var.G = i7;
        uq4Var.H = 4;
        vq4 vq4Var3 = new vq4(uq4Var);
        vs2 vs2Var = this.g1;
        if (vs2Var.h(vq4Var3) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (i8 >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.r1));
        }
        vq4 vq4Var4 = null;
        if (Objects.equals(str2, "audio/iamf")) {
            s50 s50Var = vs2Var.r;
            if (s50Var instanceof r60) {
                r40Var = ((r60) s50Var).h;
            } else {
                r40Var = null;
            }
            if (r40Var == null) {
                st0.w("MediaCodecAudioRenderer", "AudioCapabilities from the AudioSink are null, using default stereo output layout.");
                mediaFormat.setInteger("channel-mask", 12);
                mediaFormat.setInteger("max-output-channel-count", 2);
            } else {
                ts5 ts5Var = jk5.a;
                qs5 qs5Var = r40Var.d;
                int size = qs5Var.size();
                int i9 = 0;
                while (true) {
                    if (i9 < size) {
                        Object obj = qs5Var.get(i9);
                        i9++;
                        Integer num = (Integer) obj;
                        i = num.intValue();
                        if (jk5.a.contains(num)) {
                            break;
                        }
                    } else {
                        i = 0;
                        break;
                    }
                }
                if (i != 0) {
                    i2 = i;
                } else {
                    qs5 qs5Var2 = r40Var.c;
                    int size2 = qs5Var2.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size2) {
                            break;
                        }
                        Object obj2 = qs5Var2.get(i10);
                        i10++;
                        Integer num2 = (Integer) obj2;
                        int intValue = num2.intValue();
                        if (jk5.a.contains(num2)) {
                            i5 = intValue;
                            break;
                        }
                    }
                    if (i5 != 0) {
                        i2 = i5;
                    } else {
                        i2 = 12;
                    }
                }
                int bitCount = Integer.bitCount(i2);
                mediaFormat.setInteger("channel-mask", i2);
                mediaFormat.setInteger("max-output-channel-count", bitCount);
            }
        }
        G(mediaFormat);
        if ("audio/raw".equals(h47Var.b) && !"audio/raw".equals(str2)) {
            vq4Var4 = vq4Var;
        }
        this.l1 = vq4Var4;
        return new yv(h47Var, mediaFormat, vq4Var, null, mediaCrypto, this.h1);
    }

    @Override // defpackage.k47
    public final void V(cr2 cr2Var) {
        vq4 vq4Var;
        ss2 ss2Var;
        if (Build.VERSION.SDK_INT >= 29 && (vq4Var = cr2Var.c) != null && Objects.equals(vq4Var.o, "audio/opus") && this.D0) {
            ByteBuffer byteBuffer = cr2Var.D;
            byteBuffer.getClass();
            vq4 vq4Var2 = cr2Var.c;
            vq4Var2.getClass();
            int i = vq4Var2.J;
            if (byteBuffer.remaining() == 8) {
                int i2 = (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / 1000000000);
                vs2 vs2Var = this.g1;
                p60 p60Var = vs2Var.t;
                if (p60Var != null && p60Var.c() && (ss2Var = vs2Var.p) != null && ss2Var.e.k) {
                    vs2Var.t.d(i, i2);
                }
            }
        }
    }

    @Override // defpackage.b47
    public final void a(my8 my8Var) {
        vs2 vs2Var = this.g1;
        if (vs2Var.v()) {
            vs2Var.x = my8Var;
            vs2Var.t();
            return;
        }
        my8 my8Var2 = new my8(a2d.h(my8Var.a, 0.1f, 8.0f), a2d.h(my8Var.b, 0.1f, 8.0f));
        vs2Var.x = my8Var2;
        ts2 ts2Var = new ts2(my8Var2, -9223372036854775807L, -9223372036854775807L);
        if (vs2Var.n()) {
            vs2Var.v = ts2Var;
        } else {
            vs2Var.w = ts2Var;
        }
    }

    @Override // defpackage.b47
    public final long b() {
        if (this.D == 2) {
            F0();
        }
        return this.m1;
    }

    @Override // defpackage.k47
    public final void b0(Exception exc) {
        st0.i("MediaCodecAudioRenderer", "Audio codec error", exc);
        b60 b60Var = this.f1;
        Handler handler = b60Var.a;
        if (handler != null) {
            handler.post(new z50(b60Var, exc, 0));
        }
    }

    @Override // defpackage.b47
    public final boolean c() {
        boolean z = this.p1;
        this.p1 = false;
        return z;
    }

    @Override // defpackage.k47
    public final void c0(long j, long j2, String str) {
        b60 b60Var = this.f1;
        Handler handler = b60Var.a;
        if (handler != null) {
            handler.post(new z50(b60Var, str, j, j2));
        }
    }

    @Override // defpackage.k47, defpackage.ei0, defpackage.b09
    public final void d(int i, Object obj) {
        my8 my8Var;
        kz6 kz6Var;
        vs2 vs2Var = this.g1;
        if (i != 2) {
            if (i != 3) {
                if (i != 6) {
                    if (i != 12) {
                        boolean z = false;
                        if (i != 16) {
                            if (i != 9) {
                                if (i != 10) {
                                    if (i != 19) {
                                        if (i != 20) {
                                            super.d(i, obj);
                                            return;
                                        }
                                        obj.getClass();
                                        s50 s50Var = (s50) obj;
                                        if (!s50Var.equals(vs2Var.r)) {
                                            ((r60) vs2Var.r).d();
                                            vs2Var.r = s50Var;
                                            ps2 ps2Var = vs2Var.s;
                                            if (ps2Var != null) {
                                                r60 r60Var = (r60) s50Var;
                                                r60Var.f();
                                                if (r60Var.f == null) {
                                                    r60Var.f = new rr6(Thread.currentThread());
                                                }
                                                r60Var.f.a(ps2Var);
                                            }
                                            vs2Var.r();
                                            return;
                                        }
                                        return;
                                    }
                                    obj.getClass();
                                    int intValue = ((Integer) obj).intValue();
                                    AtomicInteger atomicInteger = vs2.c0;
                                    if (intValue == 0 || intValue == -1) {
                                        intValue = -1;
                                    }
                                    if (vs2Var.U != intValue) {
                                        vs2Var.U = intValue;
                                        vs2Var.r();
                                        return;
                                    }
                                    return;
                                }
                                obj.getClass();
                                int intValue2 = ((Integer) obj).intValue();
                                if (vs2Var.R) {
                                    if (vs2Var.Q == intValue2) {
                                        vs2Var.R = false;
                                    }
                                    if (Build.VERSION.SDK_INT < 35 && (kz6Var = this.h1) != null) {
                                        kz6Var.d(intValue2);
                                        return;
                                    }
                                    return;
                                }
                                if (vs2Var.Q != intValue2) {
                                    vs2Var.Q = intValue2;
                                    if (intValue2 != 0) {
                                        z = true;
                                    }
                                    vs2Var.P = z;
                                    vs2Var.r();
                                }
                                if (Build.VERSION.SDK_INT < 35) {
                                    return;
                                }
                                return;
                            }
                            obj.getClass();
                            vs2Var.y = ((Boolean) obj).booleanValue();
                            if (vs2Var.v()) {
                                my8Var = my8.d;
                            } else {
                                my8Var = vs2Var.x;
                            }
                            ts2 ts2Var = new ts2(my8Var, -9223372036854775807L, -9223372036854775807L);
                            if (vs2Var.n()) {
                                vs2Var.v = ts2Var;
                                return;
                            } else {
                                vs2Var.w = ts2Var;
                                return;
                            }
                        }
                        obj.getClass();
                        this.r1 = ((Integer) obj).intValue();
                        d47 d47Var = this.j0;
                        if (d47Var != null && Build.VERSION.SDK_INT >= 35) {
                            Bundle bundle = new Bundle();
                            bundle.putInt("importance", Math.max(0, -this.r1));
                            d47Var.b(bundle);
                            return;
                        }
                        return;
                    }
                    AudioDeviceInfo audioDeviceInfo = (AudioDeviceInfo) obj;
                    vs2Var.T = audioDeviceInfo;
                    p60 p60Var = vs2Var.t;
                    if (p60Var != null) {
                        p60Var.a.setPreferredDevice(audioDeviceInfo);
                        return;
                    }
                    return;
                }
                ce0 ce0Var = (ce0) obj;
                ce0Var.getClass();
                if (!vs2Var.S.equals(ce0Var)) {
                    if (vs2Var.t != null) {
                        vs2Var.S.getClass();
                    }
                    vs2Var.S = ce0Var;
                    return;
                }
                return;
            }
            l40 l40Var = (l40) obj;
            l40Var.getClass();
            if (!vs2Var.u.equals(l40Var)) {
                vs2Var.u = l40Var;
                if (!vs2Var.V) {
                    vs2Var.r();
                    return;
                }
                return;
            }
            return;
        }
        obj.getClass();
        float floatValue = ((Float) obj).floatValue();
        if (vs2Var.H != floatValue) {
            vs2Var.H = floatValue;
            if (vs2Var.n()) {
                vs2Var.t.a.setVolume(vs2Var.H);
            }
        }
    }

    @Override // defpackage.k47
    public final void d0(uk1 uk1Var) {
        b60 b60Var = this.f1;
        Handler handler = b60Var.a;
        if (handler != null) {
            handler.post(new b9(7, b60Var, uk1Var));
        }
    }

    @Override // defpackage.b47
    public final my8 e() {
        return this.g1.x;
    }

    @Override // defpackage.k47
    public final void e0(String str) {
        b60 b60Var = this.f1;
        Handler handler = b60Var.a;
        if (handler != null) {
            handler.post(new z50(b60Var, str, 5));
        }
    }

    @Override // defpackage.k47
    public final er2 f0(s6f s6fVar) {
        vq4 vq4Var = (vq4) s6fVar.b;
        vq4Var.getClass();
        this.k1 = vq4Var;
        er2 f0 = super.f0(s6fVar);
        b60 b60Var = this.f1;
        Handler handler = b60Var.a;
        if (handler != null) {
            handler.post(new b9(b60Var, vq4Var, f0));
        }
        return f0;
    }

    @Override // defpackage.k47
    public final void g0(vq4 vq4Var, MediaFormat mediaFormat) {
        int i;
        vq4 vq4Var2 = this.l1;
        boolean z = true;
        int[] iArr = null;
        if (vq4Var2 != null) {
            vq4Var = vq4Var2;
        } else if (this.j0 != null) {
            mediaFormat.getClass();
            if ("audio/raw".equals(vq4Var.o)) {
                i = vq4Var.I;
            } else if (mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = a2d.C(mediaFormat.getInteger("v-bits-per-sample"), ByteOrder.LITTLE_ENDIAN);
            } else {
                i = 2;
            }
            uq4 uq4Var = new uq4();
            uq4Var.n = lc7.p("audio/raw");
            uq4Var.H = i;
            uq4Var.I = vq4Var.J;
            uq4Var.J = vq4Var.K;
            uq4Var.k = vq4Var.l;
            uq4Var.a = vq4Var.a;
            uq4Var.b = vq4Var.b;
            uq4Var.c = qs5.l(vq4Var.c);
            uq4Var.d = vq4Var.d;
            uq4Var.e = vq4Var.e;
            uq4Var.f = vq4Var.f;
            uq4Var.F = mediaFormat.getInteger("channel-count");
            uq4Var.G = mediaFormat.getInteger("sample-rate");
            vq4Var = new vq4(uq4Var);
            if (this.j1) {
                int i2 = vq4Var.G;
                if (i2 != 3) {
                    if (i2 != 5) {
                        if (i2 != 6) {
                            if (i2 != 7) {
                                if (i2 == 8) {
                                    iArr = new int[]{0, 2, 1, 7, 5, 6, 3, 4};
                                }
                            } else {
                                iArr = new int[]{0, 2, 1, 6, 5, 3, 4};
                            }
                        } else {
                            iArr = new int[]{0, 2, 1, 5, 3, 4};
                        }
                    } else {
                        iArr = new int[]{0, 2, 1, 3, 4};
                    }
                } else {
                    iArr = new int[]{0, 2, 1};
                }
            }
        }
        try {
            int i3 = Build.VERSION.SDK_INT;
            vs2 vs2Var = this.g1;
            if (i3 >= 29) {
                if (this.D0) {
                    ao9 ao9Var = this.d;
                    ao9Var.getClass();
                    if (ao9Var.a != 0) {
                        ao9 ao9Var2 = this.d;
                        ao9Var2.getClass();
                        int i4 = ao9Var2.a;
                        vs2Var.getClass();
                        if (i3 < 29) {
                            z = false;
                        }
                        wq9.D(z);
                        vs2Var.i = i4;
                    }
                }
                vs2Var.getClass();
                if (i3 < 29) {
                    z = false;
                }
                wq9.D(z);
                vs2Var.i = 0;
            }
            vs2Var.c(vq4Var, iArr);
        } catch (c60 e) {
            throw g(e, e.a, false, 5001);
        }
    }

    @Override // defpackage.k47
    public final void h0() {
        this.g1.getClass();
    }

    @Override // defpackage.k47
    public final void j0() {
        this.g1.E = true;
    }

    @Override // defpackage.ei0
    public final String k() {
        return "MediaCodecAudioRenderer";
    }

    @Override // defpackage.ei0
    public final boolean m() {
        if (this.P0) {
            vs2 vs2Var = this.g1;
            if (vs2Var.n()) {
                if (vs2Var.L && !vs2Var.l()) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.k47
    public final boolean m0(long j, long j2, d47 d47Var, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, vq4 vq4Var) {
        int i4;
        int i5;
        byteBuffer.getClass();
        this.t1 = -9223372036854775807L;
        if (this.l1 != null && (i2 & 2) != 0) {
            d47Var.getClass();
            d47Var.e(i);
            return true;
        }
        vs2 vs2Var = this.g1;
        if (z) {
            if (d47Var != null) {
                d47Var.e(i);
            }
            this.T0.f += i3;
            vs2Var.E = true;
            return true;
        }
        try {
            if (vs2Var.k(i3, j3, byteBuffer)) {
                if (d47Var != null) {
                    d47Var.e(i);
                }
                this.T0.e += i3;
                return true;
            }
            this.t1 = j3;
            return false;
        } catch (d60 e) {
            vq4 vq4Var2 = this.k1;
            if (this.D0) {
                ao9 ao9Var = this.d;
                ao9Var.getClass();
                if (ao9Var.a != 0) {
                    i5 = 5004;
                    throw g(e, vq4Var2, e.a, i5);
                }
            }
            i5 = 5001;
            throw g(e, vq4Var2, e.a, i5);
        } catch (f60 e2) {
            if (this.D0) {
                ao9 ao9Var2 = this.d;
                ao9Var2.getClass();
                if (ao9Var2.a != 0) {
                    i4 = 5003;
                    throw g(e2, vq4Var, e2.b, i4);
                }
            }
            i4 = 5002;
            throw g(e2, vq4Var, e2.b, i4);
        }
    }

    @Override // defpackage.ei0
    public final boolean o() {
        return this.g1.l();
    }

    @Override // defpackage.k47, defpackage.ei0
    public final void p() {
        b60 b60Var = this.f1;
        this.o1 = true;
        this.k1 = null;
        this.t1 = -9223372036854775807L;
        this.q1 = false;
        try {
            this.g1.f();
            try {
                super.p();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.p();
                throw th;
            } finally {
            }
        }
    }

    @Override // defpackage.k47
    public final void p0() {
        int i;
        try {
            vs2 vs2Var = this.g1;
            if (!vs2Var.L && vs2Var.n() && vs2Var.e()) {
                vs2Var.p();
                vs2Var.L = true;
            }
            long j = this.U0.f;
            if (j != -9223372036854775807L) {
                this.t1 = j;
            }
        } catch (f60 e) {
            if (this.D0) {
                i = 5003;
            } else {
                i = 5002;
            }
            throw g(e, e.c, e.b, i);
        }
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [ar2, java.lang.Object] */
    @Override // defpackage.ei0
    public final void q(boolean z, boolean z2) {
        ?? obj = new Object();
        this.T0 = obj;
        b60 b60Var = this.f1;
        Handler handler = b60Var.a;
        if (handler != null) {
            handler.post(new z50(b60Var, obj, 6));
        }
        ao9 ao9Var = this.d;
        ao9Var.getClass();
        boolean z3 = ao9Var.b;
        vs2 vs2Var = this.g1;
        if (z3) {
            wq9.D(vs2Var.P);
            if (!vs2Var.V) {
                vs2Var.V = true;
                vs2Var.r();
            }
        } else if (vs2Var.V) {
            vs2Var.V = false;
            vs2Var.r();
        }
        a09 a09Var = this.f;
        a09Var.getClass();
        vs2Var.m = a09Var;
        xfb xfbVar = this.C;
        xfbVar.getClass();
        ((r60) vs2Var.r).g = xfbVar;
        vs2Var.n = new uwd(this, 29);
    }

    @Override // defpackage.k47, defpackage.ei0
    public final void r(long j, boolean z, boolean z2) {
        super.r(j, z, z2);
        this.g1.f();
        this.m1 = j;
        this.t1 = -9223372036854775807L;
        this.p1 = false;
        this.q1 = false;
        this.n1 = true;
    }

    @Override // defpackage.ei0
    public final void s() {
        kz6 kz6Var;
        ((r60) this.g1.r).d();
        if (Build.VERSION.SDK_INT >= 35 && (kz6Var = this.h1) != null) {
            kz6Var.b();
        }
    }

    @Override // defpackage.ei0
    public final void t() {
        vs2 vs2Var = this.g1;
        this.p1 = false;
        this.q1 = false;
        this.t1 = -9223372036854775807L;
        try {
            this.D0 = false;
            q0();
            o0();
            mu9 mu9Var = this.d0;
            if (mu9Var != null) {
                mu9Var.y(null);
            }
            this.d0 = null;
        } finally {
            if (this.o1) {
                this.o1 = false;
                vs2Var.s();
            }
        }
    }

    @Override // defpackage.ei0
    public final void u() {
        this.g1.o();
        this.s1 = true;
    }

    @Override // defpackage.ei0
    public final void v() {
        F0();
        this.s1 = false;
        vs2 vs2Var = this.g1;
        vs2Var.O = false;
        if (vs2Var.n()) {
            p60 p60Var = vs2Var.t;
            s60 s60Var = p60Var.f;
            s60Var.k = 0L;
            s60Var.t = 0;
            s60Var.s = 0;
            s60Var.l = 0L;
            s60Var.y = -9223372036854775807L;
            s60Var.z = -9223372036854775807L;
            if (s60Var.u == -9223372036854775807L) {
                s60Var.h.a(0);
            }
            s60Var.w = s60Var.a();
            if (!p60Var.k || p60Var.c()) {
                p60Var.a.pause();
            }
        }
        this.q1 = false;
    }

    @Override // defpackage.k47
    public final boolean z0(vq4 vq4Var) {
        ao9 ao9Var = this.d;
        ao9Var.getClass();
        if (ao9Var.a != 0) {
            int E0 = E0(vq4Var);
            if ((E0 & 512) != 0) {
                ao9 ao9Var2 = this.d;
                ao9Var2.getClass();
                if (ao9Var2.a == 2 || (E0 & 1024) != 0 || (vq4Var.J == 0 && vq4Var.K == 0)) {
                    return true;
                }
            }
        }
        if (this.g1.h(vq4Var) != 0) {
            return true;
        }
        return false;
    }

    @Override // defpackage.ei0
    public final b47 j() {
        return this;
    }
}
