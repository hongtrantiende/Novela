package com.google.android.recaptcha.internal;

import com.google.android.recaptcha.RecaptchaAction;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class zzda extends aab implements lu4 {
    int zza;
    final /* synthetic */ zzdc zzb;
    final /* synthetic */ RecaptchaAction zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzda(zzdc zzdcVar, RecaptchaAction recaptchaAction, long j, m42 m42Var) {
        super(2, m42Var);
        this.zzb = zzdcVar;
        this.zzc = recaptchaAction;
        this.zzd = j;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new zzda(this.zzb, this.zzc, this.zzd, m42Var);
    }

    @Override // defpackage.lu4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzda) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object zzf;
        int i = this.zza;
        hre.r(obj);
        if (i != 0) {
            zzf = ((hs9) obj).a;
        } else {
            zzdc zzdcVar = this.zzb;
            RecaptchaAction recaptchaAction = this.zzc;
            long j = this.zzd;
            this.zza = 1;
            zzf = zzdcVar.zzf(recaptchaAction, j, this);
            n82 n82Var = n82.a;
            if (zzf == n82Var) {
                return n82Var;
            }
        }
        hre.r(zzf);
        return zzf;
    }
}
