package com.google.android.recaptcha.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* loaded from: classes.dex */
public final class zzbe {
    public zzbe() {
        new ConcurrentHashMap();
        zzb();
    }

    public static final Set zza(Context context) {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            Object systemService = context.getSystemService("connectivity");
            systemService.getClass();
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null && networkCapabilities.hasTransport(1)) {
                linkedHashSet.add(zzqi.TRANSPORT_WIFI);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(0)) {
                linkedHashSet.add(zzqi.TRANSPORT_CELLULAR);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(4)) {
                linkedHashSet.add(zzqi.TRANSPORT_VPN);
            }
            if (networkCapabilities != null && networkCapabilities.hasTransport(3)) {
                linkedHashSet.add(zzqi.TRANSPORT_ETHERNET);
            }
            if (networkCapabilities != null && networkCapabilities.hasCapability(16)) {
                linkedHashSet.add(zzqi.NET_CAPABILITY_VALIDATED);
            }
            return linkedHashSet;
        } catch (Exception unused) {
            return rs3.a;
        }
    }

    private static final Map zzb() {
        LinkedHashMap t = o17.t(new yk8(0, zzqi.NET_CAPABILITY_MMS), new yk8(1, zzqi.NET_CAPABILITY_SUPL), new yk8(2, zzqi.NET_CAPABILITY_DUN), new yk8(3, zzqi.NET_CAPABILITY_FOTA), new yk8(4, zzqi.NET_CAPABILITY_IMS), new yk8(5, zzqi.NET_CAPABILITY_CBS), new yk8(6, zzqi.NET_CAPABILITY_WIFI_P2P), new yk8(7, zzqi.NET_CAPABILITY_IA), new yk8(8, zzqi.NET_CAPABILITY_RCS), new yk8(9, zzqi.NET_CAPABILITY_XCAP), new yk8(10, zzqi.NET_CAPABILITY_EIMS), new yk8(11, zzqi.NET_CAPABILITY_NOT_METERED), new yk8(12, zzqi.NET_CAPABILITY_INTERNET), new yk8(13, zzqi.NET_CAPABILITY_NOT_RESTRICTED), new yk8(14, zzqi.NET_CAPABILITY_TRUSTED), new yk8(15, zzqi.NET_CAPABILITY_NOT_VPN));
        t.put(17, zzqi.NET_CAPABILITY_CAPTIVE_PORTAL);
        t.put(16, zzqi.NET_CAPABILITY_VALIDATED);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            t.put(18, zzqi.NET_CAPABILITY_NOT_ROAMING);
            t.put(19, zzqi.NET_CAPABILITY_FOREGROUND);
            t.put(20, zzqi.NET_CAPABILITY_NOT_CONGESTED);
            t.put(21, zzqi.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i >= 29) {
            t.put(23, zzqi.NET_CAPABILITY_MCX);
        }
        if (i >= 30) {
            t.put(25, zzqi.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i >= 31) {
            t.put(32, zzqi.NET_CAPABILITY_HEAD_UNIT);
            t.put(29, zzqi.NET_CAPABILITY_ENTERPRISE);
        }
        if (i >= 33) {
            t.put(35, zzqi.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            t.put(34, zzqi.NET_CAPABILITY_PRIORITIZE_LATENCY);
            t.put(33, zzqi.NET_CAPABILITY_MMTEL);
        }
        return t;
    }
}
