package com.google.android.recaptcha.internal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzbj implements Comparable {
    private int zza;
    private long zzb;
    private long zzc;

    public final String toString() {
        String q0 = k4b.q0(10, String.valueOf(this.zzb / this.zza));
        String q02 = k4b.q0(10, String.valueOf(this.zzc));
        return nk2.v(nk2.y("avgExecutionTime: ", q0, " us| maxExecutionTime: ", q02, " us| totalTime: "), k4b.q0(10, String.valueOf(this.zzb)), " us| #Usages: ", k4b.q0(5, String.valueOf(this.zza)));
    }

    @Override // java.lang.Comparable
    /* renamed from: zza */
    public final int compareTo(zzbj zzbjVar) {
        return Long.valueOf(this.zzb).compareTo(Long.valueOf(zzbjVar.zzb));
    }

    public final int zzb() {
        return this.zza;
    }

    public final long zzc() {
        return this.zzc;
    }

    public final long zzd() {
        return this.zzb;
    }

    public final void zze(long j) {
        this.zzc = j;
    }

    public final void zzf(long j) {
        this.zzb = j;
    }

    public final void zzg(int i) {
        this.zza = i;
    }
}
