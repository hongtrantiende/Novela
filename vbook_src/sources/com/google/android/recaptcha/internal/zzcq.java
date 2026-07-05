package com.google.android.recaptcha.internal;

import android.app.Application;
import com.google.android.gms.tasks.Task;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzcq {
    private static zzcv zza;

    public static final zzcv zza(Application application) {
        zzcv zzcvVar = zza;
        if (zzcvVar == null) {
            zzcvVar = new zzcv(application);
        }
        if (zza == null) {
            zza = zzcvVar;
        }
        return zzcvVar;
    }

    public static final Object zzb(Application application, String str, long j, m42 m42Var) {
        return zzcv.zzh(zza(application), str, j, null, null, null, m42Var, 28, null);
    }

    public static final Task zzc(Application application, String str, long j) {
        return zzas.zza(z87.s(zza(application).zzd().zza(), null, new zzco(application, str, j, null), 3));
    }

    public static final Object zzd(Application application, String str, m42 m42Var) {
        return zzcv.zzf(zza(application), str, null, null, m42Var, 6, null);
    }

    public static final Task zze(Application application, String str) {
        return zzas.zza(z87.s(zza(application).zzd().zza(), null, new zzcp(application, str, null), 3));
    }
}
