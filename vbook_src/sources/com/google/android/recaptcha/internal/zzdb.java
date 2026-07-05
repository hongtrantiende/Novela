package com.google.android.recaptcha.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzdb extends n42 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;
    zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdb(zzdc zzdcVar, m42 m42Var) {
        super(m42Var);
        this.zzb = zzdcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object zzg;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzg = this.zzb.zzg(null, null, this);
        return zzg;
    }
}
