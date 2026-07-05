package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzs extends aab implements lu4 {
    int zza;
    final /* synthetic */ zzv zzb;
    final /* synthetic */ String zzc;
    private /* synthetic */ Object zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzs(zzv zzvVar, String str, m42 m42Var) {
        super(2, m42Var);
        this.zzb = zzvVar;
        this.zzc = str;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        zzs zzsVar = new zzs(this.zzb, this.zzc, m42Var);
        zzsVar.zzd = obj;
        return zzsVar;
    }

    @Override // defpackage.lu4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzs) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        zzsi zzq;
        List list;
        int i = this.zza;
        hre.r(obj);
        if (i == 0) {
            m82 m82Var = (m82) this.zzd;
            ArrayList arrayList = new ArrayList();
            this.zzb.zzo().put(this.zzc, arrayList);
            ArrayList arrayList2 = new ArrayList();
            list = this.zzb.zzb;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (((zzy) obj2).zzf()) {
                    arrayList3.add(obj2);
                }
            }
            int size = arrayList3.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayList3.get(i2);
                i2++;
                arrayList2.add(z87.v(m82Var, null, null, new zzr((zzy) obj3, this.zzc, arrayList, null), 3));
            }
            w26[] w26VarArr = (w26[]) arrayList2.toArray(new w26[0]);
            this.zza = 1;
            Object A = nxe.A((w26[]) Arrays.copyOf(w26VarArr, w26VarArr.length), this);
            n82 n82Var = n82.a;
            if (A == n82Var) {
                return n82Var;
            }
        }
        zzq = this.zzb.zzq(this.zzc);
        return new hs9(zzq);
    }
}
