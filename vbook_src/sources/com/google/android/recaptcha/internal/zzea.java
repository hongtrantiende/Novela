package com.google.android.recaptcha.internal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class zzea extends aab implements xt4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzec zzc;
    final /* synthetic */ long zzd;
    final /* synthetic */ at1 zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzea(zzec zzecVar, long j, at1 at1Var, m42 m42Var) {
        super(1, m42Var);
        this.zzc = zzecVar;
        this.zzd = j;
        this.zze = at1Var;
    }

    @Override // defpackage.hh0
    public final m42 create(m42 m42Var) {
        return new zzea(this.zzc, this.zzd, this.zze, m42Var);
    }

    @Override // defpackage.xt4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((zzea) create((m42) obj)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        if (r7 != r2) goto L13;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.zzb
            r1 = 1
            n82 r2 = defpackage.n82.a
            if (r0 == 0) goto L17
            java.lang.Object r3 = r6.zza
            com.google.android.recaptcha.internal.zzen r3 = (com.google.android.recaptcha.internal.zzen) r3
            if (r0 == r1) goto L13
            defpackage.hre.r(r7)     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            goto L53
        L11:
            r7 = move-exception
            goto L6f
        L13:
            defpackage.hre.r(r7)     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            goto L38
        L17:
            defpackage.hre.r(r7)
            com.google.android.recaptcha.internal.zzec r7 = r6.zzc
            com.google.android.recaptcha.internal.zzek r7 = com.google.android.recaptcha.internal.zzec.zzd(r7)
            r0 = 41
            com.google.android.recaptcha.internal.zzen r3 = r7.zzf(r0)
            com.google.android.recaptcha.internal.zzec r7 = r6.zzc     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            com.google.android.recaptcha.internal.zzdt r7 = com.google.android.recaptcha.internal.zzec.zzc(r7)     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            long r4 = r6.zzd     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            r6.zza = r3     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            r6.zzb = r1     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            java.lang.Object r7 = r7.zzo(r4, r6)     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            if (r7 == r2) goto L6e
        L38:
            com.google.android.recaptcha.internal.zzsc r7 = (com.google.android.recaptcha.internal.zzsc) r7     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            com.google.android.recaptcha.internal.zzec r0 = r6.zzc     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            com.google.android.recaptcha.internal.zzec.zzh(r0, r7)     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            com.google.android.recaptcha.internal.zzec r0 = r6.zzc     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            com.google.android.recaptcha.internal.zzdt r0 = com.google.android.recaptcha.internal.zzec.zzc(r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            long r4 = r6.zzd     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            r6.zza = r3     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            r1 = 2
            r6.zzb = r1     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            java.lang.Object r7 = r0.zzn(r7, r4, r6)     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            if (r7 != r2) goto L53
            goto L6e
        L53:
            r3.zza()     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            com.google.android.recaptcha.internal.zzec r7 = r6.zzc     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            com.google.android.recaptcha.internal.zzcj r0 = com.google.android.recaptcha.internal.zzcm.zzb()     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            com.google.android.recaptcha.internal.zzec.zzj(r7, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            at1 r7 = r6.zze     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            pvc r0 = defpackage.pvc.a     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            bt1 r7 = (defpackage.bt1) r7     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            boolean r6 = r7.P(r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L11
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L6e:
            return r2
        L6f:
            com.google.android.recaptcha.internal.zzec r6 = r6.zzc
            com.google.android.recaptcha.internal.zzec.zzi(r6, r7)
            r3.zzb(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzea.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
