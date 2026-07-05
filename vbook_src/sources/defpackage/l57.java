package defpackage;

import android.content.Context;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.util.Pair;
import java.util.HashMap;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l57 */
/* loaded from: classes.dex */
public final class l57 implements dd {
    public int A;
    public boolean B;
    public final Context a;
    public final nw2 c;
    public final PlaybackSession d;
    public String j;
    public PlaybackMetrics.Builder k;
    public int l;
    public pz3 o;
    public kj p;
    public kj q;
    public kj r;
    public vq4 s;
    public vq4 t;
    public vq4 u;
    public boolean v;
    public int w;
    public boolean x;
    public int y;
    public int z;
    public final Executor b = eg0.s();
    public final z9c f = new z9c();
    public final y9c g = new y9c();
    public final HashMap i = new HashMap();
    public final HashMap h = new HashMap();
    public final long e = SystemClock.elapsedRealtime();
    public int m = 0;
    public int n = 0;

    public l57(Context context, PlaybackSession playbackSession) {
        this.a = context.getApplicationContext();
        this.d = playbackSession;
        nw2 nw2Var = new nw2();
        this.c = nw2Var;
        nw2Var.d = this;
    }

    public static /* synthetic */ void a(l57 l57Var, PlaybackErrorEvent playbackErrorEvent) {
        l57Var.d.reportPlaybackErrorEvent(playbackErrorEvent);
    }

    public static /* synthetic */ void b(l57 l57Var, PlaybackMetrics playbackMetrics) {
        l57Var.d.reportPlaybackMetrics(playbackMetrics);
    }

    public static /* synthetic */ void c(l57 l57Var, NetworkEvent networkEvent) {
        l57Var.d.reportNetworkEvent(networkEvent);
    }

    public static /* synthetic */ void d(l57 l57Var, TrackChangeEvent trackChangeEvent) {
        l57Var.d.reportTrackChangeEvent(trackChangeEvent);
    }

    public static /* synthetic */ void e(l57 l57Var, PlaybackStateEvent playbackStateEvent) {
        l57Var.d.reportPlaybackStateEvent(playbackStateEvent);
    }

    public static l57 g(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new l57(context, mediaMetricsManager.createPlaybackSession());
    }

    public final boolean f(kj kjVar) {
        String str;
        if (kjVar != null) {
            String str2 = (String) kjVar.c;
            nw2 nw2Var = this.c;
            synchronized (nw2Var) {
                str = nw2Var.f;
            }
            if (str2.equals(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void h() {
        long longValue;
        long longValue2;
        int i;
        PlaybackMetrics.Builder builder = this.k;
        if (builder != null && this.B) {
            builder.setAudioUnderrunCount(this.A);
            this.k.setVideoFramesDropped(this.y);
            this.k.setVideoFramesPlayed(this.z);
            Long l = (Long) this.h.get(this.j);
            PlaybackMetrics.Builder builder2 = this.k;
            if (l == null) {
                longValue = 0;
            } else {
                longValue = l.longValue();
            }
            builder2.setNetworkTransferDurationMillis(longValue);
            Long l2 = (Long) this.i.get(this.j);
            PlaybackMetrics.Builder builder3 = this.k;
            if (l2 == null) {
                longValue2 = 0;
            } else {
                longValue2 = l2.longValue();
            }
            builder3.setNetworkBytesRead(longValue2);
            PlaybackMetrics.Builder builder4 = this.k;
            if (l2 != null && l2.longValue() > 0) {
                i = 1;
            } else {
                i = 0;
            }
            builder4.setStreamSource(i);
            this.b.execute(new ex2(14, this, this.k.build()));
        }
        this.k = null;
        this.j = null;
        this.A = 0;
        this.y = 0;
        this.z = 0;
        this.s = null;
        this.t = null;
        this.u = null;
        this.B = false;
    }

    public final LogSessionId i() {
        return this.d.getSessionId();
    }

    public final void j(aac aacVar, e67 e67Var) {
        int b;
        PlaybackMetrics.Builder builder = this.k;
        if (e67Var == null || (b = aacVar.b(e67Var.a)) == -1) {
            return;
        }
        y9c y9cVar = this.g;
        int i = 0;
        aacVar.f(b, y9cVar, false);
        int i2 = y9cVar.c;
        z9c z9cVar = this.f;
        aacVar.n(i2, z9cVar);
        c57 c57Var = z9cVar.b.b;
        int i3 = 2;
        if (c57Var != null) {
            int I = a2d.I(c57Var.a, c57Var.b);
            if (I != 0) {
                if (I != 1) {
                    if (I != 2) {
                        i = 1;
                    } else {
                        i = 4;
                    }
                } else {
                    i = 5;
                }
            } else {
                i = 3;
            }
        }
        builder.setStreamType(i);
        if (z9cVar.l != -9223372036854775807L && !z9cVar.j && !z9cVar.h && !z9cVar.a()) {
            builder.setMediaDurationMillis(a2d.e0(z9cVar.l));
        }
        if (!z9cVar.a()) {
            i3 = 1;
        }
        builder.setPlaybackType(i3);
        this.B = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:727:0x04ab  */
    /* JADX WARN: Removed duplicated region for block: B:741:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:753:0x0504  */
    /* JADX WARN: Removed duplicated region for block: B:765:0x0533  */
    /* JADX WARN: Removed duplicated region for block: B:766:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:767:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:768:0x053b  */
    /* JADX WARN: Removed duplicated region for block: B:769:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x053f  */
    /* JADX WARN: Removed duplicated region for block: B:771:0x0541  */
    /* JADX WARN: Removed duplicated region for block: B:772:0x0543  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:774:0x0548  */
    /* JADX WARN: Removed duplicated region for block: B:777:0x054f  */
    /* JADX WARN: Removed duplicated region for block: B:780:0x057b  */
    /* JADX WARN: Removed duplicated region for block: B:783:0x0586  */
    /* JADX WARN: Removed duplicated region for block: B:784:0x058b  */
    /* JADX WARN: Removed duplicated region for block: B:790:0x05a0  */
    /* JADX WARN: Removed duplicated region for block: B:826:0x05ee  */
    /* JADX WARN: Removed duplicated region for block: B:829:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:849:0x066c A[ORIG_RETURN, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void k(defpackage.cz8 r23, defpackage.s6f r24) {
        /*
            Method dump skipped, instructions count: 1696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l57.k(cz8, s6f):void");
    }

    public final void l(cd cdVar, String str) {
        e67 e67Var = cdVar.d;
        if (e67Var != null && e67Var.b()) {
            return;
        }
        h();
        this.j = str;
        this.k = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.10.1");
        j(cdVar.b, e67Var);
    }

    public final void m(cd cdVar, String str) {
        e67 e67Var = cdVar.d;
        if ((e67Var == null || !e67Var.b()) && str.equals(this.j)) {
            h();
        }
        this.h.remove(str);
        this.i.remove(str);
    }

    public final void n(int i, long j, vq4 vq4Var, int i2) {
        int i3;
        String str;
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.e);
        if (vq4Var != null) {
            timeSinceCreatedMillis.setTrackState(1);
            if (i2 != 1) {
                i3 = 3;
                if (i2 != 2) {
                    if (i2 != 3) {
                        i3 = 1;
                    } else {
                        i3 = 4;
                    }
                }
            } else {
                i3 = 2;
            }
            timeSinceCreatedMillis.setTrackChangeReason(i3);
            String str2 = vq4Var.n;
            if (str2 != null) {
                timeSinceCreatedMillis.setContainerMimeType(str2);
            }
            String str3 = vq4Var.o;
            if (str3 != null) {
                timeSinceCreatedMillis.setSampleMimeType(str3);
            }
            String str4 = vq4Var.k;
            if (str4 != null) {
                timeSinceCreatedMillis.setCodecName(str4);
            }
            int i4 = vq4Var.j;
            if (i4 != -1) {
                timeSinceCreatedMillis.setBitrate(i4);
            }
            int i5 = vq4Var.v;
            if (i5 != -1) {
                timeSinceCreatedMillis.setWidth(i5);
            }
            int i6 = vq4Var.w;
            if (i6 != -1) {
                timeSinceCreatedMillis.setHeight(i6);
            }
            int i7 = vq4Var.G;
            if (i7 != -1) {
                timeSinceCreatedMillis.setChannelCount(i7);
            }
            int i8 = vq4Var.H;
            if (i8 != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(i8);
            }
            String str5 = vq4Var.d;
            if (str5 != null) {
                String str6 = a2d.a;
                String[] split = str5.split("-", -1);
                String str7 = split[0];
                if (split.length >= 2) {
                    str = split[1];
                } else {
                    str = null;
                }
                Pair create = Pair.create(str7, str);
                timeSinceCreatedMillis.setLanguage((String) create.first);
                Object obj = create.second;
                if (obj != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) obj);
                }
            }
            float f = vq4Var.z;
            if (f != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(f);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.B = true;
        this.b.execute(new ex2(11, this, timeSinceCreatedMillis.build()));
    }
}
