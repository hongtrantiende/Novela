package com.google.android.recaptcha.internal;

import android.app.Application;
import android.os.Build;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzdh extends aab implements lu4 {
    int zza;
    final /* synthetic */ zzdt zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdh(zzdt zzdtVar, m42 m42Var) {
        super(2, m42Var);
        this.zzb = zzdtVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new zzdh(this.zzb, m42Var);
    }

    @Override // defpackage.lu4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdh) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        Application zzr;
        String str;
        Application zzr2;
        zzek zzekVar;
        zzbf zzt;
        int i = this.zza;
        hre.r(obj);
        if (i != 0) {
            return obj;
        }
        zzbs zzbsVar = new zzbs(vz4.b);
        zzr = this.zzb.zzr();
        int zza = zzbsVar.zza(zzr);
        zzdt zzdtVar = this.zzb;
        str = zzdtVar.zza;
        zzr2 = zzdtVar.zzr();
        String packageName = zzr2.getPackageName();
        zzekVar = this.zzb.zzb;
        String zzd = zzekVar.zzd();
        zzt = this.zzb.zzt();
        int i2 = Build.VERSION.SDK_INT;
        String zza2 = zzt.zza();
        zztn zzf = zzto.zzf();
        zzf.zzt(str);
        zzf.zzq(packageName);
        zzf.zzu(zza);
        zzf.zzr("18.6.1");
        zzf.zzs(zzd);
        zzf.zzf(String.valueOf(i2));
        zzf.zze(zza2);
        zzdt zzdtVar2 = this.zzb;
        zzff zzg = zzdt.zzg(zzdtVar2);
        String zzb = zzdt.zzd(zzdtVar2).zzb();
        this.zza = 1;
        Object zzc = zzg.zzc(zzb, (zzto) zzf.zzk(), this);
        n82 n82Var = n82.a;
        if (zzc == n82Var) {
            return n82Var;
        }
        return zzc;
    }
}
