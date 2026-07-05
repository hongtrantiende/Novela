package defpackage;

import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.reflect.Method;
import java.math.RoundingMode;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: s60  reason: default package */
/* loaded from: classes.dex */
public final class s60 {
    public boolean A;
    public long B;
    public final n07 a;
    public final xfb b;
    public final long[] c;
    public final AudioTrack d;
    public final int e;
    public final long f;
    public final boolean g;
    public final j60 h;
    public float i;
    public long j;
    public long k;
    public long l;
    public Method m;
    public long n;
    public long o;
    public long p;
    public long q;
    public long r;
    public int s;
    public int t;
    public long u;
    public long v;
    public long w;
    public long x;
    public long y;
    public long z;

    public s60(n07 n07Var, xfb xfbVar, AudioTrack audioTrack, int i, int i2, int i3) {
        long j;
        this.a = n07Var;
        this.b = xfbVar;
        this.d = audioTrack;
        try {
            this.m = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.c = new long[10];
        this.z = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.h = new j60(audioTrack, n07Var);
        int sampleRate = audioTrack.getSampleRate();
        this.e = sampleRate;
        boolean M = a2d.M(i);
        this.g = M;
        if (M) {
            j = a2d.W(sampleRate, i3 / i2);
        } else {
            j = -9223372036854775807L;
        }
        this.f = j;
        this.q = 0L;
        this.r = 0L;
        this.A = false;
        this.B = 0L;
        this.u = -9223372036854775807L;
        this.v = -9223372036854775807L;
        this.o = 0L;
        this.n = 0L;
        this.i = 1.0f;
        this.j = -9223372036854775807L;
    }

    public final long a() {
        AudioTrack audioTrack;
        if (this.u != -9223372036854775807L) {
            return Math.min(this.x, c());
        }
        this.b.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (elapsedRealtime - this.p >= 5) {
            int playState = this.d.getPlayState();
            if (playState != 1) {
                long playbackHeadPosition = audioTrack.getPlaybackHeadPosition() & 4294967295L;
                if (Build.VERSION.SDK_INT <= 29) {
                    if (playbackHeadPosition == 0 && this.q > 0 && playState == 3) {
                        if (this.v == -9223372036854775807L) {
                            this.v = elapsedRealtime;
                        }
                    } else {
                        this.v = -9223372036854775807L;
                    }
                }
                long j = this.q;
                if (j > playbackHeadPosition) {
                    if (this.A) {
                        this.B += j;
                        this.A = false;
                    } else {
                        this.r++;
                    }
                }
                this.q = playbackHeadPosition;
            }
            this.p = elapsedRealtime;
        }
        return this.q + this.B + (this.r << 32);
    }

    public final long b(long j) {
        long A;
        int i = this.t;
        int i2 = this.e;
        if (i == 0) {
            if (this.u != -9223372036854775807L) {
                A = a2d.W(i2, c());
            } else {
                A = a2d.W(i2, a());
            }
        } else {
            A = a2d.A(this.i, j + this.k);
        }
        long max = Math.max(0L, A - this.n);
        if (this.u != -9223372036854775807L) {
            return Math.min(a2d.W(i2, this.x), max);
        }
        return max;
    }

    public final long c() {
        if (this.d.getPlayState() == 2) {
            return this.w;
        }
        this.b.getClass();
        return this.w + a2d.Y(a2d.A(this.i, a2d.Q(SystemClock.elapsedRealtime()) - this.u), this.e, 1000000L, RoundingMode.UP);
    }

    public final void d(long j) {
        long j2 = this.j;
        if (j2 != -9223372036854775807L && j >= j2) {
            long D = a2d.D(this.i, j - j2);
            this.b.getClass();
            final long currentTimeMillis = System.currentTimeMillis() - a2d.e0(D);
            this.j = -9223372036854775807L;
            rr6 rr6Var = ((p60) this.a.b).j;
            rr6Var.getClass();
            if (Thread.currentThread() == rr6Var.a) {
                rr6Var.e(-1, new or6() { // from class: l60
                    @Override // defpackage.or6
                    public final void invoke(Object obj) {
                        uwd uwdVar;
                        rs2 rs2Var = (rs2) obj;
                        vs2 vs2Var = rs2Var.b;
                        if (rs2Var == vs2Var.j && (uwdVar = vs2Var.n) != null) {
                            e47 e47Var = (e47) uwdVar.b;
                            e47Var.q1 = true;
                            b60 b60Var = e47Var.f1;
                            Handler handler = b60Var.a;
                            if (handler != null) {
                                handler.post(new z50(b60Var, currentTimeMillis));
                            }
                        }
                    }
                });
            }
        }
    }
}
