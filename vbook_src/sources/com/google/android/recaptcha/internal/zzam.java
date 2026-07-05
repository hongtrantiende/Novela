package com.google.android.recaptcha.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzam extends aab implements lu4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzan zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzam(zzan zzanVar, zzen zzenVar, m42 m42Var) {
        super(2, m42Var);
        this.zzc = zzanVar;
        this.zzd = zzenVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new zzam(this.zzc, this.zzd, m42Var);
    }

    @Override // defpackage.lu4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzam) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v8, types: [zl9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r4v7 */
    @Override // defpackage.hh0
    public final Object invokeSuspend(Object obj) {
        zl9 zl9Var = this.zzb;
        try {
            if (zl9Var != 0) {
                zl9 zl9Var2 = (zl9) this.zza;
                hre.r(obj);
                zl9Var = zl9Var2;
                this = this;
            } else {
                hre.r(obj);
                ?? obj2 = new Object();
                zzal zzalVar = new zzal(this.zzc, this.zzd, obj2, null);
                this.zza = obj2;
                this.zzb = 1;
                Object E = k27.E(60000L, zzalVar, this);
                n82 n82Var = n82.a;
                zl9Var = obj2;
                this = E;
                if (E == n82Var) {
                    return n82Var;
                }
            }
        } catch (Exception e) {
            at1 zzf = this.zzc.zzf();
            Throwable th = (Throwable) zl9Var.a;
            if (th == null) {
                th = e;
            }
            ((bt1) zzf).o0(th);
            this.zzc.zze = zzao.zza;
            this.zzd.zzb(new zzbd(zzbb.zzb, zzba.zza, e.getMessage()));
        }
        return pvc.a;
    }
}
