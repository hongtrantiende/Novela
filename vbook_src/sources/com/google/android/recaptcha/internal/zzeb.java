package com.google.android.recaptcha.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzeb extends aab implements lu4 {
    int zza;
    final /* synthetic */ zzec zzb;
    final /* synthetic */ at1 zzc;
    final /* synthetic */ long zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzeb(zzec zzecVar, at1 at1Var, long j, m42 m42Var) {
        super(2, m42Var);
        this.zzb = zzecVar;
        this.zzc = at1Var;
        this.zzd = j;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new zzeb(this.zzb, this.zzc, this.zzd, m42Var);
    }

    @Override // defpackage.lu4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzeb) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        zzbd zzbdVar;
        zzeb zzebVar;
        zzci zzciVar;
        zzbd e;
        zzbq zzbqVar;
        zzdz zzdzVar;
        zzea zzeaVar;
        if (this.zza != 0) {
            try {
                hre.r(obj);
                zzebVar = this;
            } catch (zzbd e2) {
                zzbdVar = e2;
                zzebVar = this;
                zzec zzecVar = zzebVar.zzb;
                zzciVar = zzcm.zzd;
                zzecVar.zzf = zzciVar;
                ((bt1) zzebVar.zzc).o0(zzbdVar);
                return pvc.a;
            }
        } else {
            hre.r(obj);
            try {
                zzbqVar = zzbq.zza;
                zzdzVar = new zzdz(this.zzb);
                zzeaVar = new zzea(this.zzb, this.zzd, this.zzc, null);
                this.zza = 1;
                zzebVar = this;
            } catch (zzbd e3) {
                e = e3;
                zzebVar = this;
                zzbdVar = e;
                zzec zzecVar2 = zzebVar.zzb;
                zzciVar = zzcm.zzd;
                zzecVar2.zzf = zzciVar;
                ((bt1) zzebVar.zzc).o0(zzbdVar);
                return pvc.a;
            }
            try {
                obj = zzbqVar.zza(zzdzVar, 100L, 1000L, 2.0d, zzeaVar, zzebVar);
                n82 n82Var = n82.a;
                if (obj == n82Var) {
                    return n82Var;
                }
            } catch (zzbd e4) {
                e = e4;
                zzbdVar = e;
                zzec zzecVar22 = zzebVar.zzb;
                zzciVar = zzcm.zzd;
                zzecVar22.zzf = zzciVar;
                ((bt1) zzebVar.zzc).o0(zzbdVar);
                return pvc.a;
            }
        }
        ((Boolean) obj).getClass();
        return pvc.a;
    }
}
