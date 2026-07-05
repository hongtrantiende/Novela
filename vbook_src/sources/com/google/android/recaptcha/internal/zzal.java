package com.google.android.recaptcha.internal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
final class zzal extends aab implements lu4 {
    long zza;
    boolean zzb;
    int zzc;
    final /* synthetic */ zzan zzd;
    final /* synthetic */ zzen zze;
    final /* synthetic */ zl9 zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzal(zzan zzanVar, zzen zzenVar, zl9 zl9Var, m42 m42Var) {
        super(2, m42Var);
        this.zzd = zzanVar;
        this.zze = zzenVar;
        this.zzf = zl9Var;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new zzal(this.zzd, this.zze, this.zzf, m42Var);
    }

    @Override // defpackage.lu4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzal) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002e, code lost:
        if (r8 != r3) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x007c, code lost:
        if (defpackage.ade.q(r4, r7) != r3) goto L5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0081, code lost:
        return r3;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0024 A[Catch: Exception -> 0x001a, TRY_ENTER, TryCatch #0 {Exception -> 0x001a, blocks: (B:14:0x0024, B:16:0x0030, B:8:0x0016), top: B:41:0x0016 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0083  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0049 -> B:13:0x0022). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x007c -> B:6:0x0011). Please submit an issue!!! */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.zzc
            r1 = 0
            r2 = 1
            n82 r3 = defpackage.n82.a
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L14
            boolean r0 = r7.zzb
            long r4 = r7.zza
            defpackage.hre.r(r8)
        L11:
            r8 = r0
            goto L7f
        L14:
            long r4 = r7.zza
            defpackage.hre.r(r8)     // Catch: java.lang.Exception -> L1a
            goto L30
        L1a:
            r8 = move-exception
            goto L4b
        L1c:
            defpackage.hre.r(r8)
            r4 = 1000(0x3e8, double:4.94E-321)
            r8 = r2
        L22:
            if (r8 == 0) goto L83
            com.google.android.recaptcha.internal.zzan r8 = r7.zzd     // Catch: java.lang.Exception -> L1a
            r7.zza = r4     // Catch: java.lang.Exception -> L1a
            r7.zzc = r2     // Catch: java.lang.Exception -> L1a
            java.lang.Object r8 = com.google.android.recaptcha.internal.zzan.zza(r8, r7)     // Catch: java.lang.Exception -> L1a
            if (r8 == r3) goto L81
        L30:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r8     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzan r0 = r7.zzd     // Catch: java.lang.Exception -> L1a
            at1 r0 = r0.zzf()     // Catch: java.lang.Exception -> L1a
            bt1 r0 = (defpackage.bt1) r0     // Catch: java.lang.Exception -> L1a
            r0.P(r8)     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzan r8 = r7.zzd     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzao r0 = com.google.android.recaptcha.internal.zzao.zzc     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzan.zzh(r8, r0)     // Catch: java.lang.Exception -> L1a
            com.google.android.recaptcha.internal.zzen r8 = r7.zze     // Catch: java.lang.Exception -> L1a
            r8.zza()     // Catch: java.lang.Exception -> L1a
            r8 = r1
            goto L22
        L4b:
            zl9 r0 = r7.zzf
            r0.a = r8
            boolean r0 = r8 instanceof com.google.android.play.core.integrity.StandardIntegrityException
            if (r0 == 0) goto L6c
            r0 = r8
            com.google.android.play.core.integrity.StandardIntegrityException r0 = (com.google.android.play.core.integrity.StandardIntegrityException) r0
            int r0 = r0.getErrorCode()
            r6 = -100
            if (r0 == r6) goto L6e
            r6 = -18
            if (r0 == r6) goto L6e
            r6 = -12
            if (r0 == r6) goto L6e
            r6 = -8
            if (r0 == r6) goto L6e
            r6 = -3
            if (r0 == r6) goto L6e
        L6c:
            r0 = r1
            goto L6f
        L6e:
            r0 = r2
        L6f:
            if (r0 == 0) goto L82
            r7.zza = r4
            r7.zzb = r2
            r8 = 2
            r7.zzc = r8
            java.lang.Object r8 = defpackage.ade.q(r4, r7)
            if (r8 == r3) goto L81
            goto L11
        L7f:
            long r4 = r4 + r4
            goto L22
        L81:
            return r3
        L82:
            throw r8
        L83:
            pvc r7 = defpackage.pvc.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzal.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
