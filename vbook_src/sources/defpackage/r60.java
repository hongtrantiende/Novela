package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.media.AudioAttributes;
import android.media.AudioDeviceInfo;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: r60  reason: default package */
/* loaded from: classes.dex */
public final class r60 implements s50 {
    public final Context a;
    public final j55 b;
    public final qs2 c;
    public final uwd d;
    public final float e;
    public rr6 f;
    public xfb g;
    public r40 h;
    public koc i;
    public Looper j;
    public Context k;

    public r60(q60 q60Var) {
        uwd uwdVar;
        Context context = (Context) q60Var.b;
        this.a = context;
        qs2 qs2Var = (qs2) q60Var.c;
        qs2Var.getClass();
        this.c = qs2Var;
        this.b = (j55) q60Var.d;
        this.h = (r40) q60Var.e;
        if (context == null) {
            uwdVar = null;
        } else {
            uwdVar = new uwd(this, 6);
        }
        this.d = uwdVar;
        this.e = q60Var.a;
        this.g = xfb.a;
    }

    public final p60 a(r50 r50Var) {
        Context context;
        AudioAttributes a;
        Context context2;
        try {
            int i = r50Var.h;
            int i2 = r50Var.i;
            if (i2 != -1 && (context2 = this.a) != null && Build.VERSION.SDK_INT >= 34) {
                Context context3 = this.k;
                if (context3 == null || context3.getDeviceId() != i2) {
                    this.k = context2.createDeviceContext(i2);
                }
                context = this.k;
                i = 0;
            } else {
                context = null;
            }
            AudioFormat build = new AudioFormat.Builder().setSampleRate(r50Var.b).setChannelMask(r50Var.c).setEncoding(r50Var.a).build();
            l40 l40Var = r50Var.g;
            if (r50Var.d) {
                a = new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
            } else {
                a = l40Var.a();
            }
            AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(a).setAudioFormat(build).setTransferMode(1).setBufferSizeInBytes(r50Var.f).setSessionId(i);
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                sessionId.setOffloadedPlayback(r50Var.e);
            }
            if (i3 >= 34 && context != null) {
                sessionId.setContext(context);
            }
            AudioTrack build2 = sessionId.build();
            if (build2.getState() == 1) {
                return new p60(build2, r50Var, this.d, this.e, this.g);
            }
            try {
                build2.release();
            } catch (Exception unused) {
            }
            throw new Exception();
        } catch (IllegalArgumentException | UnsupportedOperationException e) {
            throw new Exception(e);
        }
    }

    public final o50 b(m50 m50Var) {
        e(m50Var);
        vq4 vq4Var = m50Var.a;
        l40 l40Var = m50Var.b;
        j50 a = ((os2) this.c).a(l40Var, vq4Var);
        n50 n50Var = new n50();
        String str = vq4Var.o;
        int i = vq4Var.I;
        int i2 = 0;
        if (!Objects.equals(str, "audio/raw") ? this.h.c(l40Var, vq4Var) != null : i == 2) {
            i2 = 2;
        }
        n50Var.a = i2;
        n50Var.b = a.a;
        n50Var.c = a.b;
        n50Var.d = a.c;
        return n50Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0169  */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, q50] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.r50 c(defpackage.m50 r24) {
        /*
            Method dump skipped, instructions count: 402
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r60.c(m50):r50");
    }

    public final void d() {
        hwa hwaVar;
        rr6 rr6Var = this.f;
        if (rr6Var != null) {
            rr6Var.d();
        }
        koc kocVar = this.i;
        if (kocVar != null) {
            Context context = (Context) kocVar.b;
            if (kocVar.a) {
                kocVar.i = null;
                h50.n(context).unregisterAudioDeviceCallback((s40) kocVar.e);
                if (Build.VERSION.SDK_INT >= 32 && (hwaVar = (hwa) kocVar.h) != null) {
                    hwaVar.e();
                    kocVar.h = null;
                }
                context.unregisterReceiver((u40) kocVar.f);
                t40 t40Var = (t40) kocVar.g;
                if (t40Var != null) {
                    t40Var.a.unregisterContentObserver(t40Var);
                }
                kocVar.a = false;
            }
        }
    }

    public final void e(m50 m50Var) {
        Context context;
        r40 b;
        AudioDeviceInfo audioDeviceInfo = m50Var.c;
        l40 l40Var = m50Var.b;
        f();
        koc kocVar = this.i;
        if (kocVar == null && (context = this.a) != null) {
            koc kocVar2 = new koc(context, new q6(this, 2), l40Var, audioDeviceInfo);
            this.i = kocVar2;
            Handler handler = (Handler) kocVar2.d;
            Context context2 = (Context) kocVar2.b;
            if (kocVar2.a) {
                b = (r40) kocVar2.i;
                b.getClass();
            } else {
                kocVar2.a = true;
                t40 t40Var = (t40) kocVar2.g;
                if (t40Var != null) {
                    t40Var.a.registerContentObserver(t40Var.b, false, t40Var);
                }
                h50.n(context2).registerAudioDeviceCallback((s40) kocVar2.e, handler);
                if (Build.VERSION.SDK_INT >= 32 && ((hwa) kocVar2.h) == null) {
                    kocVar2.h = new hwa(context2, new x0(kocVar2, 6), Boolean.valueOf(a2d.P(context2)));
                }
                b = r40.b(context2, context2.registerReceiver((u40) kocVar2.f, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), null, handler), (l40) kocVar2.k, (AudioDeviceInfo) kocVar2.j, kocVar2.e());
                kocVar2.i = b;
            }
            this.h = b;
        } else if (kocVar != null) {
            if (audioDeviceInfo != null && !audioDeviceInfo.equals((AudioDeviceInfo) kocVar.j)) {
                kocVar.j = audioDeviceInfo;
                Context context3 = (Context) kocVar.b;
                List e = kocVar.e();
                mm9 mm9Var = r40.e;
                kocVar.f(r40.b(context3, context3.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), (l40) kocVar.k, audioDeviceInfo, e));
            }
            koc kocVar3 = this.i;
            if (!Objects.equals(l40Var, (l40) kocVar3.k)) {
                kocVar3.k = l40Var;
                Context context4 = (Context) kocVar3.b;
                List e2 = kocVar3.e();
                mm9 mm9Var2 = r40.e;
                kocVar3.f(r40.b(context4, context4.registerReceiver(null, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG")), l40Var, (AudioDeviceInfo) kocVar3.j, e2));
            }
        }
        this.h.getClass();
    }

    public final void f() {
        boolean z;
        String name;
        if (this.a == null) {
            return;
        }
        Looper myLooper = Looper.myLooper();
        Looper looper = this.j;
        if (looper != null && looper != myLooper) {
            z = false;
        } else {
            z = true;
        }
        String str = "null";
        if (looper == null) {
            name = "null";
        } else {
            name = looper.getThread().getName();
        }
        if (myLooper != null) {
            str = myLooper.getThread().getName();
        }
        if (z) {
            this.j = myLooper;
        } else {
            vs.k(hma.v("AudioTrackAudioOutputProvider accessed on multiple threads: %s and %s", name, str));
        }
    }
}
