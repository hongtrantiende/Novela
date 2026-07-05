package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzfm {
    private final ye6 zza;

    public zzfm() {
        int i = zzav.zza;
        this.zza = ipe.y(zzfl.zza);
    }

    public final HttpURLConnection zza(String str) {
        if (((zzfk) this.zza.getValue()).zzb(str)) {
            URLConnection openConnection = new URL(str).openConnection();
            openConnection.getClass();
            return (HttpURLConnection) openConnection;
        }
        throw new zzbd(zzbb.zzc, zzba.zzQ, null);
    }
}
