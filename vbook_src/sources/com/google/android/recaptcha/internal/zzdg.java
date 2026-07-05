package com.google.android.recaptcha.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzdg extends aab implements lu4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzdt zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ long zze;
    final /* synthetic */ zzsp zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdg(zzdt zzdtVar, String str, long j, zzsp zzspVar, m42 m42Var) {
        super(2, m42Var);
        this.zzc = zzdtVar;
        this.zzd = str;
        this.zze = j;
        this.zzf = zzspVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new zzdg(this.zzc, this.zzd, this.zze, this.zzf, m42Var);
    }

    @Override // defpackage.lu4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzdg) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v7 */
    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        zzbd zzs;
        zzbd zzs2;
        zzbd zzs3;
        zzek zzu;
        zzen zzenVar = this.zzb;
        try {
            if (zzenVar != 0) {
                zzen zzenVar2 = (zzen) this.zza;
                hre.r(obj);
                zzenVar = zzenVar2;
            } else {
                hre.r(obj);
                zzu = this.zzc.zzu(this.zzd);
                zzen zzf = zzu.zzf(28);
                long j = this.zze;
                zzdf zzdfVar = new zzdf(this.zzc, this.zzf, zzf, null);
                this.zza = zzf;
                this.zzb = 1;
                obj = k27.E(j, zzdfVar, this);
                n82 n82Var = n82.a;
                zzenVar = zzf;
                if (obj == n82Var) {
                    return n82Var;
                }
            }
            return (zzsr) obj;
        } catch (zzbd e) {
            zzs3 = this.zzc.zzs(e, e);
            zzenVar.zzb(zzs3);
            throw zzs3;
        } catch (eac e2) {
            zzs2 = this.zzc.zzs(e2, new zzbd(zzbb.zzc, zzba.zzb, e2.getMessage()));
            zzenVar.zzb(zzs2);
            throw zzs2;
        } catch (Exception e3) {
            zzs = this.zzc.zzs(e3, new zzbd(zzbb.zzc, zzba.zzZ, e3.getMessage()));
            zzenVar.zzb(zzs);
            throw zzs;
        }
    }
}
