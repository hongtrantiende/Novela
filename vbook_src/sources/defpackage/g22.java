package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.InputStream;
/* compiled from: r8-map-id-f559a6c9210f67746bd9ce87931ee85b676f3bda66e04dc5e85cb7e8eec71de1 */
/* renamed from: g22  reason: default package */
/* loaded from: classes3.dex */
public final class g22 implements bq5 {
    public final Context a;
    public final Uri b;
    public final String c;

    public g22(Context context, Uri uri) {
        context.getClass();
        this.a = context;
        this.b = uri;
        String uri2 = uri.toString();
        uri2.getClass();
        this.c = uri2;
    }

    @Override // defpackage.bq5
    public final osa a() {
        ContentResolver contentResolver = this.a.getContentResolver();
        Uri uri = this.b;
        InputStream openInputStream = contentResolver.openInputStream(uri);
        if (openInputStream != null) {
            return tl1.K(openInputStream);
        }
        throw new FileNotFoundException("Unable to open stream. uri='" + uri + '\'');
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && g22.class == obj.getClass()) {
                g22 g22Var = (g22) obj;
                if (c16.i(this.a, g22Var.a) && this.b.equals(g22Var.b)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.bq5
    public final String getKey() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ContentImageSource('" + this.b + "')";
    }
}
