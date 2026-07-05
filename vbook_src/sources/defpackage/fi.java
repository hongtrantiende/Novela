package defpackage;

import android.net.Uri;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: fi  reason: default package */
/* loaded from: classes3.dex */
public final class fi {
    public final Uri a;
    public final String b;
    public final String c;
    public final String d;
    public final boolean e;

    public fi(Uri uri, String str, String str2, String str3) {
        this.a = uri;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = c16.i(str3, "vnd.android.document/directory");
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof fi) {
                fi fiVar = (fi) obj;
                if (!this.a.equals(fiVar.a) || !this.b.equals(fiVar.b) || !c16.i(this.c, fiVar.c) || !c16.i(this.d, fiVar.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int j = eub.j(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = (j + hashCode) * 31;
        String str2 = this.d;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return i2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AndroidDocumentInfo(uri=");
        sb.append(this.a);
        sb.append(", documentId=");
        sb.append(this.b);
        sb.append(", name=");
        return nk2.w(sb, this.c, ", mimeType=", this.d, ")");
    }
}
