package com.google.android.recaptcha.internal;

import java.util.concurrent.Executors;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzbi {
    private final m82 zza = k27.d();
    private final m82 zzb;
    private final m82 zzc;
    private final m82 zzd;

    public zzbi() {
        m41 a = k27.a(new vy3(Executors.newSingleThreadExecutor()));
        z87.v(a, null, null, new zzbh(null), 3);
        this.zzb = a;
        this.zzc = k27.a(ru2.c);
        m41 a2 = k27.a(new vy3(Executors.newSingleThreadExecutor()));
        z87.v(a2, null, null, new zzbg(null), 3);
        this.zzd = a2;
    }

    public final m82 zza() {
        return this.zzc;
    }

    public final m82 zzb() {
        return this.zza;
    }

    public final m82 zzc() {
        return this.zzd;
    }

    public final m82 zzd() {
        return this.zzb;
    }
}
