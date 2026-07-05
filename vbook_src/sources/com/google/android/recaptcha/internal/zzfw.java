package com.google.android.recaptcha.internal;

import android.webkit.WebView;
import java.util.Arrays;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzfw {
    private final WebView zza;
    private final m82 zzb;

    public zzfw(WebView webView, m82 m82Var) {
        this.zza = webView;
        this.zzb = m82Var;
    }

    public final void zzb(String str, String... strArr) {
        z87.v(this.zzb, null, null, new zzfv((String[]) Arrays.copyOf(strArr, strArr.length), this, str, null), 3);
    }
}
