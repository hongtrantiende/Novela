package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzh extends aab implements lu4 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ long zzd;
    private /* synthetic */ Object zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzh(zzl zzlVar, String str, long j, m42 m42Var) {
        super(2, m42Var);
        this.zzb = zzlVar;
        this.zzc = str;
        this.zzd = j;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        zzh zzhVar = new zzh(this.zzb, this.zzc, this.zzd, m42Var);
        zzhVar.zze = obj;
        return zzhVar;
    }

    @Override // defpackage.lu4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzh) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        zzek zzekVar;
        zzen zzenVar;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zze;
            hre.r(obj);
        } else {
            hre.r(obj);
            m82 m82Var = (m82) this.zze;
            zzekVar = this.zzb.zzb;
            if (zzekVar != null) {
                zzekVar.zzc(this.zzc);
                zzenVar = zzekVar.zzf(31);
            } else {
                zzenVar = null;
            }
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                if (zzeVar.zzl()) {
                    arrayList.add(z87.s(m82Var, null, new zzg(zzeVar, this.zzc, this.zzd, null), 3));
                }
            }
            gz2[] gz2VarArr = (gz2[]) arrayList.toArray(new gz2[0]);
            this.zze = zzenVar;
            this.zza = 1;
            obj = nxe.o((gz2[]) Arrays.copyOf(gz2VarArr, gz2VarArr.length), this);
            n82 n82Var = n82.a;
            if (obj == n82Var) {
                return n82Var;
            }
        }
        String str = this.zzc;
        zzsh zzf = zzsi.zzf();
        zzf.zze(str);
        for (hs9 hs9Var : (List) obj) {
            Object obj2 = hs9Var.a;
            if (!(obj2 instanceof gs9)) {
                zzf.zzh((zzsi) obj2);
            }
        }
        zzsi zzsiVar = (zzsi) zzf.zzk();
        if (zzenVar != null) {
            zzenVar.zza();
        }
        return zzsiVar;
    }
}
