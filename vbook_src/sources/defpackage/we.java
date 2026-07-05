package defpackage;

import android.os.Build;
import java.util.ArrayList;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: we  reason: default package */
/* loaded from: classes.dex */
public final class we {
    public final String a;
    public final String b;
    public final String c;
    public final o69 d;
    public final ArrayList e;

    public we(String str, String str2, String str3, o69 o69Var, ArrayList arrayList) {
        rs8.w(str2, str3, Build.MANUFACTURER);
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = o69Var;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof we) {
                we weVar = (we) obj;
                if (this.a.equals(weVar.a) && c16.i(this.b, weVar.b) && c16.i(this.c, weVar.c)) {
                    String str = Build.MANUFACTURER;
                    if (!c16.i(str, str) || !this.d.equals(weVar.d) || !this.e.equals(weVar.e)) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int j = eub.j(eub.j(eub.j(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, Build.MANUFACTURER);
        return this.e.hashCode() + ((this.d.hashCode() + j) * 31);
    }

    public final String toString() {
        return "AndroidApplicationInfo(packageName=" + this.a + ", versionName=" + this.b + ", appBuildVersion=" + this.c + ", deviceManufacturer=" + Build.MANUFACTURER + ", currentProcessDetails=" + this.d + ", appProcessDetails=" + this.e + ')';
    }
}
