package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzk extends aab implements lu4 {
    int zza;
    final /* synthetic */ zzl zzb;
    final /* synthetic */ zzek zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ zzsc zze;
    private /* synthetic */ Object zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzk(zzl zzlVar, zzek zzekVar, long j, zzsc zzscVar, m42 m42Var) {
        super(2, m42Var);
        this.zzb = zzlVar;
        this.zzc = zzekVar;
        this.zzd = j;
        this.zze = zzscVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        zzk zzkVar = new zzk(this.zzb, this.zzc, this.zzd, this.zze, m42Var);
        zzkVar.zzf = obj;
        return zzkVar;
    }

    @Override // defpackage.lu4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzk) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        zzen zzenVar;
        Object obj2;
        if (this.zza != 0) {
            zzenVar = (zzen) this.zzf;
            hre.r(obj);
        } else {
            hre.r(obj);
            m82 m82Var = (m82) this.zzf;
            this.zzb.zzb = this.zzc;
            zzek zzekVar = this.zzc;
            zzekVar.zzc(zzekVar.zzd());
            zzen zzf = zzekVar.zzf(30);
            ArrayList arrayList = new ArrayList();
            for (zze zzeVar : this.zzb.zzd()) {
                arrayList.add(z87.s(m82Var, null, new zzj(zzeVar, this.zzd, this.zze, null), 3));
            }
            gz2[] gz2VarArr = (gz2[]) arrayList.toArray(new gz2[0]);
            this.zzf = zzf;
            this.zza = 1;
            obj = nxe.o((gz2[]) Arrays.copyOf(gz2VarArr, gz2VarArr.length), this);
            n82 n82Var = n82.a;
            if (obj != n82Var) {
                zzenVar = zzf;
            } else {
                return n82Var;
            }
        }
        List<hs9> list = (List) obj;
        if (list == null || !list.isEmpty()) {
            for (hs9 hs9Var : list) {
                if (!(hs9Var.a instanceof gs9)) {
                    zzenVar.zza();
                    obj2 = pvc.a;
                    break;
                }
            }
        }
        zzbd zzbdVar = new zzbd(zzbb.zzb, zzba.zzY, null);
        zzenVar.zzb(zzbdVar);
        obj2 = new gs9(zzbdVar);
        return new hs9(obj2);
    }
}
