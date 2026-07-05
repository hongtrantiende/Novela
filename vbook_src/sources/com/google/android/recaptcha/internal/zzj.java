package com.google.android.recaptcha.internal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class zzj extends aab implements lu4 {
    int zza;
    final /* synthetic */ zze zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ zzsc zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzj(zze zzeVar, long j, zzsc zzscVar, m42 m42Var) {
        super(2, m42Var);
        this.zzb = zzeVar;
        this.zzc = j;
        this.zzd = zzscVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new zzj(this.zzb, this.zzc, this.zzd, m42Var);
    }

    @Override // defpackage.lu4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzj) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object zze;
        int i = this.zza;
        hre.r(obj);
        if (i != 0) {
            zze = ((hs9) obj).a;
        } else {
            zze zzeVar = this.zzb;
            long j = this.zzc;
            zzsc zzscVar = this.zzd;
            this.zza = 1;
            zze = zzeVar.zze(j, zzscVar, this);
            n82 n82Var = n82.a;
            if (zze == n82Var) {
                return n82Var;
            }
        }
        return new hs9(zze);
    }
}
