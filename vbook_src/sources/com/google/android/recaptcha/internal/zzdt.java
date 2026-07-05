package com.google.android.recaptcha.internal;

import android.app.Application;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.google.android.recaptcha.RecaptchaAction;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzdt {
    private final String zza;
    private final zzek zzb;
    private final zzl zzc;
    private final ye6 zzd;
    private final ye6 zze;
    private final ye6 zzf;
    private final ye6 zzg;
    private final ye6 zzh;
    private final zzbi zzi;

    public zzdt(String str, zzbi zzbiVar, zzek zzekVar, zzl zzlVar) {
        this.zza = str;
        this.zzi = zzbiVar;
        this.zzb = zzekVar;
        this.zzc = zzlVar;
        int i = zzav.zza;
        this.zzd = ipe.y(zzdm.zza);
        this.zze = ipe.y(zzdn.zza);
        this.zzf = ipe.y(zzdo.zza);
        this.zzg = ipe.y(zzdp.zza);
        this.zzh = ipe.y(zzdq.zza);
    }

    public static final /* synthetic */ zzbr zzd(zzdt zzdtVar) {
        return (zzbr) zzdtVar.zze.getValue();
    }

    public static final /* synthetic */ zzff zzg(zzdt zzdtVar) {
        return (zzff) zzdtVar.zzd.getValue();
    }

    public static final /* synthetic */ zzfj zzh(zzdt zzdtVar) {
        return (zzfj) zzdtVar.zzg.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application zzr() {
        return (Application) this.zzh.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbd zzs(Exception exc, zzbd zzbdVar) {
        if (!zzx()) {
            return new zzbd(zzbb.zzc, zzba.zzao, exc.getMessage());
        }
        return zzbdVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzbf zzt() {
        return (zzbf) this.zzf.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final zzek zzu(String str) {
        zzek zza = this.zzb.zza();
        zza.zzc(str);
        return zza;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007b, code lost:
        if (r11 == r9) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzv(com.google.android.recaptcha.internal.zzsc r11, long r12, defpackage.m42 r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.google.android.recaptcha.internal.zzdj
            if (r0 == 0) goto L14
            r0 = r14
            com.google.android.recaptcha.internal.zzdj r0 = (com.google.android.recaptcha.internal.zzdj) r0
            int r1 = r0.zzd
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.zzd = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            com.google.android.recaptcha.internal.zzdj r0 = new com.google.android.recaptcha.internal.zzdj
            r0.<init>(r10, r14)
            goto L12
        L1a:
            java.lang.Object r14 = r6.zzb
            int r0 = r6.zzd
            r7 = 2
            r1 = 1
            r8 = 0
            n82 r9 = defpackage.n82.a
            if (r0 == 0) goto L44
            if (r0 == r1) goto L38
            if (r0 == r7) goto L2f
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r10)
            return r8
        L2f:
            java.lang.Object r10 = r6.zza
            java.lang.Throwable r10 = (java.lang.Throwable) r10
            defpackage.hre.r(r14)
            goto Ld7
        L38:
            java.lang.Object r10 = r6.zza
            com.google.android.recaptcha.internal.zzdt r10 = (com.google.android.recaptcha.internal.zzdt) r10
            defpackage.hre.r(r14)
            hs9 r14 = (defpackage.hs9) r14
            java.lang.Object r11 = r14.a
            goto L7e
        L44:
            defpackage.hre.r(r14)
            java.lang.String r14 = r11.zzO()
            zzy(r14)
            java.util.List r14 = r10.zzw()
            java.util.Iterator r14 = r14.iterator()
        L56:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L6c
            java.lang.Object r0 = r14.next()
            com.google.android.recaptcha.internal.zze r0 = (com.google.android.recaptcha.internal.zze) r0
            com.google.android.recaptcha.internal.zzl r2 = r10.zzc
            com.google.android.recaptcha.internal.zze[] r0 = new com.google.android.recaptcha.internal.zze[]{r0}
            r2.zzf(r0)
            goto L56
        L6c:
            com.google.android.recaptcha.internal.zzl r14 = r10.zzc
            com.google.android.recaptcha.internal.zzek r5 = r10.zzb
            r6.zza = r10
            r6.zzd = r1
            r4 = r11
            r2 = r12
            r1 = r14
            java.lang.Object r11 = r1.zzc(r2, r4, r5, r6)
            if (r11 != r9) goto L7e
            goto Ld5
        L7e:
            java.lang.Throwable r11 = defpackage.hs9.a(r11)
            if (r11 != 0) goto L87
            pvc r10 = defpackage.pvc.a
            return r10
        L87:
            com.google.android.recaptcha.internal.zzbi r12 = r10.zzi
            m82 r12 = r12.zzd()
            d82 r12 = r12.q()
            r0f r13 = defpackage.r0f.I
            b82 r12 = r12.get(r13)
            w26 r12 = (defpackage.w26) r12
            if (r12 == 0) goto Lb5
            b9a r12 = r12.getChildren()
            if (r12 == 0) goto Lb5
            java.util.Iterator r12 = r12.iterator()
        La5:
            boolean r13 = r12.hasNext()
            if (r13 == 0) goto Lb5
            java.lang.Object r13 = r12.next()
            w26 r13 = (defpackage.w26) r13
            r13.cancel(r8)
            goto La5
        Lb5:
            com.google.android.recaptcha.internal.zzbi r10 = r10.zzi
            m82 r10 = r10.zzd()
            d82 r10 = r10.q()
            w26 r10 = defpackage.k27.r(r10)
            b9a r10 = r10.getChildren()
            java.util.List r10 = defpackage.g9a.e0(r10)
            r6.zza = r11
            r6.zzd = r7
            java.lang.Object r10 = defpackage.nxe.z(r10, r6)
            if (r10 != r9) goto Ld6
        Ld5:
            return r9
        Ld6:
            r10 = r11
        Ld7:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzv(com.google.android.recaptcha.internal.zzsc, long, m42):java.lang.Object");
    }

    private final List zzw() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new zzv(zzr(), this.zzb.zza(), this.zzi, null, 8, null));
        arrayList.add(new zzja(this.zzb, this.zzi));
        return sl1.C0(arrayList);
    }

    private final boolean zzx() {
        NetworkCapabilities networkCapabilities;
        int i = zzav.zza;
        zzbe zzbeVar = (zzbe) ipe.y(zzdi.zza).getValue();
        try {
            Object systemService = zzr().getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
                return false;
            }
            return false;
        } catch (Exception unused) {
            return false;
        }
    }

    private static final void zzy(String str) {
        try {
            zzrv zzj = zzrv.zzj(zzbt.zza(str));
            int i = zzav.zza;
            ((zzfu) ipe.y(zzde.zza).getValue()).zza(zzj);
        } catch (Exception e) {
            throw new zzbd(zzbb.zzl, zzba.zzan, e.getMessage());
        }
    }

    public final zzsp zzi(RecaptchaAction recaptchaAction, zzsi zzsiVar, zzsc zzscVar) {
        zzso zzf = zzsp.zzf();
        zzf.zzs(this.zza);
        zzf.zze(recaptchaAction.getAction());
        zzf.zzf(zzscVar.zzN());
        zzf.zzq(zzscVar.zzM());
        zzf.zzr(zzsiVar);
        return (zzsp) zzf.zzk();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzl(java.lang.String r6, long r7, defpackage.m42 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzdd
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzdd r0 = (com.google.android.recaptcha.internal.zzdd) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdd r0 = new com.google.android.recaptcha.internal.zzdd
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            com.google.android.recaptcha.internal.zzen r5 = r0.zzd
            defpackage.hre.r(r9)     // Catch: java.lang.Exception -> L27 defpackage.eac -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            goto L52
        L27:
            r6 = move-exception
            goto L63
        L29:
            r6 = move-exception
            goto L75
        L2b:
            r6 = move-exception
            goto L87
        L2d:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L34:
            defpackage.hre.r(r9)
            com.google.android.recaptcha.internal.zzek r9 = r5.zzu(r6)
            r1 = 27
            com.google.android.recaptcha.internal.zzen r9 = r9.zzf(r1)
            com.google.android.recaptcha.internal.zzl r5 = r5.zzc     // Catch: java.lang.Exception -> L59 defpackage.eac -> L5c com.google.android.recaptcha.internal.zzbd -> L5f
            r0.zzd = r9     // Catch: java.lang.Exception -> L59 defpackage.eac -> L5c com.google.android.recaptcha.internal.zzbd -> L5f
            r0.zzc = r2     // Catch: java.lang.Exception -> L59 defpackage.eac -> L5c com.google.android.recaptcha.internal.zzbd -> L5f
            java.lang.Object r5 = r5.zzb(r6, r7, r0)     // Catch: java.lang.Exception -> L59 defpackage.eac -> L5c com.google.android.recaptcha.internal.zzbd -> L5f
            n82 r6 = defpackage.n82.a
            if (r5 == r6) goto L58
            r4 = r9
            r9 = r5
            r5 = r4
        L52:
            com.google.android.recaptcha.internal.zzsi r9 = (com.google.android.recaptcha.internal.zzsi) r9     // Catch: java.lang.Exception -> L27 defpackage.eac -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            r5.zza()     // Catch: java.lang.Exception -> L27 defpackage.eac -> L29 com.google.android.recaptcha.internal.zzbd -> L2b
            return r9
        L58:
            return r6
        L59:
            r5 = move-exception
            r6 = r5
            goto L62
        L5c:
            r5 = move-exception
            r6 = r5
            goto L74
        L5f:
            r5 = move-exception
            r6 = r5
            goto L86
        L62:
            r5 = r9
        L63:
            com.google.android.recaptcha.internal.zzbd r7 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r8 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r9 = com.google.android.recaptcha.internal.zzba.zzaa
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r8, r9, r6)
            r5.zzb(r7)
            throw r7
        L74:
            r5 = r9
        L75:
            com.google.android.recaptcha.internal.zzbd r7 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r8 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r9 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r8, r9, r6)
            r5.zzb(r7)
            throw r7
        L86:
            r5 = r9
        L87:
            r5.zzb(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzl(java.lang.String, long, m42):java.lang.Object");
    }

    public final Object zzm(zzsp zzspVar, String str, long j, m42 m42Var) {
        return z87.E(this.zzi.zza().q(), new zzdg(this, str, j, zzspVar, null), m42Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzn(com.google.android.recaptcha.internal.zzsc r10, long r11, defpackage.m42 r13) {
        /*
            r9 = this;
            boolean r0 = r13 instanceof com.google.android.recaptcha.internal.zzdk
            if (r0 == 0) goto L13
            r0 = r13
            com.google.android.recaptcha.internal.zzdk r0 = (com.google.android.recaptcha.internal.zzdk) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdk r0 = new com.google.android.recaptcha.internal.zzdk
            r0.<init>(r9, r13)
        L18:
            java.lang.Object r13 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.hre.r(r13)     // Catch: java.lang.Exception -> L46 defpackage.eac -> L56 com.google.android.recaptcha.internal.zzbd -> L66
            goto L43
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r9)
            r9 = 0
            return r9
        L2c:
            defpackage.hre.r(r13)
            com.google.android.recaptcha.internal.zzdl r3 = new com.google.android.recaptcha.internal.zzdl     // Catch: java.lang.Exception -> L46 defpackage.eac -> L56 com.google.android.recaptcha.internal.zzbd -> L66
            r8 = 0
            r4 = r9
            r5 = r10
            r6 = r11
            r3.<init>(r4, r5, r6, r8)     // Catch: java.lang.Exception -> L46 defpackage.eac -> L56 com.google.android.recaptcha.internal.zzbd -> L66
            r0.zzc = r2     // Catch: java.lang.Exception -> L46 defpackage.eac -> L56 com.google.android.recaptcha.internal.zzbd -> L66
            java.lang.Object r9 = defpackage.k27.E(r6, r3, r0)     // Catch: java.lang.Exception -> L46 defpackage.eac -> L56 com.google.android.recaptcha.internal.zzbd -> L66
            n82 r10 = defpackage.n82.a
            if (r9 != r10) goto L43
            return r10
        L43:
            pvc r9 = defpackage.pvc.a
            return r9
        L46:
            r0 = move-exception
            r9 = r0
            com.google.android.recaptcha.internal.zzbd r10 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r11 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r12 = com.google.android.recaptcha.internal.zzba.zzap
            java.lang.String r9 = r9.getMessage()
            r10.<init>(r11, r12, r9)
            throw r10
        L56:
            r0 = move-exception
            r9 = r0
            com.google.android.recaptcha.internal.zzbd r10 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r11 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r12 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r9 = r9.getMessage()
            r10.<init>(r11, r12, r9)
            throw r10
        L66:
            r0 = move-exception
            r9 = r0
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzn(com.google.android.recaptcha.internal.zzsc, long, m42):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzo(long r6, defpackage.m42 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof com.google.android.recaptcha.internal.zzdr
            if (r0 == 0) goto L13
            r0 = r8
            com.google.android.recaptcha.internal.zzdr r0 = (com.google.android.recaptcha.internal.zzdr) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzdr r0 = new com.google.android.recaptcha.internal.zzdr
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.zza
            int r1 = r0.zzc
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L39
            if (r1 != r3) goto L33
            com.google.android.recaptcha.internal.zzen r5 = r0.zze
            com.google.android.recaptcha.internal.zzdt r6 = r0.zzd
            defpackage.hre.r(r8)     // Catch: java.lang.Exception -> L2a defpackage.eac -> L2c com.google.android.recaptcha.internal.zzbd -> L2e
            goto L5b
        L2a:
            r7 = move-exception
            goto L6a
        L2c:
            r7 = move-exception
            goto L81
        L2e:
            r7 = move-exception
            r8 = r5
            r5 = r6
            goto L96
        L33:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            return r2
        L39:
            defpackage.hre.r(r8)
            com.google.android.recaptcha.internal.zzek r8 = r5.zzb
            r1 = 22
            com.google.android.recaptcha.internal.zzen r8 = r8.zzf(r1)
            com.google.android.recaptcha.internal.zzds r1 = new com.google.android.recaptcha.internal.zzds     // Catch: java.lang.Exception -> L5f defpackage.eac -> L62 com.google.android.recaptcha.internal.zzbd -> L65
            r1.<init>(r5, r8, r2)     // Catch: java.lang.Exception -> L5f defpackage.eac -> L62 com.google.android.recaptcha.internal.zzbd -> L65
            r0.zzd = r5     // Catch: java.lang.Exception -> L5f defpackage.eac -> L62 com.google.android.recaptcha.internal.zzbd -> L65
            r0.zze = r8     // Catch: java.lang.Exception -> L5f defpackage.eac -> L62 com.google.android.recaptcha.internal.zzbd -> L65
            r0.zzc = r3     // Catch: java.lang.Exception -> L5f defpackage.eac -> L62 com.google.android.recaptcha.internal.zzbd -> L65
            java.lang.Object r6 = defpackage.k27.E(r6, r1, r0)     // Catch: java.lang.Exception -> L5f defpackage.eac -> L62 com.google.android.recaptcha.internal.zzbd -> L65
            n82 r7 = defpackage.n82.a
            if (r6 == r7) goto L5e
            r4 = r6
            r6 = r5
            r5 = r8
            r8 = r4
        L5b:
            com.google.android.recaptcha.internal.zzsc r8 = (com.google.android.recaptcha.internal.zzsc) r8     // Catch: java.lang.Exception -> L2a defpackage.eac -> L2c com.google.android.recaptcha.internal.zzbd -> L2e
            return r8
        L5e:
            return r7
        L5f:
            r6 = move-exception
            r7 = r6
            goto L68
        L62:
            r6 = move-exception
            r7 = r6
            goto L7f
        L65:
            r6 = move-exception
            r7 = r6
            goto L96
        L68:
            r6 = r5
            r5 = r8
        L6a:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r0 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r1 = com.google.android.recaptcha.internal.zzba.zzaw
            java.lang.String r2 = r7.getMessage()
            r8.<init>(r0, r1, r2)
            com.google.android.recaptcha.internal.zzbd r6 = r6.zzs(r7, r8)
            r5.zzb(r6)
            throw r6
        L7f:
            r6 = r5
            r5 = r8
        L81:
            com.google.android.recaptcha.internal.zzbd r8 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r0 = com.google.android.recaptcha.internal.zzbb.zzc
            com.google.android.recaptcha.internal.zzba r1 = com.google.android.recaptcha.internal.zzba.zzb
            java.lang.String r2 = r7.getMessage()
            r8.<init>(r0, r1, r2)
            com.google.android.recaptcha.internal.zzbd r6 = r6.zzs(r7, r8)
            r5.zzb(r6)
            throw r6
        L96:
            com.google.android.recaptcha.internal.zzbb r6 = r7.zzb()
            com.google.android.recaptcha.internal.zzbb r0 = com.google.android.recaptcha.internal.zzbb.zzc
            boolean r6 = defpackage.c16.i(r6, r0)
            if (r6 == 0) goto La6
            com.google.android.recaptcha.internal.zzbd r7 = r5.zzs(r7, r7)
        La6:
            r8.zzb(r7)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzdt.zzo(long, m42):java.lang.Object");
    }

    public final void zzq(String str, zzsr zzsrVar) {
        zzen zzf = zzu(str).zzf(29);
        try {
            List<zzst> zzk = zzsrVar.zzk();
            int k = p17.k(tl1.s(zzk, 10));
            if (k < 16) {
                k = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(k);
            for (zzst zzstVar : zzk) {
                linkedHashMap.put(zzstVar.zzg(), zzstVar.zzi());
            }
            zzt().zzb(linkedHashMap);
            this.zzc.zzg(zzsrVar);
            zzf.zza();
        } catch (zzbd e) {
            zzf.zzb(e);
        } catch (Exception e2) {
            zzf.zzb(new zzbd(zzbb.zzb, zzba.zzas, e2.getMessage()));
        }
    }
}
