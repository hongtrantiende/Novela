package com.google.android.recaptcha.internal;

import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzjh {
    private boolean zza;
    private long zzb;
    private long zzc;

    public static zzjh zzb() {
        zzjh zzjhVar = new zzjh();
        zzjhVar.zze();
        return zzjhVar;
    }

    public static zzjh zzc() {
        return new zzjh();
    }

    private final long zzg() {
        if (this.zza) {
            return (System.nanoTime() - this.zzc) + this.zzb;
        }
        return this.zzb;
    }

    public final String toString() {
        TimeUnit timeUnit;
        String str;
        long zzg = zzg();
        int i = ((zzg / 86400000000000L) > 0L ? 1 : ((zzg / 86400000000000L) == 0L ? 0 : -1));
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (i > 0) {
            timeUnit = TimeUnit.DAYS;
        } else if (zzg / 3600000000000L > 0) {
            timeUnit = TimeUnit.HOURS;
        } else if (zzg / 60000000000L > 0) {
            timeUnit = TimeUnit.MINUTES;
        } else if (zzg / 1000000000 > 0) {
            timeUnit = TimeUnit.SECONDS;
        } else if (zzg / 1000000 > 0) {
            timeUnit = TimeUnit.MILLISECONDS;
        } else if (zzg / 1000 > 0) {
            timeUnit = TimeUnit.MICROSECONDS;
        } else {
            timeUnit = timeUnit2;
        }
        String format = String.format(Locale.ROOT, "%.4g", Double.valueOf(zzg / timeUnit2.convert(1L, timeUnit)));
        switch (zzjg.zza[timeUnit.ordinal()]) {
            case 1:
                str = "ns";
                break;
            case 2:
                str = "μs";
                break;
            case 3:
                str = "ms";
                break;
            case 4:
                str = "s";
                break;
            case 5:
                str = "min";
                break;
            case 6:
                str = "h";
                break;
            case 7:
                str = "d";
                break;
            default:
                cp8.i();
                return null;
        }
        return eub.o(format, " ", str);
    }

    public final long zza(TimeUnit timeUnit) {
        return timeUnit.convert(zzg(), TimeUnit.NANOSECONDS);
    }

    public final zzjh zzd() {
        this.zzb = 0L;
        this.zza = false;
        return this;
    }

    public final zzjh zze() {
        zzjf.zze(!this.zza, "This stopwatch is already running.");
        this.zza = true;
        this.zzc = System.nanoTime();
        return this;
    }

    public final zzjh zzf() {
        long nanoTime = System.nanoTime();
        zzjf.zze(this.zza, "This stopwatch is already stopped.");
        this.zza = false;
        this.zzb = (nanoTime - this.zzc) + this.zzb;
        return this;
    }
}
