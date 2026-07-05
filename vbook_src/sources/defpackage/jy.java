package defpackage;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: jy  reason: default package */
/* loaded from: classes.dex */
public abstract class jy {
    public static final mfb a = new mfb(new i(15));

    public static boolean a() {
        Object value = ((xe) a.getValue()).b.getValue();
        value.getClass();
        ApplicationInfo applicationInfo = ((PackageInfo) value).applicationInfo;
        boolean z = false;
        if (applicationInfo != null && (applicationInfo.flags & 2) == 0) {
            z = true;
        }
        return !z;
    }
}
