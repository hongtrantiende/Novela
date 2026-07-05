package com.google.android.recaptcha.internal;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzfq extends aab implements lu4 {
    int zza;
    final /* synthetic */ zzgd zzb;
    final /* synthetic */ List zzc;
    final /* synthetic */ zzft zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfq(zzgd zzgdVar, List list, zzft zzftVar, m42 m42Var) {
        super(2, m42Var);
        this.zzb = zzgdVar;
        this.zzc = list;
        this.zzd = zzftVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        zzfq zzfqVar = new zzfq(this.zzb, this.zzc, this.zzd, m42Var);
        zzfqVar.zze = obj;
        return zzfqVar;
    }

    @Override // defpackage.lu4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfq) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Object zzh;
        int i = this.zza;
        pvc pvcVar = pvc.a;
        hre.r(obj);
        if (i != 0) {
            return pvcVar;
        }
        m82 m82Var = (m82) this.zze;
        while (true) {
            zzgd zzgdVar = this.zzb;
            if (zzgdVar.zza() < 0) {
                break;
            }
            if (zzgdVar.zza() >= this.zzc.size() || !k27.v(m82Var)) {
                break;
            }
            zzuf zzufVar = (zzuf) this.zzc.get(this.zzb.zza());
            try {
                zzft.zzf(this.zzd, zzufVar, this.zzb);
            } catch (Exception e) {
                zzufVar.zzk();
                nc2.c(zzufVar.zzg());
                sl1.i0(zzufVar.zzj(), null, null, null, new zzfp(this.zzd), 31);
                zzft zzftVar = this.zzd;
                zzgd zzgdVar2 = this.zzb;
                this.zza = 1;
                zzh = zzftVar.zzh(e, zzgdVar2, this);
                n82 n82Var = n82.a;
                if (zzh == n82Var) {
                    return n82Var;
                }
            }
        }
        return pvcVar;
    }
}
