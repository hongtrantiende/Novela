package com.google.android.recaptcha;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class Recaptcha$getClient$1 extends n42 {
    /* synthetic */ Object zza;
    final /* synthetic */ Recaptcha zzb;
    int zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Recaptcha$getClient$1(Recaptcha recaptcha, m42 m42Var) {
        super(m42Var);
        this.zzb = recaptcha;
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        this.zza = obj;
        this.zzc |= Integer.MIN_VALUE;
        Object m2getClientBWLJW6A = this.zzb.m2getClientBWLJW6A(null, null, 0L, this);
        if (m2getClientBWLJW6A == n82.a) {
            return m2getClientBWLJW6A;
        }
        return new hs9(m2getClientBWLJW6A);
    }
}
