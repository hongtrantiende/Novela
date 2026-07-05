package defpackage;

import android.media.AudioTrack;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: j60  reason: default package */
/* loaded from: classes.dex */
public final class j60 {
    public final i60 a;
    public final int b;
    public final n07 c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public j60(AudioTrack audioTrack, n07 n07Var) {
        this.a = new i60(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = n07Var;
        a(0);
    }

    public final void a(int i) {
        this.d = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    if (i == 4) {
                        this.f = 500000L;
                        return;
                    } else {
                        vm1.d();
                        return;
                    }
                }
                this.f = 10000000L;
                return;
            }
            this.f = 10000L;
            return;
        }
        this.g = 0L;
        this.h = -1L;
        this.i = -9223372036854775807L;
        this.e = System.nanoTime() / 1000;
        this.f = 10000L;
    }
}
