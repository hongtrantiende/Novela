package com.google.android.recaptcha.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzim extends n42 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzja zzb;
    int zzc;
    zzja zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzim(zzja zzjaVar, m42 m42Var) {
        super(m42Var);
        this.zzb = zzjaVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object zzE;
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        zzE = this.zzb.zzE(null, this);
        return zzE;
    }
}
