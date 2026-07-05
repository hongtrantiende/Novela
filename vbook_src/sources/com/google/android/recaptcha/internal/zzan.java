package com.google.android.recaptcha.internal;

import android.content.Context;
import com.google.android.play.core.integrity.StandardIntegrityManager;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzan {
    public at1 zza;
    private final m82 zzb;
    private final zzek zzc;
    private final StandardIntegrityManager zzd;
    private long zzf;
    private boolean zzh;
    private zzao zze = zzao.zza;
    private final qw7 zzg = new sw7();

    public zzan(Context context, m82 m82Var, zzek zzekVar, StandardIntegrityManager standardIntegrityManager, long j) {
        this.zzb = m82Var;
        this.zzc = zzekVar;
        this.zzd = standardIntegrityManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzi(defpackage.m42 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.google.android.recaptcha.internal.zzag
            if (r0 == 0) goto L13
            r0 = r6
            com.google.android.recaptcha.internal.zzag r0 = (com.google.android.recaptcha.internal.zzag) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzag r0 = new com.google.android.recaptcha.internal.zzag
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r6)
            return r6
        L25:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L2c:
            defpackage.hre.r(r6)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r6 = com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder()
            long r3 = r5.zzf
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder r6 = r6.setCloudProjectNumber(r3)
            com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest r6 = r6.build()
            com.google.android.play.core.integrity.StandardIntegrityManager r5 = r5.zzd
            com.google.android.gms.tasks.Task r5 = r5.prepareIntegrityToken(r6)
            gz2 r5 = com.google.android.recaptcha.internal.zzbx.zza(r5)
            r0.zzc = r2
            java.lang.Object r5 = r5.await(r0)
            n82 r6 = defpackage.n82.a
            if (r5 != r6) goto L52
            return r6
        L52:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzi(m42):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r8 != r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0068, code lost:
        if (r8 != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
        return r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzj(java.lang.String r7, defpackage.m42 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzah
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzah r0 = (com.google.android.recaptcha.internal.zzah) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzah r0 = new com.google.android.recaptcha.internal.zzah
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.zza
            int r1 = r0.zzc
            r2 = 0
            r3 = 2
            r4 = 1
            n82 r5 = defpackage.n82.a
            if (r1 == 0) goto L37
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            defpackage.hre.r(r8)
            goto L6b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r6)
            return r2
        L31:
            java.lang.String r7 = r0.zzd
            defpackage.hre.r(r8)
            goto L4a
        L37:
            defpackage.hre.r(r8)
            at1 r6 = r6.zzf()
            r0.zzd = r7
            r0.zzc = r4
            bt1 r6 = (defpackage.bt1) r6
            java.lang.Object r8 = r6.r(r0)
            if (r8 == r5) goto L72
        L4a:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenProvider r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenProvider) r8
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder()
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder r6 = r6.setRequestHash(r7)
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest r6 = r6.build()
            com.google.android.gms.tasks.Task r6 = r8.request(r6)
            gz2 r6 = com.google.android.recaptcha.internal.zzbx.zza(r6)
            r0.zzd = r2
            r0.zzc = r3
            java.lang.Object r8 = r6.await(r0)
            if (r8 != r5) goto L6b
            goto L72
        L6b:
            com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityToken r8 = (com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken) r8
            java.lang.String r6 = r8.token()
            return r6
        L72:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzj(java.lang.String, m42):java.lang.Object");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:1|(2:3|(6:5|6|7|(1:(1:(1:(3:12|13|14)(2:16|17))(2:18|19))(2:22|23))(3:27|28|(2:30|21))|24|25))|34|6|7|(0)(0)|24|25) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
        r0.zzd = r8;
        r0.zze = r9;
        r0.zzc = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
        if (r8.zze(r0) != r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0064, code lost:
        r7 = r9;
        r9 = r8;
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
        if (r10 != r6) goto L13;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzc(java.lang.String r9, defpackage.m42 r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof com.google.android.recaptcha.internal.zzaf
            if (r0 == 0) goto L13
            r0 = r10
            com.google.android.recaptcha.internal.zzaf r0 = (com.google.android.recaptcha.internal.zzaf) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzaf r0 = new com.google.android.recaptcha.internal.zzaf
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.zza
            int r1 = r0.zzc
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L44
            if (r1 == r5) goto L3c
            if (r1 == r4) goto L34
            if (r1 != r3) goto L2e
            defpackage.hre.r(r10)
            goto L73
        L2e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r8)
            return r2
        L34:
            java.lang.String r8 = r0.zze
            com.google.android.recaptcha.internal.zzan r9 = r0.zzd
            defpackage.hre.r(r10)
            goto L67
        L3c:
            java.lang.String r9 = r0.zze
            com.google.android.recaptcha.internal.zzan r8 = r0.zzd
            defpackage.hre.r(r10)     // Catch: java.lang.Exception -> L57
            goto L54
        L44:
            defpackage.hre.r(r10)
            r0.zzd = r8     // Catch: java.lang.Exception -> L57
            r0.zze = r9     // Catch: java.lang.Exception -> L57
            r0.zzc = r5     // Catch: java.lang.Exception -> L57
            java.lang.Object r10 = r8.zzj(r9, r0)     // Catch: java.lang.Exception -> L57
            if (r10 != r6) goto L54
            goto L76
        L54:
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Exception -> L57
            return r10
        L57:
            r0.zzd = r8
            r0.zze = r9
            r0.zzc = r4
            java.lang.Object r10 = r8.zze(r0)
            if (r10 != r6) goto L64
            goto L76
        L64:
            r7 = r9
            r9 = r8
            r8 = r7
        L67:
            r0.zzd = r2
            r0.zze = r2
            r0.zzc = r3
            java.lang.Object r10 = r9.zzj(r8, r0)
            if (r10 == r6) goto L76
        L73:
            java.lang.String r10 = (java.lang.String) r10
            return r10
        L76:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zzc(java.lang.String, m42):java.lang.Object");
    }

    public final Object zzd(long j, m42 m42Var) {
        this.zzf = j;
        return pvc.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r14.o(r0) != r6) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005e A[Catch: all -> 0x00a9, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x00a9, blocks: (B:19:0x0050, B:23:0x005e), top: B:34:0x0050 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zze(defpackage.m42 r14) {
        /*
            r13 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzak
            if (r0 == 0) goto L13
            r0 = r14
            com.google.android.recaptcha.internal.zzak r0 = (com.google.android.recaptcha.internal.zzak) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzak r0 = new com.google.android.recaptcha.internal.zzak
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.zzb
            int r1 = r0.zzd
            pvc r2 = defpackage.pvc.a
            r3 = 2
            r4 = 1
            r5 = 0
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L3f
            if (r1 == r4) goto L33
            if (r1 != r3) goto L2d
            defpackage.hre.r(r14)
            return r2
        L2d:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r13)
            return r5
        L33:
            java.lang.Object r13 = r0.zza
            qw7 r13 = (defpackage.qw7) r13
            com.google.android.recaptcha.internal.zzan r1 = r0.zze
            defpackage.hre.r(r14)
            r14 = r13
            r13 = r1
            goto L50
        L3f:
            defpackage.hre.r(r14)
            qw7 r14 = r13.zzg
            r0.zze = r13
            r0.zza = r14
            r0.zzd = r4
            java.lang.Object r1 = r14.o(r0)
            if (r1 == r6) goto Laf
        L50:
            com.google.android.recaptcha.internal.zzao r1 = r13.zze     // Catch: java.lang.Throwable -> La9
            com.google.android.recaptcha.internal.zzao r7 = com.google.android.recaptcha.internal.zzao.zza     // Catch: java.lang.Throwable -> La9
            boolean r1 = defpackage.c16.i(r1, r7)     // Catch: java.lang.Throwable -> La9
            if (r1 != 0) goto L5e
            r14.q(r5)
            return r2
        L5e:
            com.google.android.recaptcha.internal.zzao r1 = com.google.android.recaptcha.internal.zzao.zzb     // Catch: java.lang.Throwable -> La9
            r13.zze = r1     // Catch: java.lang.Throwable -> La9
            r14.q(r5)
            com.google.android.recaptcha.internal.zzek r14 = r13.zzc
            java.lang.String r1 = r14.zzd()
            r14.zzc(r1)
            r14.zzb(r3)
            r1 = 38
            com.google.android.recaptcha.internal.zzen r14 = r14.zzf(r1)
            bt1 r1 = defpackage.jxe.c()
            r13.zza = r1
            m82 r1 = r13.zzb
            com.google.android.recaptcha.internal.zzam r7 = new com.google.android.recaptcha.internal.zzam
            r7.<init>(r13, r14, r5)
            r14 = 3
            defpackage.z87.v(r1, r5, r5, r7, r14)
            r0.zze = r5
            r0.zza = r5
            r0.zzd = r3
            boolean r14 = r13.zzh
            if (r14 != 0) goto La5
            java.util.Timer r7 = new java.util.Timer
            r7.<init>()
            com.google.android.recaptcha.internal.zzai r8 = new com.google.android.recaptcha.internal.zzai
            r8.<init>(r13)
            r9 = 28800000(0x1b77400, double:1.42290906E-316)
            r11 = r9
            r7.schedule(r8, r9, r11)
            r13.zzh = r4
        La5:
            if (r2 != r6) goto La8
            goto Laf
        La8:
            return r2
        La9:
            r0 = move-exception
            r13 = r0
            r14.q(r5)
            throw r13
        Laf:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzan.zze(m42):java.lang.Object");
    }

    public final at1 zzf() {
        at1 at1Var = this.zza;
        if (at1Var != null) {
            return at1Var;
        }
        return null;
    }
}
