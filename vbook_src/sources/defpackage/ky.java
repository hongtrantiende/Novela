package defpackage;

import android.os.Build;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: ky  reason: default package */
/* loaded from: classes.dex */
public final class ky {
    public final String a;
    public final we b;

    public ky(String str, we weVar) {
        rs8.w(str, Build.MODEL, Build.VERSION.RELEASE);
        this.a = str;
        this.b = weVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ky) {
                ky kyVar = (ky) obj;
                if (c16.i(this.a, kyVar.a)) {
                    String str = Build.MODEL;
                    if (c16.i(str, str)) {
                        String str2 = Build.VERSION.RELEASE;
                        if (!c16.i(str2, str2) || !this.b.equals(kyVar.b)) {
                            return false;
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int j = eub.j((((Build.MODEL.hashCode() + (this.a.hashCode() * 31)) * 31) + 48517565) * 31, 31, Build.VERSION.RELEASE);
        return this.b.hashCode() + ((aw6.LOG_ENVIRONMENT_PROD.hashCode() + j) * 31);
    }

    public final String toString() {
        return "ApplicationInfo(appId=" + this.a + ", deviceModel=" + Build.MODEL + ", sessionSdkVersion=3.0.6, osVersion=" + Build.VERSION.RELEASE + ", logEnvironment=" + aw6.LOG_ENVIRONMENT_PROD + ", androidAppInfo=" + this.b + ')';
    }
}
