package com.google.android.recaptcha.internal;

import android.os.Build;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzjb {
    public static final Map zza() {
        LinkedHashMap t = o17.t(new yk8(-4, zzba.zzo), new yk8(-12, zzba.zzp), new yk8(-6, zzba.zzk), new yk8(-11, zzba.zzm), new yk8(-13, zzba.zzq), new yk8(-14, zzba.zzr), new yk8(-2, zzba.zzl), new yk8(-7, zzba.zzs), new yk8(-5, zzba.zzt), new yk8(-9, zzba.zzu), new yk8(-8, zzba.zzE), new yk8(-15, zzba.zzn), new yk8(-1, zzba.zzv), new yk8(-3, zzba.zzx), new yk8(-10, zzba.zzy));
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            t.put(-16, zzba.zzw);
        }
        if (i >= 27) {
            t.put(1, zzba.zzA);
            t.put(2, zzba.zzB);
            t.put(0, zzba.zzC);
            t.put(3, zzba.zzD);
        }
        if (i >= 29) {
            t.put(4, zzba.zzz);
        }
        return t;
    }
}
