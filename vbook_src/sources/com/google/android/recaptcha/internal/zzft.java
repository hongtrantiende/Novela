package com.google.android.recaptcha.internal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzft implements zzfo {
    private final m82 zza;
    private final zzgf zzb;
    private final zzhx zzc;
    private final Map zzd;

    public zzft(m82 m82Var, zzgf zzgfVar, zzhx zzhxVar, Map map) {
        this.zza = m82Var;
        this.zzb = zzgfVar;
        this.zzc = zzhxVar;
        this.zzd = map;
    }

    public static final /* synthetic */ void zzf(zzft zzftVar, zzuf zzufVar, zzgd zzgdVar) {
        zzjh zzb = zzjh.zzb();
        int zza = zzgdVar.zza();
        zzgx zzgxVar = (zzgx) zzftVar.zzd.get(Integer.valueOf(zzufVar.zzf()));
        if (zzgxVar != null) {
            int zzg = zzufVar.zzg();
            zzue[] zzueVarArr = (zzue[]) zzufVar.zzj().toArray(new zzue[0]);
            zzgxVar.zza(zzg, zzgdVar, (zzue[]) Arrays.copyOf(zzueVarArr, zzueVarArr.length));
            if (zza == zzgdVar.zza()) {
                zzgdVar.zzg(zzgdVar.zza() + 1);
            }
            zzb.zzf();
            long zza2 = zzb.zza(TimeUnit.MICROSECONDS);
            int i = zzbk.zza;
            int zzk = zzufVar.zzk();
            if (zzk != 1) {
                zzbk.zza(zzk - 2, zza2);
                return;
            } else {
                vs.m("Can't get the number of an unknown enum value.");
                return;
            }
        }
        hfd.f(5, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzg(List list, zzgd zzgdVar, m42 m42Var) {
        Object p = k27.p(new zzfq(zzgdVar, list, this, null), m42Var);
        if (p == n82.a) {
            return p;
        }
        return pvc.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object zzh(Exception exc, zzgd zzgdVar, m42 m42Var) {
        Object p = k27.p(new zzfr(exc, zzgdVar, this, null), m42Var);
        if (p == n82.a) {
            return p;
        }
        return pvc.a;
    }

    @Override // com.google.android.recaptcha.internal.zzfo
    public final void zza(String str) {
        z87.v(this.zza, null, null, new zzfs(new zzgd(this.zzb), this, str, null), 3);
    }
}
