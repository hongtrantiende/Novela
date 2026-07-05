package com.google.android.recaptcha.internal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class zzaj extends aab implements lu4 {
    int zza;
    final /* synthetic */ zzan zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzaj(zzan zzanVar, m42 m42Var) {
        super(2, m42Var);
        this.zzb = zzanVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new zzaj(this.zzb, m42Var);
    }

    @Override // defpackage.lu4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzaj) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        hre.r(obj);
        if (i == 0) {
            this.zzb.zze = zzao.zza;
            zzan zzanVar = this.zzb;
            this.zza = 1;
            Object zze = zzanVar.zze(this);
            n82 n82Var = n82.a;
            if (zze == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }
}
