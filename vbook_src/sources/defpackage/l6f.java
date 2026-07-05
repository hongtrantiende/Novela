package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.ext.SdkExtensions;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicLong;
import javax.security.auth.x500.X500Principal;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: l6f  reason: default package */
/* loaded from: classes.dex */
public final class l6f extends qve {
    public static final String[] E = {"firebase_", "google_", "ga_"};
    public static final String[] F = {"_err"};
    public Boolean C;
    public Integer D;
    public SecureRandom c;
    public final AtomicLong d;
    public int e;
    public k37 f;

    public l6f(lte lteVar) {
        super(lteVar);
        this.D = null;
        this.d = new AtomicLong(0L);
    }

    public static final boolean A0(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!str.equals("*") && !Arrays.asList(str.split(",")).contains(str2)) {
            return false;
        }
        return true;
    }

    public static boolean C0(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("_")) {
            return true;
        }
        return false;
    }

    public static byte[] H0(Parcelable parcelable) {
        if (parcelable == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            parcelable.writeToParcel(obtain, 0);
            return obtain.marshall();
        } finally {
            obtain.recycle();
        }
    }

    public static ArrayList S0(List list) {
        if (list == null) {
            return new ArrayList(0);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            i4e i4eVar = (i4e) it.next();
            Bundle bundle = new Bundle();
            bundle.putString("app_id", i4eVar.a);
            bundle.putString("origin", i4eVar.b);
            bundle.putLong("creation_timestamp", i4eVar.d);
            bundle.putString("name", i4eVar.c.b);
            Object c = i4eVar.c.c();
            am8.s(c);
            obe.D(bundle, c);
            bundle.putBoolean("active", i4eVar.e);
            String str = i4eVar.f;
            if (str != null) {
                bundle.putString("trigger_event_name", str);
            }
            ibe ibeVar = i4eVar.C;
            if (ibeVar != null) {
                bundle.putString("timed_out_event_name", ibeVar.a);
                dbe dbeVar = ibeVar.b;
                if (dbeVar != null) {
                    bundle.putBundle("timed_out_event_params", dbeVar.f());
                }
            }
            bundle.putLong("trigger_timeout", i4eVar.D);
            ibe ibeVar2 = i4eVar.E;
            if (ibeVar2 != null) {
                bundle.putString("triggered_event_name", ibeVar2.a);
                dbe dbeVar2 = ibeVar2.b;
                if (dbeVar2 != null) {
                    bundle.putBundle("triggered_event_params", dbeVar2.f());
                }
            }
            bundle.putLong("triggered_timestamp", i4eVar.c.c);
            bundle.putLong("time_to_live", i4eVar.F);
            ibe ibeVar3 = i4eVar.G;
            if (ibeVar3 != null) {
                bundle.putString("expired_event_name", ibeVar3.a);
                dbe dbeVar3 = ibeVar3.b;
                if (dbeVar3 != null) {
                    bundle.putBundle("expired_event_params", dbeVar3.f());
                }
            }
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static boolean T0(Context context) {
        ActivityInfo receiverInfo;
        am8.s(context);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static void U0(s0f s0fVar, Bundle bundle, boolean z) {
        if (bundle != null && s0fVar != null) {
            if (bundle.containsKey("_sc") && !z) {
                z = false;
            } else {
                String str = s0fVar.a;
                if (str != null) {
                    bundle.putString("_sn", str);
                } else {
                    bundle.remove("_sn");
                }
                String str2 = s0fVar.b;
                if (str2 != null) {
                    bundle.putString("_sc", str2);
                } else {
                    bundle.remove("_sc");
                }
                bundle.putLong("_si", s0fVar.c);
                return;
            }
        }
        if (bundle != null && s0fVar == null && z) {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public static boolean Y0(String str) {
        am8.p(str);
        if (str.charAt(0) == '_' && !str.equals("_ep")) {
            return false;
        }
        return true;
    }

    public static boolean a1(Intent intent) {
        String stringExtra = intent.getStringExtra("android.intent.extra.REFERRER_NAME");
        if (!"android-app://com.google.android.googlequicksearchbox/https/www.google.com".equals(stringExtra) && !"android-app://com.google.appcrawler".equals(stringExtra)) {
            if (!TextUtils.isEmpty(stringExtra)) {
                try {
                    String host = new URL(stringExtra).getHost();
                    if (!TextUtils.isEmpty(host)) {
                        return host.matches("^(www\\.)?google(\\.com?)?(\\.[a-z]{2}t?)?$");
                    }
                } catch (MalformedURLException unused) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public static String e0(int i, String str, boolean z) {
        if (str != null) {
            if (str.codePointCount(0, str.length()) > i) {
                if (z) {
                    return str.substring(0, str.offsetByCodePoints(0, i)).concat("...");
                }
                return null;
            }
            return str;
        }
        return null;
    }

    public static boolean k1(Object obj) {
        if (!(obj instanceof Parcelable[]) && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
            return false;
        }
        return true;
    }

    public static void p0(k6f k6fVar, String str, int i, String str2, String str3, int i2) {
        Bundle bundle = new Bundle();
        w0(i, bundle);
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            bundle.putString(str2, str3);
        }
        if (i == 6 || i == 7 || i == 2) {
            bundle.putLong("_el", i2);
        }
        k6fVar.b(str, "_err", bundle);
    }

    public static MessageDigest q0() {
        MessageDigest messageDigest;
        for (int i = 0; i < 2; i++) {
            try {
                messageDigest = MessageDigest.getInstance("MD5");
            } catch (NoSuchAlgorithmException unused) {
            }
            if (messageDigest != null) {
                return messageDigest;
            }
        }
        return null;
    }

    public static long r0(byte[] bArr) {
        boolean z;
        am8.s(bArr);
        int length = bArr.length;
        int i = 0;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        am8.v(z);
        long j = 0;
        for (int i2 = length - 1; i2 >= 0 && i2 >= bArr.length - 8; i2--) {
            j += (bArr[i2] & 255) << i;
            i += 8;
        }
        return j;
    }

    public static boolean s0(Context context) {
        ServiceInfo serviceInfo;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (serviceInfo = packageManager.getServiceInfo(new ComponentName(context, "com.google.android.gms.measurement.AppMeasurementJobService"), 0)) != null) {
                if (serviceInfo.enabled) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static int u0() {
        if (Build.VERSION.SDK_INT >= 30 && SdkExtensions.getExtensionVersion(30) > 3) {
            return SdkExtensions.getExtensionVersion(1000000);
        }
        return 0;
    }

    public static final boolean w0(int i, Bundle bundle) {
        if (bundle != null && bundle.getLong("_err") == 0) {
            bundle.putLong("_err", i);
            return true;
        }
        return false;
    }

    public static boolean z0(String str, String[] strArr) {
        am8.s(strArr);
        for (String str2 : strArr) {
            if (Objects.equals(str, str2)) {
                return true;
            }
        }
        return false;
    }

    public final boolean B0(String str) {
        W();
        lte lteVar = (lte) this.a;
        if (((Context) wnd.a(lteVar.a).a).checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        ppe ppeVar = lteVar.f;
        lte.m(ppeVar);
        ppeVar.I.f(str, "Permission not granted");
        return false;
    }

    public final boolean D0(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return ((lte) this.a).d.b0("debug.firebase.analytics.app").equals(str);
    }

    public final Bundle E0(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                Object g0 = g0(bundle.get(str), str);
                if (g0 == null) {
                    lte lteVar = (lte) this.a;
                    ppe ppeVar = lteVar.f;
                    lte.m(ppeVar);
                    ppeVar.G.f(lteVar.F.b(str), "Param value can't be null");
                } else {
                    o0(bundle2, str, g0);
                }
            }
        }
        return bundle2;
    }

    public final ibe F0(String str, Bundle bundle, String str2, long j, long j2, boolean z) {
        Bundle bundle2;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (f1(str) == 0) {
            if (bundle != null) {
                bundle2 = new Bundle(bundle);
            } else {
                bundle2 = new Bundle();
            }
            bundle2.putString("_o", str2);
            Bundle h0 = h0(str, bundle2, Collections.singletonList("_o"), true);
            if (z) {
                h0 = E0(h0);
            }
            am8.s(h0);
            return new ibe(str, new dbe(h0), str2, j, j2);
        }
        lte lteVar = (lte) this.a;
        ppe ppeVar = lteVar.f;
        lte.m(ppeVar);
        ppeVar.f.f(lteVar.F.c(str), "Invalid conditional property event name");
        p1a.g();
        return null;
    }

    public final boolean G0(Context context, String str) {
        Signature[] signatureArr;
        lte lteVar = (lte) this.a;
        X500Principal x500Principal = new X500Principal("CN=Android Debug,O=Android,C=US");
        try {
            PackageInfo b = wnd.a(context).b(64, str);
            if (b != null && (signatureArr = b.signatures) != null && signatureArr.length > 0) {
                return ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()))).getSubjectX500Principal().equals(x500Principal);
            }
            return true;
        } catch (PackageManager.NameNotFoundException e) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.f.f(e, "Package name not found");
            return true;
        } catch (CertificateException e2) {
            ppe ppeVar2 = lteVar.f;
            lte.m(ppeVar2);
            ppeVar2.f.f(e2, "Error obtaining certificate");
            return true;
        }
    }

    public final boolean I0(int i) {
        Boolean bool = ((lte) this.a).p().e;
        if (J0() < i / 1000) {
            if (bool == null || bool.booleanValue()) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int J0() {
        if (this.D == null) {
            vz4 vz4Var = vz4.b;
            Context context = ((lte) this.a).a;
            vz4Var.getClass();
            int i = s05.e;
            int i2 = 0;
            try {
                i2 = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("GooglePlayServicesUtil", "Google Play services is missing.");
            }
            this.D = Integer.valueOf(i2 / 1000);
        }
        return this.D.intValue();
    }

    public final void K0(Bundle bundle, long j) {
        long j2 = bundle.getLong("_et");
        if (j2 != 0) {
            ppe ppeVar = ((lte) this.a).f;
            lte.m(ppeVar);
            ppeVar.E.f(Long.valueOf(j2), "Params already contained engagement");
        } else {
            j2 = 0;
        }
        bundle.putLong("_et", j + j2);
    }

    public final void L0(String str, hfe hfeVar) {
        Bundle bundle = new Bundle();
        bundle.putString("r", str);
        try {
            hfeVar.D(bundle);
        } catch (RemoteException e) {
            ppe ppeVar = ((lte) this.a).f;
            lte.m(ppeVar);
            ppeVar.E.f(e, "Error returning string value to wrapper");
        }
    }

    public final void M0(hfe hfeVar, long j) {
        Bundle bundle = new Bundle();
        bundle.putLong("r", j);
        try {
            hfeVar.D(bundle);
        } catch (RemoteException e) {
            ppe ppeVar = ((lte) this.a).f;
            lte.m(ppeVar);
            ppeVar.E.f(e, "Error returning long value to wrapper");
        }
    }

    public final void N0(hfe hfeVar, int i) {
        Bundle bundle = new Bundle();
        bundle.putInt("r", i);
        try {
            hfeVar.D(bundle);
        } catch (RemoteException e) {
            ppe ppeVar = ((lte) this.a).f;
            lte.m(ppeVar);
            ppeVar.E.f(e, "Error returning int value to wrapper");
        }
    }

    public final void O0(hfe hfeVar, byte[] bArr) {
        Bundle bundle = new Bundle();
        bundle.putByteArray("r", bArr);
        try {
            hfeVar.D(bundle);
        } catch (RemoteException e) {
            ppe ppeVar = ((lte) this.a).f;
            lte.m(ppeVar);
            ppeVar.E.f(e, "Error returning byte array to wrapper");
        }
    }

    public final void P0(hfe hfeVar, boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("r", z);
        try {
            hfeVar.D(bundle);
        } catch (RemoteException e) {
            ppe ppeVar = ((lte) this.a).f;
            lte.m(ppeVar);
            ppeVar.E.f(e, "Error returning boolean value to wrapper");
        }
    }

    public final void Q0(hfe hfeVar, Bundle bundle) {
        try {
            hfeVar.D(bundle);
        } catch (RemoteException e) {
            ppe ppeVar = ((lte) this.a).f;
            lte.m(ppeVar);
            ppeVar.E.f(e, "Error returning bundle value to wrapper");
        }
    }

    public final void R0(hfe hfeVar, ArrayList arrayList) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("r", arrayList);
        try {
            hfeVar.D(bundle);
        } catch (RemoteException e) {
            ppe ppeVar = ((lte) this.a).f;
            lte.m(ppeVar);
            ppeVar.E.f(e, "Error returning bundle list to wrapper");
        }
    }

    public final String V0() {
        byte[] bArr = new byte[16];
        X0().nextBytes(bArr);
        return String.format(Locale.US, "%032x", new BigInteger(1, bArr));
    }

    public final long W0() {
        long andIncrement;
        long j;
        AtomicLong atomicLong = this.d;
        if (atomicLong.get() == 0) {
            synchronized (atomicLong) {
                long nanoTime = System.nanoTime();
                ((lte) this.a).G.getClass();
                long nextLong = new Random(nanoTime ^ System.currentTimeMillis()).nextLong();
                int i = this.e + 1;
                this.e = i;
                j = nextLong + i;
            }
            return j;
        }
        AtomicLong atomicLong2 = this.d;
        synchronized (atomicLong2) {
            atomicLong2.compareAndSet(-1L, 1L);
            andIncrement = atomicLong2.getAndIncrement();
        }
        return andIncrement;
    }

    public final SecureRandom X0() {
        W();
        if (this.c == null) {
            this.c = new SecureRandom();
        }
        return this.c;
    }

    @Override // defpackage.qve
    public final boolean Y() {
        return true;
    }

    public final Bundle Z0(Uri uri) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        lte lteVar;
        lte lteVar2 = (lte) this.a;
        if (uri != null) {
            try {
                if (uri.isHierarchical()) {
                    str2 = uri.getQueryParameter("utm_campaign");
                    str3 = uri.getQueryParameter("utm_source");
                    str4 = uri.getQueryParameter("utm_medium");
                    str5 = uri.getQueryParameter("gclid");
                    str6 = uri.getQueryParameter("gbraid");
                    str7 = uri.getQueryParameter("utm_id");
                    str8 = uri.getQueryParameter("dclid");
                    str9 = uri.getQueryParameter("srsltid");
                    str = uri.getQueryParameter("sfmc_id");
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                    str4 = null;
                    str5 = null;
                    str6 = null;
                    str7 = null;
                    str8 = null;
                    str9 = null;
                }
                if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3) || !TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str5) || !TextUtils.isEmpty(str6) || !TextUtils.isEmpty(str7) || !TextUtils.isEmpty(str8) || !TextUtils.isEmpty(str9) || !TextUtils.isEmpty(str)) {
                    Bundle bundle = new Bundle();
                    if (!TextUtils.isEmpty(str2)) {
                        lteVar = lteVar2;
                        bundle.putString("campaign", str2);
                    } else {
                        lteVar = lteVar2;
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        bundle.putString("source", str3);
                    }
                    if (!TextUtils.isEmpty(str4)) {
                        bundle.putString("medium", str4);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        bundle.putString("gclid", str5);
                    }
                    if (!TextUtils.isEmpty(str6)) {
                        bundle.putString("gbraid", str6);
                    }
                    String queryParameter = uri.getQueryParameter("gad_source");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        bundle.putString("gad_source", queryParameter);
                    }
                    String queryParameter2 = uri.getQueryParameter("utm_term");
                    if (!TextUtils.isEmpty(queryParameter2)) {
                        bundle.putString("term", queryParameter2);
                    }
                    String queryParameter3 = uri.getQueryParameter("utm_content");
                    if (!TextUtils.isEmpty(queryParameter3)) {
                        bundle.putString("content", queryParameter3);
                    }
                    String queryParameter4 = uri.getQueryParameter("aclid");
                    if (!TextUtils.isEmpty(queryParameter4)) {
                        bundle.putString("aclid", queryParameter4);
                    }
                    String queryParameter5 = uri.getQueryParameter("cp1");
                    if (!TextUtils.isEmpty(queryParameter5)) {
                        bundle.putString("cp1", queryParameter5);
                    }
                    String queryParameter6 = uri.getQueryParameter("anid");
                    if (!TextUtils.isEmpty(queryParameter6)) {
                        bundle.putString("anid", queryParameter6);
                    }
                    if (!TextUtils.isEmpty(str7)) {
                        bundle.putString("campaign_id", str7);
                    }
                    if (!TextUtils.isEmpty(str8)) {
                        bundle.putString("dclid", str8);
                    }
                    String queryParameter7 = uri.getQueryParameter("utm_source_platform");
                    if (!TextUtils.isEmpty(queryParameter7)) {
                        bundle.putString("source_platform", queryParameter7);
                    }
                    String queryParameter8 = uri.getQueryParameter("utm_creative_format");
                    if (!TextUtils.isEmpty(queryParameter8)) {
                        bundle.putString("creative_format", queryParameter8);
                    }
                    String queryParameter9 = uri.getQueryParameter("utm_marketing_tactic");
                    if (!TextUtils.isEmpty(queryParameter9)) {
                        bundle.putString("marketing_tactic", queryParameter9);
                    }
                    if (!TextUtils.isEmpty(str9)) {
                        bundle.putString("srsltid", str9);
                    }
                    if (!TextUtils.isEmpty(str)) {
                        bundle.putString("sfmc_id", str);
                    }
                    for (String str10 : uri.getQueryParameterNames()) {
                        if (str10.startsWith("gad_")) {
                            String queryParameter10 = uri.getQueryParameter(str10);
                            if (!TextUtils.isEmpty(queryParameter10)) {
                                bundle.putString(str10, queryParameter10);
                            }
                        }
                    }
                    lte lteVar3 = lteVar;
                    if (lteVar3.d.i0(null, yme.a1)) {
                        String uri2 = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
                        lteVar3.d.getClass();
                        int max = Math.max(500, 256);
                        if (uri2.length() > max) {
                            uri2 = e0(max - 3, uri2, true);
                        }
                        if (!TextUtils.isEmpty(uri2)) {
                            bundle.putString("deep_link_url", uri2);
                        }
                    }
                    return bundle;
                }
            } catch (UnsupportedOperationException e) {
                ppe ppeVar = lteVar2.f;
                lte.m(ppeVar);
                ppeVar.E.f(e, "Install referrer url isn't a hierarchical URI");
                return null;
            }
        }
        return null;
    }

    public final boolean b0(String str, String str2, int i, Object obj) {
        if (obj != null && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Integer) && !(obj instanceof Byte) && !(obj instanceof Short) && !(obj instanceof Boolean) && !(obj instanceof Double)) {
            if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                return false;
            }
            String obj2 = obj.toString();
            if (obj2.codePointCount(0, obj2.length()) > i) {
                ppe ppeVar = ((lte) this.a).f;
                lte.m(ppeVar);
                ppeVar.G.h("Value is too long; discarded. Value kind, name, value length", str, str2, Integer.valueOf(obj2.length()));
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean b1(String str, String str2) {
        lte lteVar = (lte) this.a;
        if (str2 == null) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.D.f(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.length() == 0) {
            ppe ppeVar2 = lteVar.f;
            lte.m(ppeVar2);
            ppeVar2.D.f(str, "Name is required and can't be empty. Type");
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                ppe ppeVar3 = lteVar.f;
                lte.m(ppeVar3);
                ppeVar3.D.g(str, str2, "Name must start with a letter. Type, name");
                return false;
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    ppe ppeVar4 = lteVar.f;
                    lte.m(ppeVar4);
                    ppeVar4.D.g(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final void c0(String str, String str2, Bundle bundle, List list, boolean z) {
        int i;
        int i2;
        String str3;
        int f0;
        List list2 = list;
        if (bundle != null) {
            lte lteVar = (lte) this.a;
            t7e t7eVar = lteVar.d;
            ppe ppeVar = lteVar.f;
            yoe yoeVar = lteVar.F;
            l6f l6fVar = ((lte) t7eVar.a).E;
            lte.k(l6fVar);
            if (true != l6fVar.I0(231100000)) {
                i = 0;
            } else {
                i = 35;
            }
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i3 = 0;
            boolean z2 = false;
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (list2 != null && list2.contains(str4)) {
                    i2 = 0;
                } else {
                    if (!z) {
                        i2 = i1(str4);
                    } else {
                        i2 = 0;
                    }
                    if (i2 == 0) {
                        i2 = j1(str4);
                    }
                }
                if (i2 != 0) {
                    if (i2 == 3) {
                        str3 = str4;
                    } else {
                        str3 = null;
                    }
                    l0(bundle, i2, str4, str3);
                    bundle.remove(str4);
                } else {
                    if (k1(bundle.get(str4))) {
                        lte.m(ppeVar);
                        ppeVar.G.h("Nested Bundle parameters are not allowed; discarded. event name, param name, child param name", str, str2, str4);
                        f0 = 22;
                    } else {
                        f0 = f0(str, str4, bundle.get(str4), bundle, list2, z, false);
                    }
                    if (f0 != 0 && !"_ev".equals(str4)) {
                        l0(bundle, f0, str4, bundle.get(str4));
                        bundle.remove(str4);
                    } else if (Y0(str4) && !z0(str4, l0e.e)) {
                        i3++;
                        if (!I0(231100000)) {
                            lte.m(ppeVar);
                            ppeVar.D.g(yoeVar.a(str), yoeVar.e(bundle), "Item array not supported on client's version of Google Play Services (Android Only)");
                            w0(23, bundle);
                            bundle.remove(str4);
                        } else if (i3 > i) {
                            if (!z2) {
                                lte.m(ppeVar);
                                s56 s56Var = ppeVar.D;
                                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 55);
                                sb.append("Item can't contain more than ");
                                sb.append(i);
                                sb.append(" item-scoped custom params");
                                s56Var.g(yoeVar.a(str), yoeVar.e(bundle), sb.toString());
                            }
                            w0(28, bundle);
                            bundle.remove(str4);
                            list2 = list;
                            z2 = true;
                        }
                    }
                }
                list2 = list;
            }
        }
    }

    public final boolean c1(String str, String str2) {
        lte lteVar = (lte) this.a;
        if (str2 == null) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.D.f(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.length() == 0) {
            ppe ppeVar2 = lteVar.f;
            lte.m(ppeVar2);
            ppeVar2.D.f(str, "Name is required and can't be empty. Type");
            return false;
        } else {
            int codePointAt = str2.codePointAt(0);
            if (!Character.isLetter(codePointAt)) {
                if (codePointAt == 95) {
                    codePointAt = 95;
                } else {
                    ppe ppeVar3 = lteVar.f;
                    lte.m(ppeVar3);
                    ppeVar3.D.g(str, str2, "Name must start with a letter or _ (underscore). Type, name");
                    return false;
                }
            }
            int length = str2.length();
            int charCount = Character.charCount(codePointAt);
            while (charCount < length) {
                int codePointAt2 = str2.codePointAt(charCount);
                if (codePointAt2 != 95 && !Character.isLetterOrDigit(codePointAt2)) {
                    ppe ppeVar4 = lteVar.f;
                    lte.m(ppeVar4);
                    ppeVar4.D.g(str, str2, "Name must consist of letters, digits or _ (underscores). Type, name");
                    return false;
                }
                charCount += Character.charCount(codePointAt2);
            }
            return true;
        }
    }

    public final boolean d0(String str) {
        lte lteVar = (lte) this.a;
        if (!TextUtils.isEmpty(str)) {
            am8.s(str);
            if (!str.matches("^1:\\d+:android:[a-f0-9]+$")) {
                ppe ppeVar = lteVar.f;
                lte.m(ppeVar);
                ppeVar.D.f(ppe.f0(str), "Invalid google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI. provided id");
                return false;
            }
            return true;
        }
        ppe ppeVar2 = lteVar.f;
        lte.m(ppeVar2);
        ppeVar2.D.e("Missing google_app_id. Firebase Analytics disabled. See https://goo.gl/NAOOOI");
        return false;
    }

    public final boolean d1(String str, String[] strArr, String[] strArr2, String str2) {
        lte lteVar = (lte) this.a;
        if (str2 == null) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.D.f(str, "Name is required and can't be null. Type");
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (str2.startsWith(E[i])) {
                ppe ppeVar2 = lteVar.f;
                lte.m(ppeVar2);
                ppeVar2.D.g(str, str2, "Name starts with reserved prefix. Type, name");
                return false;
            }
        }
        if (strArr != null && z0(str2, strArr)) {
            if (strArr2 == null || !z0(str2, strArr2)) {
                ppe ppeVar3 = lteVar.f;
                lte.m(ppeVar3);
                ppeVar3.D.g(str, str2, "Name is reserved. Type, name");
                return false;
            }
            return true;
        }
        return true;
    }

    public final boolean e1(String str, String str2, int i) {
        lte lteVar = (lte) this.a;
        if (str2 == null) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.D.f(str, "Name is required and can't be null. Type");
            return false;
        } else if (str2.codePointCount(0, str2.length()) > i) {
            ppe ppeVar2 = lteVar.f;
            lte.m(ppeVar2);
            ppeVar2.D.h("Name is too long. Type, maximum supported length, name", str, Integer.valueOf(i), str2);
            return false;
        } else {
            return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int f0(java.lang.String r13, java.lang.String r14, java.lang.Object r15, android.os.Bundle r16, java.util.List r17, boolean r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l6f.f0(java.lang.String, java.lang.String, java.lang.Object, android.os.Bundle, java.util.List, boolean, boolean):int");
    }

    public final int f1(String str) {
        String[] strArr;
        if (!c1("event", str)) {
            return 2;
        }
        String[] strArr2 = ctd.d;
        if (((lte) this.a).d.i0(null, yme.f1)) {
            strArr = ctd.f;
        } else {
            strArr = ctd.e;
        }
        if (!d1("event", strArr2, strArr, str)) {
            return 13;
        }
        if (!e1("event", str, 40)) {
            return 2;
        }
        return 0;
    }

    public final Object g0(Object obj, String str) {
        lte lteVar = (lte) this.a;
        int i = 500;
        if ("_ev".equals(str)) {
            lteVar.d.getClass();
            return x0(Math.max(500, 256), obj, true, true);
        }
        if (C0(str)) {
            lteVar.d.getClass();
            i = Math.max(500, 256);
        } else {
            lteVar.d.getClass();
        }
        return x0(i, obj, false, true);
    }

    public final boolean g1(String str) {
        if (((lte) this.a).d.i0(null, yme.f1)) {
            return z0(str, ctd.h);
        }
        return z0(str, ctd.g);
    }

    public final Bundle h0(String str, Bundle bundle, List list, boolean z) {
        int i;
        int i2;
        String str2;
        String str3;
        List list2 = list;
        boolean z0 = z0(str, ctd.j);
        if (bundle != null) {
            Bundle bundle2 = new Bundle(bundle);
            lte lteVar = (lte) this.a;
            t7e t7eVar = lteVar.d;
            yoe yoeVar = lteVar.F;
            l6f l6fVar = ((lte) t7eVar.a).E;
            lte.k(l6fVar);
            if (l6fVar.I0(201500000)) {
                i = 100;
            } else {
                i = 25;
            }
            int i3 = i;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i4 = 0;
            boolean z2 = false;
            while (it.hasNext()) {
                String str4 = (String) it.next();
                if (list2 != null && list2.contains(str4)) {
                    i2 = 0;
                } else {
                    if (!z) {
                        i2 = i1(str4);
                    } else {
                        i2 = 0;
                    }
                    if (i2 == 0) {
                        i2 = j1(str4);
                    }
                }
                if (i2 != 0) {
                    if (i2 == 3) {
                        str3 = str4;
                    } else {
                        str3 = null;
                    }
                    l0(bundle2, i2, str4, str3);
                    bundle2.remove(str4);
                } else {
                    int f0 = f0(str, str4, bundle.get(str4), bundle2, list2, z, z0);
                    if (f0 == 17) {
                        l0(bundle2, 17, str4, Boolean.FALSE);
                    } else if (f0 != 0 && !"_ev".equals(str4)) {
                        if (f0 == 21) {
                            str2 = str;
                        } else {
                            str2 = str4;
                        }
                        l0(bundle2, f0, str2, bundle.get(str4));
                        bundle2.remove(str4);
                    }
                    if (Y0(str4)) {
                        i4++;
                        if (i4 > i3) {
                            if (!z2) {
                                StringBuilder sb = new StringBuilder(String.valueOf(i3).length() + 37);
                                sb.append("Event can't contain more than ");
                                sb.append(i3);
                                sb.append(" params");
                                String sb2 = sb.toString();
                                ppe ppeVar = lteVar.f;
                                lte.m(ppeVar);
                                ppeVar.D.g(yoeVar.a(str), yoeVar.e(bundle), sb2);
                            }
                            w0(5, bundle2);
                            bundle2.remove(str4);
                            z2 = true;
                        }
                        list2 = list;
                    }
                }
                list2 = list;
            }
            return bundle2;
        }
        return null;
    }

    public final int h1(String str) {
        if (!c1("user property", str)) {
            return 6;
        }
        if (!d1("user property", s9e.d, null, str)) {
            return 15;
        }
        ((lte) this.a).getClass();
        if (!e1("user property", str, 24)) {
            return 6;
        }
        return 0;
    }

    public final void i0(m08 m08Var, int i) {
        Bundle bundle = (Bundle) m08Var.f;
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        int i2 = 0;
        boolean z = false;
        while (it.hasNext()) {
            String str = (String) it.next();
            if (Y0(str) && (i2 = i2 + 1) > i) {
                if (!z) {
                    StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 37);
                    sb.append("Event can't contain more than ");
                    sb.append(i);
                    sb.append(" params");
                    String sb2 = sb.toString();
                    lte lteVar = (lte) this.a;
                    ppe ppeVar = lteVar.f;
                    yoe yoeVar = lteVar.F;
                    lte.m(ppeVar);
                    ppeVar.D.g(yoeVar.a((String) m08Var.d), yoeVar.e(bundle), sb2);
                    w0(5, bundle);
                }
                bundle.remove(str);
                z = true;
            }
        }
    }

    public final int i1(String str) {
        if (!b1("event param", str)) {
            return 3;
        }
        if (!d1("event param", null, null, str)) {
            return 14;
        }
        ((lte) this.a).getClass();
        if (!e1("event param", str, 40)) {
            return 3;
        }
        return 0;
    }

    public final void j0(Parcelable[] parcelableArr, int i) {
        am8.s(parcelableArr);
        for (Parcelable parcelable : parcelableArr) {
            Bundle bundle = (Bundle) parcelable;
            Iterator it = new TreeSet(bundle.keySet()).iterator();
            int i2 = 0;
            boolean z = false;
            while (it.hasNext()) {
                String str = (String) it.next();
                if (Y0(str) && !z0(str, l0e.e) && (i2 = i2 + 1) > i) {
                    if (!z) {
                        lte lteVar = (lte) this.a;
                        ppe ppeVar = lteVar.f;
                        yoe yoeVar = lteVar.F;
                        lte.m(ppeVar);
                        s56 s56Var = ppeVar.D;
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 60);
                        sb.append("Param can't contain more than ");
                        sb.append(i);
                        sb.append(" item-scoped custom parameters");
                        s56Var.g(yoeVar.b(str), yoeVar.e(bundle), sb.toString());
                    }
                    w0(28, bundle);
                    bundle.remove(str);
                    z = true;
                }
            }
        }
    }

    public final int j1(String str) {
        if (!c1("event param", str)) {
            return 3;
        }
        if (!d1("event param", null, null, str)) {
            return 14;
        }
        ((lte) this.a).getClass();
        if (!e1("event param", str, 40)) {
            return 3;
        }
        return 0;
    }

    public final void k0(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            for (String str : bundle2.keySet()) {
                if (!bundle.containsKey(str)) {
                    l6f l6fVar = ((lte) this.a).E;
                    lte.k(l6fVar);
                    l6fVar.o0(bundle, str, bundle2.get(str));
                }
            }
        }
    }

    public final void l0(Bundle bundle, int i, String str, Object obj) {
        if (w0(i, bundle)) {
            ((lte) this.a).getClass();
            bundle.putString("_ev", e0(40, str, true));
            if (obj != null) {
                if ((obj instanceof String) || (obj instanceof CharSequence)) {
                    bundle.putLong("_el", obj.toString().length());
                }
            }
        }
    }

    public final int m0(Object obj, String str) {
        boolean b0;
        if ("_ldl".equals(str)) {
            b0 = b0("user property referrer", str, y0(str), obj);
        } else {
            b0 = b0("user property", str, y0(str), obj);
        }
        if (b0) {
            return 0;
        }
        return 7;
    }

    public final Object n0(Object obj, String str) {
        if ("_ldl".equals(str)) {
            return x0(y0(str), obj, true, false);
        }
        return x0(y0(str), obj, false, false);
    }

    public final void o0(Bundle bundle, String str, Object obj) {
        String str2;
        if (bundle != null) {
            if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof String) {
                bundle.putString(str, String.valueOf(obj));
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (obj instanceof Bundle[]) {
                bundle.putParcelableArray(str, (Bundle[]) obj);
            } else if (str != null) {
                if (obj != null) {
                    str2 = obj.getClass().getSimpleName();
                } else {
                    str2 = null;
                }
                lte lteVar = (lte) this.a;
                ppe ppeVar = lteVar.f;
                lte.m(ppeVar);
                ppeVar.G.g(lteVar.F.b(str), str2, "Not putting event parameter. Invalid value type. name, type");
            }
        }
    }

    public final k37 t0() {
        int i;
        int i2;
        int a;
        sye syeVar;
        Object obj;
        if (this.f == null) {
            Context context = ((lte) this.a).a;
            context.getClass();
            StringBuilder sb = new StringBuilder("AdServicesInfo.version=");
            int i3 = Build.VERSION.SDK_INT;
            e7 e7Var = e7.a;
            int i4 = 0;
            if (i3 >= 33) {
                i = e7Var.a();
            } else {
                i = 0;
            }
            sb.append(i);
            Log.d("MeasurementManager", sb.toString());
            if (i3 >= 33) {
                i2 = e7Var.a();
            } else {
                i2 = 0;
            }
            k37 k37Var = null;
            if (i2 >= 5) {
                syeVar = new j37(context, 1);
            } else {
                d7 d7Var = d7.a;
                if (i3 != 31 && i3 != 32) {
                    a = 0;
                } else {
                    a = d7Var.a();
                }
                if (a >= 9) {
                    try {
                        obj = new jc(context, 27).invoke(context);
                    } catch (NoClassDefFoundError unused) {
                        StringBuilder sb2 = new StringBuilder("Unable to find adservices code, check manifest for uses-library tag, versionS=");
                        int i5 = Build.VERSION.SDK_INT;
                        if (i5 == 31 || i5 == 32) {
                            i4 = d7Var.a();
                        }
                        sb2.append(i4);
                        Log.d("MeasurementManager", sb2.toString());
                        obj = null;
                    }
                    syeVar = (sye) obj;
                } else {
                    syeVar = null;
                }
            }
            if (syeVar != null) {
                k37Var = new k37(syeVar);
            }
            this.f = k37Var;
        }
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c2 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long v0() {
        /*
            r12 = this;
            r12.W()
            java.lang.Object r0 = r12.a
            lte r0 = (defpackage.lte) r0
            joe r1 = r0.r()
            ppe r0 = r0.f
            java.lang.String r1 = r1.d0()
            wme r2 = defpackage.yme.q0
            r3 = 0
            java.lang.Object r2 = r2.a(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r1 = A0(r2, r1)
            r4 = 0
            if (r1 != 0) goto L23
            return r4
        L23:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 >= r2) goto L2c
            r1 = 4
            goto L4c
        L2c:
            int r1 = android.os.ext.SdkExtensions.getExtensionVersion(r2)
            r2 = 4
            if (r1 >= r2) goto L36
            r1 = 8
            goto L4c
        L36:
            int r1 = u0()
            wme r2 = defpackage.yme.k0
            java.lang.Object r2 = r2.a(r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            if (r1 >= r2) goto L4b
            r1 = 16
            goto L4c
        L4b:
            r1 = r4
        L4c:
            java.lang.String r6 = "android.permission.ACCESS_ADSERVICES_ATTRIBUTION"
            boolean r6 = r12.B0(r6)
            if (r6 != 0) goto L57
            r6 = 2
            long r1 = r1 | r6
        L57:
            int r6 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r6 != 0) goto Lbb
            java.lang.Boolean r6 = r12.C
            if (r6 != 0) goto Lb1
            k37 r6 = r12.t0()
            r7 = 0
            if (r6 != 0) goto L67
            goto Lb7
        L67:
            com.google.common.util.concurrent.ListenableFuture r6 = r6.b()
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L8f java.lang.InterruptedException -> L91 java.util.concurrent.ExecutionException -> L93 java.util.concurrent.CancellationException -> L95
            r9 = 10000(0x2710, double:4.9407E-320)
            java.lang.Object r6 = r6.get(r9, r8)     // Catch: java.util.concurrent.TimeoutException -> L8f java.lang.InterruptedException -> L91 java.util.concurrent.ExecutionException -> L93 java.util.concurrent.CancellationException -> L95
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.util.concurrent.TimeoutException -> L8f java.lang.InterruptedException -> L91 java.util.concurrent.ExecutionException -> L93 java.util.concurrent.CancellationException -> L95
            if (r6 == 0) goto L88
            int r3 = r6.intValue()     // Catch: java.util.concurrent.TimeoutException -> L80 java.lang.InterruptedException -> L82 java.util.concurrent.ExecutionException -> L84 java.util.concurrent.CancellationException -> L86
            r8 = 1
            if (r3 != r8) goto L88
            r7 = r8
            goto L88
        L80:
            r3 = move-exception
            goto L99
        L82:
            r3 = move-exception
            goto L99
        L84:
            r3 = move-exception
            goto L99
        L86:
            r3 = move-exception
            goto L99
        L88:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)     // Catch: java.util.concurrent.TimeoutException -> L80 java.lang.InterruptedException -> L82 java.util.concurrent.ExecutionException -> L84 java.util.concurrent.CancellationException -> L86
            r12.C = r3     // Catch: java.util.concurrent.TimeoutException -> L80 java.lang.InterruptedException -> L82 java.util.concurrent.ExecutionException -> L84 java.util.concurrent.CancellationException -> L86
            goto La7
        L8f:
            r6 = move-exception
            goto L96
        L91:
            r6 = move-exception
            goto L96
        L93:
            r6 = move-exception
            goto L96
        L95:
            r6 = move-exception
        L96:
            r11 = r6
            r6 = r3
            r3 = r11
        L99:
            defpackage.lte.m(r0)
            s56 r7 = r0.E
            java.lang.String r8 = "Measurement manager api exception"
            r7.f(r3, r8)
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            r12.C = r3
        La7:
            defpackage.lte.m(r0)
            s56 r0 = r0.J
            java.lang.String r3 = "Measurement manager api status result"
            r0.f(r6, r3)
        Lb1:
            java.lang.Boolean r12 = r12.C
            boolean r7 = r12.booleanValue()
        Lb7:
            if (r7 != 0) goto Lbb
            r1 = 64
        Lbb:
            int r12 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r12 != 0) goto Lc2
            r0 = 1
            return r0
        Lc2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l6f.v0():long");
    }

    public final Object x0(int i, Object obj, boolean z, boolean z2) {
        Parcelable[] parcelableArr;
        long j;
        if (obj != null) {
            if (!(obj instanceof Long)) {
                if (obj instanceof Double) {
                    return obj;
                }
                if (obj instanceof Integer) {
                    return Long.valueOf(((Integer) obj).intValue());
                }
                if (obj instanceof Byte) {
                    return Long.valueOf(((Byte) obj).byteValue());
                }
                if (obj instanceof Short) {
                    return Long.valueOf(((Short) obj).shortValue());
                }
                if (obj instanceof Boolean) {
                    if (true != ((Boolean) obj).booleanValue()) {
                        j = 0;
                    } else {
                        j = 1;
                    }
                    return Long.valueOf(j);
                } else if (obj instanceof Float) {
                    return Double.valueOf(((Float) obj).doubleValue());
                } else {
                    if (!(obj instanceof String) && !(obj instanceof Character) && !(obj instanceof CharSequence)) {
                        if (z2) {
                            if ((obj instanceof Bundle[]) || (obj instanceof Parcelable[])) {
                                ArrayList arrayList = new ArrayList();
                                for (Parcelable parcelable : (Parcelable[]) obj) {
                                    if (parcelable instanceof Bundle) {
                                        Bundle E0 = E0((Bundle) parcelable);
                                        if (!E0.isEmpty()) {
                                            arrayList.add(E0);
                                        }
                                    }
                                }
                                return arrayList.toArray(new Bundle[arrayList.size()]);
                            }
                            return null;
                        }
                        return null;
                    }
                    return e0(i, obj.toString(), z);
                }
            }
            return obj;
        }
        return null;
    }

    public final int y0(String str) {
        lte lteVar = (lte) this.a;
        if ("_ldl".equals(str)) {
            lteVar.getClass();
            return 2048;
        } else if ("_id".equals(str)) {
            lteVar.getClass();
            return 256;
        } else if ("_lgclid".equals(str)) {
            lteVar.getClass();
            return 100;
        } else {
            lteVar.getClass();
            return 36;
        }
    }
}
