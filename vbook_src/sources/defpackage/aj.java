package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: aj  reason: default package */
/* loaded from: classes3.dex */
public final class aj extends yqe {
    public final Uri b;

    public aj(Uri uri) {
        uri.getClass();
        this.b = uri;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof aj) && c16.i(this.b, ((aj) obj).b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "UriWrapper(uri=" + this.b + ")";
    }
}
