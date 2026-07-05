package defpackage;

import android.content.Context;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: os2  reason: default package */
/* loaded from: classes.dex */
public final class os2 implements qs2 {
    public final Context a;
    public Boolean b;

    public os2(Context context) {
        Context applicationContext;
        if (context == null) {
            applicationContext = null;
        } else {
            applicationContext = context.getApplicationContext();
        }
        this.a = applicationContext;
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [i50, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9, types: [i50, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6, types: [i50, java.lang.Object] */
    public final j50 a(l40 l40Var, vq4 vq4Var) {
        boolean booleanValue;
        boolean z;
        vq4Var.getClass();
        int i = vq4Var.H;
        l40Var.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29 && i != -1) {
            Boolean bool = this.b;
            boolean z2 = false;
            if (bool != null) {
                booleanValue = bool.booleanValue();
            } else {
                Context context = this.a;
                if (context != null) {
                    String parameters = h50.n(context).getParameters("offloadVariableRateSupported");
                    if (parameters != null && parameters.equals("offloadVariableRateSupported=1")) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.b = Boolean.valueOf(z);
                } else {
                    this.b = Boolean.FALSE;
                }
                booleanValue = this.b.booleanValue();
            }
            String str = vq4Var.o;
            str.getClass();
            int d = lc7.d(str, vq4Var.k);
            if (d != 0 && i2 >= a2d.r(d)) {
                int s = a2d.s(vq4Var.G);
                if (s == 0) {
                    return j50.d;
                }
                try {
                    AudioFormat build = new AudioFormat.Builder().setSampleRate(i).setChannelMask(s).setEncoding(d).build();
                    if (i2 >= 33) {
                        int directPlaybackSupport = AudioManager.getDirectPlaybackSupport(build, l40Var.a());
                        if ((directPlaybackSupport & 1) == 0) {
                            return j50.d;
                        }
                        if ((directPlaybackSupport & 3) == 3) {
                            z2 = true;
                        }
                        ?? obj = new Object();
                        obj.a = true;
                        obj.b = z2;
                        obj.c = booleanValue;
                        return obj.a();
                    } else if (i2 >= 31) {
                        int playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(build, l40Var.a());
                        if (playbackOffloadSupport == 0) {
                            return j50.d;
                        }
                        ?? obj2 = new Object();
                        if (i2 > 32 && playbackOffloadSupport == 2) {
                            z2 = true;
                        }
                        obj2.a = true;
                        obj2.b = z2;
                        obj2.c = booleanValue;
                        return obj2.a();
                    } else if (!AudioManager.isOffloadedPlaybackSupported(build, l40Var.a())) {
                        return j50.d;
                    } else {
                        ?? obj3 = new Object();
                        obj3.a = true;
                        obj3.c = booleanValue;
                        return obj3.a();
                    }
                } catch (IllegalArgumentException unused) {
                    return j50.d;
                }
            }
            return j50.d;
        }
        return j50.d;
    }
}
