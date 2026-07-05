package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.Spatializer;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: hwa  reason: default package */
/* loaded from: classes.dex */
public final class hwa {
    public final Spatializer a;
    public final boolean b;
    public final Handler c;
    public final gwa d;

    public hwa(Context context, Runnable runnable, Boolean bool) {
        AudioManager n;
        boolean z;
        if (context == null) {
            n = null;
        } else {
            n = h50.n(context);
        }
        if (n != null && (bool == null || !bool.booleanValue())) {
            Spatializer spatializer = n.getSpatializer();
            this.a = spatializer;
            if (spatializer.getImmersiveAudioLevel() != 0) {
                z = true;
            } else {
                z = false;
            }
            this.b = z;
            Looper myLooper = Looper.myLooper();
            myLooper.getClass();
            Handler handler = new Handler(myLooper);
            this.c = handler;
            gwa gwaVar = new gwa(runnable);
            this.d = gwaVar;
            spatializer.addOnSpatializerStateChangedListener(new m60(handler, 0), gwaVar);
            return;
        }
        this.a = null;
        this.b = false;
        this.c = null;
        this.d = null;
    }

    public final boolean a(l40 l40Var, vq4 vq4Var) {
        if (this.a == null || !this.b || !c() || !d()) {
            return false;
        }
        String str = vq4Var.o;
        int i = vq4Var.G;
        if (Objects.equals(str, "audio/eac3-joc")) {
            if (i == 16) {
                i = 12;
            }
        } else if (Objects.equals(str, "audio/iamf")) {
            if (i == -1) {
                i = 6;
            }
        } else if (Objects.equals(str, "audio/ac4") && (i == 18 || i == 21)) {
            i = 24;
        }
        int s = a2d.s(i);
        if (s == 0) {
            return false;
        }
        AudioFormat.Builder channelMask = new AudioFormat.Builder().setEncoding(2).setChannelMask(s);
        int i2 = vq4Var.H;
        if (i2 != -1) {
            channelMask.setSampleRate(i2);
        }
        Spatializer spatializer = this.a;
        spatializer.getClass();
        return spatializer.canBeSpatialized(l40Var.a(), channelMask.build());
    }

    public final List b() {
        if (this.a != null && this.b && c() && d()) {
            if (Build.VERSION.SDK_INT >= 36) {
                Spatializer spatializer = this.a;
                spatializer.getClass();
                return spatializer.getSpatializedChannelMasks();
            }
            return qs5.r(252);
        }
        ms5 ms5Var = qs5.b;
        return mm9.e;
    }

    public final boolean c() {
        Spatializer spatializer = this.a;
        if (spatializer != null && spatializer.isAvailable()) {
            return true;
        }
        return false;
    }

    public final boolean d() {
        Spatializer spatializer = this.a;
        if (spatializer != null && spatializer.isEnabled()) {
            return true;
        }
        return false;
    }

    public final void e() {
        gwa gwaVar;
        Handler handler;
        Spatializer spatializer = this.a;
        if (spatializer != null && (gwaVar = this.d) != null && (handler = this.c) != null) {
            spatializer.removeOnSpatializerStateChangedListener(gwaVar);
            handler.removeCallbacksAndMessages(null);
        }
    }
}
