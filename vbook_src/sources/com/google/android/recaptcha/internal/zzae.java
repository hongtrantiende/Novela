package com.google.android.recaptcha.internal;

import android.content.Context;
import java.nio.charset.StandardCharsets;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzae implements zzy {
    private final zzek zza;
    private final Context zzb;
    private final zzan zzc;
    private boolean zzd = true;
    private String zze = "";
    private final zzbs zzf;

    public zzae(zzek zzekVar, Context context, m82 m82Var, zzan zzanVar, zzbs zzbsVar) {
        this.zza = zzekVar;
        this.zzb = context;
        this.zzc = zzanVar;
        this.zzf = zzbsVar;
    }

    private static final String zzi(zzle zzleVar) {
        zzkh zzg = zzkh.zzg();
        byte[] zzl = zzleVar.zzl();
        byte[] zzd = zzjz.zza().zza(zzg.zzi(zzl, 0, zzl.length), StandardCharsets.UTF_8).zzd();
        zzle zzk = zzle.zzk(zzd, 0, zzd.length);
        zzkh zzh = zzkh.zzh();
        byte[] zzl2 = zzk.zzl();
        return zzh.zzi(zzl2, 0, zzl2.length);
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final int zza() {
        return 2;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final zzek zzb() {
        return this.zza;
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final Object zzc(String str, m42 m42Var) {
        return k27.p(new zzac(this, str, null), m42Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007a, code lost:
        if (r1.zzd(r7, r0) != r6) goto L17;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008b  */
    @Override // com.google.android.recaptcha.internal.zzy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzd(com.google.android.recaptcha.internal.zzse r12, defpackage.m42 r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzad
            if (r0 == 0) goto L13
            r0 = r13
            com.google.android.recaptcha.internal.zzad r0 = (com.google.android.recaptcha.internal.zzad) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzd = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzad r0 = new com.google.android.recaptcha.internal.zzad
            r0.<init>(r11, r13)
        L18:
            java.lang.Object r13 = r0.zzb
            int r1 = r0.zzd
            pvc r2 = defpackage.pvc.a
            r3 = 0
            r4 = 2
            r5 = 1
            n82 r6 = defpackage.n82.a
            if (r1 == 0) goto L43
            if (r1 == r5) goto L37
            if (r1 != r4) goto L31
            java.lang.Object r11 = r0.zza
            com.google.android.recaptcha.internal.zzen r11 = (com.google.android.recaptcha.internal.zzen) r11
            defpackage.hre.r(r13)
            goto L8c
        L31:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r11)
            return r3
        L37:
            com.google.android.recaptcha.internal.zzen r11 = r0.zze
            java.lang.Object r12 = r0.zza
            com.google.android.recaptcha.internal.zzae r12 = (com.google.android.recaptcha.internal.zzae) r12
            defpackage.hre.r(r13)
            r13 = r11
            r11 = r12
            goto L7c
        L43:
            defpackage.hre.r(r13)
            com.google.android.recaptcha.internal.zzen r13 = com.google.android.recaptcha.internal.zzz.zzc(r11)
            com.google.android.recaptcha.internal.zzbs r1 = r11.zzf
            android.content.Context r7 = r11.zzb
            int r1 = r1.zza(r7)
            r7 = 3
            if (r1 != r7) goto L91
            long r7 = r12.zzf()
            r9 = 0
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 != 0) goto L60
            goto L91
        L60:
            com.google.android.recaptcha.internal.zzle r1 = r12.zzg()
            java.lang.String r1 = zzi(r1)
            r11.zze = r1
            com.google.android.recaptcha.internal.zzan r1 = r11.zzc
            long r7 = r12.zzf()
            r0.zza = r11
            r0.zze = r13
            r0.zzd = r5
            java.lang.Object r12 = r1.zzd(r7, r0)
            if (r12 == r6) goto L90
        L7c:
            com.google.android.recaptcha.internal.zzan r11 = r11.zzc
            r0.zza = r13
            r0.zze = r3
            r0.zzd = r4
            java.lang.Object r11 = r11.zze(r0)
            if (r11 != r6) goto L8b
            goto L90
        L8b:
            r11 = r13
        L8c:
            r11.zza()
            return r2
        L90:
            return r6
        L91:
            r12 = 0
            r11.zzd = r12
            com.google.android.recaptcha.internal.zzbd r11 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r12 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r0 = com.google.android.recaptcha.internal.zzba.zzab
            r11.<init>(r12, r0, r3)
            r13.zzb(r11)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzae.zzd(com.google.android.recaptcha.internal.zzse, m42):java.lang.Object");
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final void zze(zzsr zzsrVar) {
        this.zze = zzi(zzsrVar.zzf());
    }

    @Override // com.google.android.recaptcha.internal.zzy
    public final boolean zzf() {
        return this.zzd;
    }
}
