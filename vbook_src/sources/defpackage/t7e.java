package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import java.lang.reflect.InvocationTargetException;
import org.mozilla.javascript.Token;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: t7e  reason: default package */
/* loaded from: classes.dex */
public final class t7e extends c3e {
    public Boolean b;
    public String c;
    public b7e d;
    public Boolean e;

    public final boolean Y(String str) {
        lte.k(((lte) this.a).E);
        if (!l6f.A0((String) yme.g1.a(null), str) && !l6f.A0((String) yme.h1.a(null), str) && !l6f.A0((String) yme.i1.a(null), str)) {
            return "1".equals(this.d.k(str, "gaia_collection_enabled"));
        }
        return true;
    }

    public final boolean Z(String str) {
        return "1".equals(this.d.k(str, "measurement.event_sampling_enabled"));
    }

    public final boolean a0() {
        if (this.b == null) {
            Boolean k0 = k0("app_measurement_lite");
            this.b = k0;
            if (k0 == null) {
                this.b = Boolean.FALSE;
            }
        }
        if (!this.b.booleanValue() && ((lte) this.a).b) {
            return false;
        }
        return true;
    }

    public final String b0(String str) {
        lte lteVar = (lte) this.a;
        try {
            String str2 = (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, "");
            am8.s(str2);
            return str2;
        } catch (ClassNotFoundException e) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.f.f(e, "Could not find SystemProperties class");
            return "";
        } catch (IllegalAccessException e2) {
            ppe ppeVar2 = lteVar.f;
            lte.m(ppeVar2);
            ppeVar2.f.f(e2, "Could not access SystemProperties.get()");
            return "";
        } catch (NoSuchMethodException e3) {
            ppe ppeVar3 = lteVar.f;
            lte.m(ppeVar3);
            ppeVar3.f.f(e3, "Could not find SystemProperties.get() method");
            return "";
        } catch (InvocationTargetException e4) {
            ppe ppeVar4 = lteVar.f;
            lte.m(ppeVar4);
            ppeVar4.f.f(e4, "SystemProperties.get() threw an exception");
            return "";
        }
    }

    public final int c0(String str, boolean z) {
        int i = 500;
        if (z) {
            i = Math.max(Math.min(g0(str, yme.g0), 500), 100);
        }
        return Math.max(i, 256);
    }

    public final void d0() {
        ((lte) this.a).getClass();
    }

    public final String e0(String str, wme wmeVar) {
        if (TextUtils.isEmpty(str)) {
            return (String) wmeVar.a(null);
        }
        return (String) wmeVar.a(this.d.k(str, wmeVar.a));
    }

    public final long f0(String str, wme wmeVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Long) wmeVar.a(null)).longValue();
        }
        String k = this.d.k(str, wmeVar.a);
        if (TextUtils.isEmpty(k)) {
            return ((Long) wmeVar.a(null)).longValue();
        }
        try {
            return ((Long) wmeVar.a(Long.valueOf(Long.parseLong(k)))).longValue();
        } catch (NumberFormatException unused) {
            return ((Long) wmeVar.a(null)).longValue();
        }
    }

    public final int g0(String str, wme wmeVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Integer) wmeVar.a(null)).intValue();
        }
        String k = this.d.k(str, wmeVar.a);
        if (TextUtils.isEmpty(k)) {
            return ((Integer) wmeVar.a(null)).intValue();
        }
        try {
            return ((Integer) wmeVar.a(Integer.valueOf(Integer.parseInt(k)))).intValue();
        } catch (NumberFormatException unused) {
            return ((Integer) wmeVar.a(null)).intValue();
        }
    }

    public final double h0(String str, wme wmeVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Double) wmeVar.a(null)).doubleValue();
        }
        String k = this.d.k(str, wmeVar.a);
        if (TextUtils.isEmpty(k)) {
            return ((Double) wmeVar.a(null)).doubleValue();
        }
        try {
            return ((Double) wmeVar.a(Double.valueOf(Double.parseDouble(k)))).doubleValue();
        } catch (NumberFormatException unused) {
            return ((Double) wmeVar.a(null)).doubleValue();
        }
    }

    public final boolean i0(String str, wme wmeVar) {
        if (TextUtils.isEmpty(str)) {
            return ((Boolean) wmeVar.a(null)).booleanValue();
        }
        String k = this.d.k(str, wmeVar.a);
        if (TextUtils.isEmpty(k)) {
            return ((Boolean) wmeVar.a(null)).booleanValue();
        }
        return ((Boolean) wmeVar.a(Boolean.valueOf("1".equals(k)))).booleanValue();
    }

    public final Bundle j0() {
        lte lteVar = (lte) this.a;
        try {
            Context context = lteVar.a;
            Context context2 = lteVar.a;
            ppe ppeVar = lteVar.f;
            if (context.getPackageManager() == null) {
                lte.m(ppeVar);
                ppeVar.f.e("Failed to load metadata: PackageManager is null");
                return null;
            }
            ApplicationInfo a = wnd.a(context2).a(Token.CASE, context2.getPackageName());
            if (a == null) {
                lte.m(ppeVar);
                ppeVar.f.e("Failed to load metadata: ApplicationInfo is null");
                return null;
            }
            return a.metaData;
        } catch (PackageManager.NameNotFoundException e) {
            ppe ppeVar2 = lteVar.f;
            lte.m(ppeVar2);
            ppeVar2.f.f(e, "Failed to load metadata: Package name not found");
            return null;
        }
    }

    public final Boolean k0(String str) {
        am8.p(str);
        Bundle j0 = j0();
        if (j0 == null) {
            ppe ppeVar = ((lte) this.a).f;
            lte.m(ppeVar);
            ppeVar.f.e("Failed to load metadata: Metadata bundle is null");
            return null;
        } else if (!j0.containsKey(str)) {
            return null;
        } else {
            return Boolean.valueOf(j0.getBoolean(str));
        }
    }

    public final boolean l0() {
        ((lte) this.a).getClass();
        Boolean k0 = k0("firebase_analytics_collection_deactivated");
        if (k0 != null && k0.booleanValue()) {
            return true;
        }
        return false;
    }

    public final boolean m0() {
        Boolean k0 = k0("google_analytics_automatic_screen_reporting_enabled");
        if (k0 != null && !k0.booleanValue()) {
            return false;
        }
        return true;
    }

    public final yve n0(String str, boolean z) {
        Object obj;
        am8.p(str);
        lte lteVar = (lte) this.a;
        Bundle j0 = j0();
        if (j0 == null) {
            ppe ppeVar = lteVar.f;
            lte.m(ppeVar);
            ppeVar.f.e("Failed to load metadata: Metadata bundle is null");
            obj = null;
        } else {
            obj = j0.get(str);
        }
        yve yveVar = yve.UNINITIALIZED;
        if (obj == null) {
            return yveVar;
        }
        if (Boolean.TRUE.equals(obj)) {
            return yve.GRANTED;
        }
        if (Boolean.FALSE.equals(obj)) {
            return yve.DENIED;
        }
        if (z && "eu_consent_policy".equals(obj)) {
            return yve.POLICY;
        }
        ppe ppeVar2 = lteVar.f;
        lte.m(ppeVar2);
        ppeVar2.E.f(str, "Invalid manifest metadata for");
        return yveVar;
    }
}
