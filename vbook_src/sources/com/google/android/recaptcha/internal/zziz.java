package com.google.android.recaptcha.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zziz extends aab implements lu4 {
    Object zza;
    int zzb;
    final /* synthetic */ zzja zzc;
    final /* synthetic */ zzen zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziz(zzja zzjaVar, zzen zzenVar, m42 m42Var) {
        super(2, m42Var);
        this.zzc = zzjaVar;
        this.zzd = zzenVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new zziz(this.zzc, this.zzd, m42Var);
    }

    @Override // defpackage.lu4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziz) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
        if (r6.zzx(r5) != r3) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
        if (defpackage.k27.E(20000, r6, r5) == r3) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0065, code lost:
        if (r6.zzc(r1, r5) != r3) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0067, code lost:
        return r3;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.zzb
            r1 = 2
            r2 = 1
            n82 r3 = defpackage.n82.a
            if (r0 == 0) goto L1e
            if (r0 == r2) goto L1a
            if (r0 == r1) goto L14
            java.lang.Object r0 = r5.zza
            com.google.android.recaptcha.internal.zzbd r0 = (com.google.android.recaptcha.internal.zzbd) r0
            defpackage.hre.r(r6)
            goto L68
        L14:
            defpackage.hre.r(r6)     // Catch: java.lang.Exception -> L18
            goto L6d
        L18:
            r6 = move-exception
            goto L40
        L1a:
            defpackage.hre.r(r6)     // Catch: java.lang.Exception -> L18
            goto L2b
        L1e:
            defpackage.hre.r(r6)
            com.google.android.recaptcha.internal.zzja r6 = r5.zzc     // Catch: java.lang.Exception -> L18
            r5.zzb = r2     // Catch: java.lang.Exception -> L18
            java.lang.Object r6 = r6.zzx(r5)     // Catch: java.lang.Exception -> L18
            if (r6 == r3) goto L67
        L2b:
            com.google.android.recaptcha.internal.zziy r6 = new com.google.android.recaptcha.internal.zziy     // Catch: java.lang.Exception -> L18
            com.google.android.recaptcha.internal.zzja r0 = r5.zzc     // Catch: java.lang.Exception -> L18
            com.google.android.recaptcha.internal.zzen r2 = r5.zzd     // Catch: java.lang.Exception -> L18
            r4 = 0
            r6.<init>(r0, r2, r4)     // Catch: java.lang.Exception -> L18
            r5.zzb = r1     // Catch: java.lang.Exception -> L18
            r0 = 20000(0x4e20, double:9.8813E-320)
            java.lang.Object r5 = defpackage.k27.E(r0, r6, r5)     // Catch: java.lang.Exception -> L18
            if (r5 != r3) goto L6d
            goto L67
        L40:
            r6.getMessage()
            com.google.android.recaptcha.internal.zzbd r0 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r1 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r2 = com.google.android.recaptcha.internal.zzba.zzV
            java.lang.String r4 = r6.getMessage()
            r0.<init>(r1, r2, r4)
            com.google.android.recaptcha.internal.zzbd r0 = com.google.android.recaptcha.internal.zzf.zza(r6, r0)
            com.google.android.recaptcha.internal.zzja r6 = r5.zzc
            com.google.android.recaptcha.internal.zzcb r6 = r6.zzm()
            com.google.android.recaptcha.internal.zzje r1 = com.google.android.recaptcha.internal.zzje.zza
            r5.zza = r0
            r2 = 3
            r5.zzb = r2
            java.lang.Object r6 = r6.zzc(r1, r5)
            if (r6 != r3) goto L68
        L67:
            return r3
        L68:
            com.google.android.recaptcha.internal.zzen r5 = r5.zzd
            r5.zzb(r0)
        L6d:
            pvc r5 = defpackage.pvc.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zziz.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
