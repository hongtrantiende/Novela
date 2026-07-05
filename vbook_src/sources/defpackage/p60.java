package defpackage;

import android.media.AudioTrack;
import android.media.metrics.LogSessionId;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: p60  reason: default package */
/* loaded from: classes.dex */
public final class p60 {
    public static final Object s = new Object();
    public static ScheduledExecutorService t;
    public static int u;
    public final AudioTrack a;
    public final r50 b;
    public final float c;
    public final uwd d;
    public oaa e;
    public final s60 f;
    public final boolean g;
    public final int h;
    public final o60 i;
    public final rr6 j = new rr6(Thread.currentThread());
    public boolean k;
    public long l;
    public long m;
    public long n;
    public ByteBuffer o;
    public int p;
    public int q;
    public int r;

    public p60(AudioTrack audioTrack, r50 r50Var, uwd uwdVar, float f, xfb xfbVar) {
        o60 o60Var;
        this.a = audioTrack;
        this.b = r50Var;
        this.c = f;
        this.d = uwdVar;
        boolean M = a2d.M(r50Var.a);
        this.g = M;
        if (M) {
            this.h = a2d.t(r50Var.a) * Integer.bitCount(r50Var.c);
        } else {
            this.h = -1;
        }
        this.f = new s60(new n07(this, 6), xfbVar, audioTrack, r50Var.a, this.h, r50Var.f);
        if (uwdVar != null) {
            this.e = new oaa(audioTrack, uwdVar);
        }
        if (c()) {
            o60Var = new o60(this);
        } else {
            o60Var = null;
        }
        this.i = o60Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a() {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p60.a():long");
    }

    public final long b() {
        if (this.g) {
            long j = this.l;
            long j2 = this.h;
            String str = a2d.a;
            return ((j + j2) - 1) / j2;
        }
        return this.m;
    }

    public final boolean c() {
        if (Build.VERSION.SDK_INT >= 29 && this.a.isOffloadedPlayback()) {
            return true;
        }
        return false;
    }

    public final void d(int i, int i2) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.a.setOffloadDelayPadding(i, i2);
    }

    public final void e() {
        if (Build.VERSION.SDK_INT >= 29) {
            AudioTrack audioTrack = this.a;
            if (audioTrack.getPlayState() != 3) {
                return;
            }
            audioTrack.setOffloadEndOfStream();
            s60 s60Var = this.f;
            s60Var.A = true;
            s60Var.h.a.f = true;
        }
    }

    public final void f(a09 a09Var) {
        LogSessionId logSessionId;
        if (Build.VERSION.SDK_INT >= 31) {
            LogSessionId a = a09Var.a();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            if (!a.equals(logSessionId)) {
                this.a.setLogSessionId(a);
            }
        }
    }

    public final boolean g(int i, long j, ByteBuffer byteBuffer) {
        int write;
        uwd uwdVar;
        r60 r60Var;
        koc kocVar;
        boolean z;
        long j2 = j;
        r50 r50Var = this.b;
        boolean z2 = this.g;
        if (!z2 && this.q == 0) {
            this.q = vs2.i(r50Var.a, byteBuffer);
        }
        rr6 rr6Var = this.j;
        rr6Var.getClass();
        Thread currentThread = Thread.currentThread();
        Thread thread = rr6Var.a;
        AudioTrack audioTrack = this.a;
        boolean z3 = false;
        if (currentThread == thread) {
            b();
            int underrunCount = audioTrack.getUnderrunCount();
            if (underrunCount > this.r) {
                z = true;
            } else {
                z = false;
            }
            this.r = underrunCount;
            if (z) {
                rr6Var.e(-1, new vs(8));
            }
        }
        int remaining = byteBuffer.remaining();
        if (r50Var.d) {
            if (j2 == Long.MIN_VALUE) {
                j2 = this.n;
            } else {
                this.n = j2;
            }
            int remaining2 = byteBuffer.remaining();
            if (Build.VERSION.SDK_INT >= 26) {
                write = audioTrack.write(byteBuffer, remaining2, 1, j2 * 1000);
            } else {
                if (this.o == null) {
                    ByteBuffer allocate = ByteBuffer.allocate(16);
                    this.o = allocate;
                    allocate.order(ByteOrder.BIG_ENDIAN);
                    this.o.putInt(1431633921);
                }
                if (this.p == 0) {
                    this.o.putInt(4, remaining2);
                    this.o.putLong(8, j2 * 1000);
                    this.o.position(0);
                    this.p = remaining2;
                }
                int remaining3 = this.o.remaining();
                if (remaining3 > 0) {
                    int write2 = audioTrack.write(this.o, remaining3, 1);
                    if (write2 < 0) {
                        this.p = 0;
                        write = write2;
                    } else if (write2 < remaining3) {
                        write = 0;
                    }
                }
                write = audioTrack.write(byteBuffer, remaining2, 1);
                if (write < 0) {
                    this.p = 0;
                } else {
                    this.p -= write;
                }
            }
        } else {
            write = audioTrack.write(byteBuffer, byteBuffer.remaining(), 1);
        }
        if (write < 0) {
            if (write == -6 || write == -32) {
                z3 = true;
            }
            if (z3 && (uwdVar = this.d) != null && (kocVar = (r60Var = (r60) uwdVar.b).i) != null) {
                r40 r40Var = r40.f;
                r60Var.h = r40Var;
                kocVar.f(r40Var);
            }
            throw new k50(write, z3);
        }
        if (write == remaining) {
            z3 = true;
        }
        if (z2) {
            this.l += write;
            return z3;
        }
        if (z3) {
            this.m = (this.q * i) + this.m;
        }
        return z3;
    }
}
