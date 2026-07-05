package com.google.android.recaptcha.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzdx extends aab implements lu4 {
    int zza;
    final /* synthetic */ zzec zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdx(zzec zzecVar, m42 m42Var) {
        super(2, m42Var);
        this.zzb = zzecVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new zzdx(this.zzb, m42Var);
    }

    @Override // defpackage.lu4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdx) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        at1 at1Var;
        int i = this.zza;
        hre.r(obj);
        if (i == 0) {
            at1Var = this.zzb.zzc;
            this.zza = 1;
            Object r = ((bt1) at1Var).r(this);
            n82 n82Var = n82.a;
            if (r == n82Var) {
                return n82Var;
            }
        }
        return pvc.a;
    }
}
