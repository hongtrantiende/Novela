package com.google.android.recaptcha.internal;

import java.util.TimerTask;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzai extends TimerTask {
    final /* synthetic */ zzan zza;

    public zzai(zzan zzanVar) {
        this.zza = zzanVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        m82 m82Var;
        zzan zzanVar = this.zza;
        m82Var = zzanVar.zzb;
        z87.v(m82Var, null, null, new zzaj(zzanVar, null), 3);
    }
}
