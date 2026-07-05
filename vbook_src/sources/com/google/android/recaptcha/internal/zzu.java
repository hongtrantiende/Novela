package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzu extends aab implements lu4 {
    Object zza;
    Object zzb;
    int zzc;
    final /* synthetic */ zzsc zzd;
    final /* synthetic */ zzv zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzu(zzsc zzscVar, zzv zzvVar, m42 m42Var) {
        super(2, m42Var);
        this.zzd = zzscVar;
        this.zze = zzvVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new zzu(this.zzd, this.zze, m42Var);
    }

    @Override // defpackage.lu4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzu) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        zzse zzj;
        List list;
        Iterator it;
        if (this.zzc != 0) {
            it = (Iterator) this.zzb;
            zzj = (zzse) this.zza;
            hre.r(obj);
        } else {
            hre.r(obj);
            if (!this.zzd.zzS()) {
                return new hs9(new gs9(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
            zzj = this.zzd.zzj();
            if (zzj.zzi().zzd() != 0) {
                this.zze.zzc = zzj.zzi();
                list = this.zze.zzb;
                it = list.iterator();
            } else {
                return new hs9(new gs9(new zzbd(zzbb.zzb, zzba.zzab, null)));
            }
        }
        while (it.hasNext()) {
            this.zza = zzj;
            this.zzb = it;
            this.zzc = 1;
            Object zzd = ((zzy) it.next()).zzd(zzj, this);
            n82 n82Var = n82.a;
            if (zzd == n82Var) {
                return n82Var;
            }
        }
        return new hs9(pvc.a);
    }
}
