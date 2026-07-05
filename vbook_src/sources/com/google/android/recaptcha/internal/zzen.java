package com.google.android.recaptcha.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.ads.interactivemedia.v3.impl.data.NetworkResponseData;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.Set;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzen {
    private static zzqk zza;
    private final String zzb;
    private final String zzc;
    private final String zzd;
    private final String zze;
    private final zzeo zzf;
    private final Context zzg;
    private final Integer zzh;
    private final String zzi = zzqb.zzc(zzqb.zzb(System.currentTimeMillis()));
    private final long zzj = System.currentTimeMillis();
    private final int zzk;
    private final int zzl;

    public zzen(int i, String str, int i2, String str2, String str3, String str4, String str5, zzeo zzeoVar, zzcc zzccVar, Context context, Integer num) {
        this.zzk = i;
        this.zzb = str;
        this.zzl = i2;
        this.zzc = str2;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = zzeoVar;
        this.zzg = context;
        this.zzh = num;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:59:0x00e1 -> B:36:0x00e1). Please submit an issue!!! */
    private final void zzc(int i, zzqq zzqqVar) {
        zzbl zzblVar;
        String str;
        String str2;
        String str3 = "";
        zzra zzi = zzrc.zzi();
        zzi.zzy(this.zzk);
        zzi.zzq(this.zzc);
        zzi.zzt(this.zzd);
        zzi.zzz(this.zzl);
        String str4 = this.zze;
        if (str4 != null) {
            zzi.zzx(str4);
        }
        Integer num = this.zzh;
        if (num != null) {
            zzi.zzv(num.intValue());
        }
        if (zzqqVar != null) {
            zzi.zzs(zzqqVar);
        }
        zzi.zzA(i);
        zzi.zzw(this.zzi);
        zzi.zzr(System.currentTimeMillis() - this.zzj);
        int i2 = zzav.zza;
        for (zzax zzaxVar : ((zzaz) ipe.y(zzel.zza).getValue()).zza()) {
            zzi.zzf(0);
        }
        int i3 = zzbk.zza;
        int i4 = this.zzk;
        long zze = zzi.zze() * 1000;
        int i5 = i4 - 2;
        if (i5 != 4) {
            if (i5 != 5) {
                if (i5 != 6) {
                    if (i5 != 7) {
                        if (i5 != 14) {
                            zzblVar = zzbl.zza;
                        } else {
                            zzblVar = zzbl.zzf;
                        }
                    } else {
                        zzblVar = zzbl.zze;
                    }
                } else {
                    zzblVar = zzbl.zzd;
                }
            } else {
                zzblVar = zzbl.zzc;
            }
        } else {
            zzblVar = zzbl.zzb;
        }
        zzbk.zza(zzblVar.zza(), zze);
        zzbe zzbeVar = (zzbe) ipe.y(zzem.zza).getValue();
        Context context = this.zzg;
        Set zza2 = zzbe.zza(context);
        zzqk zzqkVar = zza;
        if (zzqkVar == null) {
            zzqh zzf = zzqk.zzf();
            int i6 = Build.VERSION.SDK_INT;
            zzf.zzf(i6);
            String str5 = NetworkResponseData.UNKNOWN_CONTENT_TYPE;
            if (i6 >= 33) {
                int i7 = context.getPackageManager().getApplicationInfo(context.getPackageName(), PackageManager.ApplicationInfoFlags.of(128L)).metaData.getInt("com.google.android.gms.version", -1);
                if (i7 != -1) {
                    str2 = String.valueOf(i7);
                }
                str2 = NetworkResponseData.UNKNOWN_CONTENT_TYPE;
            } else {
                int i8 = context.getPackageManager().getApplicationInfo(context.getPackageName(), Token.CASE).metaData.getInt("com.google.android.gms.version", -1);
                if (i8 == -1) {
                    str2 = NetworkResponseData.UNKNOWN_CONTENT_TYPE;
                } else {
                    str2 = String.valueOf(i8);
                }
            }
            zzf.zzs(str2);
            zzf.zzu("18.6.1");
            zzf.zzr(Build.MODEL);
            zzf.zzt(Build.MANUFACTURER);
            try {
                int i9 = Build.VERSION.SDK_INT;
                if (i9 >= 33) {
                    str5 = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L)).getLongVersionCode());
                } else if (i9 >= 28) {
                    str5 = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).getLongVersionCode());
                } else {
                    str5 = String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            zzf.zzq(str5);
            zzqkVar = (zzqk) zzf.zzk();
        }
        zza = zzqkVar;
        zzqh zzqhVar = (zzqh) zzqkVar.zzr();
        zzqhVar.zze(zza2);
        zzqk zzqkVar2 = (zzqk) zzqhVar.zzk();
        try {
            str = Locale.getDefault().getISO3Language();
        } catch (MissingResourceException unused2) {
            str = "";
        }
        try {
            str3 = Locale.getDefault().getISO3Country();
        } catch (MissingResourceException unused3) {
        }
        String str6 = this.zzb;
        zzrm zzf2 = zzro.zzf();
        zzf2.zzr(str6);
        zzf2.zze(zzqkVar2);
        zzf2.zzq(str);
        zzf2.zzf(str3);
        zzi.zzu((zzro) zzf2.zzk());
        zztw zzi2 = zztx.zzi();
        zzi2.zze(zzi);
        this.zzf.zza((zztx) zzi2.zzk());
    }

    public final void zza() {
        zzc(3, null);
    }

    public final void zzb(zzbd zzbdVar) {
        zzqo zzg = zzqq.zzg();
        zzg.zzr(String.valueOf(zzbdVar.zzb().zza()));
        zzg.zze(zzbdVar.zza().zza());
        zzg.zzq(zzbdVar.zzc().getErrorCode().getErrorCode());
        String zzd = zzbdVar.zzd();
        if (zzd != null) {
            zzg.zzf(zzd);
        }
        zzc(4, (zzqq) zzg.zzk());
    }
}
