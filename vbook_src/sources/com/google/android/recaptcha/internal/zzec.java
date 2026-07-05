package com.google.android.recaptcha.internal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzec implements zzcn {
    private final zzdt zza;
    private final zzek zzb;
    private at1 zzc = jxe.c();
    private zzbd zzd;
    private zzsc zze;
    private zzcm zzf;
    private final zzbi zzg;

    public zzec(zzdt zzdtVar, zzbi zzbiVar, zzek zzekVar, zzbo zzboVar) {
        zzcl zzclVar;
        this.zza = zzdtVar;
        this.zzg = zzbiVar;
        this.zzb = zzekVar;
        zzclVar = zzcm.zza;
        this.zzf = zzclVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzl(defpackage.xt4 r5, defpackage.m42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzdv
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzdv r0 = (com.google.android.recaptcha.internal.zzdv) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdv r0 = new com.google.android.recaptcha.internal.zzdv
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r4 = r0.zza
            int r6 = r0.zzc
            r1 = 1
            if (r6 == 0) goto L2e
            if (r6 != r1) goto L27
            com.google.android.recaptcha.internal.zzbn r5 = r0.zzd
            defpackage.hre.r(r4)
            goto L43
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.hre.r(r4)
            com.google.android.recaptcha.internal.zzbn r4 = new com.google.android.recaptcha.internal.zzbn
            r4.<init>()
            r0.zzd = r4
            r0.zzc = r1
            java.lang.Object r5 = r5.invoke(r0)
            n82 r6 = defpackage.n82.a
            if (r5 == r6) goto L51
            r5 = r4
        L43:
            r5.zzc()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r5.zza(r4)
            java.lang.Long r6 = new java.lang.Long
            r6.<init>(r4)
        L51:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzec.zzl(xt4, m42):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        if (zzn(r9, r0) != r5) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0075 A[Catch: Exception -> 0x002f, TRY_ENTER, TryCatch #1 {Exception -> 0x002f, blocks: (B:13:0x002b, B:25:0x0062, B:30:0x0075, B:31:0x007e), top: B:52:0x002b }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzm(long r9, defpackage.m42 r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.google.android.recaptcha.internal.zzdw
            if (r0 == 0) goto L13
            r0 = r11
            com.google.android.recaptcha.internal.zzdw r0 = (com.google.android.recaptcha.internal.zzdw) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdw r0 = new com.google.android.recaptcha.internal.zzdw
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.zzb
            int r1 = r0.zzd
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L3f
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            long r8 = r0.zza
            com.google.android.recaptcha.internal.zzec r10 = r0.zze
            defpackage.hre.r(r11)     // Catch: java.lang.Exception -> L2f
            goto L62
        L2f:
            r8 = move-exception
            goto L82
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r4
        L37:
            long r9 = r0.zza
            com.google.android.recaptcha.internal.zzec r8 = r0.zze
            defpackage.hre.r(r11)
            goto L4e
        L3f:
            defpackage.hre.r(r11)
            r0.zze = r8
            r0.zza = r9
            r0.zzd = r3
            java.lang.Object r11 = r8.zzn(r9, r0)
            if (r11 == r5) goto Lb9
        L4e:
            com.google.android.recaptcha.internal.zzdy r11 = new com.google.android.recaptcha.internal.zzdy     // Catch: java.lang.Exception -> L7f
            r11.<init>(r9, r8, r4)     // Catch: java.lang.Exception -> L7f
            r0.zze = r8     // Catch: java.lang.Exception -> L7f
            r0.zza = r9     // Catch: java.lang.Exception -> L7f
            r0.zzd = r2     // Catch: java.lang.Exception -> L7f
            java.lang.Object r11 = r8.zzl(r11, r0)     // Catch: java.lang.Exception -> L7f
            if (r11 == r5) goto Lb9
            r6 = r9
            r10 = r8
            r8 = r6
        L62:
            java.lang.Number r11 = (java.lang.Number) r11     // Catch: java.lang.Exception -> L2f
            long r0 = r11.longValue()     // Catch: java.lang.Exception -> L2f
            long r8 = r8 - r0
            r0 = 500(0x1f4, double:2.47E-321)
            int r11 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r11 < 0) goto L75
            java.lang.Long r10 = new java.lang.Long
            r10.<init>(r8)
            return r10
        L75:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd     // Catch: java.lang.Exception -> L2f
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzc     // Catch: java.lang.Exception -> L2f
            com.google.android.recaptcha.internal.zzba r11 = com.google.android.recaptcha.internal.zzba.zzar     // Catch: java.lang.Exception -> L2f
            r8.<init>(r9, r11, r4)     // Catch: java.lang.Exception -> L2f
            throw r8     // Catch: java.lang.Exception -> L2f
        L7f:
            r9 = move-exception
            r10 = r8
            r8 = r9
        L82:
            boolean r9 = r8 instanceof com.google.android.recaptcha.internal.zzbd
            if (r9 == 0) goto L8a
            r4 = r8
            com.google.android.recaptcha.internal.zzbd r4 = (com.google.android.recaptcha.internal.zzbd) r4
        L8a:
            if (r4 != 0) goto L99
            com.google.android.recaptcha.internal.zzbd r4 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r9 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r11 = com.google.android.recaptcha.internal.zzba.zzar
            java.lang.String r8 = r8.getMessage()
            r4.<init>(r9, r11, r8)
        L99:
            com.google.android.recaptcha.internal.zzcm r8 = r10.zzf
            com.google.android.recaptcha.internal.zzci r9 = com.google.android.recaptcha.internal.zzcm.zza()
            boolean r8 = defpackage.c16.i(r8, r9)
            if (r8 != 0) goto Lb3
            com.google.android.recaptcha.internal.zzcm r8 = r10.zzf
            com.google.android.recaptcha.internal.zzck r9 = com.google.android.recaptcha.internal.zzcm.zzc()
            boolean r8 = defpackage.c16.i(r8, r9)
            if (r8 == 0) goto Lb2
            goto Lb3
        Lb2:
            throw r4
        Lb3:
            com.google.android.recaptcha.internal.zzbd r8 = r10.zzd
            if (r8 == 0) goto Lb8
            r4 = r8
        Lb8:
            throw r4
        Lb9:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzec.zzm(long, m42):java.lang.Object");
    }

    private final Object zzn(long j, m42 m42Var) {
        zzcj zzcjVar;
        zzck zzckVar;
        zzci zzciVar;
        zzck zzckVar2;
        zzcm zzcmVar = this.zzf;
        zzcjVar = zzcm.zzb;
        boolean i = c16.i(zzcmVar, zzcjVar);
        pvc pvcVar = pvc.a;
        if (!i) {
            zzcm zzcmVar2 = this.zzf;
            zzckVar = zzcm.zzc;
            if (!c16.i(zzcmVar2, zzckVar)) {
                zzcm zzcmVar3 = this.zzf;
                zzciVar = zzcm.zzd;
                if (!c16.i(zzcmVar3, zzciVar) || zzo(this.zzd)) {
                    zzckVar2 = zzcm.zzc;
                    this.zzf = zzckVar2;
                    bt1 c = jxe.c();
                    this.zzc = c;
                    z87.v(this.zzg.zza(), null, null, new zzeb(this, c, j, null), 3);
                }
            }
        }
        return pvcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean zzo(Exception exc) {
        if (!(exc instanceof zzbd)) {
            return true;
        }
        zzbd zzbdVar = (zzbd) exc;
        if (!c16.i(zzbdVar.zzb(), zzbb.zzd) && !c16.i(zzbdVar.zzb(), zzbb.zze) && !c16.i(zzbdVar.zzb(), zzbb.zzf)) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c6  */
    @Override // com.google.android.recaptcha.internal.zzcn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zza(java.lang.String r18, com.google.android.recaptcha.RecaptchaAction r19, long r20, defpackage.m42 r22) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzec.zza(java.lang.String, com.google.android.recaptcha.RecaptchaAction, long, m42):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zzcn
    public final Object zzb(long j, m42 m42Var) {
        Object zzn = zzn(j, m42Var);
        if (zzn == n82.a) {
            return zzn;
        }
        return pvc.a;
    }
}
