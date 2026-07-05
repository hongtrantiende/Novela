package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.Task;
import com.google.android.recaptcha.RecaptchaAction;
import com.google.android.recaptcha.RecaptchaClient;
import com.google.android.recaptcha.RecaptchaTasksClient;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzdc implements RecaptchaClient, RecaptchaTasksClient {
    private static final gm9 zza = new gm9("^[a-zA-Z0-9/_]{0,100}$");
    private final zzcn zzb;
    private final String zzc;
    private final zzek zzd;
    private final zzbi zze;

    public zzdc(zzcn zzcnVar, String str, zzbi zzbiVar, zzek zzekVar) {
        this.zzb = zzcnVar;
        this.zzc = str;
        this.zze = zzbiVar;
        this.zzd = zzekVar;
    }

    public static final /* synthetic */ void zze(zzdc zzdcVar, long j, RecaptchaAction recaptchaAction) {
        zzbd zzbdVar;
        if (!zza.g(recaptchaAction.getAction())) {
            zzbdVar = new zzbd(zzbb.zzg, zzba.zzh, null);
        } else {
            zzbdVar = null;
        }
        if (j < 5000) {
            zzbdVar = new zzbd(zzbb.zzb, zzba.zzI, null);
        }
        if (zzbdVar == null) {
            return;
        }
        throw zzbdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzf(com.google.android.recaptcha.RecaptchaAction r11, long r12, defpackage.m42 r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzcy
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzcy r0 = (com.google.android.recaptcha.internal.zzcy) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcy r0 = new com.google.android.recaptcha.internal.zzcy
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r14)     // Catch: com.google.android.recaptcha.internal.zzbd -> L50
            goto L4b
        L25:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            r10 = 0
            return r10
        L2c:
            defpackage.hre.r(r14)
            java.util.UUID r14 = java.util.UUID.randomUUID()     // Catch: com.google.android.recaptcha.internal.zzbd -> L50
            java.lang.String r8 = r14.toString()     // Catch: com.google.android.recaptcha.internal.zzbd -> L50
            com.google.android.recaptcha.internal.zzcz r3 = new com.google.android.recaptcha.internal.zzcz     // Catch: com.google.android.recaptcha.internal.zzbd -> L50
            r9 = 0
            r4 = r10
            r7 = r11
            r5 = r12
            r3.<init>(r4, r5, r7, r8, r9)     // Catch: com.google.android.recaptcha.internal.zzbd -> L50
            r0.zzc = r2     // Catch: com.google.android.recaptcha.internal.zzbd -> L50
            java.lang.Object r14 = r4.zzg(r8, r3, r0)     // Catch: com.google.android.recaptcha.internal.zzbd -> L50
            n82 r10 = defpackage.n82.a
            if (r14 != r10) goto L4b
            return r10
        L4b:
            hs9 r14 = (defpackage.hs9) r14     // Catch: com.google.android.recaptcha.internal.zzbd -> L50
            java.lang.Object r10 = r14.a     // Catch: com.google.android.recaptcha.internal.zzbd -> L50
            return r10
        L50:
            r0 = move-exception
            r10 = r0
            com.google.android.recaptcha.RecaptchaException r10 = r10.zzc()
            gs9 r10 = defpackage.hre.i(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.zzf(com.google.android.recaptcha.RecaptchaAction, long, m42):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzg(java.lang.String r6, defpackage.lu4 r7, defpackage.m42 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzdb
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzdb r0 = (com.google.android.recaptcha.internal.zzdb) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdb r0 = new com.google.android.recaptcha.internal.zzdb
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            com.google.android.recaptcha.internal.zzen r5 = r0.zzd
            defpackage.hre.r(r8)     // Catch: java.lang.Exception -> L27 com.google.android.recaptcha.internal.zzbd -> L29
            goto L51
        L27:
            r6 = move-exception
            goto L5d
        L29:
            r6 = move-exception
            goto L71
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L32:
            defpackage.hre.r(r8)
            com.google.android.recaptcha.internal.zzek r5 = r5.zzd
            com.google.android.recaptcha.internal.zzek r5 = r5.zza()
            r5.zzc(r6)
            r6 = 9
            com.google.android.recaptcha.internal.zzen r6 = r5.zzf(r6)
            r0.zzd = r6     // Catch: java.lang.Exception -> L56 com.google.android.recaptcha.internal.zzbd -> L58
            r0.zzc = r2     // Catch: java.lang.Exception -> L56 com.google.android.recaptcha.internal.zzbd -> L58
            java.lang.Object r8 = r7.invoke(r5, r0)     // Catch: java.lang.Exception -> L56 com.google.android.recaptcha.internal.zzbd -> L58
            n82 r5 = defpackage.n82.a
            if (r8 == r5) goto L55
            r5 = r6
        L51:
            r5.zza()     // Catch: java.lang.Exception -> L27 com.google.android.recaptcha.internal.zzbd -> L29
            return r8
        L55:
            return r5
        L56:
            r5 = move-exception
            goto L5a
        L58:
            r5 = move-exception
            goto L6e
        L5a:
            r4 = r6
            r6 = r5
            r5 = r4
        L5d:
            com.google.android.recaptcha.internal.zzbd r7 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r8 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzX
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r8, r0, r6)
            r5.zzb(r7)
            throw r7
        L6e:
            r4 = r6
            r6 = r5
            r5 = r4
        L71:
            r5.zzb(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.zzg(java.lang.String, lu4, m42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo3execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction r5, long r6, defpackage.m42 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzcw
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzcw r0 = (com.google.android.recaptcha.internal.zzcw) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcw r0 = new com.google.android.recaptcha.internal.zzcw
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.hre.r(r8)
            hs9 r8 = (defpackage.hs9) r8
            java.lang.Object r4 = r8.a
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L30:
            defpackage.hre.r(r8)
            r0.zzc = r2
            java.lang.Object r4 = r4.zzf(r5, r6, r0)
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L3e
            return r5
        L3e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.mo3execute0E7RQCE(com.google.android.recaptcha.RecaptchaAction, long, m42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    @Override // com.google.android.recaptcha.RecaptchaClient
    /* renamed from: execute-gIAlu-s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo4executegIAlus(com.google.android.recaptcha.RecaptchaAction r5, defpackage.m42 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzcx
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzcx r0 = (com.google.android.recaptcha.internal.zzcx) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcx r0 = new com.google.android.recaptcha.internal.zzcx
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L30
            if (r1 != r2) goto L29
            defpackage.hre.r(r6)
            hs9 r6 = (defpackage.hs9) r6
            java.lang.Object r4 = r6.a
            return r4
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r4)
            r4 = 0
            return r4
        L30:
            defpackage.hre.r(r6)
            r0.zzc = r2
            r1 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r4 = r4.mo3execute0E7RQCE(r5, r1, r0)
            n82 r5 = defpackage.n82.a
            if (r4 != r5) goto L40
            return r5
        L40:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdc.mo4executegIAlus(com.google.android.recaptcha.RecaptchaAction, m42):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction) {
        return zzas.zza(z87.s(this.zze.zzb(), null, new zzda(this, recaptchaAction, 10000L, null), 3));
    }

    public final String zzd() {
        return this.zzc;
    }

    @Override // com.google.android.recaptcha.RecaptchaTasksClient
    public final Task<String> executeTask(RecaptchaAction recaptchaAction, long j) {
        return zzas.zza(z87.s(this.zze.zzb(), null, new zzda(this, recaptchaAction, j, null), 3));
    }
}
