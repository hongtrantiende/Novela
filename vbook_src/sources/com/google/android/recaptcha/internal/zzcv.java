package com.google.android.recaptcha.internal;

import android.app.Application;
import java.util.Map;
import java.util.UUID;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzcv {
    private final Application zza;
    private zzdc zzc;
    private final qw7 zzb = new sw7();
    private final String zzd = UUID.randomUUID().toString();
    private zzbi zzf = new zzbi();
    private final zzl zze = new zzl(null, 1, null);

    public zzcv(Application application) {
        Map map;
        Map map2;
        this.zza = application;
        int i = zzav.zza;
        zzaw[] zzawVarArr = {new zzaw(915034652, new zzaz(null, 1, null)), new zzaw(915034802, new zzfu()), new zzaw(915034662, new zzbe()), new zzaw(915034909, new zzjd()), new zzaw(915034675, new zzbr("https://www.recaptcha.net/recaptcha/api3")), new zzaw(915034774, new zzex(null, 1, null)), new zzaw(915034792, new zzfk(true)), new zzaw(735120228, application), new zzaw(915034663, new zzbf(application)), new zzaw(915034791, new zzfj()), new zzaw(915034643, new zzbm(application)), new zzaw(915034775, new zzfa()), new zzaw(915034787, new zzff())};
        for (int i2 = 0; i2 < 13; i2++) {
            zzaw zzawVar = zzawVarArr[i2];
            map = zzav.zzc;
            if (!map.containsKey(Integer.valueOf(zzawVar.zza()))) {
                map2 = zzav.zzc;
                map2.put(Integer.valueOf(zzawVar.zza()), zzawVar);
            }
        }
    }

    public static final /* synthetic */ zzdc zza(zzcv zzcvVar, String str) {
        zzdc zzdcVar = zzcvVar.zzc;
        if (zzdcVar == null) {
            return null;
        }
        if (c16.i(zzdcVar.zzd(), str)) {
            return zzdcVar;
        }
        throw new zzbd(zzbb.zzd, zzba.zzam, null);
    }

    public static final /* synthetic */ void zzc(zzcv zzcvVar, long j) {
        if (j >= 5000) {
            if (eze.f(zzcvVar.zza, "android.permission.INTERNET") == 0) {
                return;
            }
            throw new zzbd(zzbb.zzc, zzba.zzao, null);
        }
        throw new zzbd(zzbb.zzj, zzba.zzI, null);
    }

    public static final /* synthetic */ zzcn zze(zzcv zzcvVar, String str, zzbi zzbiVar, zzch zzchVar, zzek zzekVar) {
        zzdt zzdtVar = new zzdt(str, zzbiVar, zzekVar, zzcvVar.zze);
        if (c16.i(zzchVar, zzch.zza)) {
            return new zzef(zzdtVar);
        }
        return new zzec(zzdtVar, zzbiVar, zzekVar, new zzbo());
    }

    public static /* synthetic */ Object zzf(zzcv zzcvVar, String str, zzcn zzcnVar, zzbi zzbiVar, m42 m42Var, int i, Object obj) {
        return zzh(zzcvVar, str, 0L, null, zzcvVar.zzf, zzch.zzb, m42Var, 2, null);
    }

    public static /* synthetic */ Object zzh(zzcv zzcvVar, String str, long j, zzcn zzcnVar, zzbi zzbiVar, zzch zzchVar, m42 m42Var, int i, Object obj) {
        if ((i & 8) != 0) {
            zzbiVar = zzcvVar.zzf;
        }
        zzbi zzbiVar2 = zzbiVar;
        if ((i & 16) != 0) {
            zzchVar = zzch.zza;
        }
        zzch zzchVar2 = zzchVar;
        if ((i & 2) != 0) {
            j = 10000;
        }
        return zzcvVar.zzg(str, j, null, zzbiVar2, zzchVar2, m42Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x001f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzj(java.lang.String r6, int r7, defpackage.lu4 r8, defpackage.m42 r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof com.google.android.recaptcha.internal.zzcu
            if (r0 == 0) goto L13
            r0 = r9
            com.google.android.recaptcha.internal.zzcu r0 = (com.google.android.recaptcha.internal.zzcu) r0
            int r1 = r0.zzc
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.zzc = r1
            goto L18
        L13:
            com.google.android.recaptcha.internal.zzcu r0 = new com.google.android.recaptcha.internal.zzcu
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.zza
            int r1 = r0.zzc
            r2 = 1
            if (r1 == 0) goto L32
            if (r1 != r2) goto L2b
            com.google.android.recaptcha.internal.zzen r5 = r0.zzd
            defpackage.hre.r(r9)     // Catch: java.lang.Exception -> L27 com.google.android.recaptcha.internal.zzbd -> L29
            goto L4d
        L27:
            r6 = move-exception
            goto L59
        L29:
            r6 = move-exception
            goto L71
        L2b:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.vs.k(r5)
            r5 = 0
            return r5
        L32:
            defpackage.hre.r(r9)
            com.google.android.recaptcha.internal.zzbi r9 = r5.zzf
            com.google.android.recaptcha.internal.zzek r5 = r5.zzk(r6, r9, r7)
            r6 = 6
            com.google.android.recaptcha.internal.zzen r6 = r5.zzf(r6)
            r0.zzd = r6     // Catch: java.lang.Exception -> L52 com.google.android.recaptcha.internal.zzbd -> L54
            r0.zzc = r2     // Catch: java.lang.Exception -> L52 com.google.android.recaptcha.internal.zzbd -> L54
            java.lang.Object r9 = r8.invoke(r5, r0)     // Catch: java.lang.Exception -> L52 com.google.android.recaptcha.internal.zzbd -> L54
            n82 r5 = defpackage.n82.a
            if (r9 == r5) goto L51
            r5 = r6
        L4d:
            r5.zza()     // Catch: java.lang.Exception -> L27 com.google.android.recaptcha.internal.zzbd -> L29
            return r9
        L51:
            return r5
        L52:
            r5 = move-exception
            goto L56
        L54:
            r5 = move-exception
            goto L6e
        L56:
            r4 = r6
            r6 = r5
            r5 = r4
        L59:
            com.google.android.recaptcha.internal.zzbd r7 = new com.google.android.recaptcha.internal.zzbd
            com.google.android.recaptcha.internal.zzbb r8 = com.google.android.recaptcha.internal.zzbb.zzb
            com.google.android.recaptcha.internal.zzba r9 = com.google.android.recaptcha.internal.zzba.zza
            java.lang.String r6 = r6.getMessage()
            r7.<init>(r8, r9, r6)
            r5.zzb(r7)
            com.google.android.recaptcha.RecaptchaException r5 = r7.zzc()
            throw r5
        L6e:
            r4 = r6
            r6 = r5
            r5 = r4
        L71:
            r5.zzb(r6)
            com.google.android.recaptcha.RecaptchaException r5 = r6.zzc()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcv.zzj(java.lang.String, int, lu4, m42):java.lang.Object");
    }

    private final zzek zzk(String str, zzbi zzbiVar, int i) {
        String uuid = UUID.randomUUID().toString();
        int i2 = zzav.zza;
        zzes zzesVar = new zzes(this.zza, new zzeu(((zzbr) ipe.y(zzcr.zza).getValue()).zzc()), zzbiVar.zza());
        zzek zzekVar = new zzek(str, this.zzd, uuid, i, this.zza, zzesVar, null);
        zzekVar.zzc(uuid);
        return zzekVar;
    }

    public final zzbi zzd() {
        return this.zzf;
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0089 A[Catch: all -> 0x00b8, TryCatch #1 {all -> 0x00b8, blocks: (B:68:0x007f, B:75:0x0094, B:71:0x0089), top: B:88:0x007f }] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzg(java.lang.String r18, long r19, com.google.android.recaptcha.internal.zzcn r21, com.google.android.recaptcha.internal.zzbi r22, com.google.android.recaptcha.internal.zzch r23, defpackage.m42 r24) {
        /*
            Method dump skipped, instructions count: 191
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzcv.zzg(java.lang.String, long, com.google.android.recaptcha.internal.zzcn, com.google.android.recaptcha.internal.zzbi, com.google.android.recaptcha.internal.zzch, m42):java.lang.Object");
    }
}
