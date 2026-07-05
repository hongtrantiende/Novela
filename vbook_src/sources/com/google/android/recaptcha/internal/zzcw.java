package com.google.android.recaptcha.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzcw extends n42 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzdc zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcw(zzdc zzdcVar, m42 m42Var) {
        super(m42Var);
        this.zzb = zzdcVar;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object mo3execute0E7RQCE = this.zzb.mo3execute0E7RQCE(null, 0L, this);
        if (mo3execute0E7RQCE == n82.a) {
            return mo3execute0E7RQCE;
        }
        return new hs9(mo3execute0E7RQCE);
    }
}
