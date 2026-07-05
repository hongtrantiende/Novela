package com.google.android.recaptcha.internal;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zziy extends aab implements lu4 {
    Object zza;
    Object zzb;
    Object zzc;
    Object zzd;
    int zze;
    final /* synthetic */ zzja zzf;
    final /* synthetic */ zzen zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zziy(zzja zzjaVar, zzen zzenVar, m42 m42Var) {
        super(2, m42Var);
        this.zzf = zzjaVar;
        this.zzg = zzenVar;
    }

    @Override // defpackage.hh0
    public final m42 create(Object obj, m42 m42Var) {
        return new zziy(this.zzf, this.zzg, m42Var);
    }

    @Override // defpackage.lu4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zziy) create((m82) obj, (m42) obj2)).invokeSuspend(pvc.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
        if (r9 != r5) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b8, code lost:
        if (((defpackage.bt1) r9).r(r8) != r5) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00ba, code lost:
        r9 = r8.zzf.zzm();
        r0 = com.google.android.recaptcha.internal.zzje.zzc;
        r8.zze = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00c9, code lost:
        if (r9.zzc(r0, r8) != r5) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00cc, code lost:
        r8.zzg.zza();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d3, code lost:
        return defpackage.pvc.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
        if (r0 != 3) goto L11;
     */
    @Override // defpackage.hh0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.zze
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            n82 r5 = defpackage.n82.a
            if (r0 == 0) goto L29
            if (r0 == r3) goto L15
            defpackage.hre.r(r9)
            if (r0 == r2) goto L9d
            if (r0 == r1) goto Lba
            goto Lcc
        L15:
            java.lang.Object r0 = r8.zzd
            com.google.android.recaptcha.internal.zzcg r0 = (com.google.android.recaptcha.internal.zzcg) r0
            java.lang.Object r3 = r8.zzc
            com.google.android.recaptcha.internal.zzsc r3 = (com.google.android.recaptcha.internal.zzsc) r3
            java.lang.Object r6 = r8.zzb
            com.google.android.recaptcha.internal.zzja r6 = (com.google.android.recaptcha.internal.zzja) r6
            java.lang.Object r7 = r8.zza
            com.google.android.recaptcha.internal.zzja r7 = (com.google.android.recaptcha.internal.zzja) r7
            defpackage.hre.r(r9)
            goto L5d
        L29:
            defpackage.hre.r(r9)
            com.google.android.recaptcha.internal.zzja r6 = r8.zzf
            com.google.android.recaptcha.internal.zzsc r9 = com.google.android.recaptcha.internal.zzja.zzs(r6)
            if (r9 != 0) goto L35
            r9 = r4
        L35:
            com.google.android.recaptcha.internal.zzja r0 = r8.zzf
            com.google.android.recaptcha.internal.zzcg r7 = new com.google.android.recaptcha.internal.zzcg
            com.google.android.recaptcha.internal.zzsc r0 = com.google.android.recaptcha.internal.zzja.zzs(r0)
            if (r0 != 0) goto L40
            r0 = r4
        L40:
            com.google.android.recaptcha.internal.zzle r0 = r0.zzf()
            r7.<init>(r0)
            com.google.android.recaptcha.internal.zzja r0 = r8.zzf
            r8.zza = r6
            r8.zzb = r6
            r8.zzc = r9
            r8.zzd = r7
            r8.zze = r3
            java.lang.Object r0 = r0.zzw(r8)
            if (r0 == r5) goto Ld4
            r3 = r9
            r9 = r0
            r0 = r7
            r7 = r6
        L5d:
            android.webkit.WebView r9 = (android.webkit.WebView) r9
            com.google.android.recaptcha.internal.zzft r9 = r6.zzC(r3, r0, r9)
            r7.zzb = r9
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            at1 r9 = r9.zzA()
            int r9 = r9.hashCode()
            defpackage.nc2.c(r9)
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            com.google.android.recaptcha.internal.zzjh r9 = com.google.android.recaptcha.internal.zzja.zzr(r9)
            r9.zzd()
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            com.google.android.recaptcha.internal.zzjh r9 = com.google.android.recaptcha.internal.zzja.zzr(r9)
            r9.zze()
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            com.google.android.recaptcha.internal.zzsc r0 = com.google.android.recaptcha.internal.zzja.zzs(r9)
            if (r0 != 0) goto L8d
            r0 = r4
        L8d:
            r8.zza = r4
            r8.zzb = r4
            r8.zzc = r4
            r8.zzd = r4
            r8.zze = r2
            java.lang.Object r9 = com.google.android.recaptcha.internal.zzja.zzt(r9, r0, r8)
            if (r9 == r5) goto Ld4
        L9d:
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            at1 r9 = r9.zzA()
            int r9 = r9.hashCode()
            defpackage.nc2.c(r9)
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            at1 r9 = r9.zzA()
            r8.zze = r1
            bt1 r9 = (defpackage.bt1) r9
            java.lang.Object r9 = r9.r(r8)
            if (r9 == r5) goto Ld4
        Lba:
            com.google.android.recaptcha.internal.zzja r9 = r8.zzf
            com.google.android.recaptcha.internal.zzcb r9 = r9.zzm()
            com.google.android.recaptcha.internal.zzje r0 = com.google.android.recaptcha.internal.zzje.zzc
            r1 = 4
            r8.zze = r1
            java.lang.Object r9 = r9.zzc(r0, r8)
            if (r9 != r5) goto Lcc
            goto Ld4
        Lcc:
            com.google.android.recaptcha.internal.zzen r8 = r8.zzg
            r8.zza()
            pvc r8 = defpackage.pvc.a
            return r8
        Ld4:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zziy.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
