package com.google.android.recaptcha.internal;

import java.net.HttpURLConnection;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzex {
    private final zzfm zza;

    public /* synthetic */ zzex(zzfm zzfmVar, int i, ct2 ct2Var) {
        this.zza = new zzfm();
    }

    public final zzew zza(String str) {
        try {
            HttpURLConnection zza = this.zza.zza(str);
            zza.setRequestMethod("POST");
            zza.setDoOutput(true);
            zza.setRequestProperty("Content-Type", "application/x-protobuffer");
            return new zzew(zza);
        } catch (zzbd e) {
            throw e;
        } catch (Exception e2) {
            throw new zzbd(zzbb.zzc, zzba.zzai, e2.getMessage());
        }
    }

    public zzex() {
        this(null, 1, null);
    }
}
