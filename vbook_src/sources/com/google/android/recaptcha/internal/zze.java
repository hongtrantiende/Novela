package com.google.android.recaptcha.internal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public abstract class zze {
    private boolean zza;

    public zzen zza(String str) {
        throw null;
    }

    public zzen zzb() {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0083 A[Catch: Exception -> 0x0050, TRY_LEAVE, TryCatch #0 {Exception -> 0x0050, blocks: (B:20:0x004c, B:28:0x0078, B:30:0x0083), top: B:45:0x004c }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzc(java.lang.String r11, long r12, defpackage.m42 r14) {
        /*
            Method dump skipped, instructions count: 195
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zzc(java.lang.String, long, m42):java.lang.Object");
    }

    public abstract Object zzd(String str, m42 m42Var);

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0075, code lost:
        if (r10 != r7) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082 A[Catch: Exception -> 0x0086, TRY_LEAVE, TryCatch #0 {Exception -> 0x0086, blocks: (B:28:0x0077, B:30:0x0082, B:26:0x0066), top: B:47:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0089 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zze(long r10, com.google.android.recaptcha.internal.zzsc r12, defpackage.m42 r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzc
            if (r0 == 0) goto L13
            r0 = r13
            com.google.android.recaptcha.internal.zzc r0 = (com.google.android.recaptcha.internal.zzc) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzc r0 = new com.google.android.recaptcha.internal.zzc
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.zzb
            int r1 = r0.zzd
            r2 = 0
            pvc r3 = defpackage.pvc.a
            r4 = 3
            r5 = 2
            r6 = 1
            n82 r7 = defpackage.n82.a
            if (r1 == 0) goto L57
            if (r1 == r6) goto L45
            if (r1 == r5) goto L3b
            if (r1 != r4) goto L35
            java.lang.Object r9 = r0.zza
            com.google.android.recaptcha.internal.zzbd r9 = (com.google.android.recaptcha.internal.zzbd) r9
            defpackage.hre.r(r13)
            goto Lb2
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            return r2
        L3b:
            com.google.android.recaptcha.internal.zzen r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            defpackage.hre.r(r13)
            goto L9d
        L45:
            com.google.android.recaptcha.internal.zzen r9 = r0.zze
            java.lang.Object r10 = r0.zza
            com.google.android.recaptcha.internal.zze r10 = (com.google.android.recaptcha.internal.zze) r10
            defpackage.hre.r(r13)     // Catch: java.lang.Exception -> L53
            r8 = r13
            r13 = r9
            r9 = r10
            r10 = r8
            goto L77
        L53:
            r11 = move-exception
            r13 = r9
            r9 = r10
            goto L8a
        L57:
            defpackage.hre.r(r13)
            com.google.android.recaptcha.internal.zzen r13 = r9.zzb()
            boolean r1 = r9.zza
            if (r1 == 0) goto L66
            r13.zza()
            return r3
        L66:
            com.google.android.recaptcha.internal.zzd r1 = new com.google.android.recaptcha.internal.zzd     // Catch: java.lang.Exception -> L86
            r1.<init>(r9, r12, r2)     // Catch: java.lang.Exception -> L86
            r0.zza = r9     // Catch: java.lang.Exception -> L86
            r0.zze = r13     // Catch: java.lang.Exception -> L86
            r0.zzd = r6     // Catch: java.lang.Exception -> L86
            java.lang.Object r10 = defpackage.k27.E(r10, r1, r0)     // Catch: java.lang.Exception -> L86
            if (r10 == r7) goto Lb7
        L77:
            hs9 r10 = (defpackage.hs9) r10     // Catch: java.lang.Exception -> L86
            java.lang.Object r10 = r10.a     // Catch: java.lang.Exception -> L86
            defpackage.hre.r(r10)     // Catch: java.lang.Exception -> L86
            r9.zza = r6     // Catch: java.lang.Exception -> L86
            if (r13 == 0) goto L89
            r13.zza()     // Catch: java.lang.Exception -> L86
            return r3
        L86:
            r10 = move-exception
            r11 = r10
            goto L8a
        L89:
            return r3
        L8a:
            r10 = 0
            r9.zza = r10
            r0.zza = r9
            r0.zze = r13
            r0.zzd = r5
            java.lang.Object r10 = r9.zzj(r11, r0)
            if (r10 == r7) goto Lb7
            r8 = r10
            r10 = r9
            r9 = r13
            r13 = r8
        L9d:
            r11 = r13
            com.google.android.recaptcha.internal.zzbd r11 = (com.google.android.recaptcha.internal.zzbd) r11
            if (r9 == 0) goto La5
            r9.zzb(r11)
        La5:
            r0.zza = r11
            r0.zze = r2
            r0.zzd = r4
            java.lang.Object r9 = r10.zzg(r11, r0)
            if (r9 == r7) goto Lb7
            r9 = r11
        Lb2:
            gs9 r9 = defpackage.hre.i(r9)
            return r9
        Lb7:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zze.zze(long, com.google.android.recaptcha.internal.zzsc, m42):java.lang.Object");
    }

    public abstract Object zzf(String str, m42 m42Var);

    public Object zzg(zzbd zzbdVar, m42 m42Var) {
        return pvc.a;
    }

    public abstract Object zzh(zzsc zzscVar, m42 m42Var);

    public Object zzi(String str, long j, Exception exc, m42 m42Var) {
        return pvc.a;
    }

    public Object zzj(Exception exc, m42 m42Var) {
        return zzf.zza(exc, new zzbd(zzbb.zzb, zzba.zzap, exc.getMessage()));
    }

    public final boolean zzl() {
        return this.zza;
    }

    public void zzk(zzsr zzsrVar) {
    }
}
