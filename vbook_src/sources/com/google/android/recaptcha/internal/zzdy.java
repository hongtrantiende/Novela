package com.google.android.recaptcha.internal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class zzdy extends aab implements xt4 {
    int zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ zzec zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdy(long j, zzec zzecVar, m42 m42Var) {
        super(1, m42Var);
        this.zzb = j;
        this.zzc = zzecVar;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        return new zzdy(this.zzb, this.zzc, m42Var);
    }

    @Override // defpackage.xt4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzdy) create((m42) obj)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        int i = this.zza;
        hre.r(obj);
        if (i == 0) {
            long j = this.zzb;
            zzdx zzdxVar = new zzdx(this.zzc, null);
            this.zza = 1;
            Object E = k27.E(j, zzdxVar, this);
            n82 n82Var = n82.a;
            if (E == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }
}
