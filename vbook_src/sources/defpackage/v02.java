package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: v02  reason: default package */
/* loaded from: classes.dex */
public final class v02 {
    public final Uri a;
    public final boolean b;

    public v02(boolean z, Uri uri) {
        this.a = uri;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (v02.class.equals(cls)) {
                obj.getClass();
                v02 v02Var = (v02) obj;
                if (!this.a.equals(v02Var.a) || this.b != v02Var.b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
